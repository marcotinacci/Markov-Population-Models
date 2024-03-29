/*
 * generated by Xtext
 */
package imt.simhya.language.generator

import imt.simhya.language.markovPopulationModels.FloatExpression
import imt.simhya.language.markovPopulationModels.IntExpression
import imt.simhya.language.markovPopulationModels.MultiplicationDivision
import imt.simhya.language.markovPopulationModels.Reference
import imt.simhya.language.markovPopulationModels.SummationSubtraction
import imt.simhya.language.markovPopulationModels.gl_tran
import imt.simhya.language.markovPopulationModels.main
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MarkovPopulationModelsGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var prog = resource.contents.get(0) as main
		fsa.generateFile('paperino.txt', prog.toSimhya)
	}
	
	def CharSequence toSimhya(main m)
		'''
		model «m.populationDef.name» {
			«FOR s : m.populationDef.agents.get(0).states»
				«s.stateRef.stateRef.name» = «(s.card as IntExpression).value»;
			«ENDFOR»
			«FOR t : m.populationDef.tran»
				«t.name»:[ :-> «t.updateVector»]@«t.rate.evaluate»
			«ENDFOR»
		reg:[  :-> ]@{0.0001};
		}
		'''
	
	def dispatch CharSequence evaluate(SummationSubtraction ss)
		'''«ss.left.evaluate»«IF ss.op.equals('+')» + «ELSE» - «ENDIF»«ss.right.evaluate»''' 

	def dispatch CharSequence evaluate(MultiplicationDivision md)
		'''«md.left.evaluate»«IF md.op.equals('*')» * «ELSE» / «ENDIF»«md.right.evaluate»''' 
	
	def dispatch CharSequence evaluate(IntExpression ie)
		'''«ie.value»''' 
	
	def dispatch CharSequence evaluate(FloatExpression fe)
		'''«fe.value»''' 
	
	def dispatch CharSequence evaluate(Reference ref)
		'''«ref.stateRef.stateRef.name»''' 
	
	def updateVector(gl_tran tran){
		var uv = newHashMap()
		// compute update vector in the hash map uv
		for (l : tran.LTran){
			var s = l.SCond.stateRef.stateRef
			var v = uv.get(s)
			if(v == null){
				uv.put(s,-1) 
			}else{
				uv.put(s,v-1)
			}
			for (a : s.spontaneousAct){
				if(a.actRef.equals(l.ACond.actionRef)){
					v = uv.get(a.stateRef)
					if(v == null){
						uv.put(a.stateRef,1) 
					}else{
						uv.put(a.stateRef,v+1)
					}
				}
			}
		}
		// return the print of the hash map
		'''«FOR k : uv.keySet() SEPARATOR ';'»«IF uv.get(k)!=0»«IF uv.get(k)>0»«k.name» += «uv.get(k)»«ELSE»«k.name» -= «-uv.get(k)»«ENDIF»«ENDIF»«ENDFOR»'''
	}
}
