/**
 */
package greetings.impl;

import greetings.Greeting;
import greetings.GreetingsModel;
import greetings.GreetingsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link greetings.impl.GreetingsModelImpl#getGreetings <em>Greetings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GreetingsModelImpl extends MinimalEObjectImpl.Container implements GreetingsModel {
	/**
	 * The cached value of the '{@link #getGreetings() <em>Greetings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreetings()
	 * @generated
	 * @ordered
	 */
	protected EList<Greeting> greetings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreetingsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GreetingsPackage.Literals.GREETINGS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Greeting> getGreetings() {
		if (greetings == null) {
			greetings = new EObjectContainmentEList<Greeting>(Greeting.class, this, GreetingsPackage.GREETINGS_MODEL__GREETINGS);
		}
		return greetings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GreetingsPackage.GREETINGS_MODEL__GREETINGS:
				return ((InternalEList<?>)getGreetings()).basicRemove(otherEnd, msgs);
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
			case GreetingsPackage.GREETINGS_MODEL__GREETINGS:
				return getGreetings();
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
			case GreetingsPackage.GREETINGS_MODEL__GREETINGS:
				getGreetings().clear();
				getGreetings().addAll((Collection<? extends Greeting>)newValue);
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
			case GreetingsPackage.GREETINGS_MODEL__GREETINGS:
				getGreetings().clear();
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
			case GreetingsPackage.GREETINGS_MODEL__GREETINGS:
				return greetings != null && !greetings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GreetingsModelImpl
