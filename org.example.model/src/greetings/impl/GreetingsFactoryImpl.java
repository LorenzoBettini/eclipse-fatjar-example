/**
 */
package greetings.impl;

import greetings.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreetingsFactoryImpl extends EFactoryImpl implements GreetingsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GreetingsFactory init() {
		try {
			GreetingsFactory theGreetingsFactory = (GreetingsFactory)EPackage.Registry.INSTANCE.getEFactory(GreetingsPackage.eNS_URI);
			if (theGreetingsFactory != null) {
				return theGreetingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GreetingsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreetingsFactoryImpl() {
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
			case GreetingsPackage.GREETINGS_MODEL: return createGreetingsModel();
			case GreetingsPackage.GREETING: return createGreeting();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreetingsModel createGreetingsModel() {
		GreetingsModelImpl greetingsModel = new GreetingsModelImpl();
		return greetingsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greeting createGreeting() {
		GreetingImpl greeting = new GreetingImpl();
		return greeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreetingsPackage getGreetingsPackage() {
		return (GreetingsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GreetingsPackage getPackage() {
		return GreetingsPackage.eINSTANCE;
	}

} //GreetingsFactoryImpl
