/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import net.certware.argument.aml.AggregationRule;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Choice;
import net.certware.argument.aml.DiscoveryMethod;
import net.certware.argument.aml.Question;
import net.certware.argument.aml.QuestionRelationships;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getQuestionRelationships <em>Question Relationships</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getAggregationRule <em>Aggregation Rule</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getAmplification <em>Amplification</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.QuestionImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends EObjectImpl implements Question {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAmplification() <em>Amplification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplification()
	 * @generated
	 * @ordered
	 */
	protected static final String AMPLIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmplification() <em>Amplification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplification()
	 * @generated
	 * @ordered
	 */
	protected String amplification = AMPLIFICATION_EDEFAULT;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AmlPackage.QUESTION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getType() {
		return getGroup().list(AmlPackage.Literals.QUESTION__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoice() {
		return getGroup().list(AmlPackage.Literals.QUESTION__CHOICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionRelationships> getQuestionRelationships() {
		return getGroup().list(AmlPackage.Literals.QUESTION__QUESTION_RELATIONSHIPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregationRule> getAggregationRule() {
		return getGroup().list(AmlPackage.Literals.QUESTION__AGGREGATION_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscoveryMethod> getDiscoveryMethod() {
		return getGroup().list(AmlPackage.Literals.QUESTION__DISCOVERY_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		return getGroup().list(AmlPackage.Literals.QUESTION__ANNOTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmplification() {
		return amplification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmplification(String newAmplification) {
		String oldAmplification = amplification;
		amplification = newAmplification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.QUESTION__AMPLIFICATION, oldAmplification, amplification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.QUESTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.QUESTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.QUESTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.QUESTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AmlPackage.QUESTION__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case AmlPackage.QUESTION__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case AmlPackage.QUESTION__QUESTION_RELATIONSHIPS:
				return ((InternalEList<?>)getQuestionRelationships()).basicRemove(otherEnd, msgs);
			case AmlPackage.QUESTION__AGGREGATION_RULE:
				return ((InternalEList<?>)getAggregationRule()).basicRemove(otherEnd, msgs);
			case AmlPackage.QUESTION__DISCOVERY_METHOD:
				return ((InternalEList<?>)getDiscoveryMethod()).basicRemove(otherEnd, msgs);
			case AmlPackage.QUESTION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.QUESTION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AmlPackage.QUESTION__TYPE:
				return getType();
			case AmlPackage.QUESTION__CHOICE:
				return getChoice();
			case AmlPackage.QUESTION__QUESTION_RELATIONSHIPS:
				return getQuestionRelationships();
			case AmlPackage.QUESTION__AGGREGATION_RULE:
				return getAggregationRule();
			case AmlPackage.QUESTION__DISCOVERY_METHOD:
				return getDiscoveryMethod();
			case AmlPackage.QUESTION__ANNOTATION:
				return getAnnotation();
			case AmlPackage.QUESTION__AMPLIFICATION:
				return getAmplification();
			case AmlPackage.QUESTION__DESCRIPTION:
				return getDescription();
			case AmlPackage.QUESTION__ID:
				return getId();
			case AmlPackage.QUESTION__LABEL:
				return getLabel();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmlPackage.QUESTION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AmlPackage.QUESTION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.QUESTION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends Choice>)newValue);
				return;
			case AmlPackage.QUESTION__QUESTION_RELATIONSHIPS:
				getQuestionRelationships().clear();
				getQuestionRelationships().addAll((Collection<? extends QuestionRelationships>)newValue);
				return;
			case AmlPackage.QUESTION__AGGREGATION_RULE:
				getAggregationRule().clear();
				getAggregationRule().addAll((Collection<? extends AggregationRule>)newValue);
				return;
			case AmlPackage.QUESTION__DISCOVERY_METHOD:
				getDiscoveryMethod().clear();
				getDiscoveryMethod().addAll((Collection<? extends DiscoveryMethod>)newValue);
				return;
			case AmlPackage.QUESTION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AmlPackage.QUESTION__AMPLIFICATION:
				setAmplification((String)newValue);
				return;
			case AmlPackage.QUESTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmlPackage.QUESTION__ID:
				setId((String)newValue);
				return;
			case AmlPackage.QUESTION__LABEL:
				setLabel((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmlPackage.QUESTION__GROUP:
				getGroup().clear();
				return;
			case AmlPackage.QUESTION__TYPE:
				getType().clear();
				return;
			case AmlPackage.QUESTION__CHOICE:
				getChoice().clear();
				return;
			case AmlPackage.QUESTION__QUESTION_RELATIONSHIPS:
				getQuestionRelationships().clear();
				return;
			case AmlPackage.QUESTION__AGGREGATION_RULE:
				getAggregationRule().clear();
				return;
			case AmlPackage.QUESTION__DISCOVERY_METHOD:
				getDiscoveryMethod().clear();
				return;
			case AmlPackage.QUESTION__ANNOTATION:
				getAnnotation().clear();
				return;
			case AmlPackage.QUESTION__AMPLIFICATION:
				setAmplification(AMPLIFICATION_EDEFAULT);
				return;
			case AmlPackage.QUESTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmlPackage.QUESTION__ID:
				setId(ID_EDEFAULT);
				return;
			case AmlPackage.QUESTION__LABEL:
				setLabel(LABEL_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmlPackage.QUESTION__GROUP:
				return group != null && !group.isEmpty();
			case AmlPackage.QUESTION__TYPE:
				return !getType().isEmpty();
			case AmlPackage.QUESTION__CHOICE:
				return !getChoice().isEmpty();
			case AmlPackage.QUESTION__QUESTION_RELATIONSHIPS:
				return !getQuestionRelationships().isEmpty();
			case AmlPackage.QUESTION__AGGREGATION_RULE:
				return !getAggregationRule().isEmpty();
			case AmlPackage.QUESTION__DISCOVERY_METHOD:
				return !getDiscoveryMethod().isEmpty();
			case AmlPackage.QUESTION__ANNOTATION:
				return !getAnnotation().isEmpty();
			case AmlPackage.QUESTION__AMPLIFICATION:
				return AMPLIFICATION_EDEFAULT == null ? amplification != null : !AMPLIFICATION_EDEFAULT.equals(amplification);
			case AmlPackage.QUESTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AmlPackage.QUESTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AmlPackage.QUESTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", amplification: "); //$NON-NLS-1$
		result.append(amplification);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", label: "); //$NON-NLS-1$
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
