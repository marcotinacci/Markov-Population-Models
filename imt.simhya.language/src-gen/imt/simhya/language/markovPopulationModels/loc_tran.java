/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>loc tran</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.loc_tran#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.loc_tran#getSCond <em>SCond</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.loc_tran#getACond <em>ACond</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getloc_tran()
 * @model
 * @generated
 */
public interface loc_tran extends EObject
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getloc_tran_StateRef()
   * @model containment="true"
   * @generated
   */
  state_ref getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.loc_tran#getStateRef <em>State Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' containment reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state_ref value);

  /**
   * Returns the value of the '<em><b>SCond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SCond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SCond</em>' containment reference.
   * @see #setSCond(state_cond)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getloc_tran_SCond()
   * @model containment="true"
   * @generated
   */
  state_cond getSCond();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.loc_tran#getSCond <em>SCond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SCond</em>' containment reference.
   * @see #getSCond()
   * @generated
   */
  void setSCond(state_cond value);

  /**
   * Returns the value of the '<em><b>ACond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ACond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ACond</em>' containment reference.
   * @see #setACond(action_cond)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getloc_tran_ACond()
   * @model containment="true"
   * @generated
   */
  action_cond getACond();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.loc_tran#getACond <em>ACond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ACond</em>' containment reference.
   * @see #getACond()
   * @generated
   */
  void setACond(action_cond value);

} // loc_tran
