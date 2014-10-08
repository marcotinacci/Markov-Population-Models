/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.agent_state_ref;
import imt.simhya.language.markovPopulationModels.state_cond;
import imt.simhya.language.markovPopulationModels.state_ref;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>state cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.state_condImpl#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.state_condImpl#getAgentStateRef <em>Agent State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class state_condImpl extends MinimalEObjectImpl.Container implements state_cond
{
  /**
   * The cached value of the '{@link #getStateRef() <em>State Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateRef()
   * @generated
   * @ordered
   */
  protected EList<state_ref> stateRef;

  /**
   * The cached value of the '{@link #getAgentStateRef() <em>Agent State Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentStateRef()
   * @generated
   * @ordered
   */
  protected EList<agent_state_ref> agentStateRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected state_condImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MarkovPopulationModelsPackage.Literals.STATE_COND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<state_ref> getStateRef()
  {
    if (stateRef == null)
    {
      stateRef = new EObjectContainmentEList<state_ref>(state_ref.class, this, MarkovPopulationModelsPackage.STATE_COND__STATE_REF);
    }
    return stateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<agent_state_ref> getAgentStateRef()
  {
    if (agentStateRef == null)
    {
      agentStateRef = new EObjectContainmentEList<agent_state_ref>(agent_state_ref.class, this, MarkovPopulationModelsPackage.STATE_COND__AGENT_STATE_REF);
    }
    return agentStateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MarkovPopulationModelsPackage.STATE_COND__STATE_REF:
        return ((InternalEList<?>)getStateRef()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.STATE_COND__AGENT_STATE_REF:
        return ((InternalEList<?>)getAgentStateRef()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MarkovPopulationModelsPackage.STATE_COND__STATE_REF:
        return getStateRef();
      case MarkovPopulationModelsPackage.STATE_COND__AGENT_STATE_REF:
        return getAgentStateRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MarkovPopulationModelsPackage.STATE_COND__STATE_REF:
        getStateRef().clear();
        getStateRef().addAll((Collection<? extends state_ref>)newValue);
        return;
      case MarkovPopulationModelsPackage.STATE_COND__AGENT_STATE_REF:
        getAgentStateRef().clear();
        getAgentStateRef().addAll((Collection<? extends agent_state_ref>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MarkovPopulationModelsPackage.STATE_COND__STATE_REF:
        getStateRef().clear();
        return;
      case MarkovPopulationModelsPackage.STATE_COND__AGENT_STATE_REF:
        getAgentStateRef().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MarkovPopulationModelsPackage.STATE_COND__STATE_REF:
        return stateRef != null && !stateRef.isEmpty();
      case MarkovPopulationModelsPackage.STATE_COND__AGENT_STATE_REF:
        return agentStateRef != null && !agentStateRef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //state_condImpl
