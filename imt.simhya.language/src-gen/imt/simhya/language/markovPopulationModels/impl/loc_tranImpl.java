/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.action_cond;
import imt.simhya.language.markovPopulationModels.loc_tran;
import imt.simhya.language.markovPopulationModels.state;
import imt.simhya.language.markovPopulationModels.state_cond;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>loc tran</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.loc_tranImpl#getStateRef <em>State Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.loc_tranImpl#getSCond <em>SCond</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.loc_tranImpl#getACond <em>ACond</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class loc_tranImpl extends MinimalEObjectImpl.Container implements loc_tran
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
   * The cached value of the '{@link #getSCond() <em>SCond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSCond()
   * @generated
   * @ordered
   */
  protected state_cond sCond;

  /**
   * The cached value of the '{@link #getACond() <em>ACond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getACond()
   * @generated
   * @ordered
   */
  protected action_cond aCond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected loc_tranImpl()
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
    return MarkovPopulationModelsPackage.Literals.LOC_TRAN;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.LOC_TRAN__STATE_REF, oldStateRef, stateRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__STATE_REF, oldStateRef, stateRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state_cond getSCond()
  {
    return sCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSCond(state_cond newSCond, NotificationChain msgs)
  {
    state_cond oldSCond = sCond;
    sCond = newSCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__SCOND, oldSCond, newSCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSCond(state_cond newSCond)
  {
    if (newSCond != sCond)
    {
      NotificationChain msgs = null;
      if (sCond != null)
        msgs = ((InternalEObject)sCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__SCOND, null, msgs);
      if (newSCond != null)
        msgs = ((InternalEObject)newSCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__SCOND, null, msgs);
      msgs = basicSetSCond(newSCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__SCOND, newSCond, newSCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public action_cond getACond()
  {
    return aCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetACond(action_cond newACond, NotificationChain msgs)
  {
    action_cond oldACond = aCond;
    aCond = newACond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__ACOND, oldACond, newACond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setACond(action_cond newACond)
  {
    if (newACond != aCond)
    {
      NotificationChain msgs = null;
      if (aCond != null)
        msgs = ((InternalEObject)aCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__ACOND, null, msgs);
      if (newACond != null)
        msgs = ((InternalEObject)newACond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__ACOND, null, msgs);
      msgs = basicSetACond(newACond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__ACOND, newACond, newACond));
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
      case MarkovPopulationModelsPackage.LOC_TRAN__SCOND:
        return basicSetSCond(null, msgs);
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        return basicSetACond(null, msgs);
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
      case MarkovPopulationModelsPackage.LOC_TRAN__STATE_REF:
        if (resolve) return getStateRef();
        return basicGetStateRef();
      case MarkovPopulationModelsPackage.LOC_TRAN__SCOND:
        return getSCond();
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        return getACond();
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
      case MarkovPopulationModelsPackage.LOC_TRAN__STATE_REF:
        setStateRef((state)newValue);
        return;
      case MarkovPopulationModelsPackage.LOC_TRAN__SCOND:
        setSCond((state_cond)newValue);
        return;
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        setACond((action_cond)newValue);
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
      case MarkovPopulationModelsPackage.LOC_TRAN__STATE_REF:
        setStateRef((state)null);
        return;
      case MarkovPopulationModelsPackage.LOC_TRAN__SCOND:
        setSCond((state_cond)null);
        return;
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        setACond((action_cond)null);
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
      case MarkovPopulationModelsPackage.LOC_TRAN__STATE_REF:
        return stateRef != null;
      case MarkovPopulationModelsPackage.LOC_TRAN__SCOND:
        return sCond != null;
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        return aCond != null;
    }
    return super.eIsSet(featureID);
  }

} //loc_tranImpl
