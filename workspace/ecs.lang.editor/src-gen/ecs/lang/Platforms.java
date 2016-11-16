/**
 * generated by Xtext 2.10.0
 */
package ecs.lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platforms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.Platforms#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see ecs.lang.LangPackage#getPlatforms()
 * @model
 * @generated
 */
public interface Platforms extends EObject
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.PlatformID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' containment reference list.
   * @see ecs.lang.LangPackage#getPlatforms_Ids()
   * @model containment="true"
   * @generated
   */
  EList<PlatformID> getIds();

} // Platforms
