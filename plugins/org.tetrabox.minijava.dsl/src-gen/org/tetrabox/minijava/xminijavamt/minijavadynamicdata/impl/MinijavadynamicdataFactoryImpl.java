/**
 */
package org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.minijava.xminijavamt.minijavadynamicdata.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinijavadynamicdataFactoryImpl extends EFactoryImpl implements MinijavadynamicdataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinijavadynamicdataFactory init() {
		try {
			MinijavadynamicdataFactory theMinijavadynamicdataFactory = (MinijavadynamicdataFactory)EPackage.Registry.INSTANCE.getEFactory(MinijavadynamicdataPackage.eNS_URI);
			if (theMinijavadynamicdataFactory != null) {
				return theMinijavadynamicdataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MinijavadynamicdataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinijavadynamicdataFactoryImpl() {
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
			case MinijavadynamicdataPackage.CONTEXT: return createContext();
			case MinijavadynamicdataPackage.INTEGER_VALUE: return createIntegerValue();
			case MinijavadynamicdataPackage.INSTANCE: return createInstance();
			case MinijavadynamicdataPackage.PARAMETER_BINDING: return createParameterBinding();
			case MinijavadynamicdataPackage.FIELD_BINDING: return createFieldBinding();
			case MinijavadynamicdataPackage.STRING_VALUE: return createStringValue();
			case MinijavadynamicdataPackage.BOOLEAN_VALUE: return createBooleanValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public IntegerValue createIntegerValue() {
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
	public ParameterBinding createParameterBinding() {
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
	public MinijavadynamicdataPackage getMinijavadynamicdataPackage() {
		return (MinijavadynamicdataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MinijavadynamicdataPackage getPackage() {
		return MinijavadynamicdataPackage.eINSTANCE;
	}

} //MinijavadynamicdataFactoryImpl
