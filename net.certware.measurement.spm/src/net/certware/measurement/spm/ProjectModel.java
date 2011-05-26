/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm;

import net.certware.measurement.smm.SmmModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.spm.ProjectModel#getCommits <em>Commits</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.spm.SpmPackage#getProjectModel()
 * @model
 * @generated
 */
public interface ProjectModel extends SmmModel {

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.spm.ProjectCommit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' containment reference list.
	 * @see net.certware.measurement.spm.SpmPackage#getProjectModel_Commits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectCommit> getCommits();

} // ProjectModel
