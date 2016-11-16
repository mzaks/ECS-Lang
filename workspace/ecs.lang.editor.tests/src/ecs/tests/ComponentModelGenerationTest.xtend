/*
 * generated by Xtext 2.10.0
 */
package ecs.tests

import com.google.inject.Inject
import ecs.lang.Project
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import ecs.generator.EntitasCSharpLightGenerator
import ecs.model.ComponentModel
import org.junit.Before
import java.util.Map
import java.util.List

@RunWith(XtextRunner)
@InjectWith(LangInjectorProvider)
class ComponentModelGenerationTest{

	@Inject
	ParseHelper<Project> parseHelper
	
	EntitasCSharpLightGenerator generator
	
	@Before
	def void setup(){
		generator = new EntitasCSharpLightGenerator()
	}

	@Test 
	def void collectAllComponentsFromMixedContextAndCheckIndex() {
		val project = parseHelper.parse('''
			platform smothing
			comp A
			comp B
			comp C
			comp D
			comp E
			comp F
			comp G
			ctx P1 { A B C D E F G }
			ctx P2 { B G F }
			ctx P3 { A G }
			ctx P4 { B G }
		''')
		
		val componentModels = generator.collectAllComponents(project).sortBy[it.name]
		
		Assert.assertEquals(componentModels.size, 7)
		Assert.assertEquals(componentModels.map[it.name], newLinkedList("A", "B", "C", "D", "E", "F", "G"))
		
		val componentGroup = componentModels.groupBy[it.name]
		
		componentGroup.assertComponentContextNames("A", "P1", "P3")
		componentGroup.assertIndexIs("A", 2)
		
		componentGroup.assertComponentContextNames("B", "P1", "P2", "P4")
		componentGroup.assertIndexIs("B", 1)
		
		componentGroup.assertComponentContextNames("C", "P1")
		componentGroup.assertIndexIs("C", 4)
		
		componentGroup.assertComponentContextNames("D", "P1")
		componentGroup.assertIndexIs("D", 5)
		
		componentGroup.assertComponentContextNames("E", "P1")
		componentGroup.assertIndexIs("E", 6)
		
		componentGroup.assertComponentContextNames("F", "P1", "P2")
		componentGroup.assertIndexIs("F", 3)
		
		componentGroup.assertComponentContextNames("G", "P1", "P2", "P3", "P4")
		componentGroup.assertIndexIs("G", 0)
	}
	
	@Test 
	def void collectAllComponentsFromDistinctContextAndCheckIndex() {
		val project = parseHelper.parse('''
			platform smothing
			comp A
			comp B
			comp C
			comp D
			comp E
			comp F
			comp G
			ctx P1 { A B C }
			ctx P2 { D E F G }
		''')
		
		val componentModels = generator.collectAllComponents(project).sortBy[it.name]
		
		Assert.assertEquals(componentModels.size, 7)
		Assert.assertEquals(componentModels.map[it.name], newLinkedList("A", "B", "C", "D", "E", "F", "G"))
		
		val componentGroup = componentModels.groupBy[it.name]
		
		componentGroup.assertComponentContextNames("A", "P1")
		componentGroup.assertIndexIs("A", 0)
		
		componentGroup.assertComponentContextNames("B", "P1")
		componentGroup.assertIndexIs("B", 1)
		
		componentGroup.assertComponentContextNames("C", "P1")
		componentGroup.assertIndexIs("C", 2)
		
		componentGroup.assertComponentContextNames("D", "P2")
		componentGroup.assertIndexIs("D", 0)
		
		componentGroup.assertComponentContextNames("E", "P2")
		componentGroup.assertIndexIs("E", 1)
		
		componentGroup.assertComponentContextNames("F", "P2")
		componentGroup.assertIndexIs("F", 2)
		
		componentGroup.assertComponentContextNames("G", "P2")
		componentGroup.assertIndexIs("G", 3)
	}
	
	@Test 
	def void collectAllComponentsFromMixedContextAndCheckIndex2() {
		val project = parseHelper.parse('''
			platform smothing
			comp A
			comp B
			comp C
			comp D
			comp E
			comp F
			comp G
			ctx P1 { C D E F G }
			ctx P2 { B G F }
			ctx P3 { A }
			ctx P4 { B G }
		''')
		
		val componentModels = generator.collectAllComponents(project).sortBy[it.name]
		
		Assert.assertEquals(componentModels.size, 7)
		Assert.assertEquals(componentModels.map[it.name], newLinkedList("A", "B", "C", "D", "E", "F", "G"))
		
		val componentGroup = componentModels.groupBy[it.name]
		
		componentGroup.assertComponentContextNames("A", "P3")
		componentGroup.assertIndexIs("A", 0)
		
		componentGroup.assertComponentContextNames("B", "P2", "P4")
		componentGroup.assertIndexIs("B", 2)
		
		componentGroup.assertComponentContextNames("C", "P1")
		componentGroup.assertIndexIs("C", 2)
		
		componentGroup.assertComponentContextNames("D", "P1")
		componentGroup.assertIndexIs("D", 3)
		
		componentGroup.assertComponentContextNames("E", "P1")
		componentGroup.assertIndexIs("E", 4)
		
		componentGroup.assertComponentContextNames("F", "P1", "P2")
		componentGroup.assertIndexIs("F", 1)
		
		componentGroup.assertComponentContextNames("G", "P1", "P2", "P4")
		componentGroup.assertIndexIs("G", 0)
	}
	
