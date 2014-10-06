/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>action cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.action_cond#getActionRef <em>Action Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getaction_cond()
 * @model
 * @generated
 */
public interface action_cond extends EObject
{
  /**
   * Returns the value of the '<em><b>Action Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Ref</em>' reference.
   * @see #setActionRef(label)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getaction_cond_ActionRef()
   * @model
   * @generated
   */
  label getActionRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.action_cond#getActionRef <em>Action Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Ref</em>' reference.
   * @see #getActionRef()
   * @generated
   */
  void setActionRef(label value);

} // action_cond
