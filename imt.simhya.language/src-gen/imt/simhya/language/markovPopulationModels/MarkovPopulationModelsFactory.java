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
   * Returns a new object of class '<em>action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>action</em>'.
   * @generated
   */
  action createaction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MarkovPopulationModelsPackage getMarkovPopulationModelsPackage();

} //MarkovPopulationModelsFactory
