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
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.minijava.dynamic.minijavadynamicdata.Frame;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.OutputStream;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.StateImpl#getRootFrame <em>Root Frame</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.StateImpl#getHeap <em>Heap</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.StateImpl#getOutputStream <em>Output Stream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getRootFrame() <em>Root Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame rootFrame;

	/**
	 * The cached value of the '{@link #getHeap() <em>Heap</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeap()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> heap;

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
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinijavadynamicdataPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getRootFrame() {
		return rootFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootFrame(Frame newRootFrame, NotificationChain msgs) {
		Frame oldRootFrame = rootFrame;
		rootFrame = newRootFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.STATE__ROOT_FRAME, oldRootFrame, newRootFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFrame(Frame newRootFrame) {
		if (newRootFrame != rootFrame) {
			NotificationChain msgs = null;
			if (rootFrame != null)
				msgs = ((InternalEObject)rootFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.STATE__ROOT_FRAME, null, msgs);
			if (newRootFrame != null)
				msgs = ((InternalEObject)newRootFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.STATE__ROOT_FRAME, null, msgs);
			msgs = basicSetRootFrame(newRootFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.STATE__ROOT_FRAME, newRootFrame, newRootFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getHeap() {
		if (heap == null) {
			heap = new EObjectContainmentEList<Instance>(Instance.class, this, MinijavadynamicdataPackage.STATE__HEAP);
		}
		return heap;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.STATE__OUTPUT_STREAM, oldOutputStream, newOutputStream);
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
				msgs = ((InternalEObject)outputStream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.STATE__OUTPUT_STREAM, null, msgs);
			if (newOutputStream != null)
				msgs = ((InternalEObject)newOutputStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.STATE__OUTPUT_STREAM, null, msgs);
			msgs = basicSetOutputStream(newOutputStream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.STATE__OUTPUT_STREAM, newOutputStream, newOutputStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinijavadynamicdataPackage.STATE__ROOT_FRAME:
				return basicSetRootFrame(null, msgs);
			case MinijavadynamicdataPackage.STATE__HEAP:
				return ((InternalEList<?>)getHeap()).basicRemove(otherEnd, msgs);
			case MinijavadynamicdataPackage.STATE__OUTPUT_STREAM:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinijavadynamicdataPackage.STATE__ROOT_FRAME:
				return getRootFrame();
			case MinijavadynamicdataPackage.STATE__HEAP:
				return getHeap();
			case MinijavadynamicdataPackage.STATE__OUTPUT_STREAM:
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
			case MinijavadynamicdataPackage.STATE__ROOT_FRAME:
				setRootFrame((Frame)newValue);
				return;
			case MinijavadynamicdataPackage.STATE__HEAP:
				getHeap().clear();
				getHeap().addAll((Collection<? extends Instance>)newValue);
				return;
			case MinijavadynamicdataPackage.STATE__OUTPUT_STREAM:
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
			case MinijavadynamicdataPackage.STATE__ROOT_FRAME:
				setRootFrame((Frame)null);
				return;
			case MinijavadynamicdataPackage.STATE__HEAP:
				getHeap().clear();
				return;
			case MinijavadynamicdataPackage.STATE__OUTPUT_STREAM:
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
			case MinijavadynamicdataPackage.STATE__ROOT_FRAME:
				return rootFrame != null;
			case MinijavadynamicdataPackage.STATE__HEAP:
				return heap != null && !heap.isEmpty();
			case MinijavadynamicdataPackage.STATE__OUTPUT_STREAM:
				return outputStream != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
