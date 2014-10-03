/**
 */
package imt.simhya.language.markovPopulationModels.util;

import imt.simhya.language.markovPopulationModels.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage
 * @generated
 */
public class MarkovPopulationModelsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MarkovPopulationModelsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkovPopulationModelsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MarkovPopulationModelsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MarkovPopulationModelsPackage.MAIN:
      {
        main main = (main)theEObject;
        T result = casemain(main);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.POPULATION:
      {
        population population = (population)theEObject;
        T result = casepopulation(population);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.INIT:
      {
        init init = (init)theEObject;
        T result = caseinit(init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.STATE_INIT:
      {
        stateInit stateInit = (stateInit)theEObject;
        T result = casestateInit(stateInit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.GL_TRAN:
      {
        gl_tran gl_tran = (gl_tran)theEObject;
        T result = casegl_tran(gl_tran);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.LOC_TRAN:
      {
        loc_tran loc_tran = (loc_tran)theEObject;
        T result = caseloc_tran(loc_tran);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.STATE_COND:
      {
        state_cond state_cond = (state_cond)theEObject;
        T result = casestate_cond(state_cond);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.STATE_REF:
      {
        state_ref state_ref = (state_ref)theEObject;
        T result = casestate_ref(state_ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.ACTION_COND:
      {
        action_cond action_cond = (action_cond)theEObject;
        T result = caseaction_cond(action_cond);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.AGENT:
      {
        agent agent = (agent)theEObject;
        T result = caseagent(agent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.LABEL:
      {
        label label = (label)theEObject;
        T result = caselabel(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.STATE:
      {
        state state = (state)theEObject;
        T result = casestate(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.ACTION:
      {
        action action = (action)theEObject;
        T result = caseaction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkovPopulationModelsPackage.ANYSTATE:
      {
        anystate anystate = (anystate)theEObject;
        T result = caseanystate(anystate);
        if (result == null) result = casestate_cond(anystate);
        if (result == null) result = caseaction_cond(anystate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>main</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>main</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemain(main object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>population</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>population</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepopulation(population object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinit(init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>state Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>state Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestateInit(stateInit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>gl tran</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>gl tran</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegl_tran(gl_tran object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>loc tran</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>loc tran</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseloc_tran(loc_tran object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>state cond</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>state cond</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestate_cond(state_cond object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>state ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>state ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestate_ref(state_ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>action cond</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>action cond</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaction_cond(action_cond object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>agent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>agent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseagent(agent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselabel(label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>state</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>state</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestate(state object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaction(action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>anystate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>anystate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseanystate(anystate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MarkovPopulationModelsSwitch
