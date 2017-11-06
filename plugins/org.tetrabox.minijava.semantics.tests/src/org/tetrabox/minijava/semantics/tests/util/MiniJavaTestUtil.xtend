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
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.SymbolBinding
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.tests.MiniJavaInjectorProvider

import static extension org.tetrabox.minijava.semantics.ProgramAspect.*
import static extension org.tetrabox.minijava.semantics.util.MiniJavaSemanticsUtil.*

@InjectWith(MiniJavaInjectorProvider)
class MiniJavaTestUtil {

	@Inject
	ParseHelper<Program> parseHelper

	public static val String intTypeName = "int"
	public static val String booleanTypeName = "boolean"
	public static val String stringTypeName = "String"

	public def static String prepareTestProgram(String mainContent) {
		'''
		class X {
			public int i;
			public boolean b;
			public String s;
			
			public int identity(int j) {
				return j;
			}
			
			public void hello() {
				System.out.println("hello");
			}
			
			public void increment(int inc) {
				this.i = this.i + inc;
			}
			
			public boolean testString(String tested) {
				return this.s == tested;
			}
			
			public int getI() {
				return this.i;
			}
				
		}
		
		class Main  {
			public static void main(String[] args) {
				«mainContent»
			} 
		}'''
	}

	public def static void assertPrint(State state, String... expecteds) {
		val stream = state.outputStream.stream
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
		} else if (context.parentContext !== null) {
			return context.parentContext.get(symbol)
		} else {
			return null;
		}
	}

	public def static Set<SymbolBinding> getAllSymbolBindings(Context context) {
		if (context.childContext !== null) {
			return (context.bindings + context.childContext.allSymbolBindings).toSet
		} else {
			return context.bindings.toSet
		}
	}

	public static val factory = MinijavadynamicdataFactory::eINSTANCE

	public def void genericTest(String program, Consumer<State> oracle) {
		val Program result = parseHelper.parse(program)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue(errors.isEmpty)
		val state = result.execute
		oracle.accept(state)
	}

	public def void genericExpressionTest(String preStatements, String type, String expression, Object expectedValue) {
		val program = prepareTestProgram('''  «preStatements» «type» x = «expression»; ''')
		genericTest(program, [ s |
			val result = s.currentContext.get("x")
			Assert::assertTrue('''«expectedValue» is different from «result»''', MiniJavaValueEquals::equals(
				result,
				expectedValue
			))
		])
	}

	public def void genericExpressionTest(String type, String expression, Object expectedValue) {
		genericExpressionTest("", type, expression, expectedValue)
	}

	public def void genericStatementTest(String statement, Consumer<State> oracle) {
		val program = prepareTestProgram(statement)
		genericTest(program, oracle)
	}

	public def void genericStatementPrintTest(String statement, String... expected) {
		genericStatementTest(statement, [State s|Assert::assertEquals(expected.toList, s.outputStream.stream)])
	}

	public def void genericStatementBindingsTest(String statement, Map<String, Object> expectedBindings) {
		genericStatementTest(statement, [ State s |
			Assert::assertEquals(expectedBindings.size, s.currentFrame.rootContext.allSymbolBindings.size)
			for (symbol : expectedBindings.keySet) {
				val expectedValue = expectedBindings.get(symbol)
				val value = s.currentContext.get(symbol)
				Assert::assertTrue(MiniJavaValueEquals::equals(value,expectedValue))
			}
		])
	}

}
