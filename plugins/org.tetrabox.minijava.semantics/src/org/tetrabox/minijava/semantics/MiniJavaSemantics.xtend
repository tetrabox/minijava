package org.tetrabox.minijava.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.tetrabox.minijava.xtext.miniJava.Argument
import org.tetrabox.minijava.xtext.miniJava.BasicType
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.Cast
import org.tetrabox.minijava.xtext.miniJava.ClassType
import org.tetrabox.minijava.xtext.miniJava.Constant
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.FieldSelection
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.Message
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MethodBody
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Parameter
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.Selection
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.This
import org.tetrabox.minijava.xtext.miniJava.Type
import org.tetrabox.minijava.xtext.miniJava.TypedElement
import org.tetrabox.minijava.xtext.miniJava.Variable

import static extension org.tetrabox.minijava.semantics.ProgramAspect.*
import static extension org.tetrabox.minijava.semantics.TypeAspect.*
import static extension org.tetrabox.minijava.semantics.BasicTypeAspect.*
import static extension org.tetrabox.minijava.semantics.ClassTypeAspect.*
import static extension org.tetrabox.minijava.semantics.TypedElementAspect.*
import static extension org.tetrabox.minijava.semantics.ClassAspect.*
import static extension org.tetrabox.minijava.semantics.FieldAspect.*
import static extension org.tetrabox.minijava.semantics.ParameterAspect.*
import static extension org.tetrabox.minijava.semantics.MethodAspect.*
import static extension org.tetrabox.minijava.semantics.MethodBodyAspect.*
import static extension org.tetrabox.minijava.semantics.ExpressionAspect.*
import static extension org.tetrabox.minijava.semantics.MessageAspect.*
import static extension org.tetrabox.minijava.semantics.MethodCallAspect.*
import static extension org.tetrabox.minijava.semantics.FieldSelectionAspect.*
import static extension org.tetrabox.minijava.semantics.ThisAspect.*
import static extension org.tetrabox.minijava.semantics.VariableAspect.*
import static extension org.tetrabox.minijava.semantics.NewAspect.*
import static extension org.tetrabox.minijava.semantics.CastAspect.*
import static extension org.tetrabox.minijava.semantics.ConstantAspect.*
import static extension org.tetrabox.minijava.semantics.StringConstantAspect.*
import static extension org.tetrabox.minijava.semantics.IntConstantAspect.*
import static extension org.tetrabox.minijava.semantics.BoolConstantAspect.*
import static extension org.tetrabox.minijava.semantics.ArgumentAspect.*
import static extension org.tetrabox.minijava.semantics.SelectionAspect.*

@Aspect(className=Program)
class ProgramAspect {
	
	@Main
	@Step
	def void execute() {
		
	}

}

@Aspect(className=Type)
class TypeAspect {

}

@Aspect(className=BasicType)
class BasicTypeAspect extends TypeAspect {

}

@Aspect(className=ClassType)
class ClassTypeAspect extends TypeAspect {

}

@Aspect(className=TypedElement)
class TypedElementAspect {

}

@Aspect(className=Class)
class ClassAspect {

}

@Aspect(className=Field)
class FieldAspect extends TypedElementAspect {

}

@Aspect(className=Parameter)
class ParameterAspect extends TypedElementAspect {

}

@Aspect(className=Method)
class MethodAspect {

}

@Aspect(className=MethodBody)
class MethodBodyAspect {

}

@Aspect(className=Expression)
class ExpressionAspect extends ArgumentAspect {

}

@Aspect(className=Message)
class MessageAspect {

}

@Aspect(className=MethodCall)
class MethodCallAspect extends MessageAspect {

}

@Aspect(className=FieldSelection)
class FieldSelectionAspect extends MessageAspect {

}

@Aspect(className=This)
class ThisAspect extends ExpressionAspect {

}

@Aspect(className=Variable)
class VariableAspect extends ExpressionAspect {

}

@Aspect(className=New)
class NewAspect extends ExpressionAspect {

}

@Aspect(className=Cast)
class CastAspect extends ExpressionAspect {

}

@Aspect(className=Constant)
class ConstantAspect extends ExpressionAspect {

}

@Aspect(className=StringConstant)
class StringConstantAspect extends ConstantAspect {

}

@Aspect(className=IntConstant)
class IntConstantAspect extends ConstantAspect {

}

@Aspect(className=BoolConstant)
class BoolConstantAspect extends ConstantAspect {

}

@Aspect(className=Argument)
class ArgumentAspect {

}

@Aspect(className=Selection)
class SelectionAspect extends ExpressionAspect {

}



