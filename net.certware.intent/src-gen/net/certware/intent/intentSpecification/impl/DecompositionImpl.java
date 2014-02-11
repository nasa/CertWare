/**
 */
package net.certware.intent.intentSpecification.impl;

import java.util.Collection;

import net.certware.intent.intentSpecification.Decomposition;
import net.certware.intent.intentSpecification.Document;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.ListItem;
import net.certware.intent.intentSpecification.ModelItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.impl.DecompositionImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.DecompositionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.DecompositionImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.DecompositionImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.DecompositionImpl#getModels <em>Models</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.DecompositionImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecompositionImpl extends MinimalEObjectImpl.Container implements Decomposition
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
   * The cached value of the '{@link #getDocuments() <em>Documents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocuments()
   * @generated
   * @ordered
   */
  protected EList<Document> documents;

  /**
   * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModels()
   * @generated
   * @ordered
   */
  protected EList<ModelItem> models;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<ListItem> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecompositionImpl()
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
    return IntentSpecificationPackage.Literals.DECOMPOSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.DECOMPOSITION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.DECOMPOSITION__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.DECOMPOSITION__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Document> getDocuments()
  {
    if (documents == null)
    {
      documents = new EObjectContainmentEList<Document>(Document.class, this, IntentSpecificationPackage.DECOMPOSITION__DOCUMENTS);
    }
    return documents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelItem> getModels()
  {
    if (models == null)
    {
      models = new EObjectContainmentEList<ModelItem>(ModelItem.class, this, IntentSpecificationPackage.DECOMPOSITION__MODELS);
    }
    return models;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ListItem> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<ListItem>(ListItem.class, this, IntentSpecificationPackage.DECOMPOSITION__ITEMS);
    }
    return items;
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
      case IntentSpecificationPackage.DECOMPOSITION__DOCUMENTS:
        return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
      case IntentSpecificationPackage.DECOMPOSITION__MODELS:
        return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
      case IntentSpecificationPackage.DECOMPOSITION__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case IntentSpecificationPackage.DECOMPOSITION__TYPE:
        return getType();
      case IntentSpecificationPackage.DECOMPOSITION__ID:
        return getId();
      case IntentSpecificationPackage.DECOMPOSITION__DESC:
        return getDesc();
      case IntentSpecificationPackage.DECOMPOSITION__DOCUMENTS:
        return getDocuments();
      case IntentSpecificationPackage.DECOMPOSITION__MODELS:
        return getModels();
      case IntentSpecificationPackage.DECOMPOSITION__ITEMS:
        return getItems();
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
      case IntentSpecificationPackage.DECOMPOSITION__TYPE:
        setType((String)newValue);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__ID:
        setId((String)newValue);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__DESC:
        setDesc((String)newValue);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__DOCUMENTS:
        getDocuments().clear();
        getDocuments().addAll((Collection<? extends Document>)newValue);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__MODELS:
        getModels().clear();
        getModels().addAll((Collection<? extends ModelItem>)newValue);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends ListItem>)newValue);
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
      case IntentSpecificationPackage.DECOMPOSITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__ID:
        setId(ID_EDEFAULT);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__DOCUMENTS:
        getDocuments().clear();
        return;
      case IntentSpecificationPackage.DECOMPOSITION__MODELS:
        getModels().clear();
        return;
      case IntentSpecificationPackage.DECOMPOSITION__ITEMS:
        getItems().clear();
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
      case IntentSpecificationPackage.DECOMPOSITION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case IntentSpecificationPackage.DECOMPOSITION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case IntentSpecificationPackage.DECOMPOSITION__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case IntentSpecificationPackage.DECOMPOSITION__DOCUMENTS:
        return documents != null && !documents.isEmpty();
      case IntentSpecificationPackage.DECOMPOSITION__MODELS:
        return models != null && !models.isEmpty();
      case IntentSpecificationPackage.DECOMPOSITION__ITEMS:
        return items != null && !items.isEmpty();
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

} //DecompositionImpl
