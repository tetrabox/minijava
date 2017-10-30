package org.tetrabox.minijava.semantics.tests

import java.util.HashMap
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.dynamic.minijavadynamicdata.FieldBinding

/**
 * TODO work in progress
 */
class MiniJavaValueEquals {

	def dispatch static boolean equals(Value v1, Value v2) {
		return false;
	}

	def dispatch static boolean equals(IntegerValue v1, IntegerValue v2) {
		return v1.value === v2.value
	}

	def dispatch static boolean equals(BooleanValue v1, BooleanValue v2) {
		return v1.value === v2.value
	}

	def dispatch static boolean equals(StringValue v1, StringValue v2) {
		return v1.value == v2.value
	}

	def dispatch static boolean equals(Instance v1, Instance v2) {
		if (v1.type != v2.type) {
			return false
		}

		val mapping = new HashMap<Instance, Instance>
		mapping.put(v1, v2)
		for (b1 : v1.fieldbindings) {
			val b2 = v2.fieldbindings.get(v1.fieldbindings.indexOf(b1))
			if (!(testequals(b1, b2, mapping))) {
				return false
			}

		}

		return true
	}

	def static boolean testequals(FieldBinding binding, FieldBinding binding2, HashMap<Instance, Instance> map) {
		if (binding.field != binding2.field)
			return false
			
		
	}

}
