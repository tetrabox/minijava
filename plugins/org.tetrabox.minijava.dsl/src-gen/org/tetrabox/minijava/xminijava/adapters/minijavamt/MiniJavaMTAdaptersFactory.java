package org.tetrabox.minijava.xminijava.adapters.minijavamt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AndAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ArrayTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssigneeAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssignmentAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BlockAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BoolConstantAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BooleanTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.DivisionAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.EqualityAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAccessAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ForStatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IfStatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ImportAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InequalityAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorOrEqualAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntConstantAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntegerTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InterfaceAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MemberAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodCallAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MinusAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MultiplicationAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NamedElementAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NegAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NewAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NotAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NullAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.OrAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ParameterAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PlusAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PrintStatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ProgramAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ReturnAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SingleTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StatementAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringConstantAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorOrEqualAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ThisAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeDeclarationAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypedDeclarationAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VariableDeclarationAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VoidTypeRefAdapter;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.WhileStatementAdapter;
import org.tetrabox.minijava.xminijava.miniJava.And;
import org.tetrabox.minijava.xminijava.miniJava.ArrayTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.Assignee;
import org.tetrabox.minijava.xminijava.miniJava.Assignment;
import org.tetrabox.minijava.xminijava.miniJava.Block;
import org.tetrabox.minijava.xminijava.miniJava.BoolConstant;
import org.tetrabox.minijava.xminijava.miniJava.BooleanTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.ClassRef;
import org.tetrabox.minijava.xminijava.miniJava.Division;
import org.tetrabox.minijava.xminijava.miniJava.Equality;
import org.tetrabox.minijava.xminijava.miniJava.Expression;
import org.tetrabox.minijava.xminijava.miniJava.Field;
import org.tetrabox.minijava.xminijava.miniJava.FieldAccess;
import org.tetrabox.minijava.xminijava.miniJava.ForStatement;
import org.tetrabox.minijava.xminijava.miniJava.IfStatement;
import org.tetrabox.minijava.xminijava.miniJava.Import;
import org.tetrabox.minijava.xminijava.miniJava.Inequality;
import org.tetrabox.minijava.xminijava.miniJava.Inferior;
import org.tetrabox.minijava.xminijava.miniJava.InferiorOrEqual;
import org.tetrabox.minijava.xminijava.miniJava.IntConstant;
import org.tetrabox.minijava.xminijava.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.Interface;
import org.tetrabox.minijava.xminijava.miniJava.Member;
import org.tetrabox.minijava.xminijava.miniJava.Method;
import org.tetrabox.minijava.xminijava.miniJava.MethodCall;
import org.tetrabox.minijava.xminijava.miniJava.Minus;
import org.tetrabox.minijava.xminijava.miniJava.Multiplication;
import org.tetrabox.minijava.xminijava.miniJava.NamedElement;
import org.tetrabox.minijava.xminijava.miniJava.Neg;
import org.tetrabox.minijava.xminijava.miniJava.New;
import org.tetrabox.minijava.xminijava.miniJava.Not;
import org.tetrabox.minijava.xminijava.miniJava.Null;
import org.tetrabox.minijava.xminijava.miniJava.Or;
import org.tetrabox.minijava.xminijava.miniJava.Parameter;
import org.tetrabox.minijava.xminijava.miniJava.Plus;
import org.tetrabox.minijava.xminijava.miniJava.PrintStatement;
import org.tetrabox.minijava.xminijava.miniJava.Program;
import org.tetrabox.minijava.xminijava.miniJava.Return;
import org.tetrabox.minijava.xminijava.miniJava.SingleTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.Statement;
import org.tetrabox.minijava.xminijava.miniJava.StringConstant;
import org.tetrabox.minijava.xminijava.miniJava.StringTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.Super;
import org.tetrabox.minijava.xminijava.miniJava.Superior;
import org.tetrabox.minijava.xminijava.miniJava.SuperiorOrEqual;
import org.tetrabox.minijava.xminijava.miniJava.Symbol;
import org.tetrabox.minijava.xminijava.miniJava.SymbolRef;
import org.tetrabox.minijava.xminijava.miniJava.This;
import org.tetrabox.minijava.xminijava.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xminijava.miniJava.TypeRef;
import org.tetrabox.minijava.xminijava.miniJava.TypedDeclaration;
import org.tetrabox.minijava.xminijava.miniJava.VariableDeclaration;
import org.tetrabox.minijava.xminijava.miniJava.VoidTypeRef;
import org.tetrabox.minijava.xminijava.miniJava.WhileStatement;

