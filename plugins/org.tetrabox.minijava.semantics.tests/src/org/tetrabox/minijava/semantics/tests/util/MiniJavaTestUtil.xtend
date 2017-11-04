package org.tetrabox.minijava.semantics.tests.util

import com.google.inject.Inject
import java.util.Map
import java.util.Set
import java.util.function.Consumer
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Context
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.SymbolBinding
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.tests.MiniJavaInjectorProvider

import static extension org.tetrabox.minijava.semantics.ProgramAspect.*

@InjectWith(MiniJavaInjectorProvider)
class MiniJavaTestUtil {
	
		@Inject
	ParseHelper<Program> parseHelper
	
	
	public static val String intTypeName = "int"
	public static val String booleanTypeName = "boolean"
	public static val String stringTypeName = "String"

	public def static void assertPrint(Context context, String... expecteds) {
		val stream = context.outputStream.stream
		Assert::assertEquals(stream.size, expecteds.size)
		var int index = 0
		for (expected : expecteds) {
			val s = stream.get(index)
			Assert::assertEquals("List of printed strings should be of same size.", expected, s)
			index++
		}
	}

	public def static Value get(Context context, String symbol) {
		val result = context.bindings.findFirst[it.symbol.name == symbol]
		if (result !== null) {
			return result.value
		} else if (context.childrenContext !== null) {
			return context.childrenContext.get(symbol)
		} else {
			return null;
		}
	}

	public def static Set<SymbolBinding> getAllSymbolBindings(Context context) {
		if (context.childrenContext !== null) {
			return (context.bindings + context.childrenContext.allSymbolBindings).toSet
		} else {
			return context.bindings.toSet
		}
	}

	public static val factory = MinijavadynamicdataFactory::eINSTANCE

	public  def void genericTest(String program, Consumer<Context> oracle) {
		val Program result = parseHelper.parse(program)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue(errors.isEmpty)
		val context = result.execute
		oracle.accept(context)
	}

	public  def void genericExpressionTest(String type, String expression, Value expectedValue) {
		val program = '''class Main  {
			public static void main(String[] args) {
				«type» x = «expression»;
			} 
		}'''

		genericTest(program, [ c |
			val result = c.get("x")
			Assert::assertTrue(MiniJavaValueEquals::equals(
				expectedValue,
				result
			))
		])
	}

	public  def void genericStatementTest(String statement, Consumer<Context> oracle) {
		val program = '''class Main  {
			public static void main(String[] args) {
				«statement»
			} 
		}'''
		genericTest(program, oracle)
	}

	public  def void genericStatementPrintTest(String statement, String... expected) {
		genericStatementTest(statement, [Context c|Assert::assertEquals(expected.toList, c.outputStream.stream)])
	}

	public  def void genericStatementBindingsTest(String statement, Map<String, Value> expectedBindings) {
		genericStatementTest(statement, [ Context c |
			Assert::assertEquals(expectedBindings.size, c.allSymbolBindings.size)
			for (symbol : expectedBindings.keySet) {
				val expectedValue = expectedBindings.get(symbol)
				val value = c.get(symbol)
				Assert::assertTrue(MiniJavaValueEquals::equals(expectedValue, value))
			}
		])
	}
	
	
}