/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.constant;
import imt.simhya.language.markovPopulationModels.expr;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.exprImpl#getConstRef <em>Const Ref</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.exprImpl#getConstFLOAT <em>Const FLOAT</em>}</li>
 *   <li>{@link imt.simhya.language.markovPopulationModels.impl.exprImpl#getConstINT <em>Const INT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class exprImpl extends MinimalEObjectImpl.Container implements expr
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected exprImpl()
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
    return MarkovPopulationModelsPackage.Literals.EXPR;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarkovPopulationModelsPackage.EXPR__CONST_REF, oldConstRef, constRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.EXPR__CONST_REF, oldConstRef, constRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.EXPR__CONST_FLOAT, oldConstFLOAT, constFLOAT));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MarkovPopulationModelsPackage.EXPR__CONST_INT, oldConstINT, constINT));
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
      case MarkovPopulationModelsPackage.EXPR__CONST_REF:
        if (resolve) return getConstRef();
        return basicGetConstRef();
      case MarkovPopulationModelsPackage.EXPR__CONST_FLOAT:
        return getConstFLOAT();
      case MarkovPopulationModelsPackage.EXPR__CONST_INT:
        return getConstINT();
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
      case MarkovPopulationModelsPackage.EXPR__CONST_REF:
        setConstRef((constant)newValue);
        return;
      case MarkovPopulationModelsPackage.EXPR__CONST_FLOAT:
        setConstFLOAT((Double)newValue);
        return;
      case MarkovPopulationModelsPackage.EXPR__CONST_INT:
        setConstINT((Integer)newValue);
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
      case MarkovPopulationModelsPackage.EXPR__CONST_REF:
        setConstRef((constant)null);
        return;
      case MarkovPopulationModelsPackage.EXPR__CONST_FLOAT:
        setConstFLOAT(CONST_FLOAT_EDEFAULT);
        return;
      case MarkovPopulationModelsPackage.EXPR__CONST_INT:
        setConstINT(CONST_INT_EDEFAULT);
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
      case MarkovPopulationModelsPackage.EXPR__CONST_REF:
        return constRef != null;
      case MarkovPopulationModelsPackage.EXPR__CONST_FLOAT:
        return constFLOAT != CONST_FLOAT_EDEFAULT;
      case MarkovPopulationModelsPackage.EXPR__CONST_INT:
        return constINT != CONST_INT_EDEFAULT;
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
    result.append(" (constFLOAT: ");
    result.append(constFLOAT);
    result.append(", constINT: ");
    result.append(constINT);
    result.append(')');
    return result.toString();
  }

} //exprImpl
