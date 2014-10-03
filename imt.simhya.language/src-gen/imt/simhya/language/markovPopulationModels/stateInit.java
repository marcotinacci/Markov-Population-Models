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
   * Returns the value of the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Ref</em>' reference.
   * @see #setStateRef(state)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstateInit_StateRef()
   * @model
   * @generated
   */
  state getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.stateInit#getStateRef <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state value);

  /**
   * Returns the value of the '<em><b>Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card</em>' attribute.
   * @see #setCard(int)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstateInit_Card()
   * @model
   * @generated
   */
  int getCard();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.stateInit#getCard <em>Card</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card</em>' attribute.
   * @see #getCard()
   * @generated
   */
  void setCard(int value);

} // stateInit
