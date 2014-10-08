/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.agent#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.agent#getParamList <em>Param List</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.agent#getAct <em>Act</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.agent#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent()
 * @model
 * @generated
 */
public interface agent extends EObject
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
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.agent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param List</em>' containment reference.
   * @see #setParamList(params)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent_ParamList()
   * @model containment="true"
   * @generated
   */
  params getParamList();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.agent#getParamList <em>Param List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param List</em>' containment reference.
   * @see #getParamList()
   * @generated
   */
  void setParamList(params value);

  /**
   * Returns the value of the '<em><b>Act</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Act</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent_Act()
   * @model containment="true"
   * @generated
   */
  EList<label> getAct();

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.state}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getagent_S()
   * @model containment="true"
   * @generated
   */
  EList<state> getS();

} // agent
