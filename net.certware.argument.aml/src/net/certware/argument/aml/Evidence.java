/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.Evidence#getEvidenceExhibit <em>Evidence Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.Evidence#getRelevance <em>Relevance</em>}</li>
 *   <li>{@link net.certware.argument.aml.Evidence#getReliability <em>Reliability</em>}</li>
 *   <li>{@link net.certware.argument.aml.Evidence#getWitness <em>Witness</em>}</li>
 *   <li>{@link net.certware.argument.aml.Evidence#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.Evidence#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.Evidence#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.Evidence#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getEvidence()
 * @model extendedMetaData="name='evidence_._type' kind='elementOnly'"
 * @generated
 */
public interface Evidence extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Evidence Exhibit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence Exhibit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence Exhibit</em>' containment reference.
	 * @see #setEvidenceExhibit(EvidenceExhibit)
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_EvidenceExhibit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='evidenceExhibit' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceExhibit getEvidenceExhibit();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Evidence#getEvidenceExhibit <em>Evidence Exhibit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Exhibit</em>' containment reference.
	 * @see #getEvidenceExhibit()
	 * @generated
	 */
	void setEvidenceExhibit(EvidenceExhibit value);

	/**
	 * Returns the value of the '<em><b>Relevance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevance</em>' containment reference.
	 * @see #setRelevance(Relevance)
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_Relevance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relevance' namespace='##targetNamespace'"
	 * @generated
	 */
	Relevance getRelevance();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Evidence#getRelevance <em>Relevance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance</em>' containment reference.
	 * @see #getRelevance()
	 * @generated
	 */
	void setRelevance(Relevance value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' containment reference.
	 * @see #setReliability(Reliability)
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_Reliability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reliability' namespace='##targetNamespace'"
	 * @generated
	 */
	Reliability getReliability();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Evidence#getReliability <em>Reliability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' containment reference.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(Reliability value);

	/**
	 * Returns the value of the '<em><b>Witness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Witness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Witness</em>' containment reference.
	 * @see #setWitness(Witness)
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_Witness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='witness' namespace='##targetNamespace'"
	 * @generated
	 */
	Witness getWitness();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Evidence#getWitness <em>Witness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Witness</em>' containment reference.
	 * @see #getWitness()
	 * @generated
	 */
	void setWitness(Witness value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;A note attached to an object. One example of an annotation is a memo. Alternatively you could just have free text&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Evidence#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Evidence#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #setOrdinal(String)
	 * @see net.certware.argument.aml.AmlPackage#getEvidence_Ordinal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ordinal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrdinal();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Evidence#getOrdinal <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal</em>' attribute.
	 * @see #getOrdinal()
	 * @generated
	 */
	void setOrdinal(String value);

} // Evidence
