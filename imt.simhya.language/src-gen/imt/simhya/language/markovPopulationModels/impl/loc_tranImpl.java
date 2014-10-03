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
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.loc_tranImpl#getS_cond <em>Scond</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.loc_tranImpl#getA_cond <em>Acond</em>}</li>
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
   * The cached value of the '{@link #getS_cond() <em>Scond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS_cond()
   * @generated
   * @ordered
   */
  protected state_cond s_cond;

  /**
   * The cached value of the '{@link #getA_cond() <em>Acond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA_cond()
   * @generated
   * @ordered
   */
  protected action_cond a_cond;

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
  public state_cond getS_cond()
  {
    return s_cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS_cond(state_cond newS_cond, NotificationChain msgs)
  {
    state_cond oldS_cond = s_cond;
    s_cond = newS_cond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__SCOND, oldS_cond, newS_cond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS_cond(state_cond newS_cond)
  {
    if (newS_cond != s_cond)
    {
      NotificationChain msgs = null;
      if (s_cond != null)
        msgs = ((InternalEObject)s_cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__SCOND, null, msgs);
      if (newS_cond != null)
        msgs = ((InternalEObject)newS_cond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__SCOND, null, msgs);
      msgs = basicSetS_cond(newS_cond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__SCOND, newS_cond, newS_cond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public action_cond getA_cond()
  {
    return a_cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA_cond(action_cond newA_cond, NotificationChain msgs)
  {
    action_cond oldA_cond = a_cond;
    a_cond = newA_cond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__ACOND, oldA_cond, newA_cond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA_cond(action_cond newA_cond)
  {
    if (newA_cond != a_cond)
    {
      NotificationChain msgs = null;
      if (a_cond != null)
        msgs = ((InternalEObject)a_cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__ACOND, null, msgs);
      if (newA_cond != null)
        msgs = ((InternalEObject)newA_cond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.LOC_TRAN__ACOND, null, msgs);
      msgs = basicSetA_cond(newA_cond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOC_TRAN__ACOND, newA_cond, newA_cond));
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
        return basicSetS_cond(null, msgs);
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        return basicSetA_cond(null, msgs);
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
        return getS_cond();
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        return getA_cond();
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
        setS_cond((state_cond)newValue);
        return;
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        setA_cond((action_cond)newValue);
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
        setS_cond((state_cond)null);
        return;
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        setA_cond((action_cond)null);
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
        return s_cond != null;
      case MarkovPopulationModelsPackage.LOC_TRAN__ACOND:
        return a_cond != null;
    }
    return super.eIsSet(featureID);
  }

} //loc_tranImpl
