/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.actual_parameters;
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
    }
    return super.eIsSet(featureID);
  }

} //state_refImpl
