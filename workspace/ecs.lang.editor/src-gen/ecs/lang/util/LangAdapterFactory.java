/**
 * generated by Xtext 2.10.0
 */
package ecs.lang.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecs.lang.LangPackage
 * @generated
 */
public class LangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LangSwitch<Adapter> modelSwitch =
    new LangSwitch<Adapter>()
    {
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseContextDefinition(ContextDefinition object)
      {
        return createContextDefinitionAdapter();
      }
      @Override
      public Adapter caseContextName(ContextName object)
      {
        return createContextNameAdapter();
      }
      @Override
      public Adapter caseContextReference(ContextReference object)
      {
        return createContextReferenceAdapter();
      }
      @Override
      public Adapter casePlatforms(Platforms object)
      {
        return createPlatformsAdapter();
      }
      @Override
      public Adapter casePlatformID(PlatformID object)
      {
        return createPlatformIDAdapter();
      }
      @Override
      public Adapter caseNamespace(Namespace object)
      {
        return createNamespaceAdapter();
      }
      @Override
      public Adapter caseAlias(Alias object)
      {
        return createAliasAdapter();
      }
      @Override
      public Adapter caseComponentAlias(ComponentAlias object)
      {
        return createComponentAliasAdapter();
      }
      @Override
      public Adapter caseSingleAlias(SingleAlias object)
      {
        return createSingleAliasAdapter();
      }
      @Override
      public Adapter caseAliasList(AliasList object)
      {
        return createAliasListAdapter();
      }
      @Override
      public Adapter caseAliasRule(AliasRule object)
      {
        return createAliasRuleAdapter();
      }
      @Override
      public Adapter caseAComponent(AComponent object)
      {
        return createAComponentAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseComponentProperty(ComponentProperty object)
      {
        return createComponentPropertyAdapter();
      }
      @Override
      public Adapter caseSystem(ecs.lang.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseInputTrigger(InputTrigger object)
      {
        return createInputTriggerAdapter();
      }
      @Override
      public Adapter caseCreateRule(CreateRule object)
      {
        return createCreateRuleAdapter();
      }
      @Override
      public Adapter caseIndex(Index object)
      {
        return createIndexAdapter();
      }
      @Override
      public Adapter caseUniqueComponentAccess(UniqueComponentAccess object)
      {
        return createUniqueComponentAccessAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseApiRule(ApiRule object)
      {
        return createApiRuleAdapter();
      }
      @Override
      public Adapter caseASystem(ASystem object)
      {
        return createASystemAdapter();
      }
      @Override
      public Adapter caseChain(Chain object)
      {
        return createChainAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseObserver(Observer object)
      {
        return createObserverAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.ContextDefinition <em>Context Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.ContextDefinition
   * @generated
   */
  public Adapter createContextDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.ContextName <em>Context Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.ContextName
   * @generated
   */
  public Adapter createContextNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.ContextReference <em>Context Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.ContextReference
   * @generated
   */
  public Adapter createContextReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Platforms <em>Platforms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Platforms
   * @generated
   */
  public Adapter createPlatformsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.PlatformID <em>Platform ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.PlatformID
   * @generated
   */
  public Adapter createPlatformIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Namespace
   * @generated
   */
  public Adapter createNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Alias
   * @generated
   */
  public Adapter createAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.ComponentAlias <em>Component Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.ComponentAlias
   * @generated
   */
  public Adapter createComponentAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.SingleAlias <em>Single Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.SingleAlias
   * @generated
   */
  public Adapter createSingleAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.AliasList <em>Alias List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.AliasList
   * @generated
   */
  public Adapter createAliasListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.AliasRule <em>Alias Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.AliasRule
   * @generated
   */
  public Adapter createAliasRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.AComponent <em>AComponent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.AComponent
   * @generated
   */
  public Adapter createAComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.ComponentProperty <em>Component Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.ComponentProperty
   * @generated
   */
  public Adapter createComponentPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.InputTrigger <em>Input Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.InputTrigger
   * @generated
   */
  public Adapter createInputTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.CreateRule <em>Create Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.CreateRule
   * @generated
   */
  public Adapter createCreateRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Index <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Index
   * @generated
   */
  public Adapter createIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.UniqueComponentAccess <em>Unique Component Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.UniqueComponentAccess
   * @generated
   */
  public Adapter createUniqueComponentAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.ApiRule <em>Api Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.ApiRule
   * @generated
   */
  public Adapter createApiRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.ASystem <em>ASystem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.ASystem
   * @generated
   */
  public Adapter createASystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Chain <em>Chain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Chain
   * @generated
   */
  public Adapter createChainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Observer <em>Observer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Observer
   * @generated
   */
  public Adapter createObserverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ecs.lang.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ecs.lang.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LangAdapterFactory
