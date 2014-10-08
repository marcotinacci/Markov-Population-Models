/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.actual_parameters;
import imt.simhya.language.markovPopulationModels.expr;

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
 * An implementation of the model object '<em><b>actual parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.actual_parametersImpl#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class actual_parametersImpl extends MinimalEObjectImpl.Container implements actual_parameters
{
  /**
   * The cached value of the '{@link #getActualParams() <em>Actual Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualParams()
   * @generated
   * @ordered
   */
  protected EList<expr> actualParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected actual_parametersImpl()
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
    return MarkovPopulationModelsPackage.Literals.ACTUAL_PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expr> getActualParams()
  {
    if (actualParams == null)
    {
      actualParams = new EObjectContainmentEList<expr>(expr.class, this, MarkovPopulationModelsPackage.ACTUAL_PARAMETERS__ACTUAL_PARAMS);
    }
    return actualParams;
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
      case MarkovPopulationModelsPackage.ACTUAL_PARAMETERS__ACTUAL_PARAMS:
        return ((InternalEList<?>)getActualParams()).basicRemove(otherEnd, msgs);
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
      case MarkovPopulationModelsPackage.ACTUAL_PARAMETERS__ACTUAL_PARAMS:
        return getActualParams();
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
      case MarkovPopulationModelsPackage.ACTUAL_PARAMETERS__ACTUAL_PARAMS:
        getActualParams().clear();
        getActualParams().addAll((Collection<? extends expr>)newValue);
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
      case MarkovPopulationModelsPackage.ACTUAL_PARAMETERS__ACTUAL_PARAMS:
        getActualParams().clear();
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
      case MarkovPopulationModelsPackage.ACTUAL_PARAMETERS__ACTUAL_PARAMS:
        return actualParams != null && !actualParams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //actual_parametersImpl
