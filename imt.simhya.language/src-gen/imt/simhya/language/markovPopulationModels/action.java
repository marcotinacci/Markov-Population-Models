/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.action#getActRef <em>Act Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.action#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.action#getLocalRate <em>Local Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getaction()
 * @model
 * @generated
 */
public interface action extends EObject
{
  /**
   * Returns the value of the '<em><b>Act Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Act Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act Ref</em>' reference.
   * @see #setActRef(label)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getaction_ActRef()
   * @model
   * @generated
   */
  label getActRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.action#getActRef <em>Act Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Act Ref</em>' reference.
   * @see #getActRef()
   * @generated
   */
  void setActRef(label value);

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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getaction_StateRef()
   * @model
   * @generated
   */
  state getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.action#getStateRef <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state value);

  /**
   * Returns the value of the '<em><b>Local Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Rate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Rate</em>' containment reference.
   * @see #setLocalRate(Expression)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getaction_LocalRate()
   * @model containment="true"
   * @generated
   */
  Expression getLocalRate();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.action#getLocalRate <em>Local Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Rate</em>' containment reference.
   * @see #getLocalRate()
   * @generated
   */
  void setLocalRate(Expression value);

} // action
