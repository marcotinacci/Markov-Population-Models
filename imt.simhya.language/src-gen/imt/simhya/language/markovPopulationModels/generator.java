/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.generator#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.generator#getValueEXP <em>Value EXP</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.generator#getValueMin <em>Value Min</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.generator#getValueMax <em>Value Max</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.generator#getValueList <em>Value List</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgenerator()
 * @model
 * @generated
 */
public interface generator extends EObject
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgenerator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.generator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value EXP</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value EXP</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value EXP</em>' containment reference.
   * @see #setValueEXP(expr)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgenerator_ValueEXP()
   * @model containment="true"
   * @generated
   */
  expr getValueEXP();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.generator#getValueEXP <em>Value EXP</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value EXP</em>' containment reference.
   * @see #getValueEXP()
   * @generated
   */
  void setValueEXP(expr value);

  /**
   * Returns the value of the '<em><b>Value Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Min</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Min</em>' containment reference.
   * @see #setValueMin(expr)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgenerator_ValueMin()
   * @model containment="true"
   * @generated
   */
  expr getValueMin();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.generator#getValueMin <em>Value Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Min</em>' containment reference.
   * @see #getValueMin()
   * @generated
   */
  void setValueMin(expr value);

  /**
   * Returns the value of the '<em><b>Value Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Max</em>' containment reference.
   * @see #setValueMax(expr)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgenerator_ValueMax()
   * @model containment="true"
   * @generated
   */
  expr getValueMax();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.generator#getValueMax <em>Value Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Max</em>' containment reference.
   * @see #getValueMax()
   * @generated
   */
  void setValueMax(expr value);

  /**
   * Returns the value of the '<em><b>Value List</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value List</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getgenerator_ValueList()
   * @model containment="true"
   * @generated
   */
  EList<expr> getValueList();

} // generator
