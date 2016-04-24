/**
 */
package greetings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link greetings.GreetingsModel#getGreetings <em>Greetings</em>}</li>
 * </ul>
 *
 * @see greetings.GreetingsPackage#getGreetingsModel()
 * @model
 * @generated
 */
public interface GreetingsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
	 * The list contents are of type {@link greetings.Greeting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Greetings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greetings</em>' containment reference list.
	 * @see greetings.GreetingsPackage#getGreetingsModel_Greetings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Greeting> getGreetings();

} // GreetingsModel
