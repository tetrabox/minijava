/**
 */
package org.tetrabox.minijava.dynamic.minijavadynamicdata.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.minijava.dynamic.minijavadynamicdata.Context;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.OutputStream;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.SymbolBinding;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value;

import org.tetrabox.minijava.xtext.miniJava.MemberSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.ContextImpl#getMethodcall <em>Methodcall</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.ContextImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.ContextImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.ContextImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.ContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.ContextImpl#getChildrenContexts <em>Children Contexts</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.ContextImpl#getOutputStream <em>Output Stream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getMethodcall() <em>Methodcall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodcall()
	 * @generated
	 * @ordered
	 */
	protected MemberSelection methodcall;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Instance instance;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolBinding> bindings;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected Value returnValue;

	/**
	 * The cached value of the '{@link #getChildrenContexts() <em>Children Contexts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenContexts()
	 * @generated
	 * @ordered
	 */
	protected Context childrenContexts;

	/**
	 * The cached value of the '{@link #getOutputStream() <em>Output Stream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputStream()
	 * @generated
	 * @ordered
	 */
	protected OutputStream outputStream;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinijavadynamicdataPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberSelection getMethodcall() {
		if (methodcall != null && methodcall.eIsProxy()) {
			InternalEObject oldMethodcall = (InternalEObject)methodcall;
			methodcall = (MemberSelection)eResolveProxy(oldMethodcall);
			if (methodcall != oldMethodcall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinijavadynamicdataPackage.CONTEXT__METHODCALL, oldMethodcall, methodcall));
			}
		}
		return methodcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberSelection basicGetMethodcall() {
		return methodcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodcall(MemberSelection newMethodcall) {
		MemberSelection oldMethodcall = methodcall;
		methodcall = newMethodcall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__METHODCALL, oldMethodcall, methodcall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (Instance)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinijavadynamicdataPackage.CONTEXT__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Instance newInstance) {
		Instance oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymbolBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<SymbolBinding>(SymbolBinding.class, this, MinijavadynamicdataPackage.CONTEXT__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getReturnValue() {
		if (returnValue != null && returnValue.eIsProxy()) {
			InternalEObject oldReturnValue = (InternalEObject)returnValue;
			returnValue = (Value)eResolveProxy(oldReturnValue);
			if (returnValue != oldReturnValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinijavadynamicdataPackage.CONTEXT__RETURN_VALUE, oldReturnValue, returnValue));
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(Value newReturnValue) {
		Value oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__RETURN_VALUE, oldReturnValue, returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getParentContext() {
		if (eContainerFeatureID() != MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT) return null;
		return (Context)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContext(Context newParentContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentContext, MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContext(Context newParentContext) {
		if (newParentContext != eInternalContainer() || (eContainerFeatureID() != MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT && newParentContext != null)) {
			if (EcoreUtil.isAncestor(this, newParentContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentContext != null)
				msgs = ((InternalEObject)newParentContext).eInverseAdd(this, MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS, Context.class, msgs);
			msgs = basicSetParentContext(newParentContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT, newParentContext, newParentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getChildrenContexts() {
		return childrenContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildrenContexts(Context newChildrenContexts, NotificationChain msgs) {
		Context oldChildrenContexts = childrenContexts;
		childrenContexts = newChildrenContexts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS, oldChildrenContexts, newChildrenContexts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenContexts(Context newChildrenContexts) {
		if (newChildrenContexts != childrenContexts) {
			NotificationChain msgs = null;
			if (childrenContexts != null)
				msgs = ((InternalEObject)childrenContexts).eInverseRemove(this, MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT, Context.class, msgs);
			if (newChildrenContexts != null)
				msgs = ((InternalEObject)newChildrenContexts).eInverseAdd(this, MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT, Context.class, msgs);
			msgs = basicSetChildrenContexts(newChildrenContexts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS, newChildrenContexts, newChildrenContexts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream getOutputStream() {
		return outputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputStream(OutputStream newOutputStream, NotificationChain msgs) {
		OutputStream oldOutputStream = outputStream;
		outputStream = newOutputStream;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM, oldOutputStream, newOutputStream);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputStream(OutputStream newOutputStream) {
		if (newOutputStream != outputStream) {
			NotificationChain msgs = null;
			if (outputStream != null)
				msgs = ((InternalEObject)outputStream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM, null, msgs);
			if (newOutputStream != null)
				msgs = ((InternalEObject)newOutputStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM, null, msgs);
			msgs = basicSetOutputStream(newOutputStream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM, newOutputStream, newOutputStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentContext((Context)otherEnd, msgs);
			case MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS:
				if (childrenContexts != null)
					msgs = ((InternalEObject)childrenContexts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS, null, msgs);
				return basicSetChildrenContexts((Context)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinijavadynamicdataPackage.CONTEXT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT:
				return basicSetParentContext(null, msgs);
			case MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS:
				return basicSetChildrenContexts(null, msgs);
			case MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM:
				return basicSetOutputStream(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT:
				return eInternalContainer().eInverseRemove(this, MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS, Context.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinijavadynamicdataPackage.CONTEXT__METHODCALL:
				if (resolve) return getMethodcall();
				return basicGetMethodcall();
			case MinijavadynamicdataPackage.CONTEXT__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case MinijavadynamicdataPackage.CONTEXT__BINDINGS:
				return getBindings();
			case MinijavadynamicdataPackage.CONTEXT__RETURN_VALUE:
				if (resolve) return getReturnValue();
				return basicGetReturnValue();
			case MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext();
			case MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS:
				return getChildrenContexts();
			case MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM:
				return getOutputStream();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MinijavadynamicdataPackage.CONTEXT__METHODCALL:
				setMethodcall((MemberSelection)newValue);
				return;
			case MinijavadynamicdataPackage.CONTEXT__INSTANCE:
				setInstance((Instance)newValue);
				return;
			case MinijavadynamicdataPackage.CONTEXT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends SymbolBinding>)newValue);
				return;
			case MinijavadynamicdataPackage.CONTEXT__RETURN_VALUE:
				setReturnValue((Value)newValue);
				return;
			case MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)newValue);
				return;
			case MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS:
				setChildrenContexts((Context)newValue);
				return;
			case MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM:
				setOutputStream((OutputStream)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MinijavadynamicdataPackage.CONTEXT__METHODCALL:
				setMethodcall((MemberSelection)null);
				return;
			case MinijavadynamicdataPackage.CONTEXT__INSTANCE:
				setInstance((Instance)null);
				return;
			case MinijavadynamicdataPackage.CONTEXT__BINDINGS:
				getBindings().clear();
				return;
			case MinijavadynamicdataPackage.CONTEXT__RETURN_VALUE:
				setReturnValue((Value)null);
				return;
			case MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)null);
				return;
			case MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS:
				setChildrenContexts((Context)null);
				return;
			case MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM:
				setOutputStream((OutputStream)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MinijavadynamicdataPackage.CONTEXT__METHODCALL:
				return methodcall != null;
			case MinijavadynamicdataPackage.CONTEXT__INSTANCE:
				return instance != null;
			case MinijavadynamicdataPackage.CONTEXT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case MinijavadynamicdataPackage.CONTEXT__RETURN_VALUE:
				return returnValue != null;
			case MinijavadynamicdataPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext() != null;
			case MinijavadynamicdataPackage.CONTEXT__CHILDREN_CONTEXTS:
				return childrenContexts != null;
			case MinijavadynamicdataPackage.CONTEXT__OUTPUT_STREAM:
				return outputStream != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
