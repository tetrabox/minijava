package org.tetrabox.minijava.semantics

import java.util.function.BiFunction
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Context
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Frame
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.RefValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.SymbolBinding
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.MemberSelection
import org.tetrabox.minijava.xtext.miniJava.Symbol

class MiniJavaSemanticsUtil {

	public static val factory = MinijavadynamicdataFactory::eINSTANCE

	static def Context createChildContext(Context parent) {
		return factory.createContext => [
			parentContext = parent
		]
	}

	public static def SymbolBinding get(Context context, Symbol symbol) {
		val binding = context.bindings.findFirst[it.symbol === symbol]
		if (binding !== null) {
			return binding
		} else if (context.parentContext !== null) {
			return context.parentContext.get(symbol)
		} else {
			return null
		}
	}

	static def Frame getCurrentFrame(State state) {
		return state.rootFrame.currentFrame
	}

	static def Frame getCurrentFrame(Frame frame) {
		if (frame.childFrame !== null) {
			return frame.childFrame.currentFrame
		} else {
			return frame
		}
	}

	static def Context getCurrentContext(State state) {
		return state.rootFrame.currentContext
	}

	static def Context getCurrentContext(Frame frame) {
		if (frame.childFrame !== null) {
			return frame.childFrame.currentContext
		} else {
			return frame.rootContext.currentContext
		}
	}

	static def Context getCurrentContext(Context context) {
		if (context.childContext !== null) {
			return context.childContext.currentContext
		} else {
			return context
		}
	}

	static def void println(State state, String string) {
		println(string)
		state.outputStream.stream.add(string)
	}

	static def void pushNewContext(State state) {
		state.currentContext.childContext = factory.createContext
	}

	static def void popCurrentContext(State state) {
		state.currentContext.childContext = null
	}

	static def void pushNewFrame(State state, Instance receiver, MemberSelection methodCall, Context newContext) {
		state.currentFrame.childFrame = factory.createFrame => [
			instance = receiver
			methodcall = methodCall
			rootContext = newContext
		]
	}

	static def void popCurrentFrame(State state) {
		state.currentFrame.childFrame = null
	}

	static def dispatch Value copy(RefValue value) {
		return factory.createRefValue => [instance = value.instance]
	}

	static def dispatch Value copy(IntegerValue value) {
		return factory.createIntegerValue => [value = value.value]
	}

	static def dispatch Value copy(BooleanValue value) {
		return factory.createBooleanValue => [value = value.value]
	}

	static def dispatch Value copy(StringValue value) {
		return factory.createStringValue => [value = value.value]
	}

	static def <T> boolean genericEqualityTest(T left, Object right, BiFunction<T, T, Boolean> equalityFunction) {
		return if (left.class == right.class) {
			equalityFunction.apply(left, right as T)
		} else {
			throw new RuntimeException('''Equality operands must be of the same type: «left.class» is not «right.class»''')
		}

	}
}
