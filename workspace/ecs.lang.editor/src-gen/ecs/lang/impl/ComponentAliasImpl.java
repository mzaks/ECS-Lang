/**
 * generated by Xtext 2.10.0
 */
package ecs.lang.impl;

import ecs.lang.ComponentAlias;
import ecs.lang.ContextReference;
import ecs.lang.LangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.impl.ComponentAliasImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link ecs.lang.impl.ComponentAliasImpl#getContextRef <em>Context Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentAliasImpl extends MinimalEObjectImpl.Container implements ComponentAlias
{
  /**
   * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected static final boolean UNIQUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected boolean unique = UNIQUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getContextRef() <em>Context Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextRef()
   * @generated
   * @ordered
   */
  protected ContextReference contextRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentAliasImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LangPackage.Literals.COMPONENT_ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnique()
  {
    return unique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnique(boolean newUnique)
  {
    boolean oldUnique = unique;
    unique = newUnique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.COMPONENT_ALIAS__UNIQUE, oldUnique, unique));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextReference getContextRef()
  {
    return contextRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextRef(ContextReference newContextRef, NotificationChain msgs)
  {
    ContextReference oldContextRef = contextRef;
    contextRef = newContextRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.COMPONENT_ALIAS__CONTEXT_REF, oldContextRef, newContextRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextRef(ContextReference newContextRef)
  {
    if (newContextRef != contextRef)
    {
      NotificationChain msgs = null;
      if (contextRef != null)
        msgs = ((InternalEObject)contextRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.COMPONENT_ALIAS__CONTEXT_REF, null, msgs);
      if (newContextRef != null)
        msgs = ((InternalEObject)newContextRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.COMPONENT_ALIAS__CONTEXT_REF, null, msgs);
      msgs = basicSetContextRef(newContextRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.COMPONENT_ALIAS__CONTEXT_REF, newContextRef, newContextRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LangPackage.COMPONENT_ALIAS__CONTEXT_REF:
        return basicSetContextRef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LangPackage.COMPONENT_ALIAS__UNIQUE:
        return isUnique();
      case LangPackage.COMPONENT_ALIAS__CONTEXT_REF:
        return getContextRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LangPackage.COMPONENT_ALIAS__UNIQUE:
        setUnique((Boolean)newValue);
        return;
      case LangPackage.COMPONENT_ALIAS__CONTEXT_REF:
        setContextRef((ContextReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LangPackage.COMPONENT_ALIAS__UNIQUE:
        setUnique(UNIQUE_EDEFAULT);
        return;
      case LangPackage.COMPONENT_ALIAS__CONTEXT_REF:
        setContextRef((ContextReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LangPackage.COMPONENT_ALIAS__UNIQUE:
        return unique != UNIQUE_EDEFAULT;
      case LangPackage.COMPONENT_ALIAS__CONTEXT_REF:
        return contextRef != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (unique: ");
    result.append(unique);
    result.append(')');
    return result.toString();
  }

} //ComponentAliasImpl