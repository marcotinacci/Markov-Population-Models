/**
 */
package imt.simhya.language.markovPopulationModels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>actual parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.actual_parameters#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getactual_parameters()
 * @model
 * @generated
 */
public interface actual_parameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Actual Params</b></em>' containment reference list.
   * The list contents are of type {@link imt.simhya.language.markovPopulationModels.expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual Params</em>' containment reference list.
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getactual_parameters_ActualParams()
   * @model containment="true"
   * @generated
   */
  EList<expr> getActualParams();

} // actual_parameters
