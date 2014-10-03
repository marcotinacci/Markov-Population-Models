/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>gl tran</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.gl_tran#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.gl_tran#getL_tran <em>Ltran</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.gl_tran#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgl_tran()
 * @model
 * @generated
 */
public interface gl_tran extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgl_tran_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.gl_tran#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ltran</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.loc_tran}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ltran</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ltran</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgl_tran_L_tran()
   * @model containment="true"
   * @generated
   */
  EList<loc_tran> getL_tran();

  /**
   * Returns the value of the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' attribute.
   * @see #setRate(double)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgl_tran_Rate()
   * @model
   * @generated
   */
  double getRate();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.gl_tran#getRate <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' attribute.
   * @see #getRate()
   * @generated
   */
  void setRate(double value);

} // gl_tran
