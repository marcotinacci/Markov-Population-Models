/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.actual_parameters;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.expr;
import imt.simhya.language.markovPopulationModels.init;
import imt.simhya.language.markovPopulationModels.location;
import imt.simhya.language.markovPopulationModels.population;
import imt.simhya.language.markovPopulationModels.stateInit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.initImpl#getAgentRef <em>Agent Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.initImpl#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.initImpl#getStates <em>States</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.initImpl#getLocRef <em>Loc Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.initImpl#getPopRef <em>Pop Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.initImpl#getCard <em>Card</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class initImpl extends MinimalEObjectImpl.Container implements init
{
  /**
   * The cached value of the '{@link #getAgentRef() <em>Agent Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentRef()
   * @generated
   * @ordered
   */
  protected agent agentRef;

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
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<stateInit> states;

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
   * The cached value of the '{@link #getPopRef() <em>Pop Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopRef()
   * @generated
   * @ordered
   */
  protected population popRef;

  /**
   * The cached value of the '{@link #getCard() <em>Card</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCard()
   * @generated
   * @ordered
   */
  protected expr card;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected initImpl()
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
    return MarkovPopulationModelsPackage.Literals.INIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public agent getAgentRef()
  {
    if (agentRef != null && agentRef.eIsProxy())
    {
      InternalEObject oldAgentRef = (InternalEObject)agentRef;
      agentRef = (agent)eResolveProxy(oldAgentRef);
      if (agentRef != oldAgentRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.INIT__AGENT_REF, oldAgentRef, agentRef));
      }
    }
    return agentRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public agent basicGetAgentRef()
  {
    return agentRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgentRef(agent newAgentRef)
  {
    agent oldAgentRef = agentRef;
    agentRef = newAgentRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.INIT__AGENT_REF, oldAgentRef, agentRef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS, oldActualParameters, newActualParameters);
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
        msgs = ((InternalEObject)actualParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS, null, msgs);
      if (newActualParameters != null)
        msgs = ((InternalEObject)newActualParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS, null, msgs);
      msgs = basicSetActualParameters(newActualParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS, newActualParameters, newActualParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<stateInit> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<stateInit>(stateInit.class, this, MarkovPopulationModelsPackage.INIT__STATES);
    }
    return states;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.INIT__LOC_REF, oldLocRef, locRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.INIT__LOC_REF, oldLocRef, locRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public population getPopRef()
  {
    if (popRef != null && popRef.eIsProxy())
    {
      InternalEObject oldPopRef = (InternalEObject)popRef;
      popRef = (population)eResolveProxy(oldPopRef);
      if (popRef != oldPopRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.INIT__POP_REF, oldPopRef, popRef));
      }
    }
    return popRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public population basicGetPopRef()
  {
    return popRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopRef(population newPopRef)
  {
    population oldPopRef = popRef;
    popRef = newPopRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.INIT__POP_REF, oldPopRef, popRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getCard()
  {
    return card;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCard(expr newCard, NotificationChain msgs)
  {
    expr oldCard = card;
    card = newCard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.INIT__CARD, oldCard, newCard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCard(expr newCard)
  {
    if (newCard != card)
    {
      NotificationChain msgs = null;
      if (card != null)
        msgs = ((InternalEObject)card).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.INIT__CARD, null, msgs);
      if (newCard != null)
        msgs = ((InternalEObject)newCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.INIT__CARD, null, msgs);
      msgs = basicSetCard(newCard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.INIT__CARD, newCard, newCard));
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
      case MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS:
        return basicSetActualParameters(null, msgs);
      case MarkovPopulationModelsPackage.INIT__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.INIT__CARD:
        return basicSetCard(null, msgs);
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
      case MarkovPopulationModelsPackage.INIT__AGENT_REF:
        if (resolve) return getAgentRef();
        return basicGetAgentRef();
      case MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS:
        return getActualParameters();
      case MarkovPopulationModelsPackage.INIT__STATES:
        return getStates();
      case MarkovPopulationModelsPackage.INIT__LOC_REF:
        if (resolve) return getLocRef();
        return basicGetLocRef();
      case MarkovPopulationModelsPackage.INIT__POP_REF:
        if (resolve) return getPopRef();
        return basicGetPopRef();
      case MarkovPopulationModelsPackage.INIT__CARD:
        return getCard();
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
      case MarkovPopulationModelsPackage.INIT__AGENT_REF:
        setAgentRef((agent)newValue);
        return;
      case MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS:
        setActualParameters((actual_parameters)newValue);
        return;
      case MarkovPopulationModelsPackage.INIT__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends stateInit>)newValue);
        return;
      case MarkovPopulationModelsPackage.INIT__LOC_REF:
        setLocRef((location)newValue);
        return;
      case MarkovPopulationModelsPackage.INIT__POP_REF:
        setPopRef((population)newValue);
        return;
      case MarkovPopulationModelsPackage.INIT__CARD:
        setCard((expr)newValue);
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
      case MarkovPopulationModelsPackage.INIT__AGENT_REF:
        setAgentRef((agent)null);
        return;
      case MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS:
        setActualParameters((actual_parameters)null);
        return;
      case MarkovPopulationModelsPackage.INIT__STATES:
        getStates().clear();
        return;
      case MarkovPopulationModelsPackage.INIT__LOC_REF:
        setLocRef((location)null);
        return;
      case MarkovPopulationModelsPackage.INIT__POP_REF:
        setPopRef((population)null);
        return;
      case MarkovPopulationModelsPackage.INIT__CARD:
        setCard((expr)null);
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
      case MarkovPopulationModelsPackage.INIT__AGENT_REF:
        return agentRef != null;
      case MarkovPopulationModelsPackage.INIT__ACTUAL_PARAMETERS:
        return actualParameters != null;
      case MarkovPopulationModelsPackage.INIT__STATES:
        return states != null && !states.isEmpty();
      case MarkovPopulationModelsPackage.INIT__LOC_REF:
        return locRef != null;
      case MarkovPopulationModelsPackage.INIT__POP_REF:
        return popRef != null;
      case MarkovPopulationModelsPackage.INIT__CARD:
        return card != null;
    }
    return super.eIsSet(featureID);
  }

} //initImpl
