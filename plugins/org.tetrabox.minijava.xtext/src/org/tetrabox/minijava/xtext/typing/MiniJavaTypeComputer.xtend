package org.tetrabox.minijava.xtext.typing

import com.google.inject.Inject
import org.tetrabox.minijava.xtext.MiniJavaLib
import org.tetrabox.minijava.xtext.miniJava.Assignment
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.MemberSelection
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.New
import org.tetrabox.minijava.xtext.miniJava.Null
import org.tetrabox.minijava.xtext.miniJava.Return
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.Super
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import org.tetrabox.minijava.xtext.miniJava.This
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage

import static extension org.eclipse.xtext.EcoreUtil2.*

class MiniJavaTypeComputer {
	private static val factory = MiniJavaFactory.eINSTANCE
	public static val STRING_TYPE = factory.createClass => [name = 'stringType']
	public static val INT_TYPE = factory.createClass => [name = 'intType']
	public static val BOOLEAN_TYPE = factory.createClass => [name = 'booleanType']
	public static val NULL_TYPE = factory.createClass => [name = 'nullType']

	static val ep = MiniJavaPackage.eINSTANCE

	@Inject extension MiniJavaLib

	def Class typeFor(Expression e) {
		switch (e) {
			New:
				e.type
			SymbolRef:
				e.symbol.type
			MemberSelection:
				e.member.type
			Assignment:
				e.left.typeFor
			This:
				e.getContainerOfType(Class)
			Super:
				e.getContainerOfType(Class).getSuperclassOrObject
			Null:
				NULL_TYPE
			StringConstant:
				STRING_TYPE
			IntConstant:
				INT_TYPE
			BoolConstant:
				BOOLEAN_TYPE
		}
	}

	def getSuperclassOrObject(Class c) {
		c.superclass ?: getMiniJavaObjectClass(c)
	}

	def isPrimitive(Class c) {
		c.eResource === null
	}

	def expectedType(Expression e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		switch (c) {
			VariableDeclaration:
				c.type
			Assignment case f == ep.assignment_Right:
				typeFor(c.left)
			Return:
				c.getContainerOfType(Method).type
			case f == ep.ifStatement_Expression:
				BOOLEAN_TYPE
			MemberSelection case f == ep.memberSelection_Args: {
				// assume that it refers to a method and that there
				// is a parameter corresponding to the argument
				try {
					(c.member as Method).params.get(c.args.indexOf(e)).type
				} catch (Throwable t) {
					null // otherwise there is no specific expected type
				}
			}
		}
	}
}