/**
 */
package net.certware.intent.intentSpecification.impl;

import java.util.Collection;

import net.certware.intent.intentSpecification.DocItem;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.ListItem;
import net.certware.intent.intentSpecification.ModelItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link net.certware.intent.intentSpecification.impl.ListItemImpl#getId <em>Id</em>}</li>
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

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
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.LIST_ITEM__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.LIST_ITEM__ID, oldId, id));
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IntentSpecificationPackage.LIST_ITEM__TYPE:
        return getType();
      case IntentSpecificationPackage.LIST_ITEM__ID:
        return getId();
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
        setType((String)newValue);
        return;
      case IntentSpecificationPackage.LIST_ITEM__ID:
        setId((String)newValue);
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
        setType(TYPE_EDEFAULT);
        return;
      case IntentSpecificationPackage.LIST_ITEM__ID:
        setId(ID_EDEFAULT);
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
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case IntentSpecificationPackage.LIST_ITEM__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", id: ");
    result.append(id);
    result.append(", desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //ListItemImpl
