package org.tetrabox.minijava.xminijava.adapters.xminijavamt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AndAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ArrayTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssigneeAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssignmentAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BoolConstantAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanValueAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.CallAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ContextAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.DivisionAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.EqualityAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAccessAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldBindingAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ForStatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FrameAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IfStatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ImportAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InequalityAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorOrEqualAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InstanceAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntConstantAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerValueAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InterfaceAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MemberAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCall2Adapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCallAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MinusAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MultiplicationAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NamedElementAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NegAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewCallAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NotAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullValueAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OrAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OutputStreamAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ParameterAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PlusAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PrintStatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ProgramAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.RefValueAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ReturnAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SingleTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StateAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringConstantAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringValueAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorOrEqualAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolBindingAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ThisAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeDeclarationAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypedDeclarationAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ValueAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VariableDeclarationAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VoidTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.WhileStatementAdapter;
import org.tetrabox.minijava.xminijava.miniJava.And;
import org.tetrabox.minijava.xminijava.miniJava.ArrayTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.Assignee;
import org.tetrabox.minijava.xminijava.miniJava.Assignment;
import org.tetrabox.minijava.xminijava.miniJava.Block;
import org.tetrabox.minijava.xminijava.miniJava.BoolConstant;
import org.tetrabox.minijava.xminijava.miniJava.BooleanTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.BooleanValue;
import org.tetrabox.minijava.xminijava.miniJava.Call;
import org.tetrabox.minijava.xminijava.miniJava.ClassRef;
import org.tetrabox.minijava.xminijava.miniJava.Context;
import org.tetrabox.minijava.xminijava.miniJava.Division;
import org.tetrabox.minijava.xminijava.miniJava.Equality;
import org.tetrabox.minijava.xminijava.miniJava.Expression;
import org.tetrabox.minijava.xminijava.miniJava.Field;
import org.tetrabox.minijava.xminijava.miniJava.FieldAccess;
import org.tetrabox.minijava.xminijava.miniJava.FieldBinding;
import org.tetrabox.minijava.xminijava.miniJava.ForStatement;
import org.tetrabox.minijava.xminijava.miniJava.Frame;
import org.tetrabox.minijava.xminijava.miniJava.IfStatement;
import org.tetrabox.minijava.xminijava.miniJava.Import;
import org.tetrabox.minijava.xminijava.miniJava.Inequality;
import org.tetrabox.minijava.xminijava.miniJava.Inferior;
import org.tetrabox.minijava.xminijava.miniJava.InferiorOrEqual;
import org.tetrabox.minijava.xminijava.miniJava.Instance;
import org.tetrabox.minijava.xminijava.miniJava.IntConstant;
import org.tetrabox.minijava.xminijava.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.IntegerValue;
import org.tetrabox.minijava.xminijava.miniJava.Interface;
import org.tetrabox.minijava.xminijava.miniJava.Member;
import org.tetrabox.minijava.xminijava.miniJava.Method;
import org.tetrabox.minijava.xminijava.miniJava.MethodCall;
import org.tetrabox.minijava.xminijava.miniJava.MethodCall2;
import org.tetrabox.minijava.xminijava.miniJava.Minus;
import org.tetrabox.minijava.xminijava.miniJava.Multiplication;
import org.tetrabox.minijava.xminijava.miniJava.NamedElement;
import org.tetrabox.minijava.xminijava.miniJava.Neg;
import org.tetrabox.minijava.xminijava.miniJava.New;
import org.tetrabox.minijava.xminijava.miniJava.NewCall;
import org.tetrabox.minijava.xminijava.miniJava.Not;
import org.tetrabox.minijava.xminijava.miniJava.Null;
import org.tetrabox.minijava.xminijava.miniJava.NullValue;
import org.tetrabox.minijava.xminijava.miniJava.Or;
import org.tetrabox.minijava.xminijava.miniJava.OutputStream;
import org.tetrabox.minijava.xminijava.miniJava.Parameter;
import org.tetrabox.minijava.xminijava.miniJava.Plus;
import org.tetrabox.minijava.xminijava.miniJava.PrintStatement;
import org.tetrabox.minijava.xminijava.miniJava.Program;
import org.tetrabox.minijava.xminijava.miniJava.RefValue;
import org.tetrabox.minijava.xminijava.miniJava.Return;
import org.tetrabox.minijava.xminijava.miniJava.SingleTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.State;
import org.tetrabox.minijava.xminijava.miniJava.Statement;
import org.tetrabox.minijava.xminijava.miniJava.StringConstant;
import org.tetrabox.minijava.xminijava.miniJava.StringTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.StringValue;
import org.tetrabox.minijava.xminijava.miniJava.Super;
import org.tetrabox.minijava.xminijava.miniJava.Superior;
import org.tetrabox.minijava.xminijava.miniJava.SuperiorOrEqual;
import org.tetrabox.minijava.xminijava.miniJava.Symbol;
import org.tetrabox.minijava.xminijava.miniJava.SymbolBinding;
import org.tetrabox.minijava.xminijava.miniJava.SymbolRef;
import org.tetrabox.minijava.xminijava.miniJava.This;
import org.tetrabox.minijava.xminijava.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xminijava.miniJava.TypeRef;
import org.tetrabox.minijava.xminijava.miniJava.TypedDeclaration;
import org.tetrabox.minijava.xminijava.miniJava.Value;
import org.tetrabox.minijava.xminijava.miniJava.VariableDeclaration;
import org.tetrabox.minijava.xminijava.miniJava.VoidTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.WhileStatement;

