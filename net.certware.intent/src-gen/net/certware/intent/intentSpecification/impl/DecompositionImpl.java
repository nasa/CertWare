/**
 */
package net.certware.intent.intentSpecification.impl;

import java.util.Collection;

import net.certware.intent.intentSpecification.Decomposition;
import net.certware.intent.intentSpecification.DecompositionType;
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
 *   <li>{@link net.certware.intent.intentSpecification.impl.DecompositionImpl#getName <em>Name</em>}</li>
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DecompositionType type;

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
  public DecompositionType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DecompositionType newType, NotificationChain msgs)
  {
    DecompositionType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.DECOMPOSITION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DecompositionType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntentSpecificationPackage.DECOMPOSITION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntentSpecificationPackage.DECOMPOSITION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.DECOMPOSITION__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.DECOMPOSITION__NAME, oldName, name));
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
      case IntentSpecificationPackage.DECOMPOSITION__TYPE:
        return basicSetType(null, msgs);
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
      case IntentSpecificationPackage.DECOMPOSITION__NAME:
        return getName();
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
        setType((DecompositionType)newValue);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__NAME:
        setName((String)newValue);
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
        setType((DecompositionType)null);
        return;
      case IntentSpecificationPackage.DECOMPOSITION__NAME:
        setName(NAME_EDEFAULT);
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
        return type != null;
      case IntentSpecificationPackage.DECOMPOSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //DecompositionImpl
