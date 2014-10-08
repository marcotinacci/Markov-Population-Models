/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>state Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.stateInit#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.stateInit#getCard <em>Card</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstateInit()
 * @model
 * @generated
 */
public interface stateInit extends EObject
{
  /**
   * Returns the value of the '<em><b>State Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Ref</em>' containment reference.
   * @see #setStateRef(state_ref)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstateInit_StateRef()
   * @model containment="true"
   * @generated
   */
  state_ref getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.stateInit#getStateRef <em>State Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' containment reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state_ref value);

  /**
   * Returns the value of the '<em><b>Card</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card</em>' containment reference.
   * @see #setCard(expr)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstateInit_Card()
   * @model containment="true"
   * @generated
   */
  expr getCard();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.stateInit#getCard <em>Card</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card</em>' containment reference.
   * @see #getCard()
   * @generated
   */
  void setCard(expr value);

} // stateInit
