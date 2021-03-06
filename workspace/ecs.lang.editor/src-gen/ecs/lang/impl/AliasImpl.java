/**
 * generated by Xtext 2.10.0
 */
package ecs.lang.impl;

import ecs.lang.Alias;
import ecs.lang.AliasList;
import ecs.lang.LangPackage;
import ecs.lang.SingleAlias;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecs.lang.impl.AliasImpl#getListOfAliases <em>List Of Aliases</em>}</li>
 *   <li>{@link ecs.lang.impl.AliasImpl#getSingleAlias <em>Single Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliasImpl extends AComponentImpl implements Alias
{
  /**
   * The cached value of the '{@link #getListOfAliases() <em>List Of Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListOfAliases()
   * @generated
   * @ordered
   */
  protected AliasList listOfAliases;

  /**
   * The cached value of the '{@link #getSingleAlias() <em>Single Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleAlias()
   * @generated
   * @ordered
   */
  protected SingleAlias singleAlias;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasImpl()
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
    return LangPackage.Literals.ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasList getListOfAliases()
  {
    return listOfAliases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListOfAliases(AliasList newListOfAliases, NotificationChain msgs)
  {
    AliasList oldListOfAliases = listOfAliases;
    listOfAliases = newListOfAliases;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.ALIAS__LIST_OF_ALIASES, oldListOfAliases, newListOfAliases);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListOfAliases(AliasList newListOfAliases)
  {
    if (newListOfAliases != listOfAliases)
    {
      NotificationChain msgs = null;
      if (listOfAliases != null)
        msgs = ((InternalEObject)listOfAliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.ALIAS__LIST_OF_ALIASES, null, msgs);
      if (newListOfAliases != null)
        msgs = ((InternalEObject)newListOfAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.ALIAS__LIST_OF_ALIASES, null, msgs);
      msgs = basicSetListOfAliases(newListOfAliases, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.ALIAS__LIST_OF_ALIASES, newListOfAliases, newListOfAliases));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleAlias getSingleAlias()
  {
    return singleAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleAlias(SingleAlias newSingleAlias, NotificationChain msgs)
  {
    SingleAlias oldSingleAlias = singleAlias;
    singleAlias = newSingleAlias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.ALIAS__SINGLE_ALIAS, oldSingleAlias, newSingleAlias);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleAlias(SingleAlias newSingleAlias)
  {
    if (newSingleAlias != singleAlias)
    {
      NotificationChain msgs = null;
      if (singleAlias != null)
        msgs = ((InternalEObject)singleAlias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.ALIAS__SINGLE_ALIAS, null, msgs);
      if (newSingleAlias != null)
        msgs = ((InternalEObject)newSingleAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.ALIAS__SINGLE_ALIAS, null, msgs);
      msgs = basicSetSingleAlias(newSingleAlias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.ALIAS__SINGLE_ALIAS, newSingleAlias, newSingleAlias));
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
      case LangPackage.ALIAS__LIST_OF_ALIASES:
        return basicSetListOfAliases(null, msgs);
      case LangPackage.ALIAS__SINGLE_ALIAS:
        return basicSetSingleAlias(null, msgs);
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
      case LangPackage.ALIAS__LIST_OF_ALIASES:
        return getListOfAliases();
      case LangPackage.ALIAS__SINGLE_ALIAS:
        return getSingleAlias();
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
      case LangPackage.ALIAS__LIST_OF_ALIASES:
        setListOfAliases((AliasList)newValue);
        return;
      case LangPackage.ALIAS__SINGLE_ALIAS:
        setSingleAlias((SingleAlias)newValue);
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
      case LangPackage.ALIAS__LIST_OF_ALIASES:
        setListOfAliases((AliasList)null);
        return;
      case LangPackage.ALIAS__SINGLE_ALIAS:
        setSingleAlias((SingleAlias)null);
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
      case LangPackage.ALIAS__LIST_OF_ALIASES:
        return listOfAliases != null;
      case LangPackage.ALIAS__SINGLE_ALIAS:
        return singleAlias != null;
    }
    return super.eIsSet(featureID);
  }

} //AliasImpl
