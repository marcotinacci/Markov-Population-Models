/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsFactory
 * @model kind="package"
 * @generated
 */
public interface MarkovPopulationModelsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "markovPopulationModels";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.simhya.imt/language/MarkovPopulationModels";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "markovPopulationModels";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MarkovPopulationModelsPackage eINSTANCE = imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl.init();

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.agentImpl <em>agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.agentImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getagent()
   * @generated
   */
  int AGENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Act</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__ACT = 1;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__S = 2;

  /**
   * The number of structural features of the '<em>agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.labelImpl <em>label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.labelImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getlabel()
   * @generated
   */
  int LABEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = 0;

  /**
   * The number of structural features of the '<em>label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.stateImpl <em>state</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.stateImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstate()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Spontaneous act</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SPONTANEOUS_ACT = 1;

  /**
   * The number of structural features of the '<em>state</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.actionImpl <em>action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.actionImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getaction()
   * @generated
   */
  int ACTION = 3;

  /**
   * The feature id for the '<em><b>Act Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACT_REF = 0;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__STATE_REF = 1;

  /**
   * The feature id for the '<em><b>Local Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__LOCAL_RATE = 2;

  /**
   * The number of structural features of the '<em>action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.agent <em>agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>agent</em>'.
   * @see imt.simhya.language.markovPopulationModels.agent
   * @generated
   */
  EClass getagent();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see imt.simhya.language.markovPopulationModels.agent#getName()
   * @see #getagent()
   * @generated
   */
  EAttribute getagent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.agent#getAct <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Act</em>'.
   * @see imt.simhya.language.markovPopulationModels.agent#getAct()
   * @see #getagent()
   * @generated
   */
  EReference getagent_Act();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.agent#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>S</em>'.
   * @see imt.simhya.language.markovPopulationModels.agent#getS()
   * @see #getagent()
   * @generated
   */
  EReference getagent_S();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.label <em>label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>label</em>'.
   * @see imt.simhya.language.markovPopulationModels.label
   * @generated
   */
  EClass getlabel();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see imt.simhya.language.markovPopulationModels.label#getName()
   * @see #getlabel()
   * @generated
   */
  EAttribute getlabel_Name();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.state <em>state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>state</em>'.
   * @see imt.simhya.language.markovPopulationModels.state
   * @generated
   */
  EClass getstate();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.state#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see imt.simhya.language.markovPopulationModels.state#getName()
   * @see #getstate()
   * @generated
   */
  EAttribute getstate_Name();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.state#getSpontaneous_act <em>Spontaneous act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Spontaneous act</em>'.
   * @see imt.simhya.language.markovPopulationModels.state#getSpontaneous_act()
   * @see #getstate()
   * @generated
   */
  EReference getstate_Spontaneous_act();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.action <em>action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>action</em>'.
   * @see imt.simhya.language.markovPopulationModels.action
   * @generated
   */
  EClass getaction();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.action#getActRef <em>Act Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Act Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.action#getActRef()
   * @see #getaction()
   * @generated
   */
  EReference getaction_ActRef();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.action#getStateRef <em>State Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.action#getStateRef()
   * @see #getaction()
   * @generated
   */
  EReference getaction_StateRef();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.action#getLocalRate <em>Local Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Rate</em>'.
   * @see imt.simhya.language.markovPopulationModels.action#getLocalRate()
   * @see #getaction()
   * @generated
   */
  EAttribute getaction_LocalRate();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MarkovPopulationModelsFactory getMarkovPopulationModelsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.agentImpl <em>agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.agentImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getagent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getagent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getagent_Name();

    /**
     * The meta object literal for the '<em><b>Act</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__ACT = eINSTANCE.getagent_Act();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__S = eINSTANCE.getagent_S();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.labelImpl <em>label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.labelImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getlabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getlabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getlabel_Name();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.stateImpl <em>state</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.stateImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstate()
     * @generated
     */
    EClass STATE = eINSTANCE.getstate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getstate_Name();

    /**
     * The meta object literal for the '<em><b>Spontaneous act</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SPONTANEOUS_ACT = eINSTANCE.getstate_Spontaneous_act();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.actionImpl <em>action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.actionImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getaction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getaction();

    /**
     * The meta object literal for the '<em><b>Act Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ACT_REF = eINSTANCE.getaction_ActRef();

    /**
     * The meta object literal for the '<em><b>State Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__STATE_REF = eINSTANCE.getaction_StateRef();

    /**
     * The meta object literal for the '<em><b>Local Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__LOCAL_RATE = eINSTANCE.getaction_LocalRate();

  }

} //MarkovPopulationModelsPackage
