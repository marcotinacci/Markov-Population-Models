/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>local rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.local_rate#getConstRef <em>Const Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.local_rate#getLocalRate <em>Local Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getlocal_rate()
 * @model
 * @generated
 */
public interface local_rate extends EObject
{
  /**
   * Returns the value of the '<em><b>Const Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Ref</em>' reference.
   * @see #setConstRef(constant)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getlocal_rate_ConstRef()
   * @model
   * @generated
   */
  constant getConstRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.local_rate#getConstRef <em>Const Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Ref</em>' reference.
   * @see #getConstRef()
   * @generated
   */
  void setConstRef(constant value);

  /**
   * Returns the value of the '<em><b>Local Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Rate</em>' attribute.
   * @see #setLocalRate(double)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getlocal_rate_LocalRate()
   * @model
   * @generated
   */
  double getLocalRate();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.local_rate#getLocalRate <em>Local Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Rate</em>' attribute.
   * @see #getLocalRate()
   * @generated
   */
  void setLocalRate(double value);

} // local_rate
