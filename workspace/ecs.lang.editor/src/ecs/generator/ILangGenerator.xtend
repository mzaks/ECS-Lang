package ecs.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ecs.lang.Project
import java.util.Set

interface ILangGenerator {
	def void generate(Set<Project> projects, Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context)
}