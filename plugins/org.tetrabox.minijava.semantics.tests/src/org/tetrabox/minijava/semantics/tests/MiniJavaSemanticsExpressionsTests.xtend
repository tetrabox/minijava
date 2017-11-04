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

@RunWith(XtextRunner)
@InjectWith(MiniJavaInjectorProvider)
class MiniJavaSemanticsExpressionsTests {
	@Inject
	extension MiniJavaTestUtil testUtil

	@Test
	def void unit_IntConstant_1() {
		val expected = factory.createIntegerValue => [value = 1]
		genericExpressionTest(intTypeName, "1", expected)
	}

	@Test
	def void unit_IntConstant_0() {
		val expected = factory.createIntegerValue => [value = 0]
		genericExpressionTest(intTypeName, "0", expected)
	}

	@Test
	def void unit_IntConstant_min_1() {
		val expected = factory.createIntegerValue => [value = -1]
		genericExpressionTest(intTypeName, "-1", expected)
	}

	@Test
	def void unit_IntConstant_min_MAX_VALUE() {
		val expected = factory.createIntegerValue => [value = -Integer::MAX_VALUE]
		genericExpressionTest(intTypeName, '''-«Integer::MAX_VALUE»''', expected)
	}

	@Test
	def void unit_IntConstant_MAX_VALUE() {
		val expected = factory.createIntegerValue => [value = Integer::MAX_VALUE]
		genericExpressionTest(intTypeName, Integer::MAX_VALUE.toString, expected)
	}

	@Test
	def void unit_BoolConstant_true() {
		val expected = factory.createBooleanValue => [value = true]
		genericExpressionTest(booleanTypeName, "true", expected)
	}

	@Test
	def void unit_BoolConstant_false() {
		val expected = factory.createBooleanValue => [value = false]
		genericExpressionTest(booleanTypeName, "false", expected)
	}

	@Test
	def void unit_StringConstant_empty() {
		val expected = factory.createStringValue => [value = ""]
		genericExpressionTest(stringTypeName, '''""''', expected)
	}

	@Test
	def void unit_StringConstant_short() {
		val expected = factory.createStringValue => [value = "short"]
		genericExpressionTest(stringTypeName, '''"short"''', expected)
	}

	@Test
	def void unit_StringConstant_long() {
		val expected = factory.createStringValue => [value = Integer::MAX_VALUE.toString]
		genericExpressionTest(stringTypeName, '''"«Integer::MAX_VALUE.toString»"''', expected)
	}

	@Test
	def void unit_Or_true_true() {
		genericExpressionTest("boolean", "true || true", factory.createBooleanValue => [value = true])
	}

	@Test
	def void unit_Or_true_false() {
		genericExpressionTest("boolean", "true || false", factory.createBooleanValue => [value = true])
	}

	@Test
	def void unit_Or_false_false() {
		genericExpressionTest("boolean", "false || false", factory.createBooleanValue => [value = false])
	}

	@Test
	def void unit_And_true_true() {
		genericExpressionTest("boolean", "true && true", factory.createBooleanValue => [value = true])
	}

	@Test
	def void unit_And_true_false() {
		genericExpressionTest("boolean", "true && false", factory.createBooleanValue => [value = false])
	}

	@Test
	def void unit_And_false_false() {
		genericExpressionTest("boolean", "false && false", factory.createBooleanValue => [value = false])
	}

	@Test
	def void unit_Equality_equal_integers_true() {
		genericExpressionTest("boolean", "1 == 1 ", factory.createBooleanValue => [value = true])
	}

	@Test
	def void unit_Equality_equal__integers_false() {
		genericExpressionTest("boolean", "1 == 0 ", factory.createBooleanValue => [value = false])
	}

	@Test
	def void unit_Equality_equal_booleans_true() {
		genericExpressionTest("boolean", "false == false ", factory.createBooleanValue => [value = true])
	}

	@Test
	def void unit_Equality_equal__booleans_false() {
		genericExpressionTest("boolean", "true == false ", factory.createBooleanValue => [value = false])
	}

	@Test
	def void unit_Equality_equal_strings_true() {
		genericExpressionTest("boolean", ''' "yay" == "yay" ''', factory.createBooleanValue => [value = true])
	}

	@Test
	def void unit_Equality_equal__strings_false() {
		genericExpressionTest("boolean", ''' "yay" == "" ''', factory.createBooleanValue => [value = false])
	}

}