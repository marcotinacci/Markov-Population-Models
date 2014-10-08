/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>state ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.state_ref#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.state_ref#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.state_ref#getAgentStateRef <em>Agent State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.state_ref#getPopAgentStateRef <em>Pop Agent State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_ref()
 * @model
 * @generated
 */
public interface state_ref extends EObject
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_ref_StateRef()
   * @model
   * @generated
   */
  state getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.state_ref#getStateRef <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state value);

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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_ref_ActualParameters()
   * @model containment="true"
   * @generated
   */
  actual_parameters getActualParameters();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.state_ref#getActualParameters <em>Actual Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual Parameters</em>' containment reference.
   * @see #getActualParameters()
   * @generated
   */
  void setActualParameters(actual_parameters value);

  /**
   * Returns the value of the '<em><b>Agent State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent State Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent State Ref</em>' reference.
   * @see #setAgentStateRef(agent)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_ref_AgentStateRef()
   * @model
   * @generated
   */
  agent getAgentStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.state_ref#getAgentStateRef <em>Agent State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent State Ref</em>' reference.
   * @see #getAgentStateRef()
   * @generated
   */
  void setAgentStateRef(agent value);

  /**
   * Returns the value of the '<em><b>Pop Agent State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pop Agent State Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pop Agent State Ref</em>' reference.
   * @see #setPopAgentStateRef(population)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_ref_PopAgentStateRef()
   * @model
   * @generated
   */
  population getPopAgentStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.state_ref#getPopAgentStateRef <em>Pop Agent State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pop Agent State Ref</em>' reference.
   * @see #getPopAgentStateRef()
   * @generated
   */
  void setPopAgentStateRef(population value);

} // state_ref
