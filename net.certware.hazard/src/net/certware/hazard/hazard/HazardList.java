/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.HazardList#getHazards <em>Hazards</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.hazard.HazardPackage#getHazardList()
 * @model
 * @generated
 */
public interface HazardList extends EObject {
	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.hazard.hazard.Hazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' containment reference list.
	 * @see net.certware.hazard.hazard.HazardPackage#getHazardList_Hazards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Hazard> getHazards();

} // HazardList
