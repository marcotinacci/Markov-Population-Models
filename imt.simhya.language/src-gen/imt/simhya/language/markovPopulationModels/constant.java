/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.constant#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.constant#getConstINT <em>Const INT</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.constant#getConstFLOAT <em>Const FLOAT</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getconstant()
 * @model
 * @generated
 */
public interface constant extends EObject
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getconstant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.constant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Const INT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const INT</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const INT</em>' attribute.
   * @see #setConstINT(int)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getconstant_ConstINT()
   * @model
   * @generated
   */
  int getConstINT();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.constant#getConstINT <em>Const INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const INT</em>' attribute.
   * @see #getConstINT()
   * @generated
   */
  void setConstINT(int value);

  /**
   * Returns the value of the '<em><b>Const FLOAT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const FLOAT</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const FLOAT</em>' attribute.
   * @see #setConstFLOAT(double)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getconstant_ConstFLOAT()
   * @model
   * @generated
   */
  double getConstFLOAT();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.constant#getConstFLOAT <em>Const FLOAT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const FLOAT</em>' attribute.
   * @see #getConstFLOAT()
   * @generated
   */
  void setConstFLOAT(double value);

} // constant
