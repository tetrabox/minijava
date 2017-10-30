package org.tetrabox.minijava.xtext

import com.google.inject.Inject
import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.Member
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Return

class MiniJavaModelUtil {

	@Inject extension MiniJavaLib

	def fields(Class c) {
		c.members.filter(Field)
	}

	def methods(Class c) {
		c.members.filter(Method)
	}

	def returnStatement(Method m) {
		m.body.returnStatement
	}

	def returnStatement(Block block) {
		block.statements.filter(Return).head
	}

	def classHierarchy(Class c) {
		val visited = newLinkedHashSet()

		var current = c.superclass
		while (current !== null && !visited.contains(current)) {
			visited.add(current)
			current = current.superclass
		}

		val object = c.getMiniJavaObjectClass
		if (object !== null)
			visited.add(object)

		visited
	}

	def classHierarchyMethods(Class c) {
		// reverse the list so that methods in subclasses
		// will be added later to the map, thus overriding
		// the one already present in the superclasses
		// if the methods have the same name
		c.classHierarchy.toList.reverseView.
			map[methods].flatten.toMap[name]
	}

	def classHierarchyMembers(Class c) {
		c.classHierarchy.map[members].flatten
	}

	def memberAsString(Member m) {
		m.name +
		if (m instanceof Method)
			"(" + m.params.map[type.name].join(", ") + ")"
		else ""
	}

	def memberAsStringWithType(Member m) {
		m.memberAsString + " : " + m.type.name
	}
}
