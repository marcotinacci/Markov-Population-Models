/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.constant;
import imt.simhya.language.markovPopulationModels.local_rate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>local rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.local_rateImpl#getConstRef <em>Const Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.local_rateImpl#getLocalRate <em>Local Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class local_rateImpl extends MinimalEObjectImpl.Container implements local_rate
{
  /**
   * The cached value of the '{@link #getConstRef() <em>Const Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstRef()
   * @generated
   * @ordered
   */
  protected constant constRef;

  /**
   * The default value of the '{@link #getLocalRate() <em>Local Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalRate()
   * @generated
   * @ordered
   */
  protected static final double LOCAL_RATE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getLocalRate() <em>Local Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalRate()
   * @generated
   * @ordered
   */
  protected double localRate = LOCAL_RATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected local_rateImpl()
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
    return MarkovPopulationModelsPackage.Literals.LOCAL_RATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant getConstRef()
  {
    if (constRef != null && constRef.eIsProxy())
    {
      InternalEObject oldConstRef = (InternalEObject)constRef;
      constRef = (constant)eResolveProxy(oldConstRef);
      if (constRef != oldConstRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.LOCAL_RATE__CONST_REF, oldConstRef, constRef));
      }
    }
    return constRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant basicGetConstRef()
  {
    return constRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstRef(constant newConstRef)
  {
    constant oldConstRef = constRef;
    constRef = newConstRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOCAL_RATE__CONST_REF, oldConstRef, constRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getLocalRate()
  {
    return localRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalRate(double newLocalRate)
  {
    double oldLocalRate = localRate;
    localRate = newLocalRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.LOCAL_RATE__LOCAL_RATE, oldLocalRate, localRate));
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
      case MarkovPopulationModelsPackage.LOCAL_RATE__CONST_REF:
        if (resolve) return getConstRef();
        return basicGetConstRef();
      case MarkovPopulationModelsPackage.LOCAL_RATE__LOCAL_RATE:
        return getLocalRate();
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
      case MarkovPopulationModelsPackage.LOCAL_RATE__CONST_REF:
        setConstRef((constant)newValue);
        return;
      case MarkovPopulationModelsPackage.LOCAL_RATE__LOCAL_RATE:
        setLocalRate((Double)newValue);
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
      case MarkovPopulationModelsPackage.LOCAL_RATE__CONST_REF:
        setConstRef((constant)null);
        return;
      case MarkovPopulationModelsPackage.LOCAL_RATE__LOCAL_RATE:
        setLocalRate(LOCAL_RATE_EDEFAULT);
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
      case MarkovPopulationModelsPackage.LOCAL_RATE__CONST_REF:
        return constRef != null;
      case MarkovPopulationModelsPackage.LOCAL_RATE__LOCAL_RATE:
        return localRate != LOCAL_RATE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (localRate: ");
    result.append(localRate);
    result.append(')');
    return result.toString();
  }

} //local_rateImpl
