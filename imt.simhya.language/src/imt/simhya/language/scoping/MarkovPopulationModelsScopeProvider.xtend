/*
 * generated by Xtext
 */
package imt.simhya.language.scoping

import imt.simhya.language.markovPopulationModels.main
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class MarkovPopulationModelsScopeProvider extends AbstractDeclarativeScopeProvider {
	def IScope scope_state_ref_stateRef(main m, EReference eReference ) {
		Scopes::scopeFor(m.agentDef.s)
	}
	
	def IScope scope_action_cond_actionRef(main m, EReference eReference) {
		Scopes::scopeFor(m.agentDef.act)
	}
}
