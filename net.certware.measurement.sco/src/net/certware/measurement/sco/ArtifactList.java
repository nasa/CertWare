/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.ArtifactList#getArtifactIdentifiers <em>Artifact Identifiers</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactList#getCommitIdentifier <em>Commit Identifier</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactList#getUsageTime <em>Usage Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.sco.ScoPackage#getArtifactList()
 * @model
 * @generated
 */
public interface ArtifactList extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.sco.ArtifactIdentifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Identifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Identifiers</em>' containment reference list.
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactList_ArtifactIdentifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactIdentifier> getArtifactIdentifiers();

	/**
	 * Returns the value of the '<em><b>Commit Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commit Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Identifier</em>' attribute.
	 * @see #setCommitIdentifier(String)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactList_CommitIdentifier()
	 * @model
	 * @generated
	 */
	String getCommitIdentifier();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactList#getCommitIdentifier <em>Commit Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Identifier</em>' attribute.
	 * @see #getCommitIdentifier()
	 * @generated
	 */
	void setCommitIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Usage Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Time</em>' attribute.
	 * @see #setUsageTime(double)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactList_UsageTime()
	 * @model
	 * @generated
	 */
	double getUsageTime();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactList#getUsageTime <em>Usage Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Time</em>' attribute.
	 * @see #getUsageTime()
	 * @generated
	 */
	void setUsageTime(double value);

} // ArtifactList
