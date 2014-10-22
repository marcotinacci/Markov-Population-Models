/**
 */
package imt.simhya.language.markovPopulationModels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imt.simhya.language.markovPopulationModels.FloatExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getFloatExpression()
 * @model
 * @generated
 */
public interface FloatExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#getFloatExpression_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link imt.simhya.language.markovPopulationModels.FloatExpression#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

} // FloatExpression
