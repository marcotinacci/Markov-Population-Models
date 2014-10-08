/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.label;
import imt.simhya.language.markovPopulationModels.params;
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
 * An implementation of the model object '<em><b>agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.agentImpl#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.agentImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.agentImpl#getAct <em>Act</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.agentImpl#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class agentImpl extends MinimalEObjectImpl.Container implements agent
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
   * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAct()
   * @generated
   * @ordered
   */
  protected EList<label> act;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected EList<state> s;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected agentImpl()
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
    return MarkovPopulationModelsPackage.Literals.AGENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.AGENT__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.AGENT__PARAM_LIST, oldParamList, newParamList);
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
        msgs = ((InternalEObject)paramList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.AGENT__PARAM_LIST, null, msgs);
      if (newParamList != null)
        msgs = ((InternalEObject)newParamList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.AGENT__PARAM_LIST, null, msgs);
      msgs = basicSetParamList(newParamList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.AGENT__PARAM_LIST, newParamList, newParamList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<label> getAct()
  {
    if (act == null)
    {
      act = new EObjectContainmentEList<label>(label.class, this, MarkovPopulationModelsPackage.AGENT__ACT);
    }
    return act;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<state> getS()
  {
    if (s == null)
    {
      s = new EObjectContainmentEList<state>(state.class, this, MarkovPopulationModelsPackage.AGENT__S);
    }
    return s;
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
      case MarkovPopulationModelsPackage.AGENT__PARAM_LIST:
        return basicSetParamList(null, msgs);
      case MarkovPopulationModelsPackage.AGENT__ACT:
        return ((InternalEList<?>)getAct()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.AGENT__S:
        return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
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
      case MarkovPopulationModelsPackage.AGENT__NAME:
        return getName();
      case MarkovPopulationModelsPackage.AGENT__PARAM_LIST:
        return getParamList();
      case MarkovPopulationModelsPackage.AGENT__ACT:
        return getAct();
      case MarkovPopulationModelsPackage.AGENT__S:
        return getS();
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
      case MarkovPopulationModelsPackage.AGENT__NAME:
        setName((String)newValue);
        return;
      case MarkovPopulationModelsPackage.AGENT__PARAM_LIST:
        setParamList((params)newValue);
        return;
      case MarkovPopulationModelsPackage.AGENT__ACT:
        getAct().clear();
        getAct().addAll((Collection<? extends label>)newValue);
        return;
      case MarkovPopulationModelsPackage.AGENT__S:
        getS().clear();
        getS().addAll((Collection<? extends state>)newValue);
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
      case MarkovPopulationModelsPackage.AGENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MarkovPopulationModelsPackage.AGENT__PARAM_LIST:
        setParamList((params)null);
        return;
      case MarkovPopulationModelsPackage.AGENT__ACT:
        getAct().clear();
        return;
      case MarkovPopulationModelsPackage.AGENT__S:
        getS().clear();
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
      case MarkovPopulationModelsPackage.AGENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MarkovPopulationModelsPackage.AGENT__PARAM_LIST:
        return paramList != null;
      case MarkovPopulationModelsPackage.AGENT__ACT:
        return act != null && !act.isEmpty();
      case MarkovPopulationModelsPackage.AGENT__S:
        return s != null && !s.isEmpty();
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

} //agentImpl
