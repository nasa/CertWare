/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The full project schema definition from the project level down, starting with data type definitions.
 * <!-- end-model-doc -->
 * @see net.certware.planning.mspdi.MspdiFactory
 * @model kind="package"
 * @generated
 */
public interface MspdiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mspdi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mspdi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MspdiPackage eINSTANCE = net.certware.planning.mspdi.impl.MspdiPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.AssignmentsTypeImpl <em>Assignments Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.AssignmentsTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAssignmentsType()
	 * @generated
	 */
	int ASSIGNMENTS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS_TYPE__ASSIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Assignments Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl <em>Assignment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.AssignmentTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAssignmentType()
	 * @generated
	 */
	int ASSIGNMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Task UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__TASK_UID = 1;

	/**
	 * The feature id for the '<em><b>Resource UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__RESOURCE_UID = 2;

	/**
	 * The feature id for the '<em><b>Percent Work Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE = 3;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_COST = 4;

	/**
	 * The feature id for the '<em><b>Actual Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_FINISH = 5;

	/**
	 * The feature id for the '<em><b>Actual Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST = 6;

	/**
	 * The feature id for the '<em><b>Actual Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK = 7;

	/**
	 * The feature id for the '<em><b>Actual Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_START = 8;

	/**
	 * The feature id for the '<em><b>Actual Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_WORK = 9;

	/**
	 * The feature id for the '<em><b>ACWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACWP = 10;

	/**
	 * The feature id for the '<em><b>Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__CONFIRMED = 11;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__COST = 12;

	/**
	 * The feature id for the '<em><b>Cost Rate Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__COST_RATE_TABLE = 13;

	/**
	 * The feature id for the '<em><b>Cost Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__COST_VARIANCE = 14;

	/**
	 * The feature id for the '<em><b>CV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__CV = 15;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__DELAY = 16;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__FINISH = 17;

	/**
	 * The feature id for the '<em><b>Finish Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__FINISH_VARIANCE = 18;

	/**
	 * The feature id for the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__HYPERLINK = 19;

	/**
	 * The feature id for the '<em><b>Hyperlink Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__HYPERLINK_ADDRESS = 20;

	/**
	 * The feature id for the '<em><b>Hyperlink Sub Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS = 21;

	/**
	 * The feature id for the '<em><b>Work Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__WORK_VARIANCE = 22;

	/**
	 * The feature id for the '<em><b>Has Fixed Rate Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS = 23;

	/**
	 * The feature id for the '<em><b>Fixed Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__FIXED_MATERIAL = 24;

	/**
	 * The feature id for the '<em><b>Leveling Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__LEVELING_DELAY = 25;

	/**
	 * The feature id for the '<em><b>Leveling Delay Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT = 26;

	/**
	 * The feature id for the '<em><b>Linked Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__LINKED_FIELDS = 27;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__MILESTONE = 28;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__NOTES = 29;

	/**
	 * The feature id for the '<em><b>Overallocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__OVERALLOCATED = 30;

	/**
	 * The feature id for the '<em><b>Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__OVERTIME_COST = 31;

	/**
	 * The feature id for the '<em><b>Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__OVERTIME_WORK = 32;

	/**
	 * The feature id for the '<em><b>Peak Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__PEAK_UNITS = 33;

	/**
	 * The feature id for the '<em><b>Regular Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__REGULAR_WORK = 34;

	/**
	 * The feature id for the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__REMAINING_COST = 35;

	/**
	 * The feature id for the '<em><b>Remaining Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST = 36;

	/**
	 * The feature id for the '<em><b>Remaining Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK = 37;

	/**
	 * The feature id for the '<em><b>Remaining Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__REMAINING_WORK = 38;

	/**
	 * The feature id for the '<em><b>Response Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__RESPONSE_PENDING = 39;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__START = 40;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__STOP = 41;

	/**
	 * The feature id for the '<em><b>Resume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__RESUME = 42;

	/**
	 * The feature id for the '<em><b>Start Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__START_VARIANCE = 43;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__SUMMARY = 44;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__SV = 45;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__UNITS = 46;

	/**
	 * The feature id for the '<em><b>Update Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__UPDATE_NEEDED = 47;

	/**
	 * The feature id for the '<em><b>VAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__VAC = 48;

	/**
	 * The feature id for the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__WORK = 49;

	/**
	 * The feature id for the '<em><b>Work Contour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__WORK_CONTOUR = 50;

	/**
	 * The feature id for the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__BCWS = 51;

	/**
	 * The feature id for the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__BCWP = 52;

	/**
	 * The feature id for the '<em><b>Booking Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__BOOKING_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Actual Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED = 54;

	/**
	 * The feature id for the '<em><b>Actual Overtime Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED = 55;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__CREATION_DATE = 56;

	/**
	 * The feature id for the '<em><b>Assn Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ASSN_OWNER = 57;

	/**
	 * The feature id for the '<em><b>Assn Owner Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__ASSN_OWNER_GUID = 58;

	/**
	 * The feature id for the '<em><b>Budget Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__BUDGET_COST = 59;

	/**
	 * The feature id for the '<em><b>Budget Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__BUDGET_WORK = 60;

	/**
	 * The feature id for the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE = 61;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__BASELINE = 62;

	/**
	 * The feature id for the '<em><b>F404000</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404000 = 63;

	/**
	 * The feature id for the '<em><b>F404001</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404001 = 64;

	/**
	 * The feature id for the '<em><b>F404002</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404002 = 65;

	/**
	 * The feature id for the '<em><b>F404003</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404003 = 66;

	/**
	 * The feature id for the '<em><b>F404004</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404004 = 67;

	/**
	 * The feature id for the '<em><b>F404005</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404005 = 68;

	/**
	 * The feature id for the '<em><b>F404006</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404006 = 69;

	/**
	 * The feature id for the '<em><b>F404007</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404007 = 70;

	/**
	 * The feature id for the '<em><b>F404008</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404008 = 71;

	/**
	 * The feature id for the '<em><b>F404009</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404009 = 72;

	/**
	 * The feature id for the '<em><b>F4040 0a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40400A = 73;

	/**
	 * The feature id for the '<em><b>F4040 0b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40400B = 74;

	/**
	 * The feature id for the '<em><b>F4040 0c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40400C = 75;

	/**
	 * The feature id for the '<em><b>F4040 0d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40400D = 76;

	/**
	 * The feature id for the '<em><b>F4040 0e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40400E = 77;

	/**
	 * The feature id for the '<em><b>F4040 0f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40400F = 78;

	/**
	 * The feature id for the '<em><b>F404010</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404010 = 79;

	/**
	 * The feature id for the '<em><b>F404011</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404011 = 80;

	/**
	 * The feature id for the '<em><b>F404012</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404012 = 81;

	/**
	 * The feature id for the '<em><b>F404013</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404013 = 82;

	/**
	 * The feature id for the '<em><b>F404014</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404014 = 83;

	/**
	 * The feature id for the '<em><b>F404015</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404015 = 84;

	/**
	 * The feature id for the '<em><b>F404016</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404016 = 85;

	/**
	 * The feature id for the '<em><b>F404017</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404017 = 86;

	/**
	 * The feature id for the '<em><b>F404018</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404018 = 87;

	/**
	 * The feature id for the '<em><b>F404019</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404019 = 88;

	/**
	 * The feature id for the '<em><b>F4040 1a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40401A = 89;

	/**
	 * The feature id for the '<em><b>F4040 1b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40401B = 90;

	/**
	 * The feature id for the '<em><b>F4040 1c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40401C = 91;

	/**
	 * The feature id for the '<em><b>F4040 1d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40401D = 92;

	/**
	 * The feature id for the '<em><b>F4040 1e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40401E = 93;

	/**
	 * The feature id for the '<em><b>F4040 1f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40401F = 94;

	/**
	 * The feature id for the '<em><b>F404020</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404020 = 95;

	/**
	 * The feature id for the '<em><b>F404021</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404021 = 96;

	/**
	 * The feature id for the '<em><b>F404022</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404022 = 97;

	/**
	 * The feature id for the '<em><b>F404023</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404023 = 98;

	/**
	 * The feature id for the '<em><b>F404024</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404024 = 99;

	/**
	 * The feature id for the '<em><b>F404025</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404025 = 100;

	/**
	 * The feature id for the '<em><b>F404026</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404026 = 101;

	/**
	 * The feature id for the '<em><b>F404027</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404027 = 102;

	/**
	 * The feature id for the '<em><b>F404028</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404028 = 103;

	/**
	 * The feature id for the '<em><b>F404029</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404029 = 104;

	/**
	 * The feature id for the '<em><b>F4040 2a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40402A = 105;

	/**
	 * The feature id for the '<em><b>F4040 2b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40402B = 106;

	/**
	 * The feature id for the '<em><b>F4040 2c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40402C = 107;

	/**
	 * The feature id for the '<em><b>F4040 2d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40402D = 108;

	/**
	 * The feature id for the '<em><b>F4040 2e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40402E = 109;

	/**
	 * The feature id for the '<em><b>F4040 2f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40402F = 110;

	/**
	 * The feature id for the '<em><b>F404030</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404030 = 111;

	/**
	 * The feature id for the '<em><b>F404031</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404031 = 112;

	/**
	 * The feature id for the '<em><b>F404032</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404032 = 113;

	/**
	 * The feature id for the '<em><b>F404033</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404033 = 114;

	/**
	 * The feature id for the '<em><b>F404034</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404034 = 115;

	/**
	 * The feature id for the '<em><b>F404035</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404035 = 116;

	/**
	 * The feature id for the '<em><b>F404036</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404036 = 117;

	/**
	 * The feature id for the '<em><b>F404037</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404037 = 118;

	/**
	 * The feature id for the '<em><b>F404038</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404038 = 119;

	/**
	 * The feature id for the '<em><b>F404039</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404039 = 120;

	/**
	 * The feature id for the '<em><b>F4040 3a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40403A = 121;

	/**
	 * The feature id for the '<em><b>F4040 3b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40403B = 122;

	/**
	 * The feature id for the '<em><b>F4040 3c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40403C = 123;

	/**
	 * The feature id for the '<em><b>F4040 3d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40403D = 124;

	/**
	 * The feature id for the '<em><b>F4040 3e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40403E = 125;

	/**
	 * The feature id for the '<em><b>F4040 3f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40403F = 126;

	/**
	 * The feature id for the '<em><b>F404040</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404040 = 127;

	/**
	 * The feature id for the '<em><b>F404041</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404041 = 128;

	/**
	 * The feature id for the '<em><b>F404042</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404042 = 129;

	/**
	 * The feature id for the '<em><b>F404043</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404043 = 130;

	/**
	 * The feature id for the '<em><b>F404044</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404044 = 131;

	/**
	 * The feature id for the '<em><b>F404045</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404045 = 132;

	/**
	 * The feature id for the '<em><b>F404046</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404046 = 133;

	/**
	 * The feature id for the '<em><b>F404047</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404047 = 134;

	/**
	 * The feature id for the '<em><b>F404048</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404048 = 135;

	/**
	 * The feature id for the '<em><b>F404049</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404049 = 136;

	/**
	 * The feature id for the '<em><b>F4040 4a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40404A = 137;

	/**
	 * The feature id for the '<em><b>F4040 4b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40404B = 138;

	/**
	 * The feature id for the '<em><b>F4040 4c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40404C = 139;

	/**
	 * The feature id for the '<em><b>F4040 4d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40404D = 140;

	/**
	 * The feature id for the '<em><b>F4040 4e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40404E = 141;

	/**
	 * The feature id for the '<em><b>F4040 4f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40404F = 142;

	/**
	 * The feature id for the '<em><b>F404050</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404050 = 143;

	/**
	 * The feature id for the '<em><b>F404051</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404051 = 144;

	/**
	 * The feature id for the '<em><b>F404052</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404052 = 145;

	/**
	 * The feature id for the '<em><b>F404053</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404053 = 146;

	/**
	 * The feature id for the '<em><b>F404054</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404054 = 147;

	/**
	 * The feature id for the '<em><b>F404055</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404055 = 148;

	/**
	 * The feature id for the '<em><b>F404056</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404056 = 149;

	/**
	 * The feature id for the '<em><b>F404057</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404057 = 150;

	/**
	 * The feature id for the '<em><b>F404058</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404058 = 151;

	/**
	 * The feature id for the '<em><b>F404059</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404059 = 152;

	/**
	 * The feature id for the '<em><b>F4040 5a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40405A = 153;

	/**
	 * The feature id for the '<em><b>F4040 5b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40405B = 154;

	/**
	 * The feature id for the '<em><b>F4040 5c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40405C = 155;

	/**
	 * The feature id for the '<em><b>F4040 5d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40405D = 156;

	/**
	 * The feature id for the '<em><b>F4040 5e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40405E = 157;

	/**
	 * The feature id for the '<em><b>F4040 5f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40405F = 158;

	/**
	 * The feature id for the '<em><b>F404060</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404060 = 159;

	/**
	 * The feature id for the '<em><b>F404061</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404061 = 160;

	/**
	 * The feature id for the '<em><b>F404062</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404062 = 161;

	/**
	 * The feature id for the '<em><b>F404063</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404063 = 162;

	/**
	 * The feature id for the '<em><b>F404064</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404064 = 163;

	/**
	 * The feature id for the '<em><b>F404065</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404065 = 164;

	/**
	 * The feature id for the '<em><b>F404066</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404066 = 165;

	/**
	 * The feature id for the '<em><b>F404067</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404067 = 166;

	/**
	 * The feature id for the '<em><b>F404068</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404068 = 167;

	/**
	 * The feature id for the '<em><b>F404069</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404069 = 168;

	/**
	 * The feature id for the '<em><b>F4040 6a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40406A = 169;

	/**
	 * The feature id for the '<em><b>F4040 6b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40406B = 170;

	/**
	 * The feature id for the '<em><b>F4040 6c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40406C = 171;

	/**
	 * The feature id for the '<em><b>F4040 6d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40406D = 172;

	/**
	 * The feature id for the '<em><b>F4040 6e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40406E = 173;

	/**
	 * The feature id for the '<em><b>F4040 6f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40406F = 174;

	/**
	 * The feature id for the '<em><b>F404070</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404070 = 175;

	/**
	 * The feature id for the '<em><b>F404071</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404071 = 176;

	/**
	 * The feature id for the '<em><b>F404072</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404072 = 177;

	/**
	 * The feature id for the '<em><b>F404073</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404073 = 178;

	/**
	 * The feature id for the '<em><b>F404074</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404074 = 179;

	/**
	 * The feature id for the '<em><b>F404075</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404075 = 180;

	/**
	 * The feature id for the '<em><b>F404076</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404076 = 181;

	/**
	 * The feature id for the '<em><b>F404077</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404077 = 182;

	/**
	 * The feature id for the '<em><b>F404078</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404078 = 183;

	/**
	 * The feature id for the '<em><b>F404079</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404079 = 184;

	/**
	 * The feature id for the '<em><b>F4040 7a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40407A = 185;

	/**
	 * The feature id for the '<em><b>F4040 7b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40407B = 186;

	/**
	 * The feature id for the '<em><b>F4040 7c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40407C = 187;

	/**
	 * The feature id for the '<em><b>F4040 7d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40407D = 188;

	/**
	 * The feature id for the '<em><b>F4040 7e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40407E = 189;

	/**
	 * The feature id for the '<em><b>F4040 7f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40407F = 190;

	/**
	 * The feature id for the '<em><b>F404080</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404080 = 191;

	/**
	 * The feature id for the '<em><b>F404081</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404081 = 192;

	/**
	 * The feature id for the '<em><b>F404082</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404082 = 193;

	/**
	 * The feature id for the '<em><b>F404083</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404083 = 194;

	/**
	 * The feature id for the '<em><b>F404084</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404084 = 195;

	/**
	 * The feature id for the '<em><b>F404085</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404085 = 196;

	/**
	 * The feature id for the '<em><b>F404086</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404086 = 197;

	/**
	 * The feature id for the '<em><b>F404087</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404087 = 198;

	/**
	 * The feature id for the '<em><b>F404088</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404088 = 199;

	/**
	 * The feature id for the '<em><b>F404089</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404089 = 200;

	/**
	 * The feature id for the '<em><b>F4040 8a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40408A = 201;

	/**
	 * The feature id for the '<em><b>F4040 8b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40408B = 202;

	/**
	 * The feature id for the '<em><b>F4040 8c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40408C = 203;

	/**
	 * The feature id for the '<em><b>F4040 8d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40408D = 204;

	/**
	 * The feature id for the '<em><b>F4040 8e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40408E = 205;

	/**
	 * The feature id for the '<em><b>F4040 8f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40408F = 206;

	/**
	 * The feature id for the '<em><b>F404090</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404090 = 207;

	/**
	 * The feature id for the '<em><b>F404091</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404091 = 208;

	/**
	 * The feature id for the '<em><b>F404092</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404092 = 209;

	/**
	 * The feature id for the '<em><b>F404093</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404093 = 210;

	/**
	 * The feature id for the '<em><b>F404094</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404094 = 211;

	/**
	 * The feature id for the '<em><b>F404095</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404095 = 212;

	/**
	 * The feature id for the '<em><b>F404096</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404096 = 213;

	/**
	 * The feature id for the '<em><b>F404097</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404097 = 214;

	/**
	 * The feature id for the '<em><b>F404098</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404098 = 215;

	/**
	 * The feature id for the '<em><b>F404099</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F404099 = 216;

	/**
	 * The feature id for the '<em><b>F4040 9a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40409A = 217;

	/**
	 * The feature id for the '<em><b>F4040 9b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40409B = 218;

	/**
	 * The feature id for the '<em><b>F4040 9c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40409C = 219;

	/**
	 * The feature id for the '<em><b>F4040 9d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40409D = 220;

	/**
	 * The feature id for the '<em><b>F4040 9e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40409E = 221;

	/**
	 * The feature id for the '<em><b>F4040 9f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F40409F = 222;

	/**
	 * The feature id for the '<em><b>F404 0a0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A0 = 223;

	/**
	 * The feature id for the '<em><b>F404 0a1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A1 = 224;

	/**
	 * The feature id for the '<em><b>F404 0a2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A2 = 225;

	/**
	 * The feature id for the '<em><b>F404 0a3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A3 = 226;

	/**
	 * The feature id for the '<em><b>F404 0a4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A4 = 227;

	/**
	 * The feature id for the '<em><b>F404 0a5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A5 = 228;

	/**
	 * The feature id for the '<em><b>F404 0a6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A6 = 229;

	/**
	 * The feature id for the '<em><b>F404 0a7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A7 = 230;

	/**
	 * The feature id for the '<em><b>F404 0a8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A8 = 231;

	/**
	 * The feature id for the '<em><b>F404 0a9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040A9 = 232;

	/**
	 * The feature id for the '<em><b>F404 0aa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040AA = 233;

	/**
	 * The feature id for the '<em><b>F404 0ab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040AB = 234;

	/**
	 * The feature id for the '<em><b>F404 0ac</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040AC = 235;

	/**
	 * The feature id for the '<em><b>F404 0ad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040AD = 236;

	/**
	 * The feature id for the '<em><b>F404 0ae</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040AE = 237;

	/**
	 * The feature id for the '<em><b>F404 0af</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040AF = 238;

	/**
	 * The feature id for the '<em><b>F404 0b0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B0 = 239;

	/**
	 * The feature id for the '<em><b>F404 0b1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B1 = 240;

	/**
	 * The feature id for the '<em><b>F404 0b2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B2 = 241;

	/**
	 * The feature id for the '<em><b>F404 0b3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B3 = 242;

	/**
	 * The feature id for the '<em><b>F404 0b4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B4 = 243;

	/**
	 * The feature id for the '<em><b>F404 0b5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B5 = 244;

	/**
	 * The feature id for the '<em><b>F404 0b6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B6 = 245;

	/**
	 * The feature id for the '<em><b>F404 0b7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B7 = 246;

	/**
	 * The feature id for the '<em><b>F404 0b8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B8 = 247;

	/**
	 * The feature id for the '<em><b>F404 0b9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040B9 = 248;

	/**
	 * The feature id for the '<em><b>F404 0ba</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040BA = 249;

	/**
	 * The feature id for the '<em><b>F404 0bb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040BB = 250;

	/**
	 * The feature id for the '<em><b>F404 0bc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040BC = 251;

	/**
	 * The feature id for the '<em><b>F404 0bd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040BD = 252;

	/**
	 * The feature id for the '<em><b>F404 0be</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040BE = 253;

	/**
	 * The feature id for the '<em><b>F404 0bf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040BF = 254;

	/**
	 * The feature id for the '<em><b>F404 0c0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C0 = 255;

	/**
	 * The feature id for the '<em><b>F404 0c1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C1 = 256;

	/**
	 * The feature id for the '<em><b>F404 0c2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C2 = 257;

	/**
	 * The feature id for the '<em><b>F404 0c3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C3 = 258;

	/**
	 * The feature id for the '<em><b>F404 0c4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C4 = 259;

	/**
	 * The feature id for the '<em><b>F404 0c5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C5 = 260;

	/**
	 * The feature id for the '<em><b>F404 0c6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C6 = 261;

	/**
	 * The feature id for the '<em><b>F404 0c7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C7 = 262;

	/**
	 * The feature id for the '<em><b>F404 0c8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__F4040C8 = 263;

	/**
	 * The feature id for the '<em><b>Timephased Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE__TIMEPHASED_DATA = 264;

	/**
	 * The number of structural features of the '<em>Assignment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_TYPE_FEATURE_COUNT = 265;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.AvailabilityPeriodsTypeImpl <em>Availability Periods Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.AvailabilityPeriodsTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAvailabilityPeriodsType()
	 * @generated
	 */
	int AVAILABILITY_PERIODS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Availability Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD = 0;

	/**
	 * The number of structural features of the '<em>Availability Periods Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_PERIODS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.AvailabilityPeriodTypeImpl <em>Availability Period Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.AvailabilityPeriodTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAvailabilityPeriodType()
	 * @generated
	 */
	int AVAILABILITY_PERIOD_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Available From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_PERIOD_TYPE__AVAILABLE_FROM = 0;

	/**
	 * The feature id for the '<em><b>Available To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_PERIOD_TYPE__AVAILABLE_TO = 1;

	/**
	 * The feature id for the '<em><b>Available Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS = 2;

	/**
	 * The number of structural features of the '<em>Availability Period Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_PERIOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.BaselineTypeImpl <em>Baseline Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.BaselineTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineType()
	 * @generated
	 */
	int BASELINE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Timephased Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__TIMEPHASED_DATA = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__START = 2;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__FINISH = 3;

	/**
	 * The feature id for the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__WORK = 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__COST = 5;

	/**
	 * The feature id for the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__BCWS = 6;

	/**
	 * The feature id for the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE__BCWP = 7;

	/**
	 * The number of structural features of the '<em>Baseline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.BaselineType1Impl <em>Baseline Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.BaselineType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineType1()
	 * @generated
	 */
	int BASELINE_TYPE1 = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE1__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE1__WORK = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE1__COST = 2;

	/**
	 * The feature id for the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE1__BCWS = 3;

	/**
	 * The feature id for the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE1__BCWP = 4;

	/**
	 * The number of structural features of the '<em>Baseline Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.BaselineType2Impl <em>Baseline Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.BaselineType2Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineType2()
	 * @generated
	 */
	int BASELINE_TYPE2 = 6;

	/**
	 * The feature id for the '<em><b>Timephased Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__TIMEPHASED_DATA = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Interim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__INTERIM = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__START = 3;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__FINISH = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Duration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__DURATION_FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Estimated Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__ESTIMATED_DURATION = 7;

	/**
	 * The feature id for the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__WORK = 8;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__COST = 9;

	/**
	 * The feature id for the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__BCWS = 10;

	/**
	 * The feature id for the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__BCWP = 11;

	/**
	 * The feature id for the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2__FIXED_COST = 12;

	/**
	 * The number of structural features of the '<em>Baseline Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_TYPE2_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.CalendarsTypeImpl <em>Calendars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.CalendarsTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalendarsType()
	 * @generated
	 */
	int CALENDARS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Calendar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_TYPE__CALENDAR = 0;

	/**
	 * The number of structural features of the '<em>Calendars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.CalendarTypeImpl <em>Calendar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.CalendarTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalendarType()
	 * @generated
	 */
	int CALENDAR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Base Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE__IS_BASE_CALENDAR = 2;

	/**
	 * The feature id for the '<em><b>Base Calendar UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE__BASE_CALENDAR_UID = 3;

	/**
	 * The feature id for the '<em><b>Week Days</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE__WEEK_DAYS = 4;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE__EXCEPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Work Weeks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE__WORK_WEEKS = 6;

	/**
	 * The number of structural features of the '<em>Calendar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.DocumentRootImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ExceptionsTypeImpl <em>Exceptions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ExceptionsTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExceptionsType()
	 * @generated
	 */
	int EXCEPTIONS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONS_TYPE__EXCEPTION = 0;

	/**
	 * The number of structural features of the '<em>Exceptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ExceptionTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Entered By Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES = 0;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__TIME_PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__OCCURRENCES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Days Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__DAYS_OF_WEEK = 6;

	/**
	 * The feature id for the '<em><b>Month Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__MONTH_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Month Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__MONTH_POSITION = 8;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__MONTH = 9;

	/**
	 * The feature id for the '<em><b>Month Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__MONTH_DAY = 10;

	/**
	 * The feature id for the '<em><b>Day Working</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__DAY_WORKING = 11;

	/**
	 * The feature id for the '<em><b>Working Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__WORKING_TIMES = 12;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributesTypeImpl <em>Extended Attributes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ExtendedAttributesTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributesType()
	 * @generated
	 */
	int EXTENDED_ATTRIBUTES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTES_TYPE__EXTENDED_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Extended Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl <em>Extended Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType()
	 * @generated
	 */
	int EXTENDED_ATTRIBUTE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__FIELD_ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__VALUE_GUID = 2;

	/**
	 * The feature id for the '<em><b>Duration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Extended Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeType1Impl <em>Extended Attribute Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ExtendedAttributeType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType1()
	 * @generated
	 */
	int EXTENDED_ATTRIBUTE_TYPE1 = 14;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE1__FIELD_ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE1__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE1__VALUE_GUID = 2;

	/**
	 * The feature id for the '<em><b>Duration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE1__DURATION_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Extended Attribute Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeType2Impl <em>Extended Attribute Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ExtendedAttributeType2Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType2()
	 * @generated
	 */
	int EXTENDED_ATTRIBUTE_TYPE2 = 15;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE2__FIELD_ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE2__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE2__VALUE_GUID = 2;

	/**
	 * The feature id for the '<em><b>Duration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE2__DURATION_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Extended Attribute Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE2_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl <em>Extended Attribute Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType3()
	 * @generated
	 */
	int EXTENDED_ATTRIBUTE_TYPE3 = 16;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID = 0;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>CF Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__GUID = 3;

	/**
	 * The feature id for the '<em><b>Elem Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Max Multi Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES = 5;

	/**
	 * The feature id for the '<em><b>User Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__USER_DEF = 6;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__ALIAS = 7;

	/**
	 * The feature id for the '<em><b>Secondary PID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID = 8;

	/**
	 * The feature id for the '<em><b>Auto Roll Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN = 9;

	/**
	 * The feature id for the '<em><b>Default Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID = 10;

	/**
	 * The feature id for the '<em><b>Ltuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__LTUID = 11;

	/**
	 * The feature id for the '<em><b>Phonetic Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS = 12;

	/**
	 * The feature id for the '<em><b>Rollup Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Calculation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__FORMULA = 15;

	/**
	 * The feature id for the '<em><b>Restrict Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Valuelist Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER = 17;

	/**
	 * The feature id for the '<em><b>Append New Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__DEFAULT = 19;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST = 20;

	/**
	 * The number of structural features of the '<em>Extended Attribute Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_ATTRIBUTE_TYPE3_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.MasksTypeImpl <em>Masks Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.MasksTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMasksType()
	 * @generated
	 */
	int MASKS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKS_TYPE__MASK = 0;

	/**
	 * The number of structural features of the '<em>Masks Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASKS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.MaskTypeImpl <em>Mask Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.MaskTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMaskType()
	 * @generated
	 */
	int MASK_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE__SEPARATOR = 3;

	/**
	 * The number of structural features of the '<em>Mask Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.OutlineCodesTypeImpl <em>Outline Codes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.OutlineCodesTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodesType()
	 * @generated
	 */
	int OUTLINE_CODES_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Outline Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODES_TYPE__OUTLINE_CODE = 0;

	/**
	 * The number of structural features of the '<em>Outline Codes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.OutlineCodeTypeImpl <em>Outline Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.OutlineCodeTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodeType()
	 * @generated
	 */
	int OUTLINE_CODE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE__FIELD_ID = 0;

	/**
	 * The feature id for the '<em><b>Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE__VALUE_ID = 1;

	/**
	 * The feature id for the '<em><b>Value GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE__VALUE_GUID = 2;

	/**
	 * The number of structural features of the '<em>Outline Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.OutlineCodeType1Impl <em>Outline Code Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.OutlineCodeType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodeType1()
	 * @generated
	 */
	int OUTLINE_CODE_TYPE1 = 21;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE1__FIELD_ID = 0;

	/**
	 * The feature id for the '<em><b>Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE1__VALUE_ID = 1;

	/**
	 * The feature id for the '<em><b>Value GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE1__VALUE_GUID = 2;

	/**
	 * The number of structural features of the '<em>Outline Code Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl <em>Outline Code Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.OutlineCodeType2Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodeType2()
	 * @generated
	 */
	int OUTLINE_CODE_TYPE2 = 22;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__GUID = 0;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__FIELD_ID = 1;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__FIELD_NAME = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Phonetic Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__PHONETIC_ALIAS = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__VALUES = 5;

	/**
	 * The feature id for the '<em><b>Enterprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__ENTERPRISE = 6;

	/**
	 * The feature id for the '<em><b>Enterprise Outline Code Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS = 7;

	/**
	 * The feature id for the '<em><b>Resource Substitution Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED = 8;

	/**
	 * The feature id for the '<em><b>Leaf Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__LEAF_ONLY = 9;

	/**
	 * The feature id for the '<em><b>All Levels Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED = 10;

	/**
	 * The feature id for the '<em><b>Only Table Values Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED = 11;

	/**
	 * The feature id for the '<em><b>Masks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2__MASKS = 12;

	/**
	 * The number of structural features of the '<em>Outline Code Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINE_CODE_TYPE2_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl <em>Predecessor Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPredecessorLinkType()
	 * @generated
	 */
	int PREDECESSOR_LINK_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Predecessor UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_LINK_TYPE__PREDECESSOR_UID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_LINK_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cross Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_LINK_TYPE__CROSS_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Cross Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_LINK_TYPE__CROSS_PROJECT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Link Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_LINK_TYPE__LINK_LAG = 4;

	/**
	 * The feature id for the '<em><b>Lag Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_LINK_TYPE__LAG_FORMAT = 5;

	/**
	 * The number of structural features of the '<em>Predecessor Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_LINK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ProjectTypeImpl <em>Project Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ProjectTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getProjectType()
	 * @generated
	 */
	int PROJECT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Save Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__SAVE_VERSION = 0;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__UID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__SUBJECT = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__COMPANY = 6;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MANAGER = 7;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__AUTHOR = 8;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CREATION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__REVISION = 10;

	/**
	 * The feature id for the '<em><b>Last Saved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__LAST_SAVED = 11;

	/**
	 * The feature id for the '<em><b>Schedule From Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__SCHEDULE_FROM_START = 12;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__START_DATE = 13;

	/**
	 * The feature id for the '<em><b>Finish Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__FINISH_DATE = 14;

	/**
	 * The feature id for the '<em><b>FY Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__FY_START_DATE = 15;

	/**
	 * The feature id for the '<em><b>Critical Slack Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CRITICAL_SLACK_LIMIT = 16;

	/**
	 * The feature id for the '<em><b>Currency Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CURRENCY_DIGITS = 17;

	/**
	 * The feature id for the '<em><b>Currency Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CURRENCY_SYMBOL = 18;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CURRENCY_CODE = 19;

	/**
	 * The feature id for the '<em><b>Currency Symbol Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CURRENCY_SYMBOL_POSITION = 20;

	/**
	 * The feature id for the '<em><b>Calendar UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CALENDAR_UID = 21;

	/**
	 * The feature id for the '<em><b>Default Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DEFAULT_START_TIME = 22;

	/**
	 * The feature id for the '<em><b>Default Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DEFAULT_FINISH_TIME = 23;

	/**
	 * The feature id for the '<em><b>Minutes Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MINUTES_PER_DAY = 24;

	/**
	 * The feature id for the '<em><b>Minutes Per Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MINUTES_PER_WEEK = 25;

	/**
	 * The feature id for the '<em><b>Days Per Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DAYS_PER_MONTH = 26;

	/**
	 * The feature id for the '<em><b>Default Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DEFAULT_TASK_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Default Fixed Cost Accrual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL = 28;

	/**
	 * The feature id for the '<em><b>Default Standard Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DEFAULT_STANDARD_RATE = 29;

	/**
	 * The feature id for the '<em><b>Default Overtime Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DEFAULT_OVERTIME_RATE = 30;

	/**
	 * The feature id for the '<em><b>Duration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DURATION_FORMAT = 31;

	/**
	 * The feature id for the '<em><b>Work Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__WORK_FORMAT = 32;

	/**
	 * The feature id for the '<em><b>Editable Actual Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__EDITABLE_ACTUAL_COSTS = 33;

	/**
	 * The feature id for the '<em><b>Honor Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__HONOR_CONSTRAINTS = 34;

	/**
	 * The feature id for the '<em><b>Earned Value Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__EARNED_VALUE_METHOD = 35;

	/**
	 * The feature id for the '<em><b>Inserted Projects Like Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY = 36;

	/**
	 * The feature id for the '<em><b>Multiple Critical Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS = 37;

	/**
	 * The feature id for the '<em><b>New Tasks Effort Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN = 38;

	/**
	 * The feature id for the '<em><b>New Tasks Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__NEW_TASKS_ESTIMATED = 39;

	/**
	 * The feature id for the '<em><b>Splits In Progress Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS = 40;

	/**
	 * The feature id for the '<em><b>Spread Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__SPREAD_ACTUAL_COST = 41;

	/**
	 * The feature id for the '<em><b>Spread Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__SPREAD_PERCENT_COMPLETE = 42;

	/**
	 * The feature id for the '<em><b>Task Updates Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__TASK_UPDATES_RESOURCE = 43;

	/**
	 * The feature id for the '<em><b>Fiscal Year Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__FISCAL_YEAR_START = 44;

	/**
	 * The feature id for the '<em><b>Week Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__WEEK_START_DAY = 45;

	/**
	 * The feature id for the '<em><b>Move Completed Ends Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK = 46;

	/**
	 * The feature id for the '<em><b>Move Remaining Starts Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK = 47;

	/**
	 * The feature id for the '<em><b>Move Remaining Starts Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD = 48;

	/**
	 * The feature id for the '<em><b>Move Completed Ends Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD = 49;

	/**
	 * The feature id for the '<em><b>Baseline For Earned Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE = 50;

	/**
	 * The feature id for the '<em><b>Auto Add New Resources And Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS = 51;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__STATUS_DATE = 52;

	/**
	 * The feature id for the '<em><b>Current Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CURRENT_DATE = 53;

	/**
	 * The feature id for the '<em><b>Microsoft Project Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL = 54;

	/**
	 * The feature id for the '<em><b>Autolink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__AUTOLINK = 55;

	/**
	 * The feature id for the '<em><b>New Task Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__NEW_TASK_START_DATE = 56;

	/**
	 * The feature id for the '<em><b>Default Task EV Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DEFAULT_TASK_EV_METHOD = 57;

	/**
	 * The feature id for the '<em><b>Project Externally Edited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED = 58;

	/**
	 * The feature id for the '<em><b>Extended Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__EXTENDED_CREATION_DATE = 59;

	/**
	 * The feature id for the '<em><b>Actuals In Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__ACTUALS_IN_SYNC = 60;

	/**
	 * The feature id for the '<em><b>Remove File Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__REMOVE_FILE_PROPERTIES = 61;

	/**
	 * The feature id for the '<em><b>Admin Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__ADMIN_PROJECT = 62;

	/**
	 * The feature id for the '<em><b>Outline Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__OUTLINE_CODES = 63;

	/**
	 * The feature id for the '<em><b>WBS Masks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__WBS_MASKS = 64;

	/**
	 * The feature id for the '<em><b>Extended Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__EXTENDED_ATTRIBUTES = 65;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CALENDARS = 66;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__TASKS = 67;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__RESOURCES = 68;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__ASSIGNMENTS = 69;

	/**
	 * The number of structural features of the '<em>Project Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE_FEATURE_COUNT = 70;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.RatesTypeImpl <em>Rates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.RatesTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRatesType()
	 * @generated
	 */
	int RATES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATES_TYPE__RATE = 0;

	/**
	 * The number of structural features of the '<em>Rates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.RateTypeImpl <em>Rate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.RateTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRateType()
	 * @generated
	 */
	int RATE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Rates From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__RATES_FROM = 0;

	/**
	 * The feature id for the '<em><b>Rates To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__RATES_TO = 1;

	/**
	 * The feature id for the '<em><b>Rate Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__RATE_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Standard Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__STANDARD_RATE = 3;

	/**
	 * The feature id for the '<em><b>Standard Rate Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__STANDARD_RATE_FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Overtime Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__OVERTIME_RATE = 5;

	/**
	 * The feature id for the '<em><b>Overtime Rate Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__OVERTIME_RATE_FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Cost Per Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__COST_PER_USE = 7;

	/**
	 * The number of structural features of the '<em>Rate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ResourcesTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getResourcesType()
	 * @generated
	 */
	int RESOURCES_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ResourceTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_NULL = 4;

	/**
	 * The feature id for the '<em><b>Initials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__INITIALS = 5;

	/**
	 * The feature id for the '<em><b>Phonetics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__PHONETICS = 6;

	/**
	 * The feature id for the '<em><b>NT Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NT_ACCOUNT = 7;

	/**
	 * The feature id for the '<em><b>Material Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__MATERIAL_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CODE = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__GROUP = 10;

	/**
	 * The feature id for the '<em><b>Work Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__WORK_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__EMAIL_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__HYPERLINK = 13;

	/**
	 * The feature id for the '<em><b>Hyperlink Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__HYPERLINK_ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>Hyperlink Sub Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Max Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__MAX_UNITS = 16;

	/**
	 * The feature id for the '<em><b>Peak Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__PEAK_UNITS = 17;

	/**
	 * The feature id for the '<em><b>Over Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__OVER_ALLOCATED = 18;

	/**
	 * The feature id for the '<em><b>Available From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__AVAILABLE_FROM = 19;

	/**
	 * The feature id for the '<em><b>Available To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__AVAILABLE_TO = 20;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__START = 21;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__FINISH = 22;

	/**
	 * The feature id for the '<em><b>Can Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CAN_LEVEL = 23;

	/**
	 * The feature id for the '<em><b>Accrue At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACCRUE_AT = 24;

	/**
	 * The feature id for the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__WORK = 25;

	/**
	 * The feature id for the '<em><b>Regular Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__REGULAR_WORK = 26;

	/**
	 * The feature id for the '<em><b>Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__OVERTIME_WORK = 27;

	/**
	 * The feature id for the '<em><b>Actual Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACTUAL_WORK = 28;

	/**
	 * The feature id for the '<em><b>Remaining Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__REMAINING_WORK = 29;

	/**
	 * The feature id for the '<em><b>Actual Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACTUAL_OVERTIME_WORK = 30;

	/**
	 * The feature id for the '<em><b>Remaining Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__REMAINING_OVERTIME_WORK = 31;

	/**
	 * The feature id for the '<em><b>Percent Work Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__PERCENT_WORK_COMPLETE = 32;

	/**
	 * The feature id for the '<em><b>Standard Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__STANDARD_RATE = 33;

	/**
	 * The feature id for the '<em><b>Standard Rate Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__STANDARD_RATE_FORMAT = 34;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__COST = 35;

	/**
	 * The feature id for the '<em><b>Overtime Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__OVERTIME_RATE = 36;

	/**
	 * The feature id for the '<em><b>Overtime Rate Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__OVERTIME_RATE_FORMAT = 37;

	/**
	 * The feature id for the '<em><b>Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__OVERTIME_COST = 38;

	/**
	 * The feature id for the '<em><b>Cost Per Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__COST_PER_USE = 39;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACTUAL_COST = 40;

	/**
	 * The feature id for the '<em><b>Actual Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACTUAL_OVERTIME_COST = 41;

	/**
	 * The feature id for the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__REMAINING_COST = 42;

	/**
	 * The feature id for the '<em><b>Remaining Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__REMAINING_OVERTIME_COST = 43;

	/**
	 * The feature id for the '<em><b>Work Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__WORK_VARIANCE = 44;

	/**
	 * The feature id for the '<em><b>Cost Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__COST_VARIANCE = 45;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__SV = 46;

	/**
	 * The feature id for the '<em><b>CV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CV = 47;

	/**
	 * The feature id for the '<em><b>ACWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACWP = 48;

	/**
	 * The feature id for the '<em><b>Calendar UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CALENDAR_UID = 49;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NOTES = 50;

	/**
	 * The feature id for the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__BCWS = 51;

	/**
	 * The feature id for the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__BCWP = 52;

	/**
	 * The feature id for the '<em><b>Is Generic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_GENERIC = 53;

	/**
	 * The feature id for the '<em><b>Is Inactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_INACTIVE = 54;

	/**
	 * The feature id for the '<em><b>Is Enterprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_ENTERPRISE = 55;

	/**
	 * The feature id for the '<em><b>Booking Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__BOOKING_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Actual Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACTUAL_WORK_PROTECTED = 57;

	/**
	 * The feature id for the '<em><b>Actual Overtime Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED = 58;

	/**
	 * The feature id for the '<em><b>Active Directory GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID = 59;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__CREATION_DATE = 60;

	/**
	 * The feature id for the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__EXTENDED_ATTRIBUTE = 61;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__BASELINE = 62;

	/**
	 * The feature id for the '<em><b>Outline Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__OUTLINE_CODE = 63;

	/**
	 * The feature id for the '<em><b>Is Cost Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_COST_RESOURCE = 64;

	/**
	 * The feature id for the '<em><b>Assn Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ASSN_OWNER = 65;

	/**
	 * The feature id for the '<em><b>Assn Owner Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ASSN_OWNER_GUID = 66;

	/**
	 * The feature id for the '<em><b>Is Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_BUDGET = 67;

	/**
	 * The feature id for the '<em><b>Availability Periods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__AVAILABILITY_PERIODS = 68;

	/**
	 * The feature id for the '<em><b>Rates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RATES = 69;

	/**
	 * The feature id for the '<em><b>Timephased Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TIMEPHASED_DATA = 70;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 71;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.TasksTypeImpl <em>Tasks Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.TasksTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTasksType()
	 * @generated
	 */
	int TASKS_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE__TASK = 0;

	/**
	 * The number of structural features of the '<em>Tasks Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.TaskTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 30;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__UID = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__IS_NULL = 4;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CREATE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CONTACT = 6;

	/**
	 * The feature id for the '<em><b>WBS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__WBS = 7;

	/**
	 * The feature id for the '<em><b>WBS Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__WBS_LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Outline Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OUTLINE_NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OUTLINE_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRIORITY = 11;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__START = 12;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__FINISH = 13;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DURATION = 14;

	/**
	 * The feature id for the '<em><b>Duration Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DURATION_FORMAT = 15;

	/**
	 * The feature id for the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__WORK = 16;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__STOP = 17;

	/**
	 * The feature id for the '<em><b>Resume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RESUME = 18;

	/**
	 * The feature id for the '<em><b>Resume Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RESUME_VALID = 19;

	/**
	 * The feature id for the '<em><b>Effort Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EFFORT_DRIVEN = 20;

	/**
	 * The feature id for the '<em><b>Recurring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RECURRING = 21;

	/**
	 * The feature id for the '<em><b>Over Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OVER_ALLOCATED = 22;

	/**
	 * The feature id for the '<em><b>Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ESTIMATED = 23;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__MILESTONE = 24;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SUMMARY = 25;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CRITICAL = 26;

	/**
	 * The feature id for the '<em><b>Is Subproject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__IS_SUBPROJECT = 27;

	/**
	 * The feature id for the '<em><b>Is Subproject Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__IS_SUBPROJECT_READ_ONLY = 28;

	/**
	 * The feature id for the '<em><b>Subproject Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SUBPROJECT_NAME = 29;

	/**
	 * The feature id for the '<em><b>External Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EXTERNAL_TASK = 30;

	/**
	 * The feature id for the '<em><b>External Task Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EXTERNAL_TASK_PROJECT = 31;

	/**
	 * The feature id for the '<em><b>Early Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EARLY_START = 32;

	/**
	 * The feature id for the '<em><b>Early Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EARLY_FINISH = 33;

	/**
	 * The feature id for the '<em><b>Late Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__LATE_START = 34;

	/**
	 * The feature id for the '<em><b>Late Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__LATE_FINISH = 35;

	/**
	 * The feature id for the '<em><b>Start Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__START_VARIANCE = 36;

	/**
	 * The feature id for the '<em><b>Finish Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__FINISH_VARIANCE = 37;

	/**
	 * The feature id for the '<em><b>Work Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__WORK_VARIANCE = 38;

	/**
	 * The feature id for the '<em><b>Free Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__FREE_SLACK = 39;

	/**
	 * The feature id for the '<em><b>Total Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TOTAL_SLACK = 40;

	/**
	 * The feature id for the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__FIXED_COST = 41;

	/**
	 * The feature id for the '<em><b>Fixed Cost Accrual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__FIXED_COST_ACCRUAL = 42;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PERCENT_COMPLETE = 43;

	/**
	 * The feature id for the '<em><b>Percent Work Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PERCENT_WORK_COMPLETE = 44;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__COST = 45;

	/**
	 * The feature id for the '<em><b>Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OVERTIME_COST = 46;

	/**
	 * The feature id for the '<em><b>Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OVERTIME_WORK = 47;

	/**
	 * The feature id for the '<em><b>Actual Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_START = 48;

	/**
	 * The feature id for the '<em><b>Actual Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_FINISH = 49;

	/**
	 * The feature id for the '<em><b>Actual Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_DURATION = 50;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_COST = 51;

	/**
	 * The feature id for the '<em><b>Actual Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_OVERTIME_COST = 52;

	/**
	 * The feature id for the '<em><b>Actual Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_WORK = 53;

	/**
	 * The feature id for the '<em><b>Actual Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_OVERTIME_WORK = 54;

	/**
	 * The feature id for the '<em><b>Regular Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REGULAR_WORK = 55;

	/**
	 * The feature id for the '<em><b>Remaining Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REMAINING_DURATION = 56;

	/**
	 * The feature id for the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REMAINING_COST = 57;

	/**
	 * The feature id for the '<em><b>Remaining Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REMAINING_WORK = 58;

	/**
	 * The feature id for the '<em><b>Remaining Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REMAINING_OVERTIME_COST = 59;

	/**
	 * The feature id for the '<em><b>Remaining Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REMAINING_OVERTIME_WORK = 60;

	/**
	 * The feature id for the '<em><b>ACWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACWP = 61;

	/**
	 * The feature id for the '<em><b>CV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CV = 62;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CONSTRAINT_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Calendar UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CALENDAR_UID = 64;

	/**
	 * The feature id for the '<em><b>Constraint Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CONSTRAINT_DATE = 65;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DEADLINE = 66;

	/**
	 * The feature id for the '<em><b>Level Assignments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__LEVEL_ASSIGNMENTS = 67;

	/**
	 * The feature id for the '<em><b>Leveling Can Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__LEVELING_CAN_SPLIT = 68;

	/**
	 * The feature id for the '<em><b>Leveling Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__LEVELING_DELAY = 69;

	/**
	 * The feature id for the '<em><b>Leveling Delay Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__LEVELING_DELAY_FORMAT = 70;

	/**
	 * The feature id for the '<em><b>Pre Leveled Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRE_LEVELED_START = 71;

	/**
	 * The feature id for the '<em><b>Pre Leveled Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRE_LEVELED_FINISH = 72;

	/**
	 * The feature id for the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__HYPERLINK = 73;

	/**
	 * The feature id for the '<em><b>Hyperlink Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__HYPERLINK_ADDRESS = 74;

	/**
	 * The feature id for the '<em><b>Hyperlink Sub Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__HYPERLINK_SUB_ADDRESS = 75;

	/**
	 * The feature id for the '<em><b>Ignore Resource Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__IGNORE_RESOURCE_CALENDAR = 76;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NOTES = 77;

	/**
	 * The feature id for the '<em><b>Hide Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__HIDE_BAR = 78;

	/**
	 * The feature id for the '<em><b>Rollup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ROLLUP = 79;

	/**
	 * The feature id for the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__BCWS = 80;

	/**
	 * The feature id for the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__BCWP = 81;

	/**
	 * The feature id for the '<em><b>Physical Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PHYSICAL_PERCENT_COMPLETE = 82;

	/**
	 * The feature id for the '<em><b>Earned Value Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EARNED_VALUE_METHOD = 83;

	/**
	 * The feature id for the '<em><b>Predecessor Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PREDECESSOR_LINK = 84;

	/**
	 * The feature id for the '<em><b>Actual Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_WORK_PROTECTED = 85;

	/**
	 * The feature id for the '<em><b>Actual Overtime Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED = 86;

	/**
	 * The feature id for the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__EXTENDED_ATTRIBUTE = 87;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__BASELINE = 88;

	/**
	 * The feature id for the '<em><b>Outline Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OUTLINE_CODE = 89;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__IS_PUBLISHED = 90;

	/**
	 * The feature id for the '<em><b>Status Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__STATUS_MANAGER = 91;

	/**
	 * The feature id for the '<em><b>Commitment Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__COMMITMENT_START = 92;

	/**
	 * The feature id for the '<em><b>Commitment Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__COMMITMENT_FINISH = 93;

	/**
	 * The feature id for the '<em><b>Commitment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__COMMITMENT_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Timephased Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TIMEPHASED_DATA = 95;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = 96;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.TimePeriodTypeImpl <em>Time Period Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.TimePeriodTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimePeriodType()
	 * @generated
	 */
	int TIME_PERIOD_TYPE = 31;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE__FROM_DATE = 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE__TO_DATE = 1;

	/**
	 * The number of structural features of the '<em>Time Period Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.TimePeriodType1Impl <em>Time Period Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.TimePeriodType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimePeriodType1()
	 * @generated
	 */
	int TIME_PERIOD_TYPE1 = 32;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE1__FROM_DATE = 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE1__TO_DATE = 1;

	/**
	 * The number of structural features of the '<em>Time Period Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.TimePeriodType2Impl <em>Time Period Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.TimePeriodType2Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimePeriodType2()
	 * @generated
	 */
	int TIME_PERIOD_TYPE2 = 33;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE2__FROM_DATE = 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE2__TO_DATE = 1;

	/**
	 * The number of structural features of the '<em>Time Period Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.TimephasedDataTypeImpl <em>Timephased Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.TimephasedDataTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimephasedDataType()
	 * @generated
	 */
	int TIMEPHASED_DATA_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPHASED_DATA_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPHASED_DATA_TYPE__UID = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPHASED_DATA_TYPE__START = 2;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPHASED_DATA_TYPE__FINISH = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPHASED_DATA_TYPE__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPHASED_DATA_TYPE__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Timephased Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEPHASED_DATA_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ValueListTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValueListType()
	 * @generated
	 */
	int VALUE_LIST_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ValuesTypeImpl <em>Values Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ValuesTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValuesType()
	 * @generated
	 */
	int VALUES_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Values Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ValueTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 37;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Phonetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__PHONETIC = 3;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.ValueType1Impl <em>Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.ValueType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValueType1()
	 * @generated
	 */
	int VALUE_TYPE1 = 38;

	/**
	 * The feature id for the '<em><b>Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__VALUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Field GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__FIELD_GUID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parent Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__PARENT_VALUE_ID = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WBSMasksTypeImpl <em>WBS Masks Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WBSMasksTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWBSMasksType()
	 * @generated
	 */
	int WBS_MASKS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Verify Unique Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES = 0;

	/**
	 * The feature id for the '<em><b>Generate Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASKS_TYPE__GENERATE_CODES = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASKS_TYPE__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>WBS Mask</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASKS_TYPE__WBS_MASK = 3;

	/**
	 * The number of structural features of the '<em>WBS Masks Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASKS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WBSMaskTypeImpl <em>WBS Mask Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WBSMaskTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWBSMaskType()
	 * @generated
	 */
	int WBS_MASK_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASK_TYPE__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASK_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASK_TYPE__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASK_TYPE__SEPARATOR = 3;

	/**
	 * The number of structural features of the '<em>WBS Mask Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WBS_MASK_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WeekDaysTypeImpl <em>Week Days Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WeekDaysTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekDaysType()
	 * @generated
	 */
	int WEEK_DAYS_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Week Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAYS_TYPE__WEEK_DAY = 0;

	/**
	 * The number of structural features of the '<em>Week Days Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAYS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WeekDayTypeImpl <em>Week Day Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WeekDayTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekDayType()
	 * @generated
	 */
	int WEEK_DAY_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE__DAY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Day Working</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE__DAY_WORKING = 1;

	/**
	 * The number of structural features of the '<em>Week Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WeekDayType1Impl <em>Week Day Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WeekDayType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekDayType1()
	 * @generated
	 */
	int WEEK_DAY_TYPE1 = 43;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE1__DAY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Day Working</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE1__DAY_WORKING = 1;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE1__TIME_PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Working Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE1__WORKING_TIMES = 3;

	/**
	 * The number of structural features of the '<em>Week Day Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_DAY_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WorkingTimesTypeImpl <em>Working Times Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WorkingTimesTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimesType()
	 * @generated
	 */
	int WORKING_TIMES_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Working Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIMES_TYPE__WORKING_TIME = 0;

	/**
	 * The number of structural features of the '<em>Working Times Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIMES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WorkingTimesType1Impl <em>Working Times Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WorkingTimesType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimesType1()
	 * @generated
	 */
	int WORKING_TIMES_TYPE1 = 45;

	/**
	 * The feature id for the '<em><b>Working Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIMES_TYPE1__WORKING_TIME = 0;

	/**
	 * The number of structural features of the '<em>Working Times Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIMES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WorkingTimeTypeImpl <em>Working Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WorkingTimeTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimeType()
	 * @generated
	 */
	int WORKING_TIME_TYPE = 46;

	/**
	 * The feature id for the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIME_TYPE__FROM_TIME = 0;

	/**
	 * The feature id for the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIME_TYPE__TO_TIME = 1;

	/**
	 * The number of structural features of the '<em>Working Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WorkingTimeType1Impl <em>Working Time Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WorkingTimeType1Impl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimeType1()
	 * @generated
	 */
	int WORKING_TIME_TYPE1 = 47;

	/**
	 * The feature id for the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIME_TYPE1__FROM_TIME = 0;

	/**
	 * The feature id for the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIME_TYPE1__TO_TIME = 1;

	/**
	 * The number of structural features of the '<em>Working Time Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_TIME_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WorkWeeksTypeImpl <em>Work Weeks Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WorkWeeksTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkWeeksType()
	 * @generated
	 */
	int WORK_WEEKS_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Work Week</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEKS_TYPE__WORK_WEEK = 0;

	/**
	 * The number of structural features of the '<em>Work Weeks Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEKS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.impl.WorkWeekTypeImpl <em>Work Week Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.impl.WorkWeekTypeImpl
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkWeekType()
	 * @generated
	 */
	int WORK_WEEK_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEK_TYPE__TIME_PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEK_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Week Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEK_TYPE__WEEK_DAY = 2;

	/**
	 * The number of structural features of the '<em>Work Week Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.AccrueAtType <em>Accrue At Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.AccrueAtType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAccrueAtType()
	 * @generated
	 */
	int ACCRUE_AT_TYPE = 50;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.BaselineForEarnedValueType <em>Baseline For Earned Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.BaselineForEarnedValueType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineForEarnedValueType()
	 * @generated
	 */
	int BASELINE_FOR_EARNED_VALUE_TYPE = 51;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.BookingTypeType <em>Booking Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.BookingTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeType()
	 * @generated
	 */
	int BOOKING_TYPE_TYPE = 52;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.BookingTypeType1 <em>Booking Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.BookingTypeType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeType1()
	 * @generated
	 */
	int BOOKING_TYPE_TYPE1 = 53;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.CalculationTypeType <em>Calculation Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CalculationTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalculationTypeType()
	 * @generated
	 */
	int CALCULATION_TYPE_TYPE = 54;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.CFTypeType <em>CF Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CFTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCFTypeType()
	 * @generated
	 */
	int CF_TYPE_TYPE = 55;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.CommitmentTypeType <em>Commitment Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CommitmentTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCommitmentTypeType()
	 * @generated
	 */
	int COMMITMENT_TYPE_TYPE = 56;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.ConstraintTypeType <em>Constraint Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.ConstraintTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getConstraintTypeType()
	 * @generated
	 */
	int CONSTRAINT_TYPE_TYPE = 57;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.CostRateTableType <em>Cost Rate Table Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CostRateTableType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCostRateTableType()
	 * @generated
	 */
	int COST_RATE_TABLE_TYPE = 58;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.CurrencySymbolPositionType <em>Currency Symbol Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CurrencySymbolPositionType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencySymbolPositionType()
	 * @generated
	 */
	int CURRENCY_SYMBOL_POSITION_TYPE = 59;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DayTypeType <em>Day Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DayTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeType()
	 * @generated
	 */
	int DAY_TYPE_TYPE = 60;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DayTypeType1 <em>Day Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DayTypeType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeType1()
	 * @generated
	 */
	int DAY_TYPE_TYPE1 = 61;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DefaultFixedCostAccrualType <em>Default Fixed Cost Accrual Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DefaultFixedCostAccrualType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultFixedCostAccrualType()
	 * @generated
	 */
	int DEFAULT_FIXED_COST_ACCRUAL_TYPE = 62;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DefaultTaskEVMethodType <em>Default Task EV Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DefaultTaskEVMethodType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskEVMethodType()
	 * @generated
	 */
	int DEFAULT_TASK_EV_METHOD_TYPE = 63;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DefaultTaskTypeType <em>Default Task Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DefaultTaskTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskTypeType()
	 * @generated
	 */
	int DEFAULT_TASK_TYPE_TYPE = 64;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DurationFormatType <em>Duration Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE = 65;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DurationFormatType1 <em>Duration Format Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType1()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE1 = 66;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DurationFormatType2 <em>Duration Format Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType2
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType2()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE2 = 67;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DurationFormatType3 <em>Duration Format Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType3
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType3()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE3 = 68;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DurationFormatType4 <em>Duration Format Type4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType4
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType4()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE4 = 69;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.DurationFormatType5 <em>Duration Format Type5</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType5
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType5()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE5 = 70;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.EarnedValueMethodType <em>Earned Value Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.EarnedValueMethodType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodType()
	 * @generated
	 */
	int EARNED_VALUE_METHOD_TYPE = 71;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.EarnedValueMethodType1 <em>Earned Value Method Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.EarnedValueMethodType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodType1()
	 * @generated
	 */
	int EARNED_VALUE_METHOD_TYPE1 = 72;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.ElemTypeType <em>Elem Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.ElemTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getElemTypeType()
	 * @generated
	 */
	int ELEM_TYPE_TYPE = 73;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.FixedCostAccrualType <em>Fixed Cost Accrual Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.FixedCostAccrualType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFixedCostAccrualType()
	 * @generated
	 */
	int FIXED_COST_ACCRUAL_TYPE = 74;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.FYStartDateType <em>FY Start Date Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.FYStartDateType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFYStartDateType()
	 * @generated
	 */
	int FY_START_DATE_TYPE = 75;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.LagFormatType <em>Lag Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.LagFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLagFormatType()
	 * @generated
	 */
	int LAG_FORMAT_TYPE = 76;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.LevelingDelayFormatType <em>Leveling Delay Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatType()
	 * @generated
	 */
	int LEVELING_DELAY_FORMAT_TYPE = 77;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.LevelingDelayFormatType1 <em>Leveling Delay Format Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatType1()
	 * @generated
	 */
	int LEVELING_DELAY_FORMAT_TYPE1 = 78;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.MonthItemType <em>Month Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.MonthItemType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthItemType()
	 * @generated
	 */
	int MONTH_ITEM_TYPE = 79;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.MonthPositionType <em>Month Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.MonthPositionType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthPositionType()
	 * @generated
	 */
	int MONTH_POSITION_TYPE = 80;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.MonthType <em>Month Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.MonthType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthType()
	 * @generated
	 */
	int MONTH_TYPE = 81;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.NewTaskStartDateType <em>New Task Start Date Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.NewTaskStartDateType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNewTaskStartDateType()
	 * @generated
	 */
	int NEW_TASK_START_DATE_TYPE = 82;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.OvertimeRateFormatType <em>Overtime Rate Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatType()
	 * @generated
	 */
	int OVERTIME_RATE_FORMAT_TYPE = 83;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.OvertimeRateFormatType1 <em>Overtime Rate Format Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatType1()
	 * @generated
	 */
	int OVERTIME_RATE_FORMAT_TYPE1 = 84;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.RateTableType <em>Rate Table Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.RateTableType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRateTableType()
	 * @generated
	 */
	int RATE_TABLE_TYPE = 85;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.RollupTypeType <em>Rollup Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.RollupTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRollupTypeType()
	 * @generated
	 */
	int ROLLUP_TYPE_TYPE = 86;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.StandardRateFormatType <em>Standard Rate Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.StandardRateFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatType()
	 * @generated
	 */
	int STANDARD_RATE_FORMAT_TYPE = 87;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.StandardRateFormatType1 <em>Standard Rate Format Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.StandardRateFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatType1()
	 * @generated
	 */
	int STANDARD_RATE_FORMAT_TYPE1 = 88;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 89;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType1 <em>Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 90;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType2 <em>Type Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType2
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType2()
	 * @generated
	 */
	int TYPE_TYPE2 = 91;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType3 <em>Type Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType3
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType3()
	 * @generated
	 */
	int TYPE_TYPE3 = 92;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType4 <em>Type Type4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType4
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType4()
	 * @generated
	 */
	int TYPE_TYPE4 = 93;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType5 <em>Type Type5</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType5
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType5()
	 * @generated
	 */
	int TYPE_TYPE5 = 94;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType6 <em>Type Type6</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType6
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType6()
	 * @generated
	 */
	int TYPE_TYPE6 = 95;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.TypeType7 <em>Type Type7</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType7
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType7()
	 * @generated
	 */
	int TYPE_TYPE7 = 96;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.UnitType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 97;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.ValuelistSortOrderType <em>Valuelist Sort Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.ValuelistSortOrderType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValuelistSortOrderType()
	 * @generated
	 */
	int VALUELIST_SORT_ORDER_TYPE = 98;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.WeekStartDayType <em>Week Start Day Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WeekStartDayType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekStartDayType()
	 * @generated
	 */
	int WEEK_START_DAY_TYPE = 99;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.WorkContourType <em>Work Contour Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WorkContourType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkContourType()
	 * @generated
	 */
	int WORK_CONTOUR_TYPE = 100;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.WorkFormatType <em>Work Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WorkFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkFormatType()
	 * @generated
	 */
	int WORK_FORMAT_TYPE = 101;

	/**
	 * The meta object id for the '{@link net.certware.planning.mspdi.WorkGroupType <em>Work Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WorkGroupType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkGroupType()
	 * @generated
	 */
	int WORK_GROUP_TYPE = 102;

	/**
	 * The meta object id for the '<em>Accrue At Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.AccrueAtType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAccrueAtTypeObject()
	 * @generated
	 */
	int ACCRUE_AT_TYPE_OBJECT = 103;

	/**
	 * The meta object id for the '<em>Active Directory GUID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getActiveDirectoryGUIDType()
	 * @generated
	 */
	int ACTIVE_DIRECTORY_GUID_TYPE = 104;

	/**
	 * The meta object id for the '<em>Alias Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAliasType()
	 * @generated
	 */
	int ALIAS_TYPE = 105;

	/**
	 * The meta object id for the '<em>Author Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAuthorType()
	 * @generated
	 */
	int AUTHOR_TYPE = 106;

	/**
	 * The meta object id for the '<em>Baseline For Earned Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.BaselineForEarnedValueType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineForEarnedValueTypeObject()
	 * @generated
	 */
	int BASELINE_FOR_EARNED_VALUE_TYPE_OBJECT = 107;

	/**
	 * The meta object id for the '<em>Booking Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.BookingTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeTypeObject()
	 * @generated
	 */
	int BOOKING_TYPE_TYPE_OBJECT = 108;

	/**
	 * The meta object id for the '<em>Booking Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.BookingTypeType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeTypeObject1()
	 * @generated
	 */
	int BOOKING_TYPE_TYPE_OBJECT1 = 109;

	/**
	 * The meta object id for the '<em>Calculation Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CalculationTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalculationTypeTypeObject()
	 * @generated
	 */
	int CALCULATION_TYPE_TYPE_OBJECT = 110;

	/**
	 * The meta object id for the '<em>Category Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 111;

	/**
	 * The meta object id for the '<em>CF Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CFTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCFTypeTypeObject()
	 * @generated
	 */
	int CF_TYPE_TYPE_OBJECT = 112;

	/**
	 * The meta object id for the '<em>Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCodeType()
	 * @generated
	 */
	int CODE_TYPE = 113;

	/**
	 * The meta object id for the '<em>Commitment Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CommitmentTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCommitmentTypeTypeObject()
	 * @generated
	 */
	int COMMITMENT_TYPE_TYPE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Company Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCompanyType()
	 * @generated
	 */
	int COMPANY_TYPE = 115;

	/**
	 * The meta object id for the '<em>Constraint Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.ConstraintTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getConstraintTypeTypeObject()
	 * @generated
	 */
	int CONSTRAINT_TYPE_TYPE_OBJECT = 116;

	/**
	 * The meta object id for the '<em>Contact Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getContactType()
	 * @generated
	 */
	int CONTACT_TYPE = 117;

	/**
	 * The meta object id for the '<em>Cost Rate Table Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CostRateTableType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCostRateTableTypeObject()
	 * @generated
	 */
	int COST_RATE_TABLE_TYPE_OBJECT = 118;

	/**
	 * The meta object id for the '<em>Currency Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencyCodeType()
	 * @generated
	 */
	int CURRENCY_CODE_TYPE = 119;

	/**
	 * The meta object id for the '<em>Currency Symbol Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.CurrencySymbolPositionType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencySymbolPositionTypeObject()
	 * @generated
	 */
	int CURRENCY_SYMBOL_POSITION_TYPE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Currency Symbol Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencySymbolType()
	 * @generated
	 */
	int CURRENCY_SYMBOL_TYPE = 121;

	/**
	 * The meta object id for the '<em>Day Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DayTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeTypeObject()
	 * @generated
	 */
	int DAY_TYPE_TYPE_OBJECT = 122;

	/**
	 * The meta object id for the '<em>Day Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DayTypeType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeTypeObject1()
	 * @generated
	 */
	int DAY_TYPE_TYPE_OBJECT1 = 123;

	/**
	 * The meta object id for the '<em>Default Fixed Cost Accrual Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DefaultFixedCostAccrualType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultFixedCostAccrualTypeObject()
	 * @generated
	 */
	int DEFAULT_FIXED_COST_ACCRUAL_TYPE_OBJECT = 124;

	/**
	 * The meta object id for the '<em>Default Task EV Method Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DefaultTaskEVMethodType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskEVMethodTypeObject()
	 * @generated
	 */
	int DEFAULT_TASK_EV_METHOD_TYPE_OBJECT = 125;

	/**
	 * The meta object id for the '<em>Default Task Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DefaultTaskTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskTypeTypeObject()
	 * @generated
	 */
	int DEFAULT_TASK_TYPE_TYPE_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Duration Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType4
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE_OBJECT = 127;

	/**
	 * The meta object id for the '<em>Duration Format Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject1()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE_OBJECT1 = 128;

	/**
	 * The meta object id for the '<em>Duration Format Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType2
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject2()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE_OBJECT2 = 129;

	/**
	 * The meta object id for the '<em>Duration Format Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType3
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject3()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE_OBJECT3 = 130;

	/**
	 * The meta object id for the '<em>Duration Format Type Object4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject4()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE_OBJECT4 = 131;

	/**
	 * The meta object id for the '<em>Duration Format Type Object5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.DurationFormatType5
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject5()
	 * @generated
	 */
	int DURATION_FORMAT_TYPE_OBJECT5 = 132;

	/**
	 * The meta object id for the '<em>Earned Value Method Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.EarnedValueMethodType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodTypeObject()
	 * @generated
	 */
	int EARNED_VALUE_METHOD_TYPE_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Earned Value Method Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.EarnedValueMethodType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodTypeObject1()
	 * @generated
	 */
	int EARNED_VALUE_METHOD_TYPE_OBJECT1 = 134;

	/**
	 * The meta object id for the '<em>Elem Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.ElemTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getElemTypeTypeObject()
	 * @generated
	 */
	int ELEM_TYPE_TYPE_OBJECT = 135;

	/**
	 * The meta object id for the '<em>Email Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEmailAddressType()
	 * @generated
	 */
	int EMAIL_ADDRESS_TYPE = 136;

	/**
	 * The meta object id for the '<em>External Task Project Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExternalTaskProjectType()
	 * @generated
	 */
	int EXTERNAL_TASK_PROJECT_TYPE = 137;

	/**
	 * The meta object id for the '<em>Fixed Cost Accrual Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.FixedCostAccrualType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFixedCostAccrualTypeObject()
	 * @generated
	 */
	int FIXED_COST_ACCRUAL_TYPE_OBJECT = 138;

	/**
	 * The meta object id for the '<em>FY Start Date Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.FYStartDateType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFYStartDateTypeObject()
	 * @generated
	 */
	int FY_START_DATE_TYPE_OBJECT = 139;

	/**
	 * The meta object id for the '<em>Group Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 140;

	/**
	 * The meta object id for the '<em>Hyperlink Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkAddressType()
	 * @generated
	 */
	int HYPERLINK_ADDRESS_TYPE = 141;

	/**
	 * The meta object id for the '<em>Hyperlink Address Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkAddressType1()
	 * @generated
	 */
	int HYPERLINK_ADDRESS_TYPE1 = 142;

	/**
	 * The meta object id for the '<em>Hyperlink Address Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkAddressType2()
	 * @generated
	 */
	int HYPERLINK_ADDRESS_TYPE2 = 143;

	/**
	 * The meta object id for the '<em>Hyperlink Sub Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkSubAddressType()
	 * @generated
	 */
	int HYPERLINK_SUB_ADDRESS_TYPE = 144;

	/**
	 * The meta object id for the '<em>Hyperlink Sub Address Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkSubAddressType1()
	 * @generated
	 */
	int HYPERLINK_SUB_ADDRESS_TYPE1 = 145;

	/**
	 * The meta object id for the '<em>Hyperlink Sub Address Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkSubAddressType2()
	 * @generated
	 */
	int HYPERLINK_SUB_ADDRESS_TYPE2 = 146;

	/**
	 * The meta object id for the '<em>Hyperlink Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkType()
	 * @generated
	 */
	int HYPERLINK_TYPE = 147;

	/**
	 * The meta object id for the '<em>Hyperlink Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkType1()
	 * @generated
	 */
	int HYPERLINK_TYPE1 = 148;

	/**
	 * The meta object id for the '<em>Hyperlink Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkType2()
	 * @generated
	 */
	int HYPERLINK_TYPE2 = 149;

	/**
	 * The meta object id for the '<em>Initials Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getInitialsType()
	 * @generated
	 */
	int INITIALS_TYPE = 150;

	/**
	 * The meta object id for the '<em>Lag Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.LagFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLagFormatTypeObject()
	 * @generated
	 */
	int LAG_FORMAT_TYPE_OBJECT = 151;

	/**
	 * The meta object id for the '<em>Leveling Delay Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatTypeObject()
	 * @generated
	 */
	int LEVELING_DELAY_FORMAT_TYPE_OBJECT = 152;

	/**
	 * The meta object id for the '<em>Leveling Delay Format Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatTypeObject1()
	 * @generated
	 */
	int LEVELING_DELAY_FORMAT_TYPE_OBJECT1 = 153;

	/**
	 * The meta object id for the '<em>Manager Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getManagerType()
	 * @generated
	 */
	int MANAGER_TYPE = 154;

	/**
	 * The meta object id for the '<em>Material Label Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMaterialLabelType()
	 * @generated
	 */
	int MATERIAL_LABEL_TYPE = 155;

	/**
	 * The meta object id for the '<em>Month Item Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.MonthItemType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthItemTypeObject()
	 * @generated
	 */
	int MONTH_ITEM_TYPE_OBJECT = 156;

	/**
	 * The meta object id for the '<em>Month Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.MonthPositionType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthPositionTypeObject()
	 * @generated
	 */
	int MONTH_POSITION_TYPE_OBJECT = 157;

	/**
	 * The meta object id for the '<em>Month Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.MonthType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthTypeObject()
	 * @generated
	 */
	int MONTH_TYPE_OBJECT = 158;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 159;

	/**
	 * The meta object id for the '<em>Name Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType1()
	 * @generated
	 */
	int NAME_TYPE1 = 160;

	/**
	 * The meta object id for the '<em>Name Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType2()
	 * @generated
	 */
	int NAME_TYPE2 = 161;

	/**
	 * The meta object id for the '<em>Name Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType3()
	 * @generated
	 */
	int NAME_TYPE3 = 162;

	/**
	 * The meta object id for the '<em>Name Type4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType4()
	 * @generated
	 */
	int NAME_TYPE4 = 163;

	/**
	 * The meta object id for the '<em>Name Type5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType5()
	 * @generated
	 */
	int NAME_TYPE5 = 164;

	/**
	 * The meta object id for the '<em>New Task Start Date Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.NewTaskStartDateType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNewTaskStartDateTypeObject()
	 * @generated
	 */
	int NEW_TASK_START_DATE_TYPE_OBJECT = 165;

	/**
	 * The meta object id for the '<em>NT Account Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNTAccountType()
	 * @generated
	 */
	int NT_ACCOUNT_TYPE = 166;

	/**
	 * The meta object id for the '<em>Outline Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineNumberType()
	 * @generated
	 */
	int OUTLINE_NUMBER_TYPE = 167;

	/**
	 * The meta object id for the '<em>Overtime Rate Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatTypeObject()
	 * @generated
	 */
	int OVERTIME_RATE_FORMAT_TYPE_OBJECT = 168;

	/**
	 * The meta object id for the '<em>Overtime Rate Format Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatTypeObject1()
	 * @generated
	 */
	int OVERTIME_RATE_FORMAT_TYPE_OBJECT1 = 169;

	/**
	 * The meta object id for the '<em>Phonetic Alias Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPhoneticAliasType()
	 * @generated
	 */
	int PHONETIC_ALIAS_TYPE = 170;

	/**
	 * The meta object id for the '<em>Phonetics Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPhoneticsType()
	 * @generated
	 */
	int PHONETICS_TYPE = 171;

	/**
	 * The meta object id for the '<em>Prefix Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPrefixType()
	 * @generated
	 */
	int PREFIX_TYPE = 172;

	/**
	 * The meta object id for the '<em>Rate Table Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.RateTableType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRateTableTypeObject()
	 * @generated
	 */
	int RATE_TABLE_TYPE_OBJECT = 173;

	/**
	 * The meta object id for the '<em>Rollup Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.RollupTypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRollupTypeTypeObject()
	 * @generated
	 */
	int ROLLUP_TYPE_TYPE_OBJECT = 174;

	/**
	 * The meta object id for the '<em>Standard Rate Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.StandardRateFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatTypeObject()
	 * @generated
	 */
	int STANDARD_RATE_FORMAT_TYPE_OBJECT = 175;

	/**
	 * The meta object id for the '<em>Standard Rate Format Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.StandardRateFormatType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatTypeObject1()
	 * @generated
	 */
	int STANDARD_RATE_FORMAT_TYPE_OBJECT1 = 176;

	/**
	 * The meta object id for the '<em>Subject Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getSubjectType()
	 * @generated
	 */
	int SUBJECT_TYPE = 177;

	/**
	 * The meta object id for the '<em>Subproject Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getSubprojectNameType()
	 * @generated
	 */
	int SUBPROJECT_NAME_TYPE = 178;

	/**
	 * The meta object id for the '<em>Title Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 179;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType3
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 180;

	/**
	 * The meta object id for the '<em>Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType5
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject1()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT1 = 181;

	/**
	 * The meta object id for the '<em>Type Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject2()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT2 = 182;

	/**
	 * The meta object id for the '<em>Type Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType1
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject3()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT3 = 183;

	/**
	 * The meta object id for the '<em>Type Type Object4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType2
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject4()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT4 = 184;

	/**
	 * The meta object id for the '<em>Type Type Object5</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType4
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject5()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT5 = 185;

	/**
	 * The meta object id for the '<em>Type Type Object6</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType6
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject6()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT6 = 186;

	/**
	 * The meta object id for the '<em>Type Type Object7</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.TypeType7
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject7()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT7 = 187;

	/**
	 * The meta object id for the '<em>UID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getUIDType()
	 * @generated
	 */
	int UID_TYPE = 188;

	/**
	 * The meta object id for the '<em>Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.UnitType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getUnitTypeObject()
	 * @generated
	 */
	int UNIT_TYPE_OBJECT = 189;

	/**
	 * The meta object id for the '<em>Valuelist Sort Order Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.ValuelistSortOrderType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValuelistSortOrderTypeObject()
	 * @generated
	 */
	int VALUELIST_SORT_ORDER_TYPE_OBJECT = 190;

	/**
	 * The meta object id for the '<em>Week Start Day Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WeekStartDayType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekStartDayTypeObject()
	 * @generated
	 */
	int WEEK_START_DAY_TYPE_OBJECT = 191;

	/**
	 * The meta object id for the '<em>Work Contour Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WorkContourType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkContourTypeObject()
	 * @generated
	 */
	int WORK_CONTOUR_TYPE_OBJECT = 192;

	/**
	 * The meta object id for the '<em>Work Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WorkFormatType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkFormatTypeObject()
	 * @generated
	 */
	int WORK_FORMAT_TYPE_OBJECT = 193;

	/**
	 * The meta object id for the '<em>Work Group Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.planning.mspdi.WorkGroupType
	 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkGroupTypeObject()
	 * @generated
	 */
	int WORK_GROUP_TYPE_OBJECT = 194;


	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.AssignmentsType <em>Assignments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignments Type</em>'.
	 * @see net.certware.planning.mspdi.AssignmentsType
	 * @generated
	 */
	EClass getAssignmentsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.AssignmentsType#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see net.certware.planning.mspdi.AssignmentsType#getAssignment()
	 * @see #getAssignmentsType()
	 * @generated
	 */
	EReference getAssignmentsType_Assignment();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.AssignmentType <em>Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Type</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType
	 * @generated
	 */
	EClass getAssignmentType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getUID()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_UID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getTaskUID <em>Task UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task UID</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getTaskUID()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_TaskUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getResourceUID <em>Resource UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource UID</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getResourceUID()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ResourceUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getPercentWorkComplete <em>Percent Work Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Work Complete</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getPercentWorkComplete()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_PercentWorkComplete();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualCost()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualFinish <em>Actual Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Finish</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualFinish()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualFinish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeCost <em>Actual Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualOvertimeCost()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualOvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeWork <em>Actual Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualOvertimeWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualOvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualStart <em>Actual Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Start</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualStart()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualWork <em>Actual Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getACWP <em>ACWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACWP</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getACWP()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ACWP();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isConfirmed <em>Confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmed</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isConfirmed()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Confirmed();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getCost()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getCostRateTable <em>Cost Rate Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Rate Table</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getCostRateTable()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_CostRateTable();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getCostVariance <em>Cost Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Variance</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getCostVariance()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_CostVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getCV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CV</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getCV()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_CV();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getDelay()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Delay();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getFinish()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getFinishVariance <em>Finish Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Variance</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getFinishVariance()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_FinishVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getHyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getHyperlink()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Hyperlink();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getHyperlinkAddress <em>Hyperlink Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Address</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getHyperlinkAddress()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_HyperlinkAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Sub Address</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getHyperlinkSubAddress()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_HyperlinkSubAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getWorkVariance <em>Work Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Variance</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getWorkVariance()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_WorkVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isHasFixedRateUnits <em>Has Fixed Rate Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Fixed Rate Units</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isHasFixedRateUnits()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_HasFixedRateUnits();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isFixedMaterial <em>Fixed Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Material</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isFixedMaterial()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_FixedMaterial();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelay <em>Leveling Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leveling Delay</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getLevelingDelay()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_LevelingDelay();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelayFormat <em>Leveling Delay Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leveling Delay Format</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getLevelingDelayFormat()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_LevelingDelayFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isLinkedFields <em>Linked Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked Fields</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isLinkedFields()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_LinkedFields();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milestone</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isMilestone()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Milestone();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getNotes()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Notes();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isOverallocated <em>Overallocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overallocated</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isOverallocated()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Overallocated();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getOvertimeCost <em>Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getOvertimeCost()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_OvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getOvertimeWork <em>Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getOvertimeWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_OvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getPeakUnits <em>Peak Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Units</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getPeakUnits()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_PeakUnits();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getRegularWork <em>Regular Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regular Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getRegularWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_RegularWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getRemainingCost <em>Remaining Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Cost</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getRemainingCost()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_RemainingCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeCost()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_RemainingOvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_RemainingOvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getRemainingWork <em>Remaining Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getRemainingWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_RemainingWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isResponsePending <em>Response Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Pending</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isResponsePending()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ResponsePending();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getStart()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getStop()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Stop();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getResume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getResume()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Resume();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getStartVariance <em>Start Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Variance</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getStartVariance()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_StartVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isSummary()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Summary();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getSV()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_SV();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getUnits()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Units();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#isUpdateNeeded <em>Update Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Needed</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#isUpdateNeeded()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_UpdateNeeded();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getVAC <em>VAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VAC</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getVAC()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_VAC();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_Work();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getWorkContour <em>Work Contour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Contour</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getWorkContour()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_WorkContour();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getBCWS <em>BCWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWS</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getBCWS()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_BCWS();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getBCWP <em>BCWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWP</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getBCWP()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_BCWP();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getBookingType <em>Booking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Type</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getBookingType()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_BookingType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualWorkProtected <em>Actual Work Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Work Protected</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualWorkProtected()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualWorkProtected();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Work Protected</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getActualOvertimeWorkProtected()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_ActualOvertimeWorkProtected();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getCreationDate()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getAssnOwner <em>Assn Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assn Owner</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getAssnOwner()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_AssnOwner();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getAssnOwnerGuid <em>Assn Owner Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assn Owner Guid</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getAssnOwnerGuid()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_AssnOwnerGuid();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getBudgetCost <em>Budget Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Cost</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getBudgetCost()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_BudgetCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AssignmentType#getBudgetWork <em>Budget Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Work</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getBudgetWork()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EAttribute getAssignmentType_BudgetWork();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.AssignmentType#getExtendedAttribute <em>Extended Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Attribute</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getExtendedAttribute()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_ExtendedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.AssignmentType#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baseline</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getBaseline()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_Baseline();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404000 <em>F404000</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404000</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404000()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404000();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404001 <em>F404001</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404001</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404001()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404001();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404002 <em>F404002</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404002</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404002()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404002();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404003 <em>F404003</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404003</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404003()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404003();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404004 <em>F404004</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404004</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404004()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404004();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404005 <em>F404005</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404005</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404005()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404005();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404006 <em>F404006</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404006</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404006()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404006();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404007 <em>F404007</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404007</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404007()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404007();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404008 <em>F404008</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404008</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404008()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404008();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404009 <em>F404009</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404009</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404009()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404009();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40400a <em>F4040 0a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 0a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40400a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40400a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40400b <em>F4040 0b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 0b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40400b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40400b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40400c <em>F4040 0c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 0c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40400c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40400c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40400d <em>F4040 0d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 0d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40400d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40400d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40400e <em>F4040 0e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 0e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40400e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40400e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40400f <em>F4040 0f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 0f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40400f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40400f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404010 <em>F404010</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404010</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404010()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404010();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404011 <em>F404011</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404011</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404011()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404011();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404012 <em>F404012</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404012</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404012()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404012();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404013 <em>F404013</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404013</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404013()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404013();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404014 <em>F404014</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404014</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404014()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404014();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404015 <em>F404015</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404015</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404015()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404015();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404016 <em>F404016</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404016</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404016()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404016();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404017 <em>F404017</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404017</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404017()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404017();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404018 <em>F404018</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404018</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404018()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404018();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404019 <em>F404019</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404019</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404019()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404019();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40401a <em>F4040 1a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 1a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40401a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40401a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40401b <em>F4040 1b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 1b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40401b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40401b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40401c <em>F4040 1c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 1c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40401c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40401c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40401d <em>F4040 1d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 1d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40401d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40401d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40401e <em>F4040 1e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 1e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40401e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40401e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40401f <em>F4040 1f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 1f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40401f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40401f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404020 <em>F404020</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404020</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404020()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404020();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404021 <em>F404021</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404021</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404021()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404021();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404022 <em>F404022</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404022</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404022()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404022();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404023 <em>F404023</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404023</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404023()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404023();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404024 <em>F404024</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404024</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404024()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404024();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404025 <em>F404025</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404025</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404025()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404025();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404026 <em>F404026</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404026</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404026()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404026();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404027 <em>F404027</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404027</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404027()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404027();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404028 <em>F404028</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404028</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404028()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404028();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404029 <em>F404029</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404029</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404029()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404029();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40402a <em>F4040 2a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 2a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40402a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40402a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40402b <em>F4040 2b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 2b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40402b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40402b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40402c <em>F4040 2c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 2c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40402c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40402c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40402d <em>F4040 2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 2d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40402d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40402d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40402e <em>F4040 2e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 2e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40402e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40402e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40402f <em>F4040 2f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 2f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40402f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40402f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404030 <em>F404030</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404030</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404030()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404030();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404031 <em>F404031</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404031</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404031()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404031();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404032 <em>F404032</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404032</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404032()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404032();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404033 <em>F404033</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404033</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404033()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404033();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404034 <em>F404034</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404034</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404034()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404034();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404035 <em>F404035</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404035</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404035()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404035();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404036 <em>F404036</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404036</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404036()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404036();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404037 <em>F404037</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404037</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404037()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404037();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404038 <em>F404038</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404038</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404038()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404038();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404039 <em>F404039</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404039</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404039()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404039();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40403a <em>F4040 3a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 3a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40403a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40403a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40403b <em>F4040 3b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 3b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40403b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40403b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40403c <em>F4040 3c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 3c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40403c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40403c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40403d <em>F4040 3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 3d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40403d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40403d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40403e <em>F4040 3e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 3e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40403e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40403e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40403f <em>F4040 3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 3f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40403f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40403f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404040 <em>F404040</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404040</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404040()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404040();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404041 <em>F404041</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404041</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404041()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404041();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404042 <em>F404042</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404042</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404042()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404042();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404043 <em>F404043</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404043</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404043()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404043();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404044 <em>F404044</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404044</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404044()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404044();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404045 <em>F404045</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404045</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404045()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404045();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404046 <em>F404046</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404046</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404046()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404046();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404047 <em>F404047</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404047</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404047()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404047();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404048 <em>F404048</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404048</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404048()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404048();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404049 <em>F404049</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404049</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404049()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404049();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40404a <em>F4040 4a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 4a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40404a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40404a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40404b <em>F4040 4b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 4b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40404b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40404b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40404c <em>F4040 4c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 4c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40404c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40404c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40404d <em>F4040 4d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 4d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40404d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40404d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40404e <em>F4040 4e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 4e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40404e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40404e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40404f <em>F4040 4f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 4f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40404f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40404f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404050 <em>F404050</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404050</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404050()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404050();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404051 <em>F404051</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404051</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404051()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404051();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404052 <em>F404052</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404052</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404052()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404052();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404053 <em>F404053</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404053</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404053()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404053();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404054 <em>F404054</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404054</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404054()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404054();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404055 <em>F404055</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404055</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404055()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404055();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404056 <em>F404056</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404056</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404056()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404056();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404057 <em>F404057</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404057</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404057()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404057();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404058 <em>F404058</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404058</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404058()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404058();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404059 <em>F404059</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404059</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404059()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404059();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40405a <em>F4040 5a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 5a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40405a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40405a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40405b <em>F4040 5b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 5b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40405b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40405b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40405c <em>F4040 5c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 5c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40405c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40405c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40405d <em>F4040 5d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 5d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40405d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40405d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40405e <em>F4040 5e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 5e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40405e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40405e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40405f <em>F4040 5f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 5f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40405f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40405f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404060 <em>F404060</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404060</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404060()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404060();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404061 <em>F404061</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404061</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404061()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404061();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404062 <em>F404062</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404062</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404062()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404062();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404063 <em>F404063</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404063</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404063()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404063();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404064 <em>F404064</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404064</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404064()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404064();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404065 <em>F404065</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404065</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404065()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404065();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404066 <em>F404066</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404066</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404066()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404066();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404067 <em>F404067</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404067</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404067()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404067();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404068 <em>F404068</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404068</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404068()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404068();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404069 <em>F404069</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404069</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404069()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404069();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40406a <em>F4040 6a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 6a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40406a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40406a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40406b <em>F4040 6b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 6b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40406b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40406b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40406c <em>F4040 6c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 6c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40406c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40406c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40406d <em>F4040 6d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 6d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40406d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40406d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40406e <em>F4040 6e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 6e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40406e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40406e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40406f <em>F4040 6f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 6f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40406f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40406f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404070 <em>F404070</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404070</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404070()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404070();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404071 <em>F404071</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404071</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404071()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404071();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404072 <em>F404072</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404072</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404072()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404072();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404073 <em>F404073</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404073</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404073()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404073();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404074 <em>F404074</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404074</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404074()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404074();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404075 <em>F404075</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404075</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404075()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404075();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404076 <em>F404076</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404076</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404076()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404076();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404077 <em>F404077</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404077</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404077()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404077();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404078 <em>F404078</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404078</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404078()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404078();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404079 <em>F404079</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404079</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404079()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404079();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40407a <em>F4040 7a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 7a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40407a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40407a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40407b <em>F4040 7b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 7b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40407b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40407b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40407c <em>F4040 7c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 7c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40407c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40407c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40407d <em>F4040 7d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 7d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40407d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40407d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40407e <em>F4040 7e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 7e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40407e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40407e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40407f <em>F4040 7f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 7f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40407f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40407f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404080 <em>F404080</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404080</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404080()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404080();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404081 <em>F404081</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404081</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404081()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404081();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404082 <em>F404082</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404082</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404082()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404082();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404083 <em>F404083</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404083</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404083()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404083();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404084 <em>F404084</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404084</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404084()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404084();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404085 <em>F404085</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404085</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404085()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404085();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404086 <em>F404086</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404086</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404086()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404086();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404087 <em>F404087</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404087</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404087()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404087();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404088 <em>F404088</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404088</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404088()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404088();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404089 <em>F404089</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404089</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404089()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404089();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40408a <em>F4040 8a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 8a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40408a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40408a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40408b <em>F4040 8b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 8b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40408b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40408b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40408c <em>F4040 8c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 8c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40408c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40408c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40408d <em>F4040 8d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 8d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40408d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40408d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40408e <em>F4040 8e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 8e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40408e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40408e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40408f <em>F4040 8f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 8f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40408f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40408f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404090 <em>F404090</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404090</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404090()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404090();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404091 <em>F404091</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404091</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404091()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404091();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404092 <em>F404092</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404092</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404092()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404092();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404093 <em>F404093</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404093</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404093()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404093();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404094 <em>F404094</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404094</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404094()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404094();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404095 <em>F404095</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404095</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404095()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404095();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404096 <em>F404096</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404096</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404096()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404096();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404097 <em>F404097</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404097</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404097()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404097();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404098 <em>F404098</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404098</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404098()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404098();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF404099 <em>F404099</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404099</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF404099()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F404099();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40409a <em>F4040 9a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 9a</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40409a()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40409a();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40409b <em>F4040 9b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 9b</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40409b()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40409b();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40409c <em>F4040 9c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 9c</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40409c()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40409c();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40409d <em>F4040 9d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 9d</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40409d()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40409d();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40409e <em>F4040 9e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 9e</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40409e()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40409e();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF40409f <em>F4040 9f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F4040 9f</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF40409f()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F40409f();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a0 <em>F404 0a0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a0</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a0()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a0();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a1 <em>F404 0a1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a1</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a1()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a1();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a2 <em>F404 0a2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a2</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a2()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a2();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a3 <em>F404 0a3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a3</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a3()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a3();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a4 <em>F404 0a4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a4</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a4()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a4();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a5 <em>F404 0a5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a5</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a5()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a5();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a6 <em>F404 0a6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a6</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a6()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a6();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a7 <em>F404 0a7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a7</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a7()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a7();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a8 <em>F404 0a8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a8</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a8()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a8();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040a9 <em>F404 0a9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0a9</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040a9()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040a9();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040aa <em>F404 0aa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0aa</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040aa()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040aa();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040ab <em>F404 0ab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0ab</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040ab()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040ab();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040ac <em>F404 0ac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0ac</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040ac()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040ac();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040ad <em>F404 0ad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0ad</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040ad()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040ad();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040ae <em>F404 0ae</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0ae</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040ae()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040ae();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040af <em>F404 0af</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0af</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040af()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040af();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b0 <em>F404 0b0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b0</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b0()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b0();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b1 <em>F404 0b1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b1</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b1()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b1();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b2 <em>F404 0b2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b2</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b2()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b2();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b3 <em>F404 0b3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b3</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b3()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b3();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b4 <em>F404 0b4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b4</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b4()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b4();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b5 <em>F404 0b5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b5</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b5()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b5();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b6 <em>F404 0b6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b6</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b6()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b6();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b7 <em>F404 0b7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b7</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b7()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b7();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b8 <em>F404 0b8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b8</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b8()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b8();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040b9 <em>F404 0b9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0b9</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040b9()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040b9();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040ba <em>F404 0ba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0ba</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040ba()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040ba();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040bb <em>F404 0bb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0bb</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040bb()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040bb();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040bc <em>F404 0bc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0bc</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040bc()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040bc();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040bd <em>F404 0bd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0bd</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040bd()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040bd();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040be <em>F404 0be</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0be</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040be()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040be();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040bf <em>F404 0bf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0bf</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040bf()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040bf();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c0 <em>F404 0c0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c0</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c0()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c0();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c1 <em>F404 0c1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c1</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c1()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c1();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c2 <em>F404 0c2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c2</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c2()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c2();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c3 <em>F404 0c3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c3</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c3()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c3();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c4 <em>F404 0c4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c4</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c4()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c4();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c5 <em>F404 0c5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c5</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c5()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c5();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c6 <em>F404 0c6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c6</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c6()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c6();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c7 <em>F404 0c7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c7</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c7()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c7();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.AssignmentType#getF4040c8 <em>F404 0c8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>F404 0c8</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getF4040c8()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_F4040c8();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.AssignmentType#getTimephasedData <em>Timephased Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timephased Data</em>'.
	 * @see net.certware.planning.mspdi.AssignmentType#getTimephasedData()
	 * @see #getAssignmentType()
	 * @generated
	 */
	EReference getAssignmentType_TimephasedData();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.AvailabilityPeriodsType <em>Availability Periods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability Periods Type</em>'.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodsType
	 * @generated
	 */
	EClass getAvailabilityPeriodsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.AvailabilityPeriodsType#getAvailabilityPeriod <em>Availability Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availability Period</em>'.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodsType#getAvailabilityPeriod()
	 * @see #getAvailabilityPeriodsType()
	 * @generated
	 */
	EReference getAvailabilityPeriodsType_AvailabilityPeriod();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.AvailabilityPeriodType <em>Availability Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability Period Type</em>'.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodType
	 * @generated
	 */
	EClass getAvailabilityPeriodType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableFrom <em>Available From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available From</em>'.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableFrom()
	 * @see #getAvailabilityPeriodType()
	 * @generated
	 */
	EAttribute getAvailabilityPeriodType_AvailableFrom();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableTo <em>Available To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available To</em>'.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableTo()
	 * @see #getAvailabilityPeriodType()
	 * @generated
	 */
	EAttribute getAvailabilityPeriodType_AvailableTo();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableUnits <em>Available Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Units</em>'.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableUnits()
	 * @see #getAvailabilityPeriodType()
	 * @generated
	 */
	EAttribute getAvailabilityPeriodType_AvailableUnits();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.BaselineType <em>Baseline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baseline Type</em>'.
	 * @see net.certware.planning.mspdi.BaselineType
	 * @generated
	 */
	EClass getBaselineType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.BaselineType#getTimephasedData <em>Timephased Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timephased Data</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getTimephasedData()
	 * @see #getBaselineType()
	 * @generated
	 */
	EReference getBaselineType_TimephasedData();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getNumber()
	 * @see #getBaselineType()
	 * @generated
	 */
	EAttribute getBaselineType_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getStart()
	 * @see #getBaselineType()
	 * @generated
	 */
	EAttribute getBaselineType_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getFinish()
	 * @see #getBaselineType()
	 * @generated
	 */
	EAttribute getBaselineType_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getWork()
	 * @see #getBaselineType()
	 * @generated
	 */
	EAttribute getBaselineType_Work();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getCost()
	 * @see #getBaselineType()
	 * @generated
	 */
	EAttribute getBaselineType_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType#getBCWS <em>BCWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWS</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getBCWS()
	 * @see #getBaselineType()
	 * @generated
	 */
	EAttribute getBaselineType_BCWS();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType#getBCWP <em>BCWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWP</em>'.
	 * @see net.certware.planning.mspdi.BaselineType#getBCWP()
	 * @see #getBaselineType()
	 * @generated
	 */
	EAttribute getBaselineType_BCWP();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.BaselineType1 <em>Baseline Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baseline Type1</em>'.
	 * @see net.certware.planning.mspdi.BaselineType1
	 * @generated
	 */
	EClass getBaselineType1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType1#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.certware.planning.mspdi.BaselineType1#getNumber()
	 * @see #getBaselineType1()
	 * @generated
	 */
	EAttribute getBaselineType1_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType1#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work</em>'.
	 * @see net.certware.planning.mspdi.BaselineType1#getWork()
	 * @see #getBaselineType1()
	 * @generated
	 */
	EAttribute getBaselineType1_Work();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType1#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.certware.planning.mspdi.BaselineType1#getCost()
	 * @see #getBaselineType1()
	 * @generated
	 */
	EAttribute getBaselineType1_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType1#getBCWS <em>BCWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWS</em>'.
	 * @see net.certware.planning.mspdi.BaselineType1#getBCWS()
	 * @see #getBaselineType1()
	 * @generated
	 */
	EAttribute getBaselineType1_BCWS();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType1#getBCWP <em>BCWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWP</em>'.
	 * @see net.certware.planning.mspdi.BaselineType1#getBCWP()
	 * @see #getBaselineType1()
	 * @generated
	 */
	EAttribute getBaselineType1_BCWP();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.BaselineType2 <em>Baseline Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baseline Type2</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2
	 * @generated
	 */
	EClass getBaselineType2();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.BaselineType2#getTimephasedData <em>Timephased Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timephased Data</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getTimephasedData()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EReference getBaselineType2_TimephasedData();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getNumber()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#isInterim <em>Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interim</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#isInterim()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_Interim();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getStart()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getFinish()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getDuration()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getDurationFormat <em>Duration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Format</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getDurationFormat()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_DurationFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#isEstimatedDuration <em>Estimated Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Duration</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#isEstimatedDuration()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_EstimatedDuration();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getWork()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_Work();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getCost()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getBCWS <em>BCWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWS</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getBCWS()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_BCWS();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getBCWP <em>BCWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWP</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getBCWP()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_BCWP();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.BaselineType2#getFixedCost <em>Fixed Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Cost</em>'.
	 * @see net.certware.planning.mspdi.BaselineType2#getFixedCost()
	 * @see #getBaselineType2()
	 * @generated
	 */
	EAttribute getBaselineType2_FixedCost();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.CalendarsType <em>Calendars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendars Type</em>'.
	 * @see net.certware.planning.mspdi.CalendarsType
	 * @generated
	 */
	EClass getCalendarsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.CalendarsType#getCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendar</em>'.
	 * @see net.certware.planning.mspdi.CalendarsType#getCalendar()
	 * @see #getCalendarsType()
	 * @generated
	 */
	EReference getCalendarsType_Calendar();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.CalendarType <em>Calendar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Type</em>'.
	 * @see net.certware.planning.mspdi.CalendarType
	 * @generated
	 */
	EClass getCalendarType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.CalendarType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see net.certware.planning.mspdi.CalendarType#getUID()
	 * @see #getCalendarType()
	 * @generated
	 */
	EAttribute getCalendarType_UID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.CalendarType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.planning.mspdi.CalendarType#getName()
	 * @see #getCalendarType()
	 * @generated
	 */
	EAttribute getCalendarType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.CalendarType#isIsBaseCalendar <em>Is Base Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Calendar</em>'.
	 * @see net.certware.planning.mspdi.CalendarType#isIsBaseCalendar()
	 * @see #getCalendarType()
	 * @generated
	 */
	EAttribute getCalendarType_IsBaseCalendar();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.CalendarType#getBaseCalendarUID <em>Base Calendar UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Calendar UID</em>'.
	 * @see net.certware.planning.mspdi.CalendarType#getBaseCalendarUID()
	 * @see #getCalendarType()
	 * @generated
	 */
	EAttribute getCalendarType_BaseCalendarUID();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.CalendarType#getWeekDays <em>Week Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Week Days</em>'.
	 * @see net.certware.planning.mspdi.CalendarType#getWeekDays()
	 * @see #getCalendarType()
	 * @generated
	 */
	EReference getCalendarType_WeekDays();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.CalendarType#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exceptions</em>'.
	 * @see net.certware.planning.mspdi.CalendarType#getExceptions()
	 * @see #getCalendarType()
	 * @generated
	 */
	EReference getCalendarType_Exceptions();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.CalendarType#getWorkWeeks <em>Work Weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Work Weeks</em>'.
	 * @see net.certware.planning.mspdi.CalendarType#getWorkWeeks()
	 * @see #getCalendarType()
	 * @generated
	 */
	EReference getCalendarType_WorkWeeks();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.certware.planning.mspdi.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.planning.mspdi.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.certware.planning.mspdi.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.certware.planning.mspdi.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.certware.planning.mspdi.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.certware.planning.mspdi.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.certware.planning.mspdi.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.DocumentRoot#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see net.certware.planning.mspdi.DocumentRoot#getProject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Project();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ExceptionsType <em>Exceptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exceptions Type</em>'.
	 * @see net.certware.planning.mspdi.ExceptionsType
	 * @generated
	 */
	EClass getExceptionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ExceptionsType#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception</em>'.
	 * @see net.certware.planning.mspdi.ExceptionsType#getException()
	 * @see #getExceptionsType()
	 * @generated
	 */
	EReference getExceptionsType_Exception();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#isEnteredByOccurrences <em>Entered By Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entered By Occurrences</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#isEnteredByOccurrences()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_EnteredByOccurrences();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ExceptionType#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Period</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getTimePeriod()
	 * @see #getExceptionType()
	 * @generated
	 */
	EReference getExceptionType_TimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrences</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getOccurrences()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Occurrences();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getName()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getType()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getPeriod()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Period();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getDaysOfWeek <em>Days Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days Of Week</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getDaysOfWeek()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_DaysOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getMonthItem <em>Month Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month Item</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getMonthItem()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_MonthItem();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getMonthPosition <em>Month Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month Position</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getMonthPosition()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_MonthPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getMonth()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Month();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#getMonthDay <em>Month Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month Day</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getMonthDay()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_MonthDay();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExceptionType#isDayWorking <em>Day Working</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Working</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#isDayWorking()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_DayWorking();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ExceptionType#getWorkingTimes <em>Working Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Times</em>'.
	 * @see net.certware.planning.mspdi.ExceptionType#getWorkingTimes()
	 * @see #getExceptionType()
	 * @generated
	 */
	EReference getExceptionType_WorkingTimes();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ExtendedAttributesType <em>Extended Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Attributes Type</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributesType
	 * @generated
	 */
	EClass getExtendedAttributesType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ExtendedAttributesType#getExtendedAttribute <em>Extended Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Attribute</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributesType#getExtendedAttribute()
	 * @see #getExtendedAttributesType()
	 * @generated
	 */
	EReference getExtendedAttributesType_ExtendedAttribute();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ExtendedAttributeType <em>Extended Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Attribute Type</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType
	 * @generated
	 */
	EClass getExtendedAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType#getFieldID()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_FieldID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType#getValue()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType#getValueGUID <em>Value GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value GUID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType#getValueGUID()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_ValueGUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType#getDurationFormat <em>Duration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Format</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType#getDurationFormat()
	 * @see #getExtendedAttributeType()
	 * @generated
	 */
	EAttribute getExtendedAttributeType_DurationFormat();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ExtendedAttributeType1 <em>Extended Attribute Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Attribute Type1</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType1
	 * @generated
	 */
	EClass getExtendedAttributeType1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType1#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType1#getFieldID()
	 * @see #getExtendedAttributeType1()
	 * @generated
	 */
	EAttribute getExtendedAttributeType1_FieldID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType1#getValue()
	 * @see #getExtendedAttributeType1()
	 * @generated
	 */
	EAttribute getExtendedAttributeType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType1#getValueGUID <em>Value GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value GUID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType1#getValueGUID()
	 * @see #getExtendedAttributeType1()
	 * @generated
	 */
	EAttribute getExtendedAttributeType1_ValueGUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType1#getDurationFormat <em>Duration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Format</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType1#getDurationFormat()
	 * @see #getExtendedAttributeType1()
	 * @generated
	 */
	EAttribute getExtendedAttributeType1_DurationFormat();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ExtendedAttributeType2 <em>Extended Attribute Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Attribute Type2</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType2
	 * @generated
	 */
	EClass getExtendedAttributeType2();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType2#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType2#getFieldID()
	 * @see #getExtendedAttributeType2()
	 * @generated
	 */
	EAttribute getExtendedAttributeType2_FieldID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType2#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType2#getValue()
	 * @see #getExtendedAttributeType2()
	 * @generated
	 */
	EAttribute getExtendedAttributeType2_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType2#getValueGUID <em>Value GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value GUID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType2#getValueGUID()
	 * @see #getExtendedAttributeType2()
	 * @generated
	 */
	EAttribute getExtendedAttributeType2_ValueGUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType2#getDurationFormat <em>Duration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Format</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType2#getDurationFormat()
	 * @see #getExtendedAttributeType2()
	 * @generated
	 */
	EAttribute getExtendedAttributeType2_DurationFormat();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ExtendedAttributeType3 <em>Extended Attribute Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Attribute Type3</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3
	 * @generated
	 */
	EClass getExtendedAttributeType3();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getFieldID()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_FieldID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getFieldName()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCFType <em>CF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CF Type</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getCFType()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_CFType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getGuid()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_Guid();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getElemType <em>Elem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem Type</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getElemType()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_ElemType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getMaxMultiValues <em>Max Multi Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Multi Values</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getMaxMultiValues()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_MaxMultiValues();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isUserDef <em>User Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Def</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#isUserDef()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_UserDef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getAlias()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_Alias();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getSecondaryPID <em>Secondary PID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary PID</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getSecondaryPID()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_SecondaryPID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAutoRollDown <em>Auto Roll Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Roll Down</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#isAutoRollDown()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_AutoRollDown();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getDefaultGuid <em>Default Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Guid</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getDefaultGuid()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_DefaultGuid();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getLtuid <em>Ltuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltuid</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getLtuid()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_Ltuid();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getPhoneticAlias <em>Phonetic Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phonetic Alias</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getPhoneticAlias()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_PhoneticAlias();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getRollupType <em>Rollup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rollup Type</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getRollupType()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_RollupType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCalculationType <em>Calculation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation Type</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getCalculationType()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_CalculationType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getFormula()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_Formula();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isRestrictValues <em>Restrict Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restrict Values</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#isRestrictValues()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_RestrictValues();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValuelistSortOrder <em>Valuelist Sort Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valuelist Sort Order</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getValuelistSortOrder()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_ValuelistSortOrder();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAppendNewValues <em>Append New Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Append New Values</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#isAppendNewValues()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_AppendNewValues();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getDefault()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EAttribute getExtendedAttributeType3_Default();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value List</em>'.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3#getValueList()
	 * @see #getExtendedAttributeType3()
	 * @generated
	 */
	EReference getExtendedAttributeType3_ValueList();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.MasksType <em>Masks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masks Type</em>'.
	 * @see net.certware.planning.mspdi.MasksType
	 * @generated
	 */
	EClass getMasksType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.MasksType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mask</em>'.
	 * @see net.certware.planning.mspdi.MasksType#getMask()
	 * @see #getMasksType()
	 * @generated
	 */
	EReference getMasksType_Mask();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mask Type</em>'.
	 * @see net.certware.planning.mspdi.MaskType
	 * @generated
	 */
	EClass getMaskType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.MaskType#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.certware.planning.mspdi.MaskType#getLevel()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_Level();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.MaskType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.MaskType#getType()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.MaskType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.certware.planning.mspdi.MaskType#getLength()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.MaskType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see net.certware.planning.mspdi.MaskType#getSeparator()
	 * @see #getMaskType()
	 * @generated
	 */
	EAttribute getMaskType_Separator();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.OutlineCodesType <em>Outline Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outline Codes Type</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodesType
	 * @generated
	 */
	EClass getOutlineCodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.OutlineCodesType#getOutlineCode <em>Outline Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outline Code</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodesType#getOutlineCode()
	 * @see #getOutlineCodesType()
	 * @generated
	 */
	EReference getOutlineCodesType_OutlineCode();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.OutlineCodeType <em>Outline Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outline Code Type</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType
	 * @generated
	 */
	EClass getOutlineCodeType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType#getFieldID()
	 * @see #getOutlineCodeType()
	 * @generated
	 */
	EAttribute getOutlineCodeType_FieldID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType#getValueID <em>Value ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value ID</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType#getValueID()
	 * @see #getOutlineCodeType()
	 * @generated
	 */
	EAttribute getOutlineCodeType_ValueID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType#getValueGUID <em>Value GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value GUID</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType#getValueGUID()
	 * @see #getOutlineCodeType()
	 * @generated
	 */
	EAttribute getOutlineCodeType_ValueGUID();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.OutlineCodeType1 <em>Outline Code Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outline Code Type1</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType1
	 * @generated
	 */
	EClass getOutlineCodeType1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType1#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType1#getFieldID()
	 * @see #getOutlineCodeType1()
	 * @generated
	 */
	EAttribute getOutlineCodeType1_FieldID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType1#getValueID <em>Value ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value ID</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType1#getValueID()
	 * @see #getOutlineCodeType1()
	 * @generated
	 */
	EAttribute getOutlineCodeType1_ValueID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType1#getValueGUID <em>Value GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value GUID</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType1#getValueGUID()
	 * @see #getOutlineCodeType1()
	 * @generated
	 */
	EAttribute getOutlineCodeType1_ValueGUID();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.OutlineCodeType2 <em>Outline Code Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outline Code Type2</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2
	 * @generated
	 */
	EClass getOutlineCodeType2();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getGuid()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_Guid();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getFieldID()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_FieldID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getFieldName()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getAlias()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_Alias();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#getPhoneticAlias <em>Phonetic Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phonetic Alias</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getPhoneticAlias()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_PhoneticAlias();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.OutlineCodeType2#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Values</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getValues()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EReference getOutlineCodeType2_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#isEnterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#isEnterprise()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_Enterprise();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#getEnterpriseOutlineCodeAlias <em>Enterprise Outline Code Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise Outline Code Alias</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getEnterpriseOutlineCodeAlias()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_EnterpriseOutlineCodeAlias();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#isResourceSubstitutionEnabled <em>Resource Substitution Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Substitution Enabled</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#isResourceSubstitutionEnabled()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_ResourceSubstitutionEnabled();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#isLeafOnly <em>Leaf Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf Only</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#isLeafOnly()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_LeafOnly();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#isAllLevelsRequired <em>All Levels Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Levels Required</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#isAllLevelsRequired()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_AllLevelsRequired();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.OutlineCodeType2#isOnlyTableValuesAllowed <em>Only Table Values Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Table Values Allowed</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#isOnlyTableValuesAllowed()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EAttribute getOutlineCodeType2_OnlyTableValuesAllowed();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.OutlineCodeType2#getMasks <em>Masks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Masks</em>'.
	 * @see net.certware.planning.mspdi.OutlineCodeType2#getMasks()
	 * @see #getOutlineCodeType2()
	 * @generated
	 */
	EReference getOutlineCodeType2_Masks();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.PredecessorLinkType <em>Predecessor Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predecessor Link Type</em>'.
	 * @see net.certware.planning.mspdi.PredecessorLinkType
	 * @generated
	 */
	EClass getPredecessorLinkType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.PredecessorLinkType#getPredecessorUID <em>Predecessor UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predecessor UID</em>'.
	 * @see net.certware.planning.mspdi.PredecessorLinkType#getPredecessorUID()
	 * @see #getPredecessorLinkType()
	 * @generated
	 */
	EAttribute getPredecessorLinkType_PredecessorUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.PredecessorLinkType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.PredecessorLinkType#getType()
	 * @see #getPredecessorLinkType()
	 * @generated
	 */
	EAttribute getPredecessorLinkType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.PredecessorLinkType#isCrossProject <em>Cross Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cross Project</em>'.
	 * @see net.certware.planning.mspdi.PredecessorLinkType#isCrossProject()
	 * @see #getPredecessorLinkType()
	 * @generated
	 */
	EAttribute getPredecessorLinkType_CrossProject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.PredecessorLinkType#getCrossProjectName <em>Cross Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cross Project Name</em>'.
	 * @see net.certware.planning.mspdi.PredecessorLinkType#getCrossProjectName()
	 * @see #getPredecessorLinkType()
	 * @generated
	 */
	EAttribute getPredecessorLinkType_CrossProjectName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.PredecessorLinkType#getLinkLag <em>Link Lag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Lag</em>'.
	 * @see net.certware.planning.mspdi.PredecessorLinkType#getLinkLag()
	 * @see #getPredecessorLinkType()
	 * @generated
	 */
	EAttribute getPredecessorLinkType_LinkLag();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.PredecessorLinkType#getLagFormat <em>Lag Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lag Format</em>'.
	 * @see net.certware.planning.mspdi.PredecessorLinkType#getLagFormat()
	 * @see #getPredecessorLinkType()
	 * @generated
	 */
	EAttribute getPredecessorLinkType_LagFormat();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Type</em>'.
	 * @see net.certware.planning.mspdi.ProjectType
	 * @generated
	 */
	EClass getProjectType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getSaveVersion <em>Save Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Version</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getSaveVersion()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_SaveVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getUID()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_UID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getName()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getTitle()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getSubject()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Subject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCategory()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Category();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCompany()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Company();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getManager()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Manager();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getAuthor()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Author();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCreationDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getRevision()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Revision();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getLastSaved <em>Last Saved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Saved</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getLastSaved()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_LastSaved();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isScheduleFromStart <em>Schedule From Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule From Start</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isScheduleFromStart()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_ScheduleFromStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getStartDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getFinishDate <em>Finish Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getFinishDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_FinishDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getFYStartDate <em>FY Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FY Start Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getFYStartDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_FYStartDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCriticalSlackLimit <em>Critical Slack Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Slack Limit</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCriticalSlackLimit()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CriticalSlackLimit();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCurrencyDigits <em>Currency Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Digits</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCurrencyDigits()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CurrencyDigits();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCurrencySymbol <em>Currency Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Symbol</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCurrencySymbol()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CurrencySymbol();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCurrencyCode()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCurrencySymbolPosition <em>Currency Symbol Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Symbol Position</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCurrencySymbolPosition()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CurrencySymbolPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCalendarUID <em>Calendar UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar UID</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCalendarUID()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CalendarUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDefaultStartTime <em>Default Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Start Time</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDefaultStartTime()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DefaultStartTime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDefaultFinishTime <em>Default Finish Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Finish Time</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDefaultFinishTime()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DefaultFinishTime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getMinutesPerDay <em>Minutes Per Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes Per Day</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getMinutesPerDay()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MinutesPerDay();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getMinutesPerWeek <em>Minutes Per Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes Per Week</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getMinutesPerWeek()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MinutesPerWeek();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDaysPerMonth <em>Days Per Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days Per Month</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDaysPerMonth()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DaysPerMonth();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDefaultTaskType <em>Default Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Task Type</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDefaultTaskType()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DefaultTaskType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDefaultFixedCostAccrual <em>Default Fixed Cost Accrual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Fixed Cost Accrual</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDefaultFixedCostAccrual()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DefaultFixedCostAccrual();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDefaultStandardRate <em>Default Standard Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Standard Rate</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDefaultStandardRate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DefaultStandardRate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDefaultOvertimeRate <em>Default Overtime Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Overtime Rate</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDefaultOvertimeRate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DefaultOvertimeRate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDurationFormat <em>Duration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Format</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDurationFormat()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DurationFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getWorkFormat <em>Work Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Format</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getWorkFormat()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_WorkFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isEditableActualCosts <em>Editable Actual Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable Actual Costs</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isEditableActualCosts()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_EditableActualCosts();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isHonorConstraints <em>Honor Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honor Constraints</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isHonorConstraints()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_HonorConstraints();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getEarnedValueMethod <em>Earned Value Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earned Value Method</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getEarnedValueMethod()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_EarnedValueMethod();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isInsertedProjectsLikeSummary <em>Inserted Projects Like Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserted Projects Like Summary</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isInsertedProjectsLikeSummary()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_InsertedProjectsLikeSummary();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isMultipleCriticalPaths <em>Multiple Critical Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Critical Paths</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isMultipleCriticalPaths()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MultipleCriticalPaths();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isNewTasksEffortDriven <em>New Tasks Effort Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Tasks Effort Driven</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isNewTasksEffortDriven()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_NewTasksEffortDriven();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isNewTasksEstimated <em>New Tasks Estimated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Tasks Estimated</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isNewTasksEstimated()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_NewTasksEstimated();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isSplitsInProgressTasks <em>Splits In Progress Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Splits In Progress Tasks</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isSplitsInProgressTasks()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_SplitsInProgressTasks();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isSpreadActualCost <em>Spread Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Actual Cost</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isSpreadActualCost()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_SpreadActualCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isSpreadPercentComplete <em>Spread Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Percent Complete</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isSpreadPercentComplete()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_SpreadPercentComplete();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isTaskUpdatesResource <em>Task Updates Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Updates Resource</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isTaskUpdatesResource()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_TaskUpdatesResource();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isFiscalYearStart <em>Fiscal Year Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Year Start</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isFiscalYearStart()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_FiscalYearStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getWeekStartDay <em>Week Start Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Start Day</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getWeekStartDay()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_WeekStartDay();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isMoveCompletedEndsBack <em>Move Completed Ends Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Completed Ends Back</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isMoveCompletedEndsBack()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MoveCompletedEndsBack();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isMoveRemainingStartsBack <em>Move Remaining Starts Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Remaining Starts Back</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isMoveRemainingStartsBack()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MoveRemainingStartsBack();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isMoveRemainingStartsForward <em>Move Remaining Starts Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Remaining Starts Forward</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isMoveRemainingStartsForward()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MoveRemainingStartsForward();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isMoveCompletedEndsForward <em>Move Completed Ends Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Completed Ends Forward</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isMoveCompletedEndsForward()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MoveCompletedEndsForward();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getBaselineForEarnedValue <em>Baseline For Earned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseline For Earned Value</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getBaselineForEarnedValue()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_BaselineForEarnedValue();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isAutoAddNewResourcesAndTasks <em>Auto Add New Resources And Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Add New Resources And Tasks</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isAutoAddNewResourcesAndTasks()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_AutoAddNewResourcesAndTasks();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getStatusDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_StatusDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getCurrentDate <em>Current Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCurrentDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_CurrentDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isMicrosoftProjectServerURL <em>Microsoft Project Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Microsoft Project Server URL</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isMicrosoftProjectServerURL()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_MicrosoftProjectServerURL();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isAutolink <em>Autolink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autolink</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isAutolink()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_Autolink();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getNewTaskStartDate <em>New Task Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Task Start Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getNewTaskStartDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_NewTaskStartDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getDefaultTaskEVMethod <em>Default Task EV Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Task EV Method</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getDefaultTaskEVMethod()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_DefaultTaskEVMethod();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isProjectExternallyEdited <em>Project Externally Edited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Externally Edited</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isProjectExternallyEdited()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_ProjectExternallyEdited();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#getExtendedCreationDate <em>Extended Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Creation Date</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getExtendedCreationDate()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_ExtendedCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isActualsInSync <em>Actuals In Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuals In Sync</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isActualsInSync()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_ActualsInSync();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isRemoveFileProperties <em>Remove File Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove File Properties</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isRemoveFileProperties()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_RemoveFileProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ProjectType#isAdminProject <em>Admin Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Project</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#isAdminProject()
	 * @see #getProjectType()
	 * @generated
	 */
	EAttribute getProjectType_AdminProject();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ProjectType#getOutlineCodes <em>Outline Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outline Codes</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getOutlineCodes()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_OutlineCodes();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ProjectType#getWBSMasks <em>WBS Masks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WBS Masks</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getWBSMasks()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_WBSMasks();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ProjectType#getExtendedAttributes <em>Extended Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Attributes</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getExtendedAttributes()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_ExtendedAttributes();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ProjectType#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendars</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getCalendars()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_Calendars();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ProjectType#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tasks</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getTasks()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ProjectType#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getResources()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ProjectType#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignments</em>'.
	 * @see net.certware.planning.mspdi.ProjectType#getAssignments()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_Assignments();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.RatesType <em>Rates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rates Type</em>'.
	 * @see net.certware.planning.mspdi.RatesType
	 * @generated
	 */
	EClass getRatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.RatesType#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rate</em>'.
	 * @see net.certware.planning.mspdi.RatesType#getRate()
	 * @see #getRatesType()
	 * @generated
	 */
	EReference getRatesType_Rate();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.RateType <em>Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Type</em>'.
	 * @see net.certware.planning.mspdi.RateType
	 * @generated
	 */
	EClass getRateType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getRatesFrom <em>Rates From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rates From</em>'.
	 * @see net.certware.planning.mspdi.RateType#getRatesFrom()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_RatesFrom();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getRatesTo <em>Rates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rates To</em>'.
	 * @see net.certware.planning.mspdi.RateType#getRatesTo()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_RatesTo();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getRateTable <em>Rate Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Table</em>'.
	 * @see net.certware.planning.mspdi.RateType#getRateTable()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_RateTable();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getStandardRate <em>Standard Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Rate</em>'.
	 * @see net.certware.planning.mspdi.RateType#getStandardRate()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_StandardRate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getStandardRateFormat <em>Standard Rate Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Rate Format</em>'.
	 * @see net.certware.planning.mspdi.RateType#getStandardRateFormat()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_StandardRateFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getOvertimeRate <em>Overtime Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Rate</em>'.
	 * @see net.certware.planning.mspdi.RateType#getOvertimeRate()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_OvertimeRate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getOvertimeRateFormat <em>Overtime Rate Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Rate Format</em>'.
	 * @see net.certware.planning.mspdi.RateType#getOvertimeRateFormat()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_OvertimeRateFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.RateType#getCostPerUse <em>Cost Per Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Use</em>'.
	 * @see net.certware.planning.mspdi.RateType#getCostPerUse()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_CostPerUse();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Type</em>'.
	 * @see net.certware.planning.mspdi.ResourcesType
	 * @generated
	 */
	EClass getResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ResourcesType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see net.certware.planning.mspdi.ResourcesType#getResource()
	 * @see #getResourcesType()
	 * @generated
	 */
	EReference getResourcesType_Resource();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see net.certware.planning.mspdi.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getUID()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_UID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getID()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getName()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getType()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isIsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Null</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isIsNull()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsNull();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getInitials <em>Initials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initials</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getInitials()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Initials();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getPhonetics <em>Phonetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phonetics</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getPhonetics()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Phonetics();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getNTAccount <em>NT Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NT Account</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getNTAccount()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_NTAccount();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getMaterialLabel <em>Material Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Label</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getMaterialLabel()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_MaterialLabel();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getCode()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Code();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getGroup()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Group();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getWorkGroup <em>Work Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Group</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getWorkGroup()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_WorkGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getEmailAddress()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getHyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getHyperlink()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Hyperlink();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getHyperlinkAddress <em>Hyperlink Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Address</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getHyperlinkAddress()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_HyperlinkAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Sub Address</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getHyperlinkSubAddress()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_HyperlinkSubAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getMaxUnits <em>Max Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Units</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getMaxUnits()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_MaxUnits();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getPeakUnits <em>Peak Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Units</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getPeakUnits()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_PeakUnits();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isOverAllocated <em>Over Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over Allocated</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isOverAllocated()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_OverAllocated();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getAvailableFrom <em>Available From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available From</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getAvailableFrom()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_AvailableFrom();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getAvailableTo <em>Available To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available To</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getAvailableTo()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_AvailableTo();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getStart()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getFinish()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isCanLevel <em>Can Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Level</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isCanLevel()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_CanLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getAccrueAt <em>Accrue At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accrue At</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getAccrueAt()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_AccrueAt();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getWork()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Work();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getRegularWork <em>Regular Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regular Work</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getRegularWork()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_RegularWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getOvertimeWork <em>Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getOvertimeWork()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_OvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getActualWork <em>Actual Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Work</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getActualWork()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ActualWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getRemainingWork <em>Remaining Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Work</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getRemainingWork()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_RemainingWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeWork <em>Actual Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getActualOvertimeWork()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ActualOvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getRemainingOvertimeWork()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_RemainingOvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getPercentWorkComplete <em>Percent Work Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Work Complete</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getPercentWorkComplete()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_PercentWorkComplete();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getStandardRate <em>Standard Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Rate</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getStandardRate()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_StandardRate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getStandardRateFormat <em>Standard Rate Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Rate Format</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getStandardRateFormat()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_StandardRateFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getCost()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getOvertimeRate <em>Overtime Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Rate</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getOvertimeRate()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_OvertimeRate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getOvertimeRateFormat <em>Overtime Rate Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Rate Format</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getOvertimeRateFormat()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_OvertimeRateFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getOvertimeCost <em>Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getOvertimeCost()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_OvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getCostPerUse <em>Cost Per Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Use</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getCostPerUse()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_CostPerUse();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getActualCost()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ActualCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeCost <em>Actual Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getActualOvertimeCost()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ActualOvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getRemainingCost <em>Remaining Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Cost</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getRemainingCost()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_RemainingCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getRemainingOvertimeCost()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_RemainingOvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getWorkVariance <em>Work Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Variance</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getWorkVariance()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_WorkVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getCostVariance <em>Cost Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Variance</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getCostVariance()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_CostVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getSV()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_SV();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getCV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CV</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getCV()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_CV();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getACWP <em>ACWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACWP</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getACWP()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ACWP();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getCalendarUID <em>Calendar UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar UID</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getCalendarUID()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_CalendarUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getNotes()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Notes();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getBCWS <em>BCWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWS</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getBCWS()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_BCWS();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getBCWP <em>BCWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWP</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getBCWP()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_BCWP();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isIsGeneric <em>Is Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Generic</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isIsGeneric()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsGeneric();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isIsInactive <em>Is Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inactive</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isIsInactive()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsInactive();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isIsEnterprise <em>Is Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enterprise</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isIsEnterprise()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsEnterprise();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getBookingType <em>Booking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Type</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getBookingType()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_BookingType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getActualWorkProtected <em>Actual Work Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Work Protected</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getActualWorkProtected()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ActualWorkProtected();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Work Protected</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getActualOvertimeWorkProtected()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ActualOvertimeWorkProtected();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getActiveDirectoryGUID <em>Active Directory GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Directory GUID</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getActiveDirectoryGUID()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_ActiveDirectoryGUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getCreationDate()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ResourceType#getExtendedAttribute <em>Extended Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Attribute</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getExtendedAttribute()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_ExtendedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ResourceType#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baseline</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getBaseline()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Baseline();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ResourceType#getOutlineCode <em>Outline Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outline Code</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getOutlineCode()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_OutlineCode();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isIsCostResource <em>Is Cost Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cost Resource</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isIsCostResource()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsCostResource();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getAssnOwner <em>Assn Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assn Owner</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getAssnOwner()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_AssnOwner();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#getAssnOwnerGuid <em>Assn Owner Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assn Owner Guid</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getAssnOwnerGuid()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_AssnOwnerGuid();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ResourceType#isIsBudget <em>Is Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Budget</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#isIsBudget()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsBudget();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ResourceType#getAvailabilityPeriods <em>Availability Periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Availability Periods</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getAvailabilityPeriods()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_AvailabilityPeriods();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.ResourceType#getRates <em>Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rates</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getRates()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Rates();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ResourceType#getTimephasedData <em>Timephased Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timephased Data</em>'.
	 * @see net.certware.planning.mspdi.ResourceType#getTimephasedData()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_TimephasedData();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.TasksType <em>Tasks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasks Type</em>'.
	 * @see net.certware.planning.mspdi.TasksType
	 * @generated
	 */
	EClass getTasksType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.TasksType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see net.certware.planning.mspdi.TasksType#getTask()
	 * @see #getTasksType()
	 * @generated
	 */
	EReference getTasksType_Task();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see net.certware.planning.mspdi.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getUID()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_UID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getID()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getType()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isIsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Null</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isIsNull()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_IsNull();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getCreateDate <em>Create Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Date</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getCreateDate()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_CreateDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getContact()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Contact();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getWBS <em>WBS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WBS</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getWBS()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_WBS();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getWBSLevel <em>WBS Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WBS Level</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getWBSLevel()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_WBSLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getOutlineNumber <em>Outline Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline Number</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getOutlineNumber()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_OutlineNumber();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getOutlineLevel <em>Outline Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline Level</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getOutlineLevel()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_OutlineLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getPriority()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getStart()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getFinish()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getDuration()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getDurationFormat <em>Duration Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Format</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getDurationFormat()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_DurationFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getWork()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Work();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getStop()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Stop();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getResume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getResume()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Resume();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isResumeValid <em>Resume Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Valid</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isResumeValid()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ResumeValid();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isEffortDriven <em>Effort Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort Driven</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isEffortDriven()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_EffortDriven();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isRecurring <em>Recurring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurring</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isRecurring()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Recurring();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isOverAllocated <em>Over Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over Allocated</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isOverAllocated()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_OverAllocated();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isEstimated <em>Estimated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isEstimated()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Estimated();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milestone</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isMilestone()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Milestone();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isSummary()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Summary();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isCritical()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Critical();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isIsSubproject <em>Is Subproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subproject</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isIsSubproject()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_IsSubproject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isIsSubprojectReadOnly <em>Is Subproject Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subproject Read Only</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isIsSubprojectReadOnly()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_IsSubprojectReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getSubprojectName <em>Subproject Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subproject Name</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getSubprojectName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_SubprojectName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isExternalTask <em>External Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Task</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isExternalTask()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ExternalTask();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getExternalTaskProject <em>External Task Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Task Project</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getExternalTaskProject()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ExternalTaskProject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getEarlyStart <em>Early Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Early Start</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getEarlyStart()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_EarlyStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getEarlyFinish <em>Early Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Early Finish</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getEarlyFinish()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_EarlyFinish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getLateStart <em>Late Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Late Start</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getLateStart()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_LateStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getLateFinish <em>Late Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Late Finish</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getLateFinish()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_LateFinish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getStartVariance <em>Start Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Variance</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getStartVariance()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_StartVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getFinishVariance <em>Finish Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Variance</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getFinishVariance()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_FinishVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getWorkVariance <em>Work Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Variance</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getWorkVariance()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_WorkVariance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getFreeSlack <em>Free Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Slack</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getFreeSlack()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_FreeSlack();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getTotalSlack <em>Total Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Slack</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getTotalSlack()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_TotalSlack();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getFixedCost <em>Fixed Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Cost</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getFixedCost()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_FixedCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getFixedCostAccrual <em>Fixed Cost Accrual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Cost Accrual</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getFixedCostAccrual()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_FixedCostAccrual();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getPercentComplete <em>Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Complete</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getPercentComplete()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_PercentComplete();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getPercentWorkComplete <em>Percent Work Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Work Complete</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getPercentWorkComplete()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_PercentWorkComplete();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getCost()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getOvertimeCost <em>Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getOvertimeCost()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_OvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getOvertimeWork <em>Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getOvertimeWork()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_OvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualStart <em>Actual Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Start</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualStart()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualFinish <em>Actual Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Finish</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualFinish()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualFinish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualDuration <em>Actual Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Duration</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualDuration()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualDuration();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualCost()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualOvertimeCost <em>Actual Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualOvertimeCost()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualOvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualWork <em>Actual Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Work</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualWork()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualOvertimeWork <em>Actual Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualOvertimeWork()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualOvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getRegularWork <em>Regular Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regular Work</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getRegularWork()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_RegularWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getRemainingDuration <em>Remaining Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Duration</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getRemainingDuration()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_RemainingDuration();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getRemainingCost <em>Remaining Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Cost</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getRemainingCost()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_RemainingCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getRemainingWork <em>Remaining Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Work</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getRemainingWork()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_RemainingWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Overtime Cost</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getRemainingOvertimeCost()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_RemainingOvertimeCost();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Overtime Work</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getRemainingOvertimeWork()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_RemainingOvertimeWork();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getACWP <em>ACWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACWP</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getACWP()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ACWP();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getCV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CV</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getCV()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_CV();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getConstraintType()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getCalendarUID <em>Calendar UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar UID</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getCalendarUID()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_CalendarUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getConstraintDate <em>Constraint Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Date</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getConstraintDate()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ConstraintDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getDeadline()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isLevelAssignments <em>Level Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Assignments</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isLevelAssignments()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_LevelAssignments();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isLevelingCanSplit <em>Leveling Can Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leveling Can Split</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isLevelingCanSplit()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_LevelingCanSplit();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getLevelingDelay <em>Leveling Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leveling Delay</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getLevelingDelay()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_LevelingDelay();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getLevelingDelayFormat <em>Leveling Delay Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leveling Delay Format</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getLevelingDelayFormat()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_LevelingDelayFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getPreLeveledStart <em>Pre Leveled Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Leveled Start</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getPreLeveledStart()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_PreLeveledStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getPreLeveledFinish <em>Pre Leveled Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Leveled Finish</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getPreLeveledFinish()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_PreLeveledFinish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getHyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getHyperlink()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Hyperlink();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getHyperlinkAddress <em>Hyperlink Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Address</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getHyperlinkAddress()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_HyperlinkAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Sub Address</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getHyperlinkSubAddress()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_HyperlinkSubAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isIgnoreResourceCalendar <em>Ignore Resource Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Resource Calendar</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isIgnoreResourceCalendar()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_IgnoreResourceCalendar();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getNotes()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Notes();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isHideBar <em>Hide Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Bar</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isHideBar()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_HideBar();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isRollup <em>Rollup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rollup</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isRollup()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Rollup();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getBCWS <em>BCWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWS</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getBCWS()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_BCWS();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getBCWP <em>BCWP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCWP</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getBCWP()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_BCWP();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getPhysicalPercentComplete <em>Physical Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Percent Complete</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getPhysicalPercentComplete()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_PhysicalPercentComplete();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getEarnedValueMethod <em>Earned Value Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earned Value Method</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getEarnedValueMethod()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_EarnedValueMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.TaskType#getPredecessorLink <em>Predecessor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predecessor Link</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getPredecessorLink()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_PredecessorLink();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualWorkProtected <em>Actual Work Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Work Protected</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualWorkProtected()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualWorkProtected();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Overtime Work Protected</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getActualOvertimeWorkProtected()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActualOvertimeWorkProtected();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.TaskType#getExtendedAttribute <em>Extended Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Attribute</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getExtendedAttribute()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_ExtendedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.TaskType#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baseline</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getBaseline()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Baseline();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.TaskType#getOutlineCode <em>Outline Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outline Code</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getOutlineCode()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_OutlineCode();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#isIsPublished <em>Is Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Published</em>'.
	 * @see net.certware.planning.mspdi.TaskType#isIsPublished()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_IsPublished();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getStatusManager <em>Status Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Manager</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getStatusManager()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_StatusManager();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getCommitmentStart <em>Commitment Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commitment Start</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getCommitmentStart()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_CommitmentStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getCommitmentFinish <em>Commitment Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commitment Finish</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getCommitmentFinish()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_CommitmentFinish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TaskType#getCommitmentType <em>Commitment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commitment Type</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getCommitmentType()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_CommitmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.TaskType#getTimephasedData <em>Timephased Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timephased Data</em>'.
	 * @see net.certware.planning.mspdi.TaskType#getTimephasedData()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_TimephasedData();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Period Type</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType
	 * @generated
	 */
	EClass getTimePeriodType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimePeriodType#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType#getFromDate()
	 * @see #getTimePeriodType()
	 * @generated
	 */
	EAttribute getTimePeriodType_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimePeriodType#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType#getToDate()
	 * @see #getTimePeriodType()
	 * @generated
	 */
	EAttribute getTimePeriodType_ToDate();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.TimePeriodType1 <em>Time Period Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Period Type1</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType1
	 * @generated
	 */
	EClass getTimePeriodType1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimePeriodType1#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType1#getFromDate()
	 * @see #getTimePeriodType1()
	 * @generated
	 */
	EAttribute getTimePeriodType1_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimePeriodType1#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType1#getToDate()
	 * @see #getTimePeriodType1()
	 * @generated
	 */
	EAttribute getTimePeriodType1_ToDate();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.TimePeriodType2 <em>Time Period Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Period Type2</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType2
	 * @generated
	 */
	EClass getTimePeriodType2();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimePeriodType2#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType2#getFromDate()
	 * @see #getTimePeriodType2()
	 * @generated
	 */
	EAttribute getTimePeriodType2_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimePeriodType2#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see net.certware.planning.mspdi.TimePeriodType2#getToDate()
	 * @see #getTimePeriodType2()
	 * @generated
	 */
	EAttribute getTimePeriodType2_ToDate();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.TimephasedDataType <em>Timephased Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timephased Data Type</em>'.
	 * @see net.certware.planning.mspdi.TimephasedDataType
	 * @generated
	 */
	EClass getTimephasedDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimephasedDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.TimephasedDataType#getType()
	 * @see #getTimephasedDataType()
	 * @generated
	 */
	EAttribute getTimephasedDataType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimephasedDataType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see net.certware.planning.mspdi.TimephasedDataType#getUID()
	 * @see #getTimephasedDataType()
	 * @generated
	 */
	EAttribute getTimephasedDataType_UID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimephasedDataType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.certware.planning.mspdi.TimephasedDataType#getStart()
	 * @see #getTimephasedDataType()
	 * @generated
	 */
	EAttribute getTimephasedDataType_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimephasedDataType#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.certware.planning.mspdi.TimephasedDataType#getFinish()
	 * @see #getTimephasedDataType()
	 * @generated
	 */
	EAttribute getTimephasedDataType_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimephasedDataType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.certware.planning.mspdi.TimephasedDataType#getUnit()
	 * @see #getTimephasedDataType()
	 * @generated
	 */
	EAttribute getTimephasedDataType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.TimephasedDataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.TimephasedDataType#getValue()
	 * @see #getTimephasedDataType()
	 * @generated
	 */
	EAttribute getTimephasedDataType_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ValueListType <em>Value List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value List Type</em>'.
	 * @see net.certware.planning.mspdi.ValueListType
	 * @generated
	 */
	EClass getValueListType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ValueListType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.ValueListType#getValue()
	 * @see #getValueListType()
	 * @generated
	 */
	EReference getValueListType_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ValuesType <em>Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values Type</em>'.
	 * @see net.certware.planning.mspdi.ValuesType
	 * @generated
	 */
	EClass getValuesType();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.planning.mspdi.ValuesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.planning.mspdi.ValuesType#getGroup()
	 * @see #getValuesType()
	 * @generated
	 */
	EAttribute getValuesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.ValuesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.ValuesType#getValue()
	 * @see #getValuesType()
	 * @generated
	 */
	EReference getValuesType_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see net.certware.planning.mspdi.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.certware.planning.mspdi.ValueType#getID()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.ValueType#getValue()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.planning.mspdi.ValueType#getDescription()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType#getPhonetic <em>Phonetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phonetic</em>'.
	 * @see net.certware.planning.mspdi.ValueType#getPhonetic()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Phonetic();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type1</em>'.
	 * @see net.certware.planning.mspdi.ValueType1
	 * @generated
	 */
	EClass getValueType1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType1#getValueID <em>Value ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value ID</em>'.
	 * @see net.certware.planning.mspdi.ValueType1#getValueID()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_ValueID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType1#getFieldGUID <em>Field GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field GUID</em>'.
	 * @see net.certware.planning.mspdi.ValueType1#getFieldGUID()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_FieldGUID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType1#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.ValueType1#getType()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType1#getParentValueID <em>Parent Value ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Value ID</em>'.
	 * @see net.certware.planning.mspdi.ValueType1#getParentValueID()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_ParentValueID();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.planning.mspdi.ValueType1#getValue()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.ValueType1#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.planning.mspdi.ValueType1#getDescription()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_Description();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WBSMasksType <em>WBS Masks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WBS Masks Type</em>'.
	 * @see net.certware.planning.mspdi.WBSMasksType
	 * @generated
	 */
	EClass getWBSMasksType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WBSMasksType#isVerifyUniqueCodes <em>Verify Unique Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Unique Codes</em>'.
	 * @see net.certware.planning.mspdi.WBSMasksType#isVerifyUniqueCodes()
	 * @see #getWBSMasksType()
	 * @generated
	 */
	EAttribute getWBSMasksType_VerifyUniqueCodes();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WBSMasksType#isGenerateCodes <em>Generate Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Codes</em>'.
	 * @see net.certware.planning.mspdi.WBSMasksType#isGenerateCodes()
	 * @see #getWBSMasksType()
	 * @generated
	 */
	EAttribute getWBSMasksType_GenerateCodes();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WBSMasksType#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see net.certware.planning.mspdi.WBSMasksType#getPrefix()
	 * @see #getWBSMasksType()
	 * @generated
	 */
	EAttribute getWBSMasksType_Prefix();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.WBSMasksType#getWBSMask <em>WBS Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WBS Mask</em>'.
	 * @see net.certware.planning.mspdi.WBSMasksType#getWBSMask()
	 * @see #getWBSMasksType()
	 * @generated
	 */
	EReference getWBSMasksType_WBSMask();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WBSMaskType <em>WBS Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WBS Mask Type</em>'.
	 * @see net.certware.planning.mspdi.WBSMaskType
	 * @generated
	 */
	EClass getWBSMaskType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WBSMaskType#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.certware.planning.mspdi.WBSMaskType#getLevel()
	 * @see #getWBSMaskType()
	 * @generated
	 */
	EAttribute getWBSMaskType_Level();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WBSMaskType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.planning.mspdi.WBSMaskType#getType()
	 * @see #getWBSMaskType()
	 * @generated
	 */
	EAttribute getWBSMaskType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WBSMaskType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.certware.planning.mspdi.WBSMaskType#getLength()
	 * @see #getWBSMaskType()
	 * @generated
	 */
	EAttribute getWBSMaskType_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WBSMaskType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see net.certware.planning.mspdi.WBSMaskType#getSeparator()
	 * @see #getWBSMaskType()
	 * @generated
	 */
	EAttribute getWBSMaskType_Separator();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WeekDaysType <em>Week Days Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Week Days Type</em>'.
	 * @see net.certware.planning.mspdi.WeekDaysType
	 * @generated
	 */
	EClass getWeekDaysType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.WeekDaysType#getWeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Week Day</em>'.
	 * @see net.certware.planning.mspdi.WeekDaysType#getWeekDay()
	 * @see #getWeekDaysType()
	 * @generated
	 */
	EReference getWeekDaysType_WeekDay();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WeekDayType <em>Week Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Week Day Type</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType
	 * @generated
	 */
	EClass getWeekDayType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WeekDayType#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Type</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType#getDayType()
	 * @see #getWeekDayType()
	 * @generated
	 */
	EAttribute getWeekDayType_DayType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WeekDayType#isDayWorking <em>Day Working</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Working</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType#isDayWorking()
	 * @see #getWeekDayType()
	 * @generated
	 */
	EAttribute getWeekDayType_DayWorking();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WeekDayType1 <em>Week Day Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Week Day Type1</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType1
	 * @generated
	 */
	EClass getWeekDayType1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WeekDayType1#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Type</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType1#getDayType()
	 * @see #getWeekDayType1()
	 * @generated
	 */
	EAttribute getWeekDayType1_DayType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WeekDayType1#isDayWorking <em>Day Working</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Working</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType1#isDayWorking()
	 * @see #getWeekDayType1()
	 * @generated
	 */
	EAttribute getWeekDayType1_DayWorking();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.WeekDayType1#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Period</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType1#getTimePeriod()
	 * @see #getWeekDayType1()
	 * @generated
	 */
	EReference getWeekDayType1_TimePeriod();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.WeekDayType1#getWorkingTimes <em>Working Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Times</em>'.
	 * @see net.certware.planning.mspdi.WeekDayType1#getWorkingTimes()
	 * @see #getWeekDayType1()
	 * @generated
	 */
	EReference getWeekDayType1_WorkingTimes();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WorkingTimesType <em>Working Times Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Times Type</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimesType
	 * @generated
	 */
	EClass getWorkingTimesType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.WorkingTimesType#getWorkingTime <em>Working Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Working Time</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimesType#getWorkingTime()
	 * @see #getWorkingTimesType()
	 * @generated
	 */
	EReference getWorkingTimesType_WorkingTime();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WorkingTimesType1 <em>Working Times Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Times Type1</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimesType1
	 * @generated
	 */
	EClass getWorkingTimesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.WorkingTimesType1#getWorkingTime <em>Working Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Working Time</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimesType1#getWorkingTime()
	 * @see #getWorkingTimesType1()
	 * @generated
	 */
	EReference getWorkingTimesType1_WorkingTime();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WorkingTimeType <em>Working Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Time Type</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimeType
	 * @generated
	 */
	EClass getWorkingTimeType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WorkingTimeType#getFromTime <em>From Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Time</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimeType#getFromTime()
	 * @see #getWorkingTimeType()
	 * @generated
	 */
	EAttribute getWorkingTimeType_FromTime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WorkingTimeType#getToTime <em>To Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Time</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimeType#getToTime()
	 * @see #getWorkingTimeType()
	 * @generated
	 */
	EAttribute getWorkingTimeType_ToTime();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WorkingTimeType1 <em>Working Time Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Time Type1</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimeType1
	 * @generated
	 */
	EClass getWorkingTimeType1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WorkingTimeType1#getFromTime <em>From Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Time</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimeType1#getFromTime()
	 * @see #getWorkingTimeType1()
	 * @generated
	 */
	EAttribute getWorkingTimeType1_FromTime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WorkingTimeType1#getToTime <em>To Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Time</em>'.
	 * @see net.certware.planning.mspdi.WorkingTimeType1#getToTime()
	 * @see #getWorkingTimeType1()
	 * @generated
	 */
	EAttribute getWorkingTimeType1_ToTime();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WorkWeeksType <em>Work Weeks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Weeks Type</em>'.
	 * @see net.certware.planning.mspdi.WorkWeeksType
	 * @generated
	 */
	EClass getWorkWeeksType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.WorkWeeksType#getWorkWeek <em>Work Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Week</em>'.
	 * @see net.certware.planning.mspdi.WorkWeeksType#getWorkWeek()
	 * @see #getWorkWeeksType()
	 * @generated
	 */
	EReference getWorkWeeksType_WorkWeek();

	/**
	 * Returns the meta object for class '{@link net.certware.planning.mspdi.WorkWeekType <em>Work Week Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Week Type</em>'.
	 * @see net.certware.planning.mspdi.WorkWeekType
	 * @generated
	 */
	EClass getWorkWeekType();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.planning.mspdi.WorkWeekType#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Period</em>'.
	 * @see net.certware.planning.mspdi.WorkWeekType#getTimePeriod()
	 * @see #getWorkWeekType()
	 * @generated
	 */
	EReference getWorkWeekType_TimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.planning.mspdi.WorkWeekType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.planning.mspdi.WorkWeekType#getName()
	 * @see #getWorkWeekType()
	 * @generated
	 */
	EAttribute getWorkWeekType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.planning.mspdi.WorkWeekType#getWeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Week Day</em>'.
	 * @see net.certware.planning.mspdi.WorkWeekType#getWeekDay()
	 * @see #getWorkWeekType()
	 * @generated
	 */
	EReference getWorkWeekType_WeekDay();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.AccrueAtType <em>Accrue At Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accrue At Type</em>'.
	 * @see net.certware.planning.mspdi.AccrueAtType
	 * @generated
	 */
	EEnum getAccrueAtType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.BaselineForEarnedValueType <em>Baseline For Earned Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Baseline For Earned Value Type</em>'.
	 * @see net.certware.planning.mspdi.BaselineForEarnedValueType
	 * @generated
	 */
	EEnum getBaselineForEarnedValueType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.BookingTypeType <em>Booking Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Booking Type Type</em>'.
	 * @see net.certware.planning.mspdi.BookingTypeType
	 * @generated
	 */
	EEnum getBookingTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.BookingTypeType1 <em>Booking Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Booking Type Type1</em>'.
	 * @see net.certware.planning.mspdi.BookingTypeType1
	 * @generated
	 */
	EEnum getBookingTypeType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.CalculationTypeType <em>Calculation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calculation Type Type</em>'.
	 * @see net.certware.planning.mspdi.CalculationTypeType
	 * @generated
	 */
	EEnum getCalculationTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.CFTypeType <em>CF Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CF Type Type</em>'.
	 * @see net.certware.planning.mspdi.CFTypeType
	 * @generated
	 */
	EEnum getCFTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.CommitmentTypeType <em>Commitment Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Commitment Type Type</em>'.
	 * @see net.certware.planning.mspdi.CommitmentTypeType
	 * @generated
	 */
	EEnum getCommitmentTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.ConstraintTypeType <em>Constraint Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type Type</em>'.
	 * @see net.certware.planning.mspdi.ConstraintTypeType
	 * @generated
	 */
	EEnum getConstraintTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.CostRateTableType <em>Cost Rate Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cost Rate Table Type</em>'.
	 * @see net.certware.planning.mspdi.CostRateTableType
	 * @generated
	 */
	EEnum getCostRateTableType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.CurrencySymbolPositionType <em>Currency Symbol Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency Symbol Position Type</em>'.
	 * @see net.certware.planning.mspdi.CurrencySymbolPositionType
	 * @generated
	 */
	EEnum getCurrencySymbolPositionType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DayTypeType <em>Day Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Type Type</em>'.
	 * @see net.certware.planning.mspdi.DayTypeType
	 * @generated
	 */
	EEnum getDayTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DayTypeType1 <em>Day Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Type Type1</em>'.
	 * @see net.certware.planning.mspdi.DayTypeType1
	 * @generated
	 */
	EEnum getDayTypeType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DefaultFixedCostAccrualType <em>Default Fixed Cost Accrual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Fixed Cost Accrual Type</em>'.
	 * @see net.certware.planning.mspdi.DefaultFixedCostAccrualType
	 * @generated
	 */
	EEnum getDefaultFixedCostAccrualType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DefaultTaskEVMethodType <em>Default Task EV Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Task EV Method Type</em>'.
	 * @see net.certware.planning.mspdi.DefaultTaskEVMethodType
	 * @generated
	 */
	EEnum getDefaultTaskEVMethodType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DefaultTaskTypeType <em>Default Task Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Task Type Type</em>'.
	 * @see net.certware.planning.mspdi.DefaultTaskTypeType
	 * @generated
	 */
	EEnum getDefaultTaskTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DurationFormatType <em>Duration Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Format Type</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType
	 * @generated
	 */
	EEnum getDurationFormatType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DurationFormatType1 <em>Duration Format Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Format Type1</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType1
	 * @generated
	 */
	EEnum getDurationFormatType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DurationFormatType2 <em>Duration Format Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Format Type2</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType2
	 * @generated
	 */
	EEnum getDurationFormatType2();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DurationFormatType3 <em>Duration Format Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Format Type3</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType3
	 * @generated
	 */
	EEnum getDurationFormatType3();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DurationFormatType4 <em>Duration Format Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Format Type4</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType4
	 * @generated
	 */
	EEnum getDurationFormatType4();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.DurationFormatType5 <em>Duration Format Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Format Type5</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType5
	 * @generated
	 */
	EEnum getDurationFormatType5();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.EarnedValueMethodType <em>Earned Value Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Earned Value Method Type</em>'.
	 * @see net.certware.planning.mspdi.EarnedValueMethodType
	 * @generated
	 */
	EEnum getEarnedValueMethodType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.EarnedValueMethodType1 <em>Earned Value Method Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Earned Value Method Type1</em>'.
	 * @see net.certware.planning.mspdi.EarnedValueMethodType1
	 * @generated
	 */
	EEnum getEarnedValueMethodType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.ElemTypeType <em>Elem Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Elem Type Type</em>'.
	 * @see net.certware.planning.mspdi.ElemTypeType
	 * @generated
	 */
	EEnum getElemTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.FixedCostAccrualType <em>Fixed Cost Accrual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fixed Cost Accrual Type</em>'.
	 * @see net.certware.planning.mspdi.FixedCostAccrualType
	 * @generated
	 */
	EEnum getFixedCostAccrualType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.FYStartDateType <em>FY Start Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FY Start Date Type</em>'.
	 * @see net.certware.planning.mspdi.FYStartDateType
	 * @generated
	 */
	EEnum getFYStartDateType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.LagFormatType <em>Lag Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lag Format Type</em>'.
	 * @see net.certware.planning.mspdi.LagFormatType
	 * @generated
	 */
	EEnum getLagFormatType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.LevelingDelayFormatType <em>Leveling Delay Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leveling Delay Format Type</em>'.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType
	 * @generated
	 */
	EEnum getLevelingDelayFormatType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.LevelingDelayFormatType1 <em>Leveling Delay Format Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leveling Delay Format Type1</em>'.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
	 * @generated
	 */
	EEnum getLevelingDelayFormatType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.MonthItemType <em>Month Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month Item Type</em>'.
	 * @see net.certware.planning.mspdi.MonthItemType
	 * @generated
	 */
	EEnum getMonthItemType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.MonthPositionType <em>Month Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month Position Type</em>'.
	 * @see net.certware.planning.mspdi.MonthPositionType
	 * @generated
	 */
	EEnum getMonthPositionType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.MonthType <em>Month Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Month Type</em>'.
	 * @see net.certware.planning.mspdi.MonthType
	 * @generated
	 */
	EEnum getMonthType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.NewTaskStartDateType <em>New Task Start Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>New Task Start Date Type</em>'.
	 * @see net.certware.planning.mspdi.NewTaskStartDateType
	 * @generated
	 */
	EEnum getNewTaskStartDateType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.OvertimeRateFormatType <em>Overtime Rate Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overtime Rate Format Type</em>'.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType
	 * @generated
	 */
	EEnum getOvertimeRateFormatType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.OvertimeRateFormatType1 <em>Overtime Rate Format Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overtime Rate Format Type1</em>'.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
	 * @generated
	 */
	EEnum getOvertimeRateFormatType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.RateTableType <em>Rate Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rate Table Type</em>'.
	 * @see net.certware.planning.mspdi.RateTableType
	 * @generated
	 */
	EEnum getRateTableType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.RollupTypeType <em>Rollup Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rollup Type Type</em>'.
	 * @see net.certware.planning.mspdi.RollupTypeType
	 * @generated
	 */
	EEnum getRollupTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.StandardRateFormatType <em>Standard Rate Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Rate Format Type</em>'.
	 * @see net.certware.planning.mspdi.StandardRateFormatType
	 * @generated
	 */
	EEnum getStandardRateFormatType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.StandardRateFormatType1 <em>Standard Rate Format Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Rate Format Type1</em>'.
	 * @see net.certware.planning.mspdi.StandardRateFormatType1
	 * @generated
	 */
	EEnum getStandardRateFormatType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see net.certware.planning.mspdi.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType1 <em>Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type1</em>'.
	 * @see net.certware.planning.mspdi.TypeType1
	 * @generated
	 */
	EEnum getTypeType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType2 <em>Type Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type2</em>'.
	 * @see net.certware.planning.mspdi.TypeType2
	 * @generated
	 */
	EEnum getTypeType2();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType3 <em>Type Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type3</em>'.
	 * @see net.certware.planning.mspdi.TypeType3
	 * @generated
	 */
	EEnum getTypeType3();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType4 <em>Type Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type4</em>'.
	 * @see net.certware.planning.mspdi.TypeType4
	 * @generated
	 */
	EEnum getTypeType4();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType5 <em>Type Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type5</em>'.
	 * @see net.certware.planning.mspdi.TypeType5
	 * @generated
	 */
	EEnum getTypeType5();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType6 <em>Type Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type6</em>'.
	 * @see net.certware.planning.mspdi.TypeType6
	 * @generated
	 */
	EEnum getTypeType6();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.TypeType7 <em>Type Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type7</em>'.
	 * @see net.certware.planning.mspdi.TypeType7
	 * @generated
	 */
	EEnum getTypeType7();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see net.certware.planning.mspdi.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.ValuelistSortOrderType <em>Valuelist Sort Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valuelist Sort Order Type</em>'.
	 * @see net.certware.planning.mspdi.ValuelistSortOrderType
	 * @generated
	 */
	EEnum getValuelistSortOrderType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.WeekStartDayType <em>Week Start Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Start Day Type</em>'.
	 * @see net.certware.planning.mspdi.WeekStartDayType
	 * @generated
	 */
	EEnum getWeekStartDayType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.WorkContourType <em>Work Contour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Contour Type</em>'.
	 * @see net.certware.planning.mspdi.WorkContourType
	 * @generated
	 */
	EEnum getWorkContourType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.WorkFormatType <em>Work Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Format Type</em>'.
	 * @see net.certware.planning.mspdi.WorkFormatType
	 * @generated
	 */
	EEnum getWorkFormatType();

	/**
	 * Returns the meta object for enum '{@link net.certware.planning.mspdi.WorkGroupType <em>Work Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Group Type</em>'.
	 * @see net.certware.planning.mspdi.WorkGroupType
	 * @generated
	 */
	EEnum getWorkGroupType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.AccrueAtType <em>Accrue At Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Accrue At Type Object</em>'.
	 * @see net.certware.planning.mspdi.AccrueAtType
	 * @model instanceClass="net.certware.planning.mspdi.AccrueAtType"
	 *        extendedMetaData="name='AccrueAt_._type:Object' baseType='AccrueAt_._type'"
	 * @generated
	 */
	EDataType getAccrueAtTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Active Directory GUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Active Directory GUID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ActiveDirectoryGUID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='16'"
	 * @generated
	 */
	EDataType getActiveDirectoryGUIDType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alias Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Alias_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
	 * @generated
	 */
	EDataType getAliasType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Author Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Author_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getAuthorType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.BaselineForEarnedValueType <em>Baseline For Earned Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Baseline For Earned Value Type Object</em>'.
	 * @see net.certware.planning.mspdi.BaselineForEarnedValueType
	 * @model instanceClass="net.certware.planning.mspdi.BaselineForEarnedValueType"
	 *        extendedMetaData="name='BaselineForEarnedValue_._type:Object' baseType='BaselineForEarnedValue_._type'"
	 * @generated
	 */
	EDataType getBaselineForEarnedValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.BookingTypeType <em>Booking Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Booking Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.BookingTypeType
	 * @model instanceClass="net.certware.planning.mspdi.BookingTypeType"
	 *        extendedMetaData="name='BookingType_._type:Object' baseType='BookingType_._type'"
	 * @generated
	 */
	EDataType getBookingTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.BookingTypeType1 <em>Booking Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Booking Type Type Object1</em>'.
	 * @see net.certware.planning.mspdi.BookingTypeType1
	 * @model instanceClass="net.certware.planning.mspdi.BookingTypeType1"
	 *        extendedMetaData="name='BookingType_._1_._type:Object' baseType='BookingType_._1_._type'"
	 * @generated
	 */
	EDataType getBookingTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.CalculationTypeType <em>Calculation Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calculation Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.CalculationTypeType
	 * @model instanceClass="net.certware.planning.mspdi.CalculationTypeType"
	 *        extendedMetaData="name='CalculationType_._type:Object' baseType='CalculationType_._type'"
	 * @generated
	 */
	EDataType getCalculationTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Category Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Category_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getCategoryType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.CFTypeType <em>CF Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CF Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.CFTypeType
	 * @model instanceClass="net.certware.planning.mspdi.CFTypeType"
	 *        extendedMetaData="name='CFType_._type:Object' baseType='CFType_._type'"
	 * @generated
	 */
	EDataType getCFTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Code_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getCodeType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.CommitmentTypeType <em>Commitment Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Commitment Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.CommitmentTypeType
	 * @model instanceClass="net.certware.planning.mspdi.CommitmentTypeType"
	 *        extendedMetaData="name='CommitmentType_._type:Object' baseType='CommitmentType_._type'"
	 * @generated
	 */
	EDataType getCommitmentTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Company Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Company Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Company_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getCompanyType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.ConstraintTypeType <em>Constraint Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constraint Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.ConstraintTypeType
	 * @model instanceClass="net.certware.planning.mspdi.ConstraintTypeType"
	 *        extendedMetaData="name='ConstraintType_._type:Object' baseType='ConstraintType_._type'"
	 * @generated
	 */
	EDataType getConstraintTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contact Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Contact_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getContactType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.CostRateTableType <em>Cost Rate Table Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Rate Table Type Object</em>'.
	 * @see net.certware.planning.mspdi.CostRateTableType
	 * @model instanceClass="net.certware.planning.mspdi.CostRateTableType"
	 *        extendedMetaData="name='CostRateTable_._type:Object' baseType='CostRateTable_._type'"
	 * @generated
	 */
	EDataType getCostRateTableTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Currency Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CurrencyCode_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='3'"
	 * @generated
	 */
	EDataType getCurrencyCodeType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.CurrencySymbolPositionType <em>Currency Symbol Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Symbol Position Type Object</em>'.
	 * @see net.certware.planning.mspdi.CurrencySymbolPositionType
	 * @model instanceClass="net.certware.planning.mspdi.CurrencySymbolPositionType"
	 *        extendedMetaData="name='CurrencySymbolPosition_._type:Object' baseType='CurrencySymbolPosition_._type'"
	 * @generated
	 */
	EDataType getCurrencySymbolPositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Currency Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Symbol Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CurrencySymbol_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='20'"
	 * @generated
	 */
	EDataType getCurrencySymbolType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DayTypeType <em>Day Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Day Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.DayTypeType
	 * @model instanceClass="net.certware.planning.mspdi.DayTypeType"
	 *        extendedMetaData="name='DayType_._type:Object' baseType='DayType_._type'"
	 * @generated
	 */
	EDataType getDayTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DayTypeType1 <em>Day Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Day Type Type Object1</em>'.
	 * @see net.certware.planning.mspdi.DayTypeType1
	 * @model instanceClass="net.certware.planning.mspdi.DayTypeType1"
	 *        extendedMetaData="name='DayType_._1_._type:Object' baseType='DayType_._1_._type'"
	 * @generated
	 */
	EDataType getDayTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DefaultFixedCostAccrualType <em>Default Fixed Cost Accrual Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Fixed Cost Accrual Type Object</em>'.
	 * @see net.certware.planning.mspdi.DefaultFixedCostAccrualType
	 * @model instanceClass="net.certware.planning.mspdi.DefaultFixedCostAccrualType"
	 *        extendedMetaData="name='DefaultFixedCostAccrual_._type:Object' baseType='DefaultFixedCostAccrual_._type'"
	 * @generated
	 */
	EDataType getDefaultFixedCostAccrualTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DefaultTaskEVMethodType <em>Default Task EV Method Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Task EV Method Type Object</em>'.
	 * @see net.certware.planning.mspdi.DefaultTaskEVMethodType
	 * @model instanceClass="net.certware.planning.mspdi.DefaultTaskEVMethodType"
	 *        extendedMetaData="name='DefaultTaskEVMethod_._type:Object' baseType='DefaultTaskEVMethod_._type'"
	 * @generated
	 */
	EDataType getDefaultTaskEVMethodTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DefaultTaskTypeType <em>Default Task Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Default Task Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.DefaultTaskTypeType
	 * @model instanceClass="net.certware.planning.mspdi.DefaultTaskTypeType"
	 *        extendedMetaData="name='DefaultTaskType_._type:Object' baseType='DefaultTaskType_._type'"
	 * @generated
	 */
	EDataType getDefaultTaskTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DurationFormatType4 <em>Duration Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration Format Type Object</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType4
	 * @model instanceClass="net.certware.planning.mspdi.DurationFormatType4"
	 *        extendedMetaData="name='DurationFormat_._4_._type:Object' baseType='DurationFormat_._4_._type'"
	 * @generated
	 */
	EDataType getDurationFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DurationFormatType1 <em>Duration Format Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration Format Type Object1</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType1
	 * @model instanceClass="net.certware.planning.mspdi.DurationFormatType1"
	 *        extendedMetaData="name='DurationFormat_._1_._type:Object' baseType='DurationFormat_._1_._type'"
	 * @generated
	 */
	EDataType getDurationFormatTypeObject1();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DurationFormatType2 <em>Duration Format Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration Format Type Object2</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType2
	 * @model instanceClass="net.certware.planning.mspdi.DurationFormatType2"
	 *        extendedMetaData="name='DurationFormat_._2_._type:Object' baseType='DurationFormat_._2_._type'"
	 * @generated
	 */
	EDataType getDurationFormatTypeObject2();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DurationFormatType3 <em>Duration Format Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration Format Type Object3</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType3
	 * @model instanceClass="net.certware.planning.mspdi.DurationFormatType3"
	 *        extendedMetaData="name='DurationFormat_._3_._type:Object' baseType='DurationFormat_._3_._type'"
	 * @generated
	 */
	EDataType getDurationFormatTypeObject3();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DurationFormatType <em>Duration Format Type Object4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration Format Type Object4</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType
	 * @model instanceClass="net.certware.planning.mspdi.DurationFormatType"
	 *        extendedMetaData="name='DurationFormat_._type:Object' baseType='DurationFormat_._type'"
	 * @generated
	 */
	EDataType getDurationFormatTypeObject4();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.DurationFormatType5 <em>Duration Format Type Object5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration Format Type Object5</em>'.
	 * @see net.certware.planning.mspdi.DurationFormatType5
	 * @model instanceClass="net.certware.planning.mspdi.DurationFormatType5"
	 *        extendedMetaData="name='DurationFormat_._5_._type:Object' baseType='DurationFormat_._5_._type'"
	 * @generated
	 */
	EDataType getDurationFormatTypeObject5();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.EarnedValueMethodType <em>Earned Value Method Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Earned Value Method Type Object</em>'.
	 * @see net.certware.planning.mspdi.EarnedValueMethodType
	 * @model instanceClass="net.certware.planning.mspdi.EarnedValueMethodType"
	 *        extendedMetaData="name='EarnedValueMethod_._type:Object' baseType='EarnedValueMethod_._type'"
	 * @generated
	 */
	EDataType getEarnedValueMethodTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.EarnedValueMethodType1 <em>Earned Value Method Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Earned Value Method Type Object1</em>'.
	 * @see net.certware.planning.mspdi.EarnedValueMethodType1
	 * @model instanceClass="net.certware.planning.mspdi.EarnedValueMethodType1"
	 *        extendedMetaData="name='EarnedValueMethod_._1_._type:Object' baseType='EarnedValueMethod_._1_._type'"
	 * @generated
	 */
	EDataType getEarnedValueMethodTypeObject1();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.ElemTypeType <em>Elem Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Elem Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.ElemTypeType
	 * @model instanceClass="net.certware.planning.mspdi.ElemTypeType"
	 *        extendedMetaData="name='ElemType_._type:Object' baseType='ElemType_._type'"
	 * @generated
	 */
	EDataType getElemTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Email Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Email Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EmailAddress_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getEmailAddressType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>External Task Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>External Task Project Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ExternalTaskProject_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getExternalTaskProjectType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.FixedCostAccrualType <em>Fixed Cost Accrual Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fixed Cost Accrual Type Object</em>'.
	 * @see net.certware.planning.mspdi.FixedCostAccrualType
	 * @model instanceClass="net.certware.planning.mspdi.FixedCostAccrualType"
	 *        extendedMetaData="name='FixedCostAccrual_._type:Object' baseType='FixedCostAccrual_._type'"
	 * @generated
	 */
	EDataType getFixedCostAccrualTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.FYStartDateType <em>FY Start Date Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FY Start Date Type Object</em>'.
	 * @see net.certware.planning.mspdi.FYStartDateType
	 * @model instanceClass="net.certware.planning.mspdi.FYStartDateType"
	 *        extendedMetaData="name='FYStartDate_._type:Object' baseType='FYStartDate_._type'"
	 * @generated
	 */
	EDataType getFYStartDateTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Group_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getGroupType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HyperlinkAddress_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkAddressType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Address Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HyperlinkAddress_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkAddressType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Address Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Address Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HyperlinkAddress_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkAddressType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Sub Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Sub Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HyperlinkSubAddress_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkSubAddressType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Sub Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Sub Address Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HyperlinkSubAddress_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkSubAddressType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Sub Address Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Sub Address Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HyperlinkSubAddress_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkSubAddressType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Hyperlink_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Hyperlink_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hyperlink Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyperlink Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Hyperlink_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getHyperlinkType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Initials Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Initials Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Initials_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getInitialsType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.LagFormatType <em>Lag Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lag Format Type Object</em>'.
	 * @see net.certware.planning.mspdi.LagFormatType
	 * @model instanceClass="net.certware.planning.mspdi.LagFormatType"
	 *        extendedMetaData="name='LagFormat_._type:Object' baseType='LagFormat_._type'"
	 * @generated
	 */
	EDataType getLagFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.LevelingDelayFormatType <em>Leveling Delay Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leveling Delay Format Type Object</em>'.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType
	 * @model instanceClass="net.certware.planning.mspdi.LevelingDelayFormatType"
	 *        extendedMetaData="name='LevelingDelayFormat_._type:Object' baseType='LevelingDelayFormat_._type'"
	 * @generated
	 */
	EDataType getLevelingDelayFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.LevelingDelayFormatType1 <em>Leveling Delay Format Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leveling Delay Format Type Object1</em>'.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
	 * @model instanceClass="net.certware.planning.mspdi.LevelingDelayFormatType1"
	 *        extendedMetaData="name='LevelingDelayFormat_._1_._type:Object' baseType='LevelingDelayFormat_._1_._type'"
	 * @generated
	 */
	EDataType getLevelingDelayFormatTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Manager Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Manager_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getManagerType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Material Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Material Label Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MaterialLabel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getMaterialLabelType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.MonthItemType <em>Month Item Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Month Item Type Object</em>'.
	 * @see net.certware.planning.mspdi.MonthItemType
	 * @model instanceClass="net.certware.planning.mspdi.MonthItemType"
	 *        extendedMetaData="name='MonthItem_._type:Object' baseType='MonthItem_._type'"
	 * @generated
	 */
	EDataType getMonthItemTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.MonthPositionType <em>Month Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Month Position Type Object</em>'.
	 * @see net.certware.planning.mspdi.MonthPositionType
	 * @model instanceClass="net.certware.planning.mspdi.MonthPositionType"
	 *        extendedMetaData="name='MonthPosition_._type:Object' baseType='MonthPosition_._type'"
	 * @generated
	 */
	EDataType getMonthPositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.MonthType <em>Month Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Month Type Object</em>'.
	 * @see net.certware.planning.mspdi.MonthType
	 * @model instanceClass="net.certware.planning.mspdi.MonthType"
	 *        extendedMetaData="name='Month_._type:Object' baseType='Month_._type'"
	 * @generated
	 */
	EDataType getMonthTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Name_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Name_._1_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getNameType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Name_._2_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getNameType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type3</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Name_._3_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getNameType3();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type4</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Name_._4_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getNameType4();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type5</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Name_._5_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getNameType5();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.NewTaskStartDateType <em>New Task Start Date Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>New Task Start Date Type Object</em>'.
	 * @see net.certware.planning.mspdi.NewTaskStartDateType
	 * @model instanceClass="net.certware.planning.mspdi.NewTaskStartDateType"
	 *        extendedMetaData="name='NewTaskStartDate_._type:Object' baseType='NewTaskStartDate_._type'"
	 * @generated
	 */
	EDataType getNewTaskStartDateTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>NT Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NT Account Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NTAccount_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getNTAccountType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Outline Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Outline Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='OutlineNumber_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getOutlineNumberType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.OvertimeRateFormatType <em>Overtime Rate Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Overtime Rate Format Type Object</em>'.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType
	 * @model instanceClass="net.certware.planning.mspdi.OvertimeRateFormatType"
	 *        extendedMetaData="name='OvertimeRateFormat_._type:Object' baseType='OvertimeRateFormat_._type'"
	 * @generated
	 */
	EDataType getOvertimeRateFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.OvertimeRateFormatType1 <em>Overtime Rate Format Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Overtime Rate Format Type Object1</em>'.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
	 * @model instanceClass="net.certware.planning.mspdi.OvertimeRateFormatType1"
	 *        extendedMetaData="name='OvertimeRateFormat_._1_._type:Object' baseType='OvertimeRateFormat_._1_._type'"
	 * @generated
	 */
	EDataType getOvertimeRateFormatTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Phonetic Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Phonetic Alias Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PhoneticAlias_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
	 * @generated
	 */
	EDataType getPhoneticAliasType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Phonetics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Phonetics Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Phonetics_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getPhoneticsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Prefix Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Prefix_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
	 * @generated
	 */
	EDataType getPrefixType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.RateTableType <em>Rate Table Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rate Table Type Object</em>'.
	 * @see net.certware.planning.mspdi.RateTableType
	 * @model instanceClass="net.certware.planning.mspdi.RateTableType"
	 *        extendedMetaData="name='RateTable_._type:Object' baseType='RateTable_._type'"
	 * @generated
	 */
	EDataType getRateTableTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.RollupTypeType <em>Rollup Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rollup Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.RollupTypeType
	 * @model instanceClass="net.certware.planning.mspdi.RollupTypeType"
	 *        extendedMetaData="name='RollupType_._type:Object' baseType='RollupType_._type'"
	 * @generated
	 */
	EDataType getRollupTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.StandardRateFormatType <em>Standard Rate Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Standard Rate Format Type Object</em>'.
	 * @see net.certware.planning.mspdi.StandardRateFormatType
	 * @model instanceClass="net.certware.planning.mspdi.StandardRateFormatType"
	 *        extendedMetaData="name='StandardRateFormat_._type:Object' baseType='StandardRateFormat_._type'"
	 * @generated
	 */
	EDataType getStandardRateFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.StandardRateFormatType1 <em>Standard Rate Format Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Standard Rate Format Type Object1</em>'.
	 * @see net.certware.planning.mspdi.StandardRateFormatType1
	 * @model instanceClass="net.certware.planning.mspdi.StandardRateFormatType1"
	 *        extendedMetaData="name='StandardRateFormat_._1_._type:Object' baseType='StandardRateFormat_._1_._type'"
	 * @generated
	 */
	EDataType getStandardRateFormatTypeObject1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Subject Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Subject_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getSubjectType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Subproject Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Subproject Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SubprojectName_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getSubprojectNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Title Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Title_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='512'"
	 * @generated
	 */
	EDataType getTitleType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType3 <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see net.certware.planning.mspdi.TypeType3
	 * @model instanceClass="net.certware.planning.mspdi.TypeType3"
	 *        extendedMetaData="name='Type_._3_._type:Object' baseType='Type_._3_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType5 <em>Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object1</em>'.
	 * @see net.certware.planning.mspdi.TypeType5
	 * @model instanceClass="net.certware.planning.mspdi.TypeType5"
	 *        extendedMetaData="name='Type_._5_._type:Object' baseType='Type_._5_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType <em>Type Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object2</em>'.
	 * @see net.certware.planning.mspdi.TypeType
	 * @model instanceClass="net.certware.planning.mspdi.TypeType"
	 *        extendedMetaData="name='Type_._type:Object' baseType='Type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject2();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType1 <em>Type Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object3</em>'.
	 * @see net.certware.planning.mspdi.TypeType1
	 * @model instanceClass="net.certware.planning.mspdi.TypeType1"
	 *        extendedMetaData="name='Type_._1_._type:Object' baseType='Type_._1_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject3();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType2 <em>Type Type Object4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object4</em>'.
	 * @see net.certware.planning.mspdi.TypeType2
	 * @model instanceClass="net.certware.planning.mspdi.TypeType2"
	 *        extendedMetaData="name='Type_._2_._type:Object' baseType='Type_._2_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject4();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType4 <em>Type Type Object5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object5</em>'.
	 * @see net.certware.planning.mspdi.TypeType4
	 * @model instanceClass="net.certware.planning.mspdi.TypeType4"
	 *        extendedMetaData="name='Type_._4_._type:Object' baseType='Type_._4_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject5();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType6 <em>Type Type Object6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object6</em>'.
	 * @see net.certware.planning.mspdi.TypeType6
	 * @model instanceClass="net.certware.planning.mspdi.TypeType6"
	 *        extendedMetaData="name='Type_._6_._type:Object' baseType='Type_._6_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject6();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.TypeType7 <em>Type Type Object7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object7</em>'.
	 * @see net.certware.planning.mspdi.TypeType7
	 * @model instanceClass="net.certware.planning.mspdi.TypeType7"
	 *        extendedMetaData="name='Type_._7_._type:Object' baseType='Type_._7_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject7();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='16'"
	 * @generated
	 */
	EDataType getUIDType();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.UnitType <em>Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Type Object</em>'.
	 * @see net.certware.planning.mspdi.UnitType
	 * @model instanceClass="net.certware.planning.mspdi.UnitType"
	 *        extendedMetaData="name='Unit_._type:Object' baseType='Unit_._type'"
	 * @generated
	 */
	EDataType getUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.ValuelistSortOrderType <em>Valuelist Sort Order Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valuelist Sort Order Type Object</em>'.
	 * @see net.certware.planning.mspdi.ValuelistSortOrderType
	 * @model instanceClass="net.certware.planning.mspdi.ValuelistSortOrderType"
	 *        extendedMetaData="name='ValuelistSortOrder_._type:Object' baseType='ValuelistSortOrder_._type'"
	 * @generated
	 */
	EDataType getValuelistSortOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.WeekStartDayType <em>Week Start Day Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Week Start Day Type Object</em>'.
	 * @see net.certware.planning.mspdi.WeekStartDayType
	 * @model instanceClass="net.certware.planning.mspdi.WeekStartDayType"
	 *        extendedMetaData="name='WeekStartDay_._type:Object' baseType='WeekStartDay_._type'"
	 * @generated
	 */
	EDataType getWeekStartDayTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.WorkContourType <em>Work Contour Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Work Contour Type Object</em>'.
	 * @see net.certware.planning.mspdi.WorkContourType
	 * @model instanceClass="net.certware.planning.mspdi.WorkContourType"
	 *        extendedMetaData="name='WorkContour_._type:Object' baseType='WorkContour_._type'"
	 * @generated
	 */
	EDataType getWorkContourTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.WorkFormatType <em>Work Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Work Format Type Object</em>'.
	 * @see net.certware.planning.mspdi.WorkFormatType
	 * @model instanceClass="net.certware.planning.mspdi.WorkFormatType"
	 *        extendedMetaData="name='WorkFormat_._type:Object' baseType='WorkFormat_._type'"
	 * @generated
	 */
	EDataType getWorkFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.planning.mspdi.WorkGroupType <em>Work Group Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Work Group Type Object</em>'.
	 * @see net.certware.planning.mspdi.WorkGroupType
	 * @model instanceClass="net.certware.planning.mspdi.WorkGroupType"
	 *        extendedMetaData="name='WorkGroup_._type:Object' baseType='WorkGroup_._type'"
	 * @generated
	 */
	EDataType getWorkGroupTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MspdiFactory getMspdiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.AssignmentsTypeImpl <em>Assignments Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.AssignmentsTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAssignmentsType()
		 * @generated
		 */
		EClass ASSIGNMENTS_TYPE = eINSTANCE.getAssignmentsType();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENTS_TYPE__ASSIGNMENT = eINSTANCE.getAssignmentsType_Assignment();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl <em>Assignment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.AssignmentTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAssignmentType()
		 * @generated
		 */
		EClass ASSIGNMENT_TYPE = eINSTANCE.getAssignmentType();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__UID = eINSTANCE.getAssignmentType_UID();

		/**
		 * The meta object literal for the '<em><b>Task UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__TASK_UID = eINSTANCE.getAssignmentType_TaskUID();

		/**
		 * The meta object literal for the '<em><b>Resource UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__RESOURCE_UID = eINSTANCE.getAssignmentType_ResourceUID();

		/**
		 * The meta object literal for the '<em><b>Percent Work Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE = eINSTANCE.getAssignmentType_PercentWorkComplete();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_COST = eINSTANCE.getAssignmentType_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Actual Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_FINISH = eINSTANCE.getAssignmentType_ActualFinish();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST = eINSTANCE.getAssignmentType_ActualOvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK = eINSTANCE.getAssignmentType_ActualOvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Actual Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_START = eINSTANCE.getAssignmentType_ActualStart();

		/**
		 * The meta object literal for the '<em><b>Actual Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_WORK = eINSTANCE.getAssignmentType_ActualWork();

		/**
		 * The meta object literal for the '<em><b>ACWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACWP = eINSTANCE.getAssignmentType_ACWP();

		/**
		 * The meta object literal for the '<em><b>Confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__CONFIRMED = eINSTANCE.getAssignmentType_Confirmed();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__COST = eINSTANCE.getAssignmentType_Cost();

		/**
		 * The meta object literal for the '<em><b>Cost Rate Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__COST_RATE_TABLE = eINSTANCE.getAssignmentType_CostRateTable();

		/**
		 * The meta object literal for the '<em><b>Cost Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__COST_VARIANCE = eINSTANCE.getAssignmentType_CostVariance();

		/**
		 * The meta object literal for the '<em><b>CV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__CV = eINSTANCE.getAssignmentType_CV();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__DELAY = eINSTANCE.getAssignmentType_Delay();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__FINISH = eINSTANCE.getAssignmentType_Finish();

		/**
		 * The meta object literal for the '<em><b>Finish Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__FINISH_VARIANCE = eINSTANCE.getAssignmentType_FinishVariance();

		/**
		 * The meta object literal for the '<em><b>Hyperlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__HYPERLINK = eINSTANCE.getAssignmentType_Hyperlink();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__HYPERLINK_ADDRESS = eINSTANCE.getAssignmentType_HyperlinkAddress();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Sub Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS = eINSTANCE.getAssignmentType_HyperlinkSubAddress();

		/**
		 * The meta object literal for the '<em><b>Work Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__WORK_VARIANCE = eINSTANCE.getAssignmentType_WorkVariance();

		/**
		 * The meta object literal for the '<em><b>Has Fixed Rate Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS = eINSTANCE.getAssignmentType_HasFixedRateUnits();

		/**
		 * The meta object literal for the '<em><b>Fixed Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__FIXED_MATERIAL = eINSTANCE.getAssignmentType_FixedMaterial();

		/**
		 * The meta object literal for the '<em><b>Leveling Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__LEVELING_DELAY = eINSTANCE.getAssignmentType_LevelingDelay();

		/**
		 * The meta object literal for the '<em><b>Leveling Delay Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT = eINSTANCE.getAssignmentType_LevelingDelayFormat();

		/**
		 * The meta object literal for the '<em><b>Linked Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__LINKED_FIELDS = eINSTANCE.getAssignmentType_LinkedFields();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__MILESTONE = eINSTANCE.getAssignmentType_Milestone();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__NOTES = eINSTANCE.getAssignmentType_Notes();

		/**
		 * The meta object literal for the '<em><b>Overallocated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__OVERALLOCATED = eINSTANCE.getAssignmentType_Overallocated();

		/**
		 * The meta object literal for the '<em><b>Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__OVERTIME_COST = eINSTANCE.getAssignmentType_OvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__OVERTIME_WORK = eINSTANCE.getAssignmentType_OvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Peak Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__PEAK_UNITS = eINSTANCE.getAssignmentType_PeakUnits();

		/**
		 * The meta object literal for the '<em><b>Regular Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__REGULAR_WORK = eINSTANCE.getAssignmentType_RegularWork();

		/**
		 * The meta object literal for the '<em><b>Remaining Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__REMAINING_COST = eINSTANCE.getAssignmentType_RemainingCost();

		/**
		 * The meta object literal for the '<em><b>Remaining Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST = eINSTANCE.getAssignmentType_RemainingOvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Remaining Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK = eINSTANCE.getAssignmentType_RemainingOvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Remaining Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__REMAINING_WORK = eINSTANCE.getAssignmentType_RemainingWork();

		/**
		 * The meta object literal for the '<em><b>Response Pending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__RESPONSE_PENDING = eINSTANCE.getAssignmentType_ResponsePending();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__START = eINSTANCE.getAssignmentType_Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__STOP = eINSTANCE.getAssignmentType_Stop();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__RESUME = eINSTANCE.getAssignmentType_Resume();

		/**
		 * The meta object literal for the '<em><b>Start Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__START_VARIANCE = eINSTANCE.getAssignmentType_StartVariance();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__SUMMARY = eINSTANCE.getAssignmentType_Summary();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__SV = eINSTANCE.getAssignmentType_SV();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__UNITS = eINSTANCE.getAssignmentType_Units();

		/**
		 * The meta object literal for the '<em><b>Update Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__UPDATE_NEEDED = eINSTANCE.getAssignmentType_UpdateNeeded();

		/**
		 * The meta object literal for the '<em><b>VAC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__VAC = eINSTANCE.getAssignmentType_VAC();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__WORK = eINSTANCE.getAssignmentType_Work();

		/**
		 * The meta object literal for the '<em><b>Work Contour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__WORK_CONTOUR = eINSTANCE.getAssignmentType_WorkContour();

		/**
		 * The meta object literal for the '<em><b>BCWS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__BCWS = eINSTANCE.getAssignmentType_BCWS();

		/**
		 * The meta object literal for the '<em><b>BCWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__BCWP = eINSTANCE.getAssignmentType_BCWP();

		/**
		 * The meta object literal for the '<em><b>Booking Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__BOOKING_TYPE = eINSTANCE.getAssignmentType_BookingType();

		/**
		 * The meta object literal for the '<em><b>Actual Work Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED = eINSTANCE.getAssignmentType_ActualWorkProtected();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Work Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED = eINSTANCE.getAssignmentType_ActualOvertimeWorkProtected();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__CREATION_DATE = eINSTANCE.getAssignmentType_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Assn Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ASSN_OWNER = eINSTANCE.getAssignmentType_AssnOwner();

		/**
		 * The meta object literal for the '<em><b>Assn Owner Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__ASSN_OWNER_GUID = eINSTANCE.getAssignmentType_AssnOwnerGuid();

		/**
		 * The meta object literal for the '<em><b>Budget Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__BUDGET_COST = eINSTANCE.getAssignmentType_BudgetCost();

		/**
		 * The meta object literal for the '<em><b>Budget Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_TYPE__BUDGET_WORK = eINSTANCE.getAssignmentType_BudgetWork();

		/**
		 * The meta object literal for the '<em><b>Extended Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE = eINSTANCE.getAssignmentType_ExtendedAttribute();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__BASELINE = eINSTANCE.getAssignmentType_Baseline();

		/**
		 * The meta object literal for the '<em><b>F404000</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404000 = eINSTANCE.getAssignmentType_F404000();

		/**
		 * The meta object literal for the '<em><b>F404001</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404001 = eINSTANCE.getAssignmentType_F404001();

		/**
		 * The meta object literal for the '<em><b>F404002</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404002 = eINSTANCE.getAssignmentType_F404002();

		/**
		 * The meta object literal for the '<em><b>F404003</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404003 = eINSTANCE.getAssignmentType_F404003();

		/**
		 * The meta object literal for the '<em><b>F404004</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404004 = eINSTANCE.getAssignmentType_F404004();

		/**
		 * The meta object literal for the '<em><b>F404005</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404005 = eINSTANCE.getAssignmentType_F404005();

		/**
		 * The meta object literal for the '<em><b>F404006</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404006 = eINSTANCE.getAssignmentType_F404006();

		/**
		 * The meta object literal for the '<em><b>F404007</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404007 = eINSTANCE.getAssignmentType_F404007();

		/**
		 * The meta object literal for the '<em><b>F404008</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404008 = eINSTANCE.getAssignmentType_F404008();

		/**
		 * The meta object literal for the '<em><b>F404009</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404009 = eINSTANCE.getAssignmentType_F404009();

		/**
		 * The meta object literal for the '<em><b>F4040 0a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40400A = eINSTANCE.getAssignmentType_F40400a();

		/**
		 * The meta object literal for the '<em><b>F4040 0b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40400B = eINSTANCE.getAssignmentType_F40400b();

		/**
		 * The meta object literal for the '<em><b>F4040 0c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40400C = eINSTANCE.getAssignmentType_F40400c();

		/**
		 * The meta object literal for the '<em><b>F4040 0d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40400D = eINSTANCE.getAssignmentType_F40400d();

		/**
		 * The meta object literal for the '<em><b>F4040 0e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40400E = eINSTANCE.getAssignmentType_F40400e();

		/**
		 * The meta object literal for the '<em><b>F4040 0f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40400F = eINSTANCE.getAssignmentType_F40400f();

		/**
		 * The meta object literal for the '<em><b>F404010</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404010 = eINSTANCE.getAssignmentType_F404010();

		/**
		 * The meta object literal for the '<em><b>F404011</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404011 = eINSTANCE.getAssignmentType_F404011();

		/**
		 * The meta object literal for the '<em><b>F404012</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404012 = eINSTANCE.getAssignmentType_F404012();

		/**
		 * The meta object literal for the '<em><b>F404013</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404013 = eINSTANCE.getAssignmentType_F404013();

		/**
		 * The meta object literal for the '<em><b>F404014</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404014 = eINSTANCE.getAssignmentType_F404014();

		/**
		 * The meta object literal for the '<em><b>F404015</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404015 = eINSTANCE.getAssignmentType_F404015();

		/**
		 * The meta object literal for the '<em><b>F404016</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404016 = eINSTANCE.getAssignmentType_F404016();

		/**
		 * The meta object literal for the '<em><b>F404017</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404017 = eINSTANCE.getAssignmentType_F404017();

		/**
		 * The meta object literal for the '<em><b>F404018</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404018 = eINSTANCE.getAssignmentType_F404018();

		/**
		 * The meta object literal for the '<em><b>F404019</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404019 = eINSTANCE.getAssignmentType_F404019();

		/**
		 * The meta object literal for the '<em><b>F4040 1a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40401A = eINSTANCE.getAssignmentType_F40401a();

		/**
		 * The meta object literal for the '<em><b>F4040 1b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40401B = eINSTANCE.getAssignmentType_F40401b();

		/**
		 * The meta object literal for the '<em><b>F4040 1c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40401C = eINSTANCE.getAssignmentType_F40401c();

		/**
		 * The meta object literal for the '<em><b>F4040 1d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40401D = eINSTANCE.getAssignmentType_F40401d();

		/**
		 * The meta object literal for the '<em><b>F4040 1e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40401E = eINSTANCE.getAssignmentType_F40401e();

		/**
		 * The meta object literal for the '<em><b>F4040 1f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40401F = eINSTANCE.getAssignmentType_F40401f();

		/**
		 * The meta object literal for the '<em><b>F404020</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404020 = eINSTANCE.getAssignmentType_F404020();

		/**
		 * The meta object literal for the '<em><b>F404021</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404021 = eINSTANCE.getAssignmentType_F404021();

		/**
		 * The meta object literal for the '<em><b>F404022</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404022 = eINSTANCE.getAssignmentType_F404022();

		/**
		 * The meta object literal for the '<em><b>F404023</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404023 = eINSTANCE.getAssignmentType_F404023();

		/**
		 * The meta object literal for the '<em><b>F404024</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404024 = eINSTANCE.getAssignmentType_F404024();

		/**
		 * The meta object literal for the '<em><b>F404025</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404025 = eINSTANCE.getAssignmentType_F404025();

		/**
		 * The meta object literal for the '<em><b>F404026</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404026 = eINSTANCE.getAssignmentType_F404026();

		/**
		 * The meta object literal for the '<em><b>F404027</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404027 = eINSTANCE.getAssignmentType_F404027();

		/**
		 * The meta object literal for the '<em><b>F404028</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404028 = eINSTANCE.getAssignmentType_F404028();

		/**
		 * The meta object literal for the '<em><b>F404029</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404029 = eINSTANCE.getAssignmentType_F404029();

		/**
		 * The meta object literal for the '<em><b>F4040 2a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40402A = eINSTANCE.getAssignmentType_F40402a();

		/**
		 * The meta object literal for the '<em><b>F4040 2b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40402B = eINSTANCE.getAssignmentType_F40402b();

		/**
		 * The meta object literal for the '<em><b>F4040 2c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40402C = eINSTANCE.getAssignmentType_F40402c();

		/**
		 * The meta object literal for the '<em><b>F4040 2d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40402D = eINSTANCE.getAssignmentType_F40402d();

		/**
		 * The meta object literal for the '<em><b>F4040 2e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40402E = eINSTANCE.getAssignmentType_F40402e();

		/**
		 * The meta object literal for the '<em><b>F4040 2f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40402F = eINSTANCE.getAssignmentType_F40402f();

		/**
		 * The meta object literal for the '<em><b>F404030</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404030 = eINSTANCE.getAssignmentType_F404030();

		/**
		 * The meta object literal for the '<em><b>F404031</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404031 = eINSTANCE.getAssignmentType_F404031();

		/**
		 * The meta object literal for the '<em><b>F404032</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404032 = eINSTANCE.getAssignmentType_F404032();

		/**
		 * The meta object literal for the '<em><b>F404033</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404033 = eINSTANCE.getAssignmentType_F404033();

		/**
		 * The meta object literal for the '<em><b>F404034</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404034 = eINSTANCE.getAssignmentType_F404034();

		/**
		 * The meta object literal for the '<em><b>F404035</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404035 = eINSTANCE.getAssignmentType_F404035();

		/**
		 * The meta object literal for the '<em><b>F404036</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404036 = eINSTANCE.getAssignmentType_F404036();

		/**
		 * The meta object literal for the '<em><b>F404037</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404037 = eINSTANCE.getAssignmentType_F404037();

		/**
		 * The meta object literal for the '<em><b>F404038</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404038 = eINSTANCE.getAssignmentType_F404038();

		/**
		 * The meta object literal for the '<em><b>F404039</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404039 = eINSTANCE.getAssignmentType_F404039();

		/**
		 * The meta object literal for the '<em><b>F4040 3a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40403A = eINSTANCE.getAssignmentType_F40403a();

		/**
		 * The meta object literal for the '<em><b>F4040 3b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40403B = eINSTANCE.getAssignmentType_F40403b();

		/**
		 * The meta object literal for the '<em><b>F4040 3c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40403C = eINSTANCE.getAssignmentType_F40403c();

		/**
		 * The meta object literal for the '<em><b>F4040 3d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40403D = eINSTANCE.getAssignmentType_F40403d();

		/**
		 * The meta object literal for the '<em><b>F4040 3e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40403E = eINSTANCE.getAssignmentType_F40403e();

		/**
		 * The meta object literal for the '<em><b>F4040 3f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40403F = eINSTANCE.getAssignmentType_F40403f();

		/**
		 * The meta object literal for the '<em><b>F404040</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404040 = eINSTANCE.getAssignmentType_F404040();

		/**
		 * The meta object literal for the '<em><b>F404041</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404041 = eINSTANCE.getAssignmentType_F404041();

		/**
		 * The meta object literal for the '<em><b>F404042</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404042 = eINSTANCE.getAssignmentType_F404042();

		/**
		 * The meta object literal for the '<em><b>F404043</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404043 = eINSTANCE.getAssignmentType_F404043();

		/**
		 * The meta object literal for the '<em><b>F404044</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404044 = eINSTANCE.getAssignmentType_F404044();

		/**
		 * The meta object literal for the '<em><b>F404045</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404045 = eINSTANCE.getAssignmentType_F404045();

		/**
		 * The meta object literal for the '<em><b>F404046</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404046 = eINSTANCE.getAssignmentType_F404046();

		/**
		 * The meta object literal for the '<em><b>F404047</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404047 = eINSTANCE.getAssignmentType_F404047();

		/**
		 * The meta object literal for the '<em><b>F404048</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404048 = eINSTANCE.getAssignmentType_F404048();

		/**
		 * The meta object literal for the '<em><b>F404049</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404049 = eINSTANCE.getAssignmentType_F404049();

		/**
		 * The meta object literal for the '<em><b>F4040 4a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40404A = eINSTANCE.getAssignmentType_F40404a();

		/**
		 * The meta object literal for the '<em><b>F4040 4b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40404B = eINSTANCE.getAssignmentType_F40404b();

		/**
		 * The meta object literal for the '<em><b>F4040 4c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40404C = eINSTANCE.getAssignmentType_F40404c();

		/**
		 * The meta object literal for the '<em><b>F4040 4d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40404D = eINSTANCE.getAssignmentType_F40404d();

		/**
		 * The meta object literal for the '<em><b>F4040 4e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40404E = eINSTANCE.getAssignmentType_F40404e();

		/**
		 * The meta object literal for the '<em><b>F4040 4f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40404F = eINSTANCE.getAssignmentType_F40404f();

		/**
		 * The meta object literal for the '<em><b>F404050</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404050 = eINSTANCE.getAssignmentType_F404050();

		/**
		 * The meta object literal for the '<em><b>F404051</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404051 = eINSTANCE.getAssignmentType_F404051();

		/**
		 * The meta object literal for the '<em><b>F404052</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404052 = eINSTANCE.getAssignmentType_F404052();

		/**
		 * The meta object literal for the '<em><b>F404053</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404053 = eINSTANCE.getAssignmentType_F404053();

		/**
		 * The meta object literal for the '<em><b>F404054</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404054 = eINSTANCE.getAssignmentType_F404054();

		/**
		 * The meta object literal for the '<em><b>F404055</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404055 = eINSTANCE.getAssignmentType_F404055();

		/**
		 * The meta object literal for the '<em><b>F404056</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404056 = eINSTANCE.getAssignmentType_F404056();

		/**
		 * The meta object literal for the '<em><b>F404057</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404057 = eINSTANCE.getAssignmentType_F404057();

		/**
		 * The meta object literal for the '<em><b>F404058</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404058 = eINSTANCE.getAssignmentType_F404058();

		/**
		 * The meta object literal for the '<em><b>F404059</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404059 = eINSTANCE.getAssignmentType_F404059();

		/**
		 * The meta object literal for the '<em><b>F4040 5a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40405A = eINSTANCE.getAssignmentType_F40405a();

		/**
		 * The meta object literal for the '<em><b>F4040 5b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40405B = eINSTANCE.getAssignmentType_F40405b();

		/**
		 * The meta object literal for the '<em><b>F4040 5c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40405C = eINSTANCE.getAssignmentType_F40405c();

		/**
		 * The meta object literal for the '<em><b>F4040 5d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40405D = eINSTANCE.getAssignmentType_F40405d();

		/**
		 * The meta object literal for the '<em><b>F4040 5e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40405E = eINSTANCE.getAssignmentType_F40405e();

		/**
		 * The meta object literal for the '<em><b>F4040 5f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40405F = eINSTANCE.getAssignmentType_F40405f();

		/**
		 * The meta object literal for the '<em><b>F404060</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404060 = eINSTANCE.getAssignmentType_F404060();

		/**
		 * The meta object literal for the '<em><b>F404061</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404061 = eINSTANCE.getAssignmentType_F404061();

		/**
		 * The meta object literal for the '<em><b>F404062</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404062 = eINSTANCE.getAssignmentType_F404062();

		/**
		 * The meta object literal for the '<em><b>F404063</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404063 = eINSTANCE.getAssignmentType_F404063();

		/**
		 * The meta object literal for the '<em><b>F404064</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404064 = eINSTANCE.getAssignmentType_F404064();

		/**
		 * The meta object literal for the '<em><b>F404065</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404065 = eINSTANCE.getAssignmentType_F404065();

		/**
		 * The meta object literal for the '<em><b>F404066</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404066 = eINSTANCE.getAssignmentType_F404066();

		/**
		 * The meta object literal for the '<em><b>F404067</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404067 = eINSTANCE.getAssignmentType_F404067();

		/**
		 * The meta object literal for the '<em><b>F404068</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404068 = eINSTANCE.getAssignmentType_F404068();

		/**
		 * The meta object literal for the '<em><b>F404069</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404069 = eINSTANCE.getAssignmentType_F404069();

		/**
		 * The meta object literal for the '<em><b>F4040 6a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40406A = eINSTANCE.getAssignmentType_F40406a();

		/**
		 * The meta object literal for the '<em><b>F4040 6b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40406B = eINSTANCE.getAssignmentType_F40406b();

		/**
		 * The meta object literal for the '<em><b>F4040 6c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40406C = eINSTANCE.getAssignmentType_F40406c();

		/**
		 * The meta object literal for the '<em><b>F4040 6d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40406D = eINSTANCE.getAssignmentType_F40406d();

		/**
		 * The meta object literal for the '<em><b>F4040 6e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40406E = eINSTANCE.getAssignmentType_F40406e();

		/**
		 * The meta object literal for the '<em><b>F4040 6f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40406F = eINSTANCE.getAssignmentType_F40406f();

		/**
		 * The meta object literal for the '<em><b>F404070</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404070 = eINSTANCE.getAssignmentType_F404070();

		/**
		 * The meta object literal for the '<em><b>F404071</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404071 = eINSTANCE.getAssignmentType_F404071();

		/**
		 * The meta object literal for the '<em><b>F404072</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404072 = eINSTANCE.getAssignmentType_F404072();

		/**
		 * The meta object literal for the '<em><b>F404073</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404073 = eINSTANCE.getAssignmentType_F404073();

		/**
		 * The meta object literal for the '<em><b>F404074</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404074 = eINSTANCE.getAssignmentType_F404074();

		/**
		 * The meta object literal for the '<em><b>F404075</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404075 = eINSTANCE.getAssignmentType_F404075();

		/**
		 * The meta object literal for the '<em><b>F404076</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404076 = eINSTANCE.getAssignmentType_F404076();

		/**
		 * The meta object literal for the '<em><b>F404077</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404077 = eINSTANCE.getAssignmentType_F404077();

		/**
		 * The meta object literal for the '<em><b>F404078</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404078 = eINSTANCE.getAssignmentType_F404078();

		/**
		 * The meta object literal for the '<em><b>F404079</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404079 = eINSTANCE.getAssignmentType_F404079();

		/**
		 * The meta object literal for the '<em><b>F4040 7a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40407A = eINSTANCE.getAssignmentType_F40407a();

		/**
		 * The meta object literal for the '<em><b>F4040 7b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40407B = eINSTANCE.getAssignmentType_F40407b();

		/**
		 * The meta object literal for the '<em><b>F4040 7c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40407C = eINSTANCE.getAssignmentType_F40407c();

		/**
		 * The meta object literal for the '<em><b>F4040 7d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40407D = eINSTANCE.getAssignmentType_F40407d();

		/**
		 * The meta object literal for the '<em><b>F4040 7e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40407E = eINSTANCE.getAssignmentType_F40407e();

		/**
		 * The meta object literal for the '<em><b>F4040 7f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40407F = eINSTANCE.getAssignmentType_F40407f();

		/**
		 * The meta object literal for the '<em><b>F404080</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404080 = eINSTANCE.getAssignmentType_F404080();

		/**
		 * The meta object literal for the '<em><b>F404081</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404081 = eINSTANCE.getAssignmentType_F404081();

		/**
		 * The meta object literal for the '<em><b>F404082</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404082 = eINSTANCE.getAssignmentType_F404082();

		/**
		 * The meta object literal for the '<em><b>F404083</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404083 = eINSTANCE.getAssignmentType_F404083();

		/**
		 * The meta object literal for the '<em><b>F404084</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404084 = eINSTANCE.getAssignmentType_F404084();

		/**
		 * The meta object literal for the '<em><b>F404085</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404085 = eINSTANCE.getAssignmentType_F404085();

		/**
		 * The meta object literal for the '<em><b>F404086</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404086 = eINSTANCE.getAssignmentType_F404086();

		/**
		 * The meta object literal for the '<em><b>F404087</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404087 = eINSTANCE.getAssignmentType_F404087();

		/**
		 * The meta object literal for the '<em><b>F404088</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404088 = eINSTANCE.getAssignmentType_F404088();

		/**
		 * The meta object literal for the '<em><b>F404089</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404089 = eINSTANCE.getAssignmentType_F404089();

		/**
		 * The meta object literal for the '<em><b>F4040 8a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40408A = eINSTANCE.getAssignmentType_F40408a();

		/**
		 * The meta object literal for the '<em><b>F4040 8b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40408B = eINSTANCE.getAssignmentType_F40408b();

		/**
		 * The meta object literal for the '<em><b>F4040 8c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40408C = eINSTANCE.getAssignmentType_F40408c();

		/**
		 * The meta object literal for the '<em><b>F4040 8d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40408D = eINSTANCE.getAssignmentType_F40408d();

		/**
		 * The meta object literal for the '<em><b>F4040 8e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40408E = eINSTANCE.getAssignmentType_F40408e();

		/**
		 * The meta object literal for the '<em><b>F4040 8f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40408F = eINSTANCE.getAssignmentType_F40408f();

		/**
		 * The meta object literal for the '<em><b>F404090</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404090 = eINSTANCE.getAssignmentType_F404090();

		/**
		 * The meta object literal for the '<em><b>F404091</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404091 = eINSTANCE.getAssignmentType_F404091();

		/**
		 * The meta object literal for the '<em><b>F404092</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404092 = eINSTANCE.getAssignmentType_F404092();

		/**
		 * The meta object literal for the '<em><b>F404093</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404093 = eINSTANCE.getAssignmentType_F404093();

		/**
		 * The meta object literal for the '<em><b>F404094</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404094 = eINSTANCE.getAssignmentType_F404094();

		/**
		 * The meta object literal for the '<em><b>F404095</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404095 = eINSTANCE.getAssignmentType_F404095();

		/**
		 * The meta object literal for the '<em><b>F404096</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404096 = eINSTANCE.getAssignmentType_F404096();

		/**
		 * The meta object literal for the '<em><b>F404097</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404097 = eINSTANCE.getAssignmentType_F404097();

		/**
		 * The meta object literal for the '<em><b>F404098</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404098 = eINSTANCE.getAssignmentType_F404098();

		/**
		 * The meta object literal for the '<em><b>F404099</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F404099 = eINSTANCE.getAssignmentType_F404099();

		/**
		 * The meta object literal for the '<em><b>F4040 9a</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40409A = eINSTANCE.getAssignmentType_F40409a();

		/**
		 * The meta object literal for the '<em><b>F4040 9b</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40409B = eINSTANCE.getAssignmentType_F40409b();

		/**
		 * The meta object literal for the '<em><b>F4040 9c</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40409C = eINSTANCE.getAssignmentType_F40409c();

		/**
		 * The meta object literal for the '<em><b>F4040 9d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40409D = eINSTANCE.getAssignmentType_F40409d();

		/**
		 * The meta object literal for the '<em><b>F4040 9e</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40409E = eINSTANCE.getAssignmentType_F40409e();

		/**
		 * The meta object literal for the '<em><b>F4040 9f</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F40409F = eINSTANCE.getAssignmentType_F40409f();

		/**
		 * The meta object literal for the '<em><b>F404 0a0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A0 = eINSTANCE.getAssignmentType_F4040a0();

		/**
		 * The meta object literal for the '<em><b>F404 0a1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A1 = eINSTANCE.getAssignmentType_F4040a1();

		/**
		 * The meta object literal for the '<em><b>F404 0a2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A2 = eINSTANCE.getAssignmentType_F4040a2();

		/**
		 * The meta object literal for the '<em><b>F404 0a3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A3 = eINSTANCE.getAssignmentType_F4040a3();

		/**
		 * The meta object literal for the '<em><b>F404 0a4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A4 = eINSTANCE.getAssignmentType_F4040a4();

		/**
		 * The meta object literal for the '<em><b>F404 0a5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A5 = eINSTANCE.getAssignmentType_F4040a5();

		/**
		 * The meta object literal for the '<em><b>F404 0a6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A6 = eINSTANCE.getAssignmentType_F4040a6();

		/**
		 * The meta object literal for the '<em><b>F404 0a7</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A7 = eINSTANCE.getAssignmentType_F4040a7();

		/**
		 * The meta object literal for the '<em><b>F404 0a8</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A8 = eINSTANCE.getAssignmentType_F4040a8();

		/**
		 * The meta object literal for the '<em><b>F404 0a9</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040A9 = eINSTANCE.getAssignmentType_F4040a9();

		/**
		 * The meta object literal for the '<em><b>F404 0aa</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040AA = eINSTANCE.getAssignmentType_F4040aa();

		/**
		 * The meta object literal for the '<em><b>F404 0ab</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040AB = eINSTANCE.getAssignmentType_F4040ab();

		/**
		 * The meta object literal for the '<em><b>F404 0ac</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040AC = eINSTANCE.getAssignmentType_F4040ac();

		/**
		 * The meta object literal for the '<em><b>F404 0ad</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040AD = eINSTANCE.getAssignmentType_F4040ad();

		/**
		 * The meta object literal for the '<em><b>F404 0ae</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040AE = eINSTANCE.getAssignmentType_F4040ae();

		/**
		 * The meta object literal for the '<em><b>F404 0af</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040AF = eINSTANCE.getAssignmentType_F4040af();

		/**
		 * The meta object literal for the '<em><b>F404 0b0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B0 = eINSTANCE.getAssignmentType_F4040b0();

		/**
		 * The meta object literal for the '<em><b>F404 0b1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B1 = eINSTANCE.getAssignmentType_F4040b1();

		/**
		 * The meta object literal for the '<em><b>F404 0b2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B2 = eINSTANCE.getAssignmentType_F4040b2();

		/**
		 * The meta object literal for the '<em><b>F404 0b3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B3 = eINSTANCE.getAssignmentType_F4040b3();

		/**
		 * The meta object literal for the '<em><b>F404 0b4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B4 = eINSTANCE.getAssignmentType_F4040b4();

		/**
		 * The meta object literal for the '<em><b>F404 0b5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B5 = eINSTANCE.getAssignmentType_F4040b5();

		/**
		 * The meta object literal for the '<em><b>F404 0b6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B6 = eINSTANCE.getAssignmentType_F4040b6();

		/**
		 * The meta object literal for the '<em><b>F404 0b7</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B7 = eINSTANCE.getAssignmentType_F4040b7();

		/**
		 * The meta object literal for the '<em><b>F404 0b8</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B8 = eINSTANCE.getAssignmentType_F4040b8();

		/**
		 * The meta object literal for the '<em><b>F404 0b9</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040B9 = eINSTANCE.getAssignmentType_F4040b9();

		/**
		 * The meta object literal for the '<em><b>F404 0ba</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040BA = eINSTANCE.getAssignmentType_F4040ba();

		/**
		 * The meta object literal for the '<em><b>F404 0bb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040BB = eINSTANCE.getAssignmentType_F4040bb();

		/**
		 * The meta object literal for the '<em><b>F404 0bc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040BC = eINSTANCE.getAssignmentType_F4040bc();

		/**
		 * The meta object literal for the '<em><b>F404 0bd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040BD = eINSTANCE.getAssignmentType_F4040bd();

		/**
		 * The meta object literal for the '<em><b>F404 0be</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040BE = eINSTANCE.getAssignmentType_F4040be();

		/**
		 * The meta object literal for the '<em><b>F404 0bf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040BF = eINSTANCE.getAssignmentType_F4040bf();

		/**
		 * The meta object literal for the '<em><b>F404 0c0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C0 = eINSTANCE.getAssignmentType_F4040c0();

		/**
		 * The meta object literal for the '<em><b>F404 0c1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C1 = eINSTANCE.getAssignmentType_F4040c1();

		/**
		 * The meta object literal for the '<em><b>F404 0c2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C2 = eINSTANCE.getAssignmentType_F4040c2();

		/**
		 * The meta object literal for the '<em><b>F404 0c3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C3 = eINSTANCE.getAssignmentType_F4040c3();

		/**
		 * The meta object literal for the '<em><b>F404 0c4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C4 = eINSTANCE.getAssignmentType_F4040c4();

		/**
		 * The meta object literal for the '<em><b>F404 0c5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C5 = eINSTANCE.getAssignmentType_F4040c5();

		/**
		 * The meta object literal for the '<em><b>F404 0c6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C6 = eINSTANCE.getAssignmentType_F4040c6();

		/**
		 * The meta object literal for the '<em><b>F404 0c7</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C7 = eINSTANCE.getAssignmentType_F4040c7();

		/**
		 * The meta object literal for the '<em><b>F404 0c8</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__F4040C8 = eINSTANCE.getAssignmentType_F4040c8();

		/**
		 * The meta object literal for the '<em><b>Timephased Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_TYPE__TIMEPHASED_DATA = eINSTANCE.getAssignmentType_TimephasedData();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.AvailabilityPeriodsTypeImpl <em>Availability Periods Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.AvailabilityPeriodsTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAvailabilityPeriodsType()
		 * @generated
		 */
		EClass AVAILABILITY_PERIODS_TYPE = eINSTANCE.getAvailabilityPeriodsType();

		/**
		 * The meta object literal for the '<em><b>Availability Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD = eINSTANCE.getAvailabilityPeriodsType_AvailabilityPeriod();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.AvailabilityPeriodTypeImpl <em>Availability Period Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.AvailabilityPeriodTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAvailabilityPeriodType()
		 * @generated
		 */
		EClass AVAILABILITY_PERIOD_TYPE = eINSTANCE.getAvailabilityPeriodType();

		/**
		 * The meta object literal for the '<em><b>Available From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY_PERIOD_TYPE__AVAILABLE_FROM = eINSTANCE.getAvailabilityPeriodType_AvailableFrom();

		/**
		 * The meta object literal for the '<em><b>Available To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY_PERIOD_TYPE__AVAILABLE_TO = eINSTANCE.getAvailabilityPeriodType_AvailableTo();

		/**
		 * The meta object literal for the '<em><b>Available Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS = eINSTANCE.getAvailabilityPeriodType_AvailableUnits();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.BaselineTypeImpl <em>Baseline Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.BaselineTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineType()
		 * @generated
		 */
		EClass BASELINE_TYPE = eINSTANCE.getBaselineType();

		/**
		 * The meta object literal for the '<em><b>Timephased Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE_TYPE__TIMEPHASED_DATA = eINSTANCE.getBaselineType_TimephasedData();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE__NUMBER = eINSTANCE.getBaselineType_Number();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE__START = eINSTANCE.getBaselineType_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE__FINISH = eINSTANCE.getBaselineType_Finish();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE__WORK = eINSTANCE.getBaselineType_Work();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE__COST = eINSTANCE.getBaselineType_Cost();

		/**
		 * The meta object literal for the '<em><b>BCWS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE__BCWS = eINSTANCE.getBaselineType_BCWS();

		/**
		 * The meta object literal for the '<em><b>BCWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE__BCWP = eINSTANCE.getBaselineType_BCWP();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.BaselineType1Impl <em>Baseline Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.BaselineType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineType1()
		 * @generated
		 */
		EClass BASELINE_TYPE1 = eINSTANCE.getBaselineType1();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE1__NUMBER = eINSTANCE.getBaselineType1_Number();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE1__WORK = eINSTANCE.getBaselineType1_Work();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE1__COST = eINSTANCE.getBaselineType1_Cost();

		/**
		 * The meta object literal for the '<em><b>BCWS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE1__BCWS = eINSTANCE.getBaselineType1_BCWS();

		/**
		 * The meta object literal for the '<em><b>BCWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE1__BCWP = eINSTANCE.getBaselineType1_BCWP();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.BaselineType2Impl <em>Baseline Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.BaselineType2Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineType2()
		 * @generated
		 */
		EClass BASELINE_TYPE2 = eINSTANCE.getBaselineType2();

		/**
		 * The meta object literal for the '<em><b>Timephased Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE_TYPE2__TIMEPHASED_DATA = eINSTANCE.getBaselineType2_TimephasedData();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__NUMBER = eINSTANCE.getBaselineType2_Number();

		/**
		 * The meta object literal for the '<em><b>Interim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__INTERIM = eINSTANCE.getBaselineType2_Interim();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__START = eINSTANCE.getBaselineType2_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__FINISH = eINSTANCE.getBaselineType2_Finish();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__DURATION = eINSTANCE.getBaselineType2_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__DURATION_FORMAT = eINSTANCE.getBaselineType2_DurationFormat();

		/**
		 * The meta object literal for the '<em><b>Estimated Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__ESTIMATED_DURATION = eINSTANCE.getBaselineType2_EstimatedDuration();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__WORK = eINSTANCE.getBaselineType2_Work();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__COST = eINSTANCE.getBaselineType2_Cost();

		/**
		 * The meta object literal for the '<em><b>BCWS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__BCWS = eINSTANCE.getBaselineType2_BCWS();

		/**
		 * The meta object literal for the '<em><b>BCWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__BCWP = eINSTANCE.getBaselineType2_BCWP();

		/**
		 * The meta object literal for the '<em><b>Fixed Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASELINE_TYPE2__FIXED_COST = eINSTANCE.getBaselineType2_FixedCost();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.CalendarsTypeImpl <em>Calendars Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.CalendarsTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalendarsType()
		 * @generated
		 */
		EClass CALENDARS_TYPE = eINSTANCE.getCalendarsType();

		/**
		 * The meta object literal for the '<em><b>Calendar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARS_TYPE__CALENDAR = eINSTANCE.getCalendarsType_Calendar();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.CalendarTypeImpl <em>Calendar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.CalendarTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalendarType()
		 * @generated
		 */
		EClass CALENDAR_TYPE = eINSTANCE.getCalendarType();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_TYPE__UID = eINSTANCE.getCalendarType_UID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_TYPE__NAME = eINSTANCE.getCalendarType_Name();

		/**
		 * The meta object literal for the '<em><b>Is Base Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_TYPE__IS_BASE_CALENDAR = eINSTANCE.getCalendarType_IsBaseCalendar();

		/**
		 * The meta object literal for the '<em><b>Base Calendar UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_TYPE__BASE_CALENDAR_UID = eINSTANCE.getCalendarType_BaseCalendarUID();

		/**
		 * The meta object literal for the '<em><b>Week Days</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR_TYPE__WEEK_DAYS = eINSTANCE.getCalendarType_WeekDays();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR_TYPE__EXCEPTIONS = eINSTANCE.getCalendarType_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Work Weeks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR_TYPE__WORK_WEEKS = eINSTANCE.getCalendarType_WorkWeeks();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.DocumentRootImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROJECT = eINSTANCE.getDocumentRoot_Project();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ExceptionsTypeImpl <em>Exceptions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ExceptionsTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExceptionsType()
		 * @generated
		 */
		EClass EXCEPTIONS_TYPE = eINSTANCE.getExceptionsType();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTIONS_TYPE__EXCEPTION = eINSTANCE.getExceptionsType_Exception();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ExceptionTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExceptionType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

		/**
		 * The meta object literal for the '<em><b>Entered By Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES = eINSTANCE.getExceptionType_EnteredByOccurrences();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_TYPE__TIME_PERIOD = eINSTANCE.getExceptionType_TimePeriod();

		/**
		 * The meta object literal for the '<em><b>Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__OCCURRENCES = eINSTANCE.getExceptionType_Occurrences();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__NAME = eINSTANCE.getExceptionType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__TYPE = eINSTANCE.getExceptionType_Type();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__PERIOD = eINSTANCE.getExceptionType_Period();

		/**
		 * The meta object literal for the '<em><b>Days Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__DAYS_OF_WEEK = eINSTANCE.getExceptionType_DaysOfWeek();

		/**
		 * The meta object literal for the '<em><b>Month Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__MONTH_ITEM = eINSTANCE.getExceptionType_MonthItem();

		/**
		 * The meta object literal for the '<em><b>Month Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__MONTH_POSITION = eINSTANCE.getExceptionType_MonthPosition();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__MONTH = eINSTANCE.getExceptionType_Month();

		/**
		 * The meta object literal for the '<em><b>Month Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__MONTH_DAY = eINSTANCE.getExceptionType_MonthDay();

		/**
		 * The meta object literal for the '<em><b>Day Working</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__DAY_WORKING = eINSTANCE.getExceptionType_DayWorking();

		/**
		 * The meta object literal for the '<em><b>Working Times</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_TYPE__WORKING_TIMES = eINSTANCE.getExceptionType_WorkingTimes();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributesTypeImpl <em>Extended Attributes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ExtendedAttributesTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributesType()
		 * @generated
		 */
		EClass EXTENDED_ATTRIBUTES_TYPE = eINSTANCE.getExtendedAttributesType();

		/**
		 * The meta object literal for the '<em><b>Extended Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_ATTRIBUTES_TYPE__EXTENDED_ATTRIBUTE = eINSTANCE.getExtendedAttributesType_ExtendedAttribute();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl <em>Extended Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType()
		 * @generated
		 */
		EClass EXTENDED_ATTRIBUTE_TYPE = eINSTANCE.getExtendedAttributeType();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__FIELD_ID = eINSTANCE.getExtendedAttributeType_FieldID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__VALUE = eINSTANCE.getExtendedAttributeType_Value();

		/**
		 * The meta object literal for the '<em><b>Value GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__VALUE_GUID = eINSTANCE.getExtendedAttributeType_ValueGUID();

		/**
		 * The meta object literal for the '<em><b>Duration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT = eINSTANCE.getExtendedAttributeType_DurationFormat();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeType1Impl <em>Extended Attribute Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ExtendedAttributeType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType1()
		 * @generated
		 */
		EClass EXTENDED_ATTRIBUTE_TYPE1 = eINSTANCE.getExtendedAttributeType1();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE1__FIELD_ID = eINSTANCE.getExtendedAttributeType1_FieldID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE1__VALUE = eINSTANCE.getExtendedAttributeType1_Value();

		/**
		 * The meta object literal for the '<em><b>Value GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE1__VALUE_GUID = eINSTANCE.getExtendedAttributeType1_ValueGUID();

		/**
		 * The meta object literal for the '<em><b>Duration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE1__DURATION_FORMAT = eINSTANCE.getExtendedAttributeType1_DurationFormat();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeType2Impl <em>Extended Attribute Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ExtendedAttributeType2Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType2()
		 * @generated
		 */
		EClass EXTENDED_ATTRIBUTE_TYPE2 = eINSTANCE.getExtendedAttributeType2();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE2__FIELD_ID = eINSTANCE.getExtendedAttributeType2_FieldID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE2__VALUE = eINSTANCE.getExtendedAttributeType2_Value();

		/**
		 * The meta object literal for the '<em><b>Value GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE2__VALUE_GUID = eINSTANCE.getExtendedAttributeType2_ValueGUID();

		/**
		 * The meta object literal for the '<em><b>Duration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE2__DURATION_FORMAT = eINSTANCE.getExtendedAttributeType2_DurationFormat();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl <em>Extended Attribute Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExtendedAttributeType3()
		 * @generated
		 */
		EClass EXTENDED_ATTRIBUTE_TYPE3 = eINSTANCE.getExtendedAttributeType3();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID = eINSTANCE.getExtendedAttributeType3_FieldID();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME = eINSTANCE.getExtendedAttributeType3_FieldName();

		/**
		 * The meta object literal for the '<em><b>CF Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE = eINSTANCE.getExtendedAttributeType3_CFType();

		/**
		 * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__GUID = eINSTANCE.getExtendedAttributeType3_Guid();

		/**
		 * The meta object literal for the '<em><b>Elem Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE = eINSTANCE.getExtendedAttributeType3_ElemType();

		/**
		 * The meta object literal for the '<em><b>Max Multi Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES = eINSTANCE.getExtendedAttributeType3_MaxMultiValues();

		/**
		 * The meta object literal for the '<em><b>User Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__USER_DEF = eINSTANCE.getExtendedAttributeType3_UserDef();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__ALIAS = eINSTANCE.getExtendedAttributeType3_Alias();

		/**
		 * The meta object literal for the '<em><b>Secondary PID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID = eINSTANCE.getExtendedAttributeType3_SecondaryPID();

		/**
		 * The meta object literal for the '<em><b>Auto Roll Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN = eINSTANCE.getExtendedAttributeType3_AutoRollDown();

		/**
		 * The meta object literal for the '<em><b>Default Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID = eINSTANCE.getExtendedAttributeType3_DefaultGuid();

		/**
		 * The meta object literal for the '<em><b>Ltuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__LTUID = eINSTANCE.getExtendedAttributeType3_Ltuid();

		/**
		 * The meta object literal for the '<em><b>Phonetic Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS = eINSTANCE.getExtendedAttributeType3_PhoneticAlias();

		/**
		 * The meta object literal for the '<em><b>Rollup Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE = eINSTANCE.getExtendedAttributeType3_RollupType();

		/**
		 * The meta object literal for the '<em><b>Calculation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE = eINSTANCE.getExtendedAttributeType3_CalculationType();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__FORMULA = eINSTANCE.getExtendedAttributeType3_Formula();

		/**
		 * The meta object literal for the '<em><b>Restrict Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES = eINSTANCE.getExtendedAttributeType3_RestrictValues();

		/**
		 * The meta object literal for the '<em><b>Valuelist Sort Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER = eINSTANCE.getExtendedAttributeType3_ValuelistSortOrder();

		/**
		 * The meta object literal for the '<em><b>Append New Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES = eINSTANCE.getExtendedAttributeType3_AppendNewValues();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_ATTRIBUTE_TYPE3__DEFAULT = eINSTANCE.getExtendedAttributeType3_Default();

		/**
		 * The meta object literal for the '<em><b>Value List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST = eINSTANCE.getExtendedAttributeType3_ValueList();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.MasksTypeImpl <em>Masks Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.MasksTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMasksType()
		 * @generated
		 */
		EClass MASKS_TYPE = eINSTANCE.getMasksType();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASKS_TYPE__MASK = eINSTANCE.getMasksType_Mask();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.MaskTypeImpl <em>Mask Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.MaskTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMaskType()
		 * @generated
		 */
		EClass MASK_TYPE = eINSTANCE.getMaskType();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASK_TYPE__LEVEL = eINSTANCE.getMaskType_Level();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASK_TYPE__TYPE = eINSTANCE.getMaskType_Type();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASK_TYPE__LENGTH = eINSTANCE.getMaskType_Length();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASK_TYPE__SEPARATOR = eINSTANCE.getMaskType_Separator();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.OutlineCodesTypeImpl <em>Outline Codes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.OutlineCodesTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodesType()
		 * @generated
		 */
		EClass OUTLINE_CODES_TYPE = eINSTANCE.getOutlineCodesType();

		/**
		 * The meta object literal for the '<em><b>Outline Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTLINE_CODES_TYPE__OUTLINE_CODE = eINSTANCE.getOutlineCodesType_OutlineCode();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.OutlineCodeTypeImpl <em>Outline Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.OutlineCodeTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodeType()
		 * @generated
		 */
		EClass OUTLINE_CODE_TYPE = eINSTANCE.getOutlineCodeType();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE__FIELD_ID = eINSTANCE.getOutlineCodeType_FieldID();

		/**
		 * The meta object literal for the '<em><b>Value ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE__VALUE_ID = eINSTANCE.getOutlineCodeType_ValueID();

		/**
		 * The meta object literal for the '<em><b>Value GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE__VALUE_GUID = eINSTANCE.getOutlineCodeType_ValueGUID();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.OutlineCodeType1Impl <em>Outline Code Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.OutlineCodeType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodeType1()
		 * @generated
		 */
		EClass OUTLINE_CODE_TYPE1 = eINSTANCE.getOutlineCodeType1();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE1__FIELD_ID = eINSTANCE.getOutlineCodeType1_FieldID();

		/**
		 * The meta object literal for the '<em><b>Value ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE1__VALUE_ID = eINSTANCE.getOutlineCodeType1_ValueID();

		/**
		 * The meta object literal for the '<em><b>Value GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE1__VALUE_GUID = eINSTANCE.getOutlineCodeType1_ValueGUID();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl <em>Outline Code Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.OutlineCodeType2Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineCodeType2()
		 * @generated
		 */
		EClass OUTLINE_CODE_TYPE2 = eINSTANCE.getOutlineCodeType2();

		/**
		 * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__GUID = eINSTANCE.getOutlineCodeType2_Guid();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__FIELD_ID = eINSTANCE.getOutlineCodeType2_FieldID();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__FIELD_NAME = eINSTANCE.getOutlineCodeType2_FieldName();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__ALIAS = eINSTANCE.getOutlineCodeType2_Alias();

		/**
		 * The meta object literal for the '<em><b>Phonetic Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__PHONETIC_ALIAS = eINSTANCE.getOutlineCodeType2_PhoneticAlias();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTLINE_CODE_TYPE2__VALUES = eINSTANCE.getOutlineCodeType2_Values();

		/**
		 * The meta object literal for the '<em><b>Enterprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__ENTERPRISE = eINSTANCE.getOutlineCodeType2_Enterprise();

		/**
		 * The meta object literal for the '<em><b>Enterprise Outline Code Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS = eINSTANCE.getOutlineCodeType2_EnterpriseOutlineCodeAlias();

		/**
		 * The meta object literal for the '<em><b>Resource Substitution Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED = eINSTANCE.getOutlineCodeType2_ResourceSubstitutionEnabled();

		/**
		 * The meta object literal for the '<em><b>Leaf Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__LEAF_ONLY = eINSTANCE.getOutlineCodeType2_LeafOnly();

		/**
		 * The meta object literal for the '<em><b>All Levels Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED = eINSTANCE.getOutlineCodeType2_AllLevelsRequired();

		/**
		 * The meta object literal for the '<em><b>Only Table Values Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED = eINSTANCE.getOutlineCodeType2_OnlyTableValuesAllowed();

		/**
		 * The meta object literal for the '<em><b>Masks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTLINE_CODE_TYPE2__MASKS = eINSTANCE.getOutlineCodeType2_Masks();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl <em>Predecessor Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPredecessorLinkType()
		 * @generated
		 */
		EClass PREDECESSOR_LINK_TYPE = eINSTANCE.getPredecessorLinkType();

		/**
		 * The meta object literal for the '<em><b>Predecessor UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR_LINK_TYPE__PREDECESSOR_UID = eINSTANCE.getPredecessorLinkType_PredecessorUID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR_LINK_TYPE__TYPE = eINSTANCE.getPredecessorLinkType_Type();

		/**
		 * The meta object literal for the '<em><b>Cross Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR_LINK_TYPE__CROSS_PROJECT = eINSTANCE.getPredecessorLinkType_CrossProject();

		/**
		 * The meta object literal for the '<em><b>Cross Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR_LINK_TYPE__CROSS_PROJECT_NAME = eINSTANCE.getPredecessorLinkType_CrossProjectName();

		/**
		 * The meta object literal for the '<em><b>Link Lag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR_LINK_TYPE__LINK_LAG = eINSTANCE.getPredecessorLinkType_LinkLag();

		/**
		 * The meta object literal for the '<em><b>Lag Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR_LINK_TYPE__LAG_FORMAT = eINSTANCE.getPredecessorLinkType_LagFormat();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ProjectTypeImpl <em>Project Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ProjectTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getProjectType()
		 * @generated
		 */
		EClass PROJECT_TYPE = eINSTANCE.getProjectType();

		/**
		 * The meta object literal for the '<em><b>Save Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__SAVE_VERSION = eINSTANCE.getProjectType_SaveVersion();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__UID = eINSTANCE.getProjectType_UID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__NAME = eINSTANCE.getProjectType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__TITLE = eINSTANCE.getProjectType_Title();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__SUBJECT = eINSTANCE.getProjectType_Subject();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CATEGORY = eINSTANCE.getProjectType_Category();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__COMPANY = eINSTANCE.getProjectType_Company();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MANAGER = eINSTANCE.getProjectType_Manager();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__AUTHOR = eINSTANCE.getProjectType_Author();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CREATION_DATE = eINSTANCE.getProjectType_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__REVISION = eINSTANCE.getProjectType_Revision();

		/**
		 * The meta object literal for the '<em><b>Last Saved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__LAST_SAVED = eINSTANCE.getProjectType_LastSaved();

		/**
		 * The meta object literal for the '<em><b>Schedule From Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__SCHEDULE_FROM_START = eINSTANCE.getProjectType_ScheduleFromStart();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__START_DATE = eINSTANCE.getProjectType_StartDate();

		/**
		 * The meta object literal for the '<em><b>Finish Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__FINISH_DATE = eINSTANCE.getProjectType_FinishDate();

		/**
		 * The meta object literal for the '<em><b>FY Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__FY_START_DATE = eINSTANCE.getProjectType_FYStartDate();

		/**
		 * The meta object literal for the '<em><b>Critical Slack Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CRITICAL_SLACK_LIMIT = eINSTANCE.getProjectType_CriticalSlackLimit();

		/**
		 * The meta object literal for the '<em><b>Currency Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CURRENCY_DIGITS = eINSTANCE.getProjectType_CurrencyDigits();

		/**
		 * The meta object literal for the '<em><b>Currency Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CURRENCY_SYMBOL = eINSTANCE.getProjectType_CurrencySymbol();

		/**
		 * The meta object literal for the '<em><b>Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CURRENCY_CODE = eINSTANCE.getProjectType_CurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Currency Symbol Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CURRENCY_SYMBOL_POSITION = eINSTANCE.getProjectType_CurrencySymbolPosition();

		/**
		 * The meta object literal for the '<em><b>Calendar UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CALENDAR_UID = eINSTANCE.getProjectType_CalendarUID();

		/**
		 * The meta object literal for the '<em><b>Default Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DEFAULT_START_TIME = eINSTANCE.getProjectType_DefaultStartTime();

		/**
		 * The meta object literal for the '<em><b>Default Finish Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DEFAULT_FINISH_TIME = eINSTANCE.getProjectType_DefaultFinishTime();

		/**
		 * The meta object literal for the '<em><b>Minutes Per Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MINUTES_PER_DAY = eINSTANCE.getProjectType_MinutesPerDay();

		/**
		 * The meta object literal for the '<em><b>Minutes Per Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MINUTES_PER_WEEK = eINSTANCE.getProjectType_MinutesPerWeek();

		/**
		 * The meta object literal for the '<em><b>Days Per Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DAYS_PER_MONTH = eINSTANCE.getProjectType_DaysPerMonth();

		/**
		 * The meta object literal for the '<em><b>Default Task Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DEFAULT_TASK_TYPE = eINSTANCE.getProjectType_DefaultTaskType();

		/**
		 * The meta object literal for the '<em><b>Default Fixed Cost Accrual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL = eINSTANCE.getProjectType_DefaultFixedCostAccrual();

		/**
		 * The meta object literal for the '<em><b>Default Standard Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DEFAULT_STANDARD_RATE = eINSTANCE.getProjectType_DefaultStandardRate();

		/**
		 * The meta object literal for the '<em><b>Default Overtime Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DEFAULT_OVERTIME_RATE = eINSTANCE.getProjectType_DefaultOvertimeRate();

		/**
		 * The meta object literal for the '<em><b>Duration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DURATION_FORMAT = eINSTANCE.getProjectType_DurationFormat();

		/**
		 * The meta object literal for the '<em><b>Work Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__WORK_FORMAT = eINSTANCE.getProjectType_WorkFormat();

		/**
		 * The meta object literal for the '<em><b>Editable Actual Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__EDITABLE_ACTUAL_COSTS = eINSTANCE.getProjectType_EditableActualCosts();

		/**
		 * The meta object literal for the '<em><b>Honor Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__HONOR_CONSTRAINTS = eINSTANCE.getProjectType_HonorConstraints();

		/**
		 * The meta object literal for the '<em><b>Earned Value Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__EARNED_VALUE_METHOD = eINSTANCE.getProjectType_EarnedValueMethod();

		/**
		 * The meta object literal for the '<em><b>Inserted Projects Like Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY = eINSTANCE.getProjectType_InsertedProjectsLikeSummary();

		/**
		 * The meta object literal for the '<em><b>Multiple Critical Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS = eINSTANCE.getProjectType_MultipleCriticalPaths();

		/**
		 * The meta object literal for the '<em><b>New Tasks Effort Driven</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN = eINSTANCE.getProjectType_NewTasksEffortDriven();

		/**
		 * The meta object literal for the '<em><b>New Tasks Estimated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__NEW_TASKS_ESTIMATED = eINSTANCE.getProjectType_NewTasksEstimated();

		/**
		 * The meta object literal for the '<em><b>Splits In Progress Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS = eINSTANCE.getProjectType_SplitsInProgressTasks();

		/**
		 * The meta object literal for the '<em><b>Spread Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__SPREAD_ACTUAL_COST = eINSTANCE.getProjectType_SpreadActualCost();

		/**
		 * The meta object literal for the '<em><b>Spread Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__SPREAD_PERCENT_COMPLETE = eINSTANCE.getProjectType_SpreadPercentComplete();

		/**
		 * The meta object literal for the '<em><b>Task Updates Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__TASK_UPDATES_RESOURCE = eINSTANCE.getProjectType_TaskUpdatesResource();

		/**
		 * The meta object literal for the '<em><b>Fiscal Year Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__FISCAL_YEAR_START = eINSTANCE.getProjectType_FiscalYearStart();

		/**
		 * The meta object literal for the '<em><b>Week Start Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__WEEK_START_DAY = eINSTANCE.getProjectType_WeekStartDay();

		/**
		 * The meta object literal for the '<em><b>Move Completed Ends Back</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK = eINSTANCE.getProjectType_MoveCompletedEndsBack();

		/**
		 * The meta object literal for the '<em><b>Move Remaining Starts Back</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK = eINSTANCE.getProjectType_MoveRemainingStartsBack();

		/**
		 * The meta object literal for the '<em><b>Move Remaining Starts Forward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD = eINSTANCE.getProjectType_MoveRemainingStartsForward();

		/**
		 * The meta object literal for the '<em><b>Move Completed Ends Forward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD = eINSTANCE.getProjectType_MoveCompletedEndsForward();

		/**
		 * The meta object literal for the '<em><b>Baseline For Earned Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE = eINSTANCE.getProjectType_BaselineForEarnedValue();

		/**
		 * The meta object literal for the '<em><b>Auto Add New Resources And Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS = eINSTANCE.getProjectType_AutoAddNewResourcesAndTasks();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__STATUS_DATE = eINSTANCE.getProjectType_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Current Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__CURRENT_DATE = eINSTANCE.getProjectType_CurrentDate();

		/**
		 * The meta object literal for the '<em><b>Microsoft Project Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL = eINSTANCE.getProjectType_MicrosoftProjectServerURL();

		/**
		 * The meta object literal for the '<em><b>Autolink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__AUTOLINK = eINSTANCE.getProjectType_Autolink();

		/**
		 * The meta object literal for the '<em><b>New Task Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__NEW_TASK_START_DATE = eINSTANCE.getProjectType_NewTaskStartDate();

		/**
		 * The meta object literal for the '<em><b>Default Task EV Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__DEFAULT_TASK_EV_METHOD = eINSTANCE.getProjectType_DefaultTaskEVMethod();

		/**
		 * The meta object literal for the '<em><b>Project Externally Edited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED = eINSTANCE.getProjectType_ProjectExternallyEdited();

		/**
		 * The meta object literal for the '<em><b>Extended Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__EXTENDED_CREATION_DATE = eINSTANCE.getProjectType_ExtendedCreationDate();

		/**
		 * The meta object literal for the '<em><b>Actuals In Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__ACTUALS_IN_SYNC = eINSTANCE.getProjectType_ActualsInSync();

		/**
		 * The meta object literal for the '<em><b>Remove File Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__REMOVE_FILE_PROPERTIES = eINSTANCE.getProjectType_RemoveFileProperties();

		/**
		 * The meta object literal for the '<em><b>Admin Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_TYPE__ADMIN_PROJECT = eINSTANCE.getProjectType_AdminProject();

		/**
		 * The meta object literal for the '<em><b>Outline Codes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__OUTLINE_CODES = eINSTANCE.getProjectType_OutlineCodes();

		/**
		 * The meta object literal for the '<em><b>WBS Masks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__WBS_MASKS = eINSTANCE.getProjectType_WBSMasks();

		/**
		 * The meta object literal for the '<em><b>Extended Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__EXTENDED_ATTRIBUTES = eINSTANCE.getProjectType_ExtendedAttributes();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__CALENDARS = eINSTANCE.getProjectType_Calendars();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__TASKS = eINSTANCE.getProjectType_Tasks();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__RESOURCES = eINSTANCE.getProjectType_Resources();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_TYPE__ASSIGNMENTS = eINSTANCE.getProjectType_Assignments();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.RatesTypeImpl <em>Rates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.RatesTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRatesType()
		 * @generated
		 */
		EClass RATES_TYPE = eINSTANCE.getRatesType();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATES_TYPE__RATE = eINSTANCE.getRatesType_Rate();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.RateTypeImpl <em>Rate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.RateTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRateType()
		 * @generated
		 */
		EClass RATE_TYPE = eINSTANCE.getRateType();

		/**
		 * The meta object literal for the '<em><b>Rates From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__RATES_FROM = eINSTANCE.getRateType_RatesFrom();

		/**
		 * The meta object literal for the '<em><b>Rates To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__RATES_TO = eINSTANCE.getRateType_RatesTo();

		/**
		 * The meta object literal for the '<em><b>Rate Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__RATE_TABLE = eINSTANCE.getRateType_RateTable();

		/**
		 * The meta object literal for the '<em><b>Standard Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__STANDARD_RATE = eINSTANCE.getRateType_StandardRate();

		/**
		 * The meta object literal for the '<em><b>Standard Rate Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__STANDARD_RATE_FORMAT = eINSTANCE.getRateType_StandardRateFormat();

		/**
		 * The meta object literal for the '<em><b>Overtime Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__OVERTIME_RATE = eINSTANCE.getRateType_OvertimeRate();

		/**
		 * The meta object literal for the '<em><b>Overtime Rate Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__OVERTIME_RATE_FORMAT = eINSTANCE.getRateType_OvertimeRateFormat();

		/**
		 * The meta object literal for the '<em><b>Cost Per Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__COST_PER_USE = eINSTANCE.getRateType_CostPerUse();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ResourcesTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getResourcesType()
		 * @generated
		 */
		EClass RESOURCES_TYPE = eINSTANCE.getResourcesType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_TYPE__RESOURCE = eINSTANCE.getResourcesType_Resource();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ResourceTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__UID = eINSTANCE.getResourceType_UID();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ID = eINSTANCE.getResourceType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__TYPE = eINSTANCE.getResourceType_Type();

		/**
		 * The meta object literal for the '<em><b>Is Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_NULL = eINSTANCE.getResourceType_IsNull();

		/**
		 * The meta object literal for the '<em><b>Initials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__INITIALS = eINSTANCE.getResourceType_Initials();

		/**
		 * The meta object literal for the '<em><b>Phonetics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__PHONETICS = eINSTANCE.getResourceType_Phonetics();

		/**
		 * The meta object literal for the '<em><b>NT Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__NT_ACCOUNT = eINSTANCE.getResourceType_NTAccount();

		/**
		 * The meta object literal for the '<em><b>Material Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__MATERIAL_LABEL = eINSTANCE.getResourceType_MaterialLabel();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__CODE = eINSTANCE.getResourceType_Code();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__GROUP = eINSTANCE.getResourceType_Group();

		/**
		 * The meta object literal for the '<em><b>Work Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__WORK_GROUP = eINSTANCE.getResourceType_WorkGroup();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__EMAIL_ADDRESS = eINSTANCE.getResourceType_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Hyperlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__HYPERLINK = eINSTANCE.getResourceType_Hyperlink();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__HYPERLINK_ADDRESS = eINSTANCE.getResourceType_HyperlinkAddress();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Sub Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS = eINSTANCE.getResourceType_HyperlinkSubAddress();

		/**
		 * The meta object literal for the '<em><b>Max Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__MAX_UNITS = eINSTANCE.getResourceType_MaxUnits();

		/**
		 * The meta object literal for the '<em><b>Peak Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__PEAK_UNITS = eINSTANCE.getResourceType_PeakUnits();

		/**
		 * The meta object literal for the '<em><b>Over Allocated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__OVER_ALLOCATED = eINSTANCE.getResourceType_OverAllocated();

		/**
		 * The meta object literal for the '<em><b>Available From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__AVAILABLE_FROM = eINSTANCE.getResourceType_AvailableFrom();

		/**
		 * The meta object literal for the '<em><b>Available To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__AVAILABLE_TO = eINSTANCE.getResourceType_AvailableTo();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__START = eINSTANCE.getResourceType_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__FINISH = eINSTANCE.getResourceType_Finish();

		/**
		 * The meta object literal for the '<em><b>Can Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__CAN_LEVEL = eINSTANCE.getResourceType_CanLevel();

		/**
		 * The meta object literal for the '<em><b>Accrue At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACCRUE_AT = eINSTANCE.getResourceType_AccrueAt();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__WORK = eINSTANCE.getResourceType_Work();

		/**
		 * The meta object literal for the '<em><b>Regular Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__REGULAR_WORK = eINSTANCE.getResourceType_RegularWork();

		/**
		 * The meta object literal for the '<em><b>Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__OVERTIME_WORK = eINSTANCE.getResourceType_OvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Actual Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACTUAL_WORK = eINSTANCE.getResourceType_ActualWork();

		/**
		 * The meta object literal for the '<em><b>Remaining Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__REMAINING_WORK = eINSTANCE.getResourceType_RemainingWork();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACTUAL_OVERTIME_WORK = eINSTANCE.getResourceType_ActualOvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Remaining Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__REMAINING_OVERTIME_WORK = eINSTANCE.getResourceType_RemainingOvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Percent Work Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__PERCENT_WORK_COMPLETE = eINSTANCE.getResourceType_PercentWorkComplete();

		/**
		 * The meta object literal for the '<em><b>Standard Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__STANDARD_RATE = eINSTANCE.getResourceType_StandardRate();

		/**
		 * The meta object literal for the '<em><b>Standard Rate Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__STANDARD_RATE_FORMAT = eINSTANCE.getResourceType_StandardRateFormat();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__COST = eINSTANCE.getResourceType_Cost();

		/**
		 * The meta object literal for the '<em><b>Overtime Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__OVERTIME_RATE = eINSTANCE.getResourceType_OvertimeRate();

		/**
		 * The meta object literal for the '<em><b>Overtime Rate Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__OVERTIME_RATE_FORMAT = eINSTANCE.getResourceType_OvertimeRateFormat();

		/**
		 * The meta object literal for the '<em><b>Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__OVERTIME_COST = eINSTANCE.getResourceType_OvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Cost Per Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__COST_PER_USE = eINSTANCE.getResourceType_CostPerUse();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACTUAL_COST = eINSTANCE.getResourceType_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACTUAL_OVERTIME_COST = eINSTANCE.getResourceType_ActualOvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Remaining Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__REMAINING_COST = eINSTANCE.getResourceType_RemainingCost();

		/**
		 * The meta object literal for the '<em><b>Remaining Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__REMAINING_OVERTIME_COST = eINSTANCE.getResourceType_RemainingOvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Work Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__WORK_VARIANCE = eINSTANCE.getResourceType_WorkVariance();

		/**
		 * The meta object literal for the '<em><b>Cost Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__COST_VARIANCE = eINSTANCE.getResourceType_CostVariance();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__SV = eINSTANCE.getResourceType_SV();

		/**
		 * The meta object literal for the '<em><b>CV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__CV = eINSTANCE.getResourceType_CV();

		/**
		 * The meta object literal for the '<em><b>ACWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACWP = eINSTANCE.getResourceType_ACWP();

		/**
		 * The meta object literal for the '<em><b>Calendar UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__CALENDAR_UID = eINSTANCE.getResourceType_CalendarUID();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__NOTES = eINSTANCE.getResourceType_Notes();

		/**
		 * The meta object literal for the '<em><b>BCWS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__BCWS = eINSTANCE.getResourceType_BCWS();

		/**
		 * The meta object literal for the '<em><b>BCWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__BCWP = eINSTANCE.getResourceType_BCWP();

		/**
		 * The meta object literal for the '<em><b>Is Generic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_GENERIC = eINSTANCE.getResourceType_IsGeneric();

		/**
		 * The meta object literal for the '<em><b>Is Inactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_INACTIVE = eINSTANCE.getResourceType_IsInactive();

		/**
		 * The meta object literal for the '<em><b>Is Enterprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_ENTERPRISE = eINSTANCE.getResourceType_IsEnterprise();

		/**
		 * The meta object literal for the '<em><b>Booking Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__BOOKING_TYPE = eINSTANCE.getResourceType_BookingType();

		/**
		 * The meta object literal for the '<em><b>Actual Work Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACTUAL_WORK_PROTECTED = eINSTANCE.getResourceType_ActualWorkProtected();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Work Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED = eINSTANCE.getResourceType_ActualOvertimeWorkProtected();

		/**
		 * The meta object literal for the '<em><b>Active Directory GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID = eINSTANCE.getResourceType_ActiveDirectoryGUID();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__CREATION_DATE = eINSTANCE.getResourceType_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Extended Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__EXTENDED_ATTRIBUTE = eINSTANCE.getResourceType_ExtendedAttribute();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__BASELINE = eINSTANCE.getResourceType_Baseline();

		/**
		 * The meta object literal for the '<em><b>Outline Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__OUTLINE_CODE = eINSTANCE.getResourceType_OutlineCode();

		/**
		 * The meta object literal for the '<em><b>Is Cost Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_COST_RESOURCE = eINSTANCE.getResourceType_IsCostResource();

		/**
		 * The meta object literal for the '<em><b>Assn Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ASSN_OWNER = eINSTANCE.getResourceType_AssnOwner();

		/**
		 * The meta object literal for the '<em><b>Assn Owner Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__ASSN_OWNER_GUID = eINSTANCE.getResourceType_AssnOwnerGuid();

		/**
		 * The meta object literal for the '<em><b>Is Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_BUDGET = eINSTANCE.getResourceType_IsBudget();

		/**
		 * The meta object literal for the '<em><b>Availability Periods</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__AVAILABILITY_PERIODS = eINSTANCE.getResourceType_AvailabilityPeriods();

		/**
		 * The meta object literal for the '<em><b>Rates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__RATES = eINSTANCE.getResourceType_Rates();

		/**
		 * The meta object literal for the '<em><b>Timephased Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__TIMEPHASED_DATA = eINSTANCE.getResourceType_TimephasedData();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.TasksTypeImpl <em>Tasks Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.TasksTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTasksType()
		 * @generated
		 */
		EClass TASKS_TYPE = eINSTANCE.getTasksType();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASKS_TYPE__TASK = eINSTANCE.getTasksType_Task();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.TaskTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__UID = eINSTANCE.getTaskType_UID();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ID = eINSTANCE.getTaskType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__TYPE = eINSTANCE.getTaskType_Type();

		/**
		 * The meta object literal for the '<em><b>Is Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__IS_NULL = eINSTANCE.getTaskType_IsNull();

		/**
		 * The meta object literal for the '<em><b>Create Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__CREATE_DATE = eINSTANCE.getTaskType_CreateDate();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__CONTACT = eINSTANCE.getTaskType_Contact();

		/**
		 * The meta object literal for the '<em><b>WBS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__WBS = eINSTANCE.getTaskType_WBS();

		/**
		 * The meta object literal for the '<em><b>WBS Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__WBS_LEVEL = eINSTANCE.getTaskType_WBSLevel();

		/**
		 * The meta object literal for the '<em><b>Outline Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__OUTLINE_NUMBER = eINSTANCE.getTaskType_OutlineNumber();

		/**
		 * The meta object literal for the '<em><b>Outline Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__OUTLINE_LEVEL = eINSTANCE.getTaskType_OutlineLevel();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PRIORITY = eINSTANCE.getTaskType_Priority();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__START = eINSTANCE.getTaskType_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__FINISH = eINSTANCE.getTaskType_Finish();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__DURATION = eINSTANCE.getTaskType_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__DURATION_FORMAT = eINSTANCE.getTaskType_DurationFormat();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__WORK = eINSTANCE.getTaskType_Work();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__STOP = eINSTANCE.getTaskType_Stop();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__RESUME = eINSTANCE.getTaskType_Resume();

		/**
		 * The meta object literal for the '<em><b>Resume Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__RESUME_VALID = eINSTANCE.getTaskType_ResumeValid();

		/**
		 * The meta object literal for the '<em><b>Effort Driven</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__EFFORT_DRIVEN = eINSTANCE.getTaskType_EffortDriven();

		/**
		 * The meta object literal for the '<em><b>Recurring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__RECURRING = eINSTANCE.getTaskType_Recurring();

		/**
		 * The meta object literal for the '<em><b>Over Allocated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__OVER_ALLOCATED = eINSTANCE.getTaskType_OverAllocated();

		/**
		 * The meta object literal for the '<em><b>Estimated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ESTIMATED = eINSTANCE.getTaskType_Estimated();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__MILESTONE = eINSTANCE.getTaskType_Milestone();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__SUMMARY = eINSTANCE.getTaskType_Summary();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__CRITICAL = eINSTANCE.getTaskType_Critical();

		/**
		 * The meta object literal for the '<em><b>Is Subproject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__IS_SUBPROJECT = eINSTANCE.getTaskType_IsSubproject();

		/**
		 * The meta object literal for the '<em><b>Is Subproject Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__IS_SUBPROJECT_READ_ONLY = eINSTANCE.getTaskType_IsSubprojectReadOnly();

		/**
		 * The meta object literal for the '<em><b>Subproject Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__SUBPROJECT_NAME = eINSTANCE.getTaskType_SubprojectName();

		/**
		 * The meta object literal for the '<em><b>External Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__EXTERNAL_TASK = eINSTANCE.getTaskType_ExternalTask();

		/**
		 * The meta object literal for the '<em><b>External Task Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__EXTERNAL_TASK_PROJECT = eINSTANCE.getTaskType_ExternalTaskProject();

		/**
		 * The meta object literal for the '<em><b>Early Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__EARLY_START = eINSTANCE.getTaskType_EarlyStart();

		/**
		 * The meta object literal for the '<em><b>Early Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__EARLY_FINISH = eINSTANCE.getTaskType_EarlyFinish();

		/**
		 * The meta object literal for the '<em><b>Late Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__LATE_START = eINSTANCE.getTaskType_LateStart();

		/**
		 * The meta object literal for the '<em><b>Late Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__LATE_FINISH = eINSTANCE.getTaskType_LateFinish();

		/**
		 * The meta object literal for the '<em><b>Start Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__START_VARIANCE = eINSTANCE.getTaskType_StartVariance();

		/**
		 * The meta object literal for the '<em><b>Finish Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__FINISH_VARIANCE = eINSTANCE.getTaskType_FinishVariance();

		/**
		 * The meta object literal for the '<em><b>Work Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__WORK_VARIANCE = eINSTANCE.getTaskType_WorkVariance();

		/**
		 * The meta object literal for the '<em><b>Free Slack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__FREE_SLACK = eINSTANCE.getTaskType_FreeSlack();

		/**
		 * The meta object literal for the '<em><b>Total Slack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__TOTAL_SLACK = eINSTANCE.getTaskType_TotalSlack();

		/**
		 * The meta object literal for the '<em><b>Fixed Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__FIXED_COST = eINSTANCE.getTaskType_FixedCost();

		/**
		 * The meta object literal for the '<em><b>Fixed Cost Accrual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__FIXED_COST_ACCRUAL = eINSTANCE.getTaskType_FixedCostAccrual();

		/**
		 * The meta object literal for the '<em><b>Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PERCENT_COMPLETE = eINSTANCE.getTaskType_PercentComplete();

		/**
		 * The meta object literal for the '<em><b>Percent Work Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PERCENT_WORK_COMPLETE = eINSTANCE.getTaskType_PercentWorkComplete();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__COST = eINSTANCE.getTaskType_Cost();

		/**
		 * The meta object literal for the '<em><b>Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__OVERTIME_COST = eINSTANCE.getTaskType_OvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__OVERTIME_WORK = eINSTANCE.getTaskType_OvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Actual Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_START = eINSTANCE.getTaskType_ActualStart();

		/**
		 * The meta object literal for the '<em><b>Actual Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_FINISH = eINSTANCE.getTaskType_ActualFinish();

		/**
		 * The meta object literal for the '<em><b>Actual Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_DURATION = eINSTANCE.getTaskType_ActualDuration();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_COST = eINSTANCE.getTaskType_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_OVERTIME_COST = eINSTANCE.getTaskType_ActualOvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Actual Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_WORK = eINSTANCE.getTaskType_ActualWork();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_OVERTIME_WORK = eINSTANCE.getTaskType_ActualOvertimeWork();

		/**
		 * The meta object literal for the '<em><b>Regular Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__REGULAR_WORK = eINSTANCE.getTaskType_RegularWork();

		/**
		 * The meta object literal for the '<em><b>Remaining Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__REMAINING_DURATION = eINSTANCE.getTaskType_RemainingDuration();

		/**
		 * The meta object literal for the '<em><b>Remaining Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__REMAINING_COST = eINSTANCE.getTaskType_RemainingCost();

		/**
		 * The meta object literal for the '<em><b>Remaining Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__REMAINING_WORK = eINSTANCE.getTaskType_RemainingWork();

		/**
		 * The meta object literal for the '<em><b>Remaining Overtime Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__REMAINING_OVERTIME_COST = eINSTANCE.getTaskType_RemainingOvertimeCost();

		/**
		 * The meta object literal for the '<em><b>Remaining Overtime Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__REMAINING_OVERTIME_WORK = eINSTANCE.getTaskType_RemainingOvertimeWork();

		/**
		 * The meta object literal for the '<em><b>ACWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACWP = eINSTANCE.getTaskType_ACWP();

		/**
		 * The meta object literal for the '<em><b>CV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__CV = eINSTANCE.getTaskType_CV();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__CONSTRAINT_TYPE = eINSTANCE.getTaskType_ConstraintType();

		/**
		 * The meta object literal for the '<em><b>Calendar UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__CALENDAR_UID = eINSTANCE.getTaskType_CalendarUID();

		/**
		 * The meta object literal for the '<em><b>Constraint Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__CONSTRAINT_DATE = eINSTANCE.getTaskType_ConstraintDate();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__DEADLINE = eINSTANCE.getTaskType_Deadline();

		/**
		 * The meta object literal for the '<em><b>Level Assignments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__LEVEL_ASSIGNMENTS = eINSTANCE.getTaskType_LevelAssignments();

		/**
		 * The meta object literal for the '<em><b>Leveling Can Split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__LEVELING_CAN_SPLIT = eINSTANCE.getTaskType_LevelingCanSplit();

		/**
		 * The meta object literal for the '<em><b>Leveling Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__LEVELING_DELAY = eINSTANCE.getTaskType_LevelingDelay();

		/**
		 * The meta object literal for the '<em><b>Leveling Delay Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__LEVELING_DELAY_FORMAT = eINSTANCE.getTaskType_LevelingDelayFormat();

		/**
		 * The meta object literal for the '<em><b>Pre Leveled Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PRE_LEVELED_START = eINSTANCE.getTaskType_PreLeveledStart();

		/**
		 * The meta object literal for the '<em><b>Pre Leveled Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PRE_LEVELED_FINISH = eINSTANCE.getTaskType_PreLeveledFinish();

		/**
		 * The meta object literal for the '<em><b>Hyperlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__HYPERLINK = eINSTANCE.getTaskType_Hyperlink();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__HYPERLINK_ADDRESS = eINSTANCE.getTaskType_HyperlinkAddress();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Sub Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__HYPERLINK_SUB_ADDRESS = eINSTANCE.getTaskType_HyperlinkSubAddress();

		/**
		 * The meta object literal for the '<em><b>Ignore Resource Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__IGNORE_RESOURCE_CALENDAR = eINSTANCE.getTaskType_IgnoreResourceCalendar();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__NOTES = eINSTANCE.getTaskType_Notes();

		/**
		 * The meta object literal for the '<em><b>Hide Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__HIDE_BAR = eINSTANCE.getTaskType_HideBar();

		/**
		 * The meta object literal for the '<em><b>Rollup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ROLLUP = eINSTANCE.getTaskType_Rollup();

		/**
		 * The meta object literal for the '<em><b>BCWS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__BCWS = eINSTANCE.getTaskType_BCWS();

		/**
		 * The meta object literal for the '<em><b>BCWP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__BCWP = eINSTANCE.getTaskType_BCWP();

		/**
		 * The meta object literal for the '<em><b>Physical Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PHYSICAL_PERCENT_COMPLETE = eINSTANCE.getTaskType_PhysicalPercentComplete();

		/**
		 * The meta object literal for the '<em><b>Earned Value Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__EARNED_VALUE_METHOD = eINSTANCE.getTaskType_EarnedValueMethod();

		/**
		 * The meta object literal for the '<em><b>Predecessor Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__PREDECESSOR_LINK = eINSTANCE.getTaskType_PredecessorLink();

		/**
		 * The meta object literal for the '<em><b>Actual Work Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_WORK_PROTECTED = eINSTANCE.getTaskType_ActualWorkProtected();

		/**
		 * The meta object literal for the '<em><b>Actual Overtime Work Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED = eINSTANCE.getTaskType_ActualOvertimeWorkProtected();

		/**
		 * The meta object literal for the '<em><b>Extended Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__EXTENDED_ATTRIBUTE = eINSTANCE.getTaskType_ExtendedAttribute();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__BASELINE = eINSTANCE.getTaskType_Baseline();

		/**
		 * The meta object literal for the '<em><b>Outline Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__OUTLINE_CODE = eINSTANCE.getTaskType_OutlineCode();

		/**
		 * The meta object literal for the '<em><b>Is Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__IS_PUBLISHED = eINSTANCE.getTaskType_IsPublished();

		/**
		 * The meta object literal for the '<em><b>Status Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__STATUS_MANAGER = eINSTANCE.getTaskType_StatusManager();

		/**
		 * The meta object literal for the '<em><b>Commitment Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__COMMITMENT_START = eINSTANCE.getTaskType_CommitmentStart();

		/**
		 * The meta object literal for the '<em><b>Commitment Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__COMMITMENT_FINISH = eINSTANCE.getTaskType_CommitmentFinish();

		/**
		 * The meta object literal for the '<em><b>Commitment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__COMMITMENT_TYPE = eINSTANCE.getTaskType_CommitmentType();

		/**
		 * The meta object literal for the '<em><b>Timephased Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__TIMEPHASED_DATA = eINSTANCE.getTaskType_TimephasedData();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.TimePeriodTypeImpl <em>Time Period Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.TimePeriodTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimePeriodType()
		 * @generated
		 */
		EClass TIME_PERIOD_TYPE = eINSTANCE.getTimePeriodType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE__FROM_DATE = eINSTANCE.getTimePeriodType_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE__TO_DATE = eINSTANCE.getTimePeriodType_ToDate();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.TimePeriodType1Impl <em>Time Period Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.TimePeriodType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimePeriodType1()
		 * @generated
		 */
		EClass TIME_PERIOD_TYPE1 = eINSTANCE.getTimePeriodType1();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE1__FROM_DATE = eINSTANCE.getTimePeriodType1_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE1__TO_DATE = eINSTANCE.getTimePeriodType1_ToDate();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.TimePeriodType2Impl <em>Time Period Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.TimePeriodType2Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimePeriodType2()
		 * @generated
		 */
		EClass TIME_PERIOD_TYPE2 = eINSTANCE.getTimePeriodType2();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE2__FROM_DATE = eINSTANCE.getTimePeriodType2_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE2__TO_DATE = eINSTANCE.getTimePeriodType2_ToDate();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.TimephasedDataTypeImpl <em>Timephased Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.TimephasedDataTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTimephasedDataType()
		 * @generated
		 */
		EClass TIMEPHASED_DATA_TYPE = eINSTANCE.getTimephasedDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEPHASED_DATA_TYPE__TYPE = eINSTANCE.getTimephasedDataType_Type();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEPHASED_DATA_TYPE__UID = eINSTANCE.getTimephasedDataType_UID();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEPHASED_DATA_TYPE__START = eINSTANCE.getTimephasedDataType_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEPHASED_DATA_TYPE__FINISH = eINSTANCE.getTimephasedDataType_Finish();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEPHASED_DATA_TYPE__UNIT = eINSTANCE.getTimephasedDataType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEPHASED_DATA_TYPE__VALUE = eINSTANCE.getTimephasedDataType_Value();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ValueListTypeImpl <em>Value List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ValueListTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValueListType()
		 * @generated
		 */
		EClass VALUE_LIST_TYPE = eINSTANCE.getValueListType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_LIST_TYPE__VALUE = eINSTANCE.getValueListType_Value();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ValuesTypeImpl <em>Values Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ValuesTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValuesType()
		 * @generated
		 */
		EClass VALUES_TYPE = eINSTANCE.getValuesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE__GROUP = eINSTANCE.getValuesType_Group();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__VALUE = eINSTANCE.getValuesType_Value();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ValueTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__ID = eINSTANCE.getValueType_ID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__VALUE = eINSTANCE.getValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__DESCRIPTION = eINSTANCE.getValueType_Description();

		/**
		 * The meta object literal for the '<em><b>Phonetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__PHONETIC = eINSTANCE.getValueType_Phonetic();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.ValueType1Impl <em>Value Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.ValueType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValueType1()
		 * @generated
		 */
		EClass VALUE_TYPE1 = eINSTANCE.getValueType1();

		/**
		 * The meta object literal for the '<em><b>Value ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE1__VALUE_ID = eINSTANCE.getValueType1_ValueID();

		/**
		 * The meta object literal for the '<em><b>Field GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE1__FIELD_GUID = eINSTANCE.getValueType1_FieldGUID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE1__TYPE = eINSTANCE.getValueType1_Type();

		/**
		 * The meta object literal for the '<em><b>Parent Value ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE1__PARENT_VALUE_ID = eINSTANCE.getValueType1_ParentValueID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE1__VALUE = eINSTANCE.getValueType1_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE1__DESCRIPTION = eINSTANCE.getValueType1_Description();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WBSMasksTypeImpl <em>WBS Masks Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WBSMasksTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWBSMasksType()
		 * @generated
		 */
		EClass WBS_MASKS_TYPE = eINSTANCE.getWBSMasksType();

		/**
		 * The meta object literal for the '<em><b>Verify Unique Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES = eINSTANCE.getWBSMasksType_VerifyUniqueCodes();

		/**
		 * The meta object literal for the '<em><b>Generate Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBS_MASKS_TYPE__GENERATE_CODES = eINSTANCE.getWBSMasksType_GenerateCodes();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBS_MASKS_TYPE__PREFIX = eINSTANCE.getWBSMasksType_Prefix();

		/**
		 * The meta object literal for the '<em><b>WBS Mask</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WBS_MASKS_TYPE__WBS_MASK = eINSTANCE.getWBSMasksType_WBSMask();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WBSMaskTypeImpl <em>WBS Mask Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WBSMaskTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWBSMaskType()
		 * @generated
		 */
		EClass WBS_MASK_TYPE = eINSTANCE.getWBSMaskType();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBS_MASK_TYPE__LEVEL = eINSTANCE.getWBSMaskType_Level();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBS_MASK_TYPE__TYPE = eINSTANCE.getWBSMaskType_Type();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBS_MASK_TYPE__LENGTH = eINSTANCE.getWBSMaskType_Length();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WBS_MASK_TYPE__SEPARATOR = eINSTANCE.getWBSMaskType_Separator();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WeekDaysTypeImpl <em>Week Days Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WeekDaysTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekDaysType()
		 * @generated
		 */
		EClass WEEK_DAYS_TYPE = eINSTANCE.getWeekDaysType();

		/**
		 * The meta object literal for the '<em><b>Week Day</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEK_DAYS_TYPE__WEEK_DAY = eINSTANCE.getWeekDaysType_WeekDay();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WeekDayTypeImpl <em>Week Day Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WeekDayTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekDayType()
		 * @generated
		 */
		EClass WEEK_DAY_TYPE = eINSTANCE.getWeekDayType();

		/**
		 * The meta object literal for the '<em><b>Day Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK_DAY_TYPE__DAY_TYPE = eINSTANCE.getWeekDayType_DayType();

		/**
		 * The meta object literal for the '<em><b>Day Working</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK_DAY_TYPE__DAY_WORKING = eINSTANCE.getWeekDayType_DayWorking();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WeekDayType1Impl <em>Week Day Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WeekDayType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekDayType1()
		 * @generated
		 */
		EClass WEEK_DAY_TYPE1 = eINSTANCE.getWeekDayType1();

		/**
		 * The meta object literal for the '<em><b>Day Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK_DAY_TYPE1__DAY_TYPE = eINSTANCE.getWeekDayType1_DayType();

		/**
		 * The meta object literal for the '<em><b>Day Working</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK_DAY_TYPE1__DAY_WORKING = eINSTANCE.getWeekDayType1_DayWorking();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEK_DAY_TYPE1__TIME_PERIOD = eINSTANCE.getWeekDayType1_TimePeriod();

		/**
		 * The meta object literal for the '<em><b>Working Times</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEK_DAY_TYPE1__WORKING_TIMES = eINSTANCE.getWeekDayType1_WorkingTimes();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WorkingTimesTypeImpl <em>Working Times Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WorkingTimesTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimesType()
		 * @generated
		 */
		EClass WORKING_TIMES_TYPE = eINSTANCE.getWorkingTimesType();

		/**
		 * The meta object literal for the '<em><b>Working Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKING_TIMES_TYPE__WORKING_TIME = eINSTANCE.getWorkingTimesType_WorkingTime();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WorkingTimesType1Impl <em>Working Times Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WorkingTimesType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimesType1()
		 * @generated
		 */
		EClass WORKING_TIMES_TYPE1 = eINSTANCE.getWorkingTimesType1();

		/**
		 * The meta object literal for the '<em><b>Working Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKING_TIMES_TYPE1__WORKING_TIME = eINSTANCE.getWorkingTimesType1_WorkingTime();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WorkingTimeTypeImpl <em>Working Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WorkingTimeTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimeType()
		 * @generated
		 */
		EClass WORKING_TIME_TYPE = eINSTANCE.getWorkingTimeType();

		/**
		 * The meta object literal for the '<em><b>From Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_TIME_TYPE__FROM_TIME = eINSTANCE.getWorkingTimeType_FromTime();

		/**
		 * The meta object literal for the '<em><b>To Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_TIME_TYPE__TO_TIME = eINSTANCE.getWorkingTimeType_ToTime();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WorkingTimeType1Impl <em>Working Time Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WorkingTimeType1Impl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkingTimeType1()
		 * @generated
		 */
		EClass WORKING_TIME_TYPE1 = eINSTANCE.getWorkingTimeType1();

		/**
		 * The meta object literal for the '<em><b>From Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_TIME_TYPE1__FROM_TIME = eINSTANCE.getWorkingTimeType1_FromTime();

		/**
		 * The meta object literal for the '<em><b>To Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKING_TIME_TYPE1__TO_TIME = eINSTANCE.getWorkingTimeType1_ToTime();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WorkWeeksTypeImpl <em>Work Weeks Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WorkWeeksTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkWeeksType()
		 * @generated
		 */
		EClass WORK_WEEKS_TYPE = eINSTANCE.getWorkWeeksType();

		/**
		 * The meta object literal for the '<em><b>Work Week</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_WEEKS_TYPE__WORK_WEEK = eINSTANCE.getWorkWeeksType_WorkWeek();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.impl.WorkWeekTypeImpl <em>Work Week Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.impl.WorkWeekTypeImpl
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkWeekType()
		 * @generated
		 */
		EClass WORK_WEEK_TYPE = eINSTANCE.getWorkWeekType();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_WEEK_TYPE__TIME_PERIOD = eINSTANCE.getWorkWeekType_TimePeriod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_WEEK_TYPE__NAME = eINSTANCE.getWorkWeekType_Name();

		/**
		 * The meta object literal for the '<em><b>Week Day</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_WEEK_TYPE__WEEK_DAY = eINSTANCE.getWorkWeekType_WeekDay();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.AccrueAtType <em>Accrue At Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.AccrueAtType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAccrueAtType()
		 * @generated
		 */
		EEnum ACCRUE_AT_TYPE = eINSTANCE.getAccrueAtType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.BaselineForEarnedValueType <em>Baseline For Earned Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.BaselineForEarnedValueType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineForEarnedValueType()
		 * @generated
		 */
		EEnum BASELINE_FOR_EARNED_VALUE_TYPE = eINSTANCE.getBaselineForEarnedValueType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.BookingTypeType <em>Booking Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.BookingTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeType()
		 * @generated
		 */
		EEnum BOOKING_TYPE_TYPE = eINSTANCE.getBookingTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.BookingTypeType1 <em>Booking Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.BookingTypeType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeType1()
		 * @generated
		 */
		EEnum BOOKING_TYPE_TYPE1 = eINSTANCE.getBookingTypeType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.CalculationTypeType <em>Calculation Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CalculationTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalculationTypeType()
		 * @generated
		 */
		EEnum CALCULATION_TYPE_TYPE = eINSTANCE.getCalculationTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.CFTypeType <em>CF Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CFTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCFTypeType()
		 * @generated
		 */
		EEnum CF_TYPE_TYPE = eINSTANCE.getCFTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.CommitmentTypeType <em>Commitment Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CommitmentTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCommitmentTypeType()
		 * @generated
		 */
		EEnum COMMITMENT_TYPE_TYPE = eINSTANCE.getCommitmentTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.ConstraintTypeType <em>Constraint Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.ConstraintTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getConstraintTypeType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE_TYPE = eINSTANCE.getConstraintTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.CostRateTableType <em>Cost Rate Table Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CostRateTableType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCostRateTableType()
		 * @generated
		 */
		EEnum COST_RATE_TABLE_TYPE = eINSTANCE.getCostRateTableType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.CurrencySymbolPositionType <em>Currency Symbol Position Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CurrencySymbolPositionType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencySymbolPositionType()
		 * @generated
		 */
		EEnum CURRENCY_SYMBOL_POSITION_TYPE = eINSTANCE.getCurrencySymbolPositionType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DayTypeType <em>Day Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DayTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeType()
		 * @generated
		 */
		EEnum DAY_TYPE_TYPE = eINSTANCE.getDayTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DayTypeType1 <em>Day Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DayTypeType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeType1()
		 * @generated
		 */
		EEnum DAY_TYPE_TYPE1 = eINSTANCE.getDayTypeType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DefaultFixedCostAccrualType <em>Default Fixed Cost Accrual Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DefaultFixedCostAccrualType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultFixedCostAccrualType()
		 * @generated
		 */
		EEnum DEFAULT_FIXED_COST_ACCRUAL_TYPE = eINSTANCE.getDefaultFixedCostAccrualType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DefaultTaskEVMethodType <em>Default Task EV Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DefaultTaskEVMethodType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskEVMethodType()
		 * @generated
		 */
		EEnum DEFAULT_TASK_EV_METHOD_TYPE = eINSTANCE.getDefaultTaskEVMethodType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DefaultTaskTypeType <em>Default Task Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DefaultTaskTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskTypeType()
		 * @generated
		 */
		EEnum DEFAULT_TASK_TYPE_TYPE = eINSTANCE.getDefaultTaskTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DurationFormatType <em>Duration Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType()
		 * @generated
		 */
		EEnum DURATION_FORMAT_TYPE = eINSTANCE.getDurationFormatType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DurationFormatType1 <em>Duration Format Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType1()
		 * @generated
		 */
		EEnum DURATION_FORMAT_TYPE1 = eINSTANCE.getDurationFormatType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DurationFormatType2 <em>Duration Format Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType2
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType2()
		 * @generated
		 */
		EEnum DURATION_FORMAT_TYPE2 = eINSTANCE.getDurationFormatType2();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DurationFormatType3 <em>Duration Format Type3</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType3
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType3()
		 * @generated
		 */
		EEnum DURATION_FORMAT_TYPE3 = eINSTANCE.getDurationFormatType3();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DurationFormatType4 <em>Duration Format Type4</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType4
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType4()
		 * @generated
		 */
		EEnum DURATION_FORMAT_TYPE4 = eINSTANCE.getDurationFormatType4();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.DurationFormatType5 <em>Duration Format Type5</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType5
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatType5()
		 * @generated
		 */
		EEnum DURATION_FORMAT_TYPE5 = eINSTANCE.getDurationFormatType5();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.EarnedValueMethodType <em>Earned Value Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.EarnedValueMethodType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodType()
		 * @generated
		 */
		EEnum EARNED_VALUE_METHOD_TYPE = eINSTANCE.getEarnedValueMethodType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.EarnedValueMethodType1 <em>Earned Value Method Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.EarnedValueMethodType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodType1()
		 * @generated
		 */
		EEnum EARNED_VALUE_METHOD_TYPE1 = eINSTANCE.getEarnedValueMethodType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.ElemTypeType <em>Elem Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.ElemTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getElemTypeType()
		 * @generated
		 */
		EEnum ELEM_TYPE_TYPE = eINSTANCE.getElemTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.FixedCostAccrualType <em>Fixed Cost Accrual Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.FixedCostAccrualType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFixedCostAccrualType()
		 * @generated
		 */
		EEnum FIXED_COST_ACCRUAL_TYPE = eINSTANCE.getFixedCostAccrualType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.FYStartDateType <em>FY Start Date Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.FYStartDateType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFYStartDateType()
		 * @generated
		 */
		EEnum FY_START_DATE_TYPE = eINSTANCE.getFYStartDateType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.LagFormatType <em>Lag Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.LagFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLagFormatType()
		 * @generated
		 */
		EEnum LAG_FORMAT_TYPE = eINSTANCE.getLagFormatType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.LevelingDelayFormatType <em>Leveling Delay Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.LevelingDelayFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatType()
		 * @generated
		 */
		EEnum LEVELING_DELAY_FORMAT_TYPE = eINSTANCE.getLevelingDelayFormatType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.LevelingDelayFormatType1 <em>Leveling Delay Format Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatType1()
		 * @generated
		 */
		EEnum LEVELING_DELAY_FORMAT_TYPE1 = eINSTANCE.getLevelingDelayFormatType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.MonthItemType <em>Month Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.MonthItemType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthItemType()
		 * @generated
		 */
		EEnum MONTH_ITEM_TYPE = eINSTANCE.getMonthItemType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.MonthPositionType <em>Month Position Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.MonthPositionType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthPositionType()
		 * @generated
		 */
		EEnum MONTH_POSITION_TYPE = eINSTANCE.getMonthPositionType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.MonthType <em>Month Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.MonthType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthType()
		 * @generated
		 */
		EEnum MONTH_TYPE = eINSTANCE.getMonthType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.NewTaskStartDateType <em>New Task Start Date Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.NewTaskStartDateType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNewTaskStartDateType()
		 * @generated
		 */
		EEnum NEW_TASK_START_DATE_TYPE = eINSTANCE.getNewTaskStartDateType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.OvertimeRateFormatType <em>Overtime Rate Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.OvertimeRateFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatType()
		 * @generated
		 */
		EEnum OVERTIME_RATE_FORMAT_TYPE = eINSTANCE.getOvertimeRateFormatType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.OvertimeRateFormatType1 <em>Overtime Rate Format Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatType1()
		 * @generated
		 */
		EEnum OVERTIME_RATE_FORMAT_TYPE1 = eINSTANCE.getOvertimeRateFormatType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.RateTableType <em>Rate Table Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.RateTableType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRateTableType()
		 * @generated
		 */
		EEnum RATE_TABLE_TYPE = eINSTANCE.getRateTableType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.RollupTypeType <em>Rollup Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.RollupTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRollupTypeType()
		 * @generated
		 */
		EEnum ROLLUP_TYPE_TYPE = eINSTANCE.getRollupTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.StandardRateFormatType <em>Standard Rate Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.StandardRateFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatType()
		 * @generated
		 */
		EEnum STANDARD_RATE_FORMAT_TYPE = eINSTANCE.getStandardRateFormatType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.StandardRateFormatType1 <em>Standard Rate Format Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.StandardRateFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatType1()
		 * @generated
		 */
		EEnum STANDARD_RATE_FORMAT_TYPE1 = eINSTANCE.getStandardRateFormatType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType1 <em>Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType1()
		 * @generated
		 */
		EEnum TYPE_TYPE1 = eINSTANCE.getTypeType1();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType2 <em>Type Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType2
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType2()
		 * @generated
		 */
		EEnum TYPE_TYPE2 = eINSTANCE.getTypeType2();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType3 <em>Type Type3</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType3
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType3()
		 * @generated
		 */
		EEnum TYPE_TYPE3 = eINSTANCE.getTypeType3();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType4 <em>Type Type4</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType4
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType4()
		 * @generated
		 */
		EEnum TYPE_TYPE4 = eINSTANCE.getTypeType4();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType5 <em>Type Type5</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType5
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType5()
		 * @generated
		 */
		EEnum TYPE_TYPE5 = eINSTANCE.getTypeType5();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType6 <em>Type Type6</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType6
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType6()
		 * @generated
		 */
		EEnum TYPE_TYPE6 = eINSTANCE.getTypeType6();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.TypeType7 <em>Type Type7</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType7
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeType7()
		 * @generated
		 */
		EEnum TYPE_TYPE7 = eINSTANCE.getTypeType7();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.UnitType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.ValuelistSortOrderType <em>Valuelist Sort Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.ValuelistSortOrderType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValuelistSortOrderType()
		 * @generated
		 */
		EEnum VALUELIST_SORT_ORDER_TYPE = eINSTANCE.getValuelistSortOrderType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.WeekStartDayType <em>Week Start Day Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WeekStartDayType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekStartDayType()
		 * @generated
		 */
		EEnum WEEK_START_DAY_TYPE = eINSTANCE.getWeekStartDayType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.WorkContourType <em>Work Contour Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WorkContourType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkContourType()
		 * @generated
		 */
		EEnum WORK_CONTOUR_TYPE = eINSTANCE.getWorkContourType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.WorkFormatType <em>Work Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WorkFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkFormatType()
		 * @generated
		 */
		EEnum WORK_FORMAT_TYPE = eINSTANCE.getWorkFormatType();

		/**
		 * The meta object literal for the '{@link net.certware.planning.mspdi.WorkGroupType <em>Work Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WorkGroupType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkGroupType()
		 * @generated
		 */
		EEnum WORK_GROUP_TYPE = eINSTANCE.getWorkGroupType();

		/**
		 * The meta object literal for the '<em>Accrue At Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.AccrueAtType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAccrueAtTypeObject()
		 * @generated
		 */
		EDataType ACCRUE_AT_TYPE_OBJECT = eINSTANCE.getAccrueAtTypeObject();

		/**
		 * The meta object literal for the '<em>Active Directory GUID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getActiveDirectoryGUIDType()
		 * @generated
		 */
		EDataType ACTIVE_DIRECTORY_GUID_TYPE = eINSTANCE.getActiveDirectoryGUIDType();

		/**
		 * The meta object literal for the '<em>Alias Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAliasType()
		 * @generated
		 */
		EDataType ALIAS_TYPE = eINSTANCE.getAliasType();

		/**
		 * The meta object literal for the '<em>Author Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getAuthorType()
		 * @generated
		 */
		EDataType AUTHOR_TYPE = eINSTANCE.getAuthorType();

		/**
		 * The meta object literal for the '<em>Baseline For Earned Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.BaselineForEarnedValueType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBaselineForEarnedValueTypeObject()
		 * @generated
		 */
		EDataType BASELINE_FOR_EARNED_VALUE_TYPE_OBJECT = eINSTANCE.getBaselineForEarnedValueTypeObject();

		/**
		 * The meta object literal for the '<em>Booking Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.BookingTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeTypeObject()
		 * @generated
		 */
		EDataType BOOKING_TYPE_TYPE_OBJECT = eINSTANCE.getBookingTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Booking Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.BookingTypeType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getBookingTypeTypeObject1()
		 * @generated
		 */
		EDataType BOOKING_TYPE_TYPE_OBJECT1 = eINSTANCE.getBookingTypeTypeObject1();

		/**
		 * The meta object literal for the '<em>Calculation Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CalculationTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCalculationTypeTypeObject()
		 * @generated
		 */
		EDataType CALCULATION_TYPE_TYPE_OBJECT = eINSTANCE.getCalculationTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Category Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCategoryType()
		 * @generated
		 */
		EDataType CATEGORY_TYPE = eINSTANCE.getCategoryType();

		/**
		 * The meta object literal for the '<em>CF Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CFTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCFTypeTypeObject()
		 * @generated
		 */
		EDataType CF_TYPE_TYPE_OBJECT = eINSTANCE.getCFTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Code Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCodeType()
		 * @generated
		 */
		EDataType CODE_TYPE = eINSTANCE.getCodeType();

		/**
		 * The meta object literal for the '<em>Commitment Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CommitmentTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCommitmentTypeTypeObject()
		 * @generated
		 */
		EDataType COMMITMENT_TYPE_TYPE_OBJECT = eINSTANCE.getCommitmentTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Company Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCompanyType()
		 * @generated
		 */
		EDataType COMPANY_TYPE = eINSTANCE.getCompanyType();

		/**
		 * The meta object literal for the '<em>Constraint Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.ConstraintTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getConstraintTypeTypeObject()
		 * @generated
		 */
		EDataType CONSTRAINT_TYPE_TYPE_OBJECT = eINSTANCE.getConstraintTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Contact Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getContactType()
		 * @generated
		 */
		EDataType CONTACT_TYPE = eINSTANCE.getContactType();

		/**
		 * The meta object literal for the '<em>Cost Rate Table Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CostRateTableType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCostRateTableTypeObject()
		 * @generated
		 */
		EDataType COST_RATE_TABLE_TYPE_OBJECT = eINSTANCE.getCostRateTableTypeObject();

		/**
		 * The meta object literal for the '<em>Currency Code Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencyCodeType()
		 * @generated
		 */
		EDataType CURRENCY_CODE_TYPE = eINSTANCE.getCurrencyCodeType();

		/**
		 * The meta object literal for the '<em>Currency Symbol Position Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.CurrencySymbolPositionType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencySymbolPositionTypeObject()
		 * @generated
		 */
		EDataType CURRENCY_SYMBOL_POSITION_TYPE_OBJECT = eINSTANCE.getCurrencySymbolPositionTypeObject();

		/**
		 * The meta object literal for the '<em>Currency Symbol Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getCurrencySymbolType()
		 * @generated
		 */
		EDataType CURRENCY_SYMBOL_TYPE = eINSTANCE.getCurrencySymbolType();

		/**
		 * The meta object literal for the '<em>Day Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DayTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeTypeObject()
		 * @generated
		 */
		EDataType DAY_TYPE_TYPE_OBJECT = eINSTANCE.getDayTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Day Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DayTypeType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDayTypeTypeObject1()
		 * @generated
		 */
		EDataType DAY_TYPE_TYPE_OBJECT1 = eINSTANCE.getDayTypeTypeObject1();

		/**
		 * The meta object literal for the '<em>Default Fixed Cost Accrual Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DefaultFixedCostAccrualType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultFixedCostAccrualTypeObject()
		 * @generated
		 */
		EDataType DEFAULT_FIXED_COST_ACCRUAL_TYPE_OBJECT = eINSTANCE.getDefaultFixedCostAccrualTypeObject();

		/**
		 * The meta object literal for the '<em>Default Task EV Method Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DefaultTaskEVMethodType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskEVMethodTypeObject()
		 * @generated
		 */
		EDataType DEFAULT_TASK_EV_METHOD_TYPE_OBJECT = eINSTANCE.getDefaultTaskEVMethodTypeObject();

		/**
		 * The meta object literal for the '<em>Default Task Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DefaultTaskTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDefaultTaskTypeTypeObject()
		 * @generated
		 */
		EDataType DEFAULT_TASK_TYPE_TYPE_OBJECT = eINSTANCE.getDefaultTaskTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Duration Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType4
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject()
		 * @generated
		 */
		EDataType DURATION_FORMAT_TYPE_OBJECT = eINSTANCE.getDurationFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Duration Format Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject1()
		 * @generated
		 */
		EDataType DURATION_FORMAT_TYPE_OBJECT1 = eINSTANCE.getDurationFormatTypeObject1();

		/**
		 * The meta object literal for the '<em>Duration Format Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType2
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject2()
		 * @generated
		 */
		EDataType DURATION_FORMAT_TYPE_OBJECT2 = eINSTANCE.getDurationFormatTypeObject2();

		/**
		 * The meta object literal for the '<em>Duration Format Type Object3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType3
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject3()
		 * @generated
		 */
		EDataType DURATION_FORMAT_TYPE_OBJECT3 = eINSTANCE.getDurationFormatTypeObject3();

		/**
		 * The meta object literal for the '<em>Duration Format Type Object4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject4()
		 * @generated
		 */
		EDataType DURATION_FORMAT_TYPE_OBJECT4 = eINSTANCE.getDurationFormatTypeObject4();

		/**
		 * The meta object literal for the '<em>Duration Format Type Object5</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.DurationFormatType5
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getDurationFormatTypeObject5()
		 * @generated
		 */
		EDataType DURATION_FORMAT_TYPE_OBJECT5 = eINSTANCE.getDurationFormatTypeObject5();

		/**
		 * The meta object literal for the '<em>Earned Value Method Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.EarnedValueMethodType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodTypeObject()
		 * @generated
		 */
		EDataType EARNED_VALUE_METHOD_TYPE_OBJECT = eINSTANCE.getEarnedValueMethodTypeObject();

		/**
		 * The meta object literal for the '<em>Earned Value Method Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.EarnedValueMethodType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEarnedValueMethodTypeObject1()
		 * @generated
		 */
		EDataType EARNED_VALUE_METHOD_TYPE_OBJECT1 = eINSTANCE.getEarnedValueMethodTypeObject1();

		/**
		 * The meta object literal for the '<em>Elem Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.ElemTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getElemTypeTypeObject()
		 * @generated
		 */
		EDataType ELEM_TYPE_TYPE_OBJECT = eINSTANCE.getElemTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Email Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getEmailAddressType()
		 * @generated
		 */
		EDataType EMAIL_ADDRESS_TYPE = eINSTANCE.getEmailAddressType();

		/**
		 * The meta object literal for the '<em>External Task Project Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getExternalTaskProjectType()
		 * @generated
		 */
		EDataType EXTERNAL_TASK_PROJECT_TYPE = eINSTANCE.getExternalTaskProjectType();

		/**
		 * The meta object literal for the '<em>Fixed Cost Accrual Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.FixedCostAccrualType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFixedCostAccrualTypeObject()
		 * @generated
		 */
		EDataType FIXED_COST_ACCRUAL_TYPE_OBJECT = eINSTANCE.getFixedCostAccrualTypeObject();

		/**
		 * The meta object literal for the '<em>FY Start Date Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.FYStartDateType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getFYStartDateTypeObject()
		 * @generated
		 */
		EDataType FY_START_DATE_TYPE_OBJECT = eINSTANCE.getFYStartDateTypeObject();

		/**
		 * The meta object literal for the '<em>Group Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getGroupType()
		 * @generated
		 */
		EDataType GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '<em>Hyperlink Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkAddressType()
		 * @generated
		 */
		EDataType HYPERLINK_ADDRESS_TYPE = eINSTANCE.getHyperlinkAddressType();

		/**
		 * The meta object literal for the '<em>Hyperlink Address Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkAddressType1()
		 * @generated
		 */
		EDataType HYPERLINK_ADDRESS_TYPE1 = eINSTANCE.getHyperlinkAddressType1();

		/**
		 * The meta object literal for the '<em>Hyperlink Address Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkAddressType2()
		 * @generated
		 */
		EDataType HYPERLINK_ADDRESS_TYPE2 = eINSTANCE.getHyperlinkAddressType2();

		/**
		 * The meta object literal for the '<em>Hyperlink Sub Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkSubAddressType()
		 * @generated
		 */
		EDataType HYPERLINK_SUB_ADDRESS_TYPE = eINSTANCE.getHyperlinkSubAddressType();

		/**
		 * The meta object literal for the '<em>Hyperlink Sub Address Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkSubAddressType1()
		 * @generated
		 */
		EDataType HYPERLINK_SUB_ADDRESS_TYPE1 = eINSTANCE.getHyperlinkSubAddressType1();

		/**
		 * The meta object literal for the '<em>Hyperlink Sub Address Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkSubAddressType2()
		 * @generated
		 */
		EDataType HYPERLINK_SUB_ADDRESS_TYPE2 = eINSTANCE.getHyperlinkSubAddressType2();

		/**
		 * The meta object literal for the '<em>Hyperlink Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkType()
		 * @generated
		 */
		EDataType HYPERLINK_TYPE = eINSTANCE.getHyperlinkType();

		/**
		 * The meta object literal for the '<em>Hyperlink Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkType1()
		 * @generated
		 */
		EDataType HYPERLINK_TYPE1 = eINSTANCE.getHyperlinkType1();

		/**
		 * The meta object literal for the '<em>Hyperlink Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getHyperlinkType2()
		 * @generated
		 */
		EDataType HYPERLINK_TYPE2 = eINSTANCE.getHyperlinkType2();

		/**
		 * The meta object literal for the '<em>Initials Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getInitialsType()
		 * @generated
		 */
		EDataType INITIALS_TYPE = eINSTANCE.getInitialsType();

		/**
		 * The meta object literal for the '<em>Lag Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.LagFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLagFormatTypeObject()
		 * @generated
		 */
		EDataType LAG_FORMAT_TYPE_OBJECT = eINSTANCE.getLagFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Leveling Delay Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.LevelingDelayFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatTypeObject()
		 * @generated
		 */
		EDataType LEVELING_DELAY_FORMAT_TYPE_OBJECT = eINSTANCE.getLevelingDelayFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Leveling Delay Format Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getLevelingDelayFormatTypeObject1()
		 * @generated
		 */
		EDataType LEVELING_DELAY_FORMAT_TYPE_OBJECT1 = eINSTANCE.getLevelingDelayFormatTypeObject1();

		/**
		 * The meta object literal for the '<em>Manager Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getManagerType()
		 * @generated
		 */
		EDataType MANAGER_TYPE = eINSTANCE.getManagerType();

		/**
		 * The meta object literal for the '<em>Material Label Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMaterialLabelType()
		 * @generated
		 */
		EDataType MATERIAL_LABEL_TYPE = eINSTANCE.getMaterialLabelType();

		/**
		 * The meta object literal for the '<em>Month Item Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.MonthItemType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthItemTypeObject()
		 * @generated
		 */
		EDataType MONTH_ITEM_TYPE_OBJECT = eINSTANCE.getMonthItemTypeObject();

		/**
		 * The meta object literal for the '<em>Month Position Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.MonthPositionType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthPositionTypeObject()
		 * @generated
		 */
		EDataType MONTH_POSITION_TYPE_OBJECT = eINSTANCE.getMonthPositionTypeObject();

		/**
		 * The meta object literal for the '<em>Month Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.MonthType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getMonthTypeObject()
		 * @generated
		 */
		EDataType MONTH_TYPE_OBJECT = eINSTANCE.getMonthTypeObject();

		/**
		 * The meta object literal for the '<em>Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType()
		 * @generated
		 */
		EDataType NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em>Name Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType1()
		 * @generated
		 */
		EDataType NAME_TYPE1 = eINSTANCE.getNameType1();

		/**
		 * The meta object literal for the '<em>Name Type2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType2()
		 * @generated
		 */
		EDataType NAME_TYPE2 = eINSTANCE.getNameType2();

		/**
		 * The meta object literal for the '<em>Name Type3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType3()
		 * @generated
		 */
		EDataType NAME_TYPE3 = eINSTANCE.getNameType3();

		/**
		 * The meta object literal for the '<em>Name Type4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType4()
		 * @generated
		 */
		EDataType NAME_TYPE4 = eINSTANCE.getNameType4();

		/**
		 * The meta object literal for the '<em>Name Type5</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNameType5()
		 * @generated
		 */
		EDataType NAME_TYPE5 = eINSTANCE.getNameType5();

		/**
		 * The meta object literal for the '<em>New Task Start Date Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.NewTaskStartDateType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNewTaskStartDateTypeObject()
		 * @generated
		 */
		EDataType NEW_TASK_START_DATE_TYPE_OBJECT = eINSTANCE.getNewTaskStartDateTypeObject();

		/**
		 * The meta object literal for the '<em>NT Account Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getNTAccountType()
		 * @generated
		 */
		EDataType NT_ACCOUNT_TYPE = eINSTANCE.getNTAccountType();

		/**
		 * The meta object literal for the '<em>Outline Number Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOutlineNumberType()
		 * @generated
		 */
		EDataType OUTLINE_NUMBER_TYPE = eINSTANCE.getOutlineNumberType();

		/**
		 * The meta object literal for the '<em>Overtime Rate Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.OvertimeRateFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatTypeObject()
		 * @generated
		 */
		EDataType OVERTIME_RATE_FORMAT_TYPE_OBJECT = eINSTANCE.getOvertimeRateFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Overtime Rate Format Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getOvertimeRateFormatTypeObject1()
		 * @generated
		 */
		EDataType OVERTIME_RATE_FORMAT_TYPE_OBJECT1 = eINSTANCE.getOvertimeRateFormatTypeObject1();

		/**
		 * The meta object literal for the '<em>Phonetic Alias Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPhoneticAliasType()
		 * @generated
		 */
		EDataType PHONETIC_ALIAS_TYPE = eINSTANCE.getPhoneticAliasType();

		/**
		 * The meta object literal for the '<em>Phonetics Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPhoneticsType()
		 * @generated
		 */
		EDataType PHONETICS_TYPE = eINSTANCE.getPhoneticsType();

		/**
		 * The meta object literal for the '<em>Prefix Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getPrefixType()
		 * @generated
		 */
		EDataType PREFIX_TYPE = eINSTANCE.getPrefixType();

		/**
		 * The meta object literal for the '<em>Rate Table Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.RateTableType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRateTableTypeObject()
		 * @generated
		 */
		EDataType RATE_TABLE_TYPE_OBJECT = eINSTANCE.getRateTableTypeObject();

		/**
		 * The meta object literal for the '<em>Rollup Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.RollupTypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getRollupTypeTypeObject()
		 * @generated
		 */
		EDataType ROLLUP_TYPE_TYPE_OBJECT = eINSTANCE.getRollupTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Standard Rate Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.StandardRateFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatTypeObject()
		 * @generated
		 */
		EDataType STANDARD_RATE_FORMAT_TYPE_OBJECT = eINSTANCE.getStandardRateFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Standard Rate Format Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.StandardRateFormatType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getStandardRateFormatTypeObject1()
		 * @generated
		 */
		EDataType STANDARD_RATE_FORMAT_TYPE_OBJECT1 = eINSTANCE.getStandardRateFormatTypeObject1();

		/**
		 * The meta object literal for the '<em>Subject Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getSubjectType()
		 * @generated
		 */
		EDataType SUBJECT_TYPE = eINSTANCE.getSubjectType();

		/**
		 * The meta object literal for the '<em>Subproject Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getSubprojectNameType()
		 * @generated
		 */
		EDataType SUBPROJECT_NAME_TYPE = eINSTANCE.getSubprojectNameType();

		/**
		 * The meta object literal for the '<em>Title Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTitleType()
		 * @generated
		 */
		EDataType TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType3
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType5
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject1()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT1 = eINSTANCE.getTypeTypeObject1();

		/**
		 * The meta object literal for the '<em>Type Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject2()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT2 = eINSTANCE.getTypeTypeObject2();

		/**
		 * The meta object literal for the '<em>Type Type Object3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType1
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject3()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT3 = eINSTANCE.getTypeTypeObject3();

		/**
		 * The meta object literal for the '<em>Type Type Object4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType2
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject4()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT4 = eINSTANCE.getTypeTypeObject4();

		/**
		 * The meta object literal for the '<em>Type Type Object5</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType4
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject5()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT5 = eINSTANCE.getTypeTypeObject5();

		/**
		 * The meta object literal for the '<em>Type Type Object6</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType6
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject6()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT6 = eINSTANCE.getTypeTypeObject6();

		/**
		 * The meta object literal for the '<em>Type Type Object7</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.TypeType7
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getTypeTypeObject7()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT7 = eINSTANCE.getTypeTypeObject7();

		/**
		 * The meta object literal for the '<em>UID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getUIDType()
		 * @generated
		 */
		EDataType UID_TYPE = eINSTANCE.getUIDType();

		/**
		 * The meta object literal for the '<em>Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.UnitType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getUnitTypeObject()
		 * @generated
		 */
		EDataType UNIT_TYPE_OBJECT = eINSTANCE.getUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Valuelist Sort Order Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.ValuelistSortOrderType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getValuelistSortOrderTypeObject()
		 * @generated
		 */
		EDataType VALUELIST_SORT_ORDER_TYPE_OBJECT = eINSTANCE.getValuelistSortOrderTypeObject();

		/**
		 * The meta object literal for the '<em>Week Start Day Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WeekStartDayType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWeekStartDayTypeObject()
		 * @generated
		 */
		EDataType WEEK_START_DAY_TYPE_OBJECT = eINSTANCE.getWeekStartDayTypeObject();

		/**
		 * The meta object literal for the '<em>Work Contour Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WorkContourType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkContourTypeObject()
		 * @generated
		 */
		EDataType WORK_CONTOUR_TYPE_OBJECT = eINSTANCE.getWorkContourTypeObject();

		/**
		 * The meta object literal for the '<em>Work Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WorkFormatType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkFormatTypeObject()
		 * @generated
		 */
		EDataType WORK_FORMAT_TYPE_OBJECT = eINSTANCE.getWorkFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Work Group Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.planning.mspdi.WorkGroupType
		 * @see net.certware.planning.mspdi.impl.MspdiPackageImpl#getWorkGroupTypeObject()
		 * @generated
		 */
		EDataType WORK_GROUP_TYPE_OBJECT = eINSTANCE.getWorkGroupTypeObject();

	}

} //MspdiPackage
