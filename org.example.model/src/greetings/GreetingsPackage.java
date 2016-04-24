/**
 */
package greetings;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see greetings.GreetingsFactory
 * @model kind="package"
 * @generated
 */
public interface GreetingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "greetings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/greetings";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "greetings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GreetingsPackage eINSTANCE = greetings.impl.GreetingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link greetings.impl.GreetingsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see greetings.impl.GreetingsModelImpl
	 * @see greetings.impl.GreetingsPackageImpl#getGreetingsModel()
	 * @generated
	 */
	int GREETINGS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETINGS_MODEL__GREETINGS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETINGS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETINGS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link greetings.impl.GreetingImpl <em>Greeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see greetings.impl.GreetingImpl
	 * @see greetings.impl.GreetingsPackageImpl#getGreeting()
	 * @generated
	 */
	int GREETING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link greetings.GreetingsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see greetings.GreetingsModel
	 * @generated
	 */
	EClass getGreetingsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link greetings.GreetingsModel#getGreetings <em>Greetings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Greetings</em>'.
	 * @see greetings.GreetingsModel#getGreetings()
	 * @see #getGreetingsModel()
	 * @generated
	 */
	EReference getGreetingsModel_Greetings();

	/**
	 * Returns the meta object for class '{@link greetings.Greeting <em>Greeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greeting</em>'.
	 * @see greetings.Greeting
	 * @generated
	 */
	EClass getGreeting();

	/**
	 * Returns the meta object for the attribute '{@link greetings.Greeting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see greetings.Greeting#getName()
	 * @see #getGreeting()
	 * @generated
	 */
	EAttribute getGreeting_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GreetingsFactory getGreetingsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link greetings.impl.GreetingsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see greetings.impl.GreetingsModelImpl
		 * @see greetings.impl.GreetingsPackageImpl#getGreetingsModel()
		 * @generated
		 */
		EClass GREETINGS_MODEL = eINSTANCE.getGreetingsModel();

		/**
		 * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREETINGS_MODEL__GREETINGS = eINSTANCE.getGreetingsModel_Greetings();

		/**
		 * The meta object literal for the '{@link greetings.impl.GreetingImpl <em>Greeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see greetings.impl.GreetingImpl
		 * @see greetings.impl.GreetingsPackageImpl#getGreeting()
		 * @generated
		 */
		EClass GREETING = eINSTANCE.getGreeting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREETING__NAME = eINSTANCE.getGreeting_Name();

	}

} //GreetingsPackage
