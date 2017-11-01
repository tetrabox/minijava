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
import static extension org.tetrabox.minijava.semantics.ValueToStringAspect.*
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.Statement
import org.tetrabox.minijava.xtext.miniJava.PrintStatement
import org.tetrabox.minijava.xtext.miniJava.MemberSelection
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import org.tetrabox.minijava.xtext.miniJava.Parameter
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration
import org.tetrabox.minijava.xtext.miniJava.Assignment
import org.tetrabox.minijava.xtext.miniJava.Symbol
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import org.tetrabox.minijava.xtext.miniJava.Comparison
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.xtext.miniJava.ForStatement
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.SymbolBinding
import static extension org.tetrabox.minijava.semantics.Util.*
import org.tetrabox.minijava.xtext.miniJava.Plus
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue

class Util {

	public static val factory = MinijavadynamicdataFactory::eINSTANCE

	static def Context createChildContext(Context parent) {
		return MinijavadynamicdataFactory::eINSTANCE.createContext => [
			parentContext = parent
		]
	}

	static def SymbolBinding get(Context context, Symbol symbol) {
		val binding = context.bindings.findFirst[it.symbol === symbol]
		if (binding !== null) {
			return binding
		} else if (context.parentContext !== null) {
			return context.parentContext.get(symbol)
		} else {
			return null
		}
	}
}

@Aspect(className=Program)
class ProgramAspect {

	@Main
	@Step
	def Context execute() {
		val initialContext = MinijavadynamicdataFactory::eINSTANCE.createContext
		val main = _self.classes.map[members].flatten.filter(Method).findFirst[it.name == "main" && it.static]
		if (main !== null) {
			main.body.evaluate(initialContext)
			return initialContext
		} else
			throw new RuntimeException("No main expression.")
	}

}

@Aspect(className=Block)
class BlockAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluate(Context context) {

		val newContext = context.createChildContext
		var i = _self.statements.iterator
		while (i.hasNext && context.returnValue === null) {
			i.next.evaluate(newContext)
		}
	}
}

@Aspect(className=Statement)
class StatementAspect {
	def void evaluate(Context context) {
		throw new RuntimeException('''evaluate should be overriden for type «_self.class.name»''')
	}
}

@Aspect(className=PrintStatement)
class PrintStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluate(Context context) {
		val value = _self.expression.evaluate(context)
		println(value.customToString)
	}
}

@Aspect(className=Assignment)
class AssigmentAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluate(Context context) {
		// _self.get
		val right = _self.value.evaluate(context)
		val assignee = _self.assignee
		switch (assignee) {
			SymbolRef: {
				val existingBinding = context.get(assignee.symbol)
				existingBinding.value = right
			}
			VariableDeclaration: {
				val binding = MinijavadynamicdataFactory::eINSTANCE.createSymbolBinding => [
					symbol = assignee
					value = right
				]
				context.bindings.add(binding)
			}
			MemberSelection: {
				val f = assignee.member as Field
				val existingBinding = context.instance.fieldbindings.findFirst[it.field === f]
				if (existingBinding !== null) {
					existingBinding.value = right
				} else {
					val binding = MinijavadynamicdataFactory::eINSTANCE.createFieldBinding => [
						field = assignee.member as Field
						value = right
					]
					context.instance.fieldbindings.add(binding)
				}
			}
		}
	}
}

@Aspect(className=ForStatement)
class ForStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluate(Context context) {
		val newContext = context.createChildContext
		for (_self.declaration.evaluate(newContext); (_self.condition.evaluate(newContext) as BooleanValue).
			value; _self.progression.evaluate(newContext)) {
			_self.block.evaluate(newContext)
		}
	}
}

@Aspect(className=Expression)
class ExpressionAspect {
	def Value evaluate(Context context) {
		throw new RuntimeException('''evaluate should be overriden for type «_self.class.name»''')
	}
}

@Aspect(className=Plus)
class PlusAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		val left = _self.left.evaluate(context)
		val right = _self.right.evaluate(context)
		if (left instanceof StringValue) {
			if (right instanceof StringValue) {
				return factory.createStringValue => [
					value = left.value + right.value
				]
			}

		} else if (left instanceof IntegerValue) {
			if (right instanceof IntegerValue) {
				return factory.createIntegerValue => [
					value = left.value + right.value
				]
			}
		}
		throw new RuntimeException('''Unsupported plus operands: «left» + «right».''')
	}
}

@Aspect(className=Comparison)
class ComparisonAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		val left = (_self.left.evaluate(context) as IntegerValue).value
		val right = (_self.right.evaluate(context) as IntegerValue).value
		val op = _self.op;
		val boolean result = switch (op) {
			case "<": left < right
			case "<=": left <= right
			case ">": left > right
			case ">=": left >= right
			case "==": left === right
			default: throw new RuntimeException('''Comparison operator «op» is not supported.''')
		}
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = result
		]
	}
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
		return context.get(_self.symbol).value
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
