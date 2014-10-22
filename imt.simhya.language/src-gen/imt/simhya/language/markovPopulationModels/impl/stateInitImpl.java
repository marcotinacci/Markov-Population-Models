/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.Expression;
import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.stateInit;
import imt.simhya.language.markovPopulationModels.state_ref;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>state Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.stateInitImpl#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.stateInitImpl#getCard <em>Card</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class stateInitImpl extends MinimalEObjectImpl.Container implements stateInit
{
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
   * The cached value of the '{@link #getCard() <em>Card</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCard()
   * @generated
   * @ordered
   */
  protected Expression card;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stateInitImpl()
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
    return MarkovPopulationModelsPackage.Literals.STATE_INIT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_INIT__STATE_REF, oldStateRef, newStateRef);
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
        msgs = ((InternalEObject)stateRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.STATE_INIT__STATE_REF, null, msgs);
      if (newStateRef != null)
        msgs = ((InternalEObject)newStateRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.STATE_INIT__STATE_REF, null, msgs);
      msgs = basicSetStateRef(newStateRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_INIT__STATE_REF, newStateRef, newStateRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCard()
  {
    return card;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCard(Expression newCard, NotificationChain msgs)
  {
    Expression oldCard = card;
    card = newCard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_INIT__CARD, oldCard, newCard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCard(Expression newCard)
  {
    if (newCard != card)
    {
      NotificationChain msgs = null;
      if (card != null)
        msgs = ((InternalEObject)card).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.STATE_INIT__CARD, null, msgs);
      if (newCard != null)
        msgs = ((InternalEObject)newCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.STATE_INIT__CARD, null, msgs);
      msgs = basicSetCard(newCard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.STATE_INIT__CARD, newCard, newCard));
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
      case MarkovPopulationModelsPackage.STATE_INIT__STATE_REF:
        return basicSetStateRef(null, msgs);
      case MarkovPopulationModelsPackage.STATE_INIT__CARD:
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
      case MarkovPopulationModelsPackage.STATE_INIT__STATE_REF:
        return getStateRef();
      case MarkovPopulationModelsPackage.STATE_INIT__CARD:
        return getCard();
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
      case MarkovPopulationModelsPackage.STATE_INIT__STATE_REF:
        setStateRef((state_ref)newValue);
        return;
      case MarkovPopulationModelsPackage.STATE_INIT__CARD:
        setCard((Expression)newValue);
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
      case MarkovPopulationModelsPackage.STATE_INIT__STATE_REF:
        setStateRef((state_ref)null);
        return;
      case MarkovPopulationModelsPackage.STATE_INIT__CARD:
        setCard((Expression)null);
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
      case MarkovPopulationModelsPackage.STATE_INIT__STATE_REF:
        return stateRef != null;
      case MarkovPopulationModelsPackage.STATE_INIT__CARD:
        return card != null;
    }
    return super.eIsSet(featureID);
  }

} //stateInitImpl
