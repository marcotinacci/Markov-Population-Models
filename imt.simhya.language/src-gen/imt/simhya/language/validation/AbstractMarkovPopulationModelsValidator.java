/*
 * generated by Xtext
 */
package imt.simhya.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractMarkovPopulationModelsValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage.eINSTANCE);
		return result;
	}
}