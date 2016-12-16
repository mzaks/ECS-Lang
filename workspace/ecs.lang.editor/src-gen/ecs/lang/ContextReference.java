/**
 * generated by Xtext 2.10.0
 */
package ecs.lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.ContextReference#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see ecs.lang.LangPackage#getContextReference()
 * @model
 * @generated
 */
public interface ContextReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' reference list.
   * The list contents are of type {@link ecs.lang.ContextName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference list.
   * @see ecs.lang.LangPackage#getContextReference_Context()
   * @model
   * @generated
   */
  EList<ContextName> getContext();

} // ContextReference
