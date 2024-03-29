/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage
 * @generated
 */
public interface MarkovPopulationModelsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MarkovPopulationModelsFactory eINSTANCE = imt.simhya.language.markovPopulationModels.impl.MarkovPopulationModelsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>main</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>main</em>'.
   * @generated
   */
  main createmain();

  /**
   * Returns a new object of class '<em>population</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>population</em>'.
   * @generated
   */
  population createpopulation();

  /**
   * Returns a new object of class '<em>init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>init</em>'.
   * @generated
   */
  init createinit();

  /**
   * Returns a new object of class '<em>state Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>state Init</em>'.
   * @generated
   */
  stateInit createstateInit();

  /**
   * Returns a new object of class '<em>gl tran</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>gl tran</em>'.
   * @generated
   */
  gl_tran creategl_tran();

  /**
   * Returns a new object of class '<em>loc tran</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>loc tran</em>'.
   * @generated
   */
  loc_tran createloc_tran();

  /**
   * Returns a new object of class '<em>state cond</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>state cond</em>'.
   * @generated
   */
  state_cond createstate_cond();

  /**
   * Returns a new object of class '<em>state ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>state ref</em>'.
   * @generated
   */
  state_ref createstate_ref();

  /**
   * Returns a new object of class '<em>action cond</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>action cond</em>'.
   * @generated
   */
  action_cond createaction_cond();

  /**
   * Returns a new object of class '<em>agent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>agent</em>'.
   * @generated
   */
  agent createagent();

  /**
   * Returns a new object of class '<em>label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>label</em>'.
   * @generated
   */
  label createlabel();

  /**
   * Returns a new object of class '<em>state</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>state</em>'.
   * @generated
   */
  state createstate();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>action</em>'.
   * @generated
   */
  action createaction();

  /**
   * Returns a new object of class '<em>anystate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>anystate</em>'.
   * @generated
   */
  anystate createanystate();

  /**
   * Returns a new object of class '<em>Summation Subtraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Summation Subtraction</em>'.
   * @generated
   */
  SummationSubtraction createSummationSubtraction();

  /**
   * Returns a new object of class '<em>Multiplication Division</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication Division</em>'.
   * @generated
   */
  MultiplicationDivision createMultiplicationDivision();

  /**
   * Returns a new object of class '<em>Int Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Expression</em>'.
   * @generated
   */
  IntExpression createIntExpression();

  /**
   * Returns a new object of class '<em>Float Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Expression</em>'.
   * @generated
   */
  FloatExpression createFloatExpression();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MarkovPopulationModelsPackage getMarkovPopulationModelsPackage();

} //MarkovPopulationModelsFactory
