package org.tetrabox.minijava.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.RefValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.And
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.Division
import org.tetrabox.minijava.xtext.miniJava.Equality
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.FieldAccess
import org.tetrabox.minijava.xtext.miniJava.Inequality
import org.tetrabox.minijava.xtext.miniJava.Inferior
import org.tetrabox.minijava.xtext.miniJava.InferiorOrEqual
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.Minus
import org.tetrabox.minijava.xtext.miniJava.Multiplication
import org.tetrabox.minijava.xtext.miniJava.Neg
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Not
import org.tetrabox.minijava.xtext.miniJava.Null
import org.tetrabox.minijava.xtext.miniJava.Or
import org.tetrabox.minijava.xtext.miniJava.Plus
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.Superior
import org.tetrabox.minijava.xtext.miniJava.SuperiorOrEqual
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import org.tetrabox.minijava.xtext.miniJava.This

import static extension org.tetrabox.minijava.semantics.BlockAspect.*
import static extension org.tetrabox.minijava.semantics.ContextAspect.*
import static extension org.tetrabox.minijava.semantics.StateAspect.*
import static extension org.tetrabox.minijava.semantics.ValueAspect.*

@Aspect(className=Expression)
class ExpressionAspect {
	def Value evaluateExpression(State state) {
		throw new RuntimeException('''evaluate should be overriden for type «_self.class.name»''')
	}
}

@Aspect(className=Neg)
class NegAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val intabsvalue = (_self.expression.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = -intabsvalue]
	}
}

@Aspect(className=Null)
class NullAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		return MinijavadynamicdataFactory::eINSTANCE.createNullValue
	}
}

@Aspect(className=Minus)
class MinusAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left - right]
	}
}

@Aspect(className=Multiplication)
class MultiplicationAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left * right]
	}
}

@Aspect(className=Division)
class DivisionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left / right]
	}
}

@Aspect(className=Plus)
class PlusAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)
		if (left instanceof StringValue) {
			if (right instanceof StringValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createStringValue => [
					value = left.value + right.value
				]
			}

		} else if (left instanceof IntegerValue) {
			if (right instanceof IntegerValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [
					value = left.value + right.value
				]
			}
		}
		throw new RuntimeException('''Unsupported plus operands: «left» + «right».''')
	}
}

@Aspect(className=Or)
class OrAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)
		if (left instanceof BooleanValue) {
			if (right instanceof BooleanValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
					value = left.value || right.value
				]
			}

		}
		throw new RuntimeException('''Unsupported or operands: «left» || «right».''')
	}
}

@Aspect(className=And)
class AndAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)
		if (left instanceof BooleanValue) {
			if (right instanceof BooleanValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
					value = left.value && right.value
				]
			}

		}
		throw new RuntimeException('''Unsupported or operands: «left» && «right».''')
	}
}

@Aspect(className=Inferior)
class InferiorAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = left < right
		]
	}
}

@Aspect(className=InferiorOrEqual)
class InferiorOrEqualAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = left <= right
		]
	}

}

@Aspect(className=SuperiorOrEqual)
class SuperiorOrEqualAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = left >= right
		]
	}
}

@Aspect(className=Superior)
class SuperiorAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = left > right
		]
	}
}

@Aspect(className=Not)
class NotAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val expr = (_self.expression.evaluateExpression(state) as BooleanValue).value
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = !expr
		]
	}
}

@Aspect(className=Equality)
class EqualityAspect extends ExpressionAspect {

	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)

		val boolean result = if (left instanceof IntegerValue) {
				left.value === (right as IntegerValue).value
			} else if (left instanceof StringValue) {
				left.value == (right as StringValue).value
			} else if (left instanceof BooleanValue) {
				left.value === (right as BooleanValue).value
			} else if (left instanceof RefValue) {
				left.instance === (right as RefValue).instance
			} else {
				throw new RuntimeException('''Type unsupported for equality operator: «left.class»''')
			}

		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = result
		]
	}
}

@Aspect(className=Inequality)
class InequalityAspect extends ExpressionAspect {

	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)

		val boolean result = if (left instanceof IntegerValue) {
				left.value !== (right as IntegerValue).value
			} else if (left instanceof StringValue) {
				left.value != (right as StringValue).value
			} else if (left instanceof BooleanValue) {
				left.value !== (right as BooleanValue).value
			} else if (left instanceof RefValue) {
				left.instance !== (right as RefValue).instance
			} else {
				throw new RuntimeException('''Type unsupported for inequality operator: «left.class»''')
			}
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = result
		]
	}
}

@Aspect(className=MethodCall)
class MethodCallExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val realReceiver = (_self.receiver.evaluateExpression(state) as RefValue).instance
		val newContext = MinijavadynamicdataFactory::eINSTANCE.createContext
		for (arg : _self.args) {
			val param = _self.member.params.get(_self.args.indexOf(arg))
			val binding = MinijavadynamicdataFactory::eINSTANCE.createSymbolBinding => [
				symbol = param
				value = arg.evaluateExpression(state)
			]
			newContext.bindings.add(binding)
		}
		state.pushNewFrame(realReceiver, _self, newContext)
		_self.member.body.evaluateStatement(state)
		val returnValue = state.currentFrame.returnValue
		state.popCurrentFrame
		return returnValue

	}
}

@Aspect(className=FieldAccess)
class FieldAccessAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val realReceiver = (_self.receiver.evaluateExpression(state) as RefValue).instance
		return realReceiver.fieldbindings.findFirst[it.field === _self.member].value
	}
}

@Aspect(className=This)
class ThisAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val currentInstance = state.currentFrame.instance
		if (currentInstance === null) {
			throw new RuntimeException('''"this" is not valid in the current context''')
		} else {
			return MinijavadynamicdataFactory::eINSTANCE.createRefValue => [instance = currentInstance]
		}
	}
}

@Aspect(className=SymbolRef)
class SymbolRefAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		state.currentContext.get(_self.symbol).value.copy
	}
}

@Aspect(className=New)
class NewAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val result = MinijavadynamicdataFactory::eINSTANCE.createInstance => [
			type = _self.type
		]
		state.heap.add(result)

//		for (arg : _self.args) {
//			val Field field = (_self.type as ClassType).classref.fields.get(_self.args.indexOf(arg))
//			val binding = MinijavadynamicdataFactory::eINSTANCE.createFieldBinding
//			binding.field = field
//			binding.value = (arg as Expression).evaluate(context)
//			result.fieldbindings.add(binding)
//		}
		return MinijavadynamicdataFactory::eINSTANCE.createRefValue => [instance = result]
	}
}

//@Aspect(className=Cast)
//class CastAspect extends ExpressionAspect {
//	@OverrideAspectMethod
//	def Value evaluateExpression(State state) {
//		return _self.object.evaluate(context)
//	}
//}
@Aspect(className=StringConstant)
class StringConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		return MinijavadynamicdataFactory::eINSTANCE.createStringValue => [
			value = _self.value
		]
	}
}

@Aspect(className=IntConstant)
class IntConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [
			value = _self.value
		]
	}
}

@Aspect(className=BoolConstant)
class BoolConstantAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = _self.value.equalsIgnoreCase("true")
		]
	}
}
