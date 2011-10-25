/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.CommitHistory#getCommitRecord <em>Commit Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.sco.ScoPackage#getCommitHistory()
 * @model
 * @generated
 */
public interface CommitHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Commit Record</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.sco.ArtifactCommit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commit Record</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Record</em>' containment reference list.
	 * @see net.certware.measurement.sco.ScoPackage#getCommitHistory_CommitRecord()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactCommit> getCommitRecord();

} // CommitHistory
