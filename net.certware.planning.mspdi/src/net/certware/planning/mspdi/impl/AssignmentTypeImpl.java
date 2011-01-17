/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.planning.mspdi.AssignmentType;
import net.certware.planning.mspdi.BaselineType;
import net.certware.planning.mspdi.BookingTypeType;
import net.certware.planning.mspdi.CostRateTableType;
import net.certware.planning.mspdi.ExtendedAttributeType;
import net.certware.planning.mspdi.LevelingDelayFormatType;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.TimephasedDataType;
import net.certware.planning.mspdi.WorkContourType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getTaskUID <em>Task UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getResourceUID <em>Resource UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getPercentWorkComplete <em>Percent Work Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualOvertimeCost <em>Actual Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualOvertimeWork <em>Actual Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualWork <em>Actual Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getACWP <em>ACWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isConfirmed <em>Confirmed</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getCostRateTable <em>Cost Rate Table</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getCostVariance <em>Cost Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getCV <em>CV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getFinishVariance <em>Finish Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getHyperlinkAddress <em>Hyperlink Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getWorkVariance <em>Work Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isHasFixedRateUnits <em>Has Fixed Rate Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isFixedMaterial <em>Fixed Material</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getLevelingDelay <em>Leveling Delay</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getLevelingDelayFormat <em>Leveling Delay Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isLinkedFields <em>Linked Fields</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isMilestone <em>Milestone</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isOverallocated <em>Overallocated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getOvertimeCost <em>Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getOvertimeWork <em>Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getPeakUnits <em>Peak Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getRegularWork <em>Regular Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getRemainingWork <em>Remaining Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isResponsePending <em>Response Pending</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getResume <em>Resume</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getStartVariance <em>Start Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getSV <em>SV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#isUpdateNeeded <em>Update Needed</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getVAC <em>VAC</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getWorkContour <em>Work Contour</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getBookingType <em>Booking Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualWorkProtected <em>Actual Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getAssnOwner <em>Assn Owner</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getAssnOwnerGuid <em>Assn Owner Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getBudgetCost <em>Budget Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getBudgetWork <em>Budget Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404000 <em>F404000</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404001 <em>F404001</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404002 <em>F404002</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404003 <em>F404003</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404004 <em>F404004</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404005 <em>F404005</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404006 <em>F404006</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404007 <em>F404007</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404008 <em>F404008</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404009 <em>F404009</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40400a <em>F4040 0a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40400b <em>F4040 0b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40400c <em>F4040 0c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40400d <em>F4040 0d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40400e <em>F4040 0e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40400f <em>F4040 0f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404010 <em>F404010</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404011 <em>F404011</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404012 <em>F404012</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404013 <em>F404013</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404014 <em>F404014</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404015 <em>F404015</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404016 <em>F404016</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404017 <em>F404017</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404018 <em>F404018</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404019 <em>F404019</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40401a <em>F4040 1a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40401b <em>F4040 1b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40401c <em>F4040 1c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40401d <em>F4040 1d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40401e <em>F4040 1e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40401f <em>F4040 1f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404020 <em>F404020</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404021 <em>F404021</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404022 <em>F404022</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404023 <em>F404023</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404024 <em>F404024</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404025 <em>F404025</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404026 <em>F404026</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404027 <em>F404027</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404028 <em>F404028</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404029 <em>F404029</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40402a <em>F4040 2a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40402b <em>F4040 2b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40402c <em>F4040 2c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40402d <em>F4040 2d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40402e <em>F4040 2e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40402f <em>F4040 2f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404030 <em>F404030</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404031 <em>F404031</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404032 <em>F404032</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404033 <em>F404033</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404034 <em>F404034</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404035 <em>F404035</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404036 <em>F404036</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404037 <em>F404037</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404038 <em>F404038</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404039 <em>F404039</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40403a <em>F4040 3a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40403b <em>F4040 3b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40403c <em>F4040 3c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40403d <em>F4040 3d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40403e <em>F4040 3e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40403f <em>F4040 3f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404040 <em>F404040</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404041 <em>F404041</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404042 <em>F404042</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404043 <em>F404043</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404044 <em>F404044</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404045 <em>F404045</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404046 <em>F404046</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404047 <em>F404047</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404048 <em>F404048</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404049 <em>F404049</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40404a <em>F4040 4a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40404b <em>F4040 4b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40404c <em>F4040 4c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40404d <em>F4040 4d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40404e <em>F4040 4e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40404f <em>F4040 4f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404050 <em>F404050</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404051 <em>F404051</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404052 <em>F404052</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404053 <em>F404053</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404054 <em>F404054</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404055 <em>F404055</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404056 <em>F404056</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404057 <em>F404057</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404058 <em>F404058</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404059 <em>F404059</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40405a <em>F4040 5a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40405b <em>F4040 5b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40405c <em>F4040 5c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40405d <em>F4040 5d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40405e <em>F4040 5e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40405f <em>F4040 5f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404060 <em>F404060</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404061 <em>F404061</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404062 <em>F404062</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404063 <em>F404063</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404064 <em>F404064</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404065 <em>F404065</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404066 <em>F404066</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404067 <em>F404067</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404068 <em>F404068</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404069 <em>F404069</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40406a <em>F4040 6a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40406b <em>F4040 6b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40406c <em>F4040 6c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40406d <em>F4040 6d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40406e <em>F4040 6e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40406f <em>F4040 6f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404070 <em>F404070</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404071 <em>F404071</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404072 <em>F404072</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404073 <em>F404073</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404074 <em>F404074</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404075 <em>F404075</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404076 <em>F404076</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404077 <em>F404077</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404078 <em>F404078</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404079 <em>F404079</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40407a <em>F4040 7a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40407b <em>F4040 7b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40407c <em>F4040 7c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40407d <em>F4040 7d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40407e <em>F4040 7e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40407f <em>F4040 7f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404080 <em>F404080</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404081 <em>F404081</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404082 <em>F404082</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404083 <em>F404083</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404084 <em>F404084</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404085 <em>F404085</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404086 <em>F404086</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404087 <em>F404087</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404088 <em>F404088</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404089 <em>F404089</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40408a <em>F4040 8a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40408b <em>F4040 8b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40408c <em>F4040 8c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40408d <em>F4040 8d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40408e <em>F4040 8e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40408f <em>F4040 8f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404090 <em>F404090</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404091 <em>F404091</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404092 <em>F404092</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404093 <em>F404093</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404094 <em>F404094</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404095 <em>F404095</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404096 <em>F404096</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404097 <em>F404097</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404098 <em>F404098</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF404099 <em>F404099</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40409a <em>F4040 9a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40409b <em>F4040 9b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40409c <em>F4040 9c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40409d <em>F4040 9d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40409e <em>F4040 9e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF40409f <em>F4040 9f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a0 <em>F404 0a0</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a1 <em>F404 0a1</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a2 <em>F404 0a2</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a3 <em>F404 0a3</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a4 <em>F404 0a4</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a5 <em>F404 0a5</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a6 <em>F404 0a6</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a7 <em>F404 0a7</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a8 <em>F404 0a8</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040a9 <em>F404 0a9</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040aa <em>F404 0aa</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040ab <em>F404 0ab</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040ac <em>F404 0ac</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040ad <em>F404 0ad</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040ae <em>F404 0ae</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040af <em>F404 0af</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b0 <em>F404 0b0</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b1 <em>F404 0b1</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b2 <em>F404 0b2</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b3 <em>F404 0b3</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b4 <em>F404 0b4</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b5 <em>F404 0b5</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b6 <em>F404 0b6</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b7 <em>F404 0b7</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b8 <em>F404 0b8</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040b9 <em>F404 0b9</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040ba <em>F404 0ba</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040bb <em>F404 0bb</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040bc <em>F404 0bc</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040bd <em>F404 0bd</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040be <em>F404 0be</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040bf <em>F404 0bf</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c0 <em>F404 0c0</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c1 <em>F404 0c1</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c2 <em>F404 0c2</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c3 <em>F404 0c3</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c4 <em>F404 0c4</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c5 <em>F404 0c5</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c6 <em>F404 0c6</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c7 <em>F404 0c7</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getF4040c8 <em>F404 0c8</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AssignmentTypeImpl#getTimephasedData <em>Timephased Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentTypeImpl extends EObjectImpl implements AssignmentType {
	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger uID = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskUID() <em>Task UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TASK_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskUID() <em>Task UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger taskUID = TASK_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceUID() <em>Resource UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESOURCE_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceUID() <em>Resource UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger resourceUID = RESOURCE_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentWorkComplete() <em>Percent Work Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentWorkComplete()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PERCENT_WORK_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentWorkComplete() <em>Percent Work Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentWorkComplete()
	 * @generated
	 * @ordered
	 */
	protected BigInteger percentWorkComplete = PERCENT_WORK_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualCost = ACTUAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualFinish() <em>Actual Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTUAL_FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualFinish() <em>Actual Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar actualFinish = ACTUAL_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualOvertimeCost() <em>Actual Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_OVERTIME_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualOvertimeCost() <em>Actual Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualOvertimeCost = ACTUAL_OVERTIME_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualOvertimeWork() <em>Actual Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_OVERTIME_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualOvertimeWork() <em>Actual Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected Duration actualOvertimeWork = ACTUAL_OVERTIME_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualStart() <em>Actual Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTUAL_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualStart() <em>Actual Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar actualStart = ACTUAL_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualWork() <em>Actual Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualWork() <em>Actual Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWork()
	 * @generated
	 * @ordered
	 */
	protected Duration actualWork = ACTUAL_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getACWP() <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACWP()
	 * @generated
	 * @ordered
	 */
	protected static final float ACWP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getACWP() <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACWP()
	 * @generated
	 * @ordered
	 */
	protected float aCWP = ACWP_EDEFAULT;

	/**
	 * This is true if the ACWP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aCWPESet;

	/**
	 * The default value of the '{@link #isConfirmed() <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIRMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfirmed() <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmed()
	 * @generated
	 * @ordered
	 */
	protected boolean confirmed = CONFIRMED_EDEFAULT;

	/**
	 * This is true if the Confirmed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confirmedESet;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostRateTable() <em>Cost Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostRateTable()
	 * @generated
	 * @ordered
	 */
	protected static final CostRateTableType COST_RATE_TABLE_EDEFAULT = CostRateTableType._0;

	/**
	 * The cached value of the '{@link #getCostRateTable() <em>Cost Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostRateTable()
	 * @generated
	 * @ordered
	 */
	protected CostRateTableType costRateTable = COST_RATE_TABLE_EDEFAULT;

	/**
	 * This is true if the Cost Rate Table attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costRateTableESet;

	/**
	 * The default value of the '{@link #getCostVariance() <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostVariance()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_VARIANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostVariance() <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostVariance()
	 * @generated
	 * @ordered
	 */
	protected float costVariance = COST_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Cost Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costVarianceESet;

	/**
	 * The default value of the '{@link #getCV() <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCV()
	 * @generated
	 * @ordered
	 */
	protected static final float CV_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCV() <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCV()
	 * @generated
	 * @ordered
	 */
	protected float cV = CV_EDEFAULT;

	/**
	 * This is true if the CV attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cVESet;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinish() <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finish = FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinishVariance() <em>Finish Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishVariance()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FINISH_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishVariance() <em>Finish Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishVariance()
	 * @generated
	 * @ordered
	 */
	protected BigInteger finishVariance = FINISH_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyperlink() <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlink()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyperlink() <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlink()
	 * @generated
	 * @ordered
	 */
	protected String hyperlink = HYPERLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyperlinkAddress() <em>Hyperlink Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyperlinkAddress() <em>Hyperlink Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkAddress()
	 * @generated
	 * @ordered
	 */
	protected String hyperlinkAddress = HYPERLINK_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyperlinkSubAddress() <em>Hyperlink Sub Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkSubAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_SUB_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyperlinkSubAddress() <em>Hyperlink Sub Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkSubAddress()
	 * @generated
	 * @ordered
	 */
	protected String hyperlinkSubAddress = HYPERLINK_SUB_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkVariance() <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkVariance()
	 * @generated
	 * @ordered
	 */
	protected static final float WORK_VARIANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorkVariance() <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkVariance()
	 * @generated
	 * @ordered
	 */
	protected float workVariance = WORK_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Work Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workVarianceESet;

	/**
	 * The default value of the '{@link #isHasFixedRateUnits() <em>Has Fixed Rate Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFixedRateUnits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_FIXED_RATE_UNITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasFixedRateUnits() <em>Has Fixed Rate Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFixedRateUnits()
	 * @generated
	 * @ordered
	 */
	protected boolean hasFixedRateUnits = HAS_FIXED_RATE_UNITS_EDEFAULT;

	/**
	 * This is true if the Has Fixed Rate Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasFixedRateUnitsESet;

	/**
	 * The default value of the '{@link #isFixedMaterial() <em>Fixed Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_MATERIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixedMaterial() <em>Fixed Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedMaterial()
	 * @generated
	 * @ordered
	 */
	protected boolean fixedMaterial = FIXED_MATERIAL_EDEFAULT;

	/**
	 * This is true if the Fixed Material attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedMaterialESet;

	/**
	 * The default value of the '{@link #getLevelingDelay() <em>Leveling Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEVELING_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelingDelay() <em>Leveling Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger levelingDelay = LEVELING_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelingDelayFormat() <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelayFormat()
	 * @generated
	 * @ordered
	 */
	protected static final LevelingDelayFormatType LEVELING_DELAY_FORMAT_EDEFAULT = LevelingDelayFormatType._3;

	/**
	 * The cached value of the '{@link #getLevelingDelayFormat() <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelayFormat()
	 * @generated
	 * @ordered
	 */
	protected LevelingDelayFormatType levelingDelayFormat = LEVELING_DELAY_FORMAT_EDEFAULT;

	/**
	 * This is true if the Leveling Delay Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelingDelayFormatESet;

	/**
	 * The default value of the '{@link #isLinkedFields() <em>Linked Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinkedFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINKED_FIELDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLinkedFields() <em>Linked Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinkedFields()
	 * @generated
	 * @ordered
	 */
	protected boolean linkedFields = LINKED_FIELDS_EDEFAULT;

	/**
	 * This is true if the Linked Fields attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linkedFieldsESet;

	/**
	 * The default value of the '{@link #isMilestone() <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMilestone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MILESTONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMilestone() <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMilestone()
	 * @generated
	 * @ordered
	 */
	protected boolean milestone = MILESTONE_EDEFAULT;

	/**
	 * This is true if the Milestone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean milestoneESet;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isOverallocated() <em>Overallocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverallocated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERALLOCATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverallocated() <em>Overallocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverallocated()
	 * @generated
	 * @ordered
	 */
	protected boolean overallocated = OVERALLOCATED_EDEFAULT;

	/**
	 * This is true if the Overallocated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallocatedESet;

	/**
	 * The default value of the '{@link #getOvertimeCost() <em>Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OVERTIME_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvertimeCost() <em>Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal overtimeCost = OVERTIME_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvertimeWork() <em>Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration OVERTIME_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvertimeWork() <em>Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected Duration overtimeWork = OVERTIME_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeakUnits() <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakUnits()
	 * @generated
	 * @ordered
	 */
	protected static final float PEAK_UNITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPeakUnits() <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakUnits()
	 * @generated
	 * @ordered
	 */
	protected float peakUnits = PEAK_UNITS_EDEFAULT;

	/**
	 * This is true if the Peak Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean peakUnitsESet;

	/**
	 * The default value of the '{@link #getRegularWork() <em>Regular Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REGULAR_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegularWork() <em>Regular Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularWork()
	 * @generated
	 * @ordered
	 */
	protected Duration regularWork = REGULAR_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingCost() <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REMAINING_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingCost() <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal remainingCost = REMAINING_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingOvertimeCost() <em>Remaining Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REMAINING_OVERTIME_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingOvertimeCost() <em>Remaining Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal remainingOvertimeCost = REMAINING_OVERTIME_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingOvertimeWork() <em>Remaining Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REMAINING_OVERTIME_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingOvertimeWork() <em>Remaining Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected Duration remainingOvertimeWork = REMAINING_OVERTIME_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingWork() <em>Remaining Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REMAINING_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingWork() <em>Remaining Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingWork()
	 * @generated
	 * @ordered
	 */
	protected Duration remainingWork = REMAINING_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #isResponsePending() <em>Response Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsePending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESPONSE_PENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResponsePending() <em>Response Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsePending()
	 * @generated
	 * @ordered
	 */
	protected boolean responsePending = RESPONSE_PENDING_EDEFAULT;

	/**
	 * This is true if the Response Pending attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responsePendingESet;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar stop = STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getResume() <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResume()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RESUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResume() <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResume()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar resume = RESUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartVariance() <em>Start Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVariance()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartVariance() <em>Start Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVariance()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startVariance = START_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSummary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUMMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSummary()
	 * @generated
	 * @ordered
	 */
	protected boolean summary = SUMMARY_EDEFAULT;

	/**
	 * This is true if the Summary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean summaryESet;

	/**
	 * The default value of the '{@link #getSV() <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSV()
	 * @generated
	 * @ordered
	 */
	protected static final float SV_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSV() <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSV()
	 * @generated
	 * @ordered
	 */
	protected float sV = SV_EDEFAULT;

	/**
	 * This is true if the SV attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sVESet;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final float UNITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected float units = UNITS_EDEFAULT;

	/**
	 * This is true if the Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitsESet;

	/**
	 * The default value of the '{@link #isUpdateNeeded() <em>Update Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdateNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_NEEDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUpdateNeeded() <em>Update Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdateNeeded()
	 * @generated
	 * @ordered
	 */
	protected boolean updateNeeded = UPDATE_NEEDED_EDEFAULT;

	/**
	 * This is true if the Update Needed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateNeededESet;

	/**
	 * The default value of the '{@link #getVAC() <em>VAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAC()
	 * @generated
	 * @ordered
	 */
	protected static final float VAC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVAC() <em>VAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAC()
	 * @generated
	 * @ordered
	 */
	protected float vAC = VAC_EDEFAULT;

	/**
	 * This is true if the VAC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vACESet;

	/**
	 * The default value of the '{@link #getWork() <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Duration work = WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkContour() <em>Work Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkContour()
	 * @generated
	 * @ordered
	 */
	protected static final WorkContourType WORK_CONTOUR_EDEFAULT = WorkContourType._0;

	/**
	 * The cached value of the '{@link #getWorkContour() <em>Work Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkContour()
	 * @generated
	 * @ordered
	 */
	protected WorkContourType workContour = WORK_CONTOUR_EDEFAULT;

	/**
	 * This is true if the Work Contour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workContourESet;

	/**
	 * The default value of the '{@link #getBCWS() <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWS()
	 * @generated
	 * @ordered
	 */
	protected static final float BCWS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBCWS() <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWS()
	 * @generated
	 * @ordered
	 */
	protected float bCWS = BCWS_EDEFAULT;

	/**
	 * This is true if the BCWS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bCWSESet;

	/**
	 * The default value of the '{@link #getBCWP() <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWP()
	 * @generated
	 * @ordered
	 */
	protected static final float BCWP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBCWP() <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWP()
	 * @generated
	 * @ordered
	 */
	protected float bCWP = BCWP_EDEFAULT;

	/**
	 * This is true if the BCWP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bCWPESet;

	/**
	 * The default value of the '{@link #getBookingType() <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingType()
	 * @generated
	 * @ordered
	 */
	protected static final BookingTypeType BOOKING_TYPE_EDEFAULT = BookingTypeType._0;

	/**
	 * The cached value of the '{@link #getBookingType() <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingType()
	 * @generated
	 * @ordered
	 */
	protected BookingTypeType bookingType = BOOKING_TYPE_EDEFAULT;

	/**
	 * This is true if the Booking Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bookingTypeESet;

	/**
	 * The default value of the '{@link #getActualWorkProtected() <em>Actual Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_WORK_PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualWorkProtected() <em>Actual Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected Duration actualWorkProtected = ACTUAL_WORK_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualOvertimeWorkProtected() <em>Actual Overtime Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualOvertimeWorkProtected() <em>Actual Overtime Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected Duration actualOvertimeWorkProtected = ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssnOwner() <em>Assn Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSN_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssnOwner() <em>Assn Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwner()
	 * @generated
	 * @ordered
	 */
	protected String assnOwner = ASSN_OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssnOwnerGuid() <em>Assn Owner Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwnerGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSN_OWNER_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssnOwnerGuid() <em>Assn Owner Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwnerGuid()
	 * @generated
	 * @ordered
	 */
	protected String assnOwnerGuid = ASSN_OWNER_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudgetCost() <em>Budget Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BUDGET_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetCost() <em>Budget Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal budgetCost = BUDGET_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudgetWork() <em>Budget Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration BUDGET_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetWork() <em>Budget Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetWork()
	 * @generated
	 * @ordered
	 */
	protected Duration budgetWork = BUDGET_WORK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedAttribute() <em>Extended Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedAttributeType> extendedAttribute;

	/**
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected EList<BaselineType> baseline;

	/**
	 * The cached value of the '{@link #getF404000() <em>F404000</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404000()
	 * @generated
	 * @ordered
	 */
	protected EObject f404000;

	/**
	 * The cached value of the '{@link #getF404001() <em>F404001</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404001()
	 * @generated
	 * @ordered
	 */
	protected EObject f404001;

	/**
	 * The cached value of the '{@link #getF404002() <em>F404002</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404002()
	 * @generated
	 * @ordered
	 */
	protected EObject f404002;

	/**
	 * The cached value of the '{@link #getF404003() <em>F404003</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404003()
	 * @generated
	 * @ordered
	 */
	protected EObject f404003;

	/**
	 * The cached value of the '{@link #getF404004() <em>F404004</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404004()
	 * @generated
	 * @ordered
	 */
	protected EObject f404004;

	/**
	 * The cached value of the '{@link #getF404005() <em>F404005</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404005()
	 * @generated
	 * @ordered
	 */
	protected EObject f404005;

	/**
	 * The cached value of the '{@link #getF404006() <em>F404006</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404006()
	 * @generated
	 * @ordered
	 */
	protected EObject f404006;

	/**
	 * The cached value of the '{@link #getF404007() <em>F404007</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404007()
	 * @generated
	 * @ordered
	 */
	protected EObject f404007;

	/**
	 * The cached value of the '{@link #getF404008() <em>F404008</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404008()
	 * @generated
	 * @ordered
	 */
	protected EObject f404008;

	/**
	 * The cached value of the '{@link #getF404009() <em>F404009</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404009()
	 * @generated
	 * @ordered
	 */
	protected EObject f404009;

	/**
	 * The cached value of the '{@link #getF40400a() <em>F4040 0a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40400a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40400a;

	/**
	 * The cached value of the '{@link #getF40400b() <em>F4040 0b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40400b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40400b;

	/**
	 * The cached value of the '{@link #getF40400c() <em>F4040 0c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40400c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40400c;

	/**
	 * The cached value of the '{@link #getF40400d() <em>F4040 0d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40400d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40400d;

	/**
	 * The cached value of the '{@link #getF40400e() <em>F4040 0e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40400e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40400e;

	/**
	 * The cached value of the '{@link #getF40400f() <em>F4040 0f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40400f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40400f;

	/**
	 * The cached value of the '{@link #getF404010() <em>F404010</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404010()
	 * @generated
	 * @ordered
	 */
	protected EObject f404010;

	/**
	 * The cached value of the '{@link #getF404011() <em>F404011</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404011()
	 * @generated
	 * @ordered
	 */
	protected EObject f404011;

	/**
	 * The cached value of the '{@link #getF404012() <em>F404012</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404012()
	 * @generated
	 * @ordered
	 */
	protected EObject f404012;

	/**
	 * The cached value of the '{@link #getF404013() <em>F404013</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404013()
	 * @generated
	 * @ordered
	 */
	protected EObject f404013;

	/**
	 * The cached value of the '{@link #getF404014() <em>F404014</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404014()
	 * @generated
	 * @ordered
	 */
	protected EObject f404014;

	/**
	 * The cached value of the '{@link #getF404015() <em>F404015</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404015()
	 * @generated
	 * @ordered
	 */
	protected EObject f404015;

	/**
	 * The cached value of the '{@link #getF404016() <em>F404016</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404016()
	 * @generated
	 * @ordered
	 */
	protected EObject f404016;

	/**
	 * The cached value of the '{@link #getF404017() <em>F404017</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404017()
	 * @generated
	 * @ordered
	 */
	protected EObject f404017;

	/**
	 * The cached value of the '{@link #getF404018() <em>F404018</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404018()
	 * @generated
	 * @ordered
	 */
	protected EObject f404018;

	/**
	 * The cached value of the '{@link #getF404019() <em>F404019</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404019()
	 * @generated
	 * @ordered
	 */
	protected EObject f404019;

	/**
	 * The cached value of the '{@link #getF40401a() <em>F4040 1a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40401a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40401a;

	/**
	 * The cached value of the '{@link #getF40401b() <em>F4040 1b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40401b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40401b;

	/**
	 * The cached value of the '{@link #getF40401c() <em>F4040 1c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40401c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40401c;

	/**
	 * The cached value of the '{@link #getF40401d() <em>F4040 1d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40401d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40401d;

	/**
	 * The cached value of the '{@link #getF40401e() <em>F4040 1e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40401e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40401e;

	/**
	 * The cached value of the '{@link #getF40401f() <em>F4040 1f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40401f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40401f;

	/**
	 * The cached value of the '{@link #getF404020() <em>F404020</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404020()
	 * @generated
	 * @ordered
	 */
	protected EObject f404020;

	/**
	 * The cached value of the '{@link #getF404021() <em>F404021</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404021()
	 * @generated
	 * @ordered
	 */
	protected EObject f404021;

	/**
	 * The cached value of the '{@link #getF404022() <em>F404022</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404022()
	 * @generated
	 * @ordered
	 */
	protected EObject f404022;

	/**
	 * The cached value of the '{@link #getF404023() <em>F404023</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404023()
	 * @generated
	 * @ordered
	 */
	protected EObject f404023;

	/**
	 * The cached value of the '{@link #getF404024() <em>F404024</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404024()
	 * @generated
	 * @ordered
	 */
	protected EObject f404024;

	/**
	 * The cached value of the '{@link #getF404025() <em>F404025</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404025()
	 * @generated
	 * @ordered
	 */
	protected EObject f404025;

	/**
	 * The cached value of the '{@link #getF404026() <em>F404026</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404026()
	 * @generated
	 * @ordered
	 */
	protected EObject f404026;

	/**
	 * The cached value of the '{@link #getF404027() <em>F404027</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404027()
	 * @generated
	 * @ordered
	 */
	protected EObject f404027;

	/**
	 * The cached value of the '{@link #getF404028() <em>F404028</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404028()
	 * @generated
	 * @ordered
	 */
	protected EObject f404028;

	/**
	 * The cached value of the '{@link #getF404029() <em>F404029</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404029()
	 * @generated
	 * @ordered
	 */
	protected EObject f404029;

	/**
	 * The cached value of the '{@link #getF40402a() <em>F4040 2a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40402a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40402a;

	/**
	 * The cached value of the '{@link #getF40402b() <em>F4040 2b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40402b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40402b;

	/**
	 * The cached value of the '{@link #getF40402c() <em>F4040 2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40402c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40402c;

	/**
	 * The cached value of the '{@link #getF40402d() <em>F4040 2d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40402d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40402d;

	/**
	 * The cached value of the '{@link #getF40402e() <em>F4040 2e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40402e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40402e;

	/**
	 * The cached value of the '{@link #getF40402f() <em>F4040 2f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40402f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40402f;

	/**
	 * The cached value of the '{@link #getF404030() <em>F404030</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404030()
	 * @generated
	 * @ordered
	 */
	protected EObject f404030;

	/**
	 * The cached value of the '{@link #getF404031() <em>F404031</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404031()
	 * @generated
	 * @ordered
	 */
	protected EObject f404031;

	/**
	 * The cached value of the '{@link #getF404032() <em>F404032</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404032()
	 * @generated
	 * @ordered
	 */
	protected EObject f404032;

	/**
	 * The cached value of the '{@link #getF404033() <em>F404033</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404033()
	 * @generated
	 * @ordered
	 */
	protected EObject f404033;

	/**
	 * The cached value of the '{@link #getF404034() <em>F404034</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404034()
	 * @generated
	 * @ordered
	 */
	protected EObject f404034;

	/**
	 * The cached value of the '{@link #getF404035() <em>F404035</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404035()
	 * @generated
	 * @ordered
	 */
	protected EObject f404035;

	/**
	 * The cached value of the '{@link #getF404036() <em>F404036</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404036()
	 * @generated
	 * @ordered
	 */
	protected EObject f404036;

	/**
	 * The cached value of the '{@link #getF404037() <em>F404037</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404037()
	 * @generated
	 * @ordered
	 */
	protected EObject f404037;

	/**
	 * The cached value of the '{@link #getF404038() <em>F404038</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404038()
	 * @generated
	 * @ordered
	 */
	protected EObject f404038;

	/**
	 * The cached value of the '{@link #getF404039() <em>F404039</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404039()
	 * @generated
	 * @ordered
	 */
	protected EObject f404039;

	/**
	 * The cached value of the '{@link #getF40403a() <em>F4040 3a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40403a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40403a;

	/**
	 * The cached value of the '{@link #getF40403b() <em>F4040 3b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40403b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40403b;

	/**
	 * The cached value of the '{@link #getF40403c() <em>F4040 3c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40403c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40403c;

	/**
	 * The cached value of the '{@link #getF40403d() <em>F4040 3d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40403d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40403d;

	/**
	 * The cached value of the '{@link #getF40403e() <em>F4040 3e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40403e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40403e;

	/**
	 * The cached value of the '{@link #getF40403f() <em>F4040 3f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40403f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40403f;

	/**
	 * The cached value of the '{@link #getF404040() <em>F404040</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404040()
	 * @generated
	 * @ordered
	 */
	protected EObject f404040;

	/**
	 * The cached value of the '{@link #getF404041() <em>F404041</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404041()
	 * @generated
	 * @ordered
	 */
	protected EObject f404041;

	/**
	 * The cached value of the '{@link #getF404042() <em>F404042</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404042()
	 * @generated
	 * @ordered
	 */
	protected EObject f404042;

	/**
	 * The cached value of the '{@link #getF404043() <em>F404043</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404043()
	 * @generated
	 * @ordered
	 */
	protected EObject f404043;

	/**
	 * The cached value of the '{@link #getF404044() <em>F404044</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404044()
	 * @generated
	 * @ordered
	 */
	protected EObject f404044;

	/**
	 * The cached value of the '{@link #getF404045() <em>F404045</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404045()
	 * @generated
	 * @ordered
	 */
	protected EObject f404045;

	/**
	 * The cached value of the '{@link #getF404046() <em>F404046</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404046()
	 * @generated
	 * @ordered
	 */
	protected EObject f404046;

	/**
	 * The cached value of the '{@link #getF404047() <em>F404047</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404047()
	 * @generated
	 * @ordered
	 */
	protected EObject f404047;

	/**
	 * The cached value of the '{@link #getF404048() <em>F404048</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404048()
	 * @generated
	 * @ordered
	 */
	protected EObject f404048;

	/**
	 * The cached value of the '{@link #getF404049() <em>F404049</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404049()
	 * @generated
	 * @ordered
	 */
	protected EObject f404049;

	/**
	 * The cached value of the '{@link #getF40404a() <em>F4040 4a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40404a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40404a;

	/**
	 * The cached value of the '{@link #getF40404b() <em>F4040 4b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40404b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40404b;

	/**
	 * The cached value of the '{@link #getF40404c() <em>F4040 4c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40404c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40404c;

	/**
	 * The cached value of the '{@link #getF40404d() <em>F4040 4d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40404d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40404d;

	/**
	 * The cached value of the '{@link #getF40404e() <em>F4040 4e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40404e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40404e;

	/**
	 * The cached value of the '{@link #getF40404f() <em>F4040 4f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40404f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40404f;

	/**
	 * The cached value of the '{@link #getF404050() <em>F404050</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404050()
	 * @generated
	 * @ordered
	 */
	protected EObject f404050;

	/**
	 * The cached value of the '{@link #getF404051() <em>F404051</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404051()
	 * @generated
	 * @ordered
	 */
	protected EObject f404051;

	/**
	 * The cached value of the '{@link #getF404052() <em>F404052</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404052()
	 * @generated
	 * @ordered
	 */
	protected EObject f404052;

	/**
	 * The cached value of the '{@link #getF404053() <em>F404053</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404053()
	 * @generated
	 * @ordered
	 */
	protected EObject f404053;

	/**
	 * The cached value of the '{@link #getF404054() <em>F404054</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404054()
	 * @generated
	 * @ordered
	 */
	protected EObject f404054;

	/**
	 * The cached value of the '{@link #getF404055() <em>F404055</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404055()
	 * @generated
	 * @ordered
	 */
	protected EObject f404055;

	/**
	 * The cached value of the '{@link #getF404056() <em>F404056</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404056()
	 * @generated
	 * @ordered
	 */
	protected EObject f404056;

	/**
	 * The cached value of the '{@link #getF404057() <em>F404057</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404057()
	 * @generated
	 * @ordered
	 */
	protected EObject f404057;

	/**
	 * The cached value of the '{@link #getF404058() <em>F404058</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404058()
	 * @generated
	 * @ordered
	 */
	protected EObject f404058;

	/**
	 * The cached value of the '{@link #getF404059() <em>F404059</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404059()
	 * @generated
	 * @ordered
	 */
	protected EObject f404059;

	/**
	 * The cached value of the '{@link #getF40405a() <em>F4040 5a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40405a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40405a;

	/**
	 * The cached value of the '{@link #getF40405b() <em>F4040 5b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40405b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40405b;

	/**
	 * The cached value of the '{@link #getF40405c() <em>F4040 5c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40405c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40405c;

	/**
	 * The cached value of the '{@link #getF40405d() <em>F4040 5d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40405d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40405d;

	/**
	 * The cached value of the '{@link #getF40405e() <em>F4040 5e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40405e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40405e;

	/**
	 * The cached value of the '{@link #getF40405f() <em>F4040 5f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40405f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40405f;

	/**
	 * The cached value of the '{@link #getF404060() <em>F404060</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404060()
	 * @generated
	 * @ordered
	 */
	protected EObject f404060;

	/**
	 * The cached value of the '{@link #getF404061() <em>F404061</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404061()
	 * @generated
	 * @ordered
	 */
	protected EObject f404061;

	/**
	 * The cached value of the '{@link #getF404062() <em>F404062</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404062()
	 * @generated
	 * @ordered
	 */
	protected EObject f404062;

	/**
	 * The cached value of the '{@link #getF404063() <em>F404063</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404063()
	 * @generated
	 * @ordered
	 */
	protected EObject f404063;

	/**
	 * The cached value of the '{@link #getF404064() <em>F404064</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404064()
	 * @generated
	 * @ordered
	 */
	protected EObject f404064;

	/**
	 * The cached value of the '{@link #getF404065() <em>F404065</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404065()
	 * @generated
	 * @ordered
	 */
	protected EObject f404065;

	/**
	 * The cached value of the '{@link #getF404066() <em>F404066</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404066()
	 * @generated
	 * @ordered
	 */
	protected EObject f404066;

	/**
	 * The cached value of the '{@link #getF404067() <em>F404067</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404067()
	 * @generated
	 * @ordered
	 */
	protected EObject f404067;

	/**
	 * The cached value of the '{@link #getF404068() <em>F404068</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404068()
	 * @generated
	 * @ordered
	 */
	protected EObject f404068;

	/**
	 * The cached value of the '{@link #getF404069() <em>F404069</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404069()
	 * @generated
	 * @ordered
	 */
	protected EObject f404069;

	/**
	 * The cached value of the '{@link #getF40406a() <em>F4040 6a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40406a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40406a;

	/**
	 * The cached value of the '{@link #getF40406b() <em>F4040 6b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40406b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40406b;

	/**
	 * The cached value of the '{@link #getF40406c() <em>F4040 6c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40406c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40406c;

	/**
	 * The cached value of the '{@link #getF40406d() <em>F4040 6d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40406d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40406d;

	/**
	 * The cached value of the '{@link #getF40406e() <em>F4040 6e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40406e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40406e;

	/**
	 * The cached value of the '{@link #getF40406f() <em>F4040 6f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40406f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40406f;

	/**
	 * The cached value of the '{@link #getF404070() <em>F404070</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404070()
	 * @generated
	 * @ordered
	 */
	protected EObject f404070;

	/**
	 * The cached value of the '{@link #getF404071() <em>F404071</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404071()
	 * @generated
	 * @ordered
	 */
	protected EObject f404071;

	/**
	 * The cached value of the '{@link #getF404072() <em>F404072</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404072()
	 * @generated
	 * @ordered
	 */
	protected EObject f404072;

	/**
	 * The cached value of the '{@link #getF404073() <em>F404073</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404073()
	 * @generated
	 * @ordered
	 */
	protected EObject f404073;

	/**
	 * The cached value of the '{@link #getF404074() <em>F404074</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404074()
	 * @generated
	 * @ordered
	 */
	protected EObject f404074;

	/**
	 * The cached value of the '{@link #getF404075() <em>F404075</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404075()
	 * @generated
	 * @ordered
	 */
	protected EObject f404075;

	/**
	 * The cached value of the '{@link #getF404076() <em>F404076</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404076()
	 * @generated
	 * @ordered
	 */
	protected EObject f404076;

	/**
	 * The cached value of the '{@link #getF404077() <em>F404077</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404077()
	 * @generated
	 * @ordered
	 */
	protected EObject f404077;

	/**
	 * The cached value of the '{@link #getF404078() <em>F404078</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404078()
	 * @generated
	 * @ordered
	 */
	protected EObject f404078;

	/**
	 * The cached value of the '{@link #getF404079() <em>F404079</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404079()
	 * @generated
	 * @ordered
	 */
	protected EObject f404079;

	/**
	 * The cached value of the '{@link #getF40407a() <em>F4040 7a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40407a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40407a;

	/**
	 * The cached value of the '{@link #getF40407b() <em>F4040 7b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40407b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40407b;

	/**
	 * The cached value of the '{@link #getF40407c() <em>F4040 7c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40407c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40407c;

	/**
	 * The cached value of the '{@link #getF40407d() <em>F4040 7d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40407d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40407d;

	/**
	 * The cached value of the '{@link #getF40407e() <em>F4040 7e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40407e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40407e;

	/**
	 * The cached value of the '{@link #getF40407f() <em>F4040 7f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40407f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40407f;

	/**
	 * The cached value of the '{@link #getF404080() <em>F404080</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404080()
	 * @generated
	 * @ordered
	 */
	protected EObject f404080;

	/**
	 * The cached value of the '{@link #getF404081() <em>F404081</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404081()
	 * @generated
	 * @ordered
	 */
	protected EObject f404081;

	/**
	 * The cached value of the '{@link #getF404082() <em>F404082</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404082()
	 * @generated
	 * @ordered
	 */
	protected EObject f404082;

	/**
	 * The cached value of the '{@link #getF404083() <em>F404083</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404083()
	 * @generated
	 * @ordered
	 */
	protected EObject f404083;

	/**
	 * The cached value of the '{@link #getF404084() <em>F404084</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404084()
	 * @generated
	 * @ordered
	 */
	protected EObject f404084;

	/**
	 * The cached value of the '{@link #getF404085() <em>F404085</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404085()
	 * @generated
	 * @ordered
	 */
	protected EObject f404085;

	/**
	 * The cached value of the '{@link #getF404086() <em>F404086</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404086()
	 * @generated
	 * @ordered
	 */
	protected EObject f404086;

	/**
	 * The cached value of the '{@link #getF404087() <em>F404087</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404087()
	 * @generated
	 * @ordered
	 */
	protected EObject f404087;

	/**
	 * The cached value of the '{@link #getF404088() <em>F404088</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404088()
	 * @generated
	 * @ordered
	 */
	protected EObject f404088;

	/**
	 * The cached value of the '{@link #getF404089() <em>F404089</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404089()
	 * @generated
	 * @ordered
	 */
	protected EObject f404089;

	/**
	 * The cached value of the '{@link #getF40408a() <em>F4040 8a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40408a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40408a;

	/**
	 * The cached value of the '{@link #getF40408b() <em>F4040 8b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40408b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40408b;

	/**
	 * The cached value of the '{@link #getF40408c() <em>F4040 8c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40408c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40408c;

	/**
	 * The cached value of the '{@link #getF40408d() <em>F4040 8d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40408d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40408d;

	/**
	 * The cached value of the '{@link #getF40408e() <em>F4040 8e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40408e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40408e;

	/**
	 * The cached value of the '{@link #getF40408f() <em>F4040 8f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40408f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40408f;

	/**
	 * The cached value of the '{@link #getF404090() <em>F404090</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404090()
	 * @generated
	 * @ordered
	 */
	protected EObject f404090;

	/**
	 * The cached value of the '{@link #getF404091() <em>F404091</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404091()
	 * @generated
	 * @ordered
	 */
	protected EObject f404091;

	/**
	 * The cached value of the '{@link #getF404092() <em>F404092</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404092()
	 * @generated
	 * @ordered
	 */
	protected EObject f404092;

	/**
	 * The cached value of the '{@link #getF404093() <em>F404093</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404093()
	 * @generated
	 * @ordered
	 */
	protected EObject f404093;

	/**
	 * The cached value of the '{@link #getF404094() <em>F404094</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404094()
	 * @generated
	 * @ordered
	 */
	protected EObject f404094;

	/**
	 * The cached value of the '{@link #getF404095() <em>F404095</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404095()
	 * @generated
	 * @ordered
	 */
	protected EObject f404095;

	/**
	 * The cached value of the '{@link #getF404096() <em>F404096</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404096()
	 * @generated
	 * @ordered
	 */
	protected EObject f404096;

	/**
	 * The cached value of the '{@link #getF404097() <em>F404097</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404097()
	 * @generated
	 * @ordered
	 */
	protected EObject f404097;

	/**
	 * The cached value of the '{@link #getF404098() <em>F404098</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404098()
	 * @generated
	 * @ordered
	 */
	protected EObject f404098;

	/**
	 * The cached value of the '{@link #getF404099() <em>F404099</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF404099()
	 * @generated
	 * @ordered
	 */
	protected EObject f404099;

	/**
	 * The cached value of the '{@link #getF40409a() <em>F4040 9a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40409a()
	 * @generated
	 * @ordered
	 */
	protected EObject f40409a;

	/**
	 * The cached value of the '{@link #getF40409b() <em>F4040 9b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40409b()
	 * @generated
	 * @ordered
	 */
	protected EObject f40409b;

	/**
	 * The cached value of the '{@link #getF40409c() <em>F4040 9c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40409c()
	 * @generated
	 * @ordered
	 */
	protected EObject f40409c;

	/**
	 * The cached value of the '{@link #getF40409d() <em>F4040 9d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40409d()
	 * @generated
	 * @ordered
	 */
	protected EObject f40409d;

	/**
	 * The cached value of the '{@link #getF40409e() <em>F4040 9e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40409e()
	 * @generated
	 * @ordered
	 */
	protected EObject f40409e;

	/**
	 * The cached value of the '{@link #getF40409f() <em>F4040 9f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF40409f()
	 * @generated
	 * @ordered
	 */
	protected EObject f40409f;

	/**
	 * The cached value of the '{@link #getF4040a0() <em>F404 0a0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a0()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a0;

	/**
	 * The cached value of the '{@link #getF4040a1() <em>F404 0a1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a1()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a1;

	/**
	 * The cached value of the '{@link #getF4040a2() <em>F404 0a2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a2()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a2;

	/**
	 * The cached value of the '{@link #getF4040a3() <em>F404 0a3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a3()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a3;

	/**
	 * The cached value of the '{@link #getF4040a4() <em>F404 0a4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a4()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a4;

	/**
	 * The cached value of the '{@link #getF4040a5() <em>F404 0a5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a5()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a5;

	/**
	 * The cached value of the '{@link #getF4040a6() <em>F404 0a6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a6()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a6;

	/**
	 * The cached value of the '{@link #getF4040a7() <em>F404 0a7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a7()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a7;

	/**
	 * The cached value of the '{@link #getF4040a8() <em>F404 0a8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a8()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a8;

	/**
	 * The cached value of the '{@link #getF4040a9() <em>F404 0a9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040a9()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040a9;

	/**
	 * The cached value of the '{@link #getF4040aa() <em>F404 0aa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040aa()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040aa;

	/**
	 * The cached value of the '{@link #getF4040ab() <em>F404 0ab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040ab()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040ab;

	/**
	 * The cached value of the '{@link #getF4040ac() <em>F404 0ac</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040ac()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040ac;

	/**
	 * The cached value of the '{@link #getF4040ad() <em>F404 0ad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040ad()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040ad;

	/**
	 * The cached value of the '{@link #getF4040ae() <em>F404 0ae</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040ae()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040ae;

	/**
	 * The cached value of the '{@link #getF4040af() <em>F404 0af</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040af()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040af;

	/**
	 * The cached value of the '{@link #getF4040b0() <em>F404 0b0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b0()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b0;

	/**
	 * The cached value of the '{@link #getF4040b1() <em>F404 0b1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b1()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b1;

	/**
	 * The cached value of the '{@link #getF4040b2() <em>F404 0b2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b2()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b2;

	/**
	 * The cached value of the '{@link #getF4040b3() <em>F404 0b3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b3()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b3;

	/**
	 * The cached value of the '{@link #getF4040b4() <em>F404 0b4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b4()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b4;

	/**
	 * The cached value of the '{@link #getF4040b5() <em>F404 0b5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b5()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b5;

	/**
	 * The cached value of the '{@link #getF4040b6() <em>F404 0b6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b6()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b6;

	/**
	 * The cached value of the '{@link #getF4040b7() <em>F404 0b7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b7()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b7;

	/**
	 * The cached value of the '{@link #getF4040b8() <em>F404 0b8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b8()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b8;

	/**
	 * The cached value of the '{@link #getF4040b9() <em>F404 0b9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040b9()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040b9;

	/**
	 * The cached value of the '{@link #getF4040ba() <em>F404 0ba</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040ba()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040ba;

	/**
	 * The cached value of the '{@link #getF4040bb() <em>F404 0bb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040bb()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040bb;

	/**
	 * The cached value of the '{@link #getF4040bc() <em>F404 0bc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040bc()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040bc;

	/**
	 * The cached value of the '{@link #getF4040bd() <em>F404 0bd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040bd()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040bd;

	/**
	 * The cached value of the '{@link #getF4040be() <em>F404 0be</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040be()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040be;

	/**
	 * The cached value of the '{@link #getF4040bf() <em>F404 0bf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040bf()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040bf;

	/**
	 * The cached value of the '{@link #getF4040c0() <em>F404 0c0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c0()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c0;

	/**
	 * The cached value of the '{@link #getF4040c1() <em>F404 0c1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c1()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c1;

	/**
	 * The cached value of the '{@link #getF4040c2() <em>F404 0c2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c2()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c2;

	/**
	 * The cached value of the '{@link #getF4040c3() <em>F404 0c3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c3()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c3;

	/**
	 * The cached value of the '{@link #getF4040c4() <em>F404 0c4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c4()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c4;

	/**
	 * The cached value of the '{@link #getF4040c5() <em>F404 0c5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c5()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c5;

	/**
	 * The cached value of the '{@link #getF4040c6() <em>F404 0c6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c6()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c6;

	/**
	 * The cached value of the '{@link #getF4040c7() <em>F404 0c7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c7()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c7;

	/**
	 * The cached value of the '{@link #getF4040c8() <em>F404 0c8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF4040c8()
	 * @generated
	 * @ordered
	 */
	protected EObject f4040c8;

	/**
	 * The cached value of the '{@link #getTimephasedData() <em>Timephased Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimephasedData()
	 * @generated
	 * @ordered
	 */
	protected EList<TimephasedDataType> timephasedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.ASSIGNMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUID(BigInteger newUID) {
		BigInteger oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTaskUID() {
		return taskUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskUID(BigInteger newTaskUID) {
		BigInteger oldTaskUID = taskUID;
		taskUID = newTaskUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__TASK_UID, oldTaskUID, taskUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getResourceUID() {
		return resourceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceUID(BigInteger newResourceUID) {
		BigInteger oldResourceUID = resourceUID;
		resourceUID = newResourceUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__RESOURCE_UID, oldResourceUID, resourceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPercentWorkComplete() {
		return percentWorkComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentWorkComplete(BigInteger newPercentWorkComplete) {
		BigInteger oldPercentWorkComplete = percentWorkComplete;
		percentWorkComplete = newPercentWorkComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE, oldPercentWorkComplete, percentWorkComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getActualCost() {
		return actualCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualCost(BigDecimal newActualCost) {
		BigDecimal oldActualCost = actualCost;
		actualCost = newActualCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_COST, oldActualCost, actualCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getActualFinish() {
		return actualFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualFinish(XMLGregorianCalendar newActualFinish) {
		XMLGregorianCalendar oldActualFinish = actualFinish;
		actualFinish = newActualFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_FINISH, oldActualFinish, actualFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getActualOvertimeCost() {
		return actualOvertimeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualOvertimeCost(BigDecimal newActualOvertimeCost) {
		BigDecimal oldActualOvertimeCost = actualOvertimeCost;
		actualOvertimeCost = newActualOvertimeCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST, oldActualOvertimeCost, actualOvertimeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualOvertimeWork() {
		return actualOvertimeWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualOvertimeWork(Duration newActualOvertimeWork) {
		Duration oldActualOvertimeWork = actualOvertimeWork;
		actualOvertimeWork = newActualOvertimeWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK, oldActualOvertimeWork, actualOvertimeWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getActualStart() {
		return actualStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualStart(XMLGregorianCalendar newActualStart) {
		XMLGregorianCalendar oldActualStart = actualStart;
		actualStart = newActualStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_START, oldActualStart, actualStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualWork() {
		return actualWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualWork(Duration newActualWork) {
		Duration oldActualWork = actualWork;
		actualWork = newActualWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK, oldActualWork, actualWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getACWP() {
		return aCWP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACWP(float newACWP) {
		float oldACWP = aCWP;
		aCWP = newACWP;
		boolean oldACWPESet = aCWPESet;
		aCWPESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACWP, oldACWP, aCWP, !oldACWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetACWP() {
		float oldACWP = aCWP;
		boolean oldACWPESet = aCWPESet;
		aCWP = ACWP_EDEFAULT;
		aCWPESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__ACWP, oldACWP, ACWP_EDEFAULT, oldACWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetACWP() {
		return aCWPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfirmed() {
		return confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmed(boolean newConfirmed) {
		boolean oldConfirmed = confirmed;
		confirmed = newConfirmed;
		boolean oldConfirmedESet = confirmedESet;
		confirmedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__CONFIRMED, oldConfirmed, confirmed, !oldConfirmedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfirmed() {
		boolean oldConfirmed = confirmed;
		boolean oldConfirmedESet = confirmedESet;
		confirmed = CONFIRMED_EDEFAULT;
		confirmedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__CONFIRMED, oldConfirmed, CONFIRMED_EDEFAULT, oldConfirmedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfirmed() {
		return confirmedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(BigDecimal newCost) {
		BigDecimal oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostRateTableType getCostRateTable() {
		return costRateTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostRateTable(CostRateTableType newCostRateTable) {
		CostRateTableType oldCostRateTable = costRateTable;
		costRateTable = newCostRateTable == null ? COST_RATE_TABLE_EDEFAULT : newCostRateTable;
		boolean oldCostRateTableESet = costRateTableESet;
		costRateTableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__COST_RATE_TABLE, oldCostRateTable, costRateTable, !oldCostRateTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCostRateTable() {
		CostRateTableType oldCostRateTable = costRateTable;
		boolean oldCostRateTableESet = costRateTableESet;
		costRateTable = COST_RATE_TABLE_EDEFAULT;
		costRateTableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__COST_RATE_TABLE, oldCostRateTable, COST_RATE_TABLE_EDEFAULT, oldCostRateTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCostRateTable() {
		return costRateTableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCostVariance() {
		return costVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostVariance(float newCostVariance) {
		float oldCostVariance = costVariance;
		costVariance = newCostVariance;
		boolean oldCostVarianceESet = costVarianceESet;
		costVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__COST_VARIANCE, oldCostVariance, costVariance, !oldCostVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCostVariance() {
		float oldCostVariance = costVariance;
		boolean oldCostVarianceESet = costVarianceESet;
		costVariance = COST_VARIANCE_EDEFAULT;
		costVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__COST_VARIANCE, oldCostVariance, COST_VARIANCE_EDEFAULT, oldCostVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCostVariance() {
		return costVarianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCV() {
		return cV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCV(float newCV) {
		float oldCV = cV;
		cV = newCV;
		boolean oldCVESet = cVESet;
		cVESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__CV, oldCV, cV, !oldCVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCV() {
		float oldCV = cV;
		boolean oldCVESet = cVESet;
		cV = CV_EDEFAULT;
		cVESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__CV, oldCV, CV_EDEFAULT, oldCVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCV() {
		return cVESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(BigInteger newDelay) {
		BigInteger oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(XMLGregorianCalendar newFinish) {
		XMLGregorianCalendar oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFinishVariance() {
		return finishVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishVariance(BigInteger newFinishVariance) {
		BigInteger oldFinishVariance = finishVariance;
		finishVariance = newFinishVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__FINISH_VARIANCE, oldFinishVariance, finishVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlink() {
		return hyperlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlink(String newHyperlink) {
		String oldHyperlink = hyperlink;
		hyperlink = newHyperlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK, oldHyperlink, hyperlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlinkAddress() {
		return hyperlinkAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlinkAddress(String newHyperlinkAddress) {
		String oldHyperlinkAddress = hyperlinkAddress;
		hyperlinkAddress = newHyperlinkAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_ADDRESS, oldHyperlinkAddress, hyperlinkAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlinkSubAddress() {
		return hyperlinkSubAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlinkSubAddress(String newHyperlinkSubAddress) {
		String oldHyperlinkSubAddress = hyperlinkSubAddress;
		hyperlinkSubAddress = newHyperlinkSubAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS, oldHyperlinkSubAddress, hyperlinkSubAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorkVariance() {
		return workVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkVariance(float newWorkVariance) {
		float oldWorkVariance = workVariance;
		workVariance = newWorkVariance;
		boolean oldWorkVarianceESet = workVarianceESet;
		workVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__WORK_VARIANCE, oldWorkVariance, workVariance, !oldWorkVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkVariance() {
		float oldWorkVariance = workVariance;
		boolean oldWorkVarianceESet = workVarianceESet;
		workVariance = WORK_VARIANCE_EDEFAULT;
		workVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__WORK_VARIANCE, oldWorkVariance, WORK_VARIANCE_EDEFAULT, oldWorkVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkVariance() {
		return workVarianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasFixedRateUnits() {
		return hasFixedRateUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFixedRateUnits(boolean newHasFixedRateUnits) {
		boolean oldHasFixedRateUnits = hasFixedRateUnits;
		hasFixedRateUnits = newHasFixedRateUnits;
		boolean oldHasFixedRateUnitsESet = hasFixedRateUnitsESet;
		hasFixedRateUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS, oldHasFixedRateUnits, hasFixedRateUnits, !oldHasFixedRateUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasFixedRateUnits() {
		boolean oldHasFixedRateUnits = hasFixedRateUnits;
		boolean oldHasFixedRateUnitsESet = hasFixedRateUnitsESet;
		hasFixedRateUnits = HAS_FIXED_RATE_UNITS_EDEFAULT;
		hasFixedRateUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS, oldHasFixedRateUnits, HAS_FIXED_RATE_UNITS_EDEFAULT, oldHasFixedRateUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasFixedRateUnits() {
		return hasFixedRateUnitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixedMaterial() {
		return fixedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedMaterial(boolean newFixedMaterial) {
		boolean oldFixedMaterial = fixedMaterial;
		fixedMaterial = newFixedMaterial;
		boolean oldFixedMaterialESet = fixedMaterialESet;
		fixedMaterialESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__FIXED_MATERIAL, oldFixedMaterial, fixedMaterial, !oldFixedMaterialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixedMaterial() {
		boolean oldFixedMaterial = fixedMaterial;
		boolean oldFixedMaterialESet = fixedMaterialESet;
		fixedMaterial = FIXED_MATERIAL_EDEFAULT;
		fixedMaterialESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__FIXED_MATERIAL, oldFixedMaterial, FIXED_MATERIAL_EDEFAULT, oldFixedMaterialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixedMaterial() {
		return fixedMaterialESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLevelingDelay() {
		return levelingDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelingDelay(BigInteger newLevelingDelay) {
		BigInteger oldLevelingDelay = levelingDelay;
		levelingDelay = newLevelingDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY, oldLevelingDelay, levelingDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelingDelayFormatType getLevelingDelayFormat() {
		return levelingDelayFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelingDelayFormat(LevelingDelayFormatType newLevelingDelayFormat) {
		LevelingDelayFormatType oldLevelingDelayFormat = levelingDelayFormat;
		levelingDelayFormat = newLevelingDelayFormat == null ? LEVELING_DELAY_FORMAT_EDEFAULT : newLevelingDelayFormat;
		boolean oldLevelingDelayFormatESet = levelingDelayFormatESet;
		levelingDelayFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT, oldLevelingDelayFormat, levelingDelayFormat, !oldLevelingDelayFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevelingDelayFormat() {
		LevelingDelayFormatType oldLevelingDelayFormat = levelingDelayFormat;
		boolean oldLevelingDelayFormatESet = levelingDelayFormatESet;
		levelingDelayFormat = LEVELING_DELAY_FORMAT_EDEFAULT;
		levelingDelayFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT, oldLevelingDelayFormat, LEVELING_DELAY_FORMAT_EDEFAULT, oldLevelingDelayFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLevelingDelayFormat() {
		return levelingDelayFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLinkedFields() {
		return linkedFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedFields(boolean newLinkedFields) {
		boolean oldLinkedFields = linkedFields;
		linkedFields = newLinkedFields;
		boolean oldLinkedFieldsESet = linkedFieldsESet;
		linkedFieldsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__LINKED_FIELDS, oldLinkedFields, linkedFields, !oldLinkedFieldsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinkedFields() {
		boolean oldLinkedFields = linkedFields;
		boolean oldLinkedFieldsESet = linkedFieldsESet;
		linkedFields = LINKED_FIELDS_EDEFAULT;
		linkedFieldsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__LINKED_FIELDS, oldLinkedFields, LINKED_FIELDS_EDEFAULT, oldLinkedFieldsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinkedFields() {
		return linkedFieldsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMilestone() {
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMilestone(boolean newMilestone) {
		boolean oldMilestone = milestone;
		milestone = newMilestone;
		boolean oldMilestoneESet = milestoneESet;
		milestoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__MILESTONE, oldMilestone, milestone, !oldMilestoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMilestone() {
		boolean oldMilestone = milestone;
		boolean oldMilestoneESet = milestoneESet;
		milestone = MILESTONE_EDEFAULT;
		milestoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__MILESTONE, oldMilestone, MILESTONE_EDEFAULT, oldMilestoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMilestone() {
		return milestoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverallocated() {
		return overallocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallocated(boolean newOverallocated) {
		boolean oldOverallocated = overallocated;
		overallocated = newOverallocated;
		boolean oldOverallocatedESet = overallocatedESet;
		overallocatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__OVERALLOCATED, oldOverallocated, overallocated, !oldOverallocatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallocated() {
		boolean oldOverallocated = overallocated;
		boolean oldOverallocatedESet = overallocatedESet;
		overallocated = OVERALLOCATED_EDEFAULT;
		overallocatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__OVERALLOCATED, oldOverallocated, OVERALLOCATED_EDEFAULT, oldOverallocatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallocated() {
		return overallocatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOvertimeCost() {
		return overtimeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeCost(BigDecimal newOvertimeCost) {
		BigDecimal oldOvertimeCost = overtimeCost;
		overtimeCost = newOvertimeCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_COST, oldOvertimeCost, overtimeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getOvertimeWork() {
		return overtimeWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeWork(Duration newOvertimeWork) {
		Duration oldOvertimeWork = overtimeWork;
		overtimeWork = newOvertimeWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_WORK, oldOvertimeWork, overtimeWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPeakUnits() {
		return peakUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakUnits(float newPeakUnits) {
		float oldPeakUnits = peakUnits;
		peakUnits = newPeakUnits;
		boolean oldPeakUnitsESet = peakUnitsESet;
		peakUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__PEAK_UNITS, oldPeakUnits, peakUnits, !oldPeakUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeakUnits() {
		float oldPeakUnits = peakUnits;
		boolean oldPeakUnitsESet = peakUnitsESet;
		peakUnits = PEAK_UNITS_EDEFAULT;
		peakUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__PEAK_UNITS, oldPeakUnits, PEAK_UNITS_EDEFAULT, oldPeakUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeakUnits() {
		return peakUnitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRegularWork() {
		return regularWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularWork(Duration newRegularWork) {
		Duration oldRegularWork = regularWork;
		regularWork = newRegularWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__REGULAR_WORK, oldRegularWork, regularWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRemainingCost() {
		return remainingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingCost(BigDecimal newRemainingCost) {
		BigDecimal oldRemainingCost = remainingCost;
		remainingCost = newRemainingCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__REMAINING_COST, oldRemainingCost, remainingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRemainingOvertimeCost() {
		return remainingOvertimeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingOvertimeCost(BigDecimal newRemainingOvertimeCost) {
		BigDecimal oldRemainingOvertimeCost = remainingOvertimeCost;
		remainingOvertimeCost = newRemainingOvertimeCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST, oldRemainingOvertimeCost, remainingOvertimeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRemainingOvertimeWork() {
		return remainingOvertimeWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingOvertimeWork(Duration newRemainingOvertimeWork) {
		Duration oldRemainingOvertimeWork = remainingOvertimeWork;
		remainingOvertimeWork = newRemainingOvertimeWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK, oldRemainingOvertimeWork, remainingOvertimeWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRemainingWork() {
		return remainingWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingWork(Duration newRemainingWork) {
		Duration oldRemainingWork = remainingWork;
		remainingWork = newRemainingWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__REMAINING_WORK, oldRemainingWork, remainingWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResponsePending() {
		return responsePending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsePending(boolean newResponsePending) {
		boolean oldResponsePending = responsePending;
		responsePending = newResponsePending;
		boolean oldResponsePendingESet = responsePendingESet;
		responsePendingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__RESPONSE_PENDING, oldResponsePending, responsePending, !oldResponsePendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponsePending() {
		boolean oldResponsePending = responsePending;
		boolean oldResponsePendingESet = responsePendingESet;
		responsePending = RESPONSE_PENDING_EDEFAULT;
		responsePendingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__RESPONSE_PENDING, oldResponsePending, RESPONSE_PENDING_EDEFAULT, oldResponsePendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponsePending() {
		return responsePendingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(XMLGregorianCalendar newStart) {
		XMLGregorianCalendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(XMLGregorianCalendar newStop) {
		XMLGregorianCalendar oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__STOP, oldStop, stop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getResume() {
		return resume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResume(XMLGregorianCalendar newResume) {
		XMLGregorianCalendar oldResume = resume;
		resume = newResume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__RESUME, oldResume, resume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartVariance() {
		return startVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartVariance(BigInteger newStartVariance) {
		BigInteger oldStartVariance = startVariance;
		startVariance = newStartVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__START_VARIANCE, oldStartVariance, startVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(boolean newSummary) {
		boolean oldSummary = summary;
		summary = newSummary;
		boolean oldSummaryESet = summaryESet;
		summaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__SUMMARY, oldSummary, summary, !oldSummaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSummary() {
		boolean oldSummary = summary;
		boolean oldSummaryESet = summaryESet;
		summary = SUMMARY_EDEFAULT;
		summaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__SUMMARY, oldSummary, SUMMARY_EDEFAULT, oldSummaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSummary() {
		return summaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSV() {
		return sV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSV(float newSV) {
		float oldSV = sV;
		sV = newSV;
		boolean oldSVESet = sVESet;
		sVESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__SV, oldSV, sV, !oldSVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSV() {
		float oldSV = sV;
		boolean oldSVESet = sVESet;
		sV = SV_EDEFAULT;
		sVESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__SV, oldSV, SV_EDEFAULT, oldSVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSV() {
		return sVESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(float newUnits) {
		float oldUnits = units;
		units = newUnits;
		boolean oldUnitsESet = unitsESet;
		unitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__UNITS, oldUnits, units, !oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnits() {
		float oldUnits = units;
		boolean oldUnitsESet = unitsESet;
		units = UNITS_EDEFAULT;
		unitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__UNITS, oldUnits, UNITS_EDEFAULT, oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnits() {
		return unitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdateNeeded() {
		return updateNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateNeeded(boolean newUpdateNeeded) {
		boolean oldUpdateNeeded = updateNeeded;
		updateNeeded = newUpdateNeeded;
		boolean oldUpdateNeededESet = updateNeededESet;
		updateNeededESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__UPDATE_NEEDED, oldUpdateNeeded, updateNeeded, !oldUpdateNeededESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateNeeded() {
		boolean oldUpdateNeeded = updateNeeded;
		boolean oldUpdateNeededESet = updateNeededESet;
		updateNeeded = UPDATE_NEEDED_EDEFAULT;
		updateNeededESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__UPDATE_NEEDED, oldUpdateNeeded, UPDATE_NEEDED_EDEFAULT, oldUpdateNeededESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateNeeded() {
		return updateNeededESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVAC() {
		return vAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAC(float newVAC) {
		float oldVAC = vAC;
		vAC = newVAC;
		boolean oldVACESet = vACESet;
		vACESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__VAC, oldVAC, vAC, !oldVACESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVAC() {
		float oldVAC = vAC;
		boolean oldVACESet = vACESet;
		vAC = VAC_EDEFAULT;
		vACESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__VAC, oldVAC, VAC_EDEFAULT, oldVACESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVAC() {
		return vACESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(Duration newWork) {
		Duration oldWork = work;
		work = newWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__WORK, oldWork, work));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkContourType getWorkContour() {
		return workContour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkContour(WorkContourType newWorkContour) {
		WorkContourType oldWorkContour = workContour;
		workContour = newWorkContour == null ? WORK_CONTOUR_EDEFAULT : newWorkContour;
		boolean oldWorkContourESet = workContourESet;
		workContourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__WORK_CONTOUR, oldWorkContour, workContour, !oldWorkContourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkContour() {
		WorkContourType oldWorkContour = workContour;
		boolean oldWorkContourESet = workContourESet;
		workContour = WORK_CONTOUR_EDEFAULT;
		workContourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__WORK_CONTOUR, oldWorkContour, WORK_CONTOUR_EDEFAULT, oldWorkContourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkContour() {
		return workContourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBCWS() {
		return bCWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCWS(float newBCWS) {
		float oldBCWS = bCWS;
		bCWS = newBCWS;
		boolean oldBCWSESet = bCWSESet;
		bCWSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__BCWS, oldBCWS, bCWS, !oldBCWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBCWS() {
		float oldBCWS = bCWS;
		boolean oldBCWSESet = bCWSESet;
		bCWS = BCWS_EDEFAULT;
		bCWSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__BCWS, oldBCWS, BCWS_EDEFAULT, oldBCWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBCWS() {
		return bCWSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBCWP() {
		return bCWP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCWP(float newBCWP) {
		float oldBCWP = bCWP;
		bCWP = newBCWP;
		boolean oldBCWPESet = bCWPESet;
		bCWPESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__BCWP, oldBCWP, bCWP, !oldBCWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBCWP() {
		float oldBCWP = bCWP;
		boolean oldBCWPESet = bCWPESet;
		bCWP = BCWP_EDEFAULT;
		bCWPESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__BCWP, oldBCWP, BCWP_EDEFAULT, oldBCWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBCWP() {
		return bCWPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingTypeType getBookingType() {
		return bookingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingType(BookingTypeType newBookingType) {
		BookingTypeType oldBookingType = bookingType;
		bookingType = newBookingType == null ? BOOKING_TYPE_EDEFAULT : newBookingType;
		boolean oldBookingTypeESet = bookingTypeESet;
		bookingTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__BOOKING_TYPE, oldBookingType, bookingType, !oldBookingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBookingType() {
		BookingTypeType oldBookingType = bookingType;
		boolean oldBookingTypeESet = bookingTypeESet;
		bookingType = BOOKING_TYPE_EDEFAULT;
		bookingTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.ASSIGNMENT_TYPE__BOOKING_TYPE, oldBookingType, BOOKING_TYPE_EDEFAULT, oldBookingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBookingType() {
		return bookingTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualWorkProtected() {
		return actualWorkProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualWorkProtected(Duration newActualWorkProtected) {
		Duration oldActualWorkProtected = actualWorkProtected;
		actualWorkProtected = newActualWorkProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED, oldActualWorkProtected, actualWorkProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualOvertimeWorkProtected() {
		return actualOvertimeWorkProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualOvertimeWorkProtected(Duration newActualOvertimeWorkProtected) {
		Duration oldActualOvertimeWorkProtected = actualOvertimeWorkProtected;
		actualOvertimeWorkProtected = newActualOvertimeWorkProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED, oldActualOvertimeWorkProtected, actualOvertimeWorkProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssnOwner() {
		return assnOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssnOwner(String newAssnOwner) {
		String oldAssnOwner = assnOwner;
		assnOwner = newAssnOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER, oldAssnOwner, assnOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssnOwnerGuid() {
		return assnOwnerGuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssnOwnerGuid(String newAssnOwnerGuid) {
		String oldAssnOwnerGuid = assnOwnerGuid;
		assnOwnerGuid = newAssnOwnerGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER_GUID, oldAssnOwnerGuid, assnOwnerGuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBudgetCost() {
		return budgetCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudgetCost(BigDecimal newBudgetCost) {
		BigDecimal oldBudgetCost = budgetCost;
		budgetCost = newBudgetCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__BUDGET_COST, oldBudgetCost, budgetCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getBudgetWork() {
		return budgetWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudgetWork(Duration newBudgetWork) {
		Duration oldBudgetWork = budgetWork;
		budgetWork = newBudgetWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__BUDGET_WORK, oldBudgetWork, budgetWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedAttributeType> getExtendedAttribute() {
		if (extendedAttribute == null) {
			extendedAttribute = new EObjectContainmentEList<ExtendedAttributeType>(ExtendedAttributeType.class, this, MspdiPackage.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE);
		}
		return extendedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaselineType> getBaseline() {
		if (baseline == null) {
			baseline = new EObjectContainmentEList<BaselineType>(BaselineType.class, this, MspdiPackage.ASSIGNMENT_TYPE__BASELINE);
		}
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404000() {
		return f404000;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404000(EObject newF404000, NotificationChain msgs) {
		EObject oldF404000 = f404000;
		f404000 = newF404000;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404000, oldF404000, newF404000);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404000(EObject newF404000) {
		if (newF404000 != f404000) {
			NotificationChain msgs = null;
			if (f404000 != null)
				msgs = ((InternalEObject)f404000).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404000, null, msgs);
			if (newF404000 != null)
				msgs = ((InternalEObject)newF404000).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404000, null, msgs);
			msgs = basicSetF404000(newF404000, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404000, newF404000, newF404000));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404001() {
		return f404001;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404001(EObject newF404001, NotificationChain msgs) {
		EObject oldF404001 = f404001;
		f404001 = newF404001;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404001, oldF404001, newF404001);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404001(EObject newF404001) {
		if (newF404001 != f404001) {
			NotificationChain msgs = null;
			if (f404001 != null)
				msgs = ((InternalEObject)f404001).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404001, null, msgs);
			if (newF404001 != null)
				msgs = ((InternalEObject)newF404001).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404001, null, msgs);
			msgs = basicSetF404001(newF404001, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404001, newF404001, newF404001));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404002() {
		return f404002;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404002(EObject newF404002, NotificationChain msgs) {
		EObject oldF404002 = f404002;
		f404002 = newF404002;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404002, oldF404002, newF404002);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404002(EObject newF404002) {
		if (newF404002 != f404002) {
			NotificationChain msgs = null;
			if (f404002 != null)
				msgs = ((InternalEObject)f404002).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404002, null, msgs);
			if (newF404002 != null)
				msgs = ((InternalEObject)newF404002).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404002, null, msgs);
			msgs = basicSetF404002(newF404002, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404002, newF404002, newF404002));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404003() {
		return f404003;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404003(EObject newF404003, NotificationChain msgs) {
		EObject oldF404003 = f404003;
		f404003 = newF404003;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404003, oldF404003, newF404003);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404003(EObject newF404003) {
		if (newF404003 != f404003) {
			NotificationChain msgs = null;
			if (f404003 != null)
				msgs = ((InternalEObject)f404003).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404003, null, msgs);
			if (newF404003 != null)
				msgs = ((InternalEObject)newF404003).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404003, null, msgs);
			msgs = basicSetF404003(newF404003, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404003, newF404003, newF404003));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404004() {
		return f404004;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404004(EObject newF404004, NotificationChain msgs) {
		EObject oldF404004 = f404004;
		f404004 = newF404004;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404004, oldF404004, newF404004);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404004(EObject newF404004) {
		if (newF404004 != f404004) {
			NotificationChain msgs = null;
			if (f404004 != null)
				msgs = ((InternalEObject)f404004).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404004, null, msgs);
			if (newF404004 != null)
				msgs = ((InternalEObject)newF404004).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404004, null, msgs);
			msgs = basicSetF404004(newF404004, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404004, newF404004, newF404004));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404005() {
		return f404005;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404005(EObject newF404005, NotificationChain msgs) {
		EObject oldF404005 = f404005;
		f404005 = newF404005;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404005, oldF404005, newF404005);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404005(EObject newF404005) {
		if (newF404005 != f404005) {
			NotificationChain msgs = null;
			if (f404005 != null)
				msgs = ((InternalEObject)f404005).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404005, null, msgs);
			if (newF404005 != null)
				msgs = ((InternalEObject)newF404005).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404005, null, msgs);
			msgs = basicSetF404005(newF404005, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404005, newF404005, newF404005));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404006() {
		return f404006;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404006(EObject newF404006, NotificationChain msgs) {
		EObject oldF404006 = f404006;
		f404006 = newF404006;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404006, oldF404006, newF404006);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404006(EObject newF404006) {
		if (newF404006 != f404006) {
			NotificationChain msgs = null;
			if (f404006 != null)
				msgs = ((InternalEObject)f404006).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404006, null, msgs);
			if (newF404006 != null)
				msgs = ((InternalEObject)newF404006).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404006, null, msgs);
			msgs = basicSetF404006(newF404006, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404006, newF404006, newF404006));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404007() {
		return f404007;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404007(EObject newF404007, NotificationChain msgs) {
		EObject oldF404007 = f404007;
		f404007 = newF404007;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404007, oldF404007, newF404007);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404007(EObject newF404007) {
		if (newF404007 != f404007) {
			NotificationChain msgs = null;
			if (f404007 != null)
				msgs = ((InternalEObject)f404007).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404007, null, msgs);
			if (newF404007 != null)
				msgs = ((InternalEObject)newF404007).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404007, null, msgs);
			msgs = basicSetF404007(newF404007, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404007, newF404007, newF404007));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404008() {
		return f404008;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404008(EObject newF404008, NotificationChain msgs) {
		EObject oldF404008 = f404008;
		f404008 = newF404008;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404008, oldF404008, newF404008);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404008(EObject newF404008) {
		if (newF404008 != f404008) {
			NotificationChain msgs = null;
			if (f404008 != null)
				msgs = ((InternalEObject)f404008).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404008, null, msgs);
			if (newF404008 != null)
				msgs = ((InternalEObject)newF404008).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404008, null, msgs);
			msgs = basicSetF404008(newF404008, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404008, newF404008, newF404008));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404009() {
		return f404009;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404009(EObject newF404009, NotificationChain msgs) {
		EObject oldF404009 = f404009;
		f404009 = newF404009;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404009, oldF404009, newF404009);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404009(EObject newF404009) {
		if (newF404009 != f404009) {
			NotificationChain msgs = null;
			if (f404009 != null)
				msgs = ((InternalEObject)f404009).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404009, null, msgs);
			if (newF404009 != null)
				msgs = ((InternalEObject)newF404009).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404009, null, msgs);
			msgs = basicSetF404009(newF404009, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404009, newF404009, newF404009));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40400a() {
		return f40400a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40400a(EObject newF40400a, NotificationChain msgs) {
		EObject oldF40400a = f40400a;
		f40400a = newF40400a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400A, oldF40400a, newF40400a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40400a(EObject newF40400a) {
		if (newF40400a != f40400a) {
			NotificationChain msgs = null;
			if (f40400a != null)
				msgs = ((InternalEObject)f40400a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400A, null, msgs);
			if (newF40400a != null)
				msgs = ((InternalEObject)newF40400a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400A, null, msgs);
			msgs = basicSetF40400a(newF40400a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400A, newF40400a, newF40400a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40400b() {
		return f40400b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40400b(EObject newF40400b, NotificationChain msgs) {
		EObject oldF40400b = f40400b;
		f40400b = newF40400b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400B, oldF40400b, newF40400b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40400b(EObject newF40400b) {
		if (newF40400b != f40400b) {
			NotificationChain msgs = null;
			if (f40400b != null)
				msgs = ((InternalEObject)f40400b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400B, null, msgs);
			if (newF40400b != null)
				msgs = ((InternalEObject)newF40400b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400B, null, msgs);
			msgs = basicSetF40400b(newF40400b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400B, newF40400b, newF40400b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40400c() {
		return f40400c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40400c(EObject newF40400c, NotificationChain msgs) {
		EObject oldF40400c = f40400c;
		f40400c = newF40400c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400C, oldF40400c, newF40400c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40400c(EObject newF40400c) {
		if (newF40400c != f40400c) {
			NotificationChain msgs = null;
			if (f40400c != null)
				msgs = ((InternalEObject)f40400c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400C, null, msgs);
			if (newF40400c != null)
				msgs = ((InternalEObject)newF40400c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400C, null, msgs);
			msgs = basicSetF40400c(newF40400c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400C, newF40400c, newF40400c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40400d() {
		return f40400d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40400d(EObject newF40400d, NotificationChain msgs) {
		EObject oldF40400d = f40400d;
		f40400d = newF40400d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400D, oldF40400d, newF40400d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40400d(EObject newF40400d) {
		if (newF40400d != f40400d) {
			NotificationChain msgs = null;
			if (f40400d != null)
				msgs = ((InternalEObject)f40400d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400D, null, msgs);
			if (newF40400d != null)
				msgs = ((InternalEObject)newF40400d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400D, null, msgs);
			msgs = basicSetF40400d(newF40400d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400D, newF40400d, newF40400d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40400e() {
		return f40400e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40400e(EObject newF40400e, NotificationChain msgs) {
		EObject oldF40400e = f40400e;
		f40400e = newF40400e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400E, oldF40400e, newF40400e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40400e(EObject newF40400e) {
		if (newF40400e != f40400e) {
			NotificationChain msgs = null;
			if (f40400e != null)
				msgs = ((InternalEObject)f40400e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400E, null, msgs);
			if (newF40400e != null)
				msgs = ((InternalEObject)newF40400e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400E, null, msgs);
			msgs = basicSetF40400e(newF40400e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400E, newF40400e, newF40400e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40400f() {
		return f40400f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40400f(EObject newF40400f, NotificationChain msgs) {
		EObject oldF40400f = f40400f;
		f40400f = newF40400f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400F, oldF40400f, newF40400f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40400f(EObject newF40400f) {
		if (newF40400f != f40400f) {
			NotificationChain msgs = null;
			if (f40400f != null)
				msgs = ((InternalEObject)f40400f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400F, null, msgs);
			if (newF40400f != null)
				msgs = ((InternalEObject)newF40400f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40400F, null, msgs);
			msgs = basicSetF40400f(newF40400f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40400F, newF40400f, newF40400f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404010() {
		return f404010;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404010(EObject newF404010, NotificationChain msgs) {
		EObject oldF404010 = f404010;
		f404010 = newF404010;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404010, oldF404010, newF404010);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404010(EObject newF404010) {
		if (newF404010 != f404010) {
			NotificationChain msgs = null;
			if (f404010 != null)
				msgs = ((InternalEObject)f404010).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404010, null, msgs);
			if (newF404010 != null)
				msgs = ((InternalEObject)newF404010).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404010, null, msgs);
			msgs = basicSetF404010(newF404010, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404010, newF404010, newF404010));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404011() {
		return f404011;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404011(EObject newF404011, NotificationChain msgs) {
		EObject oldF404011 = f404011;
		f404011 = newF404011;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404011, oldF404011, newF404011);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404011(EObject newF404011) {
		if (newF404011 != f404011) {
			NotificationChain msgs = null;
			if (f404011 != null)
				msgs = ((InternalEObject)f404011).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404011, null, msgs);
			if (newF404011 != null)
				msgs = ((InternalEObject)newF404011).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404011, null, msgs);
			msgs = basicSetF404011(newF404011, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404011, newF404011, newF404011));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404012() {
		return f404012;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404012(EObject newF404012, NotificationChain msgs) {
		EObject oldF404012 = f404012;
		f404012 = newF404012;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404012, oldF404012, newF404012);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404012(EObject newF404012) {
		if (newF404012 != f404012) {
			NotificationChain msgs = null;
			if (f404012 != null)
				msgs = ((InternalEObject)f404012).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404012, null, msgs);
			if (newF404012 != null)
				msgs = ((InternalEObject)newF404012).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404012, null, msgs);
			msgs = basicSetF404012(newF404012, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404012, newF404012, newF404012));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404013() {
		return f404013;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404013(EObject newF404013, NotificationChain msgs) {
		EObject oldF404013 = f404013;
		f404013 = newF404013;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404013, oldF404013, newF404013);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404013(EObject newF404013) {
		if (newF404013 != f404013) {
			NotificationChain msgs = null;
			if (f404013 != null)
				msgs = ((InternalEObject)f404013).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404013, null, msgs);
			if (newF404013 != null)
				msgs = ((InternalEObject)newF404013).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404013, null, msgs);
			msgs = basicSetF404013(newF404013, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404013, newF404013, newF404013));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404014() {
		return f404014;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404014(EObject newF404014, NotificationChain msgs) {
		EObject oldF404014 = f404014;
		f404014 = newF404014;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404014, oldF404014, newF404014);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404014(EObject newF404014) {
		if (newF404014 != f404014) {
			NotificationChain msgs = null;
			if (f404014 != null)
				msgs = ((InternalEObject)f404014).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404014, null, msgs);
			if (newF404014 != null)
				msgs = ((InternalEObject)newF404014).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404014, null, msgs);
			msgs = basicSetF404014(newF404014, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404014, newF404014, newF404014));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404015() {
		return f404015;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404015(EObject newF404015, NotificationChain msgs) {
		EObject oldF404015 = f404015;
		f404015 = newF404015;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404015, oldF404015, newF404015);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404015(EObject newF404015) {
		if (newF404015 != f404015) {
			NotificationChain msgs = null;
			if (f404015 != null)
				msgs = ((InternalEObject)f404015).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404015, null, msgs);
			if (newF404015 != null)
				msgs = ((InternalEObject)newF404015).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404015, null, msgs);
			msgs = basicSetF404015(newF404015, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404015, newF404015, newF404015));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404016() {
		return f404016;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404016(EObject newF404016, NotificationChain msgs) {
		EObject oldF404016 = f404016;
		f404016 = newF404016;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404016, oldF404016, newF404016);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404016(EObject newF404016) {
		if (newF404016 != f404016) {
			NotificationChain msgs = null;
			if (f404016 != null)
				msgs = ((InternalEObject)f404016).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404016, null, msgs);
			if (newF404016 != null)
				msgs = ((InternalEObject)newF404016).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404016, null, msgs);
			msgs = basicSetF404016(newF404016, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404016, newF404016, newF404016));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404017() {
		return f404017;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404017(EObject newF404017, NotificationChain msgs) {
		EObject oldF404017 = f404017;
		f404017 = newF404017;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404017, oldF404017, newF404017);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404017(EObject newF404017) {
		if (newF404017 != f404017) {
			NotificationChain msgs = null;
			if (f404017 != null)
				msgs = ((InternalEObject)f404017).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404017, null, msgs);
			if (newF404017 != null)
				msgs = ((InternalEObject)newF404017).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404017, null, msgs);
			msgs = basicSetF404017(newF404017, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404017, newF404017, newF404017));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404018() {
		return f404018;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404018(EObject newF404018, NotificationChain msgs) {
		EObject oldF404018 = f404018;
		f404018 = newF404018;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404018, oldF404018, newF404018);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404018(EObject newF404018) {
		if (newF404018 != f404018) {
			NotificationChain msgs = null;
			if (f404018 != null)
				msgs = ((InternalEObject)f404018).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404018, null, msgs);
			if (newF404018 != null)
				msgs = ((InternalEObject)newF404018).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404018, null, msgs);
			msgs = basicSetF404018(newF404018, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404018, newF404018, newF404018));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404019() {
		return f404019;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404019(EObject newF404019, NotificationChain msgs) {
		EObject oldF404019 = f404019;
		f404019 = newF404019;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404019, oldF404019, newF404019);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404019(EObject newF404019) {
		if (newF404019 != f404019) {
			NotificationChain msgs = null;
			if (f404019 != null)
				msgs = ((InternalEObject)f404019).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404019, null, msgs);
			if (newF404019 != null)
				msgs = ((InternalEObject)newF404019).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404019, null, msgs);
			msgs = basicSetF404019(newF404019, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404019, newF404019, newF404019));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40401a() {
		return f40401a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40401a(EObject newF40401a, NotificationChain msgs) {
		EObject oldF40401a = f40401a;
		f40401a = newF40401a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401A, oldF40401a, newF40401a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40401a(EObject newF40401a) {
		if (newF40401a != f40401a) {
			NotificationChain msgs = null;
			if (f40401a != null)
				msgs = ((InternalEObject)f40401a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401A, null, msgs);
			if (newF40401a != null)
				msgs = ((InternalEObject)newF40401a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401A, null, msgs);
			msgs = basicSetF40401a(newF40401a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401A, newF40401a, newF40401a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40401b() {
		return f40401b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40401b(EObject newF40401b, NotificationChain msgs) {
		EObject oldF40401b = f40401b;
		f40401b = newF40401b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401B, oldF40401b, newF40401b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40401b(EObject newF40401b) {
		if (newF40401b != f40401b) {
			NotificationChain msgs = null;
			if (f40401b != null)
				msgs = ((InternalEObject)f40401b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401B, null, msgs);
			if (newF40401b != null)
				msgs = ((InternalEObject)newF40401b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401B, null, msgs);
			msgs = basicSetF40401b(newF40401b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401B, newF40401b, newF40401b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40401c() {
		return f40401c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40401c(EObject newF40401c, NotificationChain msgs) {
		EObject oldF40401c = f40401c;
		f40401c = newF40401c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401C, oldF40401c, newF40401c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40401c(EObject newF40401c) {
		if (newF40401c != f40401c) {
			NotificationChain msgs = null;
			if (f40401c != null)
				msgs = ((InternalEObject)f40401c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401C, null, msgs);
			if (newF40401c != null)
				msgs = ((InternalEObject)newF40401c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401C, null, msgs);
			msgs = basicSetF40401c(newF40401c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401C, newF40401c, newF40401c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40401d() {
		return f40401d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40401d(EObject newF40401d, NotificationChain msgs) {
		EObject oldF40401d = f40401d;
		f40401d = newF40401d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401D, oldF40401d, newF40401d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40401d(EObject newF40401d) {
		if (newF40401d != f40401d) {
			NotificationChain msgs = null;
			if (f40401d != null)
				msgs = ((InternalEObject)f40401d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401D, null, msgs);
			if (newF40401d != null)
				msgs = ((InternalEObject)newF40401d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401D, null, msgs);
			msgs = basicSetF40401d(newF40401d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401D, newF40401d, newF40401d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40401e() {
		return f40401e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40401e(EObject newF40401e, NotificationChain msgs) {
		EObject oldF40401e = f40401e;
		f40401e = newF40401e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401E, oldF40401e, newF40401e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40401e(EObject newF40401e) {
		if (newF40401e != f40401e) {
			NotificationChain msgs = null;
			if (f40401e != null)
				msgs = ((InternalEObject)f40401e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401E, null, msgs);
			if (newF40401e != null)
				msgs = ((InternalEObject)newF40401e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401E, null, msgs);
			msgs = basicSetF40401e(newF40401e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401E, newF40401e, newF40401e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40401f() {
		return f40401f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40401f(EObject newF40401f, NotificationChain msgs) {
		EObject oldF40401f = f40401f;
		f40401f = newF40401f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401F, oldF40401f, newF40401f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40401f(EObject newF40401f) {
		if (newF40401f != f40401f) {
			NotificationChain msgs = null;
			if (f40401f != null)
				msgs = ((InternalEObject)f40401f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401F, null, msgs);
			if (newF40401f != null)
				msgs = ((InternalEObject)newF40401f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40401F, null, msgs);
			msgs = basicSetF40401f(newF40401f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40401F, newF40401f, newF40401f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404020() {
		return f404020;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404020(EObject newF404020, NotificationChain msgs) {
		EObject oldF404020 = f404020;
		f404020 = newF404020;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404020, oldF404020, newF404020);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404020(EObject newF404020) {
		if (newF404020 != f404020) {
			NotificationChain msgs = null;
			if (f404020 != null)
				msgs = ((InternalEObject)f404020).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404020, null, msgs);
			if (newF404020 != null)
				msgs = ((InternalEObject)newF404020).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404020, null, msgs);
			msgs = basicSetF404020(newF404020, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404020, newF404020, newF404020));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404021() {
		return f404021;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404021(EObject newF404021, NotificationChain msgs) {
		EObject oldF404021 = f404021;
		f404021 = newF404021;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404021, oldF404021, newF404021);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404021(EObject newF404021) {
		if (newF404021 != f404021) {
			NotificationChain msgs = null;
			if (f404021 != null)
				msgs = ((InternalEObject)f404021).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404021, null, msgs);
			if (newF404021 != null)
				msgs = ((InternalEObject)newF404021).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404021, null, msgs);
			msgs = basicSetF404021(newF404021, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404021, newF404021, newF404021));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404022() {
		return f404022;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404022(EObject newF404022, NotificationChain msgs) {
		EObject oldF404022 = f404022;
		f404022 = newF404022;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404022, oldF404022, newF404022);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404022(EObject newF404022) {
		if (newF404022 != f404022) {
			NotificationChain msgs = null;
			if (f404022 != null)
				msgs = ((InternalEObject)f404022).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404022, null, msgs);
			if (newF404022 != null)
				msgs = ((InternalEObject)newF404022).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404022, null, msgs);
			msgs = basicSetF404022(newF404022, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404022, newF404022, newF404022));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404023() {
		return f404023;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404023(EObject newF404023, NotificationChain msgs) {
		EObject oldF404023 = f404023;
		f404023 = newF404023;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404023, oldF404023, newF404023);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404023(EObject newF404023) {
		if (newF404023 != f404023) {
			NotificationChain msgs = null;
			if (f404023 != null)
				msgs = ((InternalEObject)f404023).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404023, null, msgs);
			if (newF404023 != null)
				msgs = ((InternalEObject)newF404023).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404023, null, msgs);
			msgs = basicSetF404023(newF404023, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404023, newF404023, newF404023));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404024() {
		return f404024;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404024(EObject newF404024, NotificationChain msgs) {
		EObject oldF404024 = f404024;
		f404024 = newF404024;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404024, oldF404024, newF404024);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404024(EObject newF404024) {
		if (newF404024 != f404024) {
			NotificationChain msgs = null;
			if (f404024 != null)
				msgs = ((InternalEObject)f404024).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404024, null, msgs);
			if (newF404024 != null)
				msgs = ((InternalEObject)newF404024).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404024, null, msgs);
			msgs = basicSetF404024(newF404024, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404024, newF404024, newF404024));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404025() {
		return f404025;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404025(EObject newF404025, NotificationChain msgs) {
		EObject oldF404025 = f404025;
		f404025 = newF404025;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404025, oldF404025, newF404025);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404025(EObject newF404025) {
		if (newF404025 != f404025) {
			NotificationChain msgs = null;
			if (f404025 != null)
				msgs = ((InternalEObject)f404025).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404025, null, msgs);
			if (newF404025 != null)
				msgs = ((InternalEObject)newF404025).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404025, null, msgs);
			msgs = basicSetF404025(newF404025, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404025, newF404025, newF404025));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404026() {
		return f404026;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404026(EObject newF404026, NotificationChain msgs) {
		EObject oldF404026 = f404026;
		f404026 = newF404026;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404026, oldF404026, newF404026);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404026(EObject newF404026) {
		if (newF404026 != f404026) {
			NotificationChain msgs = null;
			if (f404026 != null)
				msgs = ((InternalEObject)f404026).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404026, null, msgs);
			if (newF404026 != null)
				msgs = ((InternalEObject)newF404026).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404026, null, msgs);
			msgs = basicSetF404026(newF404026, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404026, newF404026, newF404026));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404027() {
		return f404027;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404027(EObject newF404027, NotificationChain msgs) {
		EObject oldF404027 = f404027;
		f404027 = newF404027;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404027, oldF404027, newF404027);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404027(EObject newF404027) {
		if (newF404027 != f404027) {
			NotificationChain msgs = null;
			if (f404027 != null)
				msgs = ((InternalEObject)f404027).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404027, null, msgs);
			if (newF404027 != null)
				msgs = ((InternalEObject)newF404027).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404027, null, msgs);
			msgs = basicSetF404027(newF404027, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404027, newF404027, newF404027));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404028() {
		return f404028;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404028(EObject newF404028, NotificationChain msgs) {
		EObject oldF404028 = f404028;
		f404028 = newF404028;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404028, oldF404028, newF404028);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404028(EObject newF404028) {
		if (newF404028 != f404028) {
			NotificationChain msgs = null;
			if (f404028 != null)
				msgs = ((InternalEObject)f404028).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404028, null, msgs);
			if (newF404028 != null)
				msgs = ((InternalEObject)newF404028).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404028, null, msgs);
			msgs = basicSetF404028(newF404028, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404028, newF404028, newF404028));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404029() {
		return f404029;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404029(EObject newF404029, NotificationChain msgs) {
		EObject oldF404029 = f404029;
		f404029 = newF404029;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404029, oldF404029, newF404029);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404029(EObject newF404029) {
		if (newF404029 != f404029) {
			NotificationChain msgs = null;
			if (f404029 != null)
				msgs = ((InternalEObject)f404029).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404029, null, msgs);
			if (newF404029 != null)
				msgs = ((InternalEObject)newF404029).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404029, null, msgs);
			msgs = basicSetF404029(newF404029, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404029, newF404029, newF404029));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40402a() {
		return f40402a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40402a(EObject newF40402a, NotificationChain msgs) {
		EObject oldF40402a = f40402a;
		f40402a = newF40402a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402A, oldF40402a, newF40402a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40402a(EObject newF40402a) {
		if (newF40402a != f40402a) {
			NotificationChain msgs = null;
			if (f40402a != null)
				msgs = ((InternalEObject)f40402a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402A, null, msgs);
			if (newF40402a != null)
				msgs = ((InternalEObject)newF40402a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402A, null, msgs);
			msgs = basicSetF40402a(newF40402a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402A, newF40402a, newF40402a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40402b() {
		return f40402b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40402b(EObject newF40402b, NotificationChain msgs) {
		EObject oldF40402b = f40402b;
		f40402b = newF40402b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402B, oldF40402b, newF40402b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40402b(EObject newF40402b) {
		if (newF40402b != f40402b) {
			NotificationChain msgs = null;
			if (f40402b != null)
				msgs = ((InternalEObject)f40402b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402B, null, msgs);
			if (newF40402b != null)
				msgs = ((InternalEObject)newF40402b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402B, null, msgs);
			msgs = basicSetF40402b(newF40402b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402B, newF40402b, newF40402b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40402c() {
		return f40402c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40402c(EObject newF40402c, NotificationChain msgs) {
		EObject oldF40402c = f40402c;
		f40402c = newF40402c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402C, oldF40402c, newF40402c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40402c(EObject newF40402c) {
		if (newF40402c != f40402c) {
			NotificationChain msgs = null;
			if (f40402c != null)
				msgs = ((InternalEObject)f40402c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402C, null, msgs);
			if (newF40402c != null)
				msgs = ((InternalEObject)newF40402c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402C, null, msgs);
			msgs = basicSetF40402c(newF40402c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402C, newF40402c, newF40402c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40402d() {
		return f40402d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40402d(EObject newF40402d, NotificationChain msgs) {
		EObject oldF40402d = f40402d;
		f40402d = newF40402d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402D, oldF40402d, newF40402d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40402d(EObject newF40402d) {
		if (newF40402d != f40402d) {
			NotificationChain msgs = null;
			if (f40402d != null)
				msgs = ((InternalEObject)f40402d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402D, null, msgs);
			if (newF40402d != null)
				msgs = ((InternalEObject)newF40402d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402D, null, msgs);
			msgs = basicSetF40402d(newF40402d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402D, newF40402d, newF40402d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40402e() {
		return f40402e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40402e(EObject newF40402e, NotificationChain msgs) {
		EObject oldF40402e = f40402e;
		f40402e = newF40402e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402E, oldF40402e, newF40402e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40402e(EObject newF40402e) {
		if (newF40402e != f40402e) {
			NotificationChain msgs = null;
			if (f40402e != null)
				msgs = ((InternalEObject)f40402e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402E, null, msgs);
			if (newF40402e != null)
				msgs = ((InternalEObject)newF40402e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402E, null, msgs);
			msgs = basicSetF40402e(newF40402e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402E, newF40402e, newF40402e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40402f() {
		return f40402f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40402f(EObject newF40402f, NotificationChain msgs) {
		EObject oldF40402f = f40402f;
		f40402f = newF40402f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402F, oldF40402f, newF40402f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40402f(EObject newF40402f) {
		if (newF40402f != f40402f) {
			NotificationChain msgs = null;
			if (f40402f != null)
				msgs = ((InternalEObject)f40402f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402F, null, msgs);
			if (newF40402f != null)
				msgs = ((InternalEObject)newF40402f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40402F, null, msgs);
			msgs = basicSetF40402f(newF40402f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40402F, newF40402f, newF40402f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404030() {
		return f404030;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404030(EObject newF404030, NotificationChain msgs) {
		EObject oldF404030 = f404030;
		f404030 = newF404030;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404030, oldF404030, newF404030);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404030(EObject newF404030) {
		if (newF404030 != f404030) {
			NotificationChain msgs = null;
			if (f404030 != null)
				msgs = ((InternalEObject)f404030).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404030, null, msgs);
			if (newF404030 != null)
				msgs = ((InternalEObject)newF404030).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404030, null, msgs);
			msgs = basicSetF404030(newF404030, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404030, newF404030, newF404030));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404031() {
		return f404031;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404031(EObject newF404031, NotificationChain msgs) {
		EObject oldF404031 = f404031;
		f404031 = newF404031;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404031, oldF404031, newF404031);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404031(EObject newF404031) {
		if (newF404031 != f404031) {
			NotificationChain msgs = null;
			if (f404031 != null)
				msgs = ((InternalEObject)f404031).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404031, null, msgs);
			if (newF404031 != null)
				msgs = ((InternalEObject)newF404031).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404031, null, msgs);
			msgs = basicSetF404031(newF404031, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404031, newF404031, newF404031));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404032() {
		return f404032;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404032(EObject newF404032, NotificationChain msgs) {
		EObject oldF404032 = f404032;
		f404032 = newF404032;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404032, oldF404032, newF404032);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404032(EObject newF404032) {
		if (newF404032 != f404032) {
			NotificationChain msgs = null;
			if (f404032 != null)
				msgs = ((InternalEObject)f404032).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404032, null, msgs);
			if (newF404032 != null)
				msgs = ((InternalEObject)newF404032).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404032, null, msgs);
			msgs = basicSetF404032(newF404032, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404032, newF404032, newF404032));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404033() {
		return f404033;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404033(EObject newF404033, NotificationChain msgs) {
		EObject oldF404033 = f404033;
		f404033 = newF404033;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404033, oldF404033, newF404033);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404033(EObject newF404033) {
		if (newF404033 != f404033) {
			NotificationChain msgs = null;
			if (f404033 != null)
				msgs = ((InternalEObject)f404033).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404033, null, msgs);
			if (newF404033 != null)
				msgs = ((InternalEObject)newF404033).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404033, null, msgs);
			msgs = basicSetF404033(newF404033, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404033, newF404033, newF404033));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404034() {
		return f404034;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404034(EObject newF404034, NotificationChain msgs) {
		EObject oldF404034 = f404034;
		f404034 = newF404034;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404034, oldF404034, newF404034);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404034(EObject newF404034) {
		if (newF404034 != f404034) {
			NotificationChain msgs = null;
			if (f404034 != null)
				msgs = ((InternalEObject)f404034).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404034, null, msgs);
			if (newF404034 != null)
				msgs = ((InternalEObject)newF404034).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404034, null, msgs);
			msgs = basicSetF404034(newF404034, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404034, newF404034, newF404034));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404035() {
		return f404035;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404035(EObject newF404035, NotificationChain msgs) {
		EObject oldF404035 = f404035;
		f404035 = newF404035;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404035, oldF404035, newF404035);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404035(EObject newF404035) {
		if (newF404035 != f404035) {
			NotificationChain msgs = null;
			if (f404035 != null)
				msgs = ((InternalEObject)f404035).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404035, null, msgs);
			if (newF404035 != null)
				msgs = ((InternalEObject)newF404035).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404035, null, msgs);
			msgs = basicSetF404035(newF404035, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404035, newF404035, newF404035));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404036() {
		return f404036;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404036(EObject newF404036, NotificationChain msgs) {
		EObject oldF404036 = f404036;
		f404036 = newF404036;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404036, oldF404036, newF404036);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404036(EObject newF404036) {
		if (newF404036 != f404036) {
			NotificationChain msgs = null;
			if (f404036 != null)
				msgs = ((InternalEObject)f404036).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404036, null, msgs);
			if (newF404036 != null)
				msgs = ((InternalEObject)newF404036).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404036, null, msgs);
			msgs = basicSetF404036(newF404036, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404036, newF404036, newF404036));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404037() {
		return f404037;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404037(EObject newF404037, NotificationChain msgs) {
		EObject oldF404037 = f404037;
		f404037 = newF404037;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404037, oldF404037, newF404037);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404037(EObject newF404037) {
		if (newF404037 != f404037) {
			NotificationChain msgs = null;
			if (f404037 != null)
				msgs = ((InternalEObject)f404037).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404037, null, msgs);
			if (newF404037 != null)
				msgs = ((InternalEObject)newF404037).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404037, null, msgs);
			msgs = basicSetF404037(newF404037, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404037, newF404037, newF404037));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404038() {
		return f404038;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404038(EObject newF404038, NotificationChain msgs) {
		EObject oldF404038 = f404038;
		f404038 = newF404038;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404038, oldF404038, newF404038);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404038(EObject newF404038) {
		if (newF404038 != f404038) {
			NotificationChain msgs = null;
			if (f404038 != null)
				msgs = ((InternalEObject)f404038).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404038, null, msgs);
			if (newF404038 != null)
				msgs = ((InternalEObject)newF404038).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404038, null, msgs);
			msgs = basicSetF404038(newF404038, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404038, newF404038, newF404038));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404039() {
		return f404039;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404039(EObject newF404039, NotificationChain msgs) {
		EObject oldF404039 = f404039;
		f404039 = newF404039;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404039, oldF404039, newF404039);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404039(EObject newF404039) {
		if (newF404039 != f404039) {
			NotificationChain msgs = null;
			if (f404039 != null)
				msgs = ((InternalEObject)f404039).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404039, null, msgs);
			if (newF404039 != null)
				msgs = ((InternalEObject)newF404039).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404039, null, msgs);
			msgs = basicSetF404039(newF404039, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404039, newF404039, newF404039));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40403a() {
		return f40403a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40403a(EObject newF40403a, NotificationChain msgs) {
		EObject oldF40403a = f40403a;
		f40403a = newF40403a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403A, oldF40403a, newF40403a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40403a(EObject newF40403a) {
		if (newF40403a != f40403a) {
			NotificationChain msgs = null;
			if (f40403a != null)
				msgs = ((InternalEObject)f40403a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403A, null, msgs);
			if (newF40403a != null)
				msgs = ((InternalEObject)newF40403a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403A, null, msgs);
			msgs = basicSetF40403a(newF40403a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403A, newF40403a, newF40403a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40403b() {
		return f40403b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40403b(EObject newF40403b, NotificationChain msgs) {
		EObject oldF40403b = f40403b;
		f40403b = newF40403b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403B, oldF40403b, newF40403b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40403b(EObject newF40403b) {
		if (newF40403b != f40403b) {
			NotificationChain msgs = null;
			if (f40403b != null)
				msgs = ((InternalEObject)f40403b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403B, null, msgs);
			if (newF40403b != null)
				msgs = ((InternalEObject)newF40403b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403B, null, msgs);
			msgs = basicSetF40403b(newF40403b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403B, newF40403b, newF40403b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40403c() {
		return f40403c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40403c(EObject newF40403c, NotificationChain msgs) {
		EObject oldF40403c = f40403c;
		f40403c = newF40403c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403C, oldF40403c, newF40403c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40403c(EObject newF40403c) {
		if (newF40403c != f40403c) {
			NotificationChain msgs = null;
			if (f40403c != null)
				msgs = ((InternalEObject)f40403c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403C, null, msgs);
			if (newF40403c != null)
				msgs = ((InternalEObject)newF40403c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403C, null, msgs);
			msgs = basicSetF40403c(newF40403c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403C, newF40403c, newF40403c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40403d() {
		return f40403d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40403d(EObject newF40403d, NotificationChain msgs) {
		EObject oldF40403d = f40403d;
		f40403d = newF40403d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403D, oldF40403d, newF40403d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40403d(EObject newF40403d) {
		if (newF40403d != f40403d) {
			NotificationChain msgs = null;
			if (f40403d != null)
				msgs = ((InternalEObject)f40403d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403D, null, msgs);
			if (newF40403d != null)
				msgs = ((InternalEObject)newF40403d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403D, null, msgs);
			msgs = basicSetF40403d(newF40403d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403D, newF40403d, newF40403d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40403e() {
		return f40403e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40403e(EObject newF40403e, NotificationChain msgs) {
		EObject oldF40403e = f40403e;
		f40403e = newF40403e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403E, oldF40403e, newF40403e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40403e(EObject newF40403e) {
		if (newF40403e != f40403e) {
			NotificationChain msgs = null;
			if (f40403e != null)
				msgs = ((InternalEObject)f40403e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403E, null, msgs);
			if (newF40403e != null)
				msgs = ((InternalEObject)newF40403e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403E, null, msgs);
			msgs = basicSetF40403e(newF40403e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403E, newF40403e, newF40403e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40403f() {
		return f40403f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40403f(EObject newF40403f, NotificationChain msgs) {
		EObject oldF40403f = f40403f;
		f40403f = newF40403f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403F, oldF40403f, newF40403f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40403f(EObject newF40403f) {
		if (newF40403f != f40403f) {
			NotificationChain msgs = null;
			if (f40403f != null)
				msgs = ((InternalEObject)f40403f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403F, null, msgs);
			if (newF40403f != null)
				msgs = ((InternalEObject)newF40403f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40403F, null, msgs);
			msgs = basicSetF40403f(newF40403f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40403F, newF40403f, newF40403f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404040() {
		return f404040;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404040(EObject newF404040, NotificationChain msgs) {
		EObject oldF404040 = f404040;
		f404040 = newF404040;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404040, oldF404040, newF404040);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404040(EObject newF404040) {
		if (newF404040 != f404040) {
			NotificationChain msgs = null;
			if (f404040 != null)
				msgs = ((InternalEObject)f404040).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404040, null, msgs);
			if (newF404040 != null)
				msgs = ((InternalEObject)newF404040).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404040, null, msgs);
			msgs = basicSetF404040(newF404040, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404040, newF404040, newF404040));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404041() {
		return f404041;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404041(EObject newF404041, NotificationChain msgs) {
		EObject oldF404041 = f404041;
		f404041 = newF404041;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404041, oldF404041, newF404041);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404041(EObject newF404041) {
		if (newF404041 != f404041) {
			NotificationChain msgs = null;
			if (f404041 != null)
				msgs = ((InternalEObject)f404041).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404041, null, msgs);
			if (newF404041 != null)
				msgs = ((InternalEObject)newF404041).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404041, null, msgs);
			msgs = basicSetF404041(newF404041, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404041, newF404041, newF404041));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404042() {
		return f404042;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404042(EObject newF404042, NotificationChain msgs) {
		EObject oldF404042 = f404042;
		f404042 = newF404042;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404042, oldF404042, newF404042);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404042(EObject newF404042) {
		if (newF404042 != f404042) {
			NotificationChain msgs = null;
			if (f404042 != null)
				msgs = ((InternalEObject)f404042).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404042, null, msgs);
			if (newF404042 != null)
				msgs = ((InternalEObject)newF404042).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404042, null, msgs);
			msgs = basicSetF404042(newF404042, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404042, newF404042, newF404042));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404043() {
		return f404043;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404043(EObject newF404043, NotificationChain msgs) {
		EObject oldF404043 = f404043;
		f404043 = newF404043;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404043, oldF404043, newF404043);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404043(EObject newF404043) {
		if (newF404043 != f404043) {
			NotificationChain msgs = null;
			if (f404043 != null)
				msgs = ((InternalEObject)f404043).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404043, null, msgs);
			if (newF404043 != null)
				msgs = ((InternalEObject)newF404043).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404043, null, msgs);
			msgs = basicSetF404043(newF404043, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404043, newF404043, newF404043));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404044() {
		return f404044;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404044(EObject newF404044, NotificationChain msgs) {
		EObject oldF404044 = f404044;
		f404044 = newF404044;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404044, oldF404044, newF404044);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404044(EObject newF404044) {
		if (newF404044 != f404044) {
			NotificationChain msgs = null;
			if (f404044 != null)
				msgs = ((InternalEObject)f404044).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404044, null, msgs);
			if (newF404044 != null)
				msgs = ((InternalEObject)newF404044).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404044, null, msgs);
			msgs = basicSetF404044(newF404044, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404044, newF404044, newF404044));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404045() {
		return f404045;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404045(EObject newF404045, NotificationChain msgs) {
		EObject oldF404045 = f404045;
		f404045 = newF404045;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404045, oldF404045, newF404045);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404045(EObject newF404045) {
		if (newF404045 != f404045) {
			NotificationChain msgs = null;
			if (f404045 != null)
				msgs = ((InternalEObject)f404045).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404045, null, msgs);
			if (newF404045 != null)
				msgs = ((InternalEObject)newF404045).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404045, null, msgs);
			msgs = basicSetF404045(newF404045, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404045, newF404045, newF404045));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404046() {
		return f404046;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404046(EObject newF404046, NotificationChain msgs) {
		EObject oldF404046 = f404046;
		f404046 = newF404046;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404046, oldF404046, newF404046);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404046(EObject newF404046) {
		if (newF404046 != f404046) {
			NotificationChain msgs = null;
			if (f404046 != null)
				msgs = ((InternalEObject)f404046).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404046, null, msgs);
			if (newF404046 != null)
				msgs = ((InternalEObject)newF404046).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404046, null, msgs);
			msgs = basicSetF404046(newF404046, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404046, newF404046, newF404046));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404047() {
		return f404047;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404047(EObject newF404047, NotificationChain msgs) {
		EObject oldF404047 = f404047;
		f404047 = newF404047;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404047, oldF404047, newF404047);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404047(EObject newF404047) {
		if (newF404047 != f404047) {
			NotificationChain msgs = null;
			if (f404047 != null)
				msgs = ((InternalEObject)f404047).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404047, null, msgs);
			if (newF404047 != null)
				msgs = ((InternalEObject)newF404047).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404047, null, msgs);
			msgs = basicSetF404047(newF404047, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404047, newF404047, newF404047));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404048() {
		return f404048;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404048(EObject newF404048, NotificationChain msgs) {
		EObject oldF404048 = f404048;
		f404048 = newF404048;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404048, oldF404048, newF404048);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404048(EObject newF404048) {
		if (newF404048 != f404048) {
			NotificationChain msgs = null;
			if (f404048 != null)
				msgs = ((InternalEObject)f404048).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404048, null, msgs);
			if (newF404048 != null)
				msgs = ((InternalEObject)newF404048).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404048, null, msgs);
			msgs = basicSetF404048(newF404048, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404048, newF404048, newF404048));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404049() {
		return f404049;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404049(EObject newF404049, NotificationChain msgs) {
		EObject oldF404049 = f404049;
		f404049 = newF404049;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404049, oldF404049, newF404049);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404049(EObject newF404049) {
		if (newF404049 != f404049) {
			NotificationChain msgs = null;
			if (f404049 != null)
				msgs = ((InternalEObject)f404049).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404049, null, msgs);
			if (newF404049 != null)
				msgs = ((InternalEObject)newF404049).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404049, null, msgs);
			msgs = basicSetF404049(newF404049, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404049, newF404049, newF404049));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40404a() {
		return f40404a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40404a(EObject newF40404a, NotificationChain msgs) {
		EObject oldF40404a = f40404a;
		f40404a = newF40404a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404A, oldF40404a, newF40404a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40404a(EObject newF40404a) {
		if (newF40404a != f40404a) {
			NotificationChain msgs = null;
			if (f40404a != null)
				msgs = ((InternalEObject)f40404a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404A, null, msgs);
			if (newF40404a != null)
				msgs = ((InternalEObject)newF40404a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404A, null, msgs);
			msgs = basicSetF40404a(newF40404a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404A, newF40404a, newF40404a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40404b() {
		return f40404b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40404b(EObject newF40404b, NotificationChain msgs) {
		EObject oldF40404b = f40404b;
		f40404b = newF40404b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404B, oldF40404b, newF40404b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40404b(EObject newF40404b) {
		if (newF40404b != f40404b) {
			NotificationChain msgs = null;
			if (f40404b != null)
				msgs = ((InternalEObject)f40404b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404B, null, msgs);
			if (newF40404b != null)
				msgs = ((InternalEObject)newF40404b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404B, null, msgs);
			msgs = basicSetF40404b(newF40404b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404B, newF40404b, newF40404b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40404c() {
		return f40404c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40404c(EObject newF40404c, NotificationChain msgs) {
		EObject oldF40404c = f40404c;
		f40404c = newF40404c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404C, oldF40404c, newF40404c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40404c(EObject newF40404c) {
		if (newF40404c != f40404c) {
			NotificationChain msgs = null;
			if (f40404c != null)
				msgs = ((InternalEObject)f40404c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404C, null, msgs);
			if (newF40404c != null)
				msgs = ((InternalEObject)newF40404c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404C, null, msgs);
			msgs = basicSetF40404c(newF40404c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404C, newF40404c, newF40404c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40404d() {
		return f40404d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40404d(EObject newF40404d, NotificationChain msgs) {
		EObject oldF40404d = f40404d;
		f40404d = newF40404d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404D, oldF40404d, newF40404d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40404d(EObject newF40404d) {
		if (newF40404d != f40404d) {
			NotificationChain msgs = null;
			if (f40404d != null)
				msgs = ((InternalEObject)f40404d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404D, null, msgs);
			if (newF40404d != null)
				msgs = ((InternalEObject)newF40404d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404D, null, msgs);
			msgs = basicSetF40404d(newF40404d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404D, newF40404d, newF40404d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40404e() {
		return f40404e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40404e(EObject newF40404e, NotificationChain msgs) {
		EObject oldF40404e = f40404e;
		f40404e = newF40404e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404E, oldF40404e, newF40404e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40404e(EObject newF40404e) {
		if (newF40404e != f40404e) {
			NotificationChain msgs = null;
			if (f40404e != null)
				msgs = ((InternalEObject)f40404e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404E, null, msgs);
			if (newF40404e != null)
				msgs = ((InternalEObject)newF40404e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404E, null, msgs);
			msgs = basicSetF40404e(newF40404e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404E, newF40404e, newF40404e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40404f() {
		return f40404f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40404f(EObject newF40404f, NotificationChain msgs) {
		EObject oldF40404f = f40404f;
		f40404f = newF40404f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404F, oldF40404f, newF40404f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40404f(EObject newF40404f) {
		if (newF40404f != f40404f) {
			NotificationChain msgs = null;
			if (f40404f != null)
				msgs = ((InternalEObject)f40404f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404F, null, msgs);
			if (newF40404f != null)
				msgs = ((InternalEObject)newF40404f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40404F, null, msgs);
			msgs = basicSetF40404f(newF40404f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40404F, newF40404f, newF40404f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404050() {
		return f404050;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404050(EObject newF404050, NotificationChain msgs) {
		EObject oldF404050 = f404050;
		f404050 = newF404050;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404050, oldF404050, newF404050);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404050(EObject newF404050) {
		if (newF404050 != f404050) {
			NotificationChain msgs = null;
			if (f404050 != null)
				msgs = ((InternalEObject)f404050).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404050, null, msgs);
			if (newF404050 != null)
				msgs = ((InternalEObject)newF404050).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404050, null, msgs);
			msgs = basicSetF404050(newF404050, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404050, newF404050, newF404050));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404051() {
		return f404051;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404051(EObject newF404051, NotificationChain msgs) {
		EObject oldF404051 = f404051;
		f404051 = newF404051;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404051, oldF404051, newF404051);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404051(EObject newF404051) {
		if (newF404051 != f404051) {
			NotificationChain msgs = null;
			if (f404051 != null)
				msgs = ((InternalEObject)f404051).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404051, null, msgs);
			if (newF404051 != null)
				msgs = ((InternalEObject)newF404051).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404051, null, msgs);
			msgs = basicSetF404051(newF404051, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404051, newF404051, newF404051));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404052() {
		return f404052;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404052(EObject newF404052, NotificationChain msgs) {
		EObject oldF404052 = f404052;
		f404052 = newF404052;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404052, oldF404052, newF404052);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404052(EObject newF404052) {
		if (newF404052 != f404052) {
			NotificationChain msgs = null;
			if (f404052 != null)
				msgs = ((InternalEObject)f404052).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404052, null, msgs);
			if (newF404052 != null)
				msgs = ((InternalEObject)newF404052).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404052, null, msgs);
			msgs = basicSetF404052(newF404052, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404052, newF404052, newF404052));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404053() {
		return f404053;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404053(EObject newF404053, NotificationChain msgs) {
		EObject oldF404053 = f404053;
		f404053 = newF404053;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404053, oldF404053, newF404053);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404053(EObject newF404053) {
		if (newF404053 != f404053) {
			NotificationChain msgs = null;
			if (f404053 != null)
				msgs = ((InternalEObject)f404053).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404053, null, msgs);
			if (newF404053 != null)
				msgs = ((InternalEObject)newF404053).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404053, null, msgs);
			msgs = basicSetF404053(newF404053, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404053, newF404053, newF404053));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404054() {
		return f404054;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404054(EObject newF404054, NotificationChain msgs) {
		EObject oldF404054 = f404054;
		f404054 = newF404054;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404054, oldF404054, newF404054);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404054(EObject newF404054) {
		if (newF404054 != f404054) {
			NotificationChain msgs = null;
			if (f404054 != null)
				msgs = ((InternalEObject)f404054).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404054, null, msgs);
			if (newF404054 != null)
				msgs = ((InternalEObject)newF404054).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404054, null, msgs);
			msgs = basicSetF404054(newF404054, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404054, newF404054, newF404054));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404055() {
		return f404055;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404055(EObject newF404055, NotificationChain msgs) {
		EObject oldF404055 = f404055;
		f404055 = newF404055;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404055, oldF404055, newF404055);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404055(EObject newF404055) {
		if (newF404055 != f404055) {
			NotificationChain msgs = null;
			if (f404055 != null)
				msgs = ((InternalEObject)f404055).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404055, null, msgs);
			if (newF404055 != null)
				msgs = ((InternalEObject)newF404055).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404055, null, msgs);
			msgs = basicSetF404055(newF404055, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404055, newF404055, newF404055));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404056() {
		return f404056;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404056(EObject newF404056, NotificationChain msgs) {
		EObject oldF404056 = f404056;
		f404056 = newF404056;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404056, oldF404056, newF404056);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404056(EObject newF404056) {
		if (newF404056 != f404056) {
			NotificationChain msgs = null;
			if (f404056 != null)
				msgs = ((InternalEObject)f404056).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404056, null, msgs);
			if (newF404056 != null)
				msgs = ((InternalEObject)newF404056).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404056, null, msgs);
			msgs = basicSetF404056(newF404056, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404056, newF404056, newF404056));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404057() {
		return f404057;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404057(EObject newF404057, NotificationChain msgs) {
		EObject oldF404057 = f404057;
		f404057 = newF404057;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404057, oldF404057, newF404057);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404057(EObject newF404057) {
		if (newF404057 != f404057) {
			NotificationChain msgs = null;
			if (f404057 != null)
				msgs = ((InternalEObject)f404057).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404057, null, msgs);
			if (newF404057 != null)
				msgs = ((InternalEObject)newF404057).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404057, null, msgs);
			msgs = basicSetF404057(newF404057, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404057, newF404057, newF404057));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404058() {
		return f404058;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404058(EObject newF404058, NotificationChain msgs) {
		EObject oldF404058 = f404058;
		f404058 = newF404058;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404058, oldF404058, newF404058);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404058(EObject newF404058) {
		if (newF404058 != f404058) {
			NotificationChain msgs = null;
			if (f404058 != null)
				msgs = ((InternalEObject)f404058).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404058, null, msgs);
			if (newF404058 != null)
				msgs = ((InternalEObject)newF404058).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404058, null, msgs);
			msgs = basicSetF404058(newF404058, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404058, newF404058, newF404058));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404059() {
		return f404059;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404059(EObject newF404059, NotificationChain msgs) {
		EObject oldF404059 = f404059;
		f404059 = newF404059;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404059, oldF404059, newF404059);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404059(EObject newF404059) {
		if (newF404059 != f404059) {
			NotificationChain msgs = null;
			if (f404059 != null)
				msgs = ((InternalEObject)f404059).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404059, null, msgs);
			if (newF404059 != null)
				msgs = ((InternalEObject)newF404059).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404059, null, msgs);
			msgs = basicSetF404059(newF404059, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404059, newF404059, newF404059));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40405a() {
		return f40405a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40405a(EObject newF40405a, NotificationChain msgs) {
		EObject oldF40405a = f40405a;
		f40405a = newF40405a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405A, oldF40405a, newF40405a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40405a(EObject newF40405a) {
		if (newF40405a != f40405a) {
			NotificationChain msgs = null;
			if (f40405a != null)
				msgs = ((InternalEObject)f40405a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405A, null, msgs);
			if (newF40405a != null)
				msgs = ((InternalEObject)newF40405a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405A, null, msgs);
			msgs = basicSetF40405a(newF40405a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405A, newF40405a, newF40405a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40405b() {
		return f40405b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40405b(EObject newF40405b, NotificationChain msgs) {
		EObject oldF40405b = f40405b;
		f40405b = newF40405b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405B, oldF40405b, newF40405b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40405b(EObject newF40405b) {
		if (newF40405b != f40405b) {
			NotificationChain msgs = null;
			if (f40405b != null)
				msgs = ((InternalEObject)f40405b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405B, null, msgs);
			if (newF40405b != null)
				msgs = ((InternalEObject)newF40405b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405B, null, msgs);
			msgs = basicSetF40405b(newF40405b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405B, newF40405b, newF40405b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40405c() {
		return f40405c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40405c(EObject newF40405c, NotificationChain msgs) {
		EObject oldF40405c = f40405c;
		f40405c = newF40405c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405C, oldF40405c, newF40405c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40405c(EObject newF40405c) {
		if (newF40405c != f40405c) {
			NotificationChain msgs = null;
			if (f40405c != null)
				msgs = ((InternalEObject)f40405c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405C, null, msgs);
			if (newF40405c != null)
				msgs = ((InternalEObject)newF40405c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405C, null, msgs);
			msgs = basicSetF40405c(newF40405c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405C, newF40405c, newF40405c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40405d() {
		return f40405d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40405d(EObject newF40405d, NotificationChain msgs) {
		EObject oldF40405d = f40405d;
		f40405d = newF40405d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405D, oldF40405d, newF40405d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40405d(EObject newF40405d) {
		if (newF40405d != f40405d) {
			NotificationChain msgs = null;
			if (f40405d != null)
				msgs = ((InternalEObject)f40405d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405D, null, msgs);
			if (newF40405d != null)
				msgs = ((InternalEObject)newF40405d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405D, null, msgs);
			msgs = basicSetF40405d(newF40405d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405D, newF40405d, newF40405d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40405e() {
		return f40405e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40405e(EObject newF40405e, NotificationChain msgs) {
		EObject oldF40405e = f40405e;
		f40405e = newF40405e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405E, oldF40405e, newF40405e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40405e(EObject newF40405e) {
		if (newF40405e != f40405e) {
			NotificationChain msgs = null;
			if (f40405e != null)
				msgs = ((InternalEObject)f40405e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405E, null, msgs);
			if (newF40405e != null)
				msgs = ((InternalEObject)newF40405e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405E, null, msgs);
			msgs = basicSetF40405e(newF40405e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405E, newF40405e, newF40405e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40405f() {
		return f40405f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40405f(EObject newF40405f, NotificationChain msgs) {
		EObject oldF40405f = f40405f;
		f40405f = newF40405f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405F, oldF40405f, newF40405f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40405f(EObject newF40405f) {
		if (newF40405f != f40405f) {
			NotificationChain msgs = null;
			if (f40405f != null)
				msgs = ((InternalEObject)f40405f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405F, null, msgs);
			if (newF40405f != null)
				msgs = ((InternalEObject)newF40405f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40405F, null, msgs);
			msgs = basicSetF40405f(newF40405f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40405F, newF40405f, newF40405f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404060() {
		return f404060;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404060(EObject newF404060, NotificationChain msgs) {
		EObject oldF404060 = f404060;
		f404060 = newF404060;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404060, oldF404060, newF404060);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404060(EObject newF404060) {
		if (newF404060 != f404060) {
			NotificationChain msgs = null;
			if (f404060 != null)
				msgs = ((InternalEObject)f404060).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404060, null, msgs);
			if (newF404060 != null)
				msgs = ((InternalEObject)newF404060).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404060, null, msgs);
			msgs = basicSetF404060(newF404060, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404060, newF404060, newF404060));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404061() {
		return f404061;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404061(EObject newF404061, NotificationChain msgs) {
		EObject oldF404061 = f404061;
		f404061 = newF404061;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404061, oldF404061, newF404061);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404061(EObject newF404061) {
		if (newF404061 != f404061) {
			NotificationChain msgs = null;
			if (f404061 != null)
				msgs = ((InternalEObject)f404061).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404061, null, msgs);
			if (newF404061 != null)
				msgs = ((InternalEObject)newF404061).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404061, null, msgs);
			msgs = basicSetF404061(newF404061, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404061, newF404061, newF404061));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404062() {
		return f404062;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404062(EObject newF404062, NotificationChain msgs) {
		EObject oldF404062 = f404062;
		f404062 = newF404062;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404062, oldF404062, newF404062);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404062(EObject newF404062) {
		if (newF404062 != f404062) {
			NotificationChain msgs = null;
			if (f404062 != null)
				msgs = ((InternalEObject)f404062).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404062, null, msgs);
			if (newF404062 != null)
				msgs = ((InternalEObject)newF404062).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404062, null, msgs);
			msgs = basicSetF404062(newF404062, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404062, newF404062, newF404062));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404063() {
		return f404063;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404063(EObject newF404063, NotificationChain msgs) {
		EObject oldF404063 = f404063;
		f404063 = newF404063;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404063, oldF404063, newF404063);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404063(EObject newF404063) {
		if (newF404063 != f404063) {
			NotificationChain msgs = null;
			if (f404063 != null)
				msgs = ((InternalEObject)f404063).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404063, null, msgs);
			if (newF404063 != null)
				msgs = ((InternalEObject)newF404063).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404063, null, msgs);
			msgs = basicSetF404063(newF404063, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404063, newF404063, newF404063));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404064() {
		return f404064;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404064(EObject newF404064, NotificationChain msgs) {
		EObject oldF404064 = f404064;
		f404064 = newF404064;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404064, oldF404064, newF404064);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404064(EObject newF404064) {
		if (newF404064 != f404064) {
			NotificationChain msgs = null;
			if (f404064 != null)
				msgs = ((InternalEObject)f404064).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404064, null, msgs);
			if (newF404064 != null)
				msgs = ((InternalEObject)newF404064).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404064, null, msgs);
			msgs = basicSetF404064(newF404064, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404064, newF404064, newF404064));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404065() {
		return f404065;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404065(EObject newF404065, NotificationChain msgs) {
		EObject oldF404065 = f404065;
		f404065 = newF404065;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404065, oldF404065, newF404065);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404065(EObject newF404065) {
		if (newF404065 != f404065) {
			NotificationChain msgs = null;
			if (f404065 != null)
				msgs = ((InternalEObject)f404065).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404065, null, msgs);
			if (newF404065 != null)
				msgs = ((InternalEObject)newF404065).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404065, null, msgs);
			msgs = basicSetF404065(newF404065, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404065, newF404065, newF404065));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404066() {
		return f404066;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404066(EObject newF404066, NotificationChain msgs) {
		EObject oldF404066 = f404066;
		f404066 = newF404066;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404066, oldF404066, newF404066);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404066(EObject newF404066) {
		if (newF404066 != f404066) {
			NotificationChain msgs = null;
			if (f404066 != null)
				msgs = ((InternalEObject)f404066).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404066, null, msgs);
			if (newF404066 != null)
				msgs = ((InternalEObject)newF404066).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404066, null, msgs);
			msgs = basicSetF404066(newF404066, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404066, newF404066, newF404066));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404067() {
		return f404067;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404067(EObject newF404067, NotificationChain msgs) {
		EObject oldF404067 = f404067;
		f404067 = newF404067;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404067, oldF404067, newF404067);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404067(EObject newF404067) {
		if (newF404067 != f404067) {
			NotificationChain msgs = null;
			if (f404067 != null)
				msgs = ((InternalEObject)f404067).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404067, null, msgs);
			if (newF404067 != null)
				msgs = ((InternalEObject)newF404067).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404067, null, msgs);
			msgs = basicSetF404067(newF404067, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404067, newF404067, newF404067));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404068() {
		return f404068;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404068(EObject newF404068, NotificationChain msgs) {
		EObject oldF404068 = f404068;
		f404068 = newF404068;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404068, oldF404068, newF404068);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404068(EObject newF404068) {
		if (newF404068 != f404068) {
			NotificationChain msgs = null;
			if (f404068 != null)
				msgs = ((InternalEObject)f404068).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404068, null, msgs);
			if (newF404068 != null)
				msgs = ((InternalEObject)newF404068).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404068, null, msgs);
			msgs = basicSetF404068(newF404068, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404068, newF404068, newF404068));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404069() {
		return f404069;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404069(EObject newF404069, NotificationChain msgs) {
		EObject oldF404069 = f404069;
		f404069 = newF404069;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404069, oldF404069, newF404069);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404069(EObject newF404069) {
		if (newF404069 != f404069) {
			NotificationChain msgs = null;
			if (f404069 != null)
				msgs = ((InternalEObject)f404069).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404069, null, msgs);
			if (newF404069 != null)
				msgs = ((InternalEObject)newF404069).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404069, null, msgs);
			msgs = basicSetF404069(newF404069, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404069, newF404069, newF404069));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40406a() {
		return f40406a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40406a(EObject newF40406a, NotificationChain msgs) {
		EObject oldF40406a = f40406a;
		f40406a = newF40406a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406A, oldF40406a, newF40406a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40406a(EObject newF40406a) {
		if (newF40406a != f40406a) {
			NotificationChain msgs = null;
			if (f40406a != null)
				msgs = ((InternalEObject)f40406a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406A, null, msgs);
			if (newF40406a != null)
				msgs = ((InternalEObject)newF40406a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406A, null, msgs);
			msgs = basicSetF40406a(newF40406a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406A, newF40406a, newF40406a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40406b() {
		return f40406b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40406b(EObject newF40406b, NotificationChain msgs) {
		EObject oldF40406b = f40406b;
		f40406b = newF40406b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406B, oldF40406b, newF40406b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40406b(EObject newF40406b) {
		if (newF40406b != f40406b) {
			NotificationChain msgs = null;
			if (f40406b != null)
				msgs = ((InternalEObject)f40406b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406B, null, msgs);
			if (newF40406b != null)
				msgs = ((InternalEObject)newF40406b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406B, null, msgs);
			msgs = basicSetF40406b(newF40406b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406B, newF40406b, newF40406b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40406c() {
		return f40406c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40406c(EObject newF40406c, NotificationChain msgs) {
		EObject oldF40406c = f40406c;
		f40406c = newF40406c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406C, oldF40406c, newF40406c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40406c(EObject newF40406c) {
		if (newF40406c != f40406c) {
			NotificationChain msgs = null;
			if (f40406c != null)
				msgs = ((InternalEObject)f40406c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406C, null, msgs);
			if (newF40406c != null)
				msgs = ((InternalEObject)newF40406c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406C, null, msgs);
			msgs = basicSetF40406c(newF40406c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406C, newF40406c, newF40406c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40406d() {
		return f40406d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40406d(EObject newF40406d, NotificationChain msgs) {
		EObject oldF40406d = f40406d;
		f40406d = newF40406d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406D, oldF40406d, newF40406d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40406d(EObject newF40406d) {
		if (newF40406d != f40406d) {
			NotificationChain msgs = null;
			if (f40406d != null)
				msgs = ((InternalEObject)f40406d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406D, null, msgs);
			if (newF40406d != null)
				msgs = ((InternalEObject)newF40406d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406D, null, msgs);
			msgs = basicSetF40406d(newF40406d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406D, newF40406d, newF40406d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40406e() {
		return f40406e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40406e(EObject newF40406e, NotificationChain msgs) {
		EObject oldF40406e = f40406e;
		f40406e = newF40406e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406E, oldF40406e, newF40406e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40406e(EObject newF40406e) {
		if (newF40406e != f40406e) {
			NotificationChain msgs = null;
			if (f40406e != null)
				msgs = ((InternalEObject)f40406e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406E, null, msgs);
			if (newF40406e != null)
				msgs = ((InternalEObject)newF40406e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406E, null, msgs);
			msgs = basicSetF40406e(newF40406e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406E, newF40406e, newF40406e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40406f() {
		return f40406f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40406f(EObject newF40406f, NotificationChain msgs) {
		EObject oldF40406f = f40406f;
		f40406f = newF40406f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406F, oldF40406f, newF40406f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40406f(EObject newF40406f) {
		if (newF40406f != f40406f) {
			NotificationChain msgs = null;
			if (f40406f != null)
				msgs = ((InternalEObject)f40406f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406F, null, msgs);
			if (newF40406f != null)
				msgs = ((InternalEObject)newF40406f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40406F, null, msgs);
			msgs = basicSetF40406f(newF40406f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40406F, newF40406f, newF40406f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404070() {
		return f404070;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404070(EObject newF404070, NotificationChain msgs) {
		EObject oldF404070 = f404070;
		f404070 = newF404070;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404070, oldF404070, newF404070);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404070(EObject newF404070) {
		if (newF404070 != f404070) {
			NotificationChain msgs = null;
			if (f404070 != null)
				msgs = ((InternalEObject)f404070).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404070, null, msgs);
			if (newF404070 != null)
				msgs = ((InternalEObject)newF404070).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404070, null, msgs);
			msgs = basicSetF404070(newF404070, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404070, newF404070, newF404070));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404071() {
		return f404071;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404071(EObject newF404071, NotificationChain msgs) {
		EObject oldF404071 = f404071;
		f404071 = newF404071;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404071, oldF404071, newF404071);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404071(EObject newF404071) {
		if (newF404071 != f404071) {
			NotificationChain msgs = null;
			if (f404071 != null)
				msgs = ((InternalEObject)f404071).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404071, null, msgs);
			if (newF404071 != null)
				msgs = ((InternalEObject)newF404071).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404071, null, msgs);
			msgs = basicSetF404071(newF404071, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404071, newF404071, newF404071));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404072() {
		return f404072;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404072(EObject newF404072, NotificationChain msgs) {
		EObject oldF404072 = f404072;
		f404072 = newF404072;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404072, oldF404072, newF404072);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404072(EObject newF404072) {
		if (newF404072 != f404072) {
			NotificationChain msgs = null;
			if (f404072 != null)
				msgs = ((InternalEObject)f404072).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404072, null, msgs);
			if (newF404072 != null)
				msgs = ((InternalEObject)newF404072).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404072, null, msgs);
			msgs = basicSetF404072(newF404072, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404072, newF404072, newF404072));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404073() {
		return f404073;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404073(EObject newF404073, NotificationChain msgs) {
		EObject oldF404073 = f404073;
		f404073 = newF404073;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404073, oldF404073, newF404073);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404073(EObject newF404073) {
		if (newF404073 != f404073) {
			NotificationChain msgs = null;
			if (f404073 != null)
				msgs = ((InternalEObject)f404073).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404073, null, msgs);
			if (newF404073 != null)
				msgs = ((InternalEObject)newF404073).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404073, null, msgs);
			msgs = basicSetF404073(newF404073, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404073, newF404073, newF404073));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404074() {
		return f404074;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404074(EObject newF404074, NotificationChain msgs) {
		EObject oldF404074 = f404074;
		f404074 = newF404074;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404074, oldF404074, newF404074);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404074(EObject newF404074) {
		if (newF404074 != f404074) {
			NotificationChain msgs = null;
			if (f404074 != null)
				msgs = ((InternalEObject)f404074).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404074, null, msgs);
			if (newF404074 != null)
				msgs = ((InternalEObject)newF404074).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404074, null, msgs);
			msgs = basicSetF404074(newF404074, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404074, newF404074, newF404074));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404075() {
		return f404075;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404075(EObject newF404075, NotificationChain msgs) {
		EObject oldF404075 = f404075;
		f404075 = newF404075;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404075, oldF404075, newF404075);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404075(EObject newF404075) {
		if (newF404075 != f404075) {
			NotificationChain msgs = null;
			if (f404075 != null)
				msgs = ((InternalEObject)f404075).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404075, null, msgs);
			if (newF404075 != null)
				msgs = ((InternalEObject)newF404075).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404075, null, msgs);
			msgs = basicSetF404075(newF404075, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404075, newF404075, newF404075));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404076() {
		return f404076;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404076(EObject newF404076, NotificationChain msgs) {
		EObject oldF404076 = f404076;
		f404076 = newF404076;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404076, oldF404076, newF404076);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404076(EObject newF404076) {
		if (newF404076 != f404076) {
			NotificationChain msgs = null;
			if (f404076 != null)
				msgs = ((InternalEObject)f404076).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404076, null, msgs);
			if (newF404076 != null)
				msgs = ((InternalEObject)newF404076).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404076, null, msgs);
			msgs = basicSetF404076(newF404076, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404076, newF404076, newF404076));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404077() {
		return f404077;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404077(EObject newF404077, NotificationChain msgs) {
		EObject oldF404077 = f404077;
		f404077 = newF404077;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404077, oldF404077, newF404077);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404077(EObject newF404077) {
		if (newF404077 != f404077) {
			NotificationChain msgs = null;
			if (f404077 != null)
				msgs = ((InternalEObject)f404077).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404077, null, msgs);
			if (newF404077 != null)
				msgs = ((InternalEObject)newF404077).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404077, null, msgs);
			msgs = basicSetF404077(newF404077, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404077, newF404077, newF404077));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404078() {
		return f404078;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404078(EObject newF404078, NotificationChain msgs) {
		EObject oldF404078 = f404078;
		f404078 = newF404078;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404078, oldF404078, newF404078);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404078(EObject newF404078) {
		if (newF404078 != f404078) {
			NotificationChain msgs = null;
			if (f404078 != null)
				msgs = ((InternalEObject)f404078).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404078, null, msgs);
			if (newF404078 != null)
				msgs = ((InternalEObject)newF404078).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404078, null, msgs);
			msgs = basicSetF404078(newF404078, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404078, newF404078, newF404078));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404079() {
		return f404079;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404079(EObject newF404079, NotificationChain msgs) {
		EObject oldF404079 = f404079;
		f404079 = newF404079;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404079, oldF404079, newF404079);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404079(EObject newF404079) {
		if (newF404079 != f404079) {
			NotificationChain msgs = null;
			if (f404079 != null)
				msgs = ((InternalEObject)f404079).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404079, null, msgs);
			if (newF404079 != null)
				msgs = ((InternalEObject)newF404079).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404079, null, msgs);
			msgs = basicSetF404079(newF404079, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404079, newF404079, newF404079));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40407a() {
		return f40407a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40407a(EObject newF40407a, NotificationChain msgs) {
		EObject oldF40407a = f40407a;
		f40407a = newF40407a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407A, oldF40407a, newF40407a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40407a(EObject newF40407a) {
		if (newF40407a != f40407a) {
			NotificationChain msgs = null;
			if (f40407a != null)
				msgs = ((InternalEObject)f40407a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407A, null, msgs);
			if (newF40407a != null)
				msgs = ((InternalEObject)newF40407a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407A, null, msgs);
			msgs = basicSetF40407a(newF40407a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407A, newF40407a, newF40407a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40407b() {
		return f40407b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40407b(EObject newF40407b, NotificationChain msgs) {
		EObject oldF40407b = f40407b;
		f40407b = newF40407b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407B, oldF40407b, newF40407b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40407b(EObject newF40407b) {
		if (newF40407b != f40407b) {
			NotificationChain msgs = null;
			if (f40407b != null)
				msgs = ((InternalEObject)f40407b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407B, null, msgs);
			if (newF40407b != null)
				msgs = ((InternalEObject)newF40407b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407B, null, msgs);
			msgs = basicSetF40407b(newF40407b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407B, newF40407b, newF40407b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40407c() {
		return f40407c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40407c(EObject newF40407c, NotificationChain msgs) {
		EObject oldF40407c = f40407c;
		f40407c = newF40407c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407C, oldF40407c, newF40407c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40407c(EObject newF40407c) {
		if (newF40407c != f40407c) {
			NotificationChain msgs = null;
			if (f40407c != null)
				msgs = ((InternalEObject)f40407c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407C, null, msgs);
			if (newF40407c != null)
				msgs = ((InternalEObject)newF40407c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407C, null, msgs);
			msgs = basicSetF40407c(newF40407c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407C, newF40407c, newF40407c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40407d() {
		return f40407d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40407d(EObject newF40407d, NotificationChain msgs) {
		EObject oldF40407d = f40407d;
		f40407d = newF40407d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407D, oldF40407d, newF40407d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40407d(EObject newF40407d) {
		if (newF40407d != f40407d) {
			NotificationChain msgs = null;
			if (f40407d != null)
				msgs = ((InternalEObject)f40407d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407D, null, msgs);
			if (newF40407d != null)
				msgs = ((InternalEObject)newF40407d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407D, null, msgs);
			msgs = basicSetF40407d(newF40407d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407D, newF40407d, newF40407d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40407e() {
		return f40407e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40407e(EObject newF40407e, NotificationChain msgs) {
		EObject oldF40407e = f40407e;
		f40407e = newF40407e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407E, oldF40407e, newF40407e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40407e(EObject newF40407e) {
		if (newF40407e != f40407e) {
			NotificationChain msgs = null;
			if (f40407e != null)
				msgs = ((InternalEObject)f40407e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407E, null, msgs);
			if (newF40407e != null)
				msgs = ((InternalEObject)newF40407e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407E, null, msgs);
			msgs = basicSetF40407e(newF40407e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407E, newF40407e, newF40407e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40407f() {
		return f40407f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40407f(EObject newF40407f, NotificationChain msgs) {
		EObject oldF40407f = f40407f;
		f40407f = newF40407f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407F, oldF40407f, newF40407f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40407f(EObject newF40407f) {
		if (newF40407f != f40407f) {
			NotificationChain msgs = null;
			if (f40407f != null)
				msgs = ((InternalEObject)f40407f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407F, null, msgs);
			if (newF40407f != null)
				msgs = ((InternalEObject)newF40407f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40407F, null, msgs);
			msgs = basicSetF40407f(newF40407f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40407F, newF40407f, newF40407f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404080() {
		return f404080;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404080(EObject newF404080, NotificationChain msgs) {
		EObject oldF404080 = f404080;
		f404080 = newF404080;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404080, oldF404080, newF404080);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404080(EObject newF404080) {
		if (newF404080 != f404080) {
			NotificationChain msgs = null;
			if (f404080 != null)
				msgs = ((InternalEObject)f404080).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404080, null, msgs);
			if (newF404080 != null)
				msgs = ((InternalEObject)newF404080).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404080, null, msgs);
			msgs = basicSetF404080(newF404080, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404080, newF404080, newF404080));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404081() {
		return f404081;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404081(EObject newF404081, NotificationChain msgs) {
		EObject oldF404081 = f404081;
		f404081 = newF404081;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404081, oldF404081, newF404081);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404081(EObject newF404081) {
		if (newF404081 != f404081) {
			NotificationChain msgs = null;
			if (f404081 != null)
				msgs = ((InternalEObject)f404081).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404081, null, msgs);
			if (newF404081 != null)
				msgs = ((InternalEObject)newF404081).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404081, null, msgs);
			msgs = basicSetF404081(newF404081, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404081, newF404081, newF404081));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404082() {
		return f404082;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404082(EObject newF404082, NotificationChain msgs) {
		EObject oldF404082 = f404082;
		f404082 = newF404082;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404082, oldF404082, newF404082);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404082(EObject newF404082) {
		if (newF404082 != f404082) {
			NotificationChain msgs = null;
			if (f404082 != null)
				msgs = ((InternalEObject)f404082).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404082, null, msgs);
			if (newF404082 != null)
				msgs = ((InternalEObject)newF404082).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404082, null, msgs);
			msgs = basicSetF404082(newF404082, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404082, newF404082, newF404082));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404083() {
		return f404083;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404083(EObject newF404083, NotificationChain msgs) {
		EObject oldF404083 = f404083;
		f404083 = newF404083;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404083, oldF404083, newF404083);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404083(EObject newF404083) {
		if (newF404083 != f404083) {
			NotificationChain msgs = null;
			if (f404083 != null)
				msgs = ((InternalEObject)f404083).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404083, null, msgs);
			if (newF404083 != null)
				msgs = ((InternalEObject)newF404083).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404083, null, msgs);
			msgs = basicSetF404083(newF404083, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404083, newF404083, newF404083));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404084() {
		return f404084;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404084(EObject newF404084, NotificationChain msgs) {
		EObject oldF404084 = f404084;
		f404084 = newF404084;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404084, oldF404084, newF404084);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404084(EObject newF404084) {
		if (newF404084 != f404084) {
			NotificationChain msgs = null;
			if (f404084 != null)
				msgs = ((InternalEObject)f404084).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404084, null, msgs);
			if (newF404084 != null)
				msgs = ((InternalEObject)newF404084).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404084, null, msgs);
			msgs = basicSetF404084(newF404084, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404084, newF404084, newF404084));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404085() {
		return f404085;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404085(EObject newF404085, NotificationChain msgs) {
		EObject oldF404085 = f404085;
		f404085 = newF404085;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404085, oldF404085, newF404085);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404085(EObject newF404085) {
		if (newF404085 != f404085) {
			NotificationChain msgs = null;
			if (f404085 != null)
				msgs = ((InternalEObject)f404085).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404085, null, msgs);
			if (newF404085 != null)
				msgs = ((InternalEObject)newF404085).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404085, null, msgs);
			msgs = basicSetF404085(newF404085, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404085, newF404085, newF404085));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404086() {
		return f404086;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404086(EObject newF404086, NotificationChain msgs) {
		EObject oldF404086 = f404086;
		f404086 = newF404086;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404086, oldF404086, newF404086);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404086(EObject newF404086) {
		if (newF404086 != f404086) {
			NotificationChain msgs = null;
			if (f404086 != null)
				msgs = ((InternalEObject)f404086).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404086, null, msgs);
			if (newF404086 != null)
				msgs = ((InternalEObject)newF404086).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404086, null, msgs);
			msgs = basicSetF404086(newF404086, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404086, newF404086, newF404086));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404087() {
		return f404087;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404087(EObject newF404087, NotificationChain msgs) {
		EObject oldF404087 = f404087;
		f404087 = newF404087;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404087, oldF404087, newF404087);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404087(EObject newF404087) {
		if (newF404087 != f404087) {
			NotificationChain msgs = null;
			if (f404087 != null)
				msgs = ((InternalEObject)f404087).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404087, null, msgs);
			if (newF404087 != null)
				msgs = ((InternalEObject)newF404087).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404087, null, msgs);
			msgs = basicSetF404087(newF404087, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404087, newF404087, newF404087));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404088() {
		return f404088;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404088(EObject newF404088, NotificationChain msgs) {
		EObject oldF404088 = f404088;
		f404088 = newF404088;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404088, oldF404088, newF404088);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404088(EObject newF404088) {
		if (newF404088 != f404088) {
			NotificationChain msgs = null;
			if (f404088 != null)
				msgs = ((InternalEObject)f404088).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404088, null, msgs);
			if (newF404088 != null)
				msgs = ((InternalEObject)newF404088).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404088, null, msgs);
			msgs = basicSetF404088(newF404088, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404088, newF404088, newF404088));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404089() {
		return f404089;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404089(EObject newF404089, NotificationChain msgs) {
		EObject oldF404089 = f404089;
		f404089 = newF404089;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404089, oldF404089, newF404089);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404089(EObject newF404089) {
		if (newF404089 != f404089) {
			NotificationChain msgs = null;
			if (f404089 != null)
				msgs = ((InternalEObject)f404089).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404089, null, msgs);
			if (newF404089 != null)
				msgs = ((InternalEObject)newF404089).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404089, null, msgs);
			msgs = basicSetF404089(newF404089, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404089, newF404089, newF404089));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40408a() {
		return f40408a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40408a(EObject newF40408a, NotificationChain msgs) {
		EObject oldF40408a = f40408a;
		f40408a = newF40408a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408A, oldF40408a, newF40408a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40408a(EObject newF40408a) {
		if (newF40408a != f40408a) {
			NotificationChain msgs = null;
			if (f40408a != null)
				msgs = ((InternalEObject)f40408a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408A, null, msgs);
			if (newF40408a != null)
				msgs = ((InternalEObject)newF40408a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408A, null, msgs);
			msgs = basicSetF40408a(newF40408a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408A, newF40408a, newF40408a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40408b() {
		return f40408b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40408b(EObject newF40408b, NotificationChain msgs) {
		EObject oldF40408b = f40408b;
		f40408b = newF40408b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408B, oldF40408b, newF40408b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40408b(EObject newF40408b) {
		if (newF40408b != f40408b) {
			NotificationChain msgs = null;
			if (f40408b != null)
				msgs = ((InternalEObject)f40408b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408B, null, msgs);
			if (newF40408b != null)
				msgs = ((InternalEObject)newF40408b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408B, null, msgs);
			msgs = basicSetF40408b(newF40408b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408B, newF40408b, newF40408b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40408c() {
		return f40408c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40408c(EObject newF40408c, NotificationChain msgs) {
		EObject oldF40408c = f40408c;
		f40408c = newF40408c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408C, oldF40408c, newF40408c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40408c(EObject newF40408c) {
		if (newF40408c != f40408c) {
			NotificationChain msgs = null;
			if (f40408c != null)
				msgs = ((InternalEObject)f40408c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408C, null, msgs);
			if (newF40408c != null)
				msgs = ((InternalEObject)newF40408c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408C, null, msgs);
			msgs = basicSetF40408c(newF40408c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408C, newF40408c, newF40408c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40408d() {
		return f40408d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40408d(EObject newF40408d, NotificationChain msgs) {
		EObject oldF40408d = f40408d;
		f40408d = newF40408d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408D, oldF40408d, newF40408d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40408d(EObject newF40408d) {
		if (newF40408d != f40408d) {
			NotificationChain msgs = null;
			if (f40408d != null)
				msgs = ((InternalEObject)f40408d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408D, null, msgs);
			if (newF40408d != null)
				msgs = ((InternalEObject)newF40408d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408D, null, msgs);
			msgs = basicSetF40408d(newF40408d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408D, newF40408d, newF40408d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40408e() {
		return f40408e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40408e(EObject newF40408e, NotificationChain msgs) {
		EObject oldF40408e = f40408e;
		f40408e = newF40408e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408E, oldF40408e, newF40408e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40408e(EObject newF40408e) {
		if (newF40408e != f40408e) {
			NotificationChain msgs = null;
			if (f40408e != null)
				msgs = ((InternalEObject)f40408e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408E, null, msgs);
			if (newF40408e != null)
				msgs = ((InternalEObject)newF40408e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408E, null, msgs);
			msgs = basicSetF40408e(newF40408e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408E, newF40408e, newF40408e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40408f() {
		return f40408f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40408f(EObject newF40408f, NotificationChain msgs) {
		EObject oldF40408f = f40408f;
		f40408f = newF40408f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408F, oldF40408f, newF40408f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40408f(EObject newF40408f) {
		if (newF40408f != f40408f) {
			NotificationChain msgs = null;
			if (f40408f != null)
				msgs = ((InternalEObject)f40408f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408F, null, msgs);
			if (newF40408f != null)
				msgs = ((InternalEObject)newF40408f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40408F, null, msgs);
			msgs = basicSetF40408f(newF40408f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40408F, newF40408f, newF40408f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404090() {
		return f404090;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404090(EObject newF404090, NotificationChain msgs) {
		EObject oldF404090 = f404090;
		f404090 = newF404090;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404090, oldF404090, newF404090);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404090(EObject newF404090) {
		if (newF404090 != f404090) {
			NotificationChain msgs = null;
			if (f404090 != null)
				msgs = ((InternalEObject)f404090).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404090, null, msgs);
			if (newF404090 != null)
				msgs = ((InternalEObject)newF404090).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404090, null, msgs);
			msgs = basicSetF404090(newF404090, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404090, newF404090, newF404090));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404091() {
		return f404091;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404091(EObject newF404091, NotificationChain msgs) {
		EObject oldF404091 = f404091;
		f404091 = newF404091;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404091, oldF404091, newF404091);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404091(EObject newF404091) {
		if (newF404091 != f404091) {
			NotificationChain msgs = null;
			if (f404091 != null)
				msgs = ((InternalEObject)f404091).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404091, null, msgs);
			if (newF404091 != null)
				msgs = ((InternalEObject)newF404091).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404091, null, msgs);
			msgs = basicSetF404091(newF404091, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404091, newF404091, newF404091));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404092() {
		return f404092;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404092(EObject newF404092, NotificationChain msgs) {
		EObject oldF404092 = f404092;
		f404092 = newF404092;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404092, oldF404092, newF404092);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404092(EObject newF404092) {
		if (newF404092 != f404092) {
			NotificationChain msgs = null;
			if (f404092 != null)
				msgs = ((InternalEObject)f404092).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404092, null, msgs);
			if (newF404092 != null)
				msgs = ((InternalEObject)newF404092).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404092, null, msgs);
			msgs = basicSetF404092(newF404092, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404092, newF404092, newF404092));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404093() {
		return f404093;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404093(EObject newF404093, NotificationChain msgs) {
		EObject oldF404093 = f404093;
		f404093 = newF404093;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404093, oldF404093, newF404093);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404093(EObject newF404093) {
		if (newF404093 != f404093) {
			NotificationChain msgs = null;
			if (f404093 != null)
				msgs = ((InternalEObject)f404093).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404093, null, msgs);
			if (newF404093 != null)
				msgs = ((InternalEObject)newF404093).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404093, null, msgs);
			msgs = basicSetF404093(newF404093, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404093, newF404093, newF404093));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404094() {
		return f404094;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404094(EObject newF404094, NotificationChain msgs) {
		EObject oldF404094 = f404094;
		f404094 = newF404094;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404094, oldF404094, newF404094);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404094(EObject newF404094) {
		if (newF404094 != f404094) {
			NotificationChain msgs = null;
			if (f404094 != null)
				msgs = ((InternalEObject)f404094).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404094, null, msgs);
			if (newF404094 != null)
				msgs = ((InternalEObject)newF404094).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404094, null, msgs);
			msgs = basicSetF404094(newF404094, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404094, newF404094, newF404094));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404095() {
		return f404095;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404095(EObject newF404095, NotificationChain msgs) {
		EObject oldF404095 = f404095;
		f404095 = newF404095;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404095, oldF404095, newF404095);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404095(EObject newF404095) {
		if (newF404095 != f404095) {
			NotificationChain msgs = null;
			if (f404095 != null)
				msgs = ((InternalEObject)f404095).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404095, null, msgs);
			if (newF404095 != null)
				msgs = ((InternalEObject)newF404095).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404095, null, msgs);
			msgs = basicSetF404095(newF404095, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404095, newF404095, newF404095));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404096() {
		return f404096;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404096(EObject newF404096, NotificationChain msgs) {
		EObject oldF404096 = f404096;
		f404096 = newF404096;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404096, oldF404096, newF404096);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404096(EObject newF404096) {
		if (newF404096 != f404096) {
			NotificationChain msgs = null;
			if (f404096 != null)
				msgs = ((InternalEObject)f404096).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404096, null, msgs);
			if (newF404096 != null)
				msgs = ((InternalEObject)newF404096).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404096, null, msgs);
			msgs = basicSetF404096(newF404096, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404096, newF404096, newF404096));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404097() {
		return f404097;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404097(EObject newF404097, NotificationChain msgs) {
		EObject oldF404097 = f404097;
		f404097 = newF404097;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404097, oldF404097, newF404097);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404097(EObject newF404097) {
		if (newF404097 != f404097) {
			NotificationChain msgs = null;
			if (f404097 != null)
				msgs = ((InternalEObject)f404097).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404097, null, msgs);
			if (newF404097 != null)
				msgs = ((InternalEObject)newF404097).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404097, null, msgs);
			msgs = basicSetF404097(newF404097, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404097, newF404097, newF404097));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404098() {
		return f404098;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404098(EObject newF404098, NotificationChain msgs) {
		EObject oldF404098 = f404098;
		f404098 = newF404098;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404098, oldF404098, newF404098);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404098(EObject newF404098) {
		if (newF404098 != f404098) {
			NotificationChain msgs = null;
			if (f404098 != null)
				msgs = ((InternalEObject)f404098).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404098, null, msgs);
			if (newF404098 != null)
				msgs = ((InternalEObject)newF404098).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404098, null, msgs);
			msgs = basicSetF404098(newF404098, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404098, newF404098, newF404098));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF404099() {
		return f404099;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF404099(EObject newF404099, NotificationChain msgs) {
		EObject oldF404099 = f404099;
		f404099 = newF404099;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404099, oldF404099, newF404099);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF404099(EObject newF404099) {
		if (newF404099 != f404099) {
			NotificationChain msgs = null;
			if (f404099 != null)
				msgs = ((InternalEObject)f404099).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404099, null, msgs);
			if (newF404099 != null)
				msgs = ((InternalEObject)newF404099).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F404099, null, msgs);
			msgs = basicSetF404099(newF404099, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F404099, newF404099, newF404099));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40409a() {
		return f40409a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40409a(EObject newF40409a, NotificationChain msgs) {
		EObject oldF40409a = f40409a;
		f40409a = newF40409a;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409A, oldF40409a, newF40409a);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40409a(EObject newF40409a) {
		if (newF40409a != f40409a) {
			NotificationChain msgs = null;
			if (f40409a != null)
				msgs = ((InternalEObject)f40409a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409A, null, msgs);
			if (newF40409a != null)
				msgs = ((InternalEObject)newF40409a).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409A, null, msgs);
			msgs = basicSetF40409a(newF40409a, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409A, newF40409a, newF40409a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40409b() {
		return f40409b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40409b(EObject newF40409b, NotificationChain msgs) {
		EObject oldF40409b = f40409b;
		f40409b = newF40409b;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409B, oldF40409b, newF40409b);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40409b(EObject newF40409b) {
		if (newF40409b != f40409b) {
			NotificationChain msgs = null;
			if (f40409b != null)
				msgs = ((InternalEObject)f40409b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409B, null, msgs);
			if (newF40409b != null)
				msgs = ((InternalEObject)newF40409b).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409B, null, msgs);
			msgs = basicSetF40409b(newF40409b, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409B, newF40409b, newF40409b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40409c() {
		return f40409c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40409c(EObject newF40409c, NotificationChain msgs) {
		EObject oldF40409c = f40409c;
		f40409c = newF40409c;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409C, oldF40409c, newF40409c);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40409c(EObject newF40409c) {
		if (newF40409c != f40409c) {
			NotificationChain msgs = null;
			if (f40409c != null)
				msgs = ((InternalEObject)f40409c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409C, null, msgs);
			if (newF40409c != null)
				msgs = ((InternalEObject)newF40409c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409C, null, msgs);
			msgs = basicSetF40409c(newF40409c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409C, newF40409c, newF40409c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40409d() {
		return f40409d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40409d(EObject newF40409d, NotificationChain msgs) {
		EObject oldF40409d = f40409d;
		f40409d = newF40409d;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409D, oldF40409d, newF40409d);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40409d(EObject newF40409d) {
		if (newF40409d != f40409d) {
			NotificationChain msgs = null;
			if (f40409d != null)
				msgs = ((InternalEObject)f40409d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409D, null, msgs);
			if (newF40409d != null)
				msgs = ((InternalEObject)newF40409d).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409D, null, msgs);
			msgs = basicSetF40409d(newF40409d, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409D, newF40409d, newF40409d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40409e() {
		return f40409e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40409e(EObject newF40409e, NotificationChain msgs) {
		EObject oldF40409e = f40409e;
		f40409e = newF40409e;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409E, oldF40409e, newF40409e);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40409e(EObject newF40409e) {
		if (newF40409e != f40409e) {
			NotificationChain msgs = null;
			if (f40409e != null)
				msgs = ((InternalEObject)f40409e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409E, null, msgs);
			if (newF40409e != null)
				msgs = ((InternalEObject)newF40409e).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409E, null, msgs);
			msgs = basicSetF40409e(newF40409e, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409E, newF40409e, newF40409e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF40409f() {
		return f40409f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF40409f(EObject newF40409f, NotificationChain msgs) {
		EObject oldF40409f = f40409f;
		f40409f = newF40409f;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409F, oldF40409f, newF40409f);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF40409f(EObject newF40409f) {
		if (newF40409f != f40409f) {
			NotificationChain msgs = null;
			if (f40409f != null)
				msgs = ((InternalEObject)f40409f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409F, null, msgs);
			if (newF40409f != null)
				msgs = ((InternalEObject)newF40409f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F40409F, null, msgs);
			msgs = basicSetF40409f(newF40409f, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F40409F, newF40409f, newF40409f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a0() {
		return f4040a0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a0(EObject newF4040a0, NotificationChain msgs) {
		EObject oldF4040a0 = f4040a0;
		f4040a0 = newF4040a0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A0, oldF4040a0, newF4040a0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a0(EObject newF4040a0) {
		if (newF4040a0 != f4040a0) {
			NotificationChain msgs = null;
			if (f4040a0 != null)
				msgs = ((InternalEObject)f4040a0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A0, null, msgs);
			if (newF4040a0 != null)
				msgs = ((InternalEObject)newF4040a0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A0, null, msgs);
			msgs = basicSetF4040a0(newF4040a0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A0, newF4040a0, newF4040a0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a1() {
		return f4040a1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a1(EObject newF4040a1, NotificationChain msgs) {
		EObject oldF4040a1 = f4040a1;
		f4040a1 = newF4040a1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A1, oldF4040a1, newF4040a1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a1(EObject newF4040a1) {
		if (newF4040a1 != f4040a1) {
			NotificationChain msgs = null;
			if (f4040a1 != null)
				msgs = ((InternalEObject)f4040a1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A1, null, msgs);
			if (newF4040a1 != null)
				msgs = ((InternalEObject)newF4040a1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A1, null, msgs);
			msgs = basicSetF4040a1(newF4040a1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A1, newF4040a1, newF4040a1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a2() {
		return f4040a2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a2(EObject newF4040a2, NotificationChain msgs) {
		EObject oldF4040a2 = f4040a2;
		f4040a2 = newF4040a2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A2, oldF4040a2, newF4040a2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a2(EObject newF4040a2) {
		if (newF4040a2 != f4040a2) {
			NotificationChain msgs = null;
			if (f4040a2 != null)
				msgs = ((InternalEObject)f4040a2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A2, null, msgs);
			if (newF4040a2 != null)
				msgs = ((InternalEObject)newF4040a2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A2, null, msgs);
			msgs = basicSetF4040a2(newF4040a2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A2, newF4040a2, newF4040a2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a3() {
		return f4040a3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a3(EObject newF4040a3, NotificationChain msgs) {
		EObject oldF4040a3 = f4040a3;
		f4040a3 = newF4040a3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A3, oldF4040a3, newF4040a3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a3(EObject newF4040a3) {
		if (newF4040a3 != f4040a3) {
			NotificationChain msgs = null;
			if (f4040a3 != null)
				msgs = ((InternalEObject)f4040a3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A3, null, msgs);
			if (newF4040a3 != null)
				msgs = ((InternalEObject)newF4040a3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A3, null, msgs);
			msgs = basicSetF4040a3(newF4040a3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A3, newF4040a3, newF4040a3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a4() {
		return f4040a4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a4(EObject newF4040a4, NotificationChain msgs) {
		EObject oldF4040a4 = f4040a4;
		f4040a4 = newF4040a4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A4, oldF4040a4, newF4040a4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a4(EObject newF4040a4) {
		if (newF4040a4 != f4040a4) {
			NotificationChain msgs = null;
			if (f4040a4 != null)
				msgs = ((InternalEObject)f4040a4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A4, null, msgs);
			if (newF4040a4 != null)
				msgs = ((InternalEObject)newF4040a4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A4, null, msgs);
			msgs = basicSetF4040a4(newF4040a4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A4, newF4040a4, newF4040a4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a5() {
		return f4040a5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a5(EObject newF4040a5, NotificationChain msgs) {
		EObject oldF4040a5 = f4040a5;
		f4040a5 = newF4040a5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A5, oldF4040a5, newF4040a5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a5(EObject newF4040a5) {
		if (newF4040a5 != f4040a5) {
			NotificationChain msgs = null;
			if (f4040a5 != null)
				msgs = ((InternalEObject)f4040a5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A5, null, msgs);
			if (newF4040a5 != null)
				msgs = ((InternalEObject)newF4040a5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A5, null, msgs);
			msgs = basicSetF4040a5(newF4040a5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A5, newF4040a5, newF4040a5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a6() {
		return f4040a6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a6(EObject newF4040a6, NotificationChain msgs) {
		EObject oldF4040a6 = f4040a6;
		f4040a6 = newF4040a6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A6, oldF4040a6, newF4040a6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a6(EObject newF4040a6) {
		if (newF4040a6 != f4040a6) {
			NotificationChain msgs = null;
			if (f4040a6 != null)
				msgs = ((InternalEObject)f4040a6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A6, null, msgs);
			if (newF4040a6 != null)
				msgs = ((InternalEObject)newF4040a6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A6, null, msgs);
			msgs = basicSetF4040a6(newF4040a6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A6, newF4040a6, newF4040a6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a7() {
		return f4040a7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a7(EObject newF4040a7, NotificationChain msgs) {
		EObject oldF4040a7 = f4040a7;
		f4040a7 = newF4040a7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A7, oldF4040a7, newF4040a7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a7(EObject newF4040a7) {
		if (newF4040a7 != f4040a7) {
			NotificationChain msgs = null;
			if (f4040a7 != null)
				msgs = ((InternalEObject)f4040a7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A7, null, msgs);
			if (newF4040a7 != null)
				msgs = ((InternalEObject)newF4040a7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A7, null, msgs);
			msgs = basicSetF4040a7(newF4040a7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A7, newF4040a7, newF4040a7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a8() {
		return f4040a8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a8(EObject newF4040a8, NotificationChain msgs) {
		EObject oldF4040a8 = f4040a8;
		f4040a8 = newF4040a8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A8, oldF4040a8, newF4040a8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a8(EObject newF4040a8) {
		if (newF4040a8 != f4040a8) {
			NotificationChain msgs = null;
			if (f4040a8 != null)
				msgs = ((InternalEObject)f4040a8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A8, null, msgs);
			if (newF4040a8 != null)
				msgs = ((InternalEObject)newF4040a8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A8, null, msgs);
			msgs = basicSetF4040a8(newF4040a8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A8, newF4040a8, newF4040a8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040a9() {
		return f4040a9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040a9(EObject newF4040a9, NotificationChain msgs) {
		EObject oldF4040a9 = f4040a9;
		f4040a9 = newF4040a9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A9, oldF4040a9, newF4040a9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040a9(EObject newF4040a9) {
		if (newF4040a9 != f4040a9) {
			NotificationChain msgs = null;
			if (f4040a9 != null)
				msgs = ((InternalEObject)f4040a9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A9, null, msgs);
			if (newF4040a9 != null)
				msgs = ((InternalEObject)newF4040a9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040A9, null, msgs);
			msgs = basicSetF4040a9(newF4040a9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040A9, newF4040a9, newF4040a9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040aa() {
		return f4040aa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040aa(EObject newF4040aa, NotificationChain msgs) {
		EObject oldF4040aa = f4040aa;
		f4040aa = newF4040aa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AA, oldF4040aa, newF4040aa);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040aa(EObject newF4040aa) {
		if (newF4040aa != f4040aa) {
			NotificationChain msgs = null;
			if (f4040aa != null)
				msgs = ((InternalEObject)f4040aa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AA, null, msgs);
			if (newF4040aa != null)
				msgs = ((InternalEObject)newF4040aa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AA, null, msgs);
			msgs = basicSetF4040aa(newF4040aa, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AA, newF4040aa, newF4040aa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040ab() {
		return f4040ab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040ab(EObject newF4040ab, NotificationChain msgs) {
		EObject oldF4040ab = f4040ab;
		f4040ab = newF4040ab;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AB, oldF4040ab, newF4040ab);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040ab(EObject newF4040ab) {
		if (newF4040ab != f4040ab) {
			NotificationChain msgs = null;
			if (f4040ab != null)
				msgs = ((InternalEObject)f4040ab).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AB, null, msgs);
			if (newF4040ab != null)
				msgs = ((InternalEObject)newF4040ab).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AB, null, msgs);
			msgs = basicSetF4040ab(newF4040ab, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AB, newF4040ab, newF4040ab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040ac() {
		return f4040ac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040ac(EObject newF4040ac, NotificationChain msgs) {
		EObject oldF4040ac = f4040ac;
		f4040ac = newF4040ac;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AC, oldF4040ac, newF4040ac);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040ac(EObject newF4040ac) {
		if (newF4040ac != f4040ac) {
			NotificationChain msgs = null;
			if (f4040ac != null)
				msgs = ((InternalEObject)f4040ac).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AC, null, msgs);
			if (newF4040ac != null)
				msgs = ((InternalEObject)newF4040ac).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AC, null, msgs);
			msgs = basicSetF4040ac(newF4040ac, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AC, newF4040ac, newF4040ac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040ad() {
		return f4040ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040ad(EObject newF4040ad, NotificationChain msgs) {
		EObject oldF4040ad = f4040ad;
		f4040ad = newF4040ad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AD, oldF4040ad, newF4040ad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040ad(EObject newF4040ad) {
		if (newF4040ad != f4040ad) {
			NotificationChain msgs = null;
			if (f4040ad != null)
				msgs = ((InternalEObject)f4040ad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AD, null, msgs);
			if (newF4040ad != null)
				msgs = ((InternalEObject)newF4040ad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AD, null, msgs);
			msgs = basicSetF4040ad(newF4040ad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AD, newF4040ad, newF4040ad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040ae() {
		return f4040ae;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040ae(EObject newF4040ae, NotificationChain msgs) {
		EObject oldF4040ae = f4040ae;
		f4040ae = newF4040ae;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AE, oldF4040ae, newF4040ae);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040ae(EObject newF4040ae) {
		if (newF4040ae != f4040ae) {
			NotificationChain msgs = null;
			if (f4040ae != null)
				msgs = ((InternalEObject)f4040ae).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AE, null, msgs);
			if (newF4040ae != null)
				msgs = ((InternalEObject)newF4040ae).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AE, null, msgs);
			msgs = basicSetF4040ae(newF4040ae, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AE, newF4040ae, newF4040ae));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040af() {
		return f4040af;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040af(EObject newF4040af, NotificationChain msgs) {
		EObject oldF4040af = f4040af;
		f4040af = newF4040af;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AF, oldF4040af, newF4040af);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040af(EObject newF4040af) {
		if (newF4040af != f4040af) {
			NotificationChain msgs = null;
			if (f4040af != null)
				msgs = ((InternalEObject)f4040af).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AF, null, msgs);
			if (newF4040af != null)
				msgs = ((InternalEObject)newF4040af).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040AF, null, msgs);
			msgs = basicSetF4040af(newF4040af, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040AF, newF4040af, newF4040af));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b0() {
		return f4040b0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b0(EObject newF4040b0, NotificationChain msgs) {
		EObject oldF4040b0 = f4040b0;
		f4040b0 = newF4040b0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B0, oldF4040b0, newF4040b0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b0(EObject newF4040b0) {
		if (newF4040b0 != f4040b0) {
			NotificationChain msgs = null;
			if (f4040b0 != null)
				msgs = ((InternalEObject)f4040b0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B0, null, msgs);
			if (newF4040b0 != null)
				msgs = ((InternalEObject)newF4040b0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B0, null, msgs);
			msgs = basicSetF4040b0(newF4040b0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B0, newF4040b0, newF4040b0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b1() {
		return f4040b1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b1(EObject newF4040b1, NotificationChain msgs) {
		EObject oldF4040b1 = f4040b1;
		f4040b1 = newF4040b1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B1, oldF4040b1, newF4040b1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b1(EObject newF4040b1) {
		if (newF4040b1 != f4040b1) {
			NotificationChain msgs = null;
			if (f4040b1 != null)
				msgs = ((InternalEObject)f4040b1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B1, null, msgs);
			if (newF4040b1 != null)
				msgs = ((InternalEObject)newF4040b1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B1, null, msgs);
			msgs = basicSetF4040b1(newF4040b1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B1, newF4040b1, newF4040b1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b2() {
		return f4040b2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b2(EObject newF4040b2, NotificationChain msgs) {
		EObject oldF4040b2 = f4040b2;
		f4040b2 = newF4040b2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B2, oldF4040b2, newF4040b2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b2(EObject newF4040b2) {
		if (newF4040b2 != f4040b2) {
			NotificationChain msgs = null;
			if (f4040b2 != null)
				msgs = ((InternalEObject)f4040b2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B2, null, msgs);
			if (newF4040b2 != null)
				msgs = ((InternalEObject)newF4040b2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B2, null, msgs);
			msgs = basicSetF4040b2(newF4040b2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B2, newF4040b2, newF4040b2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b3() {
		return f4040b3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b3(EObject newF4040b3, NotificationChain msgs) {
		EObject oldF4040b3 = f4040b3;
		f4040b3 = newF4040b3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B3, oldF4040b3, newF4040b3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b3(EObject newF4040b3) {
		if (newF4040b3 != f4040b3) {
			NotificationChain msgs = null;
			if (f4040b3 != null)
				msgs = ((InternalEObject)f4040b3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B3, null, msgs);
			if (newF4040b3 != null)
				msgs = ((InternalEObject)newF4040b3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B3, null, msgs);
			msgs = basicSetF4040b3(newF4040b3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B3, newF4040b3, newF4040b3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b4() {
		return f4040b4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b4(EObject newF4040b4, NotificationChain msgs) {
		EObject oldF4040b4 = f4040b4;
		f4040b4 = newF4040b4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B4, oldF4040b4, newF4040b4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b4(EObject newF4040b4) {
		if (newF4040b4 != f4040b4) {
			NotificationChain msgs = null;
			if (f4040b4 != null)
				msgs = ((InternalEObject)f4040b4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B4, null, msgs);
			if (newF4040b4 != null)
				msgs = ((InternalEObject)newF4040b4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B4, null, msgs);
			msgs = basicSetF4040b4(newF4040b4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B4, newF4040b4, newF4040b4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b5() {
		return f4040b5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b5(EObject newF4040b5, NotificationChain msgs) {
		EObject oldF4040b5 = f4040b5;
		f4040b5 = newF4040b5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B5, oldF4040b5, newF4040b5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b5(EObject newF4040b5) {
		if (newF4040b5 != f4040b5) {
			NotificationChain msgs = null;
			if (f4040b5 != null)
				msgs = ((InternalEObject)f4040b5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B5, null, msgs);
			if (newF4040b5 != null)
				msgs = ((InternalEObject)newF4040b5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B5, null, msgs);
			msgs = basicSetF4040b5(newF4040b5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B5, newF4040b5, newF4040b5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b6() {
		return f4040b6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b6(EObject newF4040b6, NotificationChain msgs) {
		EObject oldF4040b6 = f4040b6;
		f4040b6 = newF4040b6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B6, oldF4040b6, newF4040b6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b6(EObject newF4040b6) {
		if (newF4040b6 != f4040b6) {
			NotificationChain msgs = null;
			if (f4040b6 != null)
				msgs = ((InternalEObject)f4040b6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B6, null, msgs);
			if (newF4040b6 != null)
				msgs = ((InternalEObject)newF4040b6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B6, null, msgs);
			msgs = basicSetF4040b6(newF4040b6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B6, newF4040b6, newF4040b6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b7() {
		return f4040b7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b7(EObject newF4040b7, NotificationChain msgs) {
		EObject oldF4040b7 = f4040b7;
		f4040b7 = newF4040b7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B7, oldF4040b7, newF4040b7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b7(EObject newF4040b7) {
		if (newF4040b7 != f4040b7) {
			NotificationChain msgs = null;
			if (f4040b7 != null)
				msgs = ((InternalEObject)f4040b7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B7, null, msgs);
			if (newF4040b7 != null)
				msgs = ((InternalEObject)newF4040b7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B7, null, msgs);
			msgs = basicSetF4040b7(newF4040b7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B7, newF4040b7, newF4040b7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b8() {
		return f4040b8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b8(EObject newF4040b8, NotificationChain msgs) {
		EObject oldF4040b8 = f4040b8;
		f4040b8 = newF4040b8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B8, oldF4040b8, newF4040b8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b8(EObject newF4040b8) {
		if (newF4040b8 != f4040b8) {
			NotificationChain msgs = null;
			if (f4040b8 != null)
				msgs = ((InternalEObject)f4040b8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B8, null, msgs);
			if (newF4040b8 != null)
				msgs = ((InternalEObject)newF4040b8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B8, null, msgs);
			msgs = basicSetF4040b8(newF4040b8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B8, newF4040b8, newF4040b8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040b9() {
		return f4040b9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040b9(EObject newF4040b9, NotificationChain msgs) {
		EObject oldF4040b9 = f4040b9;
		f4040b9 = newF4040b9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B9, oldF4040b9, newF4040b9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040b9(EObject newF4040b9) {
		if (newF4040b9 != f4040b9) {
			NotificationChain msgs = null;
			if (f4040b9 != null)
				msgs = ((InternalEObject)f4040b9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B9, null, msgs);
			if (newF4040b9 != null)
				msgs = ((InternalEObject)newF4040b9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040B9, null, msgs);
			msgs = basicSetF4040b9(newF4040b9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040B9, newF4040b9, newF4040b9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040ba() {
		return f4040ba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040ba(EObject newF4040ba, NotificationChain msgs) {
		EObject oldF4040ba = f4040ba;
		f4040ba = newF4040ba;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BA, oldF4040ba, newF4040ba);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040ba(EObject newF4040ba) {
		if (newF4040ba != f4040ba) {
			NotificationChain msgs = null;
			if (f4040ba != null)
				msgs = ((InternalEObject)f4040ba).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BA, null, msgs);
			if (newF4040ba != null)
				msgs = ((InternalEObject)newF4040ba).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BA, null, msgs);
			msgs = basicSetF4040ba(newF4040ba, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BA, newF4040ba, newF4040ba));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040bb() {
		return f4040bb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040bb(EObject newF4040bb, NotificationChain msgs) {
		EObject oldF4040bb = f4040bb;
		f4040bb = newF4040bb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BB, oldF4040bb, newF4040bb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040bb(EObject newF4040bb) {
		if (newF4040bb != f4040bb) {
			NotificationChain msgs = null;
			if (f4040bb != null)
				msgs = ((InternalEObject)f4040bb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BB, null, msgs);
			if (newF4040bb != null)
				msgs = ((InternalEObject)newF4040bb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BB, null, msgs);
			msgs = basicSetF4040bb(newF4040bb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BB, newF4040bb, newF4040bb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040bc() {
		return f4040bc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040bc(EObject newF4040bc, NotificationChain msgs) {
		EObject oldF4040bc = f4040bc;
		f4040bc = newF4040bc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BC, oldF4040bc, newF4040bc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040bc(EObject newF4040bc) {
		if (newF4040bc != f4040bc) {
			NotificationChain msgs = null;
			if (f4040bc != null)
				msgs = ((InternalEObject)f4040bc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BC, null, msgs);
			if (newF4040bc != null)
				msgs = ((InternalEObject)newF4040bc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BC, null, msgs);
			msgs = basicSetF4040bc(newF4040bc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BC, newF4040bc, newF4040bc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040bd() {
		return f4040bd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040bd(EObject newF4040bd, NotificationChain msgs) {
		EObject oldF4040bd = f4040bd;
		f4040bd = newF4040bd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BD, oldF4040bd, newF4040bd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040bd(EObject newF4040bd) {
		if (newF4040bd != f4040bd) {
			NotificationChain msgs = null;
			if (f4040bd != null)
				msgs = ((InternalEObject)f4040bd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BD, null, msgs);
			if (newF4040bd != null)
				msgs = ((InternalEObject)newF4040bd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BD, null, msgs);
			msgs = basicSetF4040bd(newF4040bd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BD, newF4040bd, newF4040bd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040be() {
		return f4040be;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040be(EObject newF4040be, NotificationChain msgs) {
		EObject oldF4040be = f4040be;
		f4040be = newF4040be;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BE, oldF4040be, newF4040be);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040be(EObject newF4040be) {
		if (newF4040be != f4040be) {
			NotificationChain msgs = null;
			if (f4040be != null)
				msgs = ((InternalEObject)f4040be).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BE, null, msgs);
			if (newF4040be != null)
				msgs = ((InternalEObject)newF4040be).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BE, null, msgs);
			msgs = basicSetF4040be(newF4040be, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BE, newF4040be, newF4040be));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040bf() {
		return f4040bf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040bf(EObject newF4040bf, NotificationChain msgs) {
		EObject oldF4040bf = f4040bf;
		f4040bf = newF4040bf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BF, oldF4040bf, newF4040bf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040bf(EObject newF4040bf) {
		if (newF4040bf != f4040bf) {
			NotificationChain msgs = null;
			if (f4040bf != null)
				msgs = ((InternalEObject)f4040bf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BF, null, msgs);
			if (newF4040bf != null)
				msgs = ((InternalEObject)newF4040bf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040BF, null, msgs);
			msgs = basicSetF4040bf(newF4040bf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040BF, newF4040bf, newF4040bf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c0() {
		return f4040c0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c0(EObject newF4040c0, NotificationChain msgs) {
		EObject oldF4040c0 = f4040c0;
		f4040c0 = newF4040c0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C0, oldF4040c0, newF4040c0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c0(EObject newF4040c0) {
		if (newF4040c0 != f4040c0) {
			NotificationChain msgs = null;
			if (f4040c0 != null)
				msgs = ((InternalEObject)f4040c0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C0, null, msgs);
			if (newF4040c0 != null)
				msgs = ((InternalEObject)newF4040c0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C0, null, msgs);
			msgs = basicSetF4040c0(newF4040c0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C0, newF4040c0, newF4040c0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c1() {
		return f4040c1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c1(EObject newF4040c1, NotificationChain msgs) {
		EObject oldF4040c1 = f4040c1;
		f4040c1 = newF4040c1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C1, oldF4040c1, newF4040c1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c1(EObject newF4040c1) {
		if (newF4040c1 != f4040c1) {
			NotificationChain msgs = null;
			if (f4040c1 != null)
				msgs = ((InternalEObject)f4040c1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C1, null, msgs);
			if (newF4040c1 != null)
				msgs = ((InternalEObject)newF4040c1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C1, null, msgs);
			msgs = basicSetF4040c1(newF4040c1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C1, newF4040c1, newF4040c1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c2() {
		return f4040c2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c2(EObject newF4040c2, NotificationChain msgs) {
		EObject oldF4040c2 = f4040c2;
		f4040c2 = newF4040c2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C2, oldF4040c2, newF4040c2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c2(EObject newF4040c2) {
		if (newF4040c2 != f4040c2) {
			NotificationChain msgs = null;
			if (f4040c2 != null)
				msgs = ((InternalEObject)f4040c2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C2, null, msgs);
			if (newF4040c2 != null)
				msgs = ((InternalEObject)newF4040c2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C2, null, msgs);
			msgs = basicSetF4040c2(newF4040c2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C2, newF4040c2, newF4040c2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c3() {
		return f4040c3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c3(EObject newF4040c3, NotificationChain msgs) {
		EObject oldF4040c3 = f4040c3;
		f4040c3 = newF4040c3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C3, oldF4040c3, newF4040c3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c3(EObject newF4040c3) {
		if (newF4040c3 != f4040c3) {
			NotificationChain msgs = null;
			if (f4040c3 != null)
				msgs = ((InternalEObject)f4040c3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C3, null, msgs);
			if (newF4040c3 != null)
				msgs = ((InternalEObject)newF4040c3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C3, null, msgs);
			msgs = basicSetF4040c3(newF4040c3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C3, newF4040c3, newF4040c3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c4() {
		return f4040c4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c4(EObject newF4040c4, NotificationChain msgs) {
		EObject oldF4040c4 = f4040c4;
		f4040c4 = newF4040c4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C4, oldF4040c4, newF4040c4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c4(EObject newF4040c4) {
		if (newF4040c4 != f4040c4) {
			NotificationChain msgs = null;
			if (f4040c4 != null)
				msgs = ((InternalEObject)f4040c4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C4, null, msgs);
			if (newF4040c4 != null)
				msgs = ((InternalEObject)newF4040c4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C4, null, msgs);
			msgs = basicSetF4040c4(newF4040c4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C4, newF4040c4, newF4040c4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c5() {
		return f4040c5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c5(EObject newF4040c5, NotificationChain msgs) {
		EObject oldF4040c5 = f4040c5;
		f4040c5 = newF4040c5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C5, oldF4040c5, newF4040c5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c5(EObject newF4040c5) {
		if (newF4040c5 != f4040c5) {
			NotificationChain msgs = null;
			if (f4040c5 != null)
				msgs = ((InternalEObject)f4040c5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C5, null, msgs);
			if (newF4040c5 != null)
				msgs = ((InternalEObject)newF4040c5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C5, null, msgs);
			msgs = basicSetF4040c5(newF4040c5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C5, newF4040c5, newF4040c5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c6() {
		return f4040c6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c6(EObject newF4040c6, NotificationChain msgs) {
		EObject oldF4040c6 = f4040c6;
		f4040c6 = newF4040c6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C6, oldF4040c6, newF4040c6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c6(EObject newF4040c6) {
		if (newF4040c6 != f4040c6) {
			NotificationChain msgs = null;
			if (f4040c6 != null)
				msgs = ((InternalEObject)f4040c6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C6, null, msgs);
			if (newF4040c6 != null)
				msgs = ((InternalEObject)newF4040c6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C6, null, msgs);
			msgs = basicSetF4040c6(newF4040c6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C6, newF4040c6, newF4040c6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c7() {
		return f4040c7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c7(EObject newF4040c7, NotificationChain msgs) {
		EObject oldF4040c7 = f4040c7;
		f4040c7 = newF4040c7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C7, oldF4040c7, newF4040c7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c7(EObject newF4040c7) {
		if (newF4040c7 != f4040c7) {
			NotificationChain msgs = null;
			if (f4040c7 != null)
				msgs = ((InternalEObject)f4040c7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C7, null, msgs);
			if (newF4040c7 != null)
				msgs = ((InternalEObject)newF4040c7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C7, null, msgs);
			msgs = basicSetF4040c7(newF4040c7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C7, newF4040c7, newF4040c7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getF4040c8() {
		return f4040c8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetF4040c8(EObject newF4040c8, NotificationChain msgs) {
		EObject oldF4040c8 = f4040c8;
		f4040c8 = newF4040c8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C8, oldF4040c8, newF4040c8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF4040c8(EObject newF4040c8) {
		if (newF4040c8 != f4040c8) {
			NotificationChain msgs = null;
			if (f4040c8 != null)
				msgs = ((InternalEObject)f4040c8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C8, null, msgs);
			if (newF4040c8 != null)
				msgs = ((InternalEObject)newF4040c8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.ASSIGNMENT_TYPE__F4040C8, null, msgs);
			msgs = basicSetF4040c8(newF4040c8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.ASSIGNMENT_TYPE__F4040C8, newF4040c8, newF4040c8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimephasedDataType> getTimephasedData() {
		if (timephasedData == null) {
			timephasedData = new EObjectContainmentEList<TimephasedDataType>(TimephasedDataType.class, this, MspdiPackage.ASSIGNMENT_TYPE__TIMEPHASED_DATA);
		}
		return timephasedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE:
				return ((InternalEList<?>)getExtendedAttribute()).basicRemove(otherEnd, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__BASELINE:
				return ((InternalEList<?>)getBaseline()).basicRemove(otherEnd, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404000:
				return basicSetF404000(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404001:
				return basicSetF404001(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404002:
				return basicSetF404002(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404003:
				return basicSetF404003(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404004:
				return basicSetF404004(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404005:
				return basicSetF404005(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404006:
				return basicSetF404006(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404007:
				return basicSetF404007(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404008:
				return basicSetF404008(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404009:
				return basicSetF404009(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40400A:
				return basicSetF40400a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40400B:
				return basicSetF40400b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40400C:
				return basicSetF40400c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40400D:
				return basicSetF40400d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40400E:
				return basicSetF40400e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40400F:
				return basicSetF40400f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404010:
				return basicSetF404010(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404011:
				return basicSetF404011(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404012:
				return basicSetF404012(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404013:
				return basicSetF404013(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404014:
				return basicSetF404014(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404015:
				return basicSetF404015(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404016:
				return basicSetF404016(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404017:
				return basicSetF404017(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404018:
				return basicSetF404018(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404019:
				return basicSetF404019(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40401A:
				return basicSetF40401a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40401B:
				return basicSetF40401b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40401C:
				return basicSetF40401c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40401D:
				return basicSetF40401d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40401E:
				return basicSetF40401e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40401F:
				return basicSetF40401f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404020:
				return basicSetF404020(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404021:
				return basicSetF404021(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404022:
				return basicSetF404022(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404023:
				return basicSetF404023(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404024:
				return basicSetF404024(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404025:
				return basicSetF404025(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404026:
				return basicSetF404026(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404027:
				return basicSetF404027(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404028:
				return basicSetF404028(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404029:
				return basicSetF404029(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40402A:
				return basicSetF40402a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40402B:
				return basicSetF40402b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40402C:
				return basicSetF40402c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40402D:
				return basicSetF40402d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40402E:
				return basicSetF40402e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40402F:
				return basicSetF40402f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404030:
				return basicSetF404030(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404031:
				return basicSetF404031(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404032:
				return basicSetF404032(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404033:
				return basicSetF404033(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404034:
				return basicSetF404034(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404035:
				return basicSetF404035(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404036:
				return basicSetF404036(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404037:
				return basicSetF404037(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404038:
				return basicSetF404038(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404039:
				return basicSetF404039(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40403A:
				return basicSetF40403a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40403B:
				return basicSetF40403b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40403C:
				return basicSetF40403c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40403D:
				return basicSetF40403d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40403E:
				return basicSetF40403e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40403F:
				return basicSetF40403f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404040:
				return basicSetF404040(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404041:
				return basicSetF404041(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404042:
				return basicSetF404042(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404043:
				return basicSetF404043(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404044:
				return basicSetF404044(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404045:
				return basicSetF404045(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404046:
				return basicSetF404046(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404047:
				return basicSetF404047(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404048:
				return basicSetF404048(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404049:
				return basicSetF404049(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40404A:
				return basicSetF40404a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40404B:
				return basicSetF40404b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40404C:
				return basicSetF40404c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40404D:
				return basicSetF40404d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40404E:
				return basicSetF40404e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40404F:
				return basicSetF40404f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404050:
				return basicSetF404050(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404051:
				return basicSetF404051(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404052:
				return basicSetF404052(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404053:
				return basicSetF404053(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404054:
				return basicSetF404054(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404055:
				return basicSetF404055(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404056:
				return basicSetF404056(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404057:
				return basicSetF404057(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404058:
				return basicSetF404058(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404059:
				return basicSetF404059(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40405A:
				return basicSetF40405a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40405B:
				return basicSetF40405b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40405C:
				return basicSetF40405c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40405D:
				return basicSetF40405d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40405E:
				return basicSetF40405e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40405F:
				return basicSetF40405f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404060:
				return basicSetF404060(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404061:
				return basicSetF404061(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404062:
				return basicSetF404062(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404063:
				return basicSetF404063(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404064:
				return basicSetF404064(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404065:
				return basicSetF404065(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404066:
				return basicSetF404066(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404067:
				return basicSetF404067(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404068:
				return basicSetF404068(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404069:
				return basicSetF404069(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40406A:
				return basicSetF40406a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40406B:
				return basicSetF40406b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40406C:
				return basicSetF40406c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40406D:
				return basicSetF40406d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40406E:
				return basicSetF40406e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40406F:
				return basicSetF40406f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404070:
				return basicSetF404070(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404071:
				return basicSetF404071(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404072:
				return basicSetF404072(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404073:
				return basicSetF404073(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404074:
				return basicSetF404074(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404075:
				return basicSetF404075(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404076:
				return basicSetF404076(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404077:
				return basicSetF404077(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404078:
				return basicSetF404078(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404079:
				return basicSetF404079(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40407A:
				return basicSetF40407a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40407B:
				return basicSetF40407b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40407C:
				return basicSetF40407c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40407D:
				return basicSetF40407d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40407E:
				return basicSetF40407e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40407F:
				return basicSetF40407f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404080:
				return basicSetF404080(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404081:
				return basicSetF404081(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404082:
				return basicSetF404082(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404083:
				return basicSetF404083(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404084:
				return basicSetF404084(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404085:
				return basicSetF404085(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404086:
				return basicSetF404086(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404087:
				return basicSetF404087(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404088:
				return basicSetF404088(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404089:
				return basicSetF404089(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40408A:
				return basicSetF40408a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40408B:
				return basicSetF40408b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40408C:
				return basicSetF40408c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40408D:
				return basicSetF40408d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40408E:
				return basicSetF40408e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40408F:
				return basicSetF40408f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404090:
				return basicSetF404090(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404091:
				return basicSetF404091(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404092:
				return basicSetF404092(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404093:
				return basicSetF404093(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404094:
				return basicSetF404094(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404095:
				return basicSetF404095(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404096:
				return basicSetF404096(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404097:
				return basicSetF404097(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404098:
				return basicSetF404098(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F404099:
				return basicSetF404099(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40409A:
				return basicSetF40409a(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40409B:
				return basicSetF40409b(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40409C:
				return basicSetF40409c(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40409D:
				return basicSetF40409d(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40409E:
				return basicSetF40409e(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F40409F:
				return basicSetF40409f(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A0:
				return basicSetF4040a0(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A1:
				return basicSetF4040a1(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A2:
				return basicSetF4040a2(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A3:
				return basicSetF4040a3(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A4:
				return basicSetF4040a4(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A5:
				return basicSetF4040a5(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A6:
				return basicSetF4040a6(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A7:
				return basicSetF4040a7(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A8:
				return basicSetF4040a8(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A9:
				return basicSetF4040a9(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AA:
				return basicSetF4040aa(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AB:
				return basicSetF4040ab(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AC:
				return basicSetF4040ac(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AD:
				return basicSetF4040ad(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AE:
				return basicSetF4040ae(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AF:
				return basicSetF4040af(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B0:
				return basicSetF4040b0(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B1:
				return basicSetF4040b1(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B2:
				return basicSetF4040b2(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B3:
				return basicSetF4040b3(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B4:
				return basicSetF4040b4(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B5:
				return basicSetF4040b5(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B6:
				return basicSetF4040b6(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B7:
				return basicSetF4040b7(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B8:
				return basicSetF4040b8(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B9:
				return basicSetF4040b9(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BA:
				return basicSetF4040ba(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BB:
				return basicSetF4040bb(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BC:
				return basicSetF4040bc(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BD:
				return basicSetF4040bd(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BE:
				return basicSetF4040be(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BF:
				return basicSetF4040bf(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C0:
				return basicSetF4040c0(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C1:
				return basicSetF4040c1(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C2:
				return basicSetF4040c2(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C3:
				return basicSetF4040c3(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C4:
				return basicSetF4040c4(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C5:
				return basicSetF4040c5(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C6:
				return basicSetF4040c6(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C7:
				return basicSetF4040c7(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C8:
				return basicSetF4040c8(null, msgs);
			case MspdiPackage.ASSIGNMENT_TYPE__TIMEPHASED_DATA:
				return ((InternalEList<?>)getTimephasedData()).basicRemove(otherEnd, msgs);
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
			case MspdiPackage.ASSIGNMENT_TYPE__UID:
				return getUID();
			case MspdiPackage.ASSIGNMENT_TYPE__TASK_UID:
				return getTaskUID();
			case MspdiPackage.ASSIGNMENT_TYPE__RESOURCE_UID:
				return getResourceUID();
			case MspdiPackage.ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE:
				return getPercentWorkComplete();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_COST:
				return getActualCost();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_FINISH:
				return getActualFinish();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST:
				return getActualOvertimeCost();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK:
				return getActualOvertimeWork();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_START:
				return getActualStart();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK:
				return getActualWork();
			case MspdiPackage.ASSIGNMENT_TYPE__ACWP:
				return getACWP();
			case MspdiPackage.ASSIGNMENT_TYPE__CONFIRMED:
				return isConfirmed();
			case MspdiPackage.ASSIGNMENT_TYPE__COST:
				return getCost();
			case MspdiPackage.ASSIGNMENT_TYPE__COST_RATE_TABLE:
				return getCostRateTable();
			case MspdiPackage.ASSIGNMENT_TYPE__COST_VARIANCE:
				return getCostVariance();
			case MspdiPackage.ASSIGNMENT_TYPE__CV:
				return getCV();
			case MspdiPackage.ASSIGNMENT_TYPE__DELAY:
				return getDelay();
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH:
				return getFinish();
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH_VARIANCE:
				return getFinishVariance();
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK:
				return getHyperlink();
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_ADDRESS:
				return getHyperlinkAddress();
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS:
				return getHyperlinkSubAddress();
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_VARIANCE:
				return getWorkVariance();
			case MspdiPackage.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS:
				return isHasFixedRateUnits();
			case MspdiPackage.ASSIGNMENT_TYPE__FIXED_MATERIAL:
				return isFixedMaterial();
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY:
				return getLevelingDelay();
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT:
				return getLevelingDelayFormat();
			case MspdiPackage.ASSIGNMENT_TYPE__LINKED_FIELDS:
				return isLinkedFields();
			case MspdiPackage.ASSIGNMENT_TYPE__MILESTONE:
				return isMilestone();
			case MspdiPackage.ASSIGNMENT_TYPE__NOTES:
				return getNotes();
			case MspdiPackage.ASSIGNMENT_TYPE__OVERALLOCATED:
				return isOverallocated();
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_COST:
				return getOvertimeCost();
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_WORK:
				return getOvertimeWork();
			case MspdiPackage.ASSIGNMENT_TYPE__PEAK_UNITS:
				return getPeakUnits();
			case MspdiPackage.ASSIGNMENT_TYPE__REGULAR_WORK:
				return getRegularWork();
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_COST:
				return getRemainingCost();
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST:
				return getRemainingOvertimeCost();
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK:
				return getRemainingOvertimeWork();
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_WORK:
				return getRemainingWork();
			case MspdiPackage.ASSIGNMENT_TYPE__RESPONSE_PENDING:
				return isResponsePending();
			case MspdiPackage.ASSIGNMENT_TYPE__START:
				return getStart();
			case MspdiPackage.ASSIGNMENT_TYPE__STOP:
				return getStop();
			case MspdiPackage.ASSIGNMENT_TYPE__RESUME:
				return getResume();
			case MspdiPackage.ASSIGNMENT_TYPE__START_VARIANCE:
				return getStartVariance();
			case MspdiPackage.ASSIGNMENT_TYPE__SUMMARY:
				return isSummary();
			case MspdiPackage.ASSIGNMENT_TYPE__SV:
				return getSV();
			case MspdiPackage.ASSIGNMENT_TYPE__UNITS:
				return getUnits();
			case MspdiPackage.ASSIGNMENT_TYPE__UPDATE_NEEDED:
				return isUpdateNeeded();
			case MspdiPackage.ASSIGNMENT_TYPE__VAC:
				return getVAC();
			case MspdiPackage.ASSIGNMENT_TYPE__WORK:
				return getWork();
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_CONTOUR:
				return getWorkContour();
			case MspdiPackage.ASSIGNMENT_TYPE__BCWS:
				return getBCWS();
			case MspdiPackage.ASSIGNMENT_TYPE__BCWP:
				return getBCWP();
			case MspdiPackage.ASSIGNMENT_TYPE__BOOKING_TYPE:
				return getBookingType();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED:
				return getActualWorkProtected();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				return getActualOvertimeWorkProtected();
			case MspdiPackage.ASSIGNMENT_TYPE__CREATION_DATE:
				return getCreationDate();
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER:
				return getAssnOwner();
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER_GUID:
				return getAssnOwnerGuid();
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_COST:
				return getBudgetCost();
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_WORK:
				return getBudgetWork();
			case MspdiPackage.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE:
				return getExtendedAttribute();
			case MspdiPackage.ASSIGNMENT_TYPE__BASELINE:
				return getBaseline();
			case MspdiPackage.ASSIGNMENT_TYPE__F404000:
				return getF404000();
			case MspdiPackage.ASSIGNMENT_TYPE__F404001:
				return getF404001();
			case MspdiPackage.ASSIGNMENT_TYPE__F404002:
				return getF404002();
			case MspdiPackage.ASSIGNMENT_TYPE__F404003:
				return getF404003();
			case MspdiPackage.ASSIGNMENT_TYPE__F404004:
				return getF404004();
			case MspdiPackage.ASSIGNMENT_TYPE__F404005:
				return getF404005();
			case MspdiPackage.ASSIGNMENT_TYPE__F404006:
				return getF404006();
			case MspdiPackage.ASSIGNMENT_TYPE__F404007:
				return getF404007();
			case MspdiPackage.ASSIGNMENT_TYPE__F404008:
				return getF404008();
			case MspdiPackage.ASSIGNMENT_TYPE__F404009:
				return getF404009();
			case MspdiPackage.ASSIGNMENT_TYPE__F40400A:
				return getF40400a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40400B:
				return getF40400b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40400C:
				return getF40400c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40400D:
				return getF40400d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40400E:
				return getF40400e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40400F:
				return getF40400f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404010:
				return getF404010();
			case MspdiPackage.ASSIGNMENT_TYPE__F404011:
				return getF404011();
			case MspdiPackage.ASSIGNMENT_TYPE__F404012:
				return getF404012();
			case MspdiPackage.ASSIGNMENT_TYPE__F404013:
				return getF404013();
			case MspdiPackage.ASSIGNMENT_TYPE__F404014:
				return getF404014();
			case MspdiPackage.ASSIGNMENT_TYPE__F404015:
				return getF404015();
			case MspdiPackage.ASSIGNMENT_TYPE__F404016:
				return getF404016();
			case MspdiPackage.ASSIGNMENT_TYPE__F404017:
				return getF404017();
			case MspdiPackage.ASSIGNMENT_TYPE__F404018:
				return getF404018();
			case MspdiPackage.ASSIGNMENT_TYPE__F404019:
				return getF404019();
			case MspdiPackage.ASSIGNMENT_TYPE__F40401A:
				return getF40401a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40401B:
				return getF40401b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40401C:
				return getF40401c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40401D:
				return getF40401d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40401E:
				return getF40401e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40401F:
				return getF40401f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404020:
				return getF404020();
			case MspdiPackage.ASSIGNMENT_TYPE__F404021:
				return getF404021();
			case MspdiPackage.ASSIGNMENT_TYPE__F404022:
				return getF404022();
			case MspdiPackage.ASSIGNMENT_TYPE__F404023:
				return getF404023();
			case MspdiPackage.ASSIGNMENT_TYPE__F404024:
				return getF404024();
			case MspdiPackage.ASSIGNMENT_TYPE__F404025:
				return getF404025();
			case MspdiPackage.ASSIGNMENT_TYPE__F404026:
				return getF404026();
			case MspdiPackage.ASSIGNMENT_TYPE__F404027:
				return getF404027();
			case MspdiPackage.ASSIGNMENT_TYPE__F404028:
				return getF404028();
			case MspdiPackage.ASSIGNMENT_TYPE__F404029:
				return getF404029();
			case MspdiPackage.ASSIGNMENT_TYPE__F40402A:
				return getF40402a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40402B:
				return getF40402b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40402C:
				return getF40402c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40402D:
				return getF40402d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40402E:
				return getF40402e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40402F:
				return getF40402f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404030:
				return getF404030();
			case MspdiPackage.ASSIGNMENT_TYPE__F404031:
				return getF404031();
			case MspdiPackage.ASSIGNMENT_TYPE__F404032:
				return getF404032();
			case MspdiPackage.ASSIGNMENT_TYPE__F404033:
				return getF404033();
			case MspdiPackage.ASSIGNMENT_TYPE__F404034:
				return getF404034();
			case MspdiPackage.ASSIGNMENT_TYPE__F404035:
				return getF404035();
			case MspdiPackage.ASSIGNMENT_TYPE__F404036:
				return getF404036();
			case MspdiPackage.ASSIGNMENT_TYPE__F404037:
				return getF404037();
			case MspdiPackage.ASSIGNMENT_TYPE__F404038:
				return getF404038();
			case MspdiPackage.ASSIGNMENT_TYPE__F404039:
				return getF404039();
			case MspdiPackage.ASSIGNMENT_TYPE__F40403A:
				return getF40403a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40403B:
				return getF40403b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40403C:
				return getF40403c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40403D:
				return getF40403d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40403E:
				return getF40403e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40403F:
				return getF40403f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404040:
				return getF404040();
			case MspdiPackage.ASSIGNMENT_TYPE__F404041:
				return getF404041();
			case MspdiPackage.ASSIGNMENT_TYPE__F404042:
				return getF404042();
			case MspdiPackage.ASSIGNMENT_TYPE__F404043:
				return getF404043();
			case MspdiPackage.ASSIGNMENT_TYPE__F404044:
				return getF404044();
			case MspdiPackage.ASSIGNMENT_TYPE__F404045:
				return getF404045();
			case MspdiPackage.ASSIGNMENT_TYPE__F404046:
				return getF404046();
			case MspdiPackage.ASSIGNMENT_TYPE__F404047:
				return getF404047();
			case MspdiPackage.ASSIGNMENT_TYPE__F404048:
				return getF404048();
			case MspdiPackage.ASSIGNMENT_TYPE__F404049:
				return getF404049();
			case MspdiPackage.ASSIGNMENT_TYPE__F40404A:
				return getF40404a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40404B:
				return getF40404b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40404C:
				return getF40404c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40404D:
				return getF40404d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40404E:
				return getF40404e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40404F:
				return getF40404f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404050:
				return getF404050();
			case MspdiPackage.ASSIGNMENT_TYPE__F404051:
				return getF404051();
			case MspdiPackage.ASSIGNMENT_TYPE__F404052:
				return getF404052();
			case MspdiPackage.ASSIGNMENT_TYPE__F404053:
				return getF404053();
			case MspdiPackage.ASSIGNMENT_TYPE__F404054:
				return getF404054();
			case MspdiPackage.ASSIGNMENT_TYPE__F404055:
				return getF404055();
			case MspdiPackage.ASSIGNMENT_TYPE__F404056:
				return getF404056();
			case MspdiPackage.ASSIGNMENT_TYPE__F404057:
				return getF404057();
			case MspdiPackage.ASSIGNMENT_TYPE__F404058:
				return getF404058();
			case MspdiPackage.ASSIGNMENT_TYPE__F404059:
				return getF404059();
			case MspdiPackage.ASSIGNMENT_TYPE__F40405A:
				return getF40405a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40405B:
				return getF40405b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40405C:
				return getF40405c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40405D:
				return getF40405d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40405E:
				return getF40405e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40405F:
				return getF40405f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404060:
				return getF404060();
			case MspdiPackage.ASSIGNMENT_TYPE__F404061:
				return getF404061();
			case MspdiPackage.ASSIGNMENT_TYPE__F404062:
				return getF404062();
			case MspdiPackage.ASSIGNMENT_TYPE__F404063:
				return getF404063();
			case MspdiPackage.ASSIGNMENT_TYPE__F404064:
				return getF404064();
			case MspdiPackage.ASSIGNMENT_TYPE__F404065:
				return getF404065();
			case MspdiPackage.ASSIGNMENT_TYPE__F404066:
				return getF404066();
			case MspdiPackage.ASSIGNMENT_TYPE__F404067:
				return getF404067();
			case MspdiPackage.ASSIGNMENT_TYPE__F404068:
				return getF404068();
			case MspdiPackage.ASSIGNMENT_TYPE__F404069:
				return getF404069();
			case MspdiPackage.ASSIGNMENT_TYPE__F40406A:
				return getF40406a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40406B:
				return getF40406b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40406C:
				return getF40406c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40406D:
				return getF40406d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40406E:
				return getF40406e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40406F:
				return getF40406f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404070:
				return getF404070();
			case MspdiPackage.ASSIGNMENT_TYPE__F404071:
				return getF404071();
			case MspdiPackage.ASSIGNMENT_TYPE__F404072:
				return getF404072();
			case MspdiPackage.ASSIGNMENT_TYPE__F404073:
				return getF404073();
			case MspdiPackage.ASSIGNMENT_TYPE__F404074:
				return getF404074();
			case MspdiPackage.ASSIGNMENT_TYPE__F404075:
				return getF404075();
			case MspdiPackage.ASSIGNMENT_TYPE__F404076:
				return getF404076();
			case MspdiPackage.ASSIGNMENT_TYPE__F404077:
				return getF404077();
			case MspdiPackage.ASSIGNMENT_TYPE__F404078:
				return getF404078();
			case MspdiPackage.ASSIGNMENT_TYPE__F404079:
				return getF404079();
			case MspdiPackage.ASSIGNMENT_TYPE__F40407A:
				return getF40407a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40407B:
				return getF40407b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40407C:
				return getF40407c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40407D:
				return getF40407d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40407E:
				return getF40407e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40407F:
				return getF40407f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404080:
				return getF404080();
			case MspdiPackage.ASSIGNMENT_TYPE__F404081:
				return getF404081();
			case MspdiPackage.ASSIGNMENT_TYPE__F404082:
				return getF404082();
			case MspdiPackage.ASSIGNMENT_TYPE__F404083:
				return getF404083();
			case MspdiPackage.ASSIGNMENT_TYPE__F404084:
				return getF404084();
			case MspdiPackage.ASSIGNMENT_TYPE__F404085:
				return getF404085();
			case MspdiPackage.ASSIGNMENT_TYPE__F404086:
				return getF404086();
			case MspdiPackage.ASSIGNMENT_TYPE__F404087:
				return getF404087();
			case MspdiPackage.ASSIGNMENT_TYPE__F404088:
				return getF404088();
			case MspdiPackage.ASSIGNMENT_TYPE__F404089:
				return getF404089();
			case MspdiPackage.ASSIGNMENT_TYPE__F40408A:
				return getF40408a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40408B:
				return getF40408b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40408C:
				return getF40408c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40408D:
				return getF40408d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40408E:
				return getF40408e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40408F:
				return getF40408f();
			case MspdiPackage.ASSIGNMENT_TYPE__F404090:
				return getF404090();
			case MspdiPackage.ASSIGNMENT_TYPE__F404091:
				return getF404091();
			case MspdiPackage.ASSIGNMENT_TYPE__F404092:
				return getF404092();
			case MspdiPackage.ASSIGNMENT_TYPE__F404093:
				return getF404093();
			case MspdiPackage.ASSIGNMENT_TYPE__F404094:
				return getF404094();
			case MspdiPackage.ASSIGNMENT_TYPE__F404095:
				return getF404095();
			case MspdiPackage.ASSIGNMENT_TYPE__F404096:
				return getF404096();
			case MspdiPackage.ASSIGNMENT_TYPE__F404097:
				return getF404097();
			case MspdiPackage.ASSIGNMENT_TYPE__F404098:
				return getF404098();
			case MspdiPackage.ASSIGNMENT_TYPE__F404099:
				return getF404099();
			case MspdiPackage.ASSIGNMENT_TYPE__F40409A:
				return getF40409a();
			case MspdiPackage.ASSIGNMENT_TYPE__F40409B:
				return getF40409b();
			case MspdiPackage.ASSIGNMENT_TYPE__F40409C:
				return getF40409c();
			case MspdiPackage.ASSIGNMENT_TYPE__F40409D:
				return getF40409d();
			case MspdiPackage.ASSIGNMENT_TYPE__F40409E:
				return getF40409e();
			case MspdiPackage.ASSIGNMENT_TYPE__F40409F:
				return getF40409f();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A0:
				return getF4040a0();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A1:
				return getF4040a1();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A2:
				return getF4040a2();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A3:
				return getF4040a3();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A4:
				return getF4040a4();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A5:
				return getF4040a5();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A6:
				return getF4040a6();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A7:
				return getF4040a7();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A8:
				return getF4040a8();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A9:
				return getF4040a9();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AA:
				return getF4040aa();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AB:
				return getF4040ab();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AC:
				return getF4040ac();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AD:
				return getF4040ad();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AE:
				return getF4040ae();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AF:
				return getF4040af();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B0:
				return getF4040b0();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B1:
				return getF4040b1();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B2:
				return getF4040b2();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B3:
				return getF4040b3();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B4:
				return getF4040b4();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B5:
				return getF4040b5();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B6:
				return getF4040b6();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B7:
				return getF4040b7();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B8:
				return getF4040b8();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B9:
				return getF4040b9();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BA:
				return getF4040ba();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BB:
				return getF4040bb();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BC:
				return getF4040bc();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BD:
				return getF4040bd();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BE:
				return getF4040be();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BF:
				return getF4040bf();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C0:
				return getF4040c0();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C1:
				return getF4040c1();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C2:
				return getF4040c2();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C3:
				return getF4040c3();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C4:
				return getF4040c4();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C5:
				return getF4040c5();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C6:
				return getF4040c6();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C7:
				return getF4040c7();
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C8:
				return getF4040c8();
			case MspdiPackage.ASSIGNMENT_TYPE__TIMEPHASED_DATA:
				return getTimephasedData();
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
			case MspdiPackage.ASSIGNMENT_TYPE__UID:
				setUID((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__TASK_UID:
				setTaskUID((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__RESOURCE_UID:
				setResourceUID((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE:
				setPercentWorkComplete((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_COST:
				setActualCost((BigDecimal)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_FINISH:
				setActualFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST:
				setActualOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK:
				setActualOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_START:
				setActualStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK:
				setActualWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACWP:
				setACWP((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__CONFIRMED:
				setConfirmed((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__COST:
				setCost((BigDecimal)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__COST_RATE_TABLE:
				setCostRateTable((CostRateTableType)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__COST_VARIANCE:
				setCostVariance((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__CV:
				setCV((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__DELAY:
				setDelay((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH:
				setFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH_VARIANCE:
				setFinishVariance((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK:
				setHyperlink((String)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_ADDRESS:
				setHyperlinkAddress((String)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS:
				setHyperlinkSubAddress((String)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_VARIANCE:
				setWorkVariance((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS:
				setHasFixedRateUnits((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__FIXED_MATERIAL:
				setFixedMaterial((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY:
				setLevelingDelay((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT:
				setLevelingDelayFormat((LevelingDelayFormatType)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__LINKED_FIELDS:
				setLinkedFields((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__MILESTONE:
				setMilestone((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__NOTES:
				setNotes((String)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__OVERALLOCATED:
				setOverallocated((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_COST:
				setOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_WORK:
				setOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__PEAK_UNITS:
				setPeakUnits((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REGULAR_WORK:
				setRegularWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_COST:
				setRemainingCost((BigDecimal)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST:
				setRemainingOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK:
				setRemainingOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_WORK:
				setRemainingWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__RESPONSE_PENDING:
				setResponsePending((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__STOP:
				setStop((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__RESUME:
				setResume((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__START_VARIANCE:
				setStartVariance((BigInteger)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__SUMMARY:
				setSummary((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__SV:
				setSV((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__UNITS:
				setUnits((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__UPDATE_NEEDED:
				setUpdateNeeded((Boolean)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__VAC:
				setVAC((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__WORK:
				setWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_CONTOUR:
				setWorkContour((WorkContourType)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BCWS:
				setBCWS((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BCWP:
				setBCWP((Float)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BOOKING_TYPE:
				setBookingType((BookingTypeType)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED:
				setActualWorkProtected((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				setActualOvertimeWorkProtected((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER:
				setAssnOwner((String)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER_GUID:
				setAssnOwnerGuid((String)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_COST:
				setBudgetCost((BigDecimal)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_WORK:
				setBudgetWork((Duration)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE:
				getExtendedAttribute().clear();
				getExtendedAttribute().addAll((Collection<? extends ExtendedAttributeType>)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BASELINE:
				getBaseline().clear();
				getBaseline().addAll((Collection<? extends BaselineType>)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404000:
				setF404000((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404001:
				setF404001((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404002:
				setF404002((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404003:
				setF404003((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404004:
				setF404004((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404005:
				setF404005((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404006:
				setF404006((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404007:
				setF404007((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404008:
				setF404008((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404009:
				setF404009((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400A:
				setF40400a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400B:
				setF40400b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400C:
				setF40400c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400D:
				setF40400d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400E:
				setF40400e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400F:
				setF40400f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404010:
				setF404010((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404011:
				setF404011((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404012:
				setF404012((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404013:
				setF404013((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404014:
				setF404014((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404015:
				setF404015((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404016:
				setF404016((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404017:
				setF404017((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404018:
				setF404018((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404019:
				setF404019((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401A:
				setF40401a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401B:
				setF40401b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401C:
				setF40401c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401D:
				setF40401d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401E:
				setF40401e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401F:
				setF40401f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404020:
				setF404020((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404021:
				setF404021((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404022:
				setF404022((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404023:
				setF404023((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404024:
				setF404024((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404025:
				setF404025((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404026:
				setF404026((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404027:
				setF404027((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404028:
				setF404028((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404029:
				setF404029((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402A:
				setF40402a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402B:
				setF40402b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402C:
				setF40402c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402D:
				setF40402d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402E:
				setF40402e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402F:
				setF40402f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404030:
				setF404030((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404031:
				setF404031((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404032:
				setF404032((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404033:
				setF404033((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404034:
				setF404034((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404035:
				setF404035((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404036:
				setF404036((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404037:
				setF404037((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404038:
				setF404038((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404039:
				setF404039((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403A:
				setF40403a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403B:
				setF40403b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403C:
				setF40403c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403D:
				setF40403d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403E:
				setF40403e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403F:
				setF40403f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404040:
				setF404040((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404041:
				setF404041((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404042:
				setF404042((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404043:
				setF404043((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404044:
				setF404044((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404045:
				setF404045((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404046:
				setF404046((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404047:
				setF404047((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404048:
				setF404048((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404049:
				setF404049((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404A:
				setF40404a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404B:
				setF40404b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404C:
				setF40404c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404D:
				setF40404d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404E:
				setF40404e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404F:
				setF40404f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404050:
				setF404050((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404051:
				setF404051((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404052:
				setF404052((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404053:
				setF404053((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404054:
				setF404054((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404055:
				setF404055((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404056:
				setF404056((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404057:
				setF404057((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404058:
				setF404058((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404059:
				setF404059((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405A:
				setF40405a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405B:
				setF40405b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405C:
				setF40405c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405D:
				setF40405d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405E:
				setF40405e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405F:
				setF40405f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404060:
				setF404060((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404061:
				setF404061((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404062:
				setF404062((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404063:
				setF404063((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404064:
				setF404064((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404065:
				setF404065((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404066:
				setF404066((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404067:
				setF404067((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404068:
				setF404068((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404069:
				setF404069((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406A:
				setF40406a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406B:
				setF40406b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406C:
				setF40406c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406D:
				setF40406d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406E:
				setF40406e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406F:
				setF40406f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404070:
				setF404070((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404071:
				setF404071((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404072:
				setF404072((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404073:
				setF404073((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404074:
				setF404074((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404075:
				setF404075((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404076:
				setF404076((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404077:
				setF404077((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404078:
				setF404078((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404079:
				setF404079((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407A:
				setF40407a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407B:
				setF40407b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407C:
				setF40407c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407D:
				setF40407d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407E:
				setF40407e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407F:
				setF40407f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404080:
				setF404080((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404081:
				setF404081((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404082:
				setF404082((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404083:
				setF404083((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404084:
				setF404084((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404085:
				setF404085((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404086:
				setF404086((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404087:
				setF404087((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404088:
				setF404088((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404089:
				setF404089((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408A:
				setF40408a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408B:
				setF40408b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408C:
				setF40408c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408D:
				setF40408d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408E:
				setF40408e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408F:
				setF40408f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404090:
				setF404090((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404091:
				setF404091((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404092:
				setF404092((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404093:
				setF404093((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404094:
				setF404094((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404095:
				setF404095((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404096:
				setF404096((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404097:
				setF404097((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404098:
				setF404098((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404099:
				setF404099((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409A:
				setF40409a((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409B:
				setF40409b((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409C:
				setF40409c((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409D:
				setF40409d((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409E:
				setF40409e((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409F:
				setF40409f((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A0:
				setF4040a0((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A1:
				setF4040a1((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A2:
				setF4040a2((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A3:
				setF4040a3((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A4:
				setF4040a4((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A5:
				setF4040a5((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A6:
				setF4040a6((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A7:
				setF4040a7((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A8:
				setF4040a8((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A9:
				setF4040a9((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AA:
				setF4040aa((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AB:
				setF4040ab((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AC:
				setF4040ac((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AD:
				setF4040ad((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AE:
				setF4040ae((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AF:
				setF4040af((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B0:
				setF4040b0((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B1:
				setF4040b1((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B2:
				setF4040b2((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B3:
				setF4040b3((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B4:
				setF4040b4((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B5:
				setF4040b5((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B6:
				setF4040b6((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B7:
				setF4040b7((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B8:
				setF4040b8((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B9:
				setF4040b9((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BA:
				setF4040ba((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BB:
				setF4040bb((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BC:
				setF4040bc((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BD:
				setF4040bd((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BE:
				setF4040be((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BF:
				setF4040bf((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C0:
				setF4040c0((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C1:
				setF4040c1((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C2:
				setF4040c2((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C3:
				setF4040c3((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C4:
				setF4040c4((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C5:
				setF4040c5((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C6:
				setF4040c6((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C7:
				setF4040c7((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C8:
				setF4040c8((EObject)newValue);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__TIMEPHASED_DATA:
				getTimephasedData().clear();
				getTimephasedData().addAll((Collection<? extends TimephasedDataType>)newValue);
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
			case MspdiPackage.ASSIGNMENT_TYPE__UID:
				setUID(UID_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__TASK_UID:
				setTaskUID(TASK_UID_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__RESOURCE_UID:
				setResourceUID(RESOURCE_UID_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE:
				setPercentWorkComplete(PERCENT_WORK_COMPLETE_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_COST:
				setActualCost(ACTUAL_COST_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_FINISH:
				setActualFinish(ACTUAL_FINISH_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST:
				setActualOvertimeCost(ACTUAL_OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK:
				setActualOvertimeWork(ACTUAL_OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_START:
				setActualStart(ACTUAL_START_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK:
				setActualWork(ACTUAL_WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACWP:
				unsetACWP();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__CONFIRMED:
				unsetConfirmed();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__COST:
				setCost(COST_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__COST_RATE_TABLE:
				unsetCostRateTable();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__COST_VARIANCE:
				unsetCostVariance();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__CV:
				unsetCV();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH:
				setFinish(FINISH_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH_VARIANCE:
				setFinishVariance(FINISH_VARIANCE_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK:
				setHyperlink(HYPERLINK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_ADDRESS:
				setHyperlinkAddress(HYPERLINK_ADDRESS_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS:
				setHyperlinkSubAddress(HYPERLINK_SUB_ADDRESS_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_VARIANCE:
				unsetWorkVariance();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS:
				unsetHasFixedRateUnits();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__FIXED_MATERIAL:
				unsetFixedMaterial();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY:
				setLevelingDelay(LEVELING_DELAY_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT:
				unsetLevelingDelayFormat();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__LINKED_FIELDS:
				unsetLinkedFields();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__MILESTONE:
				unsetMilestone();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__OVERALLOCATED:
				unsetOverallocated();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_COST:
				setOvertimeCost(OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_WORK:
				setOvertimeWork(OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__PEAK_UNITS:
				unsetPeakUnits();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REGULAR_WORK:
				setRegularWork(REGULAR_WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_COST:
				setRemainingCost(REMAINING_COST_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST:
				setRemainingOvertimeCost(REMAINING_OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK:
				setRemainingOvertimeWork(REMAINING_OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_WORK:
				setRemainingWork(REMAINING_WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__RESPONSE_PENDING:
				unsetResponsePending();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__START:
				setStart(START_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__STOP:
				setStop(STOP_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__RESUME:
				setResume(RESUME_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__START_VARIANCE:
				setStartVariance(START_VARIANCE_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__SUMMARY:
				unsetSummary();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__SV:
				unsetSV();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__UNITS:
				unsetUnits();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__UPDATE_NEEDED:
				unsetUpdateNeeded();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__VAC:
				unsetVAC();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__WORK:
				setWork(WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_CONTOUR:
				unsetWorkContour();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BCWS:
				unsetBCWS();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BCWP:
				unsetBCWP();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BOOKING_TYPE:
				unsetBookingType();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED:
				setActualWorkProtected(ACTUAL_WORK_PROTECTED_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				setActualOvertimeWorkProtected(ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER:
				setAssnOwner(ASSN_OWNER_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER_GUID:
				setAssnOwnerGuid(ASSN_OWNER_GUID_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_COST:
				setBudgetCost(BUDGET_COST_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_WORK:
				setBudgetWork(BUDGET_WORK_EDEFAULT);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE:
				getExtendedAttribute().clear();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__BASELINE:
				getBaseline().clear();
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404000:
				setF404000((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404001:
				setF404001((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404002:
				setF404002((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404003:
				setF404003((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404004:
				setF404004((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404005:
				setF404005((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404006:
				setF404006((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404007:
				setF404007((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404008:
				setF404008((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404009:
				setF404009((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400A:
				setF40400a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400B:
				setF40400b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400C:
				setF40400c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400D:
				setF40400d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400E:
				setF40400e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400F:
				setF40400f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404010:
				setF404010((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404011:
				setF404011((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404012:
				setF404012((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404013:
				setF404013((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404014:
				setF404014((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404015:
				setF404015((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404016:
				setF404016((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404017:
				setF404017((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404018:
				setF404018((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404019:
				setF404019((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401A:
				setF40401a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401B:
				setF40401b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401C:
				setF40401c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401D:
				setF40401d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401E:
				setF40401e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401F:
				setF40401f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404020:
				setF404020((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404021:
				setF404021((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404022:
				setF404022((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404023:
				setF404023((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404024:
				setF404024((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404025:
				setF404025((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404026:
				setF404026((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404027:
				setF404027((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404028:
				setF404028((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404029:
				setF404029((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402A:
				setF40402a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402B:
				setF40402b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402C:
				setF40402c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402D:
				setF40402d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402E:
				setF40402e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402F:
				setF40402f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404030:
				setF404030((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404031:
				setF404031((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404032:
				setF404032((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404033:
				setF404033((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404034:
				setF404034((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404035:
				setF404035((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404036:
				setF404036((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404037:
				setF404037((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404038:
				setF404038((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404039:
				setF404039((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403A:
				setF40403a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403B:
				setF40403b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403C:
				setF40403c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403D:
				setF40403d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403E:
				setF40403e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403F:
				setF40403f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404040:
				setF404040((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404041:
				setF404041((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404042:
				setF404042((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404043:
				setF404043((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404044:
				setF404044((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404045:
				setF404045((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404046:
				setF404046((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404047:
				setF404047((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404048:
				setF404048((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404049:
				setF404049((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404A:
				setF40404a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404B:
				setF40404b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404C:
				setF40404c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404D:
				setF40404d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404E:
				setF40404e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404F:
				setF40404f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404050:
				setF404050((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404051:
				setF404051((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404052:
				setF404052((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404053:
				setF404053((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404054:
				setF404054((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404055:
				setF404055((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404056:
				setF404056((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404057:
				setF404057((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404058:
				setF404058((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404059:
				setF404059((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405A:
				setF40405a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405B:
				setF40405b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405C:
				setF40405c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405D:
				setF40405d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405E:
				setF40405e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405F:
				setF40405f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404060:
				setF404060((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404061:
				setF404061((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404062:
				setF404062((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404063:
				setF404063((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404064:
				setF404064((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404065:
				setF404065((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404066:
				setF404066((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404067:
				setF404067((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404068:
				setF404068((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404069:
				setF404069((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406A:
				setF40406a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406B:
				setF40406b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406C:
				setF40406c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406D:
				setF40406d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406E:
				setF40406e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406F:
				setF40406f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404070:
				setF404070((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404071:
				setF404071((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404072:
				setF404072((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404073:
				setF404073((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404074:
				setF404074((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404075:
				setF404075((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404076:
				setF404076((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404077:
				setF404077((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404078:
				setF404078((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404079:
				setF404079((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407A:
				setF40407a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407B:
				setF40407b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407C:
				setF40407c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407D:
				setF40407d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407E:
				setF40407e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407F:
				setF40407f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404080:
				setF404080((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404081:
				setF404081((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404082:
				setF404082((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404083:
				setF404083((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404084:
				setF404084((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404085:
				setF404085((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404086:
				setF404086((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404087:
				setF404087((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404088:
				setF404088((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404089:
				setF404089((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408A:
				setF40408a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408B:
				setF40408b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408C:
				setF40408c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408D:
				setF40408d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408E:
				setF40408e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408F:
				setF40408f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404090:
				setF404090((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404091:
				setF404091((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404092:
				setF404092((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404093:
				setF404093((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404094:
				setF404094((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404095:
				setF404095((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404096:
				setF404096((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404097:
				setF404097((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404098:
				setF404098((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F404099:
				setF404099((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409A:
				setF40409a((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409B:
				setF40409b((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409C:
				setF40409c((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409D:
				setF40409d((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409E:
				setF40409e((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409F:
				setF40409f((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A0:
				setF4040a0((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A1:
				setF4040a1((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A2:
				setF4040a2((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A3:
				setF4040a3((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A4:
				setF4040a4((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A5:
				setF4040a5((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A6:
				setF4040a6((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A7:
				setF4040a7((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A8:
				setF4040a8((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A9:
				setF4040a9((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AA:
				setF4040aa((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AB:
				setF4040ab((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AC:
				setF4040ac((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AD:
				setF4040ad((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AE:
				setF4040ae((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AF:
				setF4040af((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B0:
				setF4040b0((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B1:
				setF4040b1((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B2:
				setF4040b2((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B3:
				setF4040b3((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B4:
				setF4040b4((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B5:
				setF4040b5((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B6:
				setF4040b6((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B7:
				setF4040b7((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B8:
				setF4040b8((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B9:
				setF4040b9((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BA:
				setF4040ba((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BB:
				setF4040bb((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BC:
				setF4040bc((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BD:
				setF4040bd((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BE:
				setF4040be((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BF:
				setF4040bf((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C0:
				setF4040c0((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C1:
				setF4040c1((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C2:
				setF4040c2((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C3:
				setF4040c3((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C4:
				setF4040c4((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C5:
				setF4040c5((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C6:
				setF4040c6((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C7:
				setF4040c7((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C8:
				setF4040c8((EObject)null);
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__TIMEPHASED_DATA:
				getTimephasedData().clear();
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
			case MspdiPackage.ASSIGNMENT_TYPE__UID:
				return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
			case MspdiPackage.ASSIGNMENT_TYPE__TASK_UID:
				return TASK_UID_EDEFAULT == null ? taskUID != null : !TASK_UID_EDEFAULT.equals(taskUID);
			case MspdiPackage.ASSIGNMENT_TYPE__RESOURCE_UID:
				return RESOURCE_UID_EDEFAULT == null ? resourceUID != null : !RESOURCE_UID_EDEFAULT.equals(resourceUID);
			case MspdiPackage.ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE:
				return PERCENT_WORK_COMPLETE_EDEFAULT == null ? percentWorkComplete != null : !PERCENT_WORK_COMPLETE_EDEFAULT.equals(percentWorkComplete);
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_COST:
				return ACTUAL_COST_EDEFAULT == null ? actualCost != null : !ACTUAL_COST_EDEFAULT.equals(actualCost);
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_FINISH:
				return ACTUAL_FINISH_EDEFAULT == null ? actualFinish != null : !ACTUAL_FINISH_EDEFAULT.equals(actualFinish);
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST:
				return ACTUAL_OVERTIME_COST_EDEFAULT == null ? actualOvertimeCost != null : !ACTUAL_OVERTIME_COST_EDEFAULT.equals(actualOvertimeCost);
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK:
				return ACTUAL_OVERTIME_WORK_EDEFAULT == null ? actualOvertimeWork != null : !ACTUAL_OVERTIME_WORK_EDEFAULT.equals(actualOvertimeWork);
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_START:
				return ACTUAL_START_EDEFAULT == null ? actualStart != null : !ACTUAL_START_EDEFAULT.equals(actualStart);
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK:
				return ACTUAL_WORK_EDEFAULT == null ? actualWork != null : !ACTUAL_WORK_EDEFAULT.equals(actualWork);
			case MspdiPackage.ASSIGNMENT_TYPE__ACWP:
				return isSetACWP();
			case MspdiPackage.ASSIGNMENT_TYPE__CONFIRMED:
				return isSetConfirmed();
			case MspdiPackage.ASSIGNMENT_TYPE__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case MspdiPackage.ASSIGNMENT_TYPE__COST_RATE_TABLE:
				return isSetCostRateTable();
			case MspdiPackage.ASSIGNMENT_TYPE__COST_VARIANCE:
				return isSetCostVariance();
			case MspdiPackage.ASSIGNMENT_TYPE__CV:
				return isSetCV();
			case MspdiPackage.ASSIGNMENT_TYPE__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH:
				return FINISH_EDEFAULT == null ? finish != null : !FINISH_EDEFAULT.equals(finish);
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH_VARIANCE:
				return FINISH_VARIANCE_EDEFAULT == null ? finishVariance != null : !FINISH_VARIANCE_EDEFAULT.equals(finishVariance);
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK:
				return HYPERLINK_EDEFAULT == null ? hyperlink != null : !HYPERLINK_EDEFAULT.equals(hyperlink);
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_ADDRESS:
				return HYPERLINK_ADDRESS_EDEFAULT == null ? hyperlinkAddress != null : !HYPERLINK_ADDRESS_EDEFAULT.equals(hyperlinkAddress);
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS:
				return HYPERLINK_SUB_ADDRESS_EDEFAULT == null ? hyperlinkSubAddress != null : !HYPERLINK_SUB_ADDRESS_EDEFAULT.equals(hyperlinkSubAddress);
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_VARIANCE:
				return isSetWorkVariance();
			case MspdiPackage.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS:
				return isSetHasFixedRateUnits();
			case MspdiPackage.ASSIGNMENT_TYPE__FIXED_MATERIAL:
				return isSetFixedMaterial();
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY:
				return LEVELING_DELAY_EDEFAULT == null ? levelingDelay != null : !LEVELING_DELAY_EDEFAULT.equals(levelingDelay);
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT:
				return isSetLevelingDelayFormat();
			case MspdiPackage.ASSIGNMENT_TYPE__LINKED_FIELDS:
				return isSetLinkedFields();
			case MspdiPackage.ASSIGNMENT_TYPE__MILESTONE:
				return isSetMilestone();
			case MspdiPackage.ASSIGNMENT_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case MspdiPackage.ASSIGNMENT_TYPE__OVERALLOCATED:
				return isSetOverallocated();
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_COST:
				return OVERTIME_COST_EDEFAULT == null ? overtimeCost != null : !OVERTIME_COST_EDEFAULT.equals(overtimeCost);
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_WORK:
				return OVERTIME_WORK_EDEFAULT == null ? overtimeWork != null : !OVERTIME_WORK_EDEFAULT.equals(overtimeWork);
			case MspdiPackage.ASSIGNMENT_TYPE__PEAK_UNITS:
				return isSetPeakUnits();
			case MspdiPackage.ASSIGNMENT_TYPE__REGULAR_WORK:
				return REGULAR_WORK_EDEFAULT == null ? regularWork != null : !REGULAR_WORK_EDEFAULT.equals(regularWork);
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_COST:
				return REMAINING_COST_EDEFAULT == null ? remainingCost != null : !REMAINING_COST_EDEFAULT.equals(remainingCost);
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST:
				return REMAINING_OVERTIME_COST_EDEFAULT == null ? remainingOvertimeCost != null : !REMAINING_OVERTIME_COST_EDEFAULT.equals(remainingOvertimeCost);
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK:
				return REMAINING_OVERTIME_WORK_EDEFAULT == null ? remainingOvertimeWork != null : !REMAINING_OVERTIME_WORK_EDEFAULT.equals(remainingOvertimeWork);
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_WORK:
				return REMAINING_WORK_EDEFAULT == null ? remainingWork != null : !REMAINING_WORK_EDEFAULT.equals(remainingWork);
			case MspdiPackage.ASSIGNMENT_TYPE__RESPONSE_PENDING:
				return isSetResponsePending();
			case MspdiPackage.ASSIGNMENT_TYPE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case MspdiPackage.ASSIGNMENT_TYPE__STOP:
				return STOP_EDEFAULT == null ? stop != null : !STOP_EDEFAULT.equals(stop);
			case MspdiPackage.ASSIGNMENT_TYPE__RESUME:
				return RESUME_EDEFAULT == null ? resume != null : !RESUME_EDEFAULT.equals(resume);
			case MspdiPackage.ASSIGNMENT_TYPE__START_VARIANCE:
				return START_VARIANCE_EDEFAULT == null ? startVariance != null : !START_VARIANCE_EDEFAULT.equals(startVariance);
			case MspdiPackage.ASSIGNMENT_TYPE__SUMMARY:
				return isSetSummary();
			case MspdiPackage.ASSIGNMENT_TYPE__SV:
				return isSetSV();
			case MspdiPackage.ASSIGNMENT_TYPE__UNITS:
				return isSetUnits();
			case MspdiPackage.ASSIGNMENT_TYPE__UPDATE_NEEDED:
				return isSetUpdateNeeded();
			case MspdiPackage.ASSIGNMENT_TYPE__VAC:
				return isSetVAC();
			case MspdiPackage.ASSIGNMENT_TYPE__WORK:
				return WORK_EDEFAULT == null ? work != null : !WORK_EDEFAULT.equals(work);
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_CONTOUR:
				return isSetWorkContour();
			case MspdiPackage.ASSIGNMENT_TYPE__BCWS:
				return isSetBCWS();
			case MspdiPackage.ASSIGNMENT_TYPE__BCWP:
				return isSetBCWP();
			case MspdiPackage.ASSIGNMENT_TYPE__BOOKING_TYPE:
				return isSetBookingType();
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED:
				return ACTUAL_WORK_PROTECTED_EDEFAULT == null ? actualWorkProtected != null : !ACTUAL_WORK_PROTECTED_EDEFAULT.equals(actualWorkProtected);
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				return ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT == null ? actualOvertimeWorkProtected != null : !ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT.equals(actualOvertimeWorkProtected);
			case MspdiPackage.ASSIGNMENT_TYPE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER:
				return ASSN_OWNER_EDEFAULT == null ? assnOwner != null : !ASSN_OWNER_EDEFAULT.equals(assnOwner);
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER_GUID:
				return ASSN_OWNER_GUID_EDEFAULT == null ? assnOwnerGuid != null : !ASSN_OWNER_GUID_EDEFAULT.equals(assnOwnerGuid);
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_COST:
				return BUDGET_COST_EDEFAULT == null ? budgetCost != null : !BUDGET_COST_EDEFAULT.equals(budgetCost);
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_WORK:
				return BUDGET_WORK_EDEFAULT == null ? budgetWork != null : !BUDGET_WORK_EDEFAULT.equals(budgetWork);
			case MspdiPackage.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE:
				return extendedAttribute != null && !extendedAttribute.isEmpty();
			case MspdiPackage.ASSIGNMENT_TYPE__BASELINE:
				return baseline != null && !baseline.isEmpty();
			case MspdiPackage.ASSIGNMENT_TYPE__F404000:
				return f404000 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404001:
				return f404001 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404002:
				return f404002 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404003:
				return f404003 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404004:
				return f404004 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404005:
				return f404005 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404006:
				return f404006 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404007:
				return f404007 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404008:
				return f404008 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404009:
				return f404009 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400A:
				return f40400a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400B:
				return f40400b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400C:
				return f40400c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400D:
				return f40400d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400E:
				return f40400e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40400F:
				return f40400f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404010:
				return f404010 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404011:
				return f404011 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404012:
				return f404012 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404013:
				return f404013 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404014:
				return f404014 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404015:
				return f404015 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404016:
				return f404016 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404017:
				return f404017 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404018:
				return f404018 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404019:
				return f404019 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401A:
				return f40401a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401B:
				return f40401b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401C:
				return f40401c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401D:
				return f40401d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401E:
				return f40401e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40401F:
				return f40401f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404020:
				return f404020 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404021:
				return f404021 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404022:
				return f404022 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404023:
				return f404023 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404024:
				return f404024 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404025:
				return f404025 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404026:
				return f404026 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404027:
				return f404027 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404028:
				return f404028 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404029:
				return f404029 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402A:
				return f40402a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402B:
				return f40402b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402C:
				return f40402c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402D:
				return f40402d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402E:
				return f40402e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40402F:
				return f40402f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404030:
				return f404030 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404031:
				return f404031 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404032:
				return f404032 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404033:
				return f404033 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404034:
				return f404034 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404035:
				return f404035 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404036:
				return f404036 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404037:
				return f404037 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404038:
				return f404038 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404039:
				return f404039 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403A:
				return f40403a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403B:
				return f40403b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403C:
				return f40403c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403D:
				return f40403d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403E:
				return f40403e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40403F:
				return f40403f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404040:
				return f404040 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404041:
				return f404041 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404042:
				return f404042 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404043:
				return f404043 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404044:
				return f404044 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404045:
				return f404045 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404046:
				return f404046 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404047:
				return f404047 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404048:
				return f404048 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404049:
				return f404049 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404A:
				return f40404a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404B:
				return f40404b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404C:
				return f40404c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404D:
				return f40404d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404E:
				return f40404e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40404F:
				return f40404f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404050:
				return f404050 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404051:
				return f404051 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404052:
				return f404052 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404053:
				return f404053 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404054:
				return f404054 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404055:
				return f404055 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404056:
				return f404056 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404057:
				return f404057 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404058:
				return f404058 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404059:
				return f404059 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405A:
				return f40405a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405B:
				return f40405b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405C:
				return f40405c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405D:
				return f40405d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405E:
				return f40405e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40405F:
				return f40405f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404060:
				return f404060 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404061:
				return f404061 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404062:
				return f404062 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404063:
				return f404063 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404064:
				return f404064 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404065:
				return f404065 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404066:
				return f404066 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404067:
				return f404067 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404068:
				return f404068 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404069:
				return f404069 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406A:
				return f40406a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406B:
				return f40406b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406C:
				return f40406c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406D:
				return f40406d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406E:
				return f40406e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40406F:
				return f40406f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404070:
				return f404070 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404071:
				return f404071 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404072:
				return f404072 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404073:
				return f404073 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404074:
				return f404074 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404075:
				return f404075 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404076:
				return f404076 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404077:
				return f404077 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404078:
				return f404078 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404079:
				return f404079 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407A:
				return f40407a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407B:
				return f40407b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407C:
				return f40407c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407D:
				return f40407d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407E:
				return f40407e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40407F:
				return f40407f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404080:
				return f404080 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404081:
				return f404081 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404082:
				return f404082 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404083:
				return f404083 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404084:
				return f404084 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404085:
				return f404085 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404086:
				return f404086 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404087:
				return f404087 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404088:
				return f404088 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404089:
				return f404089 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408A:
				return f40408a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408B:
				return f40408b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408C:
				return f40408c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408D:
				return f40408d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408E:
				return f40408e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40408F:
				return f40408f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404090:
				return f404090 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404091:
				return f404091 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404092:
				return f404092 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404093:
				return f404093 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404094:
				return f404094 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404095:
				return f404095 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404096:
				return f404096 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404097:
				return f404097 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404098:
				return f404098 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F404099:
				return f404099 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409A:
				return f40409a != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409B:
				return f40409b != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409C:
				return f40409c != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409D:
				return f40409d != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409E:
				return f40409e != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F40409F:
				return f40409f != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A0:
				return f4040a0 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A1:
				return f4040a1 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A2:
				return f4040a2 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A3:
				return f4040a3 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A4:
				return f4040a4 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A5:
				return f4040a5 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A6:
				return f4040a6 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A7:
				return f4040a7 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A8:
				return f4040a8 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A9:
				return f4040a9 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AA:
				return f4040aa != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AB:
				return f4040ab != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AC:
				return f4040ac != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AD:
				return f4040ad != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AE:
				return f4040ae != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AF:
				return f4040af != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B0:
				return f4040b0 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B1:
				return f4040b1 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B2:
				return f4040b2 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B3:
				return f4040b3 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B4:
				return f4040b4 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B5:
				return f4040b5 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B6:
				return f4040b6 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B7:
				return f4040b7 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B8:
				return f4040b8 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B9:
				return f4040b9 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BA:
				return f4040ba != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BB:
				return f4040bb != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BC:
				return f4040bc != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BD:
				return f4040bd != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BE:
				return f4040be != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BF:
				return f4040bf != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C0:
				return f4040c0 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C1:
				return f4040c1 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C2:
				return f4040c2 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C3:
				return f4040c3 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C4:
				return f4040c4 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C5:
				return f4040c5 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C6:
				return f4040c6 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C7:
				return f4040c7 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C8:
				return f4040c8 != null;
			case MspdiPackage.ASSIGNMENT_TYPE__TIMEPHASED_DATA:
				return timephasedData != null && !timephasedData.isEmpty();
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
		result.append(" (uID: ");
		result.append(uID);
		result.append(", taskUID: ");
		result.append(taskUID);
		result.append(", resourceUID: ");
		result.append(resourceUID);
		result.append(", percentWorkComplete: ");
		result.append(percentWorkComplete);
		result.append(", actualCost: ");
		result.append(actualCost);
		result.append(", actualFinish: ");
		result.append(actualFinish);
		result.append(", actualOvertimeCost: ");
		result.append(actualOvertimeCost);
		result.append(", actualOvertimeWork: ");
		result.append(actualOvertimeWork);
		result.append(", actualStart: ");
		result.append(actualStart);
		result.append(", actualWork: ");
		result.append(actualWork);
		result.append(", aCWP: ");
		if (aCWPESet) result.append(aCWP); else result.append("<unset>");
		result.append(", confirmed: ");
		if (confirmedESet) result.append(confirmed); else result.append("<unset>");
		result.append(", cost: ");
		result.append(cost);
		result.append(", costRateTable: ");
		if (costRateTableESet) result.append(costRateTable); else result.append("<unset>");
		result.append(", costVariance: ");
		if (costVarianceESet) result.append(costVariance); else result.append("<unset>");
		result.append(", cV: ");
		if (cVESet) result.append(cV); else result.append("<unset>");
		result.append(", delay: ");
		result.append(delay);
		result.append(", finish: ");
		result.append(finish);
		result.append(", finishVariance: ");
		result.append(finishVariance);
		result.append(", hyperlink: ");
		result.append(hyperlink);
		result.append(", hyperlinkAddress: ");
		result.append(hyperlinkAddress);
		result.append(", hyperlinkSubAddress: ");
		result.append(hyperlinkSubAddress);
		result.append(", workVariance: ");
		if (workVarianceESet) result.append(workVariance); else result.append("<unset>");
		result.append(", hasFixedRateUnits: ");
		if (hasFixedRateUnitsESet) result.append(hasFixedRateUnits); else result.append("<unset>");
		result.append(", fixedMaterial: ");
		if (fixedMaterialESet) result.append(fixedMaterial); else result.append("<unset>");
		result.append(", levelingDelay: ");
		result.append(levelingDelay);
		result.append(", levelingDelayFormat: ");
		if (levelingDelayFormatESet) result.append(levelingDelayFormat); else result.append("<unset>");
		result.append(", linkedFields: ");
		if (linkedFieldsESet) result.append(linkedFields); else result.append("<unset>");
		result.append(", milestone: ");
		if (milestoneESet) result.append(milestone); else result.append("<unset>");
		result.append(", notes: ");
		result.append(notes);
		result.append(", overallocated: ");
		if (overallocatedESet) result.append(overallocated); else result.append("<unset>");
		result.append(", overtimeCost: ");
		result.append(overtimeCost);
		result.append(", overtimeWork: ");
		result.append(overtimeWork);
		result.append(", peakUnits: ");
		if (peakUnitsESet) result.append(peakUnits); else result.append("<unset>");
		result.append(", regularWork: ");
		result.append(regularWork);
		result.append(", remainingCost: ");
		result.append(remainingCost);
		result.append(", remainingOvertimeCost: ");
		result.append(remainingOvertimeCost);
		result.append(", remainingOvertimeWork: ");
		result.append(remainingOvertimeWork);
		result.append(", remainingWork: ");
		result.append(remainingWork);
		result.append(", responsePending: ");
		if (responsePendingESet) result.append(responsePending); else result.append("<unset>");
		result.append(", start: ");
		result.append(start);
		result.append(", stop: ");
		result.append(stop);
		result.append(", resume: ");
		result.append(resume);
		result.append(", startVariance: ");
		result.append(startVariance);
		result.append(", summary: ");
		if (summaryESet) result.append(summary); else result.append("<unset>");
		result.append(", sV: ");
		if (sVESet) result.append(sV); else result.append("<unset>");
		result.append(", units: ");
		if (unitsESet) result.append(units); else result.append("<unset>");
		result.append(", updateNeeded: ");
		if (updateNeededESet) result.append(updateNeeded); else result.append("<unset>");
		result.append(", vAC: ");
		if (vACESet) result.append(vAC); else result.append("<unset>");
		result.append(", work: ");
		result.append(work);
		result.append(", workContour: ");
		if (workContourESet) result.append(workContour); else result.append("<unset>");
		result.append(", bCWS: ");
		if (bCWSESet) result.append(bCWS); else result.append("<unset>");
		result.append(", bCWP: ");
		if (bCWPESet) result.append(bCWP); else result.append("<unset>");
		result.append(", bookingType: ");
		if (bookingTypeESet) result.append(bookingType); else result.append("<unset>");
		result.append(", actualWorkProtected: ");
		result.append(actualWorkProtected);
		result.append(", actualOvertimeWorkProtected: ");
		result.append(actualOvertimeWorkProtected);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", assnOwner: ");
		result.append(assnOwner);
		result.append(", assnOwnerGuid: ");
		result.append(assnOwnerGuid);
		result.append(", budgetCost: ");
		result.append(budgetCost);
		result.append(", budgetWork: ");
		result.append(budgetWork);
		result.append(')');
		return result.toString();
	}

} //AssignmentTypeImpl
