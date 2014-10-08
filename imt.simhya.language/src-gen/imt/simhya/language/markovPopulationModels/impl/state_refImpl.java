/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.actual_parameters;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.location;
import imt.simhya.language.markovPopulationModels.population;
import imt.simhya.language.markovPopulationModels.state;
import imt.simhya.language.markovPopulationModels.state_ref;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>state ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.state_refImpl#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.state_refImpl#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.state_refImpl#getLocRef <em>Loc Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.state_refImpl#getAgentStateRef <em>Agent State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.state_refImpl#getPopAgentStateRef <em>Pop Agent State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class state_refImpl extends MinimalEObjectImpl.Container implements state_ref
{
  /**
   * The cached value of the '{@link #getStateRef() <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateRef()
   * @generated
   * @ordered
   */
  protected state stateRef;

  /**
   * The cached value of the '{@link #getActualParameters() <em>Actual Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualParameters()
   * @generated
   * @ordered
   */
  protected actual_parameters actualParameters;

  /**
   * The cached value of the '{@link #getLocRef() <em>Loc Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocRef()
   * @generated
   * @ordered
   */
  protected location locRef;

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
   * The cached value of the '{@link #getPopAgentStateRef() <em>Pop Agent State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopAgentStateRef()
   * @generated
   * @ordered
   */
  protected population popAgentStateRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected state_refImpl()
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
    return MarkovPopulationModelsPackage.Literals.STATE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state getStateRef()
  {
    if (stateRef != null && stateRef.eIsProxy())
    {
      InternalEObject oldStateRef = (InternalEObject)stateRef;
      stateRef = (state)eResolveProxy(oldStateRef);
      if (stateRef != oldStateRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.STATE_REF__STATE_REF, oldStateRef, stateRef));
      }
    }
    return stateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state basicGetStateRef()
  {
    return stateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateRef(state newStateRef)
  {
    state oldStateRef = stateRef;
    stateRef = newStateRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_REF__STATE_REF, oldStateRef, stateRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public actual_parameters getActualParameters()
  {
    return actualParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActualParameters(actual_parameters newActualParameters, NotificationChain msgs)
  {
    actual_parameters oldActualParameters = actualParameters;
    actualParameters = newActualParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS, oldActualParameters, newActualParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActualParameters(actual_parameters newActualParameters)
  {
    if (newActualParameters != actualParameters)
    {
      NotificationChain msgs = null;
      if (actualParameters != null)
        msgs = ((InternalEObject)actualParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS, null, msgs);
      if (newActualParameters != null)
        msgs = ((InternalEObject)newActualParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS, null, msgs);
      msgs = basicSetActualParameters(newActualParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS, newActualParameters, newActualParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public location getLocRef()
  {
    if (locRef != null && locRef.eIsProxy())
    {
      InternalEObject oldLocRef = (InternalEObject)locRef;
      locRef = (location)eResolveProxy(oldLocRef);
      if (locRef != oldLocRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.STATE_REF__LOC_REF, oldLocRef, locRef));
      }
    }
    return locRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public location basicGetLocRef()
  {
    return locRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocRef(location newLocRef)
  {
    location oldLocRef = locRef;
    locRef = newLocRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_REF__LOC_REF, oldLocRef, locRef));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.STATE_REF__AGENT_STATE_REF, oldAgentStateRef, agentStateRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_REF__AGENT_STATE_REF, oldAgentStateRef, agentStateRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public population getPopAgentStateRef()
  {
    if (popAgentStateRef != null && popAgentStateRef.eIsProxy())
    {
      InternalEObject oldPopAgentStateRef = (InternalEObject)popAgentStateRef;
      popAgentStateRef = (population)eResolveProxy(oldPopAgentStateRef);
      if (popAgentStateRef != oldPopAgentStateRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.STATE_REF__POP_AGENT_STATE_REF, oldPopAgentStateRef, popAgentStateRef));
      }
    }
    return popAgentStateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public population basicGetPopAgentStateRef()
  {
    return popAgentStateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopAgentStateRef(population newPopAgentStateRef)
  {
    population oldPopAgentStateRef = popAgentStateRef;
    popAgentStateRef = newPopAgentStateRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_REF__POP_AGENT_STATE_REF, oldPopAgentStateRef, popAgentStateRef));
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
      case MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS:
        return basicSetActualParameters(null, msgs);
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
      case MarkovPopulationModelsPackage.STATE_REF__STATE_REF:
        if (resolve) return getStateRef();
        return basicGetStateRef();
      case MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS:
        return getActualParameters();
      case MarkovPopulationModelsPackage.STATE_REF__LOC_REF:
        if (resolve) return getLocRef();
        return basicGetLocRef();
      case MarkovPopulationModelsPackage.STATE_REF__AGENT_STATE_REF:
        if (resolve) return getAgentStateRef();
        return basicGetAgentStateRef();
      case MarkovPopulationModelsPackage.STATE_REF__POP_AGENT_STATE_REF:
        if (resolve) return getPopAgentStateRef();
        return basicGetPopAgentStateRef();
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
      case MarkovPopulationModelsPackage.STATE_REF__STATE_REF:
        setStateRef((state)newValue);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS:
        setActualParameters((actual_parameters)newValue);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__LOC_REF:
        setLocRef((location)newValue);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__AGENT_STATE_REF:
        setAgentStateRef((agent)newValue);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__POP_AGENT_STATE_REF:
        setPopAgentStateRef((population)newValue);
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
      case MarkovPopulationModelsPackage.STATE_REF__STATE_REF:
        setStateRef((state)null);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS:
        setActualParameters((actual_parameters)null);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__LOC_REF:
        setLocRef((location)null);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__AGENT_STATE_REF:
        setAgentStateRef((agent)null);
        return;
      case MarkovPopulationModelsPackage.STATE_REF__POP_AGENT_STATE_REF:
        setPopAgentStateRef((population)null);
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
      case MarkovPopulationModelsPackage.STATE_REF__STATE_REF:
        return stateRef != null;
      case MarkovPopulationModelsPackage.STATE_REF__ACTUAL_PARAMETERS:
        return actualParameters != null;
      case MarkovPopulationModelsPackage.STATE_REF__LOC_REF:
        return locRef != null;
      case MarkovPopulationModelsPackage.STATE_REF__AGENT_STATE_REF:
        return agentStateRef != null;
      case MarkovPopulationModelsPackage.STATE_REF__POP_AGENT_STATE_REF:
        return popAgentStateRef != null;
    }
    return super.eIsSet(featureID);
  }

} //state_refImpl
