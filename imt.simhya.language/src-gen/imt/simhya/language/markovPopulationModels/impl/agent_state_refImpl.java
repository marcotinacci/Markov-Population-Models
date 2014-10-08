/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.agent_state_ref;
import imt.simhya.language.markovPopulationModels.state_ref;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>agent state ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.agent_state_refImpl#getAgentStateRef <em>Agent State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.agent_state_refImpl#getStateRef <em>State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class agent_state_refImpl extends MinimalEObjectImpl.Container implements agent_state_ref
{
  /**
   * The cached value of the '{@link #getAgentStateRef() <em>Agent State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentStateRef()
   * @generated
   * @ordered
   */
  protected agent agentStateRef;

  /**
   * The cached value of the '{@link #getStateRef() <em>State Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateRef()
   * @generated
   * @ordered
   */
  protected state_ref stateRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected agent_state_refImpl()
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
    return MarkovPopulationModelsPackage.Literals.AGENT_STATE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public agent getAgentStateRef()
  {
    if (agentStateRef != null && agentStateRef.eIsProxy())
    {
      InternalEObject oldAgentStateRef = (InternalEObject)agentStateRef;
      agentStateRef = (agent)eResolveProxy(oldAgentStateRef);
      if (agentStateRef != oldAgentStateRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.AGENT_STATE_REF__AGENT_STATE_REF, oldAgentStateRef, agentStateRef));
      }
    }
    return agentStateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public agent basicGetAgentStateRef()
  {
    return agentStateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgentStateRef(agent newAgentStateRef)
  {
    agent oldAgentStateRef = agentStateRef;
    agentStateRef = newAgentStateRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.AGENT_STATE_REF__AGENT_STATE_REF, oldAgentStateRef, agentStateRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state_ref getStateRef()
  {
    return stateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateRef(state_ref newStateRef, NotificationChain msgs)
  {
    state_ref oldStateRef = stateRef;
    stateRef = newStateRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF, oldStateRef, newStateRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateRef(state_ref newStateRef)
  {
    if (newStateRef != stateRef)
    {
      NotificationChain msgs = null;
      if (stateRef != null)
        msgs = ((InternalEObject)stateRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF, null, msgs);
      if (newStateRef != null)
        msgs = ((InternalEObject)newStateRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF, null, msgs);
      msgs = basicSetStateRef(newStateRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF, newStateRef, newStateRef));
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
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF:
        return basicSetStateRef(null, msgs);
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
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__AGENT_STATE_REF:
        if (resolve) return getAgentStateRef();
        return basicGetAgentStateRef();
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF:
        return getStateRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__AGENT_STATE_REF:
        setAgentStateRef((agent)newValue);
        return;
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF:
        setStateRef((state_ref)newValue);
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
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__AGENT_STATE_REF:
        setAgentStateRef((agent)null);
        return;
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF:
        setStateRef((state_ref)null);
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
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__AGENT_STATE_REF:
        return agentStateRef != null;
      case MarkovPopulationModelsPackage.AGENT_STATE_REF__STATE_REF:
        return stateRef != null;
    }
    return super.eIsSet(featureID);
  }

} //agent_state_refImpl
