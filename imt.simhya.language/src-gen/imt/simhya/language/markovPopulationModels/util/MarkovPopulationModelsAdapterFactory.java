/**
 */
package imt.simhya.language.markovPopulationModels.util;

import imt.simhya.language.markovPopulationModels.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage
 * @generated
 */
public class MarkovPopulationModelsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MarkovPopulationModelsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkovPopulationModelsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MarkovPopulationModelsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarkovPopulationModelsSwitch<Adapter> modelSwitch =
    new MarkovPopulationModelsSwitch<Adapter>()
    {
      @Override
      public Adapter casemain(main object)
      {
        return createmainAdapter();
      }
      @Override
      public Adapter caseconstant(constant object)
      {
        return createconstantAdapter();
      }
      @Override
      public Adapter caseexpr(expr object)
      {
        return createexprAdapter();
      }
      @Override
      public Adapter caseparams(params object)
      {
        return createparamsAdapter();
      }
      @Override
      public Adapter caseactual_parameters(actual_parameters object)
      {
        return createactual_parametersAdapter();
      }
      @Override
      public Adapter caseagent(agent object)
      {
        return createagentAdapter();
      }
      @Override
      public Adapter caselabel(label object)
      {
        return createlabelAdapter();
      }
      @Override
      public Adapter casestate(state object)
      {
        return createstateAdapter();
      }
      @Override
      public Adapter caseaction(action object)
      {
        return createactionAdapter();
      }
      @Override
      public Adapter caseexprova(exprova object)
      {
        return createexprovaAdapter();
      }
      @Override
      public Adapter casepopulation(population object)
      {
        return createpopulationAdapter();
      }
      @Override
      public Adapter caseinit(init object)
      {
        return createinitAdapter();
      }
      @Override
      public Adapter casestateInit(stateInit object)
      {
        return createstateInitAdapter();
      }
      @Override
      public Adapter casegl_tran(gl_tran object)
      {
        return creategl_tranAdapter();
      }
      @Override
      public Adapter casegenerator(generator object)
      {
        return creategeneratorAdapter();
      }
      @Override
      public Adapter caseloc_tran(loc_tran object)
      {
        return createloc_tranAdapter();
      }
      @Override
      public Adapter casestate_cond(state_cond object)
      {
        return createstate_condAdapter();
      }
      @Override
      public Adapter casestate_ref(state_ref object)
      {
        return createstate_refAdapter();
      }
      @Override
      public Adapter caseagent_state_ref(agent_state_ref object)
      {
        return createagent_state_refAdapter();
      }
      @Override
      public Adapter caseaction_cond(action_cond object)
      {
        return createaction_condAdapter();
      }
      @Override
      public Adapter caseanystate(anystate object)
      {
        return createanystateAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.main <em>main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.main
   * @generated
   */
  public Adapter createmainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.constant
   * @generated
   */
  public Adapter createconstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.expr
   * @generated
   */
  public Adapter createexprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.params <em>params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.params
   * @generated
   */
  public Adapter createparamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.actual_parameters <em>actual parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.actual_parameters
   * @generated
   */
  public Adapter createactual_parametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.agent <em>agent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.agent
   * @generated
   */
  public Adapter createagentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.label <em>label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.label
   * @generated
   */
  public Adapter createlabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.state <em>state</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.state
   * @generated
   */
  public Adapter createstateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.action <em>action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.action
   * @generated
   */
  public Adapter createactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.exprova <em>exprova</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.exprova
   * @generated
   */
  public Adapter createexprovaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.population <em>population</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.population
   * @generated
   */
  public Adapter createpopulationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.init <em>init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.init
   * @generated
   */
  public Adapter createinitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.stateInit <em>state Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.stateInit
   * @generated
   */
  public Adapter createstateInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.gl_tran <em>gl tran</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.gl_tran
   * @generated
   */
  public Adapter creategl_tranAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.generator <em>generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.generator
   * @generated
   */
  public Adapter creategeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.loc_tran <em>loc tran</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.loc_tran
   * @generated
   */
  public Adapter createloc_tranAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.state_cond <em>state cond</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.state_cond
   * @generated
   */
  public Adapter createstate_condAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.state_ref <em>state ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.state_ref
   * @generated
   */
  public Adapter createstate_refAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.agent_state_ref <em>agent state ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.agent_state_ref
   * @generated
   */
  public Adapter createagent_state_refAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.action_cond <em>action cond</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.action_cond
   * @generated
   */
  public Adapter createaction_condAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link imt.simhya.language.markovPopulationModels.anystate <em>anystate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see imt.simhya.language.markovPopulationModels.anystate
   * @generated
   */
  public Adapter createanystateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MarkovPopulationModelsAdapterFactory
