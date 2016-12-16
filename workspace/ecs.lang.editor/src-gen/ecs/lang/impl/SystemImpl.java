/**
 * generated by Xtext 2.10.0
 */
package ecs.lang.impl;

import ecs.lang.CreateRule;
import ecs.lang.Group;
import ecs.lang.Index;
import ecs.lang.Input;
import ecs.lang.LangPackage;
import ecs.lang.UniqueComponentAccess;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.impl.SystemImpl#isComponentAlias <em>Component Alias</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#isInit <em>Init</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#isCleanup <em>Cleanup</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#isTeardown <em>Teardown</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#getInput <em>Input</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#getUniqueComp <em>Unique Comp</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link ecs.lang.impl.SystemImpl#getCreateRules <em>Create Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends AComponentImpl implements ecs.lang.System
{
  /**
   * The default value of the '{@link #isComponentAlias() <em>Component Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComponentAlias()
   * @generated
   * @ordered
   */
  protected static final boolean COMPONENT_ALIAS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isComponentAlias() <em>Component Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComponentAlias()
   * @generated
   * @ordered
   */
  protected boolean componentAlias = COMPONENT_ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInit()
   * @generated
   * @ordered
   */
  protected static final boolean INIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInit()
   * @generated
   * @ordered
   */
  protected boolean init = INIT_EDEFAULT;

  /**
   * The default value of the '{@link #isCleanup() <em>Cleanup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleanup()
   * @generated
   * @ordered
   */
  protected static final boolean CLEANUP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCleanup() <em>Cleanup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleanup()
   * @generated
   * @ordered
   */
  protected boolean cleanup = CLEANUP_EDEFAULT;

  /**
   * The default value of the '{@link #isTeardown() <em>Teardown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTeardown()
   * @generated
   * @ordered
   */
  protected static final boolean TEARDOWN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTeardown() <em>Teardown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTeardown()
   * @generated
   * @ordered
   */
  protected boolean teardown = TEARDOWN_EDEFAULT;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected Input input;

  /**
   * The cached value of the '{@link #getUniqueComp() <em>Unique Comp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniqueComp()
   * @generated
   * @ordered
   */
  protected EList<UniqueComponentAccess> uniqueComp;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<Group> groups;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected EList<Index> index;

  /**
   * The cached value of the '{@link #getCreateRules() <em>Create Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateRules()
   * @generated
   * @ordered
   */
  protected EList<CreateRule> createRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return LangPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isComponentAlias()
  {
    return componentAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentAlias(boolean newComponentAlias)
  {
    boolean oldComponentAlias = componentAlias;
    componentAlias = newComponentAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.SYSTEM__COMPONENT_ALIAS, oldComponentAlias, componentAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(boolean newInit)
  {
    boolean oldInit = init;
    init = newInit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.SYSTEM__INIT, oldInit, init));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCleanup()
  {
    return cleanup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCleanup(boolean newCleanup)
  {
    boolean oldCleanup = cleanup;
    cleanup = newCleanup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.SYSTEM__CLEANUP, oldCleanup, cleanup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTeardown()
  {
    return teardown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeardown(boolean newTeardown)
  {
    boolean oldTeardown = teardown;
    teardown = newTeardown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.SYSTEM__TEARDOWN, oldTeardown, teardown));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(Input newInput, NotificationChain msgs)
  {
    Input oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.SYSTEM__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(Input newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.SYSTEM__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.SYSTEM__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.SYSTEM__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UniqueComponentAccess> getUniqueComp()
  {
    if (uniqueComp == null)
    {
      uniqueComp = new EObjectContainmentEList<UniqueComponentAccess>(UniqueComponentAccess.class, this, LangPackage.SYSTEM__UNIQUE_COMP);
    }
    return uniqueComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Group> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<Group>(Group.class, this, LangPackage.SYSTEM__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Index> getIndex()
  {
    if (index == null)
    {
      index = new EObjectContainmentEList<Index>(Index.class, this, LangPackage.SYSTEM__INDEX);
    }
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CreateRule> getCreateRules()
  {
    if (createRules == null)
    {
      createRules = new EObjectContainmentEList<CreateRule>(CreateRule.class, this, LangPackage.SYSTEM__CREATE_RULES);
    }
    return createRules;
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
      case LangPackage.SYSTEM__INPUT:
        return basicSetInput(null, msgs);
      case LangPackage.SYSTEM__UNIQUE_COMP:
        return ((InternalEList<?>)getUniqueComp()).basicRemove(otherEnd, msgs);
      case LangPackage.SYSTEM__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
      case LangPackage.SYSTEM__INDEX:
        return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
      case LangPackage.SYSTEM__CREATE_RULES:
        return ((InternalEList<?>)getCreateRules()).basicRemove(otherEnd, msgs);
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
      case LangPackage.SYSTEM__COMPONENT_ALIAS:
        return isComponentAlias();
      case LangPackage.SYSTEM__INIT:
        return isInit();
      case LangPackage.SYSTEM__CLEANUP:
        return isCleanup();
      case LangPackage.SYSTEM__TEARDOWN:
        return isTeardown();
      case LangPackage.SYSTEM__INPUT:
        return getInput();
      case LangPackage.SYSTEM__UNIQUE_COMP:
        return getUniqueComp();
      case LangPackage.SYSTEM__GROUPS:
        return getGroups();
      case LangPackage.SYSTEM__INDEX:
        return getIndex();
      case LangPackage.SYSTEM__CREATE_RULES:
        return getCreateRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LangPackage.SYSTEM__COMPONENT_ALIAS:
        setComponentAlias((Boolean)newValue);
        return;
      case LangPackage.SYSTEM__INIT:
        setInit((Boolean)newValue);
        return;
      case LangPackage.SYSTEM__CLEANUP:
        setCleanup((Boolean)newValue);
        return;
      case LangPackage.SYSTEM__TEARDOWN:
        setTeardown((Boolean)newValue);
        return;
      case LangPackage.SYSTEM__INPUT:
        setInput((Input)newValue);
        return;
      case LangPackage.SYSTEM__UNIQUE_COMP:
        getUniqueComp().clear();
        getUniqueComp().addAll((Collection<? extends UniqueComponentAccess>)newValue);
        return;
      case LangPackage.SYSTEM__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends Group>)newValue);
        return;
      case LangPackage.SYSTEM__INDEX:
        getIndex().clear();
        getIndex().addAll((Collection<? extends Index>)newValue);
        return;
      case LangPackage.SYSTEM__CREATE_RULES:
        getCreateRules().clear();
        getCreateRules().addAll((Collection<? extends CreateRule>)newValue);
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
      case LangPackage.SYSTEM__COMPONENT_ALIAS:
        setComponentAlias(COMPONENT_ALIAS_EDEFAULT);
        return;
      case LangPackage.SYSTEM__INIT:
        setInit(INIT_EDEFAULT);
        return;
      case LangPackage.SYSTEM__CLEANUP:
        setCleanup(CLEANUP_EDEFAULT);
        return;
      case LangPackage.SYSTEM__TEARDOWN:
        setTeardown(TEARDOWN_EDEFAULT);
        return;
      case LangPackage.SYSTEM__INPUT:
        setInput((Input)null);
        return;
      case LangPackage.SYSTEM__UNIQUE_COMP:
        getUniqueComp().clear();
        return;
      case LangPackage.SYSTEM__GROUPS:
        getGroups().clear();
        return;
      case LangPackage.SYSTEM__INDEX:
        getIndex().clear();
        return;
      case LangPackage.SYSTEM__CREATE_RULES:
        getCreateRules().clear();
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
      case LangPackage.SYSTEM__COMPONENT_ALIAS:
        return componentAlias != COMPONENT_ALIAS_EDEFAULT;
      case LangPackage.SYSTEM__INIT:
        return init != INIT_EDEFAULT;
      case LangPackage.SYSTEM__CLEANUP:
        return cleanup != CLEANUP_EDEFAULT;
      case LangPackage.SYSTEM__TEARDOWN:
        return teardown != TEARDOWN_EDEFAULT;
      case LangPackage.SYSTEM__INPUT:
        return input != null;
      case LangPackage.SYSTEM__UNIQUE_COMP:
        return uniqueComp != null && !uniqueComp.isEmpty();
      case LangPackage.SYSTEM__GROUPS:
        return groups != null && !groups.isEmpty();
      case LangPackage.SYSTEM__INDEX:
        return index != null && !index.isEmpty();
      case LangPackage.SYSTEM__CREATE_RULES:
        return createRules != null && !createRules.isEmpty();
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
    result.append(" (componentAlias: ");
    result.append(componentAlias);
    result.append(", init: ");
    result.append(init);
    result.append(", cleanup: ");
    result.append(cleanup);
    result.append(", teardown: ");
    result.append(teardown);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
