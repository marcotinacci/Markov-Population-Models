/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.constant;
import imt.simhya.language.markovPopulationModels.location;
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
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.mainImpl#getLocationDef <em>Location Def</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.mainImpl#getAgentDef <em>Agent Def</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.mainImpl#getPopulationDef <em>Population Def</em>}</li>
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
   * The cached value of the '{@link #getLocationDef() <em>Location Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationDef()
   * @generated
   * @ordered
   */
  protected location locationDef;

  /**
   * The cached value of the '{@link #getAgentDef() <em>Agent Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentDef()
   * @generated
   * @ordered
   */
  protected EList<agent> agentDef;

  /**
   * The cached value of the '{@link #getPopulationDef() <em>Population Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopulationDef()
   * @generated
   * @ordered
   */
  protected EList<population> populationDef;

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
  public location getLocationDef()
  {
    return locationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocationDef(location newLocationDef, NotificationChain msgs)
  {
    location oldLocationDef = locationDef;
    locationDef = newLocationDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.MAIN__LOCATION_DEF, oldLocationDef, newLocationDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocationDef(location newLocationDef)
  {
    if (newLocationDef != locationDef)
    {
      NotificationChain msgs = null;
      if (locationDef != null)
        msgs = ((InternalEObject)locationDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.MAIN__LOCATION_DEF, null, msgs);
      if (newLocationDef != null)
        msgs = ((InternalEObject)newLocationDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkovPopulationModelsPackage.MAIN__LOCATION_DEF, null, msgs);
      msgs = basicSetLocationDef(newLocationDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.MAIN__LOCATION_DEF, newLocationDef, newLocationDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<agent> getAgentDef()
  {
    if (agentDef == null)
    {
      agentDef = new EObjectContainmentEList<agent>(agent.class, this, MarkovPopulationModelsPackage.MAIN__AGENT_DEF);
    }
    return agentDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<population> getPopulationDef()
  {
    if (populationDef == null)
    {
      populationDef = new EObjectContainmentEList<population>(population.class, this, MarkovPopulationModelsPackage.MAIN__POPULATION_DEF);
    }
    return populationDef;
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
      case MarkovPopulationModelsPackage.MAIN__LOCATION_DEF:
        return basicSetLocationDef(null, msgs);
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return ((InternalEList<?>)getAgentDef()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        return ((InternalEList<?>)getPopulationDef()).basicRemove(otherEnd, msgs);
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
      case MarkovPopulationModelsPackage.MAIN__LOCATION_DEF:
        return getLocationDef();
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return getAgentDef();
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        return getPopulationDef();
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
      case MarkovPopulationModelsPackage.MAIN__LOCATION_DEF:
        setLocationDef((location)newValue);
        return;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        getAgentDef().clear();
        getAgentDef().addAll((Collection<? extends agent>)newValue);
        return;
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        getPopulationDef().clear();
        getPopulationDef().addAll((Collection<? extends population>)newValue);
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
      case MarkovPopulationModelsPackage.MAIN__LOCATION_DEF:
        setLocationDef((location)null);
        return;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        getAgentDef().clear();
        return;
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        getPopulationDef().clear();
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
      case MarkovPopulationModelsPackage.MAIN__LOCATION_DEF:
        return locationDef != null;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return agentDef != null && !agentDef.isEmpty();
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        return populationDef != null && !populationDef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //mainImpl
