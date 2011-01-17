/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.AssignmentsType#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentsType()
 * @model extendedMetaData="name='Assignments_._type' kind='elementOnly'"
 * @generated
 */
public interface AssignmentsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.AssignmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There must be at least one assignment in each Assignments collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentsType_Assignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Assignment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssignmentType> getAssignment();

} // AssignmentsType
