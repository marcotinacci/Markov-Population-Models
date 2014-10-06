/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>state cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.state_cond#getStateRef <em>State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_cond()
 * @model
 * @generated
 */
public interface state_cond extends EObject
{
  /**
   * Returns the value of the '<em><b>State Ref</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.state_ref}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Ref</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_cond_StateRef()
   * @model containment="true"
   * @generated
   */
  EList<state_ref> getStateRef();

} // state_cond
