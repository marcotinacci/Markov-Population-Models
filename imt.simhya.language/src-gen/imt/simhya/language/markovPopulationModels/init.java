/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.init#getAgentRef <em>Agent Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.init#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.init#getStates <em>States</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.init#getLocRef <em>Loc Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.init#getPopRef <em>Pop Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.init#getCard <em>Card</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getinit()
 * @model
 * @generated
 */
public interface init extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Ref</em>' reference.
   * @see #setAgentRef(agent)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getinit_AgentRef()
   * @model
   * @generated
   */
  agent getAgentRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.init#getAgentRef <em>Agent Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent Ref</em>' reference.
   * @see #getAgentRef()
   * @generated
   */
  void setAgentRef(agent value);

  /**
   * Returns the value of the '<em><b>Actual Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual Parameters</em>' containment reference.
   * @see #setActualParameters(actual_parameters)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getinit_ActualParameters()
   * @model containment="true"
   * @generated
   */
  actual_parameters getActualParameters();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.init#getActualParameters <em>Actual Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual Parameters</em>' containment reference.
   * @see #getActualParameters()
   * @generated
   */
  void setActualParameters(actual_parameters value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.stateInit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getinit_States()
   * @model containment="true"
   * @generated
   */
  EList<stateInit> getStates();

  /**
   * Returns the value of the '<em><b>Loc Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loc Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc Ref</em>' reference.
   * @see #setLocRef(location)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getinit_LocRef()
   * @model
   * @generated
   */
  location getLocRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.init#getLocRef <em>Loc Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc Ref</em>' reference.
   * @see #getLocRef()
   * @generated
   */
  void setLocRef(location value);

  /**
   * Returns the value of the '<em><b>Pop Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop Ref</em>' reference.
   * @see #setPopRef(population)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getinit_PopRef()
   * @model
   * @generated
   */
  population getPopRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.init#getPopRef <em>Pop Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop Ref</em>' reference.
   * @see #getPopRef()
   * @generated
   */
  void setPopRef(population value);

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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getinit_Card()
   * @model containment="true"
   * @generated
   */
  expr getCard();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.init#getCard <em>Card</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card</em>' containment reference.
   * @see #getCard()
   * @generated
   */
  void setCard(expr value);

} // init
