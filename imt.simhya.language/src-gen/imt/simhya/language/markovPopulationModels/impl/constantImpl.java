/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.constant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.constantImpl#getName <em>Name</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.constantImpl#getConstINT <em>Const INT</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.constantImpl#getConstFLOAT <em>Const FLOAT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constantImpl extends MinimalEObjectImpl.Container implements constant
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
   * The default value of the '{@link #getConstINT() <em>Const INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstINT()
   * @generated
   * @ordered
   */
  protected static final int CONST_INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getConstINT() <em>Const INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstINT()
   * @generated
   * @ordered
   */
  protected int constINT = CONST_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getConstFLOAT() <em>Const FLOAT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstFLOAT()
   * @generated
   * @ordered
   */
  protected static final double CONST_FLOAT_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getConstFLOAT() <em>Const FLOAT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstFLOAT()
   * @generated
   * @ordered
   */
  protected double constFLOAT = CONST_FLOAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constantImpl()
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
    return MarkovPopulationModelsPackage.Literals.CONSTANT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.CONSTANT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getConstINT()
  {
    return constINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstINT(int newConstINT)
  {
    int oldConstINT = constINT;
    constINT = newConstINT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.CONSTANT__CONST_INT, oldConstINT, constINT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getConstFLOAT()
  {
    return constFLOAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstFLOAT(double newConstFLOAT)
  {
    double oldConstFLOAT = constFLOAT;
    constFLOAT = newConstFLOAT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.CONSTANT__CONST_FLOAT, oldConstFLOAT, constFLOAT));
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
      case MarkovPopulationModelsPackage.CONSTANT__NAME:
        return getName();
      case MarkovPopulationModelsPackage.CONSTANT__CONST_INT:
        return getConstINT();
      case MarkovPopulationModelsPackage.CONSTANT__CONST_FLOAT:
        return getConstFLOAT();
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
      case MarkovPopulationModelsPackage.CONSTANT__NAME:
        setName((String)newValue);
        return;
      case MarkovPopulationModelsPackage.CONSTANT__CONST_INT:
        setConstINT((Integer)newValue);
        return;
      case MarkovPopulationModelsPackage.CONSTANT__CONST_FLOAT:
        setConstFLOAT((Double)newValue);
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
      case MarkovPopulationModelsPackage.CONSTANT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MarkovPopulationModelsPackage.CONSTANT__CONST_INT:
        setConstINT(CONST_INT_EDEFAULT);
        return;
      case MarkovPopulationModelsPackage.CONSTANT__CONST_FLOAT:
        setConstFLOAT(CONST_FLOAT_EDEFAULT);
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
      case MarkovPopulationModelsPackage.CONSTANT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MarkovPopulationModelsPackage.CONSTANT__CONST_INT:
        return constINT != CONST_INT_EDEFAULT;
      case MarkovPopulationModelsPackage.CONSTANT__CONST_FLOAT:
        return constFLOAT != CONST_FLOAT_EDEFAULT;
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
    result.append(", constINT: ");
    result.append(constINT);
    result.append(", constFLOAT: ");
    result.append(constFLOAT);
    result.append(')');
    return result.toString();
  }

} //constantImpl
