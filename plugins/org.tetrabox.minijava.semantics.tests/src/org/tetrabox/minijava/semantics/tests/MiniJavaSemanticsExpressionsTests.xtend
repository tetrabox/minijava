/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.minijava.semantics.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.tetrabox.minijava.semantics.tests.util.MiniJavaTestUtil
import org.tetrabox.minijava.xtext.tests.MiniJavaInjectorProvider

import static org.tetrabox.minijava.semantics.tests.util.MiniJavaTestUtil.*
import org.tetrabox.minijava.semantics.tests.util.MiniJavaValueEquals.ObjectTemplate
import java.util.HashMap
import org.tetrabox.minijava.semantics.tests.util.MiniJavaValueEquals.ArrayTemplate

@RunWith(XtextRunner)
@InjectWith(MiniJavaInjectorProvider)
class MiniJavaSemanticsExpressionsTests {
	@Inject
	extension MiniJavaTestUtil testUtil

	@Test
	def void intConstant_1() {
		genericExpressionTest(intTypeName, "1", 1)
	}

	@Test
	def void intConstant_0() {
		genericExpressionTest(intTypeName, "0", 0)
	}

	@Test
	def void intConstant_min_1() {
		genericExpressionTest(intTypeName, "-1", -1)
	}

	@Test
	def void intConstant_min_MAX_VALUE() {
		genericExpressionTest(intTypeName, '''-«Integer::MAX_VALUE»''', -Integer::MAX_VALUE)
	}

	@Test
	def void intConstant_MAX_VALUE() {
		genericExpressionTest(intTypeName, Integer::MAX_VALUE.toString, Integer::MAX_VALUE)
	}

	@Test
	def void boolConstant_true() {
		genericExpressionTest(booleanTypeName, "true", true)
	}

	@Test
	def void boolConstant_false() {
		genericExpressionTest(booleanTypeName, "false", false)
	}

	@Test
	def void stringConstant_empty() {
		genericExpressionTest(stringTypeName, '''""''', "")
	}

	@Test
	def void stringConstant_short() {
		genericExpressionTest(stringTypeName, '''"short"''', "short")
	}

	@Test
	def void stringConstant_long() {
		genericExpressionTest(stringTypeName, '''"«Integer::MAX_VALUE.toString»"''', Integer::MAX_VALUE.toString)
	}

	@Test
	def void or_true_true() {
		genericExpressionTest("boolean", "true || true", true)
	}

	@Test
	def void or_true_false() {
		genericExpressionTest("boolean", "true || false", true)
	}

	@Test
	def void or_false_false() {
		genericExpressionTest("boolean", "false || false", false)
	}

	@Test
	def void and_true_true() {
		genericExpressionTest("boolean", "true && true", true)
	}

	@Test
	def void and_true_false() {
		genericExpressionTest("boolean", "true && false", false)
	}

	@Test
	def void and_false_false() {
		genericExpressionTest("boolean", "false && false", false)
	}

	@Test
	def void equality_inequal_integers_false() {
		genericExpressionTest("boolean", "1 != 1 ", false)
	}

	@Test
	def void equality_inequal__integers_true() {
		genericExpressionTest("boolean", "1 != 0 ", true)
	}

	@Test
	def void equality_inequal_booleans_false() {
		genericExpressionTest("boolean", "false != false ", false)
	}

	@Test
	def void equality_inequal__booleans_true() {
		genericExpressionTest("boolean", "true != false ", true)
	}

	@Test
	def void equality_inequal_strings_false() {
		genericExpressionTest("boolean", ''' "yay" != "yay" ''', false)
	}

	@Test
	def void equality_inequal_instances_true() {
		genericExpressionTest("boolean", ''' new Main() != new Main() ''', true)
	}

	@Test
	def void equality_inequal_instance_null_true() {
		genericExpressionTest("boolean", ''' new Main() != null ''', true)
	}

	@Test
	def void equality_inequal_instances_false() {
		genericExpressionTest('''
		Main i1 = new Main(); 
		Main i2 = i1;''', "boolean", ''' i1 != i2 ''', false)
	}

	@Test
	def void equality_equal_integers_true() {
		genericExpressionTest("boolean", "1 == 1 ", true)
	}

	@Test
	def void equality_equal__integers_false() {
		genericExpressionTest("boolean", "1 == 0 ", false)
	}

	@Test
	def void equality_equal_booleans_true() {
		genericExpressionTest("boolean", "false == false ", true)
	}

	@Test
	def void equality_equal__booleans_false() {
		genericExpressionTest("boolean", "true == false ", false)
	}

	@Test
	def void equality_equal_strings_true() {
		genericExpressionTest("boolean", ''' "yay" == "yay" ''', true)
	}

	@Test
	def void equality_equal_instances_false() {
		genericExpressionTest("boolean", ''' new Main() == new Main() ''', false)
	}

	@Test
	def void equality_equal_instances_true() {
		genericExpressionTest('''Main i1 = new Main(); Main i2 = i1;''', "boolean", ''' i1 == i2 ''', true)
	}

	@Test
	def void equality_equal_instance_null_false() {
		genericExpressionTest("boolean", ''' new Main() == null ''', false)
	}
	
		@Test
	def void equality_equal_null_true() {
		genericExpressionTest("boolean", ''' null == null ''', true)
	}

	@Test
	def void comparison_less_true() {
		genericExpressionTest("boolean", ''' 1 < 2 ''', true)
	}

	@Test
	def void comparison_less_false() {
		genericExpressionTest("boolean", ''' 12 < 2 ''', false)
	}

	@Test
	def void comparison_less_same_false() {
		genericExpressionTest("boolean", ''' 2 < 2 ''', false)
	}

	@Test
	def void comparison_lesseq_true() {
		genericExpressionTest("boolean", ''' 1 <= 2 ''', true)
	}

