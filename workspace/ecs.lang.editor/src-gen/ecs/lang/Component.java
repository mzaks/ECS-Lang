/**
 * generated by Xtext 2.10.0
 */
package ecs.lang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.Component#getValueType <em>Value Type</em>}</li>
 *   <li>{@link ecs.lang.Component#isIndex <em>Index</em>}</li>
 *   <li>{@link ecs.lang.Component#isMultiIndex <em>Multi Index</em>}</li>
 *   <li>{@link ecs.lang.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link ecs.lang.Component#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see ecs.lang.LangPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends AComponent
{
  /**
   * Returns the value of the '<em><b>Value Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' reference.
   * @see #setValueType(Alias)
   * @see ecs.lang.LangPackage#getComponent_ValueType()
   * @model
   * @generated
   */
  Alias getValueType();

  /**
   * Sets the value of the '{@link ecs.lang.Component#getValueType <em>Value Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' reference.
   * @see #getValueType()
   * @generated
   */
  void setValueType(Alias value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(boolean)
   * @see ecs.lang.LangPackage#getComponent_Index()
   * @model
   * @generated
   */
  boolean isIndex();

  /**
   * Sets the value of the '{@link ecs.lang.Component#isIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #isIndex()
   * @generated
   */
  void setIndex(boolean value);

  /**
   * Returns the value of the '<em><b>Multi Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi Index</em>' attribute.
   * @see #setMultiIndex(boolean)
   * @see ecs.lang.LangPackage#getComponent_MultiIndex()
   * @model
   * @generated
   */
  boolean isMultiIndex();

  /**
   * Sets the value of the '{@link ecs.lang.Component#isMultiIndex <em>Multi Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi Index</em>' attribute.
   * @see #isMultiIndex()
   * @generated
   */
  void setMultiIndex(boolean value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link ecs.lang.ComponentProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see ecs.lang.LangPackage#getComponent_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ComponentProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see ecs.lang.LangPackage#getComponent_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link ecs.lang.Component#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

} // Component
