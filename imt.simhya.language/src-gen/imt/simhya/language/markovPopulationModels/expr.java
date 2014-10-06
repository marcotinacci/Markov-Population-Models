/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.expr#getConstRef <em>Const Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.expr#getConstFLOAT <em>Const FLOAT</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.expr#getConstINT <em>Const INT</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getexpr()
 * @model
 * @generated
 */
public interface expr extends EObject
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getexpr_ConstRef()
   * @model
   * @generated
   */
  constant getConstRef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.expr#getConstRef <em>Const Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Ref</em>' reference.
   * @see #getConstRef()
   * @generated
   */
  void setConstRef(constant value);

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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getexpr_ConstFLOAT()
   * @model
   * @generated
   */
  double getConstFLOAT();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.expr#getConstFLOAT <em>Const FLOAT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const FLOAT</em>' attribute.
   * @see #getConstFLOAT()
   * @generated
   */
  void setConstFLOAT(double value);

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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getexpr_ConstINT()
   * @model
   * @generated
   */
  int getConstINT();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.expr#getConstINT <em>Const INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const INT</em>' attribute.
   * @see #getConstINT()
   * @generated
   */
  void setConstINT(int value);

} // expr