@SuppressWarnings("all")
public class MiniJavaMTAdaptersFactory implements AdaptersFactory {
  private static MiniJavaMTAdaptersFactory instance;
  
  public static MiniJavaMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MiniJavaMTAdaptersFactory() {
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
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.TypeRef){
    	return createTypeRefAdapter((org.tetrabox.minijava.xminijava.miniJava.TypeRef) o, res);
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
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Or){
    	return createOrAdapter((org.tetrabox.minijava.xminijava.miniJava.Or) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.And){
    	return createAndAdapter((org.tetrabox.minijava.xminijava.miniJava.And) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Equality){
    	return createEqualityAdapter((org.tetrabox.minijava.xminijava.miniJava.Equality) o, res);
    }
    if (o instanceof org.tetrabox.minijava.xminijava.miniJava.Inequality){
    	return createInequalityAdapter((org.tetrabox.minijava.xminijava.miniJava.Inequality) o, res);
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
    
    return null;
  }
  
  public ProgramAdapter createProgramAdapter(final Program adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ProgramAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ProgramAdapter) adapter;
    }
  }
  
  public ImportAdapter createImportAdapter(final Import adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ImportAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ImportAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ImportAdapter) adapter;
    }
  }
  
  public TypeDeclarationAdapter createTypeDeclarationAdapter(final TypeDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeDeclarationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeDeclarationAdapter) adapter;
    }
  }
  
  public ClassAdapter createClassAdapter(final org.tetrabox.minijava.xminijava.miniJava.Class adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassAdapter) adapter;
    }
  }
  
  public InterfaceAdapter createInterfaceAdapter(final Interface adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InterfaceAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InterfaceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InterfaceAdapter) adapter;
    }
  }
  
  public MemberAdapter createMemberAdapter(final Member adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MemberAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MemberAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MemberAdapter) adapter;
    }
  }
  
  public MethodAdapter createMethodAdapter(final Method adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodAdapter) adapter;
    }
  }
  
  public ParameterAdapter createParameterAdapter(final Parameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ParameterAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ParameterAdapter) adapter;
    }
  }
  
  public FieldAdapter createFieldAdapter(final Field adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ExpressionAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BlockAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BlockAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StatementAdapter) adapter;
    }
  }
  
  public PrintStatementAdapter createPrintStatementAdapter(final PrintStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PrintStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PrintStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PrintStatementAdapter) adapter;
    }
  }
  
  public ReturnAdapter createReturnAdapter(final Return adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ReturnAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ReturnAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ReturnAdapter) adapter;
    }
  }
  
  public IfStatementAdapter createIfStatementAdapter(final IfStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IfStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IfStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IfStatementAdapter) adapter;
    }
  }
  
  public WhileStatementAdapter createWhileStatementAdapter(final WhileStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.WhileStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.WhileStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.WhileStatementAdapter) adapter;
    }
  }
  
  public ForStatementAdapter createForStatementAdapter(final ForStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ForStatementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ForStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ForStatementAdapter) adapter;
    }
  }
  
  public TypeRefAdapter createTypeRefAdapter(final TypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypeRefAdapter) adapter;
    }
  }
  
  public SingleTypeRefAdapter createSingleTypeRefAdapter(final SingleTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SingleTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SingleTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SingleTypeRefAdapter) adapter;
    }
  }
  
  public ClassRefAdapter createClassRefAdapter(final ClassRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ClassRefAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NamedElementAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NamedElementAdapter) adapter;
    }
  }
  
  public TypedDeclarationAdapter createTypedDeclarationAdapter(final TypedDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypedDeclarationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypedDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.TypedDeclarationAdapter) adapter;
    }
  }
  
  public SymbolAdapter createSymbolAdapter(final Symbol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolAdapter) adapter;
    }
  }
  
  public VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VariableDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VariableDeclarationAdapter) adapter;
    }
  }
  
  public AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssignmentAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssignmentAdapter) adapter;
    }
  }
  
  public AssigneeAdapter createAssigneeAdapter(final Assignee adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssigneeAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssigneeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AssigneeAdapter) adapter;
    }
  }
  
  public ArrayTypeRefAdapter createArrayTypeRefAdapter(final ArrayTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ArrayTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ArrayTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ArrayTypeRefAdapter) adapter;
    }
  }
  
  public IntegerTypeRefAdapter createIntegerTypeRefAdapter(final IntegerTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntegerTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntegerTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntegerTypeRefAdapter) adapter;
    }
  }
  
  public BooleanTypeRefAdapter createBooleanTypeRefAdapter(final BooleanTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BooleanTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BooleanTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BooleanTypeRefAdapter) adapter;
    }
  }
  
  public StringTypeRefAdapter createStringTypeRefAdapter(final StringTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringTypeRefAdapter) adapter;
    }
  }
  
  public VoidTypeRefAdapter createVoidTypeRefAdapter(final VoidTypeRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VoidTypeRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VoidTypeRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.VoidTypeRefAdapter) adapter;
    }
  }
  
  public OrAdapter createOrAdapter(final Or adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.OrAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.OrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.OrAdapter) adapter;
    }
  }
  
  public AndAdapter createAndAdapter(final And adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AndAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.AndAdapter) adapter;
    }
  }
  
  public EqualityAdapter createEqualityAdapter(final Equality adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.EqualityAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.EqualityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.EqualityAdapter) adapter;
    }
  }
  
  public InequalityAdapter createInequalityAdapter(final Inequality adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InequalityAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InequalityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InequalityAdapter) adapter;
    }
  }
  
  public SuperiorOrEqualAdapter createSuperiorOrEqualAdapter(final SuperiorOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorOrEqualAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorOrEqualAdapter) adapter;
    }
  }
  
  public InferiorOrEqualAdapter createInferiorOrEqualAdapter(final InferiorOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorOrEqualAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorOrEqualAdapter) adapter;
    }
  }
  
  public SuperiorAdapter createSuperiorAdapter(final Superior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperiorAdapter) adapter;
    }
  }
  
  public InferiorAdapter createInferiorAdapter(final Inferior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.InferiorAdapter) adapter;
    }
  }
  
  public PlusAdapter createPlusAdapter(final Plus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PlusAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PlusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.PlusAdapter) adapter;
    }
  }
  
  public MinusAdapter createMinusAdapter(final Minus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MinusAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MinusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MinusAdapter) adapter;
    }
  }
  
  public MultiplicationAdapter createMultiplicationAdapter(final Multiplication adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MultiplicationAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MultiplicationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MultiplicationAdapter) adapter;
    }
  }
  
  public DivisionAdapter createDivisionAdapter(final Division adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.DivisionAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.DivisionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.DivisionAdapter) adapter;
    }
  }
  
  public NotAdapter createNotAdapter(final Not adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NotAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NotAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NotAdapter) adapter;
    }
  }
  
  public NegAdapter createNegAdapter(final Neg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NegAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NegAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NegAdapter) adapter;
    }
  }
  
  public FieldAccessAdapter createFieldAccessAdapter(final FieldAccess adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAccessAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAccessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.FieldAccessAdapter) adapter;
    }
  }
  
  public MethodCallAdapter createMethodCallAdapter(final MethodCall adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodCallAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodCallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.MethodCallAdapter) adapter;
    }
  }
  
  public StringConstantAdapter createStringConstantAdapter(final StringConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringConstantAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.StringConstantAdapter) adapter;
    }
  }
  
  public IntConstantAdapter createIntConstantAdapter(final IntConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntConstantAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.IntConstantAdapter) adapter;
    }
  }
  
  public BoolConstantAdapter createBoolConstantAdapter(final BoolConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BoolConstantAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BoolConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.BoolConstantAdapter) adapter;
    }
  }
  
  public ThisAdapter createThisAdapter(final This adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ThisAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ThisAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.ThisAdapter) adapter;
    }
  }
  
  public SuperAdapter createSuperAdapter(final Super adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SuperAdapter) adapter;
    }
  }
  
  public NullAdapter createNullAdapter(final Null adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NullAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NullAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NullAdapter) adapter;
    }
  }
  
  public NewAdapter createNewAdapter(final New adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NewAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NewAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.NewAdapter) adapter;
    }
  }
  
  public SymbolRefAdapter createSymbolRefAdapter(final SymbolRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolRefAdapter) adapter;
    else {
    	adapter = new org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava.SymbolRefAdapter) adapter;
    }
  }
}
