/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.expr;
import imt.simhya.language.markovPopulationModels.generator;
import imt.simhya.language.markovPopulationModels.gl_tran;
import imt.simhya.language.markovPopulationModels.loc_tran;

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
 * An implementation of the model object '<em><b>gl tran</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.gl_tranImpl#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.gl_tranImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.gl_tranImpl#getLTran <em>LTran</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.gl_tranImpl#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class gl_tranImpl extends MinimalEObjectImpl.Container implements gl_tran
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerators()
   * @generated
   * @ordered
   */
  protected EList<generator> generators;

  /**
   * The cached value of the '{@link #getLTran() <em>LTran</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLTran()
   * @generated
   * @ordered
   */
  protected EList<loc_tran> lTran;

  /**
   * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
  protected expr rate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected gl_tranImpl()
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
    return MarkovPopulationModelsPackage.Literals.GL_TRAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GL_TRAN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<generator> getGenerators()
  {
    if (generators == null)
    {
      generators = new EObjectContainmentEList<generator>(generator.class, this, MarkovPopulationModelsPackage.GL_TRAN__GENERATORS);
    }
    return generators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<loc_tran> getLTran()
  {
    if (lTran == null)
    {
      lTran = new EObjectContainmentEList<loc_tran>(loc_tran.class, this, MarkovPopulationModelsPackage.GL_TRAN__LTRAN);
    }
    return lTran;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getRate()
  {
    return rate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRate(expr newRate, NotificationChain msgs)
  {
    expr oldRate = rate;
    rate = newRate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GL_TRAN__RATE, oldRate, newRate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRate(expr newRate)
  {
    if (newRate != rate)
    {
      NotificationChain msgs = null;
      if (rate != null)
        msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GL_TRAN__RATE, null, msgs);
      if (newRate != null)
        msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GL_TRAN__RATE, null, msgs);
      msgs = basicSetRate(newRate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GL_TRAN__RATE, newRate, newRate));
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
      case MarkovPopulationModelsPackage.GL_TRAN__GENERATORS:
        return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.GL_TRAN__LTRAN:
        return ((InternalEList<?>)getLTran()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.GL_TRAN__RATE:
        return basicSetRate(null, msgs);
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
      case MarkovPopulationModelsPackage.GL_TRAN__NAME:
        return getName();
      case MarkovPopulationModelsPackage.GL_TRAN__GENERATORS:
        return getGenerators();
      case MarkovPopulationModelsPackage.GL_TRAN__LTRAN:
        return getLTran();
      case MarkovPopulationModelsPackage.GL_TRAN__RATE:
        return getRate();
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
      case MarkovPopulationModelsPackage.GL_TRAN__NAME:
        setName((String)newValue);
        return;
      case MarkovPopulationModelsPackage.GL_TRAN__GENERATORS:
        getGenerators().clear();
        getGenerators().addAll((Collection<? extends generator>)newValue);
        return;
      case MarkovPopulationModelsPackage.GL_TRAN__LTRAN:
        getLTran().clear();
        getLTran().addAll((Collection<? extends loc_tran>)newValue);
        return;
      case MarkovPopulationModelsPackage.GL_TRAN__RATE:
        setRate((expr)newValue);
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
      case MarkovPopulationModelsPackage.GL_TRAN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MarkovPopulationModelsPackage.GL_TRAN__GENERATORS:
        getGenerators().clear();
        return;
      case MarkovPopulationModelsPackage.GL_TRAN__LTRAN:
        getLTran().clear();
        return;
      case MarkovPopulationModelsPackage.GL_TRAN__RATE:
        setRate((expr)null);
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
      case MarkovPopulationModelsPackage.GL_TRAN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MarkovPopulationModelsPackage.GL_TRAN__GENERATORS:
        return generators != null && !generators.isEmpty();
      case MarkovPopulationModelsPackage.GL_TRAN__LTRAN:
        return lTran != null && !lTran.isEmpty();
      case MarkovPopulationModelsPackage.GL_TRAN__RATE:
        return rate != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //gl_tranImpl
