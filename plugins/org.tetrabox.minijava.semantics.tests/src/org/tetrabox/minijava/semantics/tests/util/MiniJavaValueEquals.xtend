package org.tetrabox.minijava.semantics.tests.util

import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.dynamic.minijavadynamicdata.RefValue
import java.util.Map
import org.tetrabox.minijava.dynamic.minijavadynamicdata.NullValue
import org.eclipse.xtend.lib.annotations.Data 
/**
 * TODO work in progress
 */
class MiniJavaValueEquals {
	
	
	@Data
	static class ObjectTemplate {
		val String typeName
		val Map<String,Object> bindings
	}

	def dispatch static boolean equals(Value v1, Object v2) {
		throw new  UnsupportedOperationException();
	}

	def dispatch static boolean equals(IntegerValue v1, Integer v2) {
		return v1.value === v2
	}

	def dispatch static boolean equals(BooleanValue v1, Boolean v2) {
		return v1.value === v2
	}

	def dispatch static boolean equals(StringValue v1, String v2) {
		return v1.value == v2
	}
	
	def dispatch static boolean equals(RefValue v1, ObjectTemplate pattern) {
		
		if (v1.instance.type.name != pattern.typeName)
			return false;
		
		for (String fieldName : pattern.bindings.keySet) {
			val Object expectedValue = pattern.bindings.get(fieldName)
			val Value currentValue = v1.instance.fieldbindings.findFirst[it.field.name == fieldName].value
			if (! MiniJavaValueEquals::equals(currentValue,expectedValue))
				return false
		}
		return true;
	}
	
	def dispatch static boolean equals(NullValue v1, NullValue v2) {
		return true;
	}
	

//	def dispatch static boolean equals(Instance v1, Instance v2) {
//		throw new  UnsupportedOperationException();
////		if (v1.type != v2.type) {
////			return false
////		}
////
////		val mapping = new HashMap<Instance, Instance>
////		mapping.put(v1, v2)
////		for (b1 : v1.fieldbindings) {
////			val b2 = v2.fieldbindings.get(v1.fieldbindings.indexOf(b1))
////			if (!(testequals(b1, b2, mapping))) {
////				return false
////			}
////
////		}
////
////		return true
//	}



}
