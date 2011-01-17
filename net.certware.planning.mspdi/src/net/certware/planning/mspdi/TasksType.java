/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tasks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.TasksType#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getTasksType()
 * @model extendedMetaData="name='Tasks_._type' kind='elementOnly'"
 * @generated
 */
public interface TasksType extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There must be at least one task in each Tasks collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getTasksType_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TaskType> getTask();

} // TasksType
