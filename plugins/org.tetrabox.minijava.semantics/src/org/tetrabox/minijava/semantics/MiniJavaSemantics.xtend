package org.tetrabox.minijava.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.RefValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.And
import org.tetrabox.minijava.xtext.miniJava.Assignment
import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.Division
import org.tetrabox.minijava.xtext.miniJava.Equality
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.FieldAccess
import org.tetrabox.minijava.xtext.miniJava.ForStatement
import org.tetrabox.minijava.xtext.miniJava.IfStatement
import org.tetrabox.minijava.xtext.miniJava.Inequality
import org.tetrabox.minijava.xtext.miniJava.Inferior
import org.tetrabox.minijava.xtext.miniJava.InferiorOrEqual
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Minus
import org.tetrabox.minijava.xtext.miniJava.Multiplication
import org.tetrabox.minijava.xtext.miniJava.Neg
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Not
import org.tetrabox.minijava.xtext.miniJava.Or
import org.tetrabox.minijava.xtext.miniJava.Plus
import org.tetrabox.minijava.xtext.miniJava.PrintStatement
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.Statement
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.Superior
import org.tetrabox.minijava.xtext.miniJava.SuperiorOrEqual
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import org.tetrabox.minijava.xtext.miniJava.This
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration
import org.tetrabox.minijava.xtext.miniJava.WhileStatement

import static extension org.tetrabox.minijava.semantics.BlockAspect.*
import static extension org.tetrabox.minijava.semantics.ExpressionAspect.*
import static extension org.tetrabox.minijava.semantics.MiniJavaSemanticsUtil.*
import static extension org.tetrabox.minijava.semantics.ValueToStringAspect.*
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.Return
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Context
import org.eclipse.emf.ecore.util.EcoreUtil
import org.tetrabox.minijava.xtext.miniJava.Null

@Aspect(className=Program)
class ProgramAspect {

	@Main
	@Step
	def State execute() {
		val main = _self.classes.map[members].flatten.filter(Method).findFirst[it.name == "main" && it.static]
		val state = factory.createState => [
			outputStream = factory.createOutputStream
			rootFrame = factory.createFrame
		]
		if (main !== null) {
			main.body.evaluateStatementKeepContext(state)
			return state
		} else
			throw new RuntimeException("No main method found.")
	}

}

@Aspect(className=Block)
class BlockAspect extends StatementAspect {

	def void evaluateStatementKeepContext(State state) {
		state.pushNewContext
		val currentFrame = state.currentFrame
		var i = _self.statements.iterator
		while (i.hasNext && currentFrame.returnValue === null) {
			i.next.evaluateStatement(state)
		}
	}

	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		_self.evaluateStatementKeepContext(state)
		state.popCurrentContext
	}
}

@Aspect(className=Statement)
class StatementAspect {
	def void evaluateStatement(State state) {
		throw new RuntimeException('''evaluate should be overriden for type «_self.class.name»''')
	}
}

@Aspect(className=PrintStatement)
class PrintStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		val string = _self.expression.evaluateExpression(state).customToString
		state.println(string)
	}
}



@Aspect(className=Assignment)
class AssigmentAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		val context = state.currentContext
		val right = _self.value.evaluateExpression(state)
		val assignee = _self.assignee
		switch (assignee) {
			SymbolRef: {
				val existingBinding = context.get(assignee.symbol)
				existingBinding.value = right
			}
			VariableDeclaration: {
				val binding = factory.createSymbolBinding => [
					symbol = assignee
					value = right
				]
				context.bindings.add(binding)
			}
			FieldAccess: {
				val f = assignee.member as Field
				val realReceiver = (assignee.receiver.evaluateExpression(state) as RefValue).instance
				val existingBinding = realReceiver.fieldbindings.findFirst[it.field === f]
				if (existingBinding !== null) {
					existingBinding.value = right
				} else {
					val binding = factory.createFieldBinding => [
						field = f
						value = right
					]
					realReceiver.fieldbindings.add(binding)
				}
			}
		}
	}
}

@Aspect(className=ForStatement)
class ForStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		state.pushNewContext
		for (_self.declaration.evaluateStatement(state); (_self.condition.evaluateExpression(state) as BooleanValue).value; _self.
			progression.evaluateStatement(state)) {
			_self.block.evaluateStatement(state)
		}
		state.popCurrentContext
	}
}

@Aspect(className=IfStatement)
class IfStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		if ((_self.expression.evaluateExpression(state) as BooleanValue).value) {
			_self.thenBlock.evaluateStatement(state)
		} else if (_self.elseBlock !== null) {
			_self.elseBlock.evaluateStatement(state)
		}
	}
}

@Aspect(className=WhileStatement)
class WhileStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		while ((_self.condition.evaluateExpression(state) as BooleanValue).value) {
			_self.block.evaluateStatement(state)
		}
	}
}

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
		return factory.createIntegerValue => [value = -intabsvalue]
	}
}

@Aspect(className=Null)
class NullAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		return factory.createNullValue
	}
}

@Aspect(className=Minus)
class MinusAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return factory.createIntegerValue => [value = left - right]
	}
}

@Aspect(className=Multiplication)
class MultiplicationAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return factory.createIntegerValue => [value = left * right]
	}
}

@Aspect(className=Division)
class DivisionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = (_self.left.evaluateExpression(state) as IntegerValue).value
		val right = (_self.right.evaluateExpression(state) as IntegerValue).value
		return factory.createIntegerValue => [value = left / right]
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

@Aspect(className=Or)
class OrAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)
		if (left instanceof BooleanValue) {
			if (right instanceof BooleanValue) {
				return factory.createBooleanValue => [
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
				return factory.createBooleanValue => [
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
				genericEqualityTest(left, right, [l, r|l.value === r.value])
			} else if (left instanceof StringValue) {
				genericEqualityTest(left, right, [l, r|l.value == r.value])
			} else if (left instanceof BooleanValue) {
				genericEqualityTest(left, right, [l, r|l.value === r.value])
			} else if (left instanceof RefValue) {
				genericEqualityTest(left, right, [l, r|l.instance === r.instance])
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
				genericEqualityTest(left, right, [l, r|l.value !== r.value])
			} else if (left instanceof StringValue) {
				genericEqualityTest(left, right, [l, r|l.value != r.value])
			} else if (left instanceof BooleanValue) {
				genericEqualityTest(left, right, [l, r|l.value !== r.value])
			} else if (left instanceof RefValue) {
				genericEqualityTest(left, right, [l, r|l.instance !== r.instance])
			} else {
				throw new RuntimeException('''Type unsupported for equality operator: «left.class»''')
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

@Aspect(className=Expression)
class ExpressionStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		_self.evaluateExpression(state)
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

@Aspect(className=Return)
class ReturnAspect extends StatementAspect {
	@OverrideAspectMethod
	def void evaluateStatement(State state) {
		val value = _self.expression.evaluateExpression(state);
		state.currentFrame.returnValue = value
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
			return factory.createRefValue => [instance = currentInstance]
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
		val result = factory.createInstance => [
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
		return factory.createRefValue => [instance = result]
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
