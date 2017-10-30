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
import org.tetrabox.minijava.xtext.miniJava.Cast
import org.tetrabox.minijava.xtext.miniJava.ClassType
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.FieldSelection
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.Message
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.Selection
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.This
import org.tetrabox.minijava.xtext.miniJava.Variable

import static extension org.tetrabox.minijava.semantics.ExpressionAspect.*
import static extension org.tetrabox.minijava.semantics.MessageAspect.*

@Aspect(className=Program)
class ProgramAspect {

	@Main
	@Step
	def Value execute() {
		val initialContext = MinijavadynamicdataFactory::eINSTANCE.createContext
		if (_self.main !== null) {
			return _self.main.evaluate(initialContext)
		} else
			throw new RuntimeException("No main expression.")
	}

}

@Aspect(className=Expression)
class ExpressionAspect {
	def Value evaluate(Context context) { throw new RuntimeException("evaluate should be overriden") }
}

@Aspect(className=Message)
class MessageAspect {
	def Value evaluate(Context context, Instance receiver) {
		throw new RuntimeException("evaluate should be overriden")
	}
}

@Aspect(className=MethodCall)
class MethodCallAspect extends MessageAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context, Instance receiver) {

		val newContext = MinijavadynamicdataFactory::eINSTANCE.createContext => [
			instance = receiver
			methodcall = _self
		]
		for (arg : _self.args) {
			val param = _self.name.params.get(_self.args.indexOf(arg))
			val binding = MinijavadynamicdataFactory::eINSTANCE.createParameterBinding => [
				parameter = param
				value = (arg as Expression).evaluate(context)
			]
			newContext.bindings.add(binding)
		}

		return _self.name.body.expression.evaluate(newContext)

	}
}

@Aspect(className=FieldSelection)
class FieldSelectionAspect extends MessageAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context, Instance receiver) {
		return receiver.fieldbindings.findFirst[it.field === _self.name].value
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

@Aspect(className=Variable)
class VariableAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return context.bindings.findFirst[it.parameter === _self.paramref].value
	}
}

@Aspect(className=New)
class NewAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		val result = MinijavadynamicdataFactory::eINSTANCE.createInstance => [
			type = _self.type.classref
		]

		for (arg : _self.args) {
			val Field field = (_self.type as ClassType).classref.fields.get(_self.args.indexOf(arg))
			val binding = MinijavadynamicdataFactory::eINSTANCE.createFieldBinding
			binding.field = field
			binding.value = (arg as Expression).evaluate(context)
			result.fieldbindings.add(binding)
		}

		return result
	}
}

@Aspect(className=Cast)
class CastAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return _self.object.evaluate(context)
	}
}

@Aspect(className=StringConstant)
class StringConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return MinijavadynamicdataFactory::eINSTANCE.createStringValue => [
			value = _self.constant
		]
	}
}

@Aspect(className=IntConstant)
class IntConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [
			value = _self.constant
		]
	}
}

@Aspect(className=BoolConstant)
class BoolConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = _self.constant.equalsIgnoreCase("true")
		]
	}
}

@Aspect(className=Selection)
class SelectionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluate(Context context) {
		val Instance instance = _self.receiver.evaluate(context) as Instance
		return _self.message.evaluate(context, instance)
	}
}
