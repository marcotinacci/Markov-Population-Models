/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
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
   * Returns the value of the '<em><b>Population Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Population Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Population Def</em>' containment reference.
   * @see #setPopulationDef(population)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getmain_PopulationDef()
   * @model containment="true"
   * @generated
   */
  population getPopulationDef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.main#getPopulationDef <em>Population Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Population Def</em>' containment reference.
   * @see #getPopulationDef()
   * @generated
   */
  void setPopulationDef(population value);

  /**
   * Returns the value of the '<em><b>Agent Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Def</em>' containment reference.
   * @see #setAgentDef(agent)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getmain_AgentDef()
   * @model containment="true"
   * @generated
   */
  agent getAgentDef();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.main#getAgentDef <em>Agent Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent Def</em>' containment reference.
   * @see #getAgentDef()
   * @generated
   */
  void setAgentDef(agent value);

} // main
