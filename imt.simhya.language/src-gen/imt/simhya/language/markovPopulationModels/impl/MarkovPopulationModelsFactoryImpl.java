/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkovPopulationModelsFactoryImpl extends EFactoryImpl implements MarkovPopulationModelsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MarkovPopulationModelsFactory init()
  {
    try
    {
      MarkovPopulationModelsFactory theMarkovPopulationModelsFactory = (MarkovPopulationModelsFactory)EPackage.Registry.INSTANCE.getEFactory(MarkovPopulationModelsPackage.eNS_URI);
      if (theMarkovPopulationModelsFactory != null)
      {
        return theMarkovPopulationModelsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MarkovPopulationModelsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkovPopulationModelsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MarkovPopulationModelsPackage.MAIN: return createmain();
      case MarkovPopulationModelsPackage.CONSTANT: return createconstant();
      case MarkovPopulationModelsPackage.EXPR: return createexpr();
      case MarkovPopulationModelsPackage.PARAMS: return createparams();
      case MarkovPopulationModelsPackage.ACTUAL_PARAMETERS: return createactual_parameters();
      case MarkovPopulationModelsPackage.AGENT: return createagent();
      case MarkovPopulationModelsPackage.LABEL: return createlabel();
      case MarkovPopulationModelsPackage.STATE: return createstate();
      case MarkovPopulationModelsPackage.ACTION: return createaction();
      case MarkovPopulationModelsPackage.EXPROVA: return createexprova();
      case MarkovPopulationModelsPackage.POPULATION: return createpopulation();
      case MarkovPopulationModelsPackage.INIT: return createinit();
      case MarkovPopulationModelsPackage.STATE_INIT: return createstateInit();
      case MarkovPopulationModelsPackage.GL_TRAN: return creategl_tran();
      case MarkovPopulationModelsPackage.GENERATOR: return creategenerator();
      case MarkovPopulationModelsPackage.LOC_TRAN: return createloc_tran();
      case MarkovPopulationModelsPackage.STATE_COND: return createstate_cond();
      case MarkovPopulationModelsPackage.STATE_REF: return createstate_ref();
      case MarkovPopulationModelsPackage.ACTION_COND: return createaction_cond();
      case MarkovPopulationModelsPackage.ANYSTATE: return createanystate();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public main createmain()
  {
    mainImpl main = new mainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr createexpr()
  {
    exprImpl expr = new exprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public params createparams()
  {
    paramsImpl params = new paramsImpl();
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_parameters createactual_parameters()
  {
    actual_parametersImpl actual_parameters = new actual_parametersImpl();
    return actual_parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public agent createagent()
  {
    agentImpl agent = new agentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label createlabel()
  {
    labelImpl label = new labelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state createstate()
  {
    stateImpl state = new stateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public action createaction()
  {
    actionImpl action = new actionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprova createexprova()
  {
    exprovaImpl exprova = new exprovaImpl();
    return exprova;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public population createpopulation()
  {
    populationImpl population = new populationImpl();
    return population;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public init createinit()
  {
    initImpl init = new initImpl();
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stateInit createstateInit()
  {
    stateInitImpl stateInit = new stateInitImpl();
    return stateInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public gl_tran creategl_tran()
  {
    gl_tranImpl gl_tran = new gl_tranImpl();
    return gl_tran;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public generator creategenerator()
  {
    generatorImpl generator = new generatorImpl();
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public loc_tran createloc_tran()
  {
    loc_tranImpl loc_tran = new loc_tranImpl();
    return loc_tran;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state_cond createstate_cond()
  {
    state_condImpl state_cond = new state_condImpl();
    return state_cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state_ref createstate_ref()
  {
    state_refImpl state_ref = new state_refImpl();
    return state_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public action_cond createaction_cond()
  {
    action_condImpl action_cond = new action_condImpl();
    return action_cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public anystate createanystate()
  {
    anystateImpl anystate = new anystateImpl();
    return anystate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkovPopulationModelsPackage getMarkovPopulationModelsPackage()
  {
    return (MarkovPopulationModelsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MarkovPopulationModelsPackage getPackage()
  {
    return MarkovPopulationModelsPackage.eINSTANCE;
  }

} //MarkovPopulationModelsFactoryImpl
