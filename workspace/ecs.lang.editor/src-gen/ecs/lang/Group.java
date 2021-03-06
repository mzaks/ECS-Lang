/**
 * generated by Xtext 2.10.0
 */
package ecs.lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.Group#isGroup <em>Group</em>}</li>
 *   <li>{@link ecs.lang.Group#isUnique <em>Unique</em>}</li>
 *   <li>{@link ecs.lang.Group#getName <em>Name</em>}</li>
 *   <li>{@link ecs.lang.Group#getAllOfComponents <em>All Of Components</em>}</li>
 *   <li>{@link ecs.lang.Group#getAnyOfComponents <em>Any Of Components</em>}</li>
 *   <li>{@link ecs.lang.Group#getNoneOfComponents <em>None Of Components</em>}</li>
 *   <li>{@link ecs.lang.Group#getApiRules <em>Api Rules</em>}</li>
 *   <li>{@link ecs.lang.Group#isDestroy <em>Destroy</em>}</li>
 *   <li>{@link ecs.lang.Group#getContextRef <em>Context Ref</em>}</li>
 * </ul>
 *
 * @see ecs.lang.LangPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject
{
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute.
   * @see #setGroup(boolean)
   * @see ecs.lang.LangPackage#getGroup_Group()
   * @model
   * @generated
   */
  boolean isGroup();

  /**
   * Sets the value of the '{@link ecs.lang.Group#isGroup <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' attribute.
   * @see #isGroup()
   * @generated
   */
  void setGroup(boolean value);

  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see ecs.lang.LangPackage#getGroup_Unique()
   * @model
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link ecs.lang.Group#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ecs.lang.LangPackage#getGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ecs.lang.Group#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>All Of Components</b></em>' reference list.
   * The list contents are of type {@link ecs.lang.AComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Of Components</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Of Components</em>' reference list.
   * @see ecs.lang.LangPackage#getGroup_AllOfComponents()
   * @model
   * @generated
   */
  EList<AComponent> getAllOfComponents();

  /**
   * Returns the value of the '<em><b>Any Of Components</b></em>' reference list.
   * The list contents are of type {@link ecs.lang.AComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Of Components</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Of Components</em>' reference list.
   * @see ecs.lang.LangPackage#getGroup_AnyOfComponents()
   * @model
   * @generated
   */
  EList<AComponent> getAnyOfComponents();

  /**
   * Returns the value of the '<em><b>None Of Components</b></em>' reference list.
   * The list contents are of type {@link ecs.lang.AComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>None Of Components</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>None Of Components</em>' reference list.
   * @see ecs.lang.LangPackage#getGroup_NoneOfComponents()
   * @model
   * @generated
   */
  EList<AComponent> getNoneOfComponents();

  /**
   * Returns the value of the '<em><b>Api Rules</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.ApiRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Api Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Api Rules</em>' containment reference list.
   * @see ecs.lang.LangPackage#getGroup_ApiRules()
   * @model containment="true"
   * @generated
   */
  EList<ApiRule> getApiRules();

  /**
   * Returns the value of the '<em><b>Destroy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destroy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destroy</em>' attribute.
   * @see #setDestroy(boolean)
   * @see ecs.lang.LangPackage#getGroup_Destroy()
   * @model
   * @generated
   */
  boolean isDestroy();

  /**
   * Sets the value of the '{@link ecs.lang.Group#isDestroy <em>Destroy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destroy</em>' attribute.
   * @see #isDestroy()
   * @generated
   */
  void setDestroy(boolean value);

  /**
   * Returns the value of the '<em><b>Context Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Ref</em>' reference.
   * @see #setContextRef(ContextName)
   * @see ecs.lang.LangPackage#getGroup_ContextRef()
   * @model
   * @generated
   */
  ContextName getContextRef();

  /**
   * Sets the value of the '{@link ecs.lang.Group#getContextRef <em>Context Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Ref</em>' reference.
   * @see #getContextRef()
   * @generated
   */
  void setContextRef(ContextName value);

} // Group
