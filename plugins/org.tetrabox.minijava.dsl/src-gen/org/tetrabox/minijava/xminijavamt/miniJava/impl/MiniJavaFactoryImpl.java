/**
 */
package org.tetrabox.minijava.xminijavamt.miniJava.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.minijava.xminijavamt.miniJava.AccessLevel;
import org.tetrabox.minijava.xminijavamt.miniJava.And;
import org.tetrabox.minijava.xminijavamt.miniJava.ArrayAccess;
import org.tetrabox.minijava.xminijavamt.miniJava.ArrayInstance;
import org.tetrabox.minijava.xminijavamt.miniJava.ArrayLength;
import org.tetrabox.minijava.xminijavamt.miniJava.ArrayRefValue;
import org.tetrabox.minijava.xminijavamt.miniJava.ArrayTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.Assignee;
import org.tetrabox.minijava.xminijavamt.miniJava.Assignment;
import org.tetrabox.minijava.xminijavamt.miniJava.Block;
import org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.BooleanTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.BooleanValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Call;
import org.tetrabox.minijava.xminijavamt.miniJava.ClassRef;
import org.tetrabox.minijava.xminijavamt.miniJava.Context;
import org.tetrabox.minijava.xminijavamt.miniJava.Division;
import org.tetrabox.minijava.xminijavamt.miniJava.Equality;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.Field;
import org.tetrabox.minijava.xminijavamt.miniJava.FieldAccess;
import org.tetrabox.minijava.xminijavamt.miniJava.FieldBinding;
import org.tetrabox.minijava.xminijavamt.miniJava.ForStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Frame;
import org.tetrabox.minijava.xminijavamt.miniJava.IfStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Import;
import org.tetrabox.minijava.xminijavamt.miniJava.Inequality;
import org.tetrabox.minijava.xminijavamt.miniJava.Inferior;
import org.tetrabox.minijava.xminijavamt.miniJava.InferiorOrEqual;
import org.tetrabox.minijava.xminijavamt.miniJava.IntConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.IntegerValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Interface;
import org.tetrabox.minijava.xminijavamt.miniJava.Member;
import org.tetrabox.minijava.xminijavamt.miniJava.Method;
import org.tetrabox.minijava.xminijavamt.miniJava.MethodCall;
import org.tetrabox.minijava.xminijavamt.miniJava.MethodCall2;
import org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xminijavamt.miniJava.Minus;
import org.tetrabox.minijava.xminijavamt.miniJava.Multiplication;
import org.tetrabox.minijava.xminijavamt.miniJava.NamedElement;
import org.tetrabox.minijava.xminijavamt.miniJava.Neg;
import org.tetrabox.minijava.xminijavamt.miniJava.NewArray;
import org.tetrabox.minijava.xminijavamt.miniJava.NewCall;
import org.tetrabox.minijava.xminijavamt.miniJava.NewObject;
import org.tetrabox.minijava.xminijavamt.miniJava.Not;
import org.tetrabox.minijava.xminijavamt.miniJava.Null;
import org.tetrabox.minijava.xminijavamt.miniJava.NullValue;
import org.tetrabox.minijava.xminijavamt.miniJava.ObjectInstance;
import org.tetrabox.minijava.xminijavamt.miniJava.ObjectRefValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Or;
import org.tetrabox.minijava.xminijavamt.miniJava.OutputStream;
import org.tetrabox.minijava.xminijavamt.miniJava.Parameter;
import org.tetrabox.minijava.xminijavamt.miniJava.Plus;
import org.tetrabox.minijava.xminijavamt.miniJava.PrintStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Program;
import org.tetrabox.minijava.xminijavamt.miniJava.Return;
import org.tetrabox.minijava.xminijavamt.miniJava.SingleTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Statement;
import org.tetrabox.minijava.xminijavamt.miniJava.StringConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.StringTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.StringValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Super;
import org.tetrabox.minijava.xminijavamt.miniJava.Superior;
import org.tetrabox.minijava.xminijavamt.miniJava.SuperiorOrEqual;
import org.tetrabox.minijava.xminijavamt.miniJava.Symbol;
import org.tetrabox.minijava.xminijavamt.miniJava.SymbolBinding;
import org.tetrabox.minijava.xminijavamt.miniJava.SymbolRef;
import org.tetrabox.minijava.xminijavamt.miniJava.This;
import org.tetrabox.minijava.xminijavamt.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xminijavamt.miniJava.TypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.TypedDeclaration;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;
import org.tetrabox.minijava.xminijavamt.miniJava.VariableDeclaration;
import org.tetrabox.minijava.xminijavamt.miniJava.VoidTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniJavaFactoryImpl extends EFactoryImpl implements MiniJavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiniJavaFactory init() {
		try {
			MiniJavaFactory theMiniJavaFactory = (MiniJavaFactory)EPackage.Registry.INSTANCE.getEFactory(MiniJavaPackage.eNS_URI);
			if (theMiniJavaFactory != null) {
				return theMiniJavaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiniJavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniJavaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MiniJavaPackage.PROGRAM: return createProgram();
			case MiniJavaPackage.IMPORT: return createImport();
			case MiniJavaPackage.TYPE_DECLARATION: return createTypeDeclaration();
			case MiniJavaPackage.CLASS: return createClass();
			case MiniJavaPackage.INTERFACE: return createInterface();
			case MiniJavaPackage.MEMBER: return createMember();
			case MiniJavaPackage.METHOD: return createMethod();
			case MiniJavaPackage.PARAMETER: return createParameter();
			case MiniJavaPackage.FIELD: return createField();
			case MiniJavaPackage.BLOCK: return createBlock();
			case MiniJavaPackage.STATEMENT: return createStatement();
			case MiniJavaPackage.PRINT_STATEMENT: return createPrintStatement();
			case MiniJavaPackage.RETURN: return createReturn();
			case MiniJavaPackage.IF_STATEMENT: return createIfStatement();
			case MiniJavaPackage.WHILE_STATEMENT: return createWhileStatement();
			case MiniJavaPackage.FOR_STATEMENT: return createForStatement();
			case MiniJavaPackage.TYPE_REF: return createTypeRef();
			case MiniJavaPackage.SINGLE_TYPE_REF: return createSingleTypeRef();
			case MiniJavaPackage.CLASS_REF: return createClassRef();
			case MiniJavaPackage.NAMED_ELEMENT: return createNamedElement();
			case MiniJavaPackage.TYPED_DECLARATION: return createTypedDeclaration();
			case MiniJavaPackage.SYMBOL: return createSymbol();
			case MiniJavaPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case MiniJavaPackage.ASSIGNMENT: return createAssignment();
			case MiniJavaPackage.ASSIGNEE: return createAssignee();
			case MiniJavaPackage.EXPRESSION: return createExpression();
			case MiniJavaPackage.ARRAY_TYPE_REF: return createArrayTypeRef();
			case MiniJavaPackage.INTEGER_TYPE_REF: return createIntegerTypeRef();
			case MiniJavaPackage.BOOLEAN_TYPE_REF: return createBooleanTypeRef();
			case MiniJavaPackage.STRING_TYPE_REF: return createStringTypeRef();
			case MiniJavaPackage.VOID_TYPE_REF: return createVoidTypeRef();
			case MiniJavaPackage.OR: return createOr();
			case MiniJavaPackage.AND: return createAnd();
			case MiniJavaPackage.EQUALITY: return createEquality();
			case MiniJavaPackage.INEQUALITY: return createInequality();
			case MiniJavaPackage.SUPERIOR_OR_EQUAL: return createSuperiorOrEqual();
			case MiniJavaPackage.INFERIOR_OR_EQUAL: return createInferiorOrEqual();
			case MiniJavaPackage.SUPERIOR: return createSuperior();
			case MiniJavaPackage.INFERIOR: return createInferior();
			case MiniJavaPackage.PLUS: return createPlus();
			case MiniJavaPackage.MINUS: return createMinus();
			case MiniJavaPackage.MULTIPLICATION: return createMultiplication();
			case MiniJavaPackage.DIVISION: return createDivision();
			case MiniJavaPackage.ARRAY_ACCESS: return createArrayAccess();
			case MiniJavaPackage.ARRAY_LENGTH: return createArrayLength();
			case MiniJavaPackage.NOT: return createNot();
			case MiniJavaPackage.NEG: return createNeg();
			case MiniJavaPackage.FIELD_ACCESS: return createFieldAccess();
			case MiniJavaPackage.METHOD_CALL: return createMethodCall();
			case MiniJavaPackage.STRING_CONSTANT: return createStringConstant();
			case MiniJavaPackage.INT_CONSTANT: return createIntConstant();
			case MiniJavaPackage.BOOL_CONSTANT: return createBoolConstant();
			case MiniJavaPackage.THIS: return createThis();
			case MiniJavaPackage.SUPER: return createSuper();
			case MiniJavaPackage.NULL: return createNull();
			case MiniJavaPackage.NEW_OBJECT: return createNewObject();
			case MiniJavaPackage.NEW_ARRAY: return createNewArray();
			case MiniJavaPackage.SYMBOL_REF: return createSymbolRef();
			case MiniJavaPackage.CONTEXT: return createContext();
			case MiniJavaPackage.VALUE: return createValue();
			case MiniJavaPackage.INTEGER_VALUE: return createIntegerValue();
			case MiniJavaPackage.SYMBOL_BINDING: return createSymbolBinding();
			case MiniJavaPackage.FIELD_BINDING: return createFieldBinding();
			case MiniJavaPackage.STRING_VALUE: return createStringValue();
			case MiniJavaPackage.BOOLEAN_VALUE: return createBooleanValue();
			case MiniJavaPackage.OUTPUT_STREAM: return createOutputStream();
			case MiniJavaPackage.STATE: return createState();
			case MiniJavaPackage.FRAME: return createFrame();
			case MiniJavaPackage.NULL_VALUE: return createNullValue();
			case MiniJavaPackage.CALL: return createCall();
			case MiniJavaPackage.NEW_CALL: return createNewCall();
			case MiniJavaPackage.METHOD_CALL2: return createMethodCall2();
			case MiniJavaPackage.OBJECT_INSTANCE: return createObjectInstance();
			case MiniJavaPackage.ARRAY_INSTANCE: return createArrayInstance();
			case MiniJavaPackage.OBJECT_REF_VALUE: return createObjectRefValue();
			case MiniJavaPackage.ARRAY_REF_VALUE: return createArrayRefValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MiniJavaPackage.ACCESS_LEVEL:
				return createAccessLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MiniJavaPackage.ACCESS_LEVEL:
				return convertAccessLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration createTypeDeclaration() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.tetrabox.minijava.xminijavamt.miniJava.Class createClass() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintStatement createPrintStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement createForStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef createTypeRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleTypeRef createSingleTypeRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassRef createClassRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedDeclaration createTypedDeclaration() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol createSymbol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignee createAssignee() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeRef createArrayTypeRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerTypeRef createIntegerTypeRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTypeRef createBooleanTypeRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTypeRef createStringTypeRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidTypeRef createVoidTypeRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equality createEquality() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inequality createInequality() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperiorOrEqual createSuperiorOrEqual() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferiorOrEqual createInferiorOrEqual() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Superior createSuperior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inferior createInferior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAccess createArrayAccess() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayLength createArrayLength() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neg createNeg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccess createFieldAccess() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall createMethodCall() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntConstant createIntConstant() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolConstant createBoolConstant() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public This createThis() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Super createSuper() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Null createNull() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewObject createNewObject() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewArray createNewArray() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRef createSymbolRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolBinding createSymbolBinding() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldBinding createFieldBinding() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createOutputStream() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValue createNullValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewCall createNewCall() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall2 createMethodCall2() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInstance createObjectInstance() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInstance createArrayInstance() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRefValue createObjectRefValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayRefValue createArrayRefValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel createAccessLevelFromString(EDataType eDataType, String initialValue) {
		AccessLevel result = AccessLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniJavaPackage getMiniJavaPackage() {
		return (MiniJavaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiniJavaPackage getPackage() {
		return MiniJavaPackage.eINSTANCE;
	}

} //MiniJavaFactoryImpl