	@Test 
	def void collectAllComponentsFromMixedContextAndCheckIndex3() {
		val project = parseHelper.parse('''
			platform smothing
			comp A
			comp B
			comp C
			comp D
			comp E
			comp F
			comp G
			ctx P1 { C D E G }
			ctx P2 { B G F }
			ctx P3 { A }
			ctx P4 { B G }
		''')
		
		val componentModels = generator.collectAllComponents(project).sortBy[it.name]
		
		Assert.assertEquals(componentModels.size, 7)
		Assert.assertEquals(componentModels.map[it.name], newLinkedList("A", "B", "C", "D", "E", "F", "G"))
		
		val componentGroup = componentModels.groupBy[it.name]
		
		componentGroup.assertComponentContextNames("A", "P3")
		componentGroup.assertIndexIs("A", 0)
		
		componentGroup.assertComponentContextNames("B", "P2", "P4")
		componentGroup.assertIndexIs("B", 1)
		
		componentGroup.assertComponentContextNames("C", "P1")
		componentGroup.assertIndexIs("C", 1)
		
		componentGroup.assertComponentContextNames("D", "P1")
		componentGroup.assertIndexIs("D", 2)
		
		componentGroup.assertComponentContextNames("E", "P1")
		componentGroup.assertIndexIs("E", 3)
		
		componentGroup.assertComponentContextNames("F", "P2")
		componentGroup.assertIndexIs("F", 2)
		
		componentGroup.assertComponentContextNames("G", "P1", "P2", "P4")
		componentGroup.assertIndexIs("G", 0)
	}
	
	@Test 
	def void collectAllComponentsFromMixedContextAndCheckIndex4() {
		val project = parseHelper.parse('''
			platform smothing
			comp A
			comp B
			comp C
			comp D
			comp E
			comp F
			comp G
			ctx P1 { A B C D E F G }
			ctx P2 { A B C D E }
			ctx P3 { F }
			ctx P4 { G }
		''')
		
		val componentModels = generator.collectAllComponents(project).sortBy[it.name]
		
		Assert.assertEquals(componentModels.size, 7)
		Assert.assertEquals(componentModels.map[it.name], newLinkedList("A", "B", "C", "D", "E", "F", "G"))
		
		val componentGroup = componentModels.groupBy[it.name]
		
		componentGroup.assertComponentContextNames("A", "P1", "P2")
		componentGroup.assertIndexIs("A", 2)
		
		componentGroup.assertComponentContextNames("B", "P1", "P2")
		componentGroup.assertIndexIs("B", 3)
		
		componentGroup.assertComponentContextNames("C", "P1", "P2")
		componentGroup.assertIndexIs("C", 4)
		
		componentGroup.assertComponentContextNames("D", "P1", "P2")
		componentGroup.assertIndexIs("D", 5)
		
		componentGroup.assertComponentContextNames("E", "P1", "P2")
		componentGroup.assertIndexIs("E", 6)
		
		componentGroup.assertComponentContextNames("F", "P1", "P3")
		componentGroup.assertIndexIs("F", 0)
		
		componentGroup.assertComponentContextNames("G", "P1", "P4")
		componentGroup.assertIndexIs("G", 1)
	}
	
	@Test 
	def void collectAllComponentsFromMixedContextAndCheckIndex5() {
		val project = parseHelper.parse('''
			platform smothing
			comp A
			comp B
			comp C
			comp D
			comp E
			comp F
			comp G
			ctx P1 P2 { A B C D }
			ctx P1 { E F G }
			ctx P2 { E }
			ctx P3 { F }
			ctx P4 { G }
		''')
		
		val componentModels = generator.collectAllComponents(project).sortBy[it.name]
		
		Assert.assertEquals(componentModels.size, 7)
		Assert.assertEquals(componentModels.map[it.name], newLinkedList("A", "B", "C", "D", "E", "F", "G"))
		
		val componentGroup = componentModels.groupBy[it.name]
		
		componentGroup.assertComponentContextNames("A", "P1", "P2")
		componentGroup.assertIndexIs("A", 2)
		
		componentGroup.assertComponentContextNames("B", "P1", "P2")
		componentGroup.assertIndexIs("B", 3)
		
		componentGroup.assertComponentContextNames("C", "P1", "P2")
		componentGroup.assertIndexIs("C", 4)
		
		componentGroup.assertComponentContextNames("D", "P1", "P2")
		componentGroup.assertIndexIs("D", 5)
		
		componentGroup.assertComponentContextNames("E", "P1", "P2")
		componentGroup.assertIndexIs("E", 6)
		
		componentGroup.assertComponentContextNames("F", "P1", "P3")
		componentGroup.assertIndexIs("F", 0)
		
		componentGroup.assertComponentContextNames("G", "P1", "P4")
		componentGroup.assertIndexIs("G", 1)
	}
	
	def assertComponentContextNames(Map<String, List<ComponentModel>> componentGroup, String label, String... groupnames){
		Assert.assertEquals(componentGroup.get(label).get(0).contexNames.sortBy[it], newLinkedList(groupnames))
	}

	def assertIndexIs(Map<String, List<ComponentModel>> componentGroup, String label1, Integer index){
		Assert.assertEquals(componentGroup.get(label1).get(0).index, index)
	}
}