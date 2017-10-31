package org.tetrabox.minijava.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Context
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.This

import static extension org.tetrabox.minijava.semantics.ExpressionAspect.*
import static extension org.tetrabox.minijava.semantics.StatementAspect.*
import static extension org.tetrabox.minijava.semantics.BlockAspect.*
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.Statement
import org.tetrabox.minijava.xtext.miniJava.MemberSelection
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import org.tetrabox.minijava.xtext.miniJava.Parameter
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration

@Aspect(className=Program)
class ProgramAspect {

	@Main
	@Step
	def void execute() {
		val initialContext = MinijavadynamicdataFactory::eINSTANCE.createContext
		val main = _self.classes.map[members].filter(Method).findFirst[it.name == "main" && it.static]
		if (main !== null) {
			main.body.evaluate(initialContext)
		} else
			throw new RuntimeException("No main expression.")
	}

}

@Aspect(className=Block)
class BlockAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluate(Context context) {
		var i = _self.statements.iterator
		for (var s = i.next; i.hasNext && context.returnValue == null; s = i.next) {
			s.evaluate(context)
		}
	}
}

@Aspect(className=Statement)
class StatementAspect {
	def void evaluate(Context context) { throw new RuntimeException("evaluate should be overriden") }
}

@Aspect(className=Expression)
class ExpressionAspect {
	def Value evaluate(Context context) { throw new RuntimeException("evaluate should be overriden") }
}

@Aspect(className=MemberSelection)
class MemberSelectionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		val realReceiver = _self.receiver.evaluate(context) as Instance
		if (_self.methodinvocation) {
			val newContext = MinijavadynamicdataFactory::eINSTANCE.createContext => [
				instance = realReceiver
				methodcall = _self
			]
			for (arg : _self.args) {
				val param = (_self.member as Method).params.get(_self.args.indexOf(arg))
				val binding = MinijavadynamicdataFactory::eINSTANCE.createSymbolBinding => [
					symbol = param
					value = (arg as Expression).evaluate(context)
				]
				newContext.bindings.add(binding)
			}
			(_self.member as Method).body.evaluate(newContext)
			return newContext.returnValue

		} else {
			return realReceiver.fieldbindings.findFirst[it.field === _self.member].value
		}
	}
}

@Aspect(className=This)
class ThisAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		if (context.instance === null) {
			throw new RuntimeException('''"this" is not valid in the current context''')
		} else {
			return context.instance
		}
	}
}

@Aspect(className=SymbolRef)
class SymbolRefAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return context.bindings.findFirst[it.symbol === _self.symbol].value
	}
}

@Aspect(className=New)
class NewAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		val result = MinijavadynamicdataFactory::eINSTANCE.createInstance => [
			type = _self.type
		]

//		for (arg : _self.args) {
//			val Field field = (_self.type as ClassType).classref.fields.get(_self.args.indexOf(arg))
//			val binding = MinijavadynamicdataFactory::eINSTANCE.createFieldBinding
//			binding.field = field
//			binding.value = (arg as Expression).evaluate(context)
//			result.fieldbindings.add(binding)
//		}
		return result
	}
}

//@Aspect(className=Cast)
//class CastAspect extends ExpressionAspect {
//	@OverrideAspectMethod
//	def Value evaluate(Context context) {
//		return _self.object.evaluate(context)
//	}
//}
@Aspect(className=StringConstant)
class StringConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return MinijavadynamicdataFactory::eINSTANCE.createStringValue => [
			value = _self.value
		]
	}
}

@Aspect(className=IntConstant)
class IntConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [
			value = _self.value
		]
	}
}

@Aspect(className=BoolConstant)
class BoolConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = _self.value.equalsIgnoreCase("true")
		]
	}
}
