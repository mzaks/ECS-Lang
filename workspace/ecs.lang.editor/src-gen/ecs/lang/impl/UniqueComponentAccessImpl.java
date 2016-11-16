/**
 * generated by Xtext 2.10.0
 */
package ecs.lang.impl;

import ecs.lang.ApiRule;
import ecs.lang.LangPackage;
import ecs.lang.UniqueComponentAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Component Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.impl.UniqueComponentAccessImpl#getApiRule <em>Api Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniqueComponentAccessImpl extends MinimalEObjectImpl.Container implements UniqueComponentAccess
{
  /**
   * The cached value of the '{@link #getApiRule() <em>Api Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApiRule()
   * @generated
   * @ordered
   */
  protected ApiRule apiRule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UniqueComponentAccessImpl()
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
    return LangPackage.Literals.UNIQUE_COMPONENT_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApiRule getApiRule()
  {
    return apiRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApiRule(ApiRule newApiRule, NotificationChain msgs)
  {
    ApiRule oldApiRule = apiRule;
    apiRule = newApiRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE, oldApiRule, newApiRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApiRule(ApiRule newApiRule)
  {
    if (newApiRule != apiRule)
    {
      NotificationChain msgs = null;
      if (apiRule != null)
        msgs = ((InternalEObject)apiRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE, null, msgs);
      if (newApiRule != null)
        msgs = ((InternalEObject)newApiRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE, null, msgs);
      msgs = basicSetApiRule(newApiRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE, newApiRule, newApiRule));
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
      case LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE:
        return basicSetApiRule(null, msgs);
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
      case LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE:
        return getApiRule();
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
      case LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE:
        setApiRule((ApiRule)newValue);
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
      case LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE:
        setApiRule((ApiRule)null);
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
      case LangPackage.UNIQUE_COMPONENT_ACCESS__API_RULE:
        return apiRule != null;
    }
    return super.eIsSet(featureID);
  }

} //UniqueComponentAccessImpl