@SuppressWarnings("all")
public class XMiniJavaMTAdaptersFactory implements AdaptersFactory {
  private static XMiniJavaMTAdaptersFactory instance;
  
  public static XMiniJavaMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XMiniJavaMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Program){
    	return createProgramAdapter((org.tetrabox.minijava.xminijava.miniJava.Program) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Import){
    	return createImportAdapter((org.tetrabox.minijava.xminijava.miniJava.Import) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Class){
    	return createClassAdapter((org.tetrabox.minijava.xminijava.miniJava.Class) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Interface){
    	return createInterfaceAdapter((org.tetrabox.minijava.xminijava.miniJava.Interface) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.TypeDeclaration){
    	return createTypeDeclarationAdapter((org.tetrabox.minijava.xminijava.miniJava.TypeDeclaration) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Method){
    	return createMethodAdapter((org.tetrabox.minijava.xminijava.miniJava.Method) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Field){
    	return createFieldAdapter((org.tetrabox.minijava.xminijava.miniJava.Field) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Member){
    	return createMemberAdapter((org.tetrabox.minijava.xminijava.miniJava.Member) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Parameter){
    	return createParameterAdapter((org.tetrabox.minijava.xminijava.miniJava.Parameter) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Expression){
    	return createExpressionAdapter((org.tetrabox.minijava.xminijava.miniJava.Expression) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Block){
    	return createBlockAdapter((org.tetrabox.minijava.xminijava.miniJava.Block) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.PrintStatement){
    	return createPrintStatementAdapter((org.tetrabox.minijava.xminijava.miniJava.PrintStatement) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Return){
    	return createReturnAdapter((org.tetrabox.minijava.xminijava.miniJava.Return) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.IfStatement){
    	return createIfStatementAdapter((org.tetrabox.minijava.xminijava.miniJava.IfStatement) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.WhileStatement){
    	return createWhileStatementAdapter((org.tetrabox.minijava.xminijava.miniJava.WhileStatement) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.ForStatement){
    	return createForStatementAdapter((org.tetrabox.minijava.xminijava.miniJava.ForStatement) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Statement){
    	return createStatementAdapter((org.tetrabox.minijava.xminijava.miniJava.Statement) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.ClassRef){
    	return createClassRefAdapter((org.tetrabox.minijava.xminijava.miniJava.ClassRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.SingleTypeRef){
    	return createSingleTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.SingleTypeRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.VariableDeclaration){
    	return createVariableDeclarationAdapter((org.tetrabox.minijava.xminijava.miniJava.VariableDeclaration) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Symbol){
    	return createSymbolAdapter((org.tetrabox.minijava.xminijava.miniJava.Symbol) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.TypedDeclaration){
    	return createTypedDeclarationAdapter((org.tetrabox.minijava.xminijava.miniJava.TypedDeclaration) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.NamedElement){
    	return createNamedElementAdapter((org.tetrabox.minijava.xminijava.miniJava.NamedElement) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Assignment){
    	return createAssignmentAdapter((org.tetrabox.minijava.xminijava.miniJava.Assignment) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.And){
    	return createAndAdapter((org.tetrabox.minijava.xminijava.miniJava.And) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Inequality){
    	return createInequalityAdapter((org.tetrabox.minijava.xminijava.miniJava.Inequality) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Assignee){
    	return createAssigneeAdapter((org.tetrabox.minijava.xminijava.miniJava.Assignee) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.ArrayTypeRef){
    	return createArrayTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.ArrayTypeRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.IntegerTypeRef){
    	return createIntegerTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.IntegerTypeRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.BooleanTypeRef){
    	return createBooleanTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.BooleanTypeRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.StringTypeRef){
    	return createStringTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.StringTypeRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.VoidTypeRef){
    	return createVoidTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.VoidTypeRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.TypeRef){
    	return createTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.TypeRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Or){
    	return createOrAdapter((org.tetrabox.minijava.xminijava.miniJava.Or) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Equality){
    	return createEqualityAdapter((org.tetrabox.minijava.xminijava.miniJava.Equality) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.SuperiorOrEqual){
    	return createSuperiorOrEqualAdapter((org.tetrabox.minijava.xminijava.miniJava.SuperiorOrEqual) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.InferiorOrEqual){
    	return createInferiorOrEqualAdapter((org.tetrabox.minijava.xminijava.miniJava.InferiorOrEqual) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Superior){
    	return createSuperiorAdapter((org.tetrabox.minijava.xminijava.miniJava.Superior) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Inferior){
    	return createInferiorAdapter((org.tetrabox.minijava.xminijava.miniJava.Inferior) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Plus){
    	return createPlusAdapter((org.tetrabox.minijava.xminijava.miniJava.Plus) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Minus){
    	return createMinusAdapter((org.tetrabox.minijava.xminijava.miniJava.Minus) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Multiplication){
    	return createMultiplicationAdapter((org.tetrabox.minijava.xminijava.miniJava.Multiplication) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Division){
    	return createDivisionAdapter((org.tetrabox.minijava.xminijava.miniJava.Division) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Not){
    	return createNotAdapter((org.tetrabox.minijava.xminijava.miniJava.Not) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Neg){
    	return createNegAdapter((org.tetrabox.minijava.xminijava.miniJava.Neg) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.FieldAccess){
    	return createFieldAccessAdapter((org.tetrabox.minijava.xminijava.miniJava.FieldAccess) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.MethodCall){
    	return createMethodCallAdapter((org.tetrabox.minijava.xminijava.miniJava.MethodCall) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.StringConstant){
    	return createStringConstantAdapter((org.tetrabox.minijava.xminijava.miniJava.StringConstant) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.IntConstant){
    	return createIntConstantAdapter((org.tetrabox.minijava.xminijava.miniJava.IntConstant) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.BoolConstant){
    	return createBoolConstantAdapter((org.tetrabox.minijava.xminijava.miniJava.BoolConstant) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.This){
    	return createThisAdapter((org.tetrabox.minijava.xminijava.miniJava.This) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Super){
    	return createSuperAdapter((org.tetrabox.minijava.xminijava.miniJava.Super) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Null){
    	return createNullAdapter((org.tetrabox.minijava.xminijava.miniJava.Null) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.New){
    	return createNewAdapter((org.tetrabox.minijava.xminijava.miniJava.New) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.SymbolRef){
    	return createSymbolRefAdapter((org.tetrabox.minijava.xminijava.miniJava.SymbolRef) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Context){
    	return createContextAdapter((org.tetrabox.minijava.xminijava.miniJava.Context) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.IntegerValue){
    	return createIntegerValueAdapter((org.tetrabox.minijava.xminijava.miniJava.IntegerValue) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Instance){
    	return createInstanceAdapter((org.tetrabox.minijava.xminijava.miniJava.Instance) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.SymbolBinding){
    	return createSymbolBindingAdapter((org.tetrabox.minijava.xminijava.miniJava.SymbolBinding) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.FieldBinding){
    	return createFieldBindingAdapter((org.tetrabox.minijava.xminijava.miniJava.FieldBinding) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.StringValue){
    	return createStringValueAdapter((org.tetrabox.minijava.xminijava.miniJava.StringValue) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.BooleanValue){
    	return createBooleanValueAdapter((org.tetrabox.minijava.xminijava.miniJava.BooleanValue) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.OutputStream){
    	return createOutputStreamAdapter((org.tetrabox.minijava.xminijava.miniJava.OutputStream) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.RefValue){
    	return createRefValueAdapter((org.tetrabox.minijava.xminijava.miniJava.RefValue) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.State){
    	return createStateAdapter((org.tetrabox.minijava.xminijava.miniJava.State) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Frame){
    	return createFrameAdapter((org.tetrabox.minijava.xminijava.miniJava.Frame) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.NullValue){
    	return createNullValueAdapter((org.tetrabox.minijava.xminijava.miniJava.NullValue) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Value){
    	return createValueAdapter((org.tetrabox.minijava.xminijava.miniJava.Value) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.NewCall){
    	return createNewCallAdapter((org.tetrabox.minijava.xminijava.miniJava.NewCall) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.MethodCall2){
    	return createMethodCall2Adapter((org.tetrabox.minijava.xminijava.miniJava.MethodCall2) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Call){
    	return createCallAdapter((org.tetrabox.minijava.xminijava.miniJava.Call) o, res);
    }
    
    return null;
  }
  
  public ProgramAdapter createProgramAdapter(final Program adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ProgramAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ProgramAdapter) adapter;
    }
  }
  
  public ImportAdapter createImportAdapter(final Import adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ImportAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ImportAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ImportAdapter) adapter;
    }
  }
  
  public TypeDeclarationAdapter createTypeDeclarationAdapter(final TypeDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeDeclarationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeDeclarationAdapter) adapter;
    }
  }
  
  public ClassAdapter createClassAdapter(final org.tetrabox.minijava.xminijava.miniJava.Class adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassAdapter) adapter;
    }
  }
  
  public InterfaceAdapter createInterfaceAdapter(final Interface adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InterfaceAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InterfaceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InterfaceAdapter) adapter;
    }
  }
  
  public MemberAdapter createMemberAdapter(final Member adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MemberAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MemberAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MemberAdapter) adapter;
    }
  }
  
  public MethodAdapter createMethodAdapter(final Method adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodAdapter) adapter;
    }
  }
  
  public ParameterAdapter createParameterAdapter(final Parameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ParameterAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ParameterAdapter) adapter;
    }
  }
  
  public FieldAdapter createFieldAdapter(final Field adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ExpressionAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BlockAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StatementAdapter) adapter;
    }
  }
  
  public PrintStatementAdapter createPrintStatementAdapter(final PrintStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PrintStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PrintStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PrintStatementAdapter) adapter;
    }
  }
  
  public ReturnAdapter createReturnAdapter(final Return adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ReturnAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ReturnAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ReturnAdapter) adapter;
    }
  }
  
  public IfStatementAdapter createIfStatementAdapter(final IfStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IfStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IfStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IfStatementAdapter) adapter;
    }
  }
  
  public WhileStatementAdapter createWhileStatementAdapter(final WhileStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.WhileStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.WhileStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.WhileStatementAdapter) adapter;
    }
  }
  
  public ForStatementAdapter createForStatementAdapter(final ForStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ForStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ForStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ForStatementAdapter) adapter;
    }
  }
  
  public TypeRefAdapter createTypeRefAdapter(final TypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypeRefAdapter) adapter;
    }
  }
  
  public SingleTypeRefAdapter createSingleTypeRefAdapter(final SingleTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SingleTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SingleTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SingleTypeRefAdapter) adapter;
    }
  }
  
  public ClassRefAdapter createClassRefAdapter(final ClassRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ClassRefAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NamedElementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NamedElementAdapter) adapter;
    }
  }
  
  public TypedDeclarationAdapter createTypedDeclarationAdapter(final TypedDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypedDeclarationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypedDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.TypedDeclarationAdapter) adapter;
    }
  }
  
  public SymbolAdapter createSymbolAdapter(final Symbol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolAdapter) adapter;
    }
  }
  
  public VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VariableDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VariableDeclarationAdapter) adapter;
    }
  }
  
  public AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssignmentAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssignmentAdapter) adapter;
    }
  }
  
  public AssigneeAdapter createAssigneeAdapter(final Assignee adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssigneeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssigneeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AssigneeAdapter) adapter;
    }
  }
  
  public ArrayTypeRefAdapter createArrayTypeRefAdapter(final ArrayTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ArrayTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ArrayTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ArrayTypeRefAdapter) adapter;
    }
  }
  
  public IntegerTypeRefAdapter createIntegerTypeRefAdapter(final IntegerTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerTypeRefAdapter) adapter;
    }
  }
  
  public BooleanTypeRefAdapter createBooleanTypeRefAdapter(final BooleanTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanTypeRefAdapter) adapter;
    }
  }
  
  public StringTypeRefAdapter createStringTypeRefAdapter(final StringTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringTypeRefAdapter) adapter;
    }
  }
  
  public VoidTypeRefAdapter createVoidTypeRefAdapter(final VoidTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VoidTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VoidTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.VoidTypeRefAdapter) adapter;
    }
  }
  
  public OrAdapter createOrAdapter(final Or adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OrAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OrAdapter) adapter;
    }
  }
  
  public AndAdapter createAndAdapter(final And adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AndAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.AndAdapter) adapter;
    }
  }
  
  public EqualityAdapter createEqualityAdapter(final Equality adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.EqualityAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.EqualityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.EqualityAdapter) adapter;
    }
  }
  
  public InequalityAdapter createInequalityAdapter(final Inequality adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InequalityAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InequalityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InequalityAdapter) adapter;
    }
  }
  
  public SuperiorOrEqualAdapter createSuperiorOrEqualAdapter(final SuperiorOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorOrEqualAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorOrEqualAdapter) adapter;
    }
  }
  
  public InferiorOrEqualAdapter createInferiorOrEqualAdapter(final InferiorOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorOrEqualAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorOrEqualAdapter) adapter;
    }
  }
  
  public SuperiorAdapter createSuperiorAdapter(final Superior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperiorAdapter) adapter;
    }
  }
  
  public InferiorAdapter createInferiorAdapter(final Inferior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InferiorAdapter) adapter;
    }
  }
  
  public PlusAdapter createPlusAdapter(final Plus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PlusAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PlusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.PlusAdapter) adapter;
    }
  }
  
  public MinusAdapter createMinusAdapter(final Minus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MinusAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MinusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MinusAdapter) adapter;
    }
  }
  
  public MultiplicationAdapter createMultiplicationAdapter(final Multiplication adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MultiplicationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MultiplicationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MultiplicationAdapter) adapter;
    }
  }
  
  public DivisionAdapter createDivisionAdapter(final Division adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.DivisionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.DivisionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.DivisionAdapter) adapter;
    }
  }
  
  public NotAdapter createNotAdapter(final Not adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NotAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NotAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NotAdapter) adapter;
    }
  }
  
  public NegAdapter createNegAdapter(final Neg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NegAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NegAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NegAdapter) adapter;
    }
  }
  
  public FieldAccessAdapter createFieldAccessAdapter(final FieldAccess adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAccessAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAccessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldAccessAdapter) adapter;
    }
  }
  
  public MethodCallAdapter createMethodCallAdapter(final MethodCall adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCallAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCallAdapter) adapter;
    }
  }
  
  public StringConstantAdapter createStringConstantAdapter(final StringConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringConstantAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringConstantAdapter) adapter;
    }
  }
  
  public IntConstantAdapter createIntConstantAdapter(final IntConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntConstantAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntConstantAdapter) adapter;
    }
  }
  
  public BoolConstantAdapter createBoolConstantAdapter(final BoolConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BoolConstantAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BoolConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BoolConstantAdapter) adapter;
    }
  }
  
  public ThisAdapter createThisAdapter(final This adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ThisAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ThisAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ThisAdapter) adapter;
    }
  }
  
  public SuperAdapter createSuperAdapter(final Super adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SuperAdapter) adapter;
    }
  }
  
  public NullAdapter createNullAdapter(final Null adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullAdapter) adapter;
    }
  }
  
  public NewAdapter createNewAdapter(final New adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewAdapter) adapter;
    }
  }
  
  public SymbolRefAdapter createSymbolRefAdapter(final SymbolRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolRefAdapter) adapter;
    }
  }
  
  public ContextAdapter createContextAdapter(final Context adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ContextAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ContextAdapter) adapter;
    }
  }
  
  public ValueAdapter createValueAdapter(final Value adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.ValueAdapter) adapter;
    }
  }
  
  public IntegerValueAdapter createIntegerValueAdapter(final IntegerValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.IntegerValueAdapter) adapter;
    }
  }
  
  public InstanceAdapter createInstanceAdapter(final Instance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InstanceAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.InstanceAdapter) adapter;
    }
  }
  
  public SymbolBindingAdapter createSymbolBindingAdapter(final SymbolBinding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolBindingAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolBindingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.SymbolBindingAdapter) adapter;
    }
  }
  
  public FieldBindingAdapter createFieldBindingAdapter(final FieldBinding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldBindingAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldBindingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FieldBindingAdapter) adapter;
    }
  }
  
  public StringValueAdapter createStringValueAdapter(final StringValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StringValueAdapter) adapter;
    }
  }
  
  public BooleanValueAdapter createBooleanValueAdapter(final BooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.BooleanValueAdapter) adapter;
    }
  }
  
  public OutputStreamAdapter createOutputStreamAdapter(final OutputStream adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OutputStreamAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OutputStreamAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.OutputStreamAdapter) adapter;
    }
  }
  
  public RefValueAdapter createRefValueAdapter(final RefValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.RefValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.RefValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.RefValueAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StateAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.StateAdapter) adapter;
    }
  }
  
  public FrameAdapter createFrameAdapter(final Frame adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FrameAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FrameAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.FrameAdapter) adapter;
    }
  }
  
  public NullValueAdapter createNullValueAdapter(final NullValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullValueAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NullValueAdapter) adapter;
    }
  }
  
  public CallAdapter createCallAdapter(final Call adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.CallAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.CallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.CallAdapter) adapter;
    }
  }
  
  public NewCallAdapter createNewCallAdapter(final NewCall adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewCallAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewCallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.NewCallAdapter) adapter;
    }
  }
  
  public MethodCall2Adapter createMethodCall2Adapter(final MethodCall2 adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCall2Adapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCall2Adapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.xminijavamt.miniJava.MethodCall2Adapter) adapter;
    }
  }
}
