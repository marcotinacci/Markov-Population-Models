/*
 * generated by Xtext
 */
package imt.simhya.language.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import imt.simhya.language.ui.internal.MarkovPopulationModelsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MarkovPopulationModelsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MarkovPopulationModelsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MarkovPopulationModelsActivator.getInstance().getInjector(MarkovPopulationModelsActivator.IMT_SIMHYA_LANGUAGE_MARKOVPOPULATIONMODELS);
	}
	
}