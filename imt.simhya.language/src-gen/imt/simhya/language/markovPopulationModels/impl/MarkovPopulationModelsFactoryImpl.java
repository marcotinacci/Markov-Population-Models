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
      case MarkovPopulationModelsPackage.POPULATION: return createpopulation();
      case MarkovPopulationModelsPackage.INIT: return createinit();
      case MarkovPopulationModelsPackage.STATE_INIT: return createstateInit();
      case MarkovPopulationModelsPackage.GL_TRAN: return creategl_tran();
      case MarkovPopulationModelsPackage.LOC_TRAN: return createloc_tran();
      case MarkovPopulationModelsPackage.STATE_COND: return createstate_cond();
      case MarkovPopulationModelsPackage.STATE_REF: return createstate_ref();
      case MarkovPopulationModelsPackage.ACTION_COND: return createaction_cond();
      case MarkovPopulationModelsPackage.AGENT: return createagent();
      case MarkovPopulationModelsPackage.LABEL: return createlabel();
      case MarkovPopulationModelsPackage.STATE: return createstate();
      case MarkovPopulationModelsPackage.EXPRESSION: return createExpression();
      case MarkovPopulationModelsPackage.ACTION: return createaction();
      case MarkovPopulationModelsPackage.ANYSTATE: return createanystate();
      case MarkovPopulationModelsPackage.SUMMATION_SUBTRACTION: return createSummationSubtraction();
      case MarkovPopulationModelsPackage.MULTIPLICATION_DIVISION: return createMultiplicationDivision();
      case MarkovPopulationModelsPackage.INT_EXPRESSION: return createIntExpression();
      case MarkovPopulationModelsPackage.FLOAT_EXPRESSION: return createFloatExpression();
      case MarkovPopulationModelsPackage.REFERENCE: return createReference();
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
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
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
  public SummationSubtraction createSummationSubtraction()
  {
    SummationSubtractionImpl summationSubtraction = new SummationSubtractionImpl();
    return summationSubtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationDivision createMultiplicationDivision()
  {
    MultiplicationDivisionImpl multiplicationDivision = new MultiplicationDivisionImpl();
    return multiplicationDivision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpression createIntExpression()
  {
    IntExpressionImpl intExpression = new IntExpressionImpl();
    return intExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatExpression createFloatExpression()
  {
    FloatExpressionImpl floatExpression = new FloatExpressionImpl();
    return floatExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
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
