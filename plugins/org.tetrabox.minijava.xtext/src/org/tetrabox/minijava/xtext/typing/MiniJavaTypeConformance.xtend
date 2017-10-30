package org.tetrabox.minijava.xtext.typing

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.tetrabox.minijava.xtext.MiniJavaModelUtil
import org.tetrabox.minijava.xtext.miniJava.Class

import static org.tetrabox.minijava.xtext.typing.MiniJavaTypeComputer.*

class MiniJavaTypeConformance {

	@Inject extension MiniJavaModelUtil
	@Inject extension IQualifiedNameProvider

	def isConformant(Class c1, Class c2) {
		c1 === NULL_TYPE || // null can be assigned to everything
		c1 === c2 ||
		conformToLibraryTypes(c1, c2) ||
		c1.isSubclassOf(c2)
	}

	def conformToLibraryTypes(Class c1, Class c2) {
		(c1.conformsToString && c2.conformsToString)||
		(c1.conformsToInt && c2.conformsToInt) ||
		(c1.conformsToBoolean && c2.conformsToBoolean)
	}

	def conformsToString(Class c) {
		false //c == STRING_TYPE || c.fullyQualifiedName.toString == MiniJavaLib.LIB_STRING
	}

	def conformsToInt(Class c) {
		false //c == INT_TYPE || c.fullyQualifiedName.toString == MiniJavaLib.LIB_INTEGER
	}

	def conformsToBoolean(Class c) {
		false //c == BOOLEAN_TYPE || c.fullyQualifiedName.toString == MiniJavaLib.LIB_BOOLEAN
	}

	def isSubclassOf(Class c1, Class c2) {
		c1.classHierarchy.contains(c2)
	}
}
