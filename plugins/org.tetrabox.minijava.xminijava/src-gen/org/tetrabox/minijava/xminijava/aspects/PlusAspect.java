package org.tetrabox.minijava.xminijava.aspects;

import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.miniJava.IntegerValue;
import org.tetrabox.minijava.xminijava.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijava.miniJava.State;
import org.tetrabox.minijava.xminijava.miniJava.StringValue;
import org.tetrabox.minijava.xminijava.miniJava.Value;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.PlusAspectPlusAspectProperties;
import org.tetrabox.minijava.xminijava.aspects.ValueToStringAspect;
import org.tetrabox.minijava.xminijava.miniJava.Plus;

@Aspect(className = Plus.class)
@SuppressWarnings("all")
public class PlusAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Plus _self, final State state) {
	final org.tetrabox.minijava.xminijava.aspects.PlusAspectPlusAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.PlusAspectPlusAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluateExpression(_self_, _self, state);
	;
	return (org.tetrabox.minijava.xminijava.miniJava.Value) result;
}
  
  private static Value super_evaluateExpression(final Plus _self, final State state) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final PlusAspectPlusAspectProperties _self_, final Plus _self, final State state) {
    final Value left = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final Value right = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    final Set<Value> expressions = Collections.<Value>unmodifiableSet(CollectionLiterals.<Value>newHashSet(left, right));
    final StringValue stringExpression = IterableExtensions.<StringValue>head(Iterables.<StringValue>filter(expressions, StringValue.class));
    final IntegerValue intExpression = IterableExtensions.<IntegerValue>head(Iterables.<IntegerValue>filter(expressions, IntegerValue.class));
    if ((stringExpression != null)) {
      final Function1<Value, Boolean> _function = (Value it) -> {
        return Boolean.valueOf((it != stringExpression));
      };
      final Value otherExpr = IterableExtensions.<Value>findFirst(expressions, _function);
      StringValue _createStringValue = MiniJavaFactory.eINSTANCE.createStringValue();
      final Procedure1<StringValue> _function_1 = (StringValue it) -> {
        String _xifexpression = null;
        if ((left == stringExpression)) {
          String _customToString = ValueToStringAspect.customToString(stringExpression);
          String _customToString_1 = ValueToStringAspect.customToString(otherExpr);
          _xifexpression = (_customToString + _customToString_1);
        } else {
          String _customToString_2 = ValueToStringAspect.customToString(otherExpr);
          String _customToString_3 = ValueToStringAspect.customToString(stringExpression);
          _xifexpression = (_customToString_2 + _customToString_3);
        }
        it.setValue(_xifexpression);
      };
      return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function_1);
    } else {
      if ((intExpression != null)) {
        final Function1<Value, Boolean> _function_2 = (Value it) -> {
          return Boolean.valueOf((it != intExpression));
        };
        final Value otherExpr_1 = IterableExtensions.<Value>findFirst(expressions, _function_2);
        if ((otherExpr_1 instanceof IntegerValue)) {
          IntegerValue _createIntegerValue = MiniJavaFactory.eINSTANCE.createIntegerValue();
          final Procedure1<IntegerValue> _function_3 = (IntegerValue it) -> {
            int _value = intExpression.getValue();
            int _value_1 = ((IntegerValue)otherExpr_1).getValue();
            int _plus = (_value + _value_1);
            it.setValue(_plus);
          };
          return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function_3);
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Unsupported plus operands: ");
    _builder.append(left);
    _builder.append(" + ");
    _builder.append(right);
    _builder.append(".");
    throw new RuntimeException(_builder.toString());
  }
}
