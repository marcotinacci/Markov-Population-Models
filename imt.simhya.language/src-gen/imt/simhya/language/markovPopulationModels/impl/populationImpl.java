/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.gl_tran;
import imt.simhya.language.markovPopulationModels.init;
import imt.simhya.language.markovPopulationModels.params;
import imt.simhya.language.markovPopulationModels.population;

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
 * An implementation of the model object '<em><b>population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.populationImpl#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.populationImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.populationImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.populationImpl#getTran <em>Tran</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class populationImpl extends MinimalEObjectImpl.Container implements population
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
   * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamList()
   * @generated
   * @ordered
   */
  protected params paramList;

  /**
   * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgents()
   * @generated
   * @ordered
   */
  protected EList<init> agents;

  /**
   * The cached value of the '{@link #getTran() <em>Tran</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTran()
   * @generated
   * @ordered
   */
  protected EList<gl_tran> tran;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected populationImpl()
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
    return MarkovPopulationModelsPackage.Literals.POPULATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.POPULATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public params getParamList()
  {
    return paramList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamList(params newParamList, NotificationChain msgs)
  {
    params oldParamList = paramList;
    paramList = newParamList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.POPULATION__PARAM_LIST, oldParamList, newParamList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamList(params newParamList)
  {
    if (newParamList != paramList)
    {
      NotificationChain msgs = null;
      if (paramList != null)
        msgs = ((InternalEObject)paramList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.POPULATION__PARAM_LIST, null, msgs);
      if (newParamList != null)
        msgs = ((InternalEObject)newParamList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.POPULATION__PARAM_LIST, null, msgs);
      msgs = basicSetParamList(newParamList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.POPULATION__PARAM_LIST, newParamList, newParamList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<init> getAgents()
  {
    if (agents == null)
    {
      agents = new EObjectContainmentEList<init>(init.class, this, MarkovPopulationModelsPackage.POPULATION__AGENTS);
    }
    return agents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<gl_tran> getTran()
  {
    if (tran == null)
    {
      tran = new EObjectContainmentEList<gl_tran>(gl_tran.class, this, MarkovPopulationModelsPackage.POPULATION__TRAN);
    }
    return tran;
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
      case MarkovPopulationModelsPackage.POPULATION__PARAM_LIST:
        return basicSetParamList(null, msgs);
      case MarkovPopulationModelsPackage.POPULATION__AGENTS:
        return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.POPULATION__TRAN:
        return ((InternalEList<?>)getTran()).basicRemove(otherEnd, msgs);
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
      case MarkovPopulationModelsPackage.POPULATION__NAME:
        return getName();
      case MarkovPopulationModelsPackage.POPULATION__PARAM_LIST:
        return getParamList();
      case MarkovPopulationModelsPackage.POPULATION__AGENTS:
        return getAgents();
      case MarkovPopulationModelsPackage.POPULATION__TRAN:
        return getTran();
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
      case MarkovPopulationModelsPackage.POPULATION__NAME:
        setName((String)newValue);
        return;
      case MarkovPopulationModelsPackage.POPULATION__PARAM_LIST:
        setParamList((params)newValue);
        return;
      case MarkovPopulationModelsPackage.POPULATION__AGENTS:
        getAgents().clear();
        getAgents().addAll((Collection<? extends init>)newValue);
        return;
      case MarkovPopulationModelsPackage.POPULATION__TRAN:
        getTran().clear();
        getTran().addAll((Collection<? extends gl_tran>)newValue);
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
      case MarkovPopulationModelsPackage.POPULATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MarkovPopulationModelsPackage.POPULATION__PARAM_LIST:
        setParamList((params)null);
        return;
      case MarkovPopulationModelsPackage.POPULATION__AGENTS:
        getAgents().clear();
        return;
      case MarkovPopulationModelsPackage.POPULATION__TRAN:
        getTran().clear();
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
      case MarkovPopulationModelsPackage.POPULATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MarkovPopulationModelsPackage.POPULATION__PARAM_LIST:
        return paramList != null;
      case MarkovPopulationModelsPackage.POPULATION__AGENTS:
        return agents != null && !agents.isEmpty();
      case MarkovPopulationModelsPackage.POPULATION__TRAN:
        return tran != null && !tran.isEmpty();
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

} //populationImpl
