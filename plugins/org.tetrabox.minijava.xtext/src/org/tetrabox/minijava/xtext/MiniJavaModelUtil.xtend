package org.tetrabox.minijava.xtext

import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.ClassRef
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.IntegerTypeRef
import org.tetrabox.minijava.xtext.miniJava.Member
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Return
import org.tetrabox.minijava.xtext.miniJava.StringTypeRef
import org.tetrabox.minijava.xtext.miniJava.TypeRef
import org.tetrabox.minijava.xtext.miniJava.TypedMember
import org.tetrabox.minijava.xtext.miniJava.Constructor

class MiniJavaModelUtil {

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

		visited
	}

	def classHierarchyMethods(Class c) {
		// reverse the list so that methods in subclasses
		// will be added later to the map, thus overriding
		// the one already present in the superclasses
		// if the methods have the same name
		c.classHierarchy.toList.reverseView.map[methods].flatten.toMap[name]
	}

	def classHierarchyMembers(Class c) {
		c.classHierarchy.map[members].flatten
	}

	def memberAsString(Member m) {
		if (m instanceof TypedMember) {
			m.name + if (m instanceof Method)
				"(" + m.params.map[typeRef.name].join(", ") + ")"
			else
				""
		} else if (m instanceof Constructor) {
			m.type.name + "(" + m.params.map[typeRef.name].join(", ") + ")"
		}
	}

	def memberAsStringWithType(Member m) {
		m.memberAsString + " : " + if (m instanceof TypedMember) m.typeRef.name else if (m instanceof Constructor) m.type.name
	}

	def String getName(TypeRef r) {
		val test = switch r {
			ClassRef: r.referencedClass.name
			IntegerTypeRef: "int"
			StringTypeRef: "String"
			BooleanTypeRef: "boolean"
		}
		return test
	}
}
