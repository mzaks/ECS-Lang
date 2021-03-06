/**
 * generated by Xtext 2.10.0
 */
package ecs.lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.AliasList#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ecs.lang.LangPackage#getAliasList()
 * @model
 * @generated
 */
public interface AliasList extends EObject
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.AliasRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see ecs.lang.LangPackage#getAliasList_Rules()
   * @model containment="true"
   * @generated
   */
  EList<AliasRule> getRules();

} // AliasList
