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
 *   <li>{@link imt.simhya.language.markovPopulationModels.loc_tran#getS_cond <em>Scond</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.loc_tran#getA_cond <em>Acond</em>}</li>
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
   * Returns the value of the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Ref</em>' reference.
   * @see #setStateRef(state)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getloc_tran_StateRef()
   * @model
   * @generated
   */
  state getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.loc_tran#getStateRef <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state value);

  /**
   * Returns the value of the '<em><b>Scond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scond</em>' containment reference.
   * @see #setS_cond(state_cond)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getloc_tran_S_cond()
   * @model containment="true"
   * @generated
   */
  state_cond getS_cond();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.loc_tran#getS_cond <em>Scond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scond</em>' containment reference.
   * @see #getS_cond()
   * @generated
   */
  void setS_cond(state_cond value);

  /**
   * Returns the value of the '<em><b>Acond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acond</em>' containment reference.
   * @see #setA_cond(action_cond)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getloc_tran_A_cond()
   * @model containment="true"
   * @generated
   */
  action_cond getA_cond();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.loc_tran#getA_cond <em>Acond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acond</em>' containment reference.
   * @see #getA_cond()
   * @generated
   */
  void setA_cond(action_cond value);

} // loc_tran
