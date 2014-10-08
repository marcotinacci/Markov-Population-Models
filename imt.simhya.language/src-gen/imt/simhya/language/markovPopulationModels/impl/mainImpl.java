/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.constant;
import imt.simhya.language.markovPopulationModels.main;
import imt.simhya.language.markovPopulationModels.population;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
   * The cached value of the '{@link #getPopulationDef() <em>Population Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopulationDef()
   * @generated
   * @ordered
   */
  protected EList<population> populationDef;

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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MarkovPopulationModelsPackage.MAIN__CONST_DEF:
        return ((InternalEList<?>)getConstDef()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.MAIN__POPULATION_DEF:
        return ((InternalEList<?>)getPopulationDef()).basicRemove(otherEnd, msgs);
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return ((InternalEList<?>)getAgentDef()).basicRemove(otherEnd, msgs);
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
        getPopulationDef().clear();
        getPopulationDef().addAll((Collection<? extends population>)newValue);
        return;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        getAgentDef().clear();
        getAgentDef().addAll((Collection<? extends agent>)newValue);
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
        getPopulationDef().clear();
        return;
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        getAgentDef().clear();
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
        return populationDef != null && !populationDef.isEmpty();
      case MarkovPopulationModelsPackage.MAIN__AGENT_DEF:
        return agentDef != null && !agentDef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //mainImpl
