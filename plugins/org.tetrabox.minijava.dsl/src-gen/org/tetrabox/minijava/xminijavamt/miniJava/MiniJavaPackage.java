/**
 */
package org.tetrabox.minijava.xminijavamt.miniJava;

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
 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaFactory
 * @model kind="package"
 * @generated
 */
public interface MiniJavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "miniJava";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.minijava.xminijavamt/miniJava/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "miniJava";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiniJavaPackage eINSTANCE = org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ProgramImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__MAIN = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.TypeImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.BasicTypeImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__BASIC = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassTypeImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Classref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CLASSREF = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.TypedElementImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ParameterImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURNTYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = 3;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodBodyImpl <em>Method Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodBodyImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMethodBody()
	 * @generated
	 */
	int METHOD_BODY = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BODY__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Method Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BODY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ArgumentImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 22;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ExpressionImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MessageImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 11;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodCallImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__NAME = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__ARGS = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldSelectionImpl <em>Field Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldSelectionImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getFieldSelection()
	 * @generated
	 */
	int FIELD_SELECTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SELECTION__NAME = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SELECTION_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ThisImpl <em>This</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ThisImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getThis()
	 * @generated
	 */
	int THIS = 14;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>This</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.VariableImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Paramref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PARAMREF = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.NewImpl <em>New</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.NewImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getNew()
	 * @generated
	 */
	int NEW = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW__ARGS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.CastImpl <em>Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.CastImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getCast()
	 * @generated
	 */
	int CAST = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__OBJECT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ConstantImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 18;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.StringConstantImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 19;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__CONSTANT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.IntConstantImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 20;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__CONSTANT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.BoolConstantImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 21;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__CONSTANT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.SelectionImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 23;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__RECEIVER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__MESSAGE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ContextImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 24;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.InstanceImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 25;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ValueImpl
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 26;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.miniJava.Program#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Program#getClasses()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Classes();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Program#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Program#getMain()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Main();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.BasicType#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basic</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.BasicType#getBasic()
	 * @see #getBasicType()
	 * @generated
	 */
	EAttribute getBasicType_Basic();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.ClassType#getClassref <em>Classref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classref</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.ClassType#getClassref()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Classref();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.TypedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.TypedElement#getName()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Class#getExtends()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.miniJava.Class#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Class#getFields()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.miniJava.Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Class#getMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Methods();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returntype</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Method#getReturntype()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Returntype();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Method#getParams()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Params();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Body();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.MethodBody <em>Method Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Body</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MethodBody
	 * @generated
	 */
	EClass getMethodBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.MethodBody#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MethodBody#getExpression()
	 * @see #getMethodBody()
	 * @generated
	 */
	EReference getMethodBody_Expression();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.MethodCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MethodCall#getName()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.miniJava.MethodCall#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MethodCall#getArgs()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Args();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.FieldSelection <em>Field Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Selection</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.FieldSelection
	 * @generated
	 */
	EClass getFieldSelection();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.FieldSelection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.FieldSelection#getName()
	 * @see #getFieldSelection()
	 * @generated
	 */
	EReference getFieldSelection_Name();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.This <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.This
	 * @generated
	 */
	EClass getThis();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.This#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.This#getVariable()
	 * @see #getThis()
	 * @generated
	 */
	EAttribute getThis_Variable();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Variable#getParamref <em>Paramref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paramref</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Variable#getParamref()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Paramref();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.New <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.New
	 * @generated
	 */
	EClass getNew();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.New#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.New#getType()
	 * @see #getNew()
	 * @generated
	 */
	EReference getNew_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.minijava.xminijavamt.miniJava.New#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.New#getArgs()
	 * @see #getNew()
	 * @generated
	 */
	EReference getNew_Args();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Cast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Cast
	 * @generated
	 */
	EClass getCast();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Cast#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Cast#getType()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Cast#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Cast#getObject()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_Object();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.StringConstant#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.StringConstant#getConstant()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Constant();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.IntConstant#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.IntConstant#getConstant()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Constant();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant#getConstant()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Constant();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Selection#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Selection#getReceiver()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Receiver();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.minijava.xminijavamt.miniJava.Selection#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Selection#getMessage()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Message();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.minijava.xminijavamt.miniJava.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiniJavaFactory getMiniJavaFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ProgramImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CLASSES = eINSTANCE.getProgram_Classes();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__MAIN = eINSTANCE.getProgram_Main();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.TypeImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.BasicTypeImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '<em><b>Basic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_TYPE__BASIC = eINSTANCE.getBasicType_Basic();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassTypeImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '<em><b>Classref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__CLASSREF = eINSTANCE.getClassType_Classref();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.TypedElementImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__NAME = eINSTANCE.getTypedElement_Name();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ClassImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FIELDS = eINSTANCE.getClass_Fields();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ParameterImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURNTYPE = eINSTANCE.getMethod_Returntype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BODY = eINSTANCE.getMethod_Body();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodBodyImpl <em>Method Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodBodyImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMethodBody()
		 * @generated
		 */
		EClass METHOD_BODY = eINSTANCE.getMethodBody();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_BODY__EXPRESSION = eINSTANCE.getMethodBody_Expression();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ExpressionImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MessageImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MethodCallImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__NAME = eINSTANCE.getMethodCall_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__ARGS = eINSTANCE.getMethodCall_Args();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldSelectionImpl <em>Field Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.FieldSelectionImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getFieldSelection()
		 * @generated
		 */
		EClass FIELD_SELECTION = eINSTANCE.getFieldSelection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_SELECTION__NAME = eINSTANCE.getFieldSelection_Name();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ThisImpl <em>This</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ThisImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getThis()
		 * @generated
		 */
		EClass THIS = eINSTANCE.getThis();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIS__VARIABLE = eINSTANCE.getThis_Variable();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.VariableImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Paramref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PARAMREF = eINSTANCE.getVariable_Paramref();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.NewImpl <em>New</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.NewImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getNew()
		 * @generated
		 */
		EClass NEW = eINSTANCE.getNew();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW__TYPE = eINSTANCE.getNew_Type();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW__ARGS = eINSTANCE.getNew_Args();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.CastImpl <em>Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.CastImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getCast()
		 * @generated
		 */
		EClass CAST = eINSTANCE.getCast();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__TYPE = eINSTANCE.getCast_Type();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__OBJECT = eINSTANCE.getCast_Object();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ConstantImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.StringConstantImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__CONSTANT = eINSTANCE.getStringConstant_Constant();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.IntConstantImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__CONSTANT = eINSTANCE.getIntConstant_Constant();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.BoolConstantImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__CONSTANT = eINSTANCE.getBoolConstant_Constant();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ArgumentImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.SelectionImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__RECEIVER = eINSTANCE.getSelection_Receiver();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__MESSAGE = eINSTANCE.getSelection_Message();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ContextImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.InstanceImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '{@link org.tetrabox.minijava.xminijavamt.miniJava.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.ValueImpl
		 * @see org.tetrabox.minijava.xminijavamt.miniJava.impl.MiniJavaPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

	}

} //MiniJavaPackage
