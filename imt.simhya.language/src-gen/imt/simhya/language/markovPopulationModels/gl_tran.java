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
 *   <li>{@link imt.simhya.language.markovPopulationModels.gl_tran#getLTran <em>LTran</em>}</li>
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
   * Returns the value of the '<em><b>LTran</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.loc_tran}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LTran</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LTran</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgl_tran_LTran()
   * @model containment="true"
   * @generated
   */
  EList<loc_tran> getLTran();

  /**
   * Returns the value of the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' containment reference.
   * @see #setRate(expr)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgl_tran_Rate()
   * @model containment="true"
   * @generated
   */
  expr getRate();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.gl_tran#getRate <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' containment reference.
   * @see #getRate()
   * @generated
   */
  void setRate(expr value);

} // gl_tran
