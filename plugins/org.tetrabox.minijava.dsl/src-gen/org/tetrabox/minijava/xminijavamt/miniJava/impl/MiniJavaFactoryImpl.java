/**
 */
package org.tetrabox.minijava.xminijavamt.miniJava.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.minijava.xminijavamt.miniJava.Argument;
import org.tetrabox.minijava.xminijavamt.miniJava.BasicType;
import org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.Cast;
import org.tetrabox.minijava.xminijavamt.miniJava.ClassType;
import org.tetrabox.minijava.xminijavamt.miniJava.Constant;
import org.tetrabox.minijava.xminijavamt.miniJava.Context;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.Field;
import org.tetrabox.minijava.xminijavamt.miniJava.FieldSelection;
import org.tetrabox.minijava.xminijavamt.miniJava.Instance;
import org.tetrabox.minijava.xminijavamt.miniJava.IntConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.Message;
import org.tetrabox.minijava.xminijavamt.miniJava.Method;
import org.tetrabox.minijava.xminijavamt.miniJava.MethodBody;
import org.tetrabox.minijava.xminijavamt.miniJava.MethodCall;
import org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xminijavamt.miniJava.New;
import org.tetrabox.minijava.xminijavamt.miniJava.Parameter;
import org.tetrabox.minijava.xminijavamt.miniJava.Program;
import org.tetrabox.minijava.xminijavamt.miniJava.Selection;
import org.tetrabox.minijava.xminijavamt.miniJava.StringConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.This;
import org.tetrabox.minijava.xminijavamt.miniJava.Type;
import org.tetrabox.minijava.xminijavamt.miniJava.TypedElement;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;
import org.tetrabox.minijava.xminijavamt.miniJava.Variable;

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
			case MiniJavaPackage.TYPE: return createType();
			case MiniJavaPackage.BASIC_TYPE: return createBasicType();
			case MiniJavaPackage.CLASS_TYPE: return createClassType();
			case MiniJavaPackage.TYPED_ELEMENT: return createTypedElement();
			case MiniJavaPackage.CLASS: return createClass();
			case MiniJavaPackage.FIELD: return createField();
			case MiniJavaPackage.PARAMETER: return createParameter();
			case MiniJavaPackage.METHOD: return createMethod();
			case MiniJavaPackage.METHOD_BODY: return createMethodBody();
			case MiniJavaPackage.EXPRESSION: return createExpression();
			case MiniJavaPackage.MESSAGE: return createMessage();
			case MiniJavaPackage.METHOD_CALL: return createMethodCall();
			case MiniJavaPackage.FIELD_SELECTION: return createFieldSelection();
			case MiniJavaPackage.THIS: return createThis();
			case MiniJavaPackage.VARIABLE: return createVariable();
			case MiniJavaPackage.NEW: return createNew();
			case MiniJavaPackage.CAST: return createCast();
			case MiniJavaPackage.CONSTANT: return createConstant();
			case MiniJavaPackage.STRING_CONSTANT: return createStringConstant();
			case MiniJavaPackage.INT_CONSTANT: return createIntConstant();
			case MiniJavaPackage.BOOL_CONSTANT: return createBoolConstant();
			case MiniJavaPackage.ARGUMENT: return createArgument();
			case MiniJavaPackage.SELECTION: return createSelection();
			case MiniJavaPackage.CONTEXT: return createContext();
			case MiniJavaPackage.INSTANCE: return createInstance();
			case MiniJavaPackage.VALUE: return createValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Type createType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicType createBasicType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
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
	public Field createField() {
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
	public Method createMethod() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodBody createMethodBody() {
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
	public Message createMessage() {
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
	public FieldSelection createFieldSelection() {
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
	public Variable createVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public New createNew() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cast createCast() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
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
	public Argument createArgument() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
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
	public Instance createInstance() {
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
