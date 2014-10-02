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
      case MarkovPopulationModelsPackage.AGENT: return createagent();
      case MarkovPopulationModelsPackage.LABEL: return createlabel();
      case MarkovPopulationModelsPackage.STATE: return createstate();
      case MarkovPopulationModelsPackage.ACTION: return createaction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
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
