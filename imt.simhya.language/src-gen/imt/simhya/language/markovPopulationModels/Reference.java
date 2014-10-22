/**
 */
package imt.simhya.language.markovPopulationModels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.Reference#getStateRef <em>State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Expression
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getReference_StateRef()
   * @model containment="true"
   * @generated
   */
  state_ref getStateRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.Reference#getStateRef <em>State Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' containment reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(state_ref value);

} // Reference
