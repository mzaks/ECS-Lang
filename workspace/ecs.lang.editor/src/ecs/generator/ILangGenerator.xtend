package ecs.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

interface ILangGenerator {
	def void generate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context)
}