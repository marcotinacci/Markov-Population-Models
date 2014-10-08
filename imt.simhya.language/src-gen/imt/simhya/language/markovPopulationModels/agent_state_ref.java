/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>agent state ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.agent_state_ref#getAgentStateRef <em>Agent State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.agent_state_ref#getStateRef <em>State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent_state_ref()
 * @model
 * @generated
 */
public interface agent_state_ref extends EObject
{
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent_state_ref_AgentStateRef()
   * @model
   * @generated
   */
  agent getAgentStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.agent_state_ref#getAgentStateRef <em>Agent State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent State Ref</em>' reference.
   * @see #getAgentStateRef()
   * @generated
   */
  void setAgentStateRef(agent value);

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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent_state_ref_StateRef()
   * @model containment="true"
   * @generated
   */
  state_ref getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.agent_state_ref#getStateRef <em>State Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' containment reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state_ref value);

} // agent_state_ref