	@Test
	def void comparison_lesseq_same_true() {
		genericExpressionTest("boolean", ''' 1 <= 1 ''', true)
	}

	@Test
	def void comparison_lesseq_false() {
		genericExpressionTest("boolean", ''' 12 <= 2 ''', false)
	}

	@Test
	def void comparison_sup_false() {
		genericExpressionTest("boolean", ''' 1 > 2 ''', false)
	}

	@Test
	def void comparison_sup_true() {
		genericExpressionTest("boolean", ''' 12 > 2 ''', true)
	}

	@Test
	def void comparison_sup_same_false() {
		genericExpressionTest("boolean", ''' 2 > 2 ''', false)
	}

	@Test
	def void comparison_supeq_false() {
		genericExpressionTest("boolean", ''' 1 >= 2 ''', false)
	}

	@Test
	def void comparison_supeq_same_true() {
		genericExpressionTest("boolean", ''' 1 >= 1 ''', true)
	}

	@Test
	def void comparison_supeq_true() {
		genericExpressionTest("boolean", ''' 12 >= 2 ''', true)
	}

	@Test
	def void plus_int_1() {
		genericExpressionTest("int", ''' 12 + 5 ''', 17)
	}

	@Test
	def void plus_int_2() {
		genericExpressionTest("int", ''' 150 + 0 ''', 150)
	}

	@Test
	def void plus_int_3() {
		genericExpressionTest("int", ''' 150 + 16 ''', 166)
	}

	@Test
	def void plus_String_1() {
		genericExpressionTest("String", ''' "hello" + "world"''', "helloworld")
	}

	@Test
	def void plus_String_2() {
		genericExpressionTest("String", ''' "hello" + "" ''', "hello")
	}

	@Test
	def void plus_String__int() {
		genericExpressionTest("String", ''' "hello" + 12 ''', "hello12")
	}

	@Test
	def void minus_1() {
		genericExpressionTest("int", ''' 12 - 5 ''', 7)
	}

	@Test
	def void minus_2() {
		genericExpressionTest("int", ''' 150 - 0 ''', 150)
	}

	@Test
	def void minus_3() {
		genericExpressionTest("int", ''' 150 - 16 ''', 134)
	}

	@Test
	def void multiplication_1() {
		genericExpressionTest("int", ''' 3*4 ''', 12)
	}

	@Test
	def void multiplication_2() {
		genericExpressionTest("int", ''' 3*0 ''', 0)
	}

	@Test
	def void multiplication_3() {
		genericExpressionTest("int", ''' 150*2 ''', 300)
	}

	@Test
	def void division_1() {
		genericExpressionTest("int", ''' 4/2 ''', 2)
	}

	@Test
	def void division_2() {
		genericExpressionTest("int", ''' 0/3 ''', 0)
	}

	@Test
	def void division_3() {
		genericExpressionTest("int", ''' 5/2 ''', 2)
	}

	@Test
	def void not_1() {
		genericExpressionTest("boolean", ''' !true ''', false)
	}

	@Test
	def void not_2() {
		genericExpressionTest("boolean", ''' !false ''', true)
	}

	@Test
	def void neg_1() {
		genericExpressionTest("int", ''' -12 ''', -12)
	}

	@Test
	def void neg_2() {
		genericExpressionTest("int", ''' -(-12) ''', 12)
	}

	@Test
	def void fieldAccess_singleset() {
		genericExpressionTest(
			"X test = new X(); test.i = 12;",
			"int",
			''' test.i ''',
			12
		)
	}

	@Test
	def void fieldAccess_multiplesets() {
		genericExpressionTest("X test = new X(); test.i = 12; test.i = 15;", "int", ''' test.i ''', 15)
	}

	@Test
	def void methodCall_innercomputation() {
		genericExpressionTest('''X test = new X(); test.s = "hello"; ''', "boolean", ''' test.testString("hello") ''',
			true)
	}

	@Test
	def void methodCall_getter() {
		genericExpressionTest('''X test = new X(); test.i = 47; ''', "int", ''' test.getI() ''', 47)
	}

	@Test
	def void null_() {
		genericExpressionTest("X", ''' null ''', factory.createNullValue)
	}

	@Test
	def void new_default() {
		genericExpressionTest("X", ''' new X() ''', new ObjectTemplate("X", new HashMap))
	}

	@Test
	def void new_param() {
		genericExpressionTest("X", ''' new X(12) ''', new ObjectTemplate("X", #{"i" -> 12}))
	}

	@Test
	def void symbolRef_variable() {
		genericExpressionTest("int g = 13;", "int", ''' g ''', 13)
	}

	@Test
	def void symbolRef_parameter() {
		genericExpressionTest("int", ''' new X().identity(1337) ''', 1337)
	}

	@Test
	def void newArray_primitive() {
		genericExpressionTest("int[]", ''' new int[7] ''', new ArrayTemplate(7, "int", #[0, 0, 0, 0, 0, 0, 0]))
	}

	@Test
	def void newArray_objects() {
		genericExpressionTest("X[]", ''' new X[3] ''',
			new ArrayTemplate(3, "X", #[factory.createNullValue, factory.createNullValue, factory.createNullValue]))
	}

	@Test
	def void arrayAccess_int() {
		genericExpressionTest("int[] array = new int[3]; array[2] = 3;", "int", '''array[2]''', 3)
	}

	@Test
	def void arrayAccess_ref() {
		genericExpressionTest("X[] array = new X[4]; array[1] = new X(15);", "X", '''array[1]''',
			new ObjectTemplate("X", #{"i" -> 15}))
	}

	@Test
	def void length() {
		genericExpressionTest("X[] array = new X[9];", "int", '''array.length''', 9)
	}

}
