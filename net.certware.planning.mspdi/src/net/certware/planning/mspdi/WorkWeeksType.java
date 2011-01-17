/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Weeks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WorkWeeksType#getWorkWeek <em>Work Week</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWorkWeeksType()
 * @model extendedMetaData="name='WorkWeeks_._type' kind='elementOnly'"
 * @generated
 */
public interface WorkWeeksType extends EObject {
	/**
	 * Returns the value of the '<em><b>Work Week</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.WorkWeekType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines an effective work week.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Week</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getWorkWeeksType_WorkWeek()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WorkWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WorkWeekType> getWorkWeek();

} // WorkWeeksType
