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
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.mainImpl <em>main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.mainImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getmain()
   * @generated
   */
  int MAIN = 0;

  /**
   * The feature id for the '<em><b>Const Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__CONST_DEF = 0;

  /**
   * The feature id for the '<em><b>Population Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__POPULATION_DEF = 1;

  /**
   * The feature id for the '<em><b>Agent Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__AGENT_DEF = 2;

  /**
   * The number of structural features of the '<em>main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.constantImpl <em>constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.constantImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getconstant()
   * @generated
   */
  int CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 0;

  /**
   * The feature id for the '<em><b>Const INT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__CONST_INT = 1;

  /**
   * The feature id for the '<em><b>Const FLOAT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__CONST_FLOAT = 2;

  /**
   * The number of structural features of the '<em>constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.agentImpl <em>agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.agentImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getagent()
   * @generated
   */
  int AGENT = 2;

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
  int LABEL = 3;

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
  int STATE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Spontaneous Act</b></em>' containment reference list.
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
  int ACTION = 5;

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
   * The feature id for the '<em><b>Local Rate</b></em>' containment reference.
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
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.local_rateImpl <em>local rate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.local_rateImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getlocal_rate()
   * @generated
   */
  int LOCAL_RATE = 6;

  /**
   * The feature id for the '<em><b>Const Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_RATE__CONST_REF = 0;

  /**
   * The feature id for the '<em><b>Local Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_RATE__LOCAL_RATE = 1;

  /**
   * The number of structural features of the '<em>local rate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_RATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.populationImpl <em>population</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.populationImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getpopulation()
   * @generated
   */
  int POPULATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPULATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Agents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPULATION__AGENTS = 1;

  /**
   * The feature id for the '<em><b>Tran</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPULATION__TRAN = 2;

  /**
   * The number of structural features of the '<em>population</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPULATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.initImpl <em>init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.initImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getinit()
   * @generated
   */
  int INIT = 8;

  /**
   * The feature id for the '<em><b>Agent Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__AGENT_REF = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__STATES = 1;

  /**
   * The number of structural features of the '<em>init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.stateInitImpl <em>state Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.stateInitImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstateInit()
   * @generated
   */
  int STATE_INIT = 9;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INIT__STATE_REF = 0;

  /**
   * The feature id for the '<em><b>Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INIT__CARD = 1;

  /**
   * The number of structural features of the '<em>state Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.gl_tranImpl <em>gl tran</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.gl_tranImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getgl_tran()
   * @generated
   */
  int GL_TRAN = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GL_TRAN__NAME = 0;

  /**
   * The feature id for the '<em><b>LTran</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GL_TRAN__LTRAN = 1;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GL_TRAN__RATE = 2;

  /**
   * The number of structural features of the '<em>gl tran</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GL_TRAN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.loc_tranImpl <em>loc tran</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.loc_tranImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getloc_tran()
   * @generated
   */
  int LOC_TRAN = 11;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_TRAN__STATE_REF = 0;

  /**
   * The feature id for the '<em><b>SCond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_TRAN__SCOND = 1;

  /**
   * The feature id for the '<em><b>ACond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_TRAN__ACOND = 2;

  /**
   * The number of structural features of the '<em>loc tran</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_TRAN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.state_condImpl <em>state cond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.state_condImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstate_cond()
   * @generated
   */
  int STATE_COND = 12;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_COND__STATE_REF = 0;

  /**
   * The number of structural features of the '<em>state cond</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_COND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.state_refImpl <em>state ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.state_refImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstate_ref()
   * @generated
   */
  int STATE_REF = 13;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REF__STATE_REF = 0;

  /**
   * The number of structural features of the '<em>state ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.action_condImpl <em>action cond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.action_condImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getaction_cond()
   * @generated
   */
  int ACTION_COND = 14;

  /**
   * The feature id for the '<em><b>Action Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COND__ACTION_REF = 0;

  /**
   * The number of structural features of the '<em>action cond</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_COND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.exprImpl <em>expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.exprImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getexpr()
   * @generated
   */
  int EXPR = 15;

  /**
   * The feature id for the '<em><b>Const Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__CONST_REF = 0;

  /**
   * The feature id for the '<em><b>Const FLOAT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__CONST_FLOAT = 1;

  /**
   * The feature id for the '<em><b>Const INT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__CONST_INT = 2;

  /**
   * The number of structural features of the '<em>expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link imt.simhya.language.markovPopulationModels.impl.anystateImpl <em>anystate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see imt.simhya.language.markovPopulationModels.impl.anystateImpl
   * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getanystate()
   * @generated
   */
  int ANYSTATE = 16;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYSTATE__STATE_REF = STATE_COND__STATE_REF;

  /**
   * The feature id for the '<em><b>Action Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYSTATE__ACTION_REF = STATE_COND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>anystate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYSTATE_FEATURE_COUNT = STATE_COND_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.main <em>main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>main</em>'.
   * @see imt.simhya.language.markovPopulationModels.main
   * @generated
   */
  EClass getmain();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.main#getConstDef <em>Const Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Const Def</em>'.
   * @see imt.simhya.language.markovPopulationModels.main#getConstDef()
   * @see #getmain()
   * @generated
   */
  EReference getmain_ConstDef();

  /**
   * Returns the meta object for the containment reference '{@link imt.simhya.language.markovPopulationModels.main#getPopulationDef <em>Population Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Population Def</em>'.
   * @see imt.simhya.language.markovPopulationModels.main#getPopulationDef()
   * @see #getmain()
   * @generated
   */
  EReference getmain_PopulationDef();

  /**
   * Returns the meta object for the containment reference '{@link imt.simhya.language.markovPopulationModels.main#getAgentDef <em>Agent Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Agent Def</em>'.
   * @see imt.simhya.language.markovPopulationModels.main#getAgentDef()
   * @see #getmain()
   * @generated
   */
  EReference getmain_AgentDef();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant</em>'.
   * @see imt.simhya.language.markovPopulationModels.constant
   * @generated
   */
  EClass getconstant();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see imt.simhya.language.markovPopulationModels.constant#getName()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Name();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.constant#getConstINT <em>Const INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const INT</em>'.
   * @see imt.simhya.language.markovPopulationModels.constant#getConstINT()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_ConstINT();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.constant#getConstFLOAT <em>Const FLOAT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const FLOAT</em>'.
   * @see imt.simhya.language.markovPopulationModels.constant#getConstFLOAT()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_ConstFLOAT();

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
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.state#getSpontaneousAct <em>Spontaneous Act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Spontaneous Act</em>'.
   * @see imt.simhya.language.markovPopulationModels.state#getSpontaneousAct()
   * @see #getstate()
   * @generated
   */
  EReference getstate_SpontaneousAct();

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
   * Returns the meta object for the containment reference '{@link imt.simhya.language.markovPopulationModels.action#getLocalRate <em>Local Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Rate</em>'.
   * @see imt.simhya.language.markovPopulationModels.action#getLocalRate()
   * @see #getaction()
   * @generated
   */
  EReference getaction_LocalRate();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.local_rate <em>local rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>local rate</em>'.
   * @see imt.simhya.language.markovPopulationModels.local_rate
   * @generated
   */
  EClass getlocal_rate();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.local_rate#getConstRef <em>Const Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Const Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.local_rate#getConstRef()
   * @see #getlocal_rate()
   * @generated
   */
  EReference getlocal_rate_ConstRef();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.local_rate#getLocalRate <em>Local Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Rate</em>'.
   * @see imt.simhya.language.markovPopulationModels.local_rate#getLocalRate()
   * @see #getlocal_rate()
   * @generated
   */
  EAttribute getlocal_rate_LocalRate();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.population <em>population</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>population</em>'.
   * @see imt.simhya.language.markovPopulationModels.population
   * @generated
   */
  EClass getpopulation();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.population#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see imt.simhya.language.markovPopulationModels.population#getName()
   * @see #getpopulation()
   * @generated
   */
  EAttribute getpopulation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.population#getAgents <em>Agents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agents</em>'.
   * @see imt.simhya.language.markovPopulationModels.population#getAgents()
   * @see #getpopulation()
   * @generated
   */
  EReference getpopulation_Agents();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.population#getTran <em>Tran</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tran</em>'.
   * @see imt.simhya.language.markovPopulationModels.population#getTran()
   * @see #getpopulation()
   * @generated
   */
  EReference getpopulation_Tran();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.init <em>init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>init</em>'.
   * @see imt.simhya.language.markovPopulationModels.init
   * @generated
   */
  EClass getinit();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.init#getAgentRef <em>Agent Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Agent Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.init#getAgentRef()
   * @see #getinit()
   * @generated
   */
  EReference getinit_AgentRef();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.init#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see imt.simhya.language.markovPopulationModels.init#getStates()
   * @see #getinit()
   * @generated
   */
  EReference getinit_States();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.stateInit <em>state Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>state Init</em>'.
   * @see imt.simhya.language.markovPopulationModels.stateInit
   * @generated
   */
  EClass getstateInit();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.stateInit#getStateRef <em>State Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.stateInit#getStateRef()
   * @see #getstateInit()
   * @generated
   */
  EReference getstateInit_StateRef();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.stateInit#getCard <em>Card</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Card</em>'.
   * @see imt.simhya.language.markovPopulationModels.stateInit#getCard()
   * @see #getstateInit()
   * @generated
   */
  EAttribute getstateInit_Card();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.gl_tran <em>gl tran</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>gl tran</em>'.
   * @see imt.simhya.language.markovPopulationModels.gl_tran
   * @generated
   */
  EClass getgl_tran();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.gl_tran#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see imt.simhya.language.markovPopulationModels.gl_tran#getName()
   * @see #getgl_tran()
   * @generated
   */
  EAttribute getgl_tran_Name();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.gl_tran#getLTran <em>LTran</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>LTran</em>'.
   * @see imt.simhya.language.markovPopulationModels.gl_tran#getLTran()
   * @see #getgl_tran()
   * @generated
   */
  EReference getgl_tran_LTran();

  /**
   * Returns the meta object for the containment reference '{@link imt.simhya.language.markovPopulationModels.gl_tran#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rate</em>'.
   * @see imt.simhya.language.markovPopulationModels.gl_tran#getRate()
   * @see #getgl_tran()
   * @generated
   */
  EReference getgl_tran_Rate();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.loc_tran <em>loc tran</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>loc tran</em>'.
   * @see imt.simhya.language.markovPopulationModels.loc_tran
   * @generated
   */
  EClass getloc_tran();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.loc_tran#getStateRef <em>State Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.loc_tran#getStateRef()
   * @see #getloc_tran()
   * @generated
   */
  EReference getloc_tran_StateRef();

  /**
   * Returns the meta object for the containment reference '{@link imt.simhya.language.markovPopulationModels.loc_tran#getSCond <em>SCond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SCond</em>'.
   * @see imt.simhya.language.markovPopulationModels.loc_tran#getSCond()
   * @see #getloc_tran()
   * @generated
   */
  EReference getloc_tran_SCond();

  /**
   * Returns the meta object for the containment reference '{@link imt.simhya.language.markovPopulationModels.loc_tran#getACond <em>ACond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ACond</em>'.
   * @see imt.simhya.language.markovPopulationModels.loc_tran#getACond()
   * @see #getloc_tran()
   * @generated
   */
  EReference getloc_tran_ACond();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.state_cond <em>state cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>state cond</em>'.
   * @see imt.simhya.language.markovPopulationModels.state_cond
   * @generated
   */
  EClass getstate_cond();

  /**
   * Returns the meta object for the containment reference list '{@link imt.simhya.language.markovPopulationModels.state_cond#getStateRef <em>State Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.state_cond#getStateRef()
   * @see #getstate_cond()
   * @generated
   */
  EReference getstate_cond_StateRef();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.state_ref <em>state ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>state ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.state_ref
   * @generated
   */
  EClass getstate_ref();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.state_ref#getStateRef <em>State Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.state_ref#getStateRef()
   * @see #getstate_ref()
   * @generated
   */
  EReference getstate_ref_StateRef();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.action_cond <em>action cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>action cond</em>'.
   * @see imt.simhya.language.markovPopulationModels.action_cond
   * @generated
   */
  EClass getaction_cond();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.action_cond#getActionRef <em>Action Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.action_cond#getActionRef()
   * @see #getaction_cond()
   * @generated
   */
  EReference getaction_cond_ActionRef();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expr</em>'.
   * @see imt.simhya.language.markovPopulationModels.expr
   * @generated
   */
  EClass getexpr();

  /**
   * Returns the meta object for the reference '{@link imt.simhya.language.markovPopulationModels.expr#getConstRef <em>Const Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Const Ref</em>'.
   * @see imt.simhya.language.markovPopulationModels.expr#getConstRef()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_ConstRef();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.expr#getConstFLOAT <em>Const FLOAT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const FLOAT</em>'.
   * @see imt.simhya.language.markovPopulationModels.expr#getConstFLOAT()
   * @see #getexpr()
   * @generated
   */
  EAttribute getexpr_ConstFLOAT();

  /**
   * Returns the meta object for the attribute '{@link imt.simhya.language.markovPopulationModels.expr#getConstINT <em>Const INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const INT</em>'.
   * @see imt.simhya.language.markovPopulationModels.expr#getConstINT()
   * @see #getexpr()
   * @generated
   */
  EAttribute getexpr_ConstINT();

  /**
   * Returns the meta object for class '{@link imt.simhya.language.markovPopulationModels.anystate <em>anystate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>anystate</em>'.
   * @see imt.simhya.language.markovPopulationModels.anystate
   * @generated
   */
  EClass getanystate();

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
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.mainImpl <em>main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.mainImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getmain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getmain();

    /**
     * The meta object literal for the '<em><b>Const Def</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__CONST_DEF = eINSTANCE.getmain_ConstDef();

    /**
     * The meta object literal for the '<em><b>Population Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__POPULATION_DEF = eINSTANCE.getmain_PopulationDef();

    /**
     * The meta object literal for the '<em><b>Agent Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__AGENT_DEF = eINSTANCE.getmain_AgentDef();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.constantImpl <em>constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.constantImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getconstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getconstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getconstant_Name();

    /**
     * The meta object literal for the '<em><b>Const INT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__CONST_INT = eINSTANCE.getconstant_ConstINT();

    /**
     * The meta object literal for the '<em><b>Const FLOAT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__CONST_FLOAT = eINSTANCE.getconstant_ConstFLOAT();

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
     * The meta object literal for the '<em><b>Spontaneous Act</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SPONTANEOUS_ACT = eINSTANCE.getstate_SpontaneousAct();

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
     * The meta object literal for the '<em><b>Local Rate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__LOCAL_RATE = eINSTANCE.getaction_LocalRate();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.local_rateImpl <em>local rate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.local_rateImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getlocal_rate()
     * @generated
     */
    EClass LOCAL_RATE = eINSTANCE.getlocal_rate();

    /**
     * The meta object literal for the '<em><b>Const Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_RATE__CONST_REF = eINSTANCE.getlocal_rate_ConstRef();

    /**
     * The meta object literal for the '<em><b>Local Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_RATE__LOCAL_RATE = eINSTANCE.getlocal_rate_LocalRate();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.populationImpl <em>population</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.populationImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getpopulation()
     * @generated
     */
    EClass POPULATION = eINSTANCE.getpopulation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPULATION__NAME = eINSTANCE.getpopulation_Name();

    /**
     * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POPULATION__AGENTS = eINSTANCE.getpopulation_Agents();

    /**
     * The meta object literal for the '<em><b>Tran</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POPULATION__TRAN = eINSTANCE.getpopulation_Tran();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.initImpl <em>init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.initImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getinit()
     * @generated
     */
    EClass INIT = eINSTANCE.getinit();

    /**
     * The meta object literal for the '<em><b>Agent Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT__AGENT_REF = eINSTANCE.getinit_AgentRef();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT__STATES = eINSTANCE.getinit_States();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.stateInitImpl <em>state Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.stateInitImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstateInit()
     * @generated
     */
    EClass STATE_INIT = eINSTANCE.getstateInit();

    /**
     * The meta object literal for the '<em><b>State Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_INIT__STATE_REF = eINSTANCE.getstateInit_StateRef();

    /**
     * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_INIT__CARD = eINSTANCE.getstateInit_Card();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.gl_tranImpl <em>gl tran</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.gl_tranImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getgl_tran()
     * @generated
     */
    EClass GL_TRAN = eINSTANCE.getgl_tran();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GL_TRAN__NAME = eINSTANCE.getgl_tran_Name();

    /**
     * The meta object literal for the '<em><b>LTran</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GL_TRAN__LTRAN = eINSTANCE.getgl_tran_LTran();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GL_TRAN__RATE = eINSTANCE.getgl_tran_Rate();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.loc_tranImpl <em>loc tran</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.loc_tranImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getloc_tran()
     * @generated
     */
    EClass LOC_TRAN = eINSTANCE.getloc_tran();

    /**
     * The meta object literal for the '<em><b>State Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_TRAN__STATE_REF = eINSTANCE.getloc_tran_StateRef();

    /**
     * The meta object literal for the '<em><b>SCond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_TRAN__SCOND = eINSTANCE.getloc_tran_SCond();

    /**
     * The meta object literal for the '<em><b>ACond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_TRAN__ACOND = eINSTANCE.getloc_tran_ACond();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.state_condImpl <em>state cond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.state_condImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstate_cond()
     * @generated
     */
    EClass STATE_COND = eINSTANCE.getstate_cond();

    /**
     * The meta object literal for the '<em><b>State Ref</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_COND__STATE_REF = eINSTANCE.getstate_cond_StateRef();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.state_refImpl <em>state ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.state_refImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getstate_ref()
     * @generated
     */
    EClass STATE_REF = eINSTANCE.getstate_ref();

    /**
     * The meta object literal for the '<em><b>State Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_REF__STATE_REF = eINSTANCE.getstate_ref_StateRef();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.action_condImpl <em>action cond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.action_condImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getaction_cond()
     * @generated
     */
    EClass ACTION_COND = eINSTANCE.getaction_cond();

    /**
     * The meta object literal for the '<em><b>Action Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_COND__ACTION_REF = eINSTANCE.getaction_cond_ActionRef();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.exprImpl <em>expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.exprImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getexpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getexpr();

    /**
     * The meta object literal for the '<em><b>Const Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__CONST_REF = eINSTANCE.getexpr_ConstRef();

    /**
     * The meta object literal for the '<em><b>Const FLOAT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__CONST_FLOAT = eINSTANCE.getexpr_ConstFLOAT();

    /**
     * The meta object literal for the '<em><b>Const INT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__CONST_INT = eINSTANCE.getexpr_ConstINT();

    /**
     * The meta object literal for the '{@link imt.simhya.language.markovPopulationModels.impl.anystateImpl <em>anystate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imt.simhya.language.markovPopulationModels.impl.anystateImpl
     * @see imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsPackageImpl#getanystate()
     * @generated
     */
    EClass ANYSTATE = eINSTANCE.getanystate();

  }

} //MarkovPopulationModelsPackage
