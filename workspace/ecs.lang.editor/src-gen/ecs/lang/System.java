/**
 * generated by Xtext 2.10.0
 */
package ecs.lang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.System#isInit <em>Init</em>}</li>
 *   <li>{@link ecs.lang.System#isCleanup <em>Cleanup</em>}</li>
 *   <li>{@link ecs.lang.System#isTeardown <em>Teardown</em>}</li>
 *   <li>{@link ecs.lang.System#getInput <em>Input</em>}</li>
 *   <li>{@link ecs.lang.System#getUniqueComp <em>Unique Comp</em>}</li>
 *   <li>{@link ecs.lang.System#getGroups <em>Groups</em>}</li>
 *   <li>{@link ecs.lang.System#getIndex <em>Index</em>}</li>
 *   <li>{@link ecs.lang.System#getCreateRules <em>Create Rules</em>}</li>
 * </ul>
 *
 * @see ecs.lang.LangPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends AComponent, ASystem
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' attribute.
   * @see #setInit(boolean)
   * @see ecs.lang.LangPackage#getSystem_Init()
   * @model
   * @generated
   */
  boolean isInit();

  /**
   * Sets the value of the '{@link ecs.lang.System#isInit <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' attribute.
   * @see #isInit()
   * @generated
   */
  void setInit(boolean value);

  /**
   * Returns the value of the '<em><b>Cleanup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cleanup</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cleanup</em>' attribute.
   * @see #setCleanup(boolean)
   * @see ecs.lang.LangPackage#getSystem_Cleanup()
   * @model
   * @generated
   */
  boolean isCleanup();

  /**
   * Sets the value of the '{@link ecs.lang.System#isCleanup <em>Cleanup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cleanup</em>' attribute.
   * @see #isCleanup()
   * @generated
   */
  void setCleanup(boolean value);

  /**
   * Returns the value of the '<em><b>Teardown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teardown</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teardown</em>' attribute.
   * @see #setTeardown(boolean)
   * @see ecs.lang.LangPackage#getSystem_Teardown()
   * @model
   * @generated
   */
  boolean isTeardown();

  /**
   * Sets the value of the '{@link ecs.lang.System#isTeardown <em>Teardown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teardown</em>' attribute.
   * @see #isTeardown()
   * @generated
   */
  void setTeardown(boolean value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(Input)
   * @see ecs.lang.LangPackage#getSystem_Input()
   * @model containment="true"
   * @generated
   */
  Input getInput();

  /**
   * Sets the value of the '{@link ecs.lang.System#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Input value);

  /**
   * Returns the value of the '<em><b>Unique Comp</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.UniqueComponentAccess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique Comp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Comp</em>' containment reference list.
   * @see ecs.lang.LangPackage#getSystem_UniqueComp()
   * @model containment="true"
   * @generated
   */
  EList<UniqueComponentAccess> getUniqueComp();

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.Group}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see ecs.lang.LangPackage#getSystem_Groups()
   * @model containment="true"
   * @generated
   */
  EList<Group> getGroups();

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.Index}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference list.
   * @see ecs.lang.LangPackage#getSystem_Index()
   * @model containment="true"
   * @generated
   */
  EList<Index> getIndex();

  /**
   * Returns the value of the '<em><b>Create Rules</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.CreateRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Rules</em>' containment reference list.
   * @see ecs.lang.LangPackage#getSystem_CreateRules()
   * @model containment="true"
   * @generated
   */
  EList<CreateRule> getCreateRules();

} // System
