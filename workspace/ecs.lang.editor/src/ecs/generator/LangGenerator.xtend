/*
 * generated by Xtext 2.10.0
 */
package ecs.generator

import ecs.lang.Project
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LangGenerator extends AbstractGenerator {

	public static val generators = newLinkedHashMap(
		"entitas_csharp" -> new EntitasCSharpGenerator(),
		"entitas_csharp_light" -> new EntitasCSharpLightGenerator()
	)

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val project = resource.contents.filter(typeof(Project)).get(0) as Project
		for (generatorId : project.platformDefinition.ids.map[name]){
			val generator = generators.get(generatorId)
			if (generator != null){
				(generator as ILangGenerator).generate(resource, fsa, context)
			}
		}
	}
}