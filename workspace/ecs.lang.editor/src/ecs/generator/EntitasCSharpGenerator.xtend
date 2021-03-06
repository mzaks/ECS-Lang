/*
 * generated by Xtext 2.10.0
 */
package ecs.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.List
import ecs.model.ComponentModel
import ecs.lang.Project
import ecs.lang.Alias
import java.util.ArrayList
import ecs.lang.System
import ecs.lang.UniqueComponentAccess
import ecs.lang.ApiRule
import ecs.lang.Component
import ecs.lang.AComponent
import java.util.Set
import ecs.lang.Chain

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EntitasCSharpGenerator implements ILangGenerator {

	override void generate(Set<Project> projects, Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val namespace = resource.namespace
		val allComponents = resource.collectAllComponents()
		for (component : allComponents) {
			fsa.generateFile("components/" + component.name.toFirstUpper + "Component.cs", component.generate(namespace))
		}
		fsa.generateFile("components/ComponentIds.cs", generateComponentsFile(allComponents, namespace))
		
		val project = resource.contents.filter(typeof(Project)).get(0) as Project
		for (system : project.systems){
			fsa.generateFile("systems/" + system.name.toFirstUpper + "BaseSystem.cs", system.generateFileContent(namespace))
		}
//		for (system : project.parentSystems){
//			fsa.generateFile("systems/" + system.name.toFirstUpper + "Systems.cs", system.generateFileContent)
//		}
	}
	
	def generateFileContent(System system, String namespace)'''
		«IF namespace != null»
		namespace «namespace» {
		«ENDIF»
		using Entitas;
		using System.Collections.Generic;
		
		public abstract class «system.name.toFirstUpper»BaseSystem : IInitializeSystem, «IF system.input == null»IExecuteSystem, «ELSE»IMultiReactiveSystem, «IF !system.input.ensureComponents.empty»IEnsureComponents, «ENDIF»«IF !system.input.excludeComponents.empty»IExcludeComponents, «ENDIF»«ENDIF»ISetPool {
			Pool _pool;
		
			public void SetPool(Pool pool){_pool = pool;}
			
			«FOR uniqueComponentAccess : system.uniqueComp»
			«uniqueComponentAccess.generateMethods»
			«ENDFOR»
			
			«FOR group : system.groups»
			private Group _«group.name.toFirstUpper»Group;
			
			public interface «group.name.toFirstUpper»GroupEntity : «FOR api : group.apiRules SEPARATOR ", "»«api.apiInterfaces»«ENDFOR»{}
			
			readonly List<«group.name.toFirstUpper»GroupEntity> _«group.name.toFirstLower»GroupBuffer = new List<«group.name.toFirstUpper»GroupEntity>();

			protected List<«group.name.toFirstUpper»GroupEntity> «group.name.toFirstLower» {
				get {
					_«group.name.toFirstLower»GroupBuffer.Clear();
					var entities = _«group.name.toFirstUpper»Group.GetEntities();
					for (int i = 0; i < entities.Length; i++) {
						_«group.name.toFirstLower»GroupBuffer.Add((«group.name.toFirstUpper»GroupEntity)entities[i]);
					}
					return _«group.name.toFirstLower»GroupBuffer;
				}
			}
			«ENDFOR»
			«FOR createRule : system.createRules»
			public interface «createRule.name.toFirstUpper»Entity : «FOR component : createRule.componentTypes SEPARATOR ", "»«component.typeName».Add«ENDFOR»{}
			
			protected «createRule.name.toFirstUpper»Entity Create«createRule.name.toFirstUpper»Entity(){
				return («createRule.name.toFirstUpper»Entity)_pool.CreateEntity();
			}
			«ENDFOR»
			
			«IF system.input != null»
			public TriggerOnEvent[] triggers { get { return new [] {
					«FOR trigger : system.input.triggers SEPARATOR ", "»
					«IF !trigger.enterComponents.empty»
					Matcher.AllOf(«FOR comp : trigger.enterComponents SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»).OnEntityAdded()
					«ENDIF»
					«IF !trigger.left.empty»
					Matcher.AllOf(«FOR comp : trigger.left SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»).OnEntityRemoved()
					«ENDIF»
					«IF !trigger.enteredOrLeft.empty»
					Matcher.AllOf(«FOR comp : trigger.enteredOrLeft SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»).OnEntityAddedOrRemoved()
					«ENDIF»
					«ENDFOR»
				};
			}}
			
			«IF !system.input.ensureComponents.empty»
			public IMatcher ensureComponents { get { return Matcher.AllOf(«FOR comp : system.input.ensureComponents SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»); }}
			«ENDIF»
			
			«IF !system.input.excludeComponents.empty»
			public IMatcher excludeComponents { get { return Matcher.AllOf(«FOR comp : system.input.excludeComponents SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»); }}
			«ENDIF»
			
			public interface InputEntity : «FOR api : system.input.apiRules SEPARATOR ", "»«api.apiInterfaces»«ENDFOR»{}
			
			readonly List<InputEntity> _inputEntityBuffer = new List<InputEntity>();
			
			public void Execute(List<Entity> entities)
			{
				for (int i = 0; i < entities.Count; i++) {
					_inputEntityBuffer.Add((InputEntity)entities[i]);
				}
				Execute(_inputEntityBuffer);
				_inputEntityBuffer.Clear();
			}
			
			abstract protected void Execute(List<InputEntity> entities);
			
			«IF system.input.destroy»
			protected void DestroyEntity(InputEntity entity) {
				_pool.DestroyEntity(entity as Entity);
			}
			«ENDIF»
			«ELSE»
			abstract public void Execute();
			«ENDIF»
			«/* TODO: Implement Initialize and groups & unique entity*/»
			public void Initialize(){
				«FOR group : system.groups»
				_«group.name.toFirstUpper»Group = _pool.GetGroup(
					«IF !group.allOfComponents.empty»
					Matcher.AllOf(«FOR comp : group.allOfComponents SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»)«IF !group.anyOfComponents.empty || !group.noneOfComponents.empty».«ENDIF»«ENDIF»
					«IF !group.anyOfComponents.empty»
					Matcher.AnyOf(«FOR comp : group.anyOfComponents SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»)«IF !group.noneOfComponents.empty».«ENDIF»«ENDIF»
					«IF !group.noneOfComponents.empty»
					Matcher.NoneOf(«FOR comp : group.noneOfComponents SEPARATOR ", "»Matcher.«comp.name.toFirstUpper»«ENDFOR»)«ENDIF»
				);
				«ENDFOR»
				«IF system.init»Init();«ENDIF»
			}
			«IF system.init»
			abstract protected void Init();
			«ENDIF»
		}
		«IF namespace != null»
		}
		«ENDIF»
		«IF system.input != null»
		namespace Entitas {
			«IF namespace != null»using «namespace»;«ENDIF»
			public partial class Entity : «system.name.toFirstUpper»BaseSystem.InputEntity {}
		}
		«ENDIF»
		«FOR createRule : system.createRules»
		namespace Entitas {
			«IF namespace != null»using «namespace»;«ENDIF»
			public partial class Entity : «system.name.toFirstUpper»BaseSystem.«createRule.name.toFirstUpper»Entity {}
		}
		«ENDFOR»
		«FOR group : system.groups»
		namespace Entitas {
			«IF namespace != null»using «namespace»;«ENDIF»
			public partial class Entity : «system.name.toFirstUpper»BaseSystem.«group.name.toFirstUpper»GroupEntity {}
		}
		«ENDFOR»
	'''
	
	def apiInterfaces(ApiRule rule) '''
		«FOR prefix : rule.computePrefix SEPARATOR ", "»«rule.component.name.toFirstUpper»Component.«prefix.toFirstUpper»«ENDFOR»'''
	
	def generateFileContent(Chain system)'''
		using Entitas;
		
		public partial class «system.name.toFirstUpper»Systems : Feature
		{
		}
	'''
	
	def generateMethods(UniqueComponentAccess access) {
		val rule = access.apiRule
		
		val prefixes = rule.computePrefix
		return rule.generateUniqueComponentMethodsForPrefixList(prefixes)
		
	}
	
	def computePrefix(ApiRule rule){
		if (rule.component.isFlag) {
			return #["is"]
		} else {
			return if (rule.accesors == null) #["add", "has", "get", "replace", "remove"] else rule.accesors.map[it]
		}
	}
	
	def generateUniqueComponentMethodsForPrefixList(ApiRule rule, List<String> prefixList) '''
		«FOR prefix : prefixList»
		«val model = rule.component.toComponentModel»
		«IF prefix == "is"»
		protected bool is«rule.component.name.toFirstUpper» {
			get { return _pool.is«rule.component.name.toFirstUpper»; }
			set { _pool.is«rule.component.name.toFirstUpper» = value;}
		}
		«ENDIF»
		«IF prefix == "add"»
		protected void Set«rule.component.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
			_pool.Set«rule.component.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»new«propertyName.toFirstUpper»«ENDFOR»);
		}
		«ENDIF»
		«IF prefix == "has"»
		protected bool has«rule.component.name.toFirstUpper» { get { return _pool.has«rule.component.name.toFirstUpper»; } }
		«ENDIF»
		«IF prefix == "get"»
		protected «rule.component.typeName» «rule.component.name.toFirstLower» { get { return _pool.«rule.component.name.toFirstLower»; } }
		«ENDIF»
		«IF prefix == "replace"»
		protected void Replace«rule.component.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
			_pool.Replace«rule.component.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»new«propertyName.toFirstUpper»«ENDFOR»);
		}
		«ENDIF»
		«IF prefix == "remove"»
		protected void Remove«rule.component.name.toFirstUpper»() {
			_pool.Remove«rule.component.name.toFirstUpper»();
		}
		«ENDIF»
		«ENDFOR»
	'''
	
	def String generate(ComponentModel model, String namespace) '''
		«IF namespace != null»
		namespace «namespace» {
		«ENDIF»
		using Entitas;
		public class «model.name.toFirstUpper»Component : IComponent {
			«FOR propertyName : model.properties.keySet»
			public «model.properties.get(propertyName)» «propertyName»;
			«ENDFOR»
			«IF model.properties.empty»
			public interface Is {bool is«model.name.toFirstUpper» {get; set;}}
			«ELSE»
			public interface Get {«model.name.toFirstUpper»Component «model.name.toFirstLower»{get;}}
			public interface Has {bool has«model.name.toFirstUpper»{get;}}
			public interface Add {void Add«model.name.toFirstUpper»_(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR»);}
			public interface Replace {void Replace«model.name.toFirstUpper»_(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR»);}
			public interface Remove {void Remove«model.name.toFirstUpper»_();}
			«ENDIF»
		}
		«IF namespace != null»
		}
		«ENDIF»
		
		namespace Entitas {
			«IF namespace != null»
			using «namespace»;
			«ENDIF»
			public partial class Entity {
				«IF model.properties.empty»
				static readonly «model.name.toFirstUpper»Component «model.name.toFirstLower»Component = new «model.name.toFirstUpper»Component();

				public bool is«model.name.toFirstUpper» {
					get { return HasComponent(ComponentIds.«model.name.toFirstUpper»); }
					set {
						if (value != is«model.name.toFirstUpper») {
							if (value) {
								AddComponent(ComponentIds.«model.name.toFirstUpper», «model.name.toFirstLower»Component);
							} else {
								RemoveComponent(ComponentIds.«model.name.toFirstUpper»);
							}
						}
					}
				}
				
				public Entity Is«model.name.toFirstUpper»(bool value) {
					is«model.name.toFirstUpper» = value;
					return this;
				}
				«ELSE»
				public «model.name.toFirstUpper»Component «model.name.toFirstLower» { get { return («model.name.toFirstUpper»Component)GetComponent(ComponentIds.«model.name.toFirstUpper»); } }
				public bool has«model.name.toFirstUpper» { get { return HasComponent(ComponentIds.«model.name.toFirstUpper»); } }
				public Entity Add«model.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
					var component = CreateComponent<«model.name.toFirstUpper»Component>(ComponentIds.«model.name.toFirstUpper»);
					«FOR propertyName : model.properties.keySet»
					component.«propertyName» = new«propertyName.toFirstUpper»;
					«ENDFOR»
					return AddComponent(ComponentIds.«model.name.toFirstUpper», component);
				}
				public void Add«model.name.toFirstUpper»_(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
					var component = CreateComponent<«model.name.toFirstUpper»Component>(ComponentIds.«model.name.toFirstUpper»);
					«FOR propertyName : model.properties.keySet»
					component.«propertyName» = new«propertyName.toFirstUpper»;
					«ENDFOR»
					AddComponent(ComponentIds.«model.name.toFirstUpper», component);
				}
				public Entity Replace«model.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
					var component = CreateComponent<«model.name.toFirstUpper»Component>(ComponentIds.«model.name.toFirstUpper»);
					«FOR propertyName : model.properties.keySet»
					component.«propertyName» = new«propertyName.toFirstUpper»;
					«ENDFOR»
					ReplaceComponent(ComponentIds.«model.name.toFirstUpper», component);
					return this;
				}
				public void Replace«model.name.toFirstUpper»_(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
					var component = CreateComponent<«model.name.toFirstUpper»Component>(ComponentIds.«model.name.toFirstUpper»);
					«FOR propertyName : model.properties.keySet»
					component.«propertyName» = new«propertyName.toFirstUpper»;
					«ENDFOR»
					ReplaceComponent(ComponentIds.«model.name.toFirstUpper», component);
				}
				public Entity Remove«model.name.toFirstUpper»() {
					return RemoveComponent(ComponentIds.«model.name.toFirstUpper»);
				}
				public void Remove«model.name.toFirstUpper»_() {
					RemoveComponent(ComponentIds.«model.name.toFirstUpper»);
				}
				«ENDIF»
			}
			«IF model.unique»
			public partial class Pool {
				«IF model.properties.empty»
				public Entity «model.name.toFirstLower»Entity { get { return GetGroup(Matcher.«model.name.toFirstUpper»).GetSingleEntity(); } }
				public bool is«model.name.toFirstUpper» {
					get { return «model.name.toFirstLower»Entity != null; }
					set {
						var entity = «model.name.toFirstLower»Entity;
						if (value != (entity != null)) {
							if (value) {
								CreateEntity().is«model.name.toFirstUpper» = true;
							} else {
								DestroyEntity(entity);
							}
						}
					}
				}
				«ELSE»
				public Entity «model.name.toFirstLower»Entity { get { return GetGroup(Matcher.«model.name.toFirstUpper»).GetSingleEntity(); } }
				
				public «model.name.toFirstUpper»Component «model.name.toFirstLower» { get { return «model.name.toFirstLower»Entity.«model.name.toFirstLower»; } }
				
				public bool has«model.name.toFirstUpper» { get { return «model.name.toFirstLower»Entity != null; } }
				
				public Entity Set«model.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
					if (has«model.name.toFirstUpper») {
						throw new EntitasException("Could not set «model.name.toFirstLower»!\n" + this + " already has an entity with «model.name.toFirstUpper»Component!",
							"You should check if the pool already has a «model.name.toFirstLower»Entity before setting it or use pool.Replace«model.name.toFirstUpper»().");
					}
					var entity = CreateEntity();
					entity.Add«model.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»new«propertyName.toFirstUpper»«ENDFOR»);
					return entity;
				}
				
				public Entity Replace«model.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»«model.properties.get(propertyName)» new«propertyName.toFirstUpper»«ENDFOR») {
					var entity = «model.name.toFirstLower»Entity;
					if (entity == null) {
						entity = Set«model.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»new«propertyName.toFirstUpper»«ENDFOR»);
					} else {
						entity.Replace«model.name.toFirstUpper»(«FOR propertyName : model.properties.keySet SEPARATOR ', '»new«propertyName.toFirstUpper»«ENDFOR»);
					}
				
					return entity;
				}
				
				public void Remove«model.name.toFirstUpper»() {
					DestroyEntity(«model.name.toFirstLower»Entity);
				}
				«ENDIF»
			}
			«ENDIF»
			public partial class Matcher {
				static IMatcher _matcher«model.name.toFirstUpper»;
			
				public static IMatcher «model.name.toFirstUpper» {
					get {
						if (_matcher«model.name.toFirstUpper» == null) {
							var matcher = (Matcher)Matcher.AllOf(ComponentIds.«model.name.toFirstUpper»);
							matcher.componentNames = ComponentIds.componentNames;
							_matcher«model.name.toFirstUpper» = matcher;
						}
		
						return _matcher«model.name.toFirstUpper»;
					}
				}
			}
		}
	'''
	
	def String getNamespace(Resource resource){
		val project = resource.contents.filter(typeof(Project)).get(0) as Project
		return project.namespace?.name
	}
	
	def List<ComponentModel> collectAllComponents(Resource resource) {
		val result = newLinkedList()
		val project = resource.contents.filter(typeof(Project)).get(0) as Project
		project.components.forEach [
			val model = it.toComponentModel
			result.add(model)
		]
		project.typeAliases.filter[it.componentAlias != null].forEach [
			val model = it.toComponentModel
			result.add(model)
		]
		project.systems.filter[it.componentAlias != null].forEach [
			val model = it.toComponentModel
			result.add(model)
		]
		project.chains.filter[it.componentAlias != null].forEach [
			val model = new ComponentModel()
			model.name = it.name
			model.unique = it.componentAlias?.unique
			model.properties = newHashMap("value" -> "Entitas.Systems")
			result.add(model)
		]
		return result
	}
	
	def ComponentModel toComponentModel(AComponent component){
		switch component {
			Component case component: return component.toComponentModel 
			System case component: return component.toComponentModel
			Chain case component: return component.toComponentModel
			Alias case component : return component.toComponentModel
		}
		
		throw new Exception("Unexpected component type case " + component)
	}
	
	def ComponentModel toComponentModel(Component component){
		val model = new ComponentModel()
		model.name = component.name
		model.unique = component.componentAlias?.unique
		val properties = newHashMap()
		if (component.valueType != null) {
			properties.put("value", component.valueType.typeName)
		} else {
			component.properties.forEach [
				val typeName = it.type.typeName
				properties.put(it.name, typeName)
			]
		}
		model.properties = properties
		return model
	}
	
	def ComponentModel toComponentModel(Alias alias){
		val model = new ComponentModel()
		model.name = alias.name
		model.unique = alias.componentAlias?.unique
		model.properties = newHashMap("value" -> alias.typeName)
		return model
	}
	
	def ComponentModel toComponentModel(System system){
		val model = new ComponentModel()
		model.name = system.name
		model.unique = system.componentAlias?.unique
		model.properties = newHashMap("value" -> system.name.toUpperCase + "System")
		return model
	}
	
	def ComponentModel toComponentModel(Chain system){
		val model = new ComponentModel()
		model.name = system.name
		model.unique = system.componentAlias?.unique
		model.properties = newHashMap("value" -> system.name.toUpperCase + "Systems")
		return model
	}
	
	def String generateComponentsFile(List<ComponentModel> models, String namespace)'''
	«IF namespace != null»
	namespace «namespace» {
	«ENDIF»
	public static class ComponentIds {
		«FOR pair : models.indexedList»
		public const int «pair.value.name.toFirstUpper» = «pair.key»;
		«ENDFOR»
		public const int TotalComponents = «models.size»;
	
		public static readonly string[] componentNames = {
			«FOR model : models»
			"«model.name.toFirstUpper»",
			«ENDFOR»
		};
	
		public static readonly System.Type[] componentTypes = {
			«FOR model : models»
			typeof(«model.name.toFirstUpper»Component),
			«ENDFOR»
		};
	}
	«IF namespace != null»
	}
	«ENDIF»
	'''
	
	def <T> indexedList(List<T> models) {
		var result = new ArrayList<Pair<Integer, T>>();
		var index = 0
		for (T f : models){
			result.add(new Pair<Integer, T>(index, f))
			index += 1
		}
		result
	}
	
	def String getTypeName(Alias alias) {
		if (alias.singleAlias != null) {
			return alias.singleAlias.typeAlias
		}
		throw new Exception("Unexpected alias case " + alias)
	}
	
	def String getTypeName(AComponent component) {
		switch component {
			Component case component: return component.name.toFirstUpper + "Component" 
			System case component: return component.name.toFirstUpper + "Component"
			Chain case component: return component.name.toFirstUpper + "Component"
			Alias case component : return component.name.toFirstUpper + "Component"
		}
		
		throw new Exception("Unexpected component type case " + component)
	}
	
	def boolean getIsFlag(AComponent component){
		switch component {
			Component case component: return component.valueType == null && component.properties.empty 
			System case component: return false
			Chain case component: return false
			Alias case component : return false
		}
		
		throw new Exception("Unexpected component type case " + component)
	}
}
