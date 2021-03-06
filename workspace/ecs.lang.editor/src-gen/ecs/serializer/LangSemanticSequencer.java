/*
 * generated by Xtext 2.10.0
 */
package ecs.serializer;

import com.google.inject.Inject;
import ecs.lang.Alias;
import ecs.lang.AliasList;
import ecs.lang.AliasRule;
import ecs.lang.ApiRule;
import ecs.lang.Chain;
import ecs.lang.Component;
import ecs.lang.ComponentAlias;
import ecs.lang.ComponentProperty;
import ecs.lang.ContextDefinition;
import ecs.lang.ContextName;
import ecs.lang.ContextReference;
import ecs.lang.CreateRule;
import ecs.lang.Group;
import ecs.lang.Index;
import ecs.lang.Input;
import ecs.lang.InputTrigger;
import ecs.lang.LangPackage;
import ecs.lang.Namespace;
import ecs.lang.Observer;
import ecs.lang.PlatformID;
import ecs.lang.Platforms;
import ecs.lang.Procedure;
import ecs.lang.Project;
import ecs.lang.SingleAlias;
import ecs.lang.UniqueComponentAccess;
import ecs.services.LangGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LangPackage.ALIAS:
				sequence_Alias(context, (Alias) semanticObject); 
				return; 
			case LangPackage.ALIAS_LIST:
				sequence_AliasList(context, (AliasList) semanticObject); 
				return; 
			case LangPackage.ALIAS_RULE:
				sequence_AliasRule(context, (AliasRule) semanticObject); 
				return; 
			case LangPackage.API_RULE:
				sequence_ApiRule(context, (ApiRule) semanticObject); 
				return; 
			case LangPackage.CHAIN:
				sequence_Chain(context, (Chain) semanticObject); 
				return; 
			case LangPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case LangPackage.COMPONENT_ALIAS:
				sequence_ComponentAlias(context, (ComponentAlias) semanticObject); 
				return; 
			case LangPackage.COMPONENT_PROPERTY:
				sequence_ComponentProperty(context, (ComponentProperty) semanticObject); 
				return; 
			case LangPackage.CONTEXT_DEFINITION:
				sequence_ContextDefinition(context, (ContextDefinition) semanticObject); 
				return; 
			case LangPackage.CONTEXT_NAME:
				sequence_ContextName(context, (ContextName) semanticObject); 
				return; 
			case LangPackage.CONTEXT_REFERENCE:
				sequence_ContextReference(context, (ContextReference) semanticObject); 
				return; 
			case LangPackage.CREATE_RULE:
				sequence_CreateRule(context, (CreateRule) semanticObject); 
				return; 
			case LangPackage.GROUP:
				sequence_Group(context, (Group) semanticObject); 
				return; 
			case LangPackage.INDEX:
				sequence_Index(context, (Index) semanticObject); 
				return; 
			case LangPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case LangPackage.INPUT_TRIGGER:
				sequence_InputTrigger(context, (InputTrigger) semanticObject); 
				return; 
			case LangPackage.NAMESPACE:
				sequence_Namespace(context, (Namespace) semanticObject); 
				return; 
			case LangPackage.OBSERVER:
				sequence_Observer(context, (Observer) semanticObject); 
				return; 
			case LangPackage.PARAMETER:
				sequence_Parameter(context, (ecs.lang.Parameter) semanticObject); 
				return; 
			case LangPackage.PLATFORM_ID:
				sequence_PlatformID(context, (PlatformID) semanticObject); 
				return; 
			case LangPackage.PLATFORMS:
				sequence_Platforms(context, (Platforms) semanticObject); 
				return; 
			case LangPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case LangPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case LangPackage.SINGLE_ALIAS:
				sequence_SingleAlias(context, (SingleAlias) semanticObject); 
				return; 
			case LangPackage.SYSTEM:
				sequence_System(context, (ecs.lang.System) semanticObject); 
				return; 
			case LangPackage.UNIQUE_COMPONENT_ACCESS:
				sequence_UniqueComponentAccess(context, (UniqueComponentAccess) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AliasList returns AliasList
	 *
	 * Constraint:
	 *     rules+=AliasRule+
	 */
	protected void sequence_AliasList(ISerializationContext context, AliasList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AliasRule returns AliasRule
	 *
	 * Constraint:
	 *     (platform=[PlatformID|ID] typeAlias=STRING (size=INT variableSize?='*'?)?)
	 */
	protected void sequence_AliasRule(ISerializationContext context, AliasRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Alias returns Alias
	 *     AComponent returns Alias
	 *
	 * Constraint:
	 *     (componentAlias=ComponentAlias? name=ValidID (listOfAliases=AliasList | singleAlias=SingleAlias))
	 */
	protected void sequence_Alias(ISerializationContext context, Alias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ApiRule returns ApiRule
	 *
	 * Constraint:
	 *     (component=[AComponent|ID] accesors+=ComponentApiAccessor*)
	 */
	protected void sequence_ApiRule(ISerializationContext context, ApiRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AComponent returns Chain
	 *     ASystem returns Chain
	 *     Chain returns Chain
	 *
	 * Constraint:
	 *     (
	 *         componentAlias=ComponentAlias? 
	 *         name=ValidID 
	 *         (precondition?='precondition' uniqueComp+=UniqueComponentAccess* groups+=Group*)? 
	 *         children+=[ASystem|ID]+
	 *     )
	 */
	protected void sequence_Chain(ISerializationContext context, Chain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentAlias returns ComponentAlias
	 *
	 * Constraint:
	 *     (unique?='ucomp'? contextRef=ContextReference? unique?='unique'?)
	 */
	protected void sequence_ComponentAlias(ISerializationContext context, ComponentAlias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentProperty returns ComponentProperty
	 *
	 * Constraint:
	 *     (name=ValidID type=[Alias|ID])
	 */
	protected void sequence_ComponentProperty(ISerializationContext context, ComponentProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LangPackage.Literals.COMPONENT_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LangPackage.Literals.COMPONENT_PROPERTY__NAME));
			if (transientValues.isValueTransient(semanticObject, LangPackage.Literals.COMPONENT_PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LangPackage.Literals.COMPONENT_PROPERTY__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentPropertyAccess().getNameValidIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentPropertyAccess().getTypeAliasIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AComponent returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         componentAlias=ComponentAlias 
	 *         name=ValidID 
	 *         ((valueType=[Alias|ID] (index?='asIndexKey' | multiIndex?='asMultiIndexKey')?) | properties+=ComponentProperty+ | prefix=STRING)?
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextDefinition returns ContextDefinition
	 *
	 * Constraint:
	 *     names+=ContextName+
	 */
	protected void sequence_ContextDefinition(ISerializationContext context, ContextDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContextName returns ContextName
	 *
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_ContextName(ISerializationContext context, ContextName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LangPackage.Literals.CONTEXT_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LangPackage.Literals.CONTEXT_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContextNameAccess().getNameValidIDParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ContextReference returns ContextReference
	 *
	 * Constraint:
	 *     context+=[ContextName|ID]+
	 */
	protected void sequence_ContextReference(ISerializationContext context, ContextReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CreateRule returns CreateRule
	 *
	 * Constraint:
	 *     (name=ValidID componentTypes+=[AComponent|ID]+ contextRef=[ContextName|ID]?)
	 */
	protected void sequence_CreateRule(ISerializationContext context, CreateRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Group returns Group
	 *
	 * Constraint:
	 *     (
	 *         (group?='group' | unique?='unique') 
	 *         name=ValidID 
	 *         allOfComponents+=[AComponent|ID]* 
	 *         anyOfComponents+=[AComponent|ID]* 
	 *         noneOfComponents+=[AComponent|ID]* 
	 *         apiRules+=ApiRule* 
	 *         destroy?='destroy'? 
	 *         contextRef=[ContextName|ID]?
	 *     )
	 */
	protected void sequence_Group(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Index returns Index
	 *
	 * Constraint:
	 *     (name=ValidID componentRef=[Component|ID] (apiRules+=ApiRule+ destroy?='destroy'?)? contextRef=[ContextName|ID]?)
	 */
	protected void sequence_Index(ISerializationContext context, Index semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InputTrigger returns InputTrigger
	 *
	 * Constraint:
	 *     (enterComponents+=[AComponent|ID]+ | left+=[AComponent|ID]+ | enteredOrLeft+=[AComponent|ID]+)
	 */
	protected void sequence_InputTrigger(ISerializationContext context, InputTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (
	 *         unqiue?='unique'? 
	 *         triggers+=InputTrigger+ 
	 *         ensureComponents+=[AComponent|ID]* 
	 *         excludeComponents+=[AComponent|ID]* 
	 *         apiRules+=ApiRule* 
	 *         destroy?='destroy'? 
	 *         contextRef=[ContextName|ID]?
	 *     )
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns Namespace
	 *
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_Namespace(ISerializationContext context, Namespace semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LangPackage.Literals.NAMESPACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LangPackage.Literals.NAMESPACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Observer returns Observer
	 *
	 * Constraint:
	 *     (name=ValidID observedGroup=Group uniqueComp+=UniqueComponentAccess* groups+=Group* createRules+=CreateRule*)
	 */
	protected void sequence_Observer(ISerializationContext context, Observer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=ValidID type=[Alias|ID])
	 */
	protected void sequence_Parameter(ISerializationContext context, ecs.lang.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LangPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LangPackage.Literals.PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, LangPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LangPackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeAliasIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PlatformID returns PlatformID
	 *
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_PlatformID(ISerializationContext context, PlatformID semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LangPackage.Literals.PLATFORM_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LangPackage.Literals.PLATFORM_ID__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlatformIDAccess().getNameValidIDParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Platforms returns Platforms
	 *
	 * Constraint:
	 *     ids+=PlatformID+
	 */
	protected void sequence_Platforms(ISerializationContext context, Platforms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (
	 *         (componentAlias?='comp' contextRef=ContextReference? unique?='unique'?)? 
	 *         name=ValidID 
	 *         params+=Parameter* 
	 *         uniqueComp+=UniqueComponentAccess* 
	 *         groups+=Group* 
	 *         index+=Index* 
	 *         createRules+=CreateRule* 
	 *         type=[Alias|ID]?
	 *     )
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Project returns Project
	 *
	 * Constraint:
	 *     (
	 *         (platformDefinition=Platforms? ((observers+=Observer+ chains+=Chain+) | chains+=Chain+)) | 
	 *         (
	 *             platformDefinition=Platforms? 
	 *             (
	 *                 (namespace=Namespace? ((observers+=Observer+ chains+=Chain+) | chains+=Chain+)) | 
	 *                 (
	 *                     namespace=Namespace? 
	 *                     (
	 *                         (contextDefinition=ContextDefinition? ((observers+=Observer+ chains+=Chain+) | chains+=Chain+)) | 
	 *                         (contextDefinition=ContextDefinition? typeAliases+=Alias+ ((observers+=Observer+ chains+=Chain+) | chains+=Chain+))
	 *                     )
	 *                 )
	 *             )
	 *         ) | 
	 *         (
	 *             (
	 *                 (platformDefinition=Platforms? components+=Component+) | 
	 *                 (
	 *                     platformDefinition=Platforms? 
	 *                     (
	 *                         (namespace=Namespace? components+=Component+) | 
	 *                         (
	 *                             namespace=Namespace? 
	 *                             (
	 *                                 (contextDefinition=ContextDefinition? components+=Component+) | 
	 *                                 (contextDefinition=ContextDefinition? typeAliases+=Alias+ components+=Component+)
	 *                             )
	 *                         )
	 *                     )
	 *                 ) | 
	 *                 components+=Component+
	 *             ) 
	 *             ((observers+=Observer+ chains+=Chain+) | chains+=Chain+)
	 *         ) | 
	 *         (
	 *             (
	 *                 (platformDefinition=Platforms? ((components+=Component+ procedures+=Procedure+) | procedures+=Procedure+)) | 
	 *                 (
	 *                     platformDefinition=Platforms? 
	 *                     (
	 *                         (namespace=Namespace? ((components+=Component+ procedures+=Procedure+) | procedures+=Procedure+)) | 
	 *                         (
	 *                             namespace=Namespace? 
	 *                             (
	 *                                 (contextDefinition=ContextDefinition? ((components+=Component+ procedures+=Procedure+) | procedures+=Procedure+)) | 
	 *                                 (contextDefinition=ContextDefinition? typeAliases+=Alias+ ((components+=Component+ procedures+=Procedure+) | procedures+=Procedure+))
	 *                             )
	 *                         )
	 *                     )
	 *                 ) | 
	 *                 (components+=Component+ procedures+=Procedure+) | 
	 *                 procedures+=Procedure+
	 *             ) 
	 *             ((observers+=Observer+ chains+=Chain+) | chains+=Chain+)
	 *         ) | 
	 *         (
	 *             (
	 *                 (platformDefinition=Platforms? ((procedures+=Procedure+ observers+=Observer+) | observers+=Observer+)) | 
	 *                 (
	 *                     platformDefinition=Platforms? 
	 *                     (
	 *                         (namespace=Namespace? ((procedures+=Procedure+ observers+=Observer+) | observers+=Observer+)) | 
	 *                         (
	 *                             namespace=Namespace? 
	 *                             (
	 *                                 (contextDefinition=ContextDefinition? ((procedures+=Procedure+ observers+=Observer+) | observers+=Observer+)) | 
	 *                                 (contextDefinition=ContextDefinition? typeAliases+=Alias+ ((procedures+=Procedure+ observers+=Observer+) | observers+=Observer+))
	 *                             )
	 *                         )
	 *                     )
	 *                 ) | 
	 *                 (
	 *                     (
	 *                         (platformDefinition=Platforms? components+=Component+) | 
	 *                         (
	 *                             platformDefinition=Platforms? 
	 *                             (
	 *                                 (namespace=Namespace? components+=Component+) | 
	 *                                 (
	 *                                     namespace=Namespace? 
	 *                                     (
	 *                                         (contextDefinition=ContextDefinition? components+=Component+) | 
	 *                                         (contextDefinition=ContextDefinition? typeAliases+=Alias+ components+=Component+)
	 *                                     )
	 *                                 )
	 *                             )
	 *                         ) | 
	 *                         components+=Component+
	 *                     ) 
	 *                     ((procedures+=Procedure+ observers+=Observer+) | observers+=Observer+)
	 *                 ) | 
	 *                 (procedures+=Procedure+ observers+=Observer+) | 
	 *                 observers+=Observer+
	 *             )? 
	 *             systems+=System+ 
	 *             chains+=Chain+
	 *         ) | 
	 *         (observers+=Observer+ chains+=Chain+) | 
	 *         chains+=Chain+
	 *     )?
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleAlias returns SingleAlias
	 *
	 * Constraint:
	 *     (typeAlias=STRING size=INT?)
	 */
	protected void sequence_SingleAlias(ISerializationContext context, SingleAlias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AComponent returns System
	 *     System returns System
	 *     ASystem returns System
	 *
	 * Constraint:
	 *     (
	 *         componentAlias=ComponentAlias? 
	 *         init?='init'? 
	 *         cleanup?='cleanup'? 
	 *         teardown?='teardown'? 
	 *         name=ValidID 
	 *         input=Input? 
	 *         uniqueComp+=UniqueComponentAccess* 
	 *         groups+=Group* 
	 *         index+=Index* 
	 *         createRules+=CreateRule*
	 *     )
	 */
	protected void sequence_System(ISerializationContext context, ecs.lang.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UniqueComponentAccess returns UniqueComponentAccess
	 *
	 * Constraint:
	 *     (apiRule=ApiRule contextRef=[ContextName|ID]?)
	 */
	protected void sequence_UniqueComponentAccess(ISerializationContext context, UniqueComponentAccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
