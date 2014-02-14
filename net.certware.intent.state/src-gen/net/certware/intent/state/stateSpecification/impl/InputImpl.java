/**
 */
package net.certware.intent.state.stateSpecification.impl;

import net.certware.intent.state.stateSpecification.BigUnitValue;
import net.certware.intent.state.stateSpecification.Input;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.TriggerTable;
import net.certware.intent.state.stateSpecification.ValueList;
import net.certware.intent.state.stateSpecification.ValueRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getRange <em>Range</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getValueHandling <em>Value Handling</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getArrivalRateAvg <em>Arrival Rate Avg</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getArrivalRateMinimum <em>Arrival Rate Minimum</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getArrivalRateMaximum <em>Arrival Rate Maximum</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getObsolescence <em>Obsolescence</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getAppearsIn <em>Appears In</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected ValueRange range;

  /**
   * The cached value of the '{@link #getValueList() <em>Value List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueList()
   * @generated
   * @ordered
   */
  protected ValueList valueList;

  /**
   * The default value of the '{@link #getValueHandling() <em>Value Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueHandling()
   * @generated
   * @ordered
   */
  protected static final String VALUE_HANDLING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueHandling() <em>Value Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueHandling()
   * @generated
   * @ordered
   */
  protected String valueHandling = VALUE_HANDLING_EDEFAULT;

  /**
   * The cached value of the '{@link #getGranularity() <em>Granularity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGranularity()
   * @generated
   * @ordered
   */
  protected BigUnitValue granularity;

  /**
   * The cached value of the '{@link #getArrivalRateAvg() <em>Arrival Rate Avg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivalRateAvg()
   * @generated
   * @ordered
   */
  protected BigUnitValue arrivalRateAvg;

  /**
   * The cached value of the '{@link #getArrivalRateMinimum() <em>Arrival Rate Minimum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivalRateMinimum()
   * @generated
   * @ordered
   */
  protected BigUnitValue arrivalRateMinimum;

  /**
   * The cached value of the '{@link #getArrivalRateMaximum() <em>Arrival Rate Maximum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivalRateMaximum()
   * @generated
   * @ordered
   */
  protected BigUnitValue arrivalRateMaximum;

  /**
   * The cached value of the '{@link #getObsolescence() <em>Obsolescence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObsolescence()
   * @generated
   * @ordered
   */
  protected BigUnitValue obsolescence;

  /**
   * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected static final String REFERENCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected String references = REFERENCES_EDEFAULT;

  /**
   * The default value of the '{@link #getAppearsIn() <em>Appears In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppearsIn()
   * @generated
   * @ordered
   */
  protected static final String APPEARS_IN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppearsIn() <em>Appears In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppearsIn()
   * @generated
   * @ordered
   */
  protected String appearsIn = APPEARS_IN_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected static final String COMMENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected String comments = COMMENTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructure()
   * @generated
   * @ordered
   */
  protected TriggerTable structure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputImpl()
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
    return StateSpecificationPackage.Literals.INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueRange getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(ValueRange newRange, NotificationChain msgs)
  {
    ValueRange oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(ValueRange newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueList getValueList()
  {
    return valueList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueList(ValueList newValueList, NotificationChain msgs)
  {
    ValueList oldValueList = valueList;
    valueList = newValueList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__VALUE_LIST, oldValueList, newValueList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueList(ValueList newValueList)
  {
    if (newValueList != valueList)
    {
      NotificationChain msgs = null;
      if (valueList != null)
        msgs = ((InternalEObject)valueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__VALUE_LIST, null, msgs);
      if (newValueList != null)
        msgs = ((InternalEObject)newValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__VALUE_LIST, null, msgs);
      msgs = basicSetValueList(newValueList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__VALUE_LIST, newValueList, newValueList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueHandling()
  {
    return valueHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueHandling(String newValueHandling)
  {
    String oldValueHandling = valueHandling;
    valueHandling = newValueHandling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__VALUE_HANDLING, oldValueHandling, valueHandling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getGranularity()
  {
    return granularity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGranularity(BigUnitValue newGranularity, NotificationChain msgs)
  {
    BigUnitValue oldGranularity = granularity;
    granularity = newGranularity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__GRANULARITY, oldGranularity, newGranularity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGranularity(BigUnitValue newGranularity)
  {
    if (newGranularity != granularity)
    {
      NotificationChain msgs = null;
      if (granularity != null)
        msgs = ((InternalEObject)granularity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__GRANULARITY, null, msgs);
      if (newGranularity != null)
        msgs = ((InternalEObject)newGranularity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__GRANULARITY, null, msgs);
      msgs = basicSetGranularity(newGranularity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__GRANULARITY, newGranularity, newGranularity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getArrivalRateAvg()
  {
    return arrivalRateAvg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrivalRateAvg(BigUnitValue newArrivalRateAvg, NotificationChain msgs)
  {
    BigUnitValue oldArrivalRateAvg = arrivalRateAvg;
    arrivalRateAvg = newArrivalRateAvg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG, oldArrivalRateAvg, newArrivalRateAvg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrivalRateAvg(BigUnitValue newArrivalRateAvg)
  {
    if (newArrivalRateAvg != arrivalRateAvg)
    {
      NotificationChain msgs = null;
      if (arrivalRateAvg != null)
        msgs = ((InternalEObject)arrivalRateAvg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG, null, msgs);
      if (newArrivalRateAvg != null)
        msgs = ((InternalEObject)newArrivalRateAvg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG, null, msgs);
      msgs = basicSetArrivalRateAvg(newArrivalRateAvg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG, newArrivalRateAvg, newArrivalRateAvg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getArrivalRateMinimum()
  {
    return arrivalRateMinimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrivalRateMinimum(BigUnitValue newArrivalRateMinimum, NotificationChain msgs)
  {
    BigUnitValue oldArrivalRateMinimum = arrivalRateMinimum;
    arrivalRateMinimum = newArrivalRateMinimum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM, oldArrivalRateMinimum, newArrivalRateMinimum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrivalRateMinimum(BigUnitValue newArrivalRateMinimum)
  {
    if (newArrivalRateMinimum != arrivalRateMinimum)
    {
      NotificationChain msgs = null;
      if (arrivalRateMinimum != null)
        msgs = ((InternalEObject)arrivalRateMinimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM, null, msgs);
      if (newArrivalRateMinimum != null)
        msgs = ((InternalEObject)newArrivalRateMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM, null, msgs);
      msgs = basicSetArrivalRateMinimum(newArrivalRateMinimum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM, newArrivalRateMinimum, newArrivalRateMinimum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getArrivalRateMaximum()
  {
    return arrivalRateMaximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrivalRateMaximum(BigUnitValue newArrivalRateMaximum, NotificationChain msgs)
  {
    BigUnitValue oldArrivalRateMaximum = arrivalRateMaximum;
    arrivalRateMaximum = newArrivalRateMaximum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM, oldArrivalRateMaximum, newArrivalRateMaximum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrivalRateMaximum(BigUnitValue newArrivalRateMaximum)
  {
    if (newArrivalRateMaximum != arrivalRateMaximum)
    {
      NotificationChain msgs = null;
      if (arrivalRateMaximum != null)
        msgs = ((InternalEObject)arrivalRateMaximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM, null, msgs);
      if (newArrivalRateMaximum != null)
        msgs = ((InternalEObject)newArrivalRateMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM, null, msgs);
      msgs = basicSetArrivalRateMaximum(newArrivalRateMaximum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM, newArrivalRateMaximum, newArrivalRateMaximum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getObsolescence()
  {
    return obsolescence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObsolescence(BigUnitValue newObsolescence, NotificationChain msgs)
  {
    BigUnitValue oldObsolescence = obsolescence;
    obsolescence = newObsolescence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__OBSOLESCENCE, oldObsolescence, newObsolescence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObsolescence(BigUnitValue newObsolescence)
  {
    if (newObsolescence != obsolescence)
    {
      NotificationChain msgs = null;
      if (obsolescence != null)
        msgs = ((InternalEObject)obsolescence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__OBSOLESCENCE, null, msgs);
      if (newObsolescence != null)
        msgs = ((InternalEObject)newObsolescence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__OBSOLESCENCE, null, msgs);
      msgs = basicSetObsolescence(newObsolescence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__OBSOLESCENCE, newObsolescence, newObsolescence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferences()
  {
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferences(String newReferences)
  {
    String oldReferences = references;
    references = newReferences;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__REFERENCES, oldReferences, references));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppearsIn()
  {
    return appearsIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppearsIn(String newAppearsIn)
  {
    String oldAppearsIn = appearsIn;
    appearsIn = newAppearsIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__APPEARS_IN, oldAppearsIn, appearsIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComments()
  {
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComments(String newComments)
  {
    String oldComments = comments;
    comments = newComments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__COMMENTS, oldComments, comments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerTable getStructure()
  {
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructure(TriggerTable newStructure, NotificationChain msgs)
  {
    TriggerTable oldStructure = structure;
    structure = newStructure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__STRUCTURE, oldStructure, newStructure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructure(TriggerTable newStructure)
  {
    if (newStructure != structure)
    {
      NotificationChain msgs = null;
      if (structure != null)
        msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__STRUCTURE, null, msgs);
      if (newStructure != null)
        msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__STRUCTURE, null, msgs);
      msgs = basicSetStructure(newStructure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__STRUCTURE, newStructure, newStructure));
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
      case StateSpecificationPackage.INPUT__RANGE:
        return basicSetRange(null, msgs);
      case StateSpecificationPackage.INPUT__VALUE_LIST:
        return basicSetValueList(null, msgs);
      case StateSpecificationPackage.INPUT__GRANULARITY:
        return basicSetGranularity(null, msgs);
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG:
        return basicSetArrivalRateAvg(null, msgs);
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM:
        return basicSetArrivalRateMinimum(null, msgs);
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM:
        return basicSetArrivalRateMaximum(null, msgs);
      case StateSpecificationPackage.INPUT__OBSOLESCENCE:
        return basicSetObsolescence(null, msgs);
      case StateSpecificationPackage.INPUT__STRUCTURE:
        return basicSetStructure(null, msgs);
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
      case StateSpecificationPackage.INPUT__RANGE:
        return getRange();
      case StateSpecificationPackage.INPUT__VALUE_LIST:
        return getValueList();
      case StateSpecificationPackage.INPUT__VALUE_HANDLING:
        return getValueHandling();
      case StateSpecificationPackage.INPUT__GRANULARITY:
        return getGranularity();
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG:
        return getArrivalRateAvg();
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM:
        return getArrivalRateMinimum();
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM:
        return getArrivalRateMaximum();
      case StateSpecificationPackage.INPUT__OBSOLESCENCE:
        return getObsolescence();
      case StateSpecificationPackage.INPUT__REFERENCES:
        return getReferences();
      case StateSpecificationPackage.INPUT__APPEARS_IN:
        return getAppearsIn();
      case StateSpecificationPackage.INPUT__DESCRIPTION:
        return getDescription();
      case StateSpecificationPackage.INPUT__COMMENTS:
        return getComments();
      case StateSpecificationPackage.INPUT__STRUCTURE:
        return getStructure();
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
      case StateSpecificationPackage.INPUT__RANGE:
        setRange((ValueRange)newValue);
        return;
      case StateSpecificationPackage.INPUT__VALUE_LIST:
        setValueList((ValueList)newValue);
        return;
      case StateSpecificationPackage.INPUT__VALUE_HANDLING:
        setValueHandling((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__GRANULARITY:
        setGranularity((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG:
        setArrivalRateAvg((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM:
        setArrivalRateMinimum((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM:
        setArrivalRateMaximum((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.INPUT__OBSOLESCENCE:
        setObsolescence((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.INPUT__REFERENCES:
        setReferences((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__APPEARS_IN:
        setAppearsIn((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__COMMENTS:
        setComments((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__STRUCTURE:
        setStructure((TriggerTable)newValue);
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
      case StateSpecificationPackage.INPUT__RANGE:
        setRange((ValueRange)null);
        return;
      case StateSpecificationPackage.INPUT__VALUE_LIST:
        setValueList((ValueList)null);
        return;
      case StateSpecificationPackage.INPUT__VALUE_HANDLING:
        setValueHandling(VALUE_HANDLING_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__GRANULARITY:
        setGranularity((BigUnitValue)null);
        return;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG:
        setArrivalRateAvg((BigUnitValue)null);
        return;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM:
        setArrivalRateMinimum((BigUnitValue)null);
        return;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM:
        setArrivalRateMaximum((BigUnitValue)null);
        return;
      case StateSpecificationPackage.INPUT__OBSOLESCENCE:
        setObsolescence((BigUnitValue)null);
        return;
      case StateSpecificationPackage.INPUT__REFERENCES:
        setReferences(REFERENCES_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__APPEARS_IN:
        setAppearsIn(APPEARS_IN_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__COMMENTS:
        setComments(COMMENTS_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__STRUCTURE:
        setStructure((TriggerTable)null);
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
      case StateSpecificationPackage.INPUT__RANGE:
        return range != null;
      case StateSpecificationPackage.INPUT__VALUE_LIST:
        return valueList != null;
      case StateSpecificationPackage.INPUT__VALUE_HANDLING:
        return VALUE_HANDLING_EDEFAULT == null ? valueHandling != null : !VALUE_HANDLING_EDEFAULT.equals(valueHandling);
      case StateSpecificationPackage.INPUT__GRANULARITY:
        return granularity != null;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_AVG:
        return arrivalRateAvg != null;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MINIMUM:
        return arrivalRateMinimum != null;
      case StateSpecificationPackage.INPUT__ARRIVAL_RATE_MAXIMUM:
        return arrivalRateMaximum != null;
      case StateSpecificationPackage.INPUT__OBSOLESCENCE:
        return obsolescence != null;
      case StateSpecificationPackage.INPUT__REFERENCES:
        return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
      case StateSpecificationPackage.INPUT__APPEARS_IN:
        return APPEARS_IN_EDEFAULT == null ? appearsIn != null : !APPEARS_IN_EDEFAULT.equals(appearsIn);
      case StateSpecificationPackage.INPUT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateSpecificationPackage.INPUT__COMMENTS:
        return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
      case StateSpecificationPackage.INPUT__STRUCTURE:
        return structure != null;
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
    result.append(" (valueHandling: ");
    result.append(valueHandling);
    result.append(", references: ");
    result.append(references);
    result.append(", appearsIn: ");
    result.append(appearsIn);
    result.append(", description: ");
    result.append(description);
    result.append(", comments: ");
    result.append(comments);
    result.append(')');
    return result.toString();
  }

} //InputImpl
