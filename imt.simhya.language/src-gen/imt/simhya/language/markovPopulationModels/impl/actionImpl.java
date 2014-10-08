/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.action;
import imt.simhya.language.markovPopulationModels.expr;
import imt.simhya.language.markovPopulationModels.exprova;
import imt.simhya.language.markovPopulationModels.label;
import imt.simhya.language.markovPopulationModels.state;

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
 * An implementation of the model object '<em><b>action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.actionImpl#getActRef <em>Act Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.actionImpl#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.actionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.actionImpl#getLocalRate <em>Local Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class actionImpl extends MinimalEObjectImpl.Container implements action
{
  /**
   * The cached value of the '{@link #getActRef() <em>Act Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActRef()
   * @generated
   * @ordered
   */
  protected label actRef;

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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<exprova> params;

  /**
   * The cached value of the '{@link #getLocalRate() <em>Local Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalRate()
   * @generated
   * @ordered
   */
  protected expr localRate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected actionImpl()
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
    return MarkovPopulationModelsPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label getActRef()
  {
    if (actRef != null && actRef.eIsProxy())
    {
      InternalEObject oldActRef = (InternalEObject)actRef;
      actRef = (label)eResolveProxy(oldActRef);
      if (actRef != oldActRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.ACTION__ACT_REF, oldActRef, actRef));
      }
    }
    return actRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label basicGetActRef()
  {
    return actRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActRef(label newActRef)
  {
    label oldActRef = actRef;
    actRef = newActRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.ACTION__ACT_REF, oldActRef, actRef));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.ACTION__STATE_REF, oldStateRef, stateRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.ACTION__STATE_REF, oldStateRef, stateRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<exprova> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<exprova>(exprova.class, this, MarkovPopulationModelsPackage.ACTION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getLocalRate()
  {
    return localRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocalRate(expr newLocalRate, NotificationChain msgs)
  {
    expr oldLocalRate = localRate;
    localRate = newLocalRate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.ACTION__LOCAL_RATE, oldLocalRate, newLocalRate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalRate(expr newLocalRate)
  {
    if (newLocalRate != localRate)
    {
      NotificationChain msgs = null;
      if (localRate != null)
        msgs = ((InternalEObject)localRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.ACTION__LOCAL_RATE, null, msgs);
      if (newLocalRate != null)
        msgs = ((InternalEObject)newLocalRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.ACTION__LOCAL_RATE, null, msgs);
      msgs = basicSetLocalRate(newLocalRate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.ACTION__LOCAL_RATE, newLocalRate, newLocalRate));
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
      case MarkovPopulationModelsPackage.ACTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.ACTION__LOCAL_RATE:
        return basicSetLocalRate(null, msgs);
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
      case MarkovPopulationModelsPackage.ACTION__ACT_REF:
        if (resolve) return getActRef();
        return basicGetActRef();
      case MarkovPopulationModelsPackage.ACTION__STATE_REF:
        if (resolve) return getStateRef();
        return basicGetStateRef();
      case MarkovPopulationModelsPackage.ACTION__PARAMS:
        return getParams();
      case MarkovPopulationModelsPackage.ACTION__LOCAL_RATE:
        return getLocalRate();
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
      case MarkovPopulationModelsPackage.ACTION__ACT_REF:
        setActRef((label)newValue);
        return;
      case MarkovPopulationModelsPackage.ACTION__STATE_REF:
        setStateRef((state)newValue);
        return;
      case MarkovPopulationModelsPackage.ACTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends exprova>)newValue);
        return;
      case MarkovPopulationModelsPackage.ACTION__LOCAL_RATE:
        setLocalRate((expr)newValue);
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
      case MarkovPopulationModelsPackage.ACTION__ACT_REF:
        setActRef((label)null);
        return;
      case MarkovPopulationModelsPackage.ACTION__STATE_REF:
        setStateRef((state)null);
        return;
      case MarkovPopulationModelsPackage.ACTION__PARAMS:
        getParams().clear();
        return;
      case MarkovPopulationModelsPackage.ACTION__LOCAL_RATE:
        setLocalRate((expr)null);
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
      case MarkovPopulationModelsPackage.ACTION__ACT_REF:
        return actRef != null;
      case MarkovPopulationModelsPackage.ACTION__STATE_REF:
        return stateRef != null;
      case MarkovPopulationModelsPackage.ACTION__PARAMS:
        return params != null && !params.isEmpty();
      case MarkovPopulationModelsPackage.ACTION__LOCAL_RATE:
        return localRate != null;
    }
    return super.eIsSet(featureID);
  }

} //actionImpl
