/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.main#getConstDef <em>Const Def</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.main#getPopulationDef <em>Population Def</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.main#getAgentDef <em>Agent Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getmain()
 * @model
 * @generated
 */
public interface main extends EObject
{
  /**
   * Returns the value of the '<em><b>Const Def</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Def</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getmain_ConstDef()
   * @model containment="true"
   * @generated
   */
  EList<constant> getConstDef();

  /**
   * Returns the value of the '<em><b>Population Def</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.population}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Population Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Population Def</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getmain_PopulationDef()
   * @model containment="true"
   * @generated
   */
  EList<population> getPopulationDef();

  /**
   * Returns the value of the '<em><b>Agent Def</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.agent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Def</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getmain_AgentDef()
   * @model containment="true"
   * @generated
   */
  EList<agent> getAgentDef();

} // main
