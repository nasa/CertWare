/**
 */
package net.certware.intent.intentSpecification.impl;

import java.util.Collection;

import net.certware.intent.intentSpecification.DocItem;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.ListItem;
import net.certware.intent.intentSpecification.ListItemType;
import net.certware.intent.intentSpecification.ModelItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.impl.ListItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.ListItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.ListItemImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.ListItemImpl#getDocReferences <em>Doc References</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.ListItemImpl#getItemReferences <em>Item References</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.ListItemImpl#getModelReferences <em>Model References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListItemImpl extends MinimalEObjectImpl.Container implements ListItem
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ListItemType type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The cached value of the '{@link #getDocReferences() <em>Doc References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReferences()
   * @generated
   * @ordered
   */
  protected EList<DocItem> docReferences;

  /**
   * The cached value of the '{@link #getItemReferences() <em>Item References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemReferences()
   * @generated
   * @ordered
   */
  protected EList<ListItem> itemReferences;

  /**
   * The cached value of the '{@link #getModelReferences() <em>Model References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelReferences()
   * @generated
   * @ordered
   */
  protected EList<ModelItem> modelReferences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListItemImpl()
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
    return IntentSpecificationPackage.Literals.LIST_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItemType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ListItemType newType, NotificationChain msgs)
  {
    ListItemType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.LIST_ITEM__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ListItemType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntentSpecificationPackage.LIST_ITEM__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntentSpecificationPackage.LIST_ITEM__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.LIST_ITEM__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.LIST_ITEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.LIST_ITEM__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DocItem> getDocReferences()
  {
    if (docReferences == null)
    {
      docReferences = new EObjectResolvingEList<DocItem>(DocItem.class, this, IntentSpecificationPackage.LIST_ITEM__DOC_REFERENCES);
    }
    return docReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ListItem> getItemReferences()
  {
    if (itemReferences == null)
    {
      itemReferences = new EObjectResolvingEList<ListItem>(ListItem.class, this, IntentSpecificationPackage.LIST_ITEM__ITEM_REFERENCES);
    }
    return itemReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelItem> getModelReferences()
  {
    if (modelReferences == null)
    {
      modelReferences = new EObjectResolvingEList<ModelItem>(ModelItem.class, this, IntentSpecificationPackage.LIST_ITEM__MODEL_REFERENCES);
    }
    return modelReferences;
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
      case IntentSpecificationPackage.LIST_ITEM__TYPE:
        return basicSetType(null, msgs);
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
      case IntentSpecificationPackage.LIST_ITEM__TYPE:
        return getType();
      case IntentSpecificationPackage.LIST_ITEM__NAME:
        return getName();
      case IntentSpecificationPackage.LIST_ITEM__DESC:
        return getDesc();
      case IntentSpecificationPackage.LIST_ITEM__DOC_REFERENCES:
        return getDocReferences();
      case IntentSpecificationPackage.LIST_ITEM__ITEM_REFERENCES:
        return getItemReferences();
      case IntentSpecificationPackage.LIST_ITEM__MODEL_REFERENCES:
        return getModelReferences();
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
      case IntentSpecificationPackage.LIST_ITEM__TYPE:
        setType((ListItemType)newValue);
        return;
      case IntentSpecificationPackage.LIST_ITEM__NAME:
        setName((String)newValue);
        return;
      case IntentSpecificationPackage.LIST_ITEM__DESC:
        setDesc((String)newValue);
        return;
      case IntentSpecificationPackage.LIST_ITEM__DOC_REFERENCES:
        getDocReferences().clear();
        getDocReferences().addAll((Collection<? extends DocItem>)newValue);
        return;
      case IntentSpecificationPackage.LIST_ITEM__ITEM_REFERENCES:
        getItemReferences().clear();
        getItemReferences().addAll((Collection<? extends ListItem>)newValue);
        return;
      case IntentSpecificationPackage.LIST_ITEM__MODEL_REFERENCES:
        getModelReferences().clear();
        getModelReferences().addAll((Collection<? extends ModelItem>)newValue);
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
      case IntentSpecificationPackage.LIST_ITEM__TYPE:
        setType((ListItemType)null);
        return;
      case IntentSpecificationPackage.LIST_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IntentSpecificationPackage.LIST_ITEM__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case IntentSpecificationPackage.LIST_ITEM__DOC_REFERENCES:
        getDocReferences().clear();
        return;
      case IntentSpecificationPackage.LIST_ITEM__ITEM_REFERENCES:
        getItemReferences().clear();
        return;
      case IntentSpecificationPackage.LIST_ITEM__MODEL_REFERENCES:
        getModelReferences().clear();
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
      case IntentSpecificationPackage.LIST_ITEM__TYPE:
        return type != null;
      case IntentSpecificationPackage.LIST_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IntentSpecificationPackage.LIST_ITEM__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case IntentSpecificationPackage.LIST_ITEM__DOC_REFERENCES:
        return docReferences != null && !docReferences.isEmpty();
      case IntentSpecificationPackage.LIST_ITEM__ITEM_REFERENCES:
        return itemReferences != null && !itemReferences.isEmpty();
      case IntentSpecificationPackage.LIST_ITEM__MODEL_REFERENCES:
        return modelReferences != null && !modelReferences.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //ListItemImpl
