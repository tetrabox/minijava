/**
 */
package org.tetrabox.minijava.xminijavamt.minijavadynamicdata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.MinijavadynamicdataFactory
 * @model kind="package"
 * @generated
 */
public interface MinijavadynamicdataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minijavadynamicdata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.minijava.xminijavamt/minijavadynamicdata/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minijavadynamicdata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinijavadynamicdataPackage eINSTANCE = org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ContextImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Methodcall</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__METHODCALL = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__BINDINGS = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ValueImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.IntegerValueImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.InstanceImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Fieldbindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__FIELDBINDINGS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ParameterBindingImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.FieldBindingImpl <em>Field Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.FieldBindingImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getFieldBinding()
	 * @generated
	 */
	int FIELD_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.StringValueImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.BooleanValueImpl
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context#getMethodcall <em>Methodcall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Methodcall</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context#getMethodcall()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Methodcall();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context#getInstance()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Context#getBindings()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Bindings();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Instance#getFieldbindings <em>Fieldbindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldbindings</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.Instance#getFieldbindings()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Fieldbindings();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.ParameterBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.ParameterBinding#getValue()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Value();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.ParameterBinding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.ParameterBinding#getParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_Parameter();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.FieldBinding <em>Field Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Binding</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.FieldBinding
	 * @generated
	 */
	EClass getFieldBinding();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.FieldBinding#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.FieldBinding#getField()
	 * @see #getFieldBinding()
	 * @generated
	 */
	EReference getFieldBinding_Field();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.FieldBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.FieldBinding#getValue()
	 * @see #getFieldBinding()
	 * @generated
	 */
	EReference getFieldBinding_Value();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinijavadynamicdataFactory getMinijavadynamicdataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ContextImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Methodcall</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__METHODCALL = eINSTANCE.getContext_Methodcall();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__INSTANCE = eINSTANCE.getContext_Instance();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__BINDINGS = eINSTANCE.getContext_Bindings();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ValueImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.IntegerValueImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.InstanceImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Fieldbindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__FIELDBINDINGS = eINSTANCE.getInstance_Fieldbindings();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.ParameterBindingImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__VALUE = eINSTANCE.getParameterBinding_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__PARAMETER = eINSTANCE.getParameterBinding_Parameter();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.FieldBindingImpl <em>Field Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.FieldBindingImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getFieldBinding()
		 * @generated
		 */
		EClass FIELD_BINDING = eINSTANCE.getFieldBinding();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_BINDING__FIELD = eINSTANCE.getFieldBinding_Field();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_BINDING__VALUE = eINSTANCE.getFieldBinding_Value();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.StringValueImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.BooleanValueImpl
		 * @see org.tetrabox.minijava.xminijavamt.minijavadynamicdata.impl.MinijavadynamicdataPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

	}

} //MinijavadynamicdataPackage
