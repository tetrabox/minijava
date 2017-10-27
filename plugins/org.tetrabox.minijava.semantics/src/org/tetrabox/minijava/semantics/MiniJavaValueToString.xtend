package org.tetrabox.minijava.semantics

import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue

class MiniJavaValueToString {

//	static def String simpleInstanceValueToString(Instance instance) {
//		'''«instance.type.name»«instance»@«System.identityHashCode(instance)»'''
//	}
	static def dispatch String valueToString(Instance instance) {
			///«b.field.name»: «IF b.value instanceof Instance»«simpleInstanceValueToString(b.value as Instance)»«ELSE»«valueToString(b.value)»«ENDIF»
		return '''«instance.type.name» {«FOR b : instance.fieldbindings SEPARATOR "\n\t"»«b.field.name»: «valueToString(b.value) »«ENDFOR»}''';
	}

	static def dispatch String valueToString(IntegerValue integerValue) {
		return integerValue.value.toString
	}

	static def dispatch String valueToString(BooleanValue booleanValue) {
		return booleanValue.value.toString
	}

	static def dispatch String valueToString(StringValue stringValue) {
		return stringValue.value.toString
	}

}
