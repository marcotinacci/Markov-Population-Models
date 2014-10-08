/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.expr;
import imt.simhya.language.markovPopulationModels.generator;

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
 * An implementation of the model object '<em><b>generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.generatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.generatorImpl#getValueEXP <em>Value EXP</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.generatorImpl#getValueMin <em>Value Min</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.generatorImpl#getValueMax <em>Value Max</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.generatorImpl#getValueList <em>Value List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class generatorImpl extends MinimalEObjectImpl.Container implements generator
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
   * The cached value of the '{@link #getValueEXP() <em>Value EXP</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueEXP()
   * @generated
   * @ordered
   */
  protected expr valueEXP;

  /**
   * The cached value of the '{@link #getValueMin() <em>Value Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueMin()
   * @generated
   * @ordered
   */
  protected expr valueMin;

  /**
   * The cached value of the '{@link #getValueMax() <em>Value Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueMax()
   * @generated
   * @ordered
   */
  protected expr valueMax;

  /**
   * The cached value of the '{@link #getValueList() <em>Value List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueList()
   * @generated
   * @ordered
   */
  protected EList<expr> valueList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected generatorImpl()
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
    return MarkovPopulationModelsPackage.Literals.GENERATOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GENERATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getValueEXP()
  {
    return valueEXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueEXP(expr newValueEXP, NotificationChain msgs)
  {
    expr oldValueEXP = valueEXP;
    valueEXP = newValueEXP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP, oldValueEXP, newValueEXP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueEXP(expr newValueEXP)
  {
    if (newValueEXP != valueEXP)
    {
      NotificationChain msgs = null;
      if (valueEXP != null)
        msgs = ((InternalEObject)valueEXP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP, null, msgs);
      if (newValueEXP != null)
        msgs = ((InternalEObject)newValueEXP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP, null, msgs);
      msgs = basicSetValueEXP(newValueEXP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP, newValueEXP, newValueEXP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getValueMin()
  {
    return valueMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueMin(expr newValueMin, NotificationChain msgs)
  {
    expr oldValueMin = valueMin;
    valueMin = newValueMin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN, oldValueMin, newValueMin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueMin(expr newValueMin)
  {
    if (newValueMin != valueMin)
    {
      NotificationChain msgs = null;
      if (valueMin != null)
        msgs = ((InternalEObject)valueMin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN, null, msgs);
      if (newValueMin != null)
        msgs = ((InternalEObject)newValueMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN, null, msgs);
      msgs = basicSetValueMin(newValueMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN, newValueMin, newValueMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr getValueMax()
  {
    return valueMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueMax(expr newValueMax, NotificationChain msgs)
  {
    expr oldValueMax = valueMax;
    valueMax = newValueMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX, oldValueMax, newValueMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueMax(expr newValueMax)
  {
    if (newValueMax != valueMax)
    {
      NotificationChain msgs = null;
      if (valueMax != null)
        msgs = ((InternalEObject)valueMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX, null, msgs);
      if (newValueMax != null)
        msgs = ((InternalEObject)newValueMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX, null, msgs);
      msgs = basicSetValueMax(newValueMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX, newValueMax, newValueMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expr> getValueList()
  {
    if (valueList == null)
    {
      valueList = new EObjectContainmentEList<expr>(expr.class, this, MarkovPopulationModelsPackage.GENERATOR__VALUE_LIST);
    }
    return valueList;
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
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP:
        return basicSetValueEXP(null, msgs);
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN:
        return basicSetValueMin(null, msgs);
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX:
        return basicSetValueMax(null, msgs);
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_LIST:
        return ((InternalEList<?>)getValueList()).basicRemove(otherEnd, msgs);
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
      case MarkovPopulationModelsPackage.GENERATOR__NAME:
        return getName();
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP:
        return getValueEXP();
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN:
        return getValueMin();
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX:
        return getValueMax();
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_LIST:
        return getValueList();
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
      case MarkovPopulationModelsPackage.GENERATOR__NAME:
        setName((String)newValue);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP:
        setValueEXP((expr)newValue);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN:
        setValueMin((expr)newValue);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX:
        setValueMax((expr)newValue);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_LIST:
        getValueList().clear();
        getValueList().addAll((Collection<? extends expr>)newValue);
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
      case MarkovPopulationModelsPackage.GENERATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP:
        setValueEXP((expr)null);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN:
        setValueMin((expr)null);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX:
        setValueMax((expr)null);
        return;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_LIST:
        getValueList().clear();
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
      case MarkovPopulationModelsPackage.GENERATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_EXP:
        return valueEXP != null;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MIN:
        return valueMin != null;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_MAX:
        return valueMax != null;
      case MarkovPopulationModelsPackage.GENERATOR__VALUE_LIST:
        return valueList != null && !valueList.isEmpty();
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

} //generatorImpl
