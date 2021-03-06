/**
 * generated by Xtext 2.10.0
 */
package ecs.lang.impl;

import ecs.lang.AComponent;
import ecs.lang.ASystem;
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
import ecs.lang.LangFactory;
import ecs.lang.LangPackage;
import ecs.lang.Namespace;
import ecs.lang.Observer;
import ecs.lang.Parameter;
import ecs.lang.PlatformID;
import ecs.lang.Platforms;
import ecs.lang.Procedure;
import ecs.lang.Project;
import ecs.lang.SingleAlias;
import ecs.lang.UniqueComponentAccess;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LangFactoryImpl extends EFactoryImpl implements LangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LangFactory init()
  {
    try
    {
      LangFactory theLangFactory = (LangFactory)EPackage.Registry.INSTANCE.getEFactory(LangPackage.eNS_URI);
      if (theLangFactory != null)
      {
        return theLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LangPackage.PROJECT: return createProject();
      case LangPackage.CONTEXT_DEFINITION: return createContextDefinition();
      case LangPackage.CONTEXT_NAME: return createContextName();
      case LangPackage.CONTEXT_REFERENCE: return createContextReference();
      case LangPackage.PLATFORMS: return createPlatforms();
      case LangPackage.PLATFORM_ID: return createPlatformID();
      case LangPackage.NAMESPACE: return createNamespace();
      case LangPackage.ALIAS: return createAlias();
      case LangPackage.COMPONENT_ALIAS: return createComponentAlias();
      case LangPackage.SINGLE_ALIAS: return createSingleAlias();
      case LangPackage.ALIAS_LIST: return createAliasList();
      case LangPackage.ALIAS_RULE: return createAliasRule();
      case LangPackage.ACOMPONENT: return createAComponent();
      case LangPackage.COMPONENT: return createComponent();
      case LangPackage.COMPONENT_PROPERTY: return createComponentProperty();
      case LangPackage.SYSTEM: return createSystem();
      case LangPackage.INPUT: return createInput();
      case LangPackage.INPUT_TRIGGER: return createInputTrigger();
      case LangPackage.CREATE_RULE: return createCreateRule();
      case LangPackage.INDEX: return createIndex();
      case LangPackage.UNIQUE_COMPONENT_ACCESS: return createUniqueComponentAccess();
      case LangPackage.GROUP: return createGroup();
      case LangPackage.API_RULE: return createApiRule();
      case LangPackage.ASYSTEM: return createASystem();
      case LangPackage.CHAIN: return createChain();
      case LangPackage.PROCEDURE: return createProcedure();
      case LangPackage.OBSERVER: return createObserver();
      case LangPackage.PARAMETER: return createParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDefinition createContextDefinition()
  {
    ContextDefinitionImpl contextDefinition = new ContextDefinitionImpl();
    return contextDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextName createContextName()
  {
    ContextNameImpl contextName = new ContextNameImpl();
    return contextName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextReference createContextReference()
  {
    ContextReferenceImpl contextReference = new ContextReferenceImpl();
    return contextReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Platforms createPlatforms()
  {
    PlatformsImpl platforms = new PlatformsImpl();
    return platforms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformID createPlatformID()
  {
    PlatformIDImpl platformID = new PlatformIDImpl();
    return platformID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias createAlias()
  {
    AliasImpl alias = new AliasImpl();
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentAlias createComponentAlias()
  {
    ComponentAliasImpl componentAlias = new ComponentAliasImpl();
    return componentAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleAlias createSingleAlias()
  {
    SingleAliasImpl singleAlias = new SingleAliasImpl();
    return singleAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasList createAliasList()
  {
    AliasListImpl aliasList = new AliasListImpl();
    return aliasList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasRule createAliasRule()
  {
    AliasRuleImpl aliasRule = new AliasRuleImpl();
    return aliasRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AComponent createAComponent()
  {
    AComponentImpl aComponent = new AComponentImpl();
    return aComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentProperty createComponentProperty()
  {
    ComponentPropertyImpl componentProperty = new ComponentPropertyImpl();
    return componentProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecs.lang.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputTrigger createInputTrigger()
  {
    InputTriggerImpl inputTrigger = new InputTriggerImpl();
    return inputTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateRule createCreateRule()
  {
    CreateRuleImpl createRule = new CreateRuleImpl();
    return createRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Index createIndex()
  {
    IndexImpl index = new IndexImpl();
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueComponentAccess createUniqueComponentAccess()
  {
    UniqueComponentAccessImpl uniqueComponentAccess = new UniqueComponentAccessImpl();
    return uniqueComponentAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApiRule createApiRule()
  {
    ApiRuleImpl apiRule = new ApiRuleImpl();
    return apiRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASystem createASystem()
  {
    ASystemImpl aSystem = new ASystemImpl();
    return aSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chain createChain()
  {
    ChainImpl chain = new ChainImpl();
    return chain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observer createObserver()
  {
    ObserverImpl observer = new ObserverImpl();
    return observer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangPackage getLangPackage()
  {
    return (LangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LangPackage getPackage()
  {
    return LangPackage.eINSTANCE;
  }

} //LangFactoryImpl
