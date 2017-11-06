package org.tetrabox.minijava.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
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
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.Symbol

import static extension org.tetrabox.minijava.semantics.ContextAspect.*
import static extension org.tetrabox.minijava.semantics.FrameAspect.*

@Aspect(className=Context)
class ContextAspect {
	

	def Context createChildContext() {
		return MinijavadynamicdataFactory::eINSTANCE.createContext => [
			parentContext = _self
		]
	}

	def SymbolBinding findBinding(Symbol symbol) {
		val binding = _self.bindings.findFirst[it.symbol === symbol]
		if (binding !== null) {
			return binding
		} else if (_self.parentContext !== null) {
			return _self.parentContext.findBinding(symbol)
		} else {
			return null
		}
	}

	def Context findCurrentContext() {
		if (_self.childContext !== null) {
			return _self.childContext.findCurrentContext
		} else {
			return _self
		}
	}

}

@Aspect(className=State)
class StateAspect {

	def Frame findCurrentFrame() {
		return _self.rootFrame.findCurrentFrame
	}

	def Context findCurrentContext() {
		return _self.rootFrame.findCurrentContext
	}

	def void println(String string) {
		println(string)
		_self.outputStream.stream.add(string)
	}

	def void pushNewContext() {
		if (_self.findCurrentContext !== null) {
			_self.findCurrentContext.childContext = MinijavadynamicdataFactory::eINSTANCE.createContext
		} else {
			_self.findCurrentFrame.rootContext = MinijavadynamicdataFactory::eINSTANCE.createContext
		}
	}

	def void popCurrentContext() {
		_self.findCurrentContext.parentContext = null
	}

	def void pushNewFrame(Instance receiver, MethodCall methodCall, Context newContext) {
		_self.findCurrentFrame.childFrame = MinijavadynamicdataFactory::eINSTANCE.createFrame => [
			instance = receiver
			methodcall = methodCall
			rootContext = newContext
		]
	}

	def void popCurrentFrame() {
		_self.findCurrentFrame.parentFrame = null;
	}

}

@Aspect(className=Frame)
class FrameAspect {

	def Frame findCurrentFrame() {
		if (_self.childFrame !== null) {
			return _self.childFrame.findCurrentFrame
		} else {
			return _self
		}
	}

	def Context findCurrentContext() {
		if (_self.childFrame !== null) {
			return _self.childFrame.findCurrentContext
		} else if (_self.rootContext !== null) {
			return _self.rootContext.findCurrentContext
		} else {
			return null
		}
	}

}

@Aspect(className=Value)
class ValueAspect {
	def Value copy() {}
}

@Aspect(className=IntegerValue)
class IntegerValueAspect extends ValueAspect {
	@OverrideAspectMethod
	def Value copy() {
		return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = _self.value]
	}
}

@Aspect(className=BooleanValue)
class BooleanValueAspect extends ValueAspect {
	@OverrideAspectMethod
	def Value copy() {
		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [value = _self.value]
	}
}

@Aspect(className=StringValue)
class StringValueAspect extends ValueAspect {
	@OverrideAspectMethod
	def Value copy() {
		return MinijavadynamicdataFactory::eINSTANCE.createStringValue => [value = _self.value]
	}

}

@Aspect(className=RefValue)
class RefValueAspect extends ValueAspect {
	@OverrideAspectMethod
	def Value copy() {
		return MinijavadynamicdataFactory::eINSTANCE.createRefValue => [instance = _self.instance]
	}
}
