/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>state cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.state_cond#getS_ref <em>Sref</em>}</li>
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
   * Returns the value of the '<em><b>Sref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sref</em>' containment reference.
   * @see #setS_ref(state_ref)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getstate_cond_S_ref()
   * @model containment="true"
   * @generated
   */
  state_ref getS_ref();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.state_cond#getS_ref <em>Sref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sref</em>' containment reference.
   * @see #getS_ref()
   * @generated
   */
  void setS_ref(state_ref value);

} // state_cond
