/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.constant;
import imt.simhya.language.markovPopulationModels.main;
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
 * An implementation of the model object '<em><b>main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.mainImpl#getConstDef <em>Const Def</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.mainImpl#getPopulationDef <em>Population Def</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.mainImpl#getAgentDef <em>Agent Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class mainImpl extends MinimalEObjectImpl.Container implements main
{
  /**
   * The cached value of the '{@link #getConstDef() <em>Const Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstDef()
   * @generated
   * @ordered
   */
  protected EList<constant> constDef;

  /**
   * The cached value of the '{@link #getPopulationDef() <em>Population Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopulationDef()
   * @generated
   * @ordered
   */
  protected population populationDef;

  /**
   * The cached value of the '{@link #getAgentDef() <em>Agent Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentDef()
   * @generated
   * @ordered
   */
  protected agent agentDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected mainImpl()
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
    return MarkovPopulationModelsPackage.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<constant> getConstDef()
  {
    if (constDef == null)
    {
      constDef = new EObjectContainmentEList<constant>(constant.class, this, MarkovPopulationModelsPackage.MAIN__CONST_DEF);
    }
    return constDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public population getPopulationDef()
  {
    return populationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopulationDef(population newPopulationDef, NotificationChain msgs)
  {
    population oldPopulationDef = populationDef;
    populationDef = newPopulationDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.MAIN__POPULATION_DEF, oldPopulationDef, newPopulationDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopulationDef(population newPopulationDef)
  {
    if (newPopulationDef != populationDef)
    {
      NotificationChain msgs = null;
      if (populationDef != null)
        msgs = ((InternalEObject)populationDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.MAIN__POPULATION_DEF, null, msgs);
      if (newPopulationDef != null)
        msgs = ((InternalEObject)newPopulationDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.MAIN__POPULATION_DEF, null, msgs);
      msgs = basicSetPopulationDef(newPopulationDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.MAIN__POPULATION_DEF, newPopulationDef, newPopulationDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public agent getAgentDef()
  {
    return agentDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAgentDef(agent newAgentDef, NotificationChain msgs)
  {
    agent oldAgentDef = agentDef;
    agentDef = newAgentDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.MAIN__AGENT_DEF, oldAgentDef, newAgentDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgentDef(agent newAgentDef)
  {
    if (newAgentDef != agentDef)
    {
      NotificationChain msgs = null;
      if (agentDef != null)
        msgs = ((InternalEObject)agentDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.MAIN__AGENT_DEF, null, msgs);
      if (newAgentDef != null)
        msgs = ((InternalEObject)newAgentDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.MAIN__AGENT_DEF, null, msgs);
      msgs = basicSetAgentDef(newAgentDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.MAIN__AGENT_DEF, newAgentDef, newAgentDef));
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
      case MarkovPopulationModelsPackage.MAIN__CONST_DEF:
        return ((InternalEList<?>)getConstDef()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        return basicSetPopulationDef(null, msgs);
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return basicSetAgentDef(null, msgs);
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
      case MarkovPopulationModelsPackage.MAIN__CONST_DEF:
        return getConstDef();
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        return getPopulationDef();
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return getAgentDef();
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
      case MarkovPopulationModelsPackage.MAIN__CONST_DEF:
        getConstDef().clear();
        getConstDef().addAll((Collection<? extends constant>)newValue);
        return;
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        setPopulationDef((population)newValue);
        return;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        setAgentDef((agent)newValue);
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
      case MarkovPopulationModelsPackage.MAIN__CONST_DEF:
        getConstDef().clear();
        return;
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        setPopulationDef((population)null);
        return;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        setAgentDef((agent)null);
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
      case MarkovPopulationModelsPackage.MAIN__CONST_DEF:
        return constDef != null && !constDef.isEmpty();
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        return populationDef != null;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return agentDef != null;
    }
    return super.eIsSet(featureID);
  }

} //mainImpl
