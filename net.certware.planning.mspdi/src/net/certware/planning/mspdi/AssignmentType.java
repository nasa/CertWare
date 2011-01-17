/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getTaskUID <em>Task UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getResourceUID <em>Resource UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getPercentWorkComplete <em>Percent Work Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeCost <em>Actual Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeWork <em>Actual Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualWork <em>Actual Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getACWP <em>ACWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isConfirmed <em>Confirmed</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getCostRateTable <em>Cost Rate Table</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getCostVariance <em>Cost Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getCV <em>CV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getDelay <em>Delay</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getFinishVariance <em>Finish Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getHyperlinkAddress <em>Hyperlink Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getWorkVariance <em>Work Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isHasFixedRateUnits <em>Has Fixed Rate Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isFixedMaterial <em>Fixed Material</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelay <em>Leveling Delay</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelayFormat <em>Leveling Delay Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isLinkedFields <em>Linked Fields</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isMilestone <em>Milestone</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getNotes <em>Notes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isOverallocated <em>Overallocated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getOvertimeCost <em>Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getOvertimeWork <em>Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getPeakUnits <em>Peak Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getRegularWork <em>Regular Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getRemainingWork <em>Remaining Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isResponsePending <em>Response Pending</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getStop <em>Stop</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getResume <em>Resume</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getStartVariance <em>Start Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getSV <em>SV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getUnits <em>Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#isUpdateNeeded <em>Update Needed</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getVAC <em>VAC</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getWorkContour <em>Work Contour</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getBookingType <em>Booking Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualWorkProtected <em>Actual Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getAssnOwner <em>Assn Owner</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getAssnOwnerGuid <em>Assn Owner Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getBudgetCost <em>Budget Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getBudgetWork <em>Budget Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404000 <em>F404000</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404001 <em>F404001</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404002 <em>F404002</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404003 <em>F404003</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404004 <em>F404004</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404005 <em>F404005</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404006 <em>F404006</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404007 <em>F404007</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404008 <em>F404008</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404009 <em>F404009</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40400a <em>F4040 0a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40400b <em>F4040 0b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40400c <em>F4040 0c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40400d <em>F4040 0d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40400e <em>F4040 0e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40400f <em>F4040 0f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404010 <em>F404010</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404011 <em>F404011</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404012 <em>F404012</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404013 <em>F404013</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404014 <em>F404014</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404015 <em>F404015</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404016 <em>F404016</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404017 <em>F404017</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404018 <em>F404018</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404019 <em>F404019</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40401a <em>F4040 1a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40401b <em>F4040 1b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40401c <em>F4040 1c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40401d <em>F4040 1d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40401e <em>F4040 1e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40401f <em>F4040 1f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404020 <em>F404020</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404021 <em>F404021</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404022 <em>F404022</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404023 <em>F404023</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404024 <em>F404024</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404025 <em>F404025</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404026 <em>F404026</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404027 <em>F404027</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404028 <em>F404028</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404029 <em>F404029</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40402a <em>F4040 2a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40402b <em>F4040 2b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40402c <em>F4040 2c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40402d <em>F4040 2d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40402e <em>F4040 2e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40402f <em>F4040 2f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404030 <em>F404030</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404031 <em>F404031</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404032 <em>F404032</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404033 <em>F404033</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404034 <em>F404034</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404035 <em>F404035</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404036 <em>F404036</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404037 <em>F404037</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404038 <em>F404038</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404039 <em>F404039</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40403a <em>F4040 3a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40403b <em>F4040 3b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40403c <em>F4040 3c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40403d <em>F4040 3d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40403e <em>F4040 3e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40403f <em>F4040 3f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404040 <em>F404040</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404041 <em>F404041</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404042 <em>F404042</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404043 <em>F404043</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404044 <em>F404044</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404045 <em>F404045</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404046 <em>F404046</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404047 <em>F404047</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404048 <em>F404048</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404049 <em>F404049</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40404a <em>F4040 4a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40404b <em>F4040 4b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40404c <em>F4040 4c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40404d <em>F4040 4d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40404e <em>F4040 4e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40404f <em>F4040 4f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404050 <em>F404050</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404051 <em>F404051</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404052 <em>F404052</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404053 <em>F404053</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404054 <em>F404054</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404055 <em>F404055</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404056 <em>F404056</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404057 <em>F404057</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404058 <em>F404058</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404059 <em>F404059</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40405a <em>F4040 5a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40405b <em>F4040 5b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40405c <em>F4040 5c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40405d <em>F4040 5d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40405e <em>F4040 5e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40405f <em>F4040 5f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404060 <em>F404060</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404061 <em>F404061</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404062 <em>F404062</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404063 <em>F404063</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404064 <em>F404064</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404065 <em>F404065</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404066 <em>F404066</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404067 <em>F404067</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404068 <em>F404068</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404069 <em>F404069</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40406a <em>F4040 6a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40406b <em>F4040 6b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40406c <em>F4040 6c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40406d <em>F4040 6d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40406e <em>F4040 6e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40406f <em>F4040 6f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404070 <em>F404070</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404071 <em>F404071</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404072 <em>F404072</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404073 <em>F404073</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404074 <em>F404074</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404075 <em>F404075</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404076 <em>F404076</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404077 <em>F404077</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404078 <em>F404078</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404079 <em>F404079</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40407a <em>F4040 7a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40407b <em>F4040 7b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40407c <em>F4040 7c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40407d <em>F4040 7d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40407e <em>F4040 7e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40407f <em>F4040 7f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404080 <em>F404080</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404081 <em>F404081</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404082 <em>F404082</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404083 <em>F404083</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404084 <em>F404084</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404085 <em>F404085</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404086 <em>F404086</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404087 <em>F404087</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404088 <em>F404088</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404089 <em>F404089</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40408a <em>F4040 8a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40408b <em>F4040 8b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40408c <em>F4040 8c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40408d <em>F4040 8d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40408e <em>F4040 8e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40408f <em>F4040 8f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404090 <em>F404090</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404091 <em>F404091</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404092 <em>F404092</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404093 <em>F404093</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404094 <em>F404094</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404095 <em>F404095</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404096 <em>F404096</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404097 <em>F404097</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404098 <em>F404098</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF404099 <em>F404099</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40409a <em>F4040 9a</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40409b <em>F4040 9b</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40409c <em>F4040 9c</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40409d <em>F4040 9d</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40409e <em>F4040 9e</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF40409f <em>F4040 9f</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a0 <em>F404 0a0</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a1 <em>F404 0a1</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a2 <em>F404 0a2</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a3 <em>F404 0a3</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a4 <em>F404 0a4</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a5 <em>F404 0a5</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a6 <em>F404 0a6</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a7 <em>F404 0a7</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a8 <em>F404 0a8</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040a9 <em>F404 0a9</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040aa <em>F404 0aa</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040ab <em>F404 0ab</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040ac <em>F404 0ac</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040ad <em>F404 0ad</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040ae <em>F404 0ae</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040af <em>F404 0af</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b0 <em>F404 0b0</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b1 <em>F404 0b1</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b2 <em>F404 0b2</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b3 <em>F404 0b3</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b4 <em>F404 0b4</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b5 <em>F404 0b5</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b6 <em>F404 0b6</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b7 <em>F404 0b7</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b8 <em>F404 0b8</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040b9 <em>F404 0b9</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040ba <em>F404 0ba</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040bb <em>F404 0bb</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040bc <em>F404 0bc</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040bd <em>F404 0bd</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040be <em>F404 0be</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040bf <em>F404 0bf</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c0 <em>F404 0c0</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c1 <em>F404 0c1</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c2 <em>F404 0c2</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c3 <em>F404 0c3</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c4 <em>F404 0c4</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c5 <em>F404 0c5</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c6 <em>F404 0c6</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c7 <em>F404 0c7</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getF4040c8 <em>F404 0c8</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AssignmentType#getTimephasedData <em>Timephased Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType()
 * @model extendedMetaData="name='Assignment_._type' kind='elementOnly'"
 * @generated
 */
public interface AssignmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_UID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='UID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Task UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task UID</em>' attribute.
	 * @see #setTaskUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_TaskUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='TaskUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTaskUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getTaskUID <em>Task UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task UID</em>' attribute.
	 * @see #getTaskUID()
	 * @generated
	 */
	void setTaskUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Resource UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource UID</em>' attribute.
	 * @see #setResourceUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ResourceUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ResourceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getResourceUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getResourceUID <em>Resource UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource UID</em>' attribute.
	 * @see #getResourceUID()
	 * @generated
	 */
	void setResourceUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Percent Work Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of work completed on the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Work Complete</em>' attribute.
	 * @see #setPercentWorkComplete(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_PercentWorkComplete()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='PercentWorkComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPercentWorkComplete();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getPercentWorkComplete <em>Percent Work Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Work Complete</em>' attribute.
	 * @see #getPercentWorkComplete()
	 * @generated
	 */
	void setPercentWorkComplete(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost incurred on the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #setActualCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ActualCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getActualCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Cost</em>' attribute.
	 * @see #getActualCost()
	 * @generated
	 */
	void setActualCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual finish date of the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Finish</em>' attribute.
	 * @see #setActualFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualFinish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ActualFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActualFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualFinish <em>Actual Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Finish</em>' attribute.
	 * @see #getActualFinish()
	 * @generated
	 */
	void setActualFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Actual Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual overtime cost incurred on the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Cost</em>' attribute.
	 * @see #setActualOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualOvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ActualOvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getActualOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeCost <em>Actual Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Cost</em>' attribute.
	 * @see #getActualOvertimeCost()
	 * @generated
	 */
	void setActualOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual amount of overtime work incurred on the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Work</em>' attribute.
	 * @see #setActualOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualOvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualOvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeWork <em>Actual Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Work</em>' attribute.
	 * @see #getActualOvertimeWork()
	 * @generated
	 */
	void setActualOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual start date of the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Start</em>' attribute.
	 * @see #setActualStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ActualStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActualStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualStart <em>Actual Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start</em>' attribute.
	 * @see #getActualStart()
	 * @generated
	 */
	void setActualStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Actual Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual amount of work incurred on the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Work</em>' attribute.
	 * @see #setActualWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualWork <em>Actual Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Work</em>' attribute.
	 * @see #getActualWork()
	 * @generated
	 */
	void setActualWork(Duration value);

	/**
	 * Returns the value of the '<em><b>ACWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost of work performed on the assignment to-date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ACWP</em>' attribute.
	 * @see #isSetACWP()
	 * @see #unsetACWP()
	 * @see #setACWP(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ACWP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='ACWP' namespace='##targetNamespace'"
	 * @generated
	 */
	float getACWP();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getACWP <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACWP</em>' attribute.
	 * @see #isSetACWP()
	 * @see #unsetACWP()
	 * @see #getACWP()
	 * @generated
	 */
	void setACWP(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getACWP <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetACWP()
	 * @see #getACWP()
	 * @see #setACWP(float)
	 * @generated
	 */
	void unsetACWP();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getACWP <em>ACWP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ACWP</em>' attribute is set.
	 * @see #unsetACWP()
	 * @see #getACWP()
	 * @see #setACWP(float)
	 * @generated
	 */
	boolean isSetACWP();

	/**
	 * Returns the value of the '<em><b>Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the Resource has accepted all of his or her assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confirmed</em>' attribute.
	 * @see #isSetConfirmed()
	 * @see #unsetConfirmed()
	 * @see #setConfirmed(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Confirmed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Confirmed' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isConfirmed();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isConfirmed <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmed</em>' attribute.
	 * @see #isSetConfirmed()
	 * @see #unsetConfirmed()
	 * @see #isConfirmed()
	 * @generated
	 */
	void setConfirmed(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isConfirmed <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfirmed()
	 * @see #isConfirmed()
	 * @see #setConfirmed(boolean)
	 * @generated
	 */
	void unsetConfirmed();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isConfirmed <em>Confirmed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confirmed</em>' attribute is set.
	 * @see #unsetConfirmed()
	 * @see #isConfirmed()
	 * @see #setConfirmed(boolean)
	 * @generated
	 */
	boolean isSetConfirmed();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The projected or scheduled cost of the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Cost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='Cost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cost Rate Table</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.CostRateTableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost rate table used for the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Rate Table</em>' attribute.
	 * @see net.certware.planning.mspdi.CostRateTableType
	 * @see #isSetCostRateTable()
	 * @see #unsetCostRateTable()
	 * @see #setCostRateTable(CostRateTableType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_CostRateTable()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CostRateTable' namespace='##targetNamespace'"
	 * @generated
	 */
	CostRateTableType getCostRateTable();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCostRateTable <em>Cost Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Rate Table</em>' attribute.
	 * @see net.certware.planning.mspdi.CostRateTableType
	 * @see #isSetCostRateTable()
	 * @see #unsetCostRateTable()
	 * @see #getCostRateTable()
	 * @generated
	 */
	void setCostRateTable(CostRateTableType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCostRateTable <em>Cost Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostRateTable()
	 * @see #getCostRateTable()
	 * @see #setCostRateTable(CostRateTableType)
	 * @generated
	 */
	void unsetCostRateTable();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCostRateTable <em>Cost Rate Table</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Rate Table</em>' attribute is set.
	 * @see #unsetCostRateTable()
	 * @see #getCostRateTable()
	 * @see #setCostRateTable(CostRateTableType)
	 * @generated
	 */
	boolean isSetCostRateTable();

	/**
	 * Returns the value of the '<em><b>Cost Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The difference between the cost and baseline cost for a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Variance</em>' attribute.
	 * @see #isSetCostVariance()
	 * @see #unsetCostVariance()
	 * @see #setCostVariance(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_CostVariance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='CostVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	float getCostVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCostVariance <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Variance</em>' attribute.
	 * @see #isSetCostVariance()
	 * @see #unsetCostVariance()
	 * @see #getCostVariance()
	 * @generated
	 */
	void setCostVariance(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCostVariance <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostVariance()
	 * @see #getCostVariance()
	 * @see #setCostVariance(float)
	 * @generated
	 */
	void unsetCostVariance();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCostVariance <em>Cost Variance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Variance</em>' attribute is set.
	 * @see #unsetCostVariance()
	 * @see #getCostVariance()
	 * @see #setCostVariance(float)
	 * @generated
	 */
	boolean isSetCostVariance();

	/**
	 * Returns the value of the '<em><b>CV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earned value cost variance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CV</em>' attribute.
	 * @see #isSetCV()
	 * @see #unsetCV()
	 * @see #setCV(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_CV()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='CV' namespace='##targetNamespace'"
	 * @generated
	 */
	float getCV();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCV <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CV</em>' attribute.
	 * @see #isSetCV()
	 * @see #unsetCV()
	 * @see #getCV()
	 * @generated
	 */
	void setCV(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCV <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCV()
	 * @see #getCV()
	 * @see #setCV(float)
	 * @generated
	 */
	void unsetCV();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCV <em>CV</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CV</em>' attribute is set.
	 * @see #unsetCV()
	 * @see #getCV()
	 * @see #setCV(float)
	 * @generated
	 */
	boolean isSetCV();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount that the assignment is delayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Delay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Delay' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDelay();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled finish date of the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' attribute.
	 * @see #setFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Finish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Finish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getFinish <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' attribute.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Finish Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variance of the assignment finish date from the baseline finish date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish Variance</em>' attribute.
	 * @see #setFinishVariance(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_FinishVariance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='FinishVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFinishVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getFinishVariance <em>Finish Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Variance</em>' attribute.
	 * @see #getFinishVariance()
	 * @generated
	 */
	void setFinishVariance(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the hyperlink associated with the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink</em>' attribute.
	 * @see #setHyperlink(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Hyperlink()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkType"
	 *        extendedMetaData="kind='element' name='Hyperlink' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlink();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getHyperlink <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink</em>' attribute.
	 * @see #getHyperlink()
	 * @generated
	 */
	void setHyperlink(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hyperlink associated with the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink Address</em>' attribute.
	 * @see #setHyperlinkAddress(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_HyperlinkAddress()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkAddressType1"
	 *        extendedMetaData="kind='element' name='HyperlinkAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlinkAddress();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getHyperlinkAddress <em>Hyperlink Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Address</em>' attribute.
	 * @see #getHyperlinkAddress()
	 * @generated
	 */
	void setHyperlinkAddress(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink Sub Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document bookmark of the hyperlink associated with the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink Sub Address</em>' attribute.
	 * @see #setHyperlinkSubAddress(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_HyperlinkSubAddress()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkSubAddressType1"
	 *        extendedMetaData="kind='element' name='HyperlinkSubAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlinkSubAddress();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Sub Address</em>' attribute.
	 * @see #getHyperlinkSubAddress()
	 * @generated
	 */
	void setHyperlinkSubAddress(String value);

	/**
	 * Returns the value of the '<em><b>Work Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variance of assignment work from the baseline work as minutes x 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Variance</em>' attribute.
	 * @see #isSetWorkVariance()
	 * @see #unsetWorkVariance()
	 * @see #setWorkVariance(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_WorkVariance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='WorkVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWorkVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getWorkVariance <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Variance</em>' attribute.
	 * @see #isSetWorkVariance()
	 * @see #unsetWorkVariance()
	 * @see #getWorkVariance()
	 * @generated
	 */
	void setWorkVariance(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getWorkVariance <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkVariance()
	 * @see #getWorkVariance()
	 * @see #setWorkVariance(float)
	 * @generated
	 */
	void unsetWorkVariance();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getWorkVariance <em>Work Variance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Variance</em>' attribute is set.
	 * @see #unsetWorkVariance()
	 * @see #getWorkVariance()
	 * @see #setWorkVariance(float)
	 * @generated
	 */
	boolean isSetWorkVariance();

	/**
	 * Returns the value of the '<em><b>Has Fixed Rate Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the Units are Fixed Rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Fixed Rate Units</em>' attribute.
	 * @see #isSetHasFixedRateUnits()
	 * @see #unsetHasFixedRateUnits()
	 * @see #setHasFixedRateUnits(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_HasFixedRateUnits()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='HasFixedRateUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHasFixedRateUnits();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isHasFixedRateUnits <em>Has Fixed Rate Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Fixed Rate Units</em>' attribute.
	 * @see #isSetHasFixedRateUnits()
	 * @see #unsetHasFixedRateUnits()
	 * @see #isHasFixedRateUnits()
	 * @generated
	 */
	void setHasFixedRateUnits(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isHasFixedRateUnits <em>Has Fixed Rate Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasFixedRateUnits()
	 * @see #isHasFixedRateUnits()
	 * @see #setHasFixedRateUnits(boolean)
	 * @generated
	 */
	void unsetHasFixedRateUnits();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isHasFixedRateUnits <em>Has Fixed Rate Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Fixed Rate Units</em>' attribute is set.
	 * @see #unsetHasFixedRateUnits()
	 * @see #isHasFixedRateUnits()
	 * @see #setHasFixedRateUnits(boolean)
	 * @generated
	 */
	boolean isSetHasFixedRateUnits();

	/**
	 * Returns the value of the '<em><b>Fixed Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the consumption of the assigned material resource occurs in a single, fixed amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Material</em>' attribute.
	 * @see #isSetFixedMaterial()
	 * @see #unsetFixedMaterial()
	 * @see #setFixedMaterial(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_FixedMaterial()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='FixedMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFixedMaterial();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isFixedMaterial <em>Fixed Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Material</em>' attribute.
	 * @see #isSetFixedMaterial()
	 * @see #unsetFixedMaterial()
	 * @see #isFixedMaterial()
	 * @generated
	 */
	void setFixedMaterial(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isFixedMaterial <em>Fixed Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixedMaterial()
	 * @see #isFixedMaterial()
	 * @see #setFixedMaterial(boolean)
	 * @generated
	 */
	void unsetFixedMaterial();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isFixedMaterial <em>Fixed Material</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed Material</em>' attribute is set.
	 * @see #unsetFixedMaterial()
	 * @see #isFixedMaterial()
	 * @see #setFixedMaterial(boolean)
	 * @generated
	 */
	boolean isSetFixedMaterial();

	/**
	 * Returns the value of the '<em><b>Leveling Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delay caused by leveling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leveling Delay</em>' attribute.
	 * @see #setLevelingDelay(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_LevelingDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='LevelingDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLevelingDelay();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelay <em>Leveling Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leveling Delay</em>' attribute.
	 * @see #getLevelingDelay()
	 * @generated
	 */
	void setLevelingDelay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Leveling Delay Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.LevelingDelayFormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format for expressing the duration of the delay.  Values are: 3=m, 4=em, 5=h, 6=eh, 7=d, 8=ed, 9=w, 10=ew, 11=mo, 12=emo, 19=%, 20=e%, 21=null, 35=m?, 36=em?, 37=h?, 38=eh?, 39=d?, 40=ed?, 41=w?, 42=ew?, 43=mo?, 44=emo?, 51=%?, 52=e%? and 53=null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leveling Delay Format</em>' attribute.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType
	 * @see #isSetLevelingDelayFormat()
	 * @see #unsetLevelingDelayFormat()
	 * @see #setLevelingDelayFormat(LevelingDelayFormatType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_LevelingDelayFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='LevelingDelayFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	LevelingDelayFormatType getLevelingDelayFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelayFormat <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leveling Delay Format</em>' attribute.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType
	 * @see #isSetLevelingDelayFormat()
	 * @see #unsetLevelingDelayFormat()
	 * @see #getLevelingDelayFormat()
	 * @generated
	 */
	void setLevelingDelayFormat(LevelingDelayFormatType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelayFormat <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevelingDelayFormat()
	 * @see #getLevelingDelayFormat()
	 * @see #setLevelingDelayFormat(LevelingDelayFormatType)
	 * @generated
	 */
	void unsetLevelingDelayFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getLevelingDelayFormat <em>Leveling Delay Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leveling Delay Format</em>' attribute is set.
	 * @see #unsetLevelingDelayFormat()
	 * @see #getLevelingDelayFormat()
	 * @see #setLevelingDelayFormat(LevelingDelayFormatType)
	 * @generated
	 */
	boolean isSetLevelingDelayFormat();

	/**
	 * Returns the value of the '<em><b>Linked Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the Project is linked to another OLE object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Fields</em>' attribute.
	 * @see #isSetLinkedFields()
	 * @see #unsetLinkedFields()
	 * @see #setLinkedFields(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_LinkedFields()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='LinkedFields' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLinkedFields();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isLinkedFields <em>Linked Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Fields</em>' attribute.
	 * @see #isSetLinkedFields()
	 * @see #unsetLinkedFields()
	 * @see #isLinkedFields()
	 * @generated
	 */
	void setLinkedFields(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isLinkedFields <em>Linked Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinkedFields()
	 * @see #isLinkedFields()
	 * @see #setLinkedFields(boolean)
	 * @generated
	 */
	void unsetLinkedFields();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isLinkedFields <em>Linked Fields</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linked Fields</em>' attribute is set.
	 * @see #unsetLinkedFields()
	 * @see #isLinkedFields()
	 * @see #setLinkedFields(boolean)
	 * @generated
	 */
	boolean isSetLinkedFields();

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the assignment is a milestone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milestone</em>' attribute.
	 * @see #isSetMilestone()
	 * @see #unsetMilestone()
	 * @see #setMilestone(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Milestone()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Milestone' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMilestone();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isMilestone <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone</em>' attribute.
	 * @see #isSetMilestone()
	 * @see #unsetMilestone()
	 * @see #isMilestone()
	 * @generated
	 */
	void setMilestone(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isMilestone <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMilestone()
	 * @see #isMilestone()
	 * @see #setMilestone(boolean)
	 * @generated
	 */
	void unsetMilestone();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isMilestone <em>Milestone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Milestone</em>' attribute is set.
	 * @see #unsetMilestone()
	 * @see #isMilestone()
	 * @see #setMilestone(boolean)
	 * @generated
	 */
	boolean isSetMilestone();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text notes associated with the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Overallocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the assignment is overallocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overallocated</em>' attribute.
	 * @see #isSetOverallocated()
	 * @see #unsetOverallocated()
	 * @see #setOverallocated(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Overallocated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Overallocated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOverallocated();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isOverallocated <em>Overallocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overallocated</em>' attribute.
	 * @see #isSetOverallocated()
	 * @see #unsetOverallocated()
	 * @see #isOverallocated()
	 * @generated
	 */
	void setOverallocated(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isOverallocated <em>Overallocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallocated()
	 * @see #isOverallocated()
	 * @see #setOverallocated(boolean)
	 * @generated
	 */
	void unsetOverallocated();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isOverallocated <em>Overallocated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overallocated</em>' attribute is set.
	 * @see #unsetOverallocated()
	 * @see #isOverallocated()
	 * @see #setOverallocated(boolean)
	 * @generated
	 */
	boolean isSetOverallocated();

	/**
	 * Returns the value of the '<em><b>Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sum of the actual and remaining overtime cost of the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Cost</em>' attribute.
	 * @see #setOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_OvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='OvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getOvertimeCost <em>Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Cost</em>' attribute.
	 * @see #getOvertimeCost()
	 * @generated
	 */
	void setOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled overtime work scheduled for the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Work</em>' attribute.
	 * @see #setOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_OvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='OvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getOvertimeWork <em>Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Work</em>' attribute.
	 * @see #getOvertimeWork()
	 * @generated
	 */
	void setOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Peak Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The largest number of units that a resource is assigned for a task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peak Units</em>' attribute.
	 * @see #isSetPeakUnits()
	 * @see #unsetPeakUnits()
	 * @see #setPeakUnits(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_PeakUnits()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='PeakUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	float getPeakUnits();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getPeakUnits <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Units</em>' attribute.
	 * @see #isSetPeakUnits()
	 * @see #unsetPeakUnits()
	 * @see #getPeakUnits()
	 * @generated
	 */
	void setPeakUnits(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getPeakUnits <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeakUnits()
	 * @see #getPeakUnits()
	 * @see #setPeakUnits(float)
	 * @generated
	 */
	void unsetPeakUnits();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getPeakUnits <em>Peak Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Peak Units</em>' attribute is set.
	 * @see #unsetPeakUnits()
	 * @see #getPeakUnits()
	 * @see #setPeakUnits(float)
	 * @generated
	 */
	boolean isSetPeakUnits();

	/**
	 * Returns the value of the '<em><b>Regular Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of non-overtime work scheduled for the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regular Work</em>' attribute.
	 * @see #setRegularWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_RegularWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RegularWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRegularWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getRegularWork <em>Regular Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Work</em>' attribute.
	 * @see #getRegularWork()
	 * @generated
	 */
	void setRegularWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining projected cost of completing the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Cost</em>' attribute.
	 * @see #setRemainingCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_RemainingCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='RemainingCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getRemainingCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getRemainingCost <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Cost</em>' attribute.
	 * @see #getRemainingCost()
	 * @generated
	 */
	void setRemainingCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Remaining Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining projected overtime cost of completing the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Overtime Cost</em>' attribute.
	 * @see #setRemainingOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_RemainingOvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='RemainingOvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getRemainingOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Overtime Cost</em>' attribute.
	 * @see #getRemainingOvertimeCost()
	 * @generated
	 */
	void setRemainingOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Remaining Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining overtime work scheduled to complete the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Overtime Work</em>' attribute.
	 * @see #setRemainingOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_RemainingOvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RemainingOvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRemainingOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Overtime Work</em>' attribute.
	 * @see #getRemainingOvertimeWork()
	 * @generated
	 */
	void setRemainingOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining work scheduled to complete the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Work</em>' attribute.
	 * @see #setRemainingWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_RemainingWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RemainingWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRemainingWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getRemainingWork <em>Remaining Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Work</em>' attribute.
	 * @see #getRemainingWork()
	 * @generated
	 */
	void setRemainingWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Response Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether a response has been received for a TeamAssign message. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Pending</em>' attribute.
	 * @see #isSetResponsePending()
	 * @see #unsetResponsePending()
	 * @see #setResponsePending(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ResponsePending()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ResponsePending' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isResponsePending();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isResponsePending <em>Response Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Pending</em>' attribute.
	 * @see #isSetResponsePending()
	 * @see #unsetResponsePending()
	 * @see #isResponsePending()
	 * @generated
	 */
	void setResponsePending(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isResponsePending <em>Response Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponsePending()
	 * @see #isResponsePending()
	 * @see #setResponsePending(boolean)
	 * @generated
	 */
	void unsetResponsePending();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isResponsePending <em>Response Pending</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Pending</em>' attribute is set.
	 * @see #unsetResponsePending()
	 * @see #isResponsePending()
	 * @see #setResponsePending(boolean)
	 * @generated
	 */
	boolean isSetResponsePending();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled start date of the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the assignment was stopped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop</em>' attribute.
	 * @see #setStop(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Stop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Stop' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStop();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getStop <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' attribute.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Resume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the assignment resumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resume</em>' attribute.
	 * @see #setResume(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Resume()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Resume' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getResume();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getResume <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume</em>' attribute.
	 * @see #getResume()
	 * @generated
	 */
	void setResume(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Start Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variance of the assignment start date from the baseline start date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Variance</em>' attribute.
	 * @see #setStartVariance(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_StartVariance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='StartVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getStartVariance <em>Start Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Variance</em>' attribute.
	 * @see #getStartVariance()
	 * @generated
	 */
	void setStartVariance(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is a summary task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #isSetSummary()
	 * @see #unsetSummary()
	 * @see #setSummary(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Summary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Summary' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSummary();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #isSetSummary()
	 * @see #unsetSummary()
	 * @see #isSummary()
	 * @generated
	 */
	void setSummary(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSummary()
	 * @see #isSummary()
	 * @see #setSummary(boolean)
	 * @generated
	 */
	void unsetSummary();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isSummary <em>Summary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Summary</em>' attribute is set.
	 * @see #unsetSummary()
	 * @see #isSummary()
	 * @see #setSummary(boolean)
	 * @generated
	 */
	boolean isSetSummary();

	/**
	 * Returns the value of the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earned value schedule variance, through the project status date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV</em>' attribute.
	 * @see #isSetSV()
	 * @see #unsetSV()
	 * @see #setSV(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_SV()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='SV' namespace='##targetNamespace'"
	 * @generated
	 */
	float getSV();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV</em>' attribute.
	 * @see #isSetSV()
	 * @see #unsetSV()
	 * @see #getSV()
	 * @generated
	 */
	void setSV(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSV()
	 * @see #getSV()
	 * @see #setSV(float)
	 * @generated
	 */
	void unsetSV();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getSV <em>SV</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SV</em>' attribute is set.
	 * @see #unsetSV()
	 * @see #getSV()
	 * @see #setSV(float)
	 * @generated
	 */
	boolean isSetSV();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of units for the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #setUnits(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Units()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='Units' namespace='##targetNamespace'"
	 * @generated
	 */
	float getUnits();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnits()
	 * @see #getUnits()
	 * @see #setUnits(float)
	 * @generated
	 */
	void unsetUnits();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getUnits <em>Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Units</em>' attribute is set.
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @see #setUnits(float)
	 * @generated
	 */
	boolean isSetUnits();

	/**
	 * Returns the value of the '<em><b>Update Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource assigned to a task needs to be updated as to the status of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Needed</em>' attribute.
	 * @see #isSetUpdateNeeded()
	 * @see #unsetUpdateNeeded()
	 * @see #setUpdateNeeded(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_UpdateNeeded()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UpdateNeeded' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUpdateNeeded();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isUpdateNeeded <em>Update Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Needed</em>' attribute.
	 * @see #isSetUpdateNeeded()
	 * @see #unsetUpdateNeeded()
	 * @see #isUpdateNeeded()
	 * @generated
	 */
	void setUpdateNeeded(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#isUpdateNeeded <em>Update Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateNeeded()
	 * @see #isUpdateNeeded()
	 * @see #setUpdateNeeded(boolean)
	 * @generated
	 */
	void unsetUpdateNeeded();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#isUpdateNeeded <em>Update Needed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Needed</em>' attribute is set.
	 * @see #unsetUpdateNeeded()
	 * @see #isUpdateNeeded()
	 * @see #setUpdateNeeded(boolean)
	 * @generated
	 */
	boolean isSetUpdateNeeded();

	/**
	 * Returns the value of the '<em><b>VAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The difference between basline cost and total cost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VAC</em>' attribute.
	 * @see #isSetVAC()
	 * @see #unsetVAC()
	 * @see #setVAC(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_VAC()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='VAC' namespace='##targetNamespace'"
	 * @generated
	 */
	float getVAC();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getVAC <em>VAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAC</em>' attribute.
	 * @see #isSetVAC()
	 * @see #unsetVAC()
	 * @see #getVAC()
	 * @generated
	 */
	void setVAC(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getVAC <em>VAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVAC()
	 * @see #getVAC()
	 * @see #setVAC(float)
	 * @generated
	 */
	void unsetVAC();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getVAC <em>VAC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>VAC</em>' attribute is set.
	 * @see #unsetVAC()
	 * @see #getVAC()
	 * @see #setVAC(float)
	 * @generated
	 */
	boolean isSetVAC();

	/**
	 * Returns the value of the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of scheduled work for the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work</em>' attribute.
	 * @see #setWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Work()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Work' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getWork <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' attribute.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Work Contour</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.WorkContourType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The work contour of the assignment. Values are: 0=Flat, 1=Back Loaded, 2=Front Loaded, 3=Double Peak, 4=Early Peak, 5=Late Peak, 6=Bell, 7=Turtle, 8=Contoured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Contour</em>' attribute.
	 * @see net.certware.planning.mspdi.WorkContourType
	 * @see #isSetWorkContour()
	 * @see #unsetWorkContour()
	 * @see #setWorkContour(WorkContourType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_WorkContour()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='WorkContour' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkContourType getWorkContour();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getWorkContour <em>Work Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Contour</em>' attribute.
	 * @see net.certware.planning.mspdi.WorkContourType
	 * @see #isSetWorkContour()
	 * @see #unsetWorkContour()
	 * @see #getWorkContour()
	 * @generated
	 */
	void setWorkContour(WorkContourType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getWorkContour <em>Work Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkContour()
	 * @see #getWorkContour()
	 * @see #setWorkContour(WorkContourType)
	 * @generated
	 */
	void unsetWorkContour();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getWorkContour <em>Work Contour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Contour</em>' attribute is set.
	 * @see #unsetWorkContour()
	 * @see #getWorkContour()
	 * @see #setWorkContour(WorkContourType)
	 * @generated
	 */
	boolean isSetWorkContour();

	/**
	 * Returns the value of the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The budgeted cost of work on the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCWS</em>' attribute.
	 * @see #isSetBCWS()
	 * @see #unsetBCWS()
	 * @see #setBCWS(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_BCWS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWS' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWS();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBCWS <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCWS</em>' attribute.
	 * @see #isSetBCWS()
	 * @see #unsetBCWS()
	 * @see #getBCWS()
	 * @generated
	 */
	void setBCWS(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBCWS <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWS()
	 * @see #getBCWS()
	 * @see #setBCWS(float)
	 * @generated
	 */
	void unsetBCWS();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBCWS <em>BCWS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BCWS</em>' attribute is set.
	 * @see #unsetBCWS()
	 * @see #getBCWS()
	 * @see #setBCWS(float)
	 * @generated
	 */
	boolean isSetBCWS();

	/**
	 * Returns the value of the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The budgeted cost of work performed on the assignment to-date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCWP</em>' attribute.
	 * @see #isSetBCWP()
	 * @see #unsetBCWP()
	 * @see #setBCWP(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_BCWP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWP' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWP();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBCWP <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCWP</em>' attribute.
	 * @see #isSetBCWP()
	 * @see #unsetBCWP()
	 * @see #getBCWP()
	 * @generated
	 */
	void setBCWP(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBCWP <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWP()
	 * @see #getBCWP()
	 * @see #setBCWP(float)
	 * @generated
	 */
	void unsetBCWP();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBCWP <em>BCWP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BCWP</em>' attribute is set.
	 * @see #unsetBCWP()
	 * @see #getBCWP()
	 * @see #setBCWP(float)
	 * @generated
	 */
	boolean isSetBCWP();

	/**
	 * Returns the value of the '<em><b>Booking Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.BookingTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The booking type of the assignment. 1=Commited, 2=Proposed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Booking Type</em>' attribute.
	 * @see net.certware.planning.mspdi.BookingTypeType
	 * @see #isSetBookingType()
	 * @see #unsetBookingType()
	 * @see #setBookingType(BookingTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_BookingType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='BookingType' namespace='##targetNamespace'"
	 * @generated
	 */
	BookingTypeType getBookingType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBookingType <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Type</em>' attribute.
	 * @see net.certware.planning.mspdi.BookingTypeType
	 * @see #isSetBookingType()
	 * @see #unsetBookingType()
	 * @see #getBookingType()
	 * @generated
	 */
	void setBookingType(BookingTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBookingType <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBookingType()
	 * @see #getBookingType()
	 * @see #setBookingType(BookingTypeType)
	 * @generated
	 */
	void unsetBookingType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBookingType <em>Booking Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Booking Type</em>' attribute is set.
	 * @see #unsetBookingType()
	 * @see #getBookingType()
	 * @see #setBookingType(BookingTypeType)
	 * @generated
	 */
	boolean isSetBookingType();

	/**
	 * Returns the value of the '<em><b>Actual Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration through which actual work is protected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Work Protected</em>' attribute.
	 * @see #setActualWorkProtected(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualWorkProtected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualWorkProtected' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualWorkProtected();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualWorkProtected <em>Actual Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Work Protected</em>' attribute.
	 * @see #getActualWorkProtected()
	 * @generated
	 */
	void setActualWorkProtected(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Overtime Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration through which actual overtime work is protected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Work Protected</em>' attribute.
	 * @see #setActualOvertimeWorkProtected(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ActualOvertimeWorkProtected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualOvertimeWorkProtected' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualOvertimeWorkProtected();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Work Protected</em>' attribute.
	 * @see #getActualOvertimeWorkProtected()
	 * @generated
	 */
	void setActualOvertimeWorkProtected(Duration value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the assignment was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Assn Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the assignment owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assn Owner</em>' attribute.
	 * @see #setAssnOwner(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_AssnOwner()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AssnOwner' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssnOwner();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getAssnOwner <em>Assn Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assn Owner</em>' attribute.
	 * @see #getAssnOwner()
	 * @generated
	 */
	void setAssnOwner(String value);

	/**
	 * Returns the value of the '<em><b>Assn Owner Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the assignment owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assn Owner Guid</em>' attribute.
	 * @see #setAssnOwnerGuid(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_AssnOwnerGuid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AssnOwnerGuid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssnOwnerGuid();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getAssnOwnerGuid <em>Assn Owner Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assn Owner Guid</em>' attribute.
	 * @see #getAssnOwnerGuid()
	 * @generated
	 */
	void setAssnOwnerGuid(String value);

	/**
	 * Returns the value of the '<em><b>Budget Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The budgeted amount for cost resources on this assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Budget Cost</em>' attribute.
	 * @see #setBudgetCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_BudgetCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='BudgetCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getBudgetCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBudgetCost <em>Budget Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Cost</em>' attribute.
	 * @see #getBudgetCost()
	 * @generated
	 */
	void setBudgetCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Budget Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The budgeted work amount for work or material resources on this assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Budget Work</em>' attribute.
	 * @see #setBudgetWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_BudgetWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='BudgetWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getBudgetWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getBudgetWork <em>Budget Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Work</em>' attribute.
	 * @see #getBudgetWork()
	 * @generated
	 */
	void setBudgetWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.ExtendedAttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of an extended attribute.  Two pieces of data are necessary - a pointer back to the extended attribute table which is specified either by the unique ID or the Field ID, and the value which is specified either with the value, or a pointer back to the value list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attribute</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_ExtendedAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtendedAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtendedAttributeType> getExtendedAttribute();

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.BaselineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of baseline values associated with the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baseline</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_Baseline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Baseline' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BaselineType> getBaseline();

	/**
	 * Returns the value of the '<em><b>F404000</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404000</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404000</em>' containment reference.
	 * @see #setF404000(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404000()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404000' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404000();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404000 <em>F404000</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404000</em>' containment reference.
	 * @see #getF404000()
	 * @generated
	 */
	void setF404000(EObject value);

	/**
	 * Returns the value of the '<em><b>F404001</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404001</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404001</em>' containment reference.
	 * @see #setF404001(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404001()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404001' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404001();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404001 <em>F404001</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404001</em>' containment reference.
	 * @see #getF404001()
	 * @generated
	 */
	void setF404001(EObject value);

	/**
	 * Returns the value of the '<em><b>F404002</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404002</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404002</em>' containment reference.
	 * @see #setF404002(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404002()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404002' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404002();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404002 <em>F404002</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404002</em>' containment reference.
	 * @see #getF404002()
	 * @generated
	 */
	void setF404002(EObject value);

	/**
	 * Returns the value of the '<em><b>F404003</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404003</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404003</em>' containment reference.
	 * @see #setF404003(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404003()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404003' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404003();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404003 <em>F404003</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404003</em>' containment reference.
	 * @see #getF404003()
	 * @generated
	 */
	void setF404003(EObject value);

	/**
	 * Returns the value of the '<em><b>F404004</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404004</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404004</em>' containment reference.
	 * @see #setF404004(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404004()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404004' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404004();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404004 <em>F404004</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404004</em>' containment reference.
	 * @see #getF404004()
	 * @generated
	 */
	void setF404004(EObject value);

	/**
	 * Returns the value of the '<em><b>F404005</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404005</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404005</em>' containment reference.
	 * @see #setF404005(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404005()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404005' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404005();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404005 <em>F404005</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404005</em>' containment reference.
	 * @see #getF404005()
	 * @generated
	 */
	void setF404005(EObject value);

	/**
	 * Returns the value of the '<em><b>F404006</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404006</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404006</em>' containment reference.
	 * @see #setF404006(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404006()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404006' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404006();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404006 <em>F404006</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404006</em>' containment reference.
	 * @see #getF404006()
	 * @generated
	 */
	void setF404006(EObject value);

	/**
	 * Returns the value of the '<em><b>F404007</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404007</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404007</em>' containment reference.
	 * @see #setF404007(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404007()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404007' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404007();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404007 <em>F404007</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404007</em>' containment reference.
	 * @see #getF404007()
	 * @generated
	 */
	void setF404007(EObject value);

	/**
	 * Returns the value of the '<em><b>F404008</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404008</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404008</em>' containment reference.
	 * @see #setF404008(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404008()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404008' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404008();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404008 <em>F404008</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404008</em>' containment reference.
	 * @see #getF404008()
	 * @generated
	 */
	void setF404008(EObject value);

	/**
	 * Returns the value of the '<em><b>F404009</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404009</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404009</em>' containment reference.
	 * @see #setF404009(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404009()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404009' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404009();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404009 <em>F404009</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404009</em>' containment reference.
	 * @see #getF404009()
	 * @generated
	 */
	void setF404009(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 0a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 0a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 0a</em>' containment reference.
	 * @see #setF40400a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40400a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40400a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40400a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40400a <em>F4040 0a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 0a</em>' containment reference.
	 * @see #getF40400a()
	 * @generated
	 */
	void setF40400a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 0b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 0b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 0b</em>' containment reference.
	 * @see #setF40400b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40400b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40400b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40400b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40400b <em>F4040 0b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 0b</em>' containment reference.
	 * @see #getF40400b()
	 * @generated
	 */
	void setF40400b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 0c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 0c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 0c</em>' containment reference.
	 * @see #setF40400c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40400c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40400c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40400c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40400c <em>F4040 0c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 0c</em>' containment reference.
	 * @see #getF40400c()
	 * @generated
	 */
	void setF40400c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 0d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 0d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 0d</em>' containment reference.
	 * @see #setF40400d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40400d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40400d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40400d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40400d <em>F4040 0d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 0d</em>' containment reference.
	 * @see #getF40400d()
	 * @generated
	 */
	void setF40400d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 0e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 0e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 0e</em>' containment reference.
	 * @see #setF40400e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40400e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40400e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40400e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40400e <em>F4040 0e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 0e</em>' containment reference.
	 * @see #getF40400e()
	 * @generated
	 */
	void setF40400e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 0f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 0f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 0f</em>' containment reference.
	 * @see #setF40400f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40400f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40400f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40400f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40400f <em>F4040 0f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 0f</em>' containment reference.
	 * @see #getF40400f()
	 * @generated
	 */
	void setF40400f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404010</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404010</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404010</em>' containment reference.
	 * @see #setF404010(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404010()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404010' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404010();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404010 <em>F404010</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404010</em>' containment reference.
	 * @see #getF404010()
	 * @generated
	 */
	void setF404010(EObject value);

	/**
	 * Returns the value of the '<em><b>F404011</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404011</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404011</em>' containment reference.
	 * @see #setF404011(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404011()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404011' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404011();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404011 <em>F404011</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404011</em>' containment reference.
	 * @see #getF404011()
	 * @generated
	 */
	void setF404011(EObject value);

	/**
	 * Returns the value of the '<em><b>F404012</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404012</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404012</em>' containment reference.
	 * @see #setF404012(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404012()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404012' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404012();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404012 <em>F404012</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404012</em>' containment reference.
	 * @see #getF404012()
	 * @generated
	 */
	void setF404012(EObject value);

	/**
	 * Returns the value of the '<em><b>F404013</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404013</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404013</em>' containment reference.
	 * @see #setF404013(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404013()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404013' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404013();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404013 <em>F404013</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404013</em>' containment reference.
	 * @see #getF404013()
	 * @generated
	 */
	void setF404013(EObject value);

	/**
	 * Returns the value of the '<em><b>F404014</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404014</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404014</em>' containment reference.
	 * @see #setF404014(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404014()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404014' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404014();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404014 <em>F404014</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404014</em>' containment reference.
	 * @see #getF404014()
	 * @generated
	 */
	void setF404014(EObject value);

	/**
	 * Returns the value of the '<em><b>F404015</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404015</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404015</em>' containment reference.
	 * @see #setF404015(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404015()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404015' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404015();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404015 <em>F404015</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404015</em>' containment reference.
	 * @see #getF404015()
	 * @generated
	 */
	void setF404015(EObject value);

	/**
	 * Returns the value of the '<em><b>F404016</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404016</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404016</em>' containment reference.
	 * @see #setF404016(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404016()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404016' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404016();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404016 <em>F404016</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404016</em>' containment reference.
	 * @see #getF404016()
	 * @generated
	 */
	void setF404016(EObject value);

	/**
	 * Returns the value of the '<em><b>F404017</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404017</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404017</em>' containment reference.
	 * @see #setF404017(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404017()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404017' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404017();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404017 <em>F404017</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404017</em>' containment reference.
	 * @see #getF404017()
	 * @generated
	 */
	void setF404017(EObject value);

	/**
	 * Returns the value of the '<em><b>F404018</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404018</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404018</em>' containment reference.
	 * @see #setF404018(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404018()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404018' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404018();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404018 <em>F404018</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404018</em>' containment reference.
	 * @see #getF404018()
	 * @generated
	 */
	void setF404018(EObject value);

	/**
	 * Returns the value of the '<em><b>F404019</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404019</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404019</em>' containment reference.
	 * @see #setF404019(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404019()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404019' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404019();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404019 <em>F404019</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404019</em>' containment reference.
	 * @see #getF404019()
	 * @generated
	 */
	void setF404019(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 1a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 1a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 1a</em>' containment reference.
	 * @see #setF40401a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40401a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40401a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40401a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40401a <em>F4040 1a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 1a</em>' containment reference.
	 * @see #getF40401a()
	 * @generated
	 */
	void setF40401a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 1b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 1b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 1b</em>' containment reference.
	 * @see #setF40401b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40401b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40401b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40401b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40401b <em>F4040 1b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 1b</em>' containment reference.
	 * @see #getF40401b()
	 * @generated
	 */
	void setF40401b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 1c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 1c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 1c</em>' containment reference.
	 * @see #setF40401c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40401c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40401c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40401c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40401c <em>F4040 1c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 1c</em>' containment reference.
	 * @see #getF40401c()
	 * @generated
	 */
	void setF40401c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 1d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 1d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 1d</em>' containment reference.
	 * @see #setF40401d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40401d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40401d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40401d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40401d <em>F4040 1d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 1d</em>' containment reference.
	 * @see #getF40401d()
	 * @generated
	 */
	void setF40401d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 1e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 1e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 1e</em>' containment reference.
	 * @see #setF40401e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40401e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40401e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40401e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40401e <em>F4040 1e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 1e</em>' containment reference.
	 * @see #getF40401e()
	 * @generated
	 */
	void setF40401e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 1f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 1f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 1f</em>' containment reference.
	 * @see #setF40401f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40401f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40401f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40401f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40401f <em>F4040 1f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 1f</em>' containment reference.
	 * @see #getF40401f()
	 * @generated
	 */
	void setF40401f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404020</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404020</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404020</em>' containment reference.
	 * @see #setF404020(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404020()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404020' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404020();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404020 <em>F404020</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404020</em>' containment reference.
	 * @see #getF404020()
	 * @generated
	 */
	void setF404020(EObject value);

	/**
	 * Returns the value of the '<em><b>F404021</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404021</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404021</em>' containment reference.
	 * @see #setF404021(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404021()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404021' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404021();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404021 <em>F404021</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404021</em>' containment reference.
	 * @see #getF404021()
	 * @generated
	 */
	void setF404021(EObject value);

	/**
	 * Returns the value of the '<em><b>F404022</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404022</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404022</em>' containment reference.
	 * @see #setF404022(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404022()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404022' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404022();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404022 <em>F404022</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404022</em>' containment reference.
	 * @see #getF404022()
	 * @generated
	 */
	void setF404022(EObject value);

	/**
	 * Returns the value of the '<em><b>F404023</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404023</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404023</em>' containment reference.
	 * @see #setF404023(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404023()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404023' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404023();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404023 <em>F404023</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404023</em>' containment reference.
	 * @see #getF404023()
	 * @generated
	 */
	void setF404023(EObject value);

	/**
	 * Returns the value of the '<em><b>F404024</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404024</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404024</em>' containment reference.
	 * @see #setF404024(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404024()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404024' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404024();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404024 <em>F404024</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404024</em>' containment reference.
	 * @see #getF404024()
	 * @generated
	 */
	void setF404024(EObject value);

	/**
	 * Returns the value of the '<em><b>F404025</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404025</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404025</em>' containment reference.
	 * @see #setF404025(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404025()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404025' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404025();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404025 <em>F404025</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404025</em>' containment reference.
	 * @see #getF404025()
	 * @generated
	 */
	void setF404025(EObject value);

	/**
	 * Returns the value of the '<em><b>F404026</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404026</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404026</em>' containment reference.
	 * @see #setF404026(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404026()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404026' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404026();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404026 <em>F404026</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404026</em>' containment reference.
	 * @see #getF404026()
	 * @generated
	 */
	void setF404026(EObject value);

	/**
	 * Returns the value of the '<em><b>F404027</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404027</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404027</em>' containment reference.
	 * @see #setF404027(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404027()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404027' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404027();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404027 <em>F404027</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404027</em>' containment reference.
	 * @see #getF404027()
	 * @generated
	 */
	void setF404027(EObject value);

	/**
	 * Returns the value of the '<em><b>F404028</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404028</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404028</em>' containment reference.
	 * @see #setF404028(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404028()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404028' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404028();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404028 <em>F404028</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404028</em>' containment reference.
	 * @see #getF404028()
	 * @generated
	 */
	void setF404028(EObject value);

	/**
	 * Returns the value of the '<em><b>F404029</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404029</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404029</em>' containment reference.
	 * @see #setF404029(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404029()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404029' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404029();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404029 <em>F404029</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404029</em>' containment reference.
	 * @see #getF404029()
	 * @generated
	 */
	void setF404029(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 2a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 2a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 2a</em>' containment reference.
	 * @see #setF40402a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40402a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40402a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40402a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40402a <em>F4040 2a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 2a</em>' containment reference.
	 * @see #getF40402a()
	 * @generated
	 */
	void setF40402a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 2b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 2b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 2b</em>' containment reference.
	 * @see #setF40402b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40402b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40402b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40402b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40402b <em>F4040 2b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 2b</em>' containment reference.
	 * @see #getF40402b()
	 * @generated
	 */
	void setF40402b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 2c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 2c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 2c</em>' containment reference.
	 * @see #setF40402c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40402c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40402c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40402c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40402c <em>F4040 2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 2c</em>' containment reference.
	 * @see #getF40402c()
	 * @generated
	 */
	void setF40402c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 2d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 2d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 2d</em>' containment reference.
	 * @see #setF40402d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40402d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40402d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40402d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40402d <em>F4040 2d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 2d</em>' containment reference.
	 * @see #getF40402d()
	 * @generated
	 */
	void setF40402d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 2e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 2e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 2e</em>' containment reference.
	 * @see #setF40402e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40402e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40402e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40402e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40402e <em>F4040 2e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 2e</em>' containment reference.
	 * @see #getF40402e()
	 * @generated
	 */
	void setF40402e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 2f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 2f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 2f</em>' containment reference.
	 * @see #setF40402f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40402f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40402f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40402f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40402f <em>F4040 2f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 2f</em>' containment reference.
	 * @see #getF40402f()
	 * @generated
	 */
	void setF40402f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404030</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404030</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404030</em>' containment reference.
	 * @see #setF404030(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404030()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404030' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404030();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404030 <em>F404030</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404030</em>' containment reference.
	 * @see #getF404030()
	 * @generated
	 */
	void setF404030(EObject value);

	/**
	 * Returns the value of the '<em><b>F404031</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404031</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404031</em>' containment reference.
	 * @see #setF404031(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404031()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404031' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404031();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404031 <em>F404031</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404031</em>' containment reference.
	 * @see #getF404031()
	 * @generated
	 */
	void setF404031(EObject value);

	/**
	 * Returns the value of the '<em><b>F404032</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404032</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404032</em>' containment reference.
	 * @see #setF404032(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404032()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404032' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404032();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404032 <em>F404032</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404032</em>' containment reference.
	 * @see #getF404032()
	 * @generated
	 */
	void setF404032(EObject value);

	/**
	 * Returns the value of the '<em><b>F404033</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404033</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404033</em>' containment reference.
	 * @see #setF404033(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404033()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404033' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404033();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404033 <em>F404033</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404033</em>' containment reference.
	 * @see #getF404033()
	 * @generated
	 */
	void setF404033(EObject value);

	/**
	 * Returns the value of the '<em><b>F404034</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404034</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404034</em>' containment reference.
	 * @see #setF404034(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404034()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404034' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404034();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404034 <em>F404034</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404034</em>' containment reference.
	 * @see #getF404034()
	 * @generated
	 */
	void setF404034(EObject value);

	/**
	 * Returns the value of the '<em><b>F404035</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404035</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404035</em>' containment reference.
	 * @see #setF404035(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404035()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404035' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404035();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404035 <em>F404035</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404035</em>' containment reference.
	 * @see #getF404035()
	 * @generated
	 */
	void setF404035(EObject value);

	/**
	 * Returns the value of the '<em><b>F404036</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404036</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404036</em>' containment reference.
	 * @see #setF404036(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404036()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404036' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404036();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404036 <em>F404036</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404036</em>' containment reference.
	 * @see #getF404036()
	 * @generated
	 */
	void setF404036(EObject value);

	/**
	 * Returns the value of the '<em><b>F404037</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404037</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404037</em>' containment reference.
	 * @see #setF404037(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404037()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404037' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404037();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404037 <em>F404037</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404037</em>' containment reference.
	 * @see #getF404037()
	 * @generated
	 */
	void setF404037(EObject value);

	/**
	 * Returns the value of the '<em><b>F404038</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404038</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404038</em>' containment reference.
	 * @see #setF404038(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404038()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404038' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404038();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404038 <em>F404038</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404038</em>' containment reference.
	 * @see #getF404038()
	 * @generated
	 */
	void setF404038(EObject value);

	/**
	 * Returns the value of the '<em><b>F404039</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404039</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404039</em>' containment reference.
	 * @see #setF404039(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404039()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404039' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404039();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404039 <em>F404039</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404039</em>' containment reference.
	 * @see #getF404039()
	 * @generated
	 */
	void setF404039(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 3a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 3a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 3a</em>' containment reference.
	 * @see #setF40403a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40403a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40403a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40403a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40403a <em>F4040 3a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 3a</em>' containment reference.
	 * @see #getF40403a()
	 * @generated
	 */
	void setF40403a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 3b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 3b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 3b</em>' containment reference.
	 * @see #setF40403b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40403b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40403b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40403b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40403b <em>F4040 3b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 3b</em>' containment reference.
	 * @see #getF40403b()
	 * @generated
	 */
	void setF40403b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 3c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 3c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 3c</em>' containment reference.
	 * @see #setF40403c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40403c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40403c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40403c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40403c <em>F4040 3c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 3c</em>' containment reference.
	 * @see #getF40403c()
	 * @generated
	 */
	void setF40403c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 3d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 3d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 3d</em>' containment reference.
	 * @see #setF40403d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40403d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40403d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40403d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40403d <em>F4040 3d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 3d</em>' containment reference.
	 * @see #getF40403d()
	 * @generated
	 */
	void setF40403d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 3e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 3e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 3e</em>' containment reference.
	 * @see #setF40403e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40403e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40403e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40403e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40403e <em>F4040 3e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 3e</em>' containment reference.
	 * @see #getF40403e()
	 * @generated
	 */
	void setF40403e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 3f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 3f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 3f</em>' containment reference.
	 * @see #setF40403f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40403f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40403f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40403f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40403f <em>F4040 3f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 3f</em>' containment reference.
	 * @see #getF40403f()
	 * @generated
	 */
	void setF40403f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404040</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404040</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404040</em>' containment reference.
	 * @see #setF404040(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404040()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404040' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404040();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404040 <em>F404040</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404040</em>' containment reference.
	 * @see #getF404040()
	 * @generated
	 */
	void setF404040(EObject value);

	/**
	 * Returns the value of the '<em><b>F404041</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404041</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404041</em>' containment reference.
	 * @see #setF404041(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404041()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404041' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404041();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404041 <em>F404041</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404041</em>' containment reference.
	 * @see #getF404041()
	 * @generated
	 */
	void setF404041(EObject value);

	/**
	 * Returns the value of the '<em><b>F404042</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404042</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404042</em>' containment reference.
	 * @see #setF404042(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404042()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404042' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404042();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404042 <em>F404042</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404042</em>' containment reference.
	 * @see #getF404042()
	 * @generated
	 */
	void setF404042(EObject value);

	/**
	 * Returns the value of the '<em><b>F404043</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404043</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404043</em>' containment reference.
	 * @see #setF404043(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404043()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404043' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404043();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404043 <em>F404043</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404043</em>' containment reference.
	 * @see #getF404043()
	 * @generated
	 */
	void setF404043(EObject value);

	/**
	 * Returns the value of the '<em><b>F404044</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404044</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404044</em>' containment reference.
	 * @see #setF404044(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404044()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404044' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404044();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404044 <em>F404044</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404044</em>' containment reference.
	 * @see #getF404044()
	 * @generated
	 */
	void setF404044(EObject value);

	/**
	 * Returns the value of the '<em><b>F404045</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404045</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404045</em>' containment reference.
	 * @see #setF404045(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404045()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404045' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404045();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404045 <em>F404045</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404045</em>' containment reference.
	 * @see #getF404045()
	 * @generated
	 */
	void setF404045(EObject value);

	/**
	 * Returns the value of the '<em><b>F404046</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404046</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404046</em>' containment reference.
	 * @see #setF404046(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404046()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404046' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404046();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404046 <em>F404046</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404046</em>' containment reference.
	 * @see #getF404046()
	 * @generated
	 */
	void setF404046(EObject value);

	/**
	 * Returns the value of the '<em><b>F404047</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404047</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404047</em>' containment reference.
	 * @see #setF404047(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404047()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404047' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404047();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404047 <em>F404047</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404047</em>' containment reference.
	 * @see #getF404047()
	 * @generated
	 */
	void setF404047(EObject value);

	/**
	 * Returns the value of the '<em><b>F404048</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404048</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404048</em>' containment reference.
	 * @see #setF404048(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404048()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404048' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404048();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404048 <em>F404048</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404048</em>' containment reference.
	 * @see #getF404048()
	 * @generated
	 */
	void setF404048(EObject value);

	/**
	 * Returns the value of the '<em><b>F404049</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404049</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404049</em>' containment reference.
	 * @see #setF404049(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404049()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404049' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404049();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404049 <em>F404049</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404049</em>' containment reference.
	 * @see #getF404049()
	 * @generated
	 */
	void setF404049(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 4a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 4a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 4a</em>' containment reference.
	 * @see #setF40404a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40404a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40404a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40404a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40404a <em>F4040 4a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 4a</em>' containment reference.
	 * @see #getF40404a()
	 * @generated
	 */
	void setF40404a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 4b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 4b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 4b</em>' containment reference.
	 * @see #setF40404b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40404b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40404b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40404b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40404b <em>F4040 4b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 4b</em>' containment reference.
	 * @see #getF40404b()
	 * @generated
	 */
	void setF40404b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 4c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 4c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 4c</em>' containment reference.
	 * @see #setF40404c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40404c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40404c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40404c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40404c <em>F4040 4c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 4c</em>' containment reference.
	 * @see #getF40404c()
	 * @generated
	 */
	void setF40404c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 4d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 4d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 4d</em>' containment reference.
	 * @see #setF40404d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40404d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40404d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40404d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40404d <em>F4040 4d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 4d</em>' containment reference.
	 * @see #getF40404d()
	 * @generated
	 */
	void setF40404d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 4e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 4e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 4e</em>' containment reference.
	 * @see #setF40404e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40404e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40404e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40404e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40404e <em>F4040 4e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 4e</em>' containment reference.
	 * @see #getF40404e()
	 * @generated
	 */
	void setF40404e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 4f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 4f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 4f</em>' containment reference.
	 * @see #setF40404f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40404f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40404f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40404f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40404f <em>F4040 4f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 4f</em>' containment reference.
	 * @see #getF40404f()
	 * @generated
	 */
	void setF40404f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404050</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404050</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404050</em>' containment reference.
	 * @see #setF404050(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404050()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404050' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404050();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404050 <em>F404050</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404050</em>' containment reference.
	 * @see #getF404050()
	 * @generated
	 */
	void setF404050(EObject value);

	/**
	 * Returns the value of the '<em><b>F404051</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404051</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404051</em>' containment reference.
	 * @see #setF404051(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404051()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404051' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404051();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404051 <em>F404051</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404051</em>' containment reference.
	 * @see #getF404051()
	 * @generated
	 */
	void setF404051(EObject value);

	/**
	 * Returns the value of the '<em><b>F404052</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404052</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404052</em>' containment reference.
	 * @see #setF404052(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404052()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404052' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404052();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404052 <em>F404052</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404052</em>' containment reference.
	 * @see #getF404052()
	 * @generated
	 */
	void setF404052(EObject value);

	/**
	 * Returns the value of the '<em><b>F404053</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404053</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404053</em>' containment reference.
	 * @see #setF404053(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404053()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404053' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404053();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404053 <em>F404053</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404053</em>' containment reference.
	 * @see #getF404053()
	 * @generated
	 */
	void setF404053(EObject value);

	/**
	 * Returns the value of the '<em><b>F404054</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404054</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404054</em>' containment reference.
	 * @see #setF404054(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404054()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404054' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404054();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404054 <em>F404054</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404054</em>' containment reference.
	 * @see #getF404054()
	 * @generated
	 */
	void setF404054(EObject value);

	/**
	 * Returns the value of the '<em><b>F404055</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404055</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404055</em>' containment reference.
	 * @see #setF404055(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404055()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404055' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404055();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404055 <em>F404055</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404055</em>' containment reference.
	 * @see #getF404055()
	 * @generated
	 */
	void setF404055(EObject value);

	/**
	 * Returns the value of the '<em><b>F404056</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404056</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404056</em>' containment reference.
	 * @see #setF404056(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404056()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404056' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404056();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404056 <em>F404056</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404056</em>' containment reference.
	 * @see #getF404056()
	 * @generated
	 */
	void setF404056(EObject value);

	/**
	 * Returns the value of the '<em><b>F404057</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404057</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404057</em>' containment reference.
	 * @see #setF404057(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404057()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404057' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404057();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404057 <em>F404057</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404057</em>' containment reference.
	 * @see #getF404057()
	 * @generated
	 */
	void setF404057(EObject value);

	/**
	 * Returns the value of the '<em><b>F404058</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404058</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404058</em>' containment reference.
	 * @see #setF404058(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404058()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404058' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404058();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404058 <em>F404058</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404058</em>' containment reference.
	 * @see #getF404058()
	 * @generated
	 */
	void setF404058(EObject value);

	/**
	 * Returns the value of the '<em><b>F404059</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404059</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404059</em>' containment reference.
	 * @see #setF404059(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404059()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404059' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404059();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404059 <em>F404059</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404059</em>' containment reference.
	 * @see #getF404059()
	 * @generated
	 */
	void setF404059(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 5a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 5a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 5a</em>' containment reference.
	 * @see #setF40405a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40405a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40405a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40405a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40405a <em>F4040 5a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 5a</em>' containment reference.
	 * @see #getF40405a()
	 * @generated
	 */
	void setF40405a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 5b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 5b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 5b</em>' containment reference.
	 * @see #setF40405b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40405b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40405b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40405b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40405b <em>F4040 5b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 5b</em>' containment reference.
	 * @see #getF40405b()
	 * @generated
	 */
	void setF40405b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 5c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 5c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 5c</em>' containment reference.
	 * @see #setF40405c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40405c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40405c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40405c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40405c <em>F4040 5c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 5c</em>' containment reference.
	 * @see #getF40405c()
	 * @generated
	 */
	void setF40405c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 5d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 5d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 5d</em>' containment reference.
	 * @see #setF40405d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40405d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40405d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40405d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40405d <em>F4040 5d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 5d</em>' containment reference.
	 * @see #getF40405d()
	 * @generated
	 */
	void setF40405d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 5e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 5e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 5e</em>' containment reference.
	 * @see #setF40405e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40405e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40405e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40405e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40405e <em>F4040 5e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 5e</em>' containment reference.
	 * @see #getF40405e()
	 * @generated
	 */
	void setF40405e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 5f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 5f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 5f</em>' containment reference.
	 * @see #setF40405f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40405f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40405f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40405f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40405f <em>F4040 5f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 5f</em>' containment reference.
	 * @see #getF40405f()
	 * @generated
	 */
	void setF40405f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404060</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404060</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404060</em>' containment reference.
	 * @see #setF404060(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404060()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404060' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404060();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404060 <em>F404060</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404060</em>' containment reference.
	 * @see #getF404060()
	 * @generated
	 */
	void setF404060(EObject value);

	/**
	 * Returns the value of the '<em><b>F404061</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404061</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404061</em>' containment reference.
	 * @see #setF404061(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404061()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404061' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404061();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404061 <em>F404061</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404061</em>' containment reference.
	 * @see #getF404061()
	 * @generated
	 */
	void setF404061(EObject value);

	/**
	 * Returns the value of the '<em><b>F404062</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404062</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404062</em>' containment reference.
	 * @see #setF404062(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404062()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404062' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404062();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404062 <em>F404062</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404062</em>' containment reference.
	 * @see #getF404062()
	 * @generated
	 */
	void setF404062(EObject value);

	/**
	 * Returns the value of the '<em><b>F404063</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404063</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404063</em>' containment reference.
	 * @see #setF404063(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404063()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404063' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404063();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404063 <em>F404063</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404063</em>' containment reference.
	 * @see #getF404063()
	 * @generated
	 */
	void setF404063(EObject value);

	/**
	 * Returns the value of the '<em><b>F404064</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404064</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404064</em>' containment reference.
	 * @see #setF404064(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404064()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404064' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404064();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404064 <em>F404064</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404064</em>' containment reference.
	 * @see #getF404064()
	 * @generated
	 */
	void setF404064(EObject value);

	/**
	 * Returns the value of the '<em><b>F404065</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404065</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404065</em>' containment reference.
	 * @see #setF404065(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404065()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404065' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404065();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404065 <em>F404065</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404065</em>' containment reference.
	 * @see #getF404065()
	 * @generated
	 */
	void setF404065(EObject value);

	/**
	 * Returns the value of the '<em><b>F404066</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404066</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404066</em>' containment reference.
	 * @see #setF404066(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404066()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404066' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404066();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404066 <em>F404066</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404066</em>' containment reference.
	 * @see #getF404066()
	 * @generated
	 */
	void setF404066(EObject value);

	/**
	 * Returns the value of the '<em><b>F404067</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404067</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404067</em>' containment reference.
	 * @see #setF404067(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404067()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404067' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404067();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404067 <em>F404067</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404067</em>' containment reference.
	 * @see #getF404067()
	 * @generated
	 */
	void setF404067(EObject value);

	/**
	 * Returns the value of the '<em><b>F404068</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404068</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404068</em>' containment reference.
	 * @see #setF404068(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404068()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404068' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404068();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404068 <em>F404068</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404068</em>' containment reference.
	 * @see #getF404068()
	 * @generated
	 */
	void setF404068(EObject value);

	/**
	 * Returns the value of the '<em><b>F404069</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404069</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404069</em>' containment reference.
	 * @see #setF404069(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404069()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404069' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404069();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404069 <em>F404069</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404069</em>' containment reference.
	 * @see #getF404069()
	 * @generated
	 */
	void setF404069(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 6a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 6a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 6a</em>' containment reference.
	 * @see #setF40406a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40406a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40406a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40406a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40406a <em>F4040 6a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 6a</em>' containment reference.
	 * @see #getF40406a()
	 * @generated
	 */
	void setF40406a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 6b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 6b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 6b</em>' containment reference.
	 * @see #setF40406b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40406b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40406b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40406b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40406b <em>F4040 6b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 6b</em>' containment reference.
	 * @see #getF40406b()
	 * @generated
	 */
	void setF40406b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 6c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 6c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 6c</em>' containment reference.
	 * @see #setF40406c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40406c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40406c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40406c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40406c <em>F4040 6c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 6c</em>' containment reference.
	 * @see #getF40406c()
	 * @generated
	 */
	void setF40406c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 6d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 6d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 6d</em>' containment reference.
	 * @see #setF40406d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40406d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40406d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40406d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40406d <em>F4040 6d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 6d</em>' containment reference.
	 * @see #getF40406d()
	 * @generated
	 */
	void setF40406d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 6e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 6e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 6e</em>' containment reference.
	 * @see #setF40406e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40406e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40406e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40406e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40406e <em>F4040 6e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 6e</em>' containment reference.
	 * @see #getF40406e()
	 * @generated
	 */
	void setF40406e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 6f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 6f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 6f</em>' containment reference.
	 * @see #setF40406f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40406f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40406f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40406f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40406f <em>F4040 6f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 6f</em>' containment reference.
	 * @see #getF40406f()
	 * @generated
	 */
	void setF40406f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404070</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404070</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404070</em>' containment reference.
	 * @see #setF404070(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404070()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404070' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404070();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404070 <em>F404070</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404070</em>' containment reference.
	 * @see #getF404070()
	 * @generated
	 */
	void setF404070(EObject value);

	/**
	 * Returns the value of the '<em><b>F404071</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404071</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404071</em>' containment reference.
	 * @see #setF404071(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404071()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404071' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404071();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404071 <em>F404071</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404071</em>' containment reference.
	 * @see #getF404071()
	 * @generated
	 */
	void setF404071(EObject value);

	/**
	 * Returns the value of the '<em><b>F404072</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404072</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404072</em>' containment reference.
	 * @see #setF404072(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404072()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404072' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404072();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404072 <em>F404072</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404072</em>' containment reference.
	 * @see #getF404072()
	 * @generated
	 */
	void setF404072(EObject value);

	/**
	 * Returns the value of the '<em><b>F404073</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404073</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404073</em>' containment reference.
	 * @see #setF404073(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404073()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404073' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404073();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404073 <em>F404073</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404073</em>' containment reference.
	 * @see #getF404073()
	 * @generated
	 */
	void setF404073(EObject value);

	/**
	 * Returns the value of the '<em><b>F404074</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404074</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404074</em>' containment reference.
	 * @see #setF404074(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404074()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404074' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404074();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404074 <em>F404074</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404074</em>' containment reference.
	 * @see #getF404074()
	 * @generated
	 */
	void setF404074(EObject value);

	/**
	 * Returns the value of the '<em><b>F404075</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404075</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404075</em>' containment reference.
	 * @see #setF404075(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404075()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404075' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404075();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404075 <em>F404075</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404075</em>' containment reference.
	 * @see #getF404075()
	 * @generated
	 */
	void setF404075(EObject value);

	/**
	 * Returns the value of the '<em><b>F404076</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404076</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404076</em>' containment reference.
	 * @see #setF404076(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404076()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404076' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404076();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404076 <em>F404076</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404076</em>' containment reference.
	 * @see #getF404076()
	 * @generated
	 */
	void setF404076(EObject value);

	/**
	 * Returns the value of the '<em><b>F404077</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404077</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404077</em>' containment reference.
	 * @see #setF404077(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404077()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404077' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404077();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404077 <em>F404077</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404077</em>' containment reference.
	 * @see #getF404077()
	 * @generated
	 */
	void setF404077(EObject value);

	/**
	 * Returns the value of the '<em><b>F404078</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404078</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404078</em>' containment reference.
	 * @see #setF404078(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404078()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404078' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404078();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404078 <em>F404078</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404078</em>' containment reference.
	 * @see #getF404078()
	 * @generated
	 */
	void setF404078(EObject value);

	/**
	 * Returns the value of the '<em><b>F404079</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404079</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404079</em>' containment reference.
	 * @see #setF404079(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404079()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404079' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404079();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404079 <em>F404079</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404079</em>' containment reference.
	 * @see #getF404079()
	 * @generated
	 */
	void setF404079(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 7a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 7a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 7a</em>' containment reference.
	 * @see #setF40407a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40407a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40407a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40407a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40407a <em>F4040 7a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 7a</em>' containment reference.
	 * @see #getF40407a()
	 * @generated
	 */
	void setF40407a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 7b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 7b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 7b</em>' containment reference.
	 * @see #setF40407b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40407b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40407b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40407b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40407b <em>F4040 7b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 7b</em>' containment reference.
	 * @see #getF40407b()
	 * @generated
	 */
	void setF40407b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 7c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 7c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 7c</em>' containment reference.
	 * @see #setF40407c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40407c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40407c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40407c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40407c <em>F4040 7c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 7c</em>' containment reference.
	 * @see #getF40407c()
	 * @generated
	 */
	void setF40407c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 7d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 7d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 7d</em>' containment reference.
	 * @see #setF40407d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40407d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40407d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40407d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40407d <em>F4040 7d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 7d</em>' containment reference.
	 * @see #getF40407d()
	 * @generated
	 */
	void setF40407d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 7e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 7e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 7e</em>' containment reference.
	 * @see #setF40407e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40407e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40407e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40407e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40407e <em>F4040 7e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 7e</em>' containment reference.
	 * @see #getF40407e()
	 * @generated
	 */
	void setF40407e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 7f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 7f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 7f</em>' containment reference.
	 * @see #setF40407f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40407f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40407f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40407f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40407f <em>F4040 7f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 7f</em>' containment reference.
	 * @see #getF40407f()
	 * @generated
	 */
	void setF40407f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404080</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404080</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404080</em>' containment reference.
	 * @see #setF404080(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404080()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404080' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404080();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404080 <em>F404080</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404080</em>' containment reference.
	 * @see #getF404080()
	 * @generated
	 */
	void setF404080(EObject value);

	/**
	 * Returns the value of the '<em><b>F404081</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404081</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404081</em>' containment reference.
	 * @see #setF404081(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404081()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404081' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404081();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404081 <em>F404081</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404081</em>' containment reference.
	 * @see #getF404081()
	 * @generated
	 */
	void setF404081(EObject value);

	/**
	 * Returns the value of the '<em><b>F404082</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404082</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404082</em>' containment reference.
	 * @see #setF404082(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404082()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404082' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404082();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404082 <em>F404082</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404082</em>' containment reference.
	 * @see #getF404082()
	 * @generated
	 */
	void setF404082(EObject value);

	/**
	 * Returns the value of the '<em><b>F404083</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404083</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404083</em>' containment reference.
	 * @see #setF404083(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404083()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404083' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404083();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404083 <em>F404083</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404083</em>' containment reference.
	 * @see #getF404083()
	 * @generated
	 */
	void setF404083(EObject value);

	/**
	 * Returns the value of the '<em><b>F404084</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404084</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404084</em>' containment reference.
	 * @see #setF404084(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404084()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404084' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404084();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404084 <em>F404084</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404084</em>' containment reference.
	 * @see #getF404084()
	 * @generated
	 */
	void setF404084(EObject value);

	/**
	 * Returns the value of the '<em><b>F404085</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404085</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404085</em>' containment reference.
	 * @see #setF404085(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404085()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404085' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404085();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404085 <em>F404085</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404085</em>' containment reference.
	 * @see #getF404085()
	 * @generated
	 */
	void setF404085(EObject value);

	/**
	 * Returns the value of the '<em><b>F404086</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404086</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404086</em>' containment reference.
	 * @see #setF404086(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404086()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404086' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404086();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404086 <em>F404086</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404086</em>' containment reference.
	 * @see #getF404086()
	 * @generated
	 */
	void setF404086(EObject value);

	/**
	 * Returns the value of the '<em><b>F404087</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404087</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404087</em>' containment reference.
	 * @see #setF404087(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404087()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404087' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404087();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404087 <em>F404087</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404087</em>' containment reference.
	 * @see #getF404087()
	 * @generated
	 */
	void setF404087(EObject value);

	/**
	 * Returns the value of the '<em><b>F404088</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404088</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404088</em>' containment reference.
	 * @see #setF404088(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404088()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404088' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404088();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404088 <em>F404088</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404088</em>' containment reference.
	 * @see #getF404088()
	 * @generated
	 */
	void setF404088(EObject value);

	/**
	 * Returns the value of the '<em><b>F404089</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404089</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404089</em>' containment reference.
	 * @see #setF404089(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404089()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404089' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404089();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404089 <em>F404089</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404089</em>' containment reference.
	 * @see #getF404089()
	 * @generated
	 */
	void setF404089(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 8a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 8a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 8a</em>' containment reference.
	 * @see #setF40408a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40408a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40408a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40408a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40408a <em>F4040 8a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 8a</em>' containment reference.
	 * @see #getF40408a()
	 * @generated
	 */
	void setF40408a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 8b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 8b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 8b</em>' containment reference.
	 * @see #setF40408b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40408b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40408b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40408b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40408b <em>F4040 8b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 8b</em>' containment reference.
	 * @see #getF40408b()
	 * @generated
	 */
	void setF40408b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 8c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 8c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 8c</em>' containment reference.
	 * @see #setF40408c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40408c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40408c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40408c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40408c <em>F4040 8c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 8c</em>' containment reference.
	 * @see #getF40408c()
	 * @generated
	 */
	void setF40408c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 8d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 8d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 8d</em>' containment reference.
	 * @see #setF40408d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40408d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40408d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40408d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40408d <em>F4040 8d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 8d</em>' containment reference.
	 * @see #getF40408d()
	 * @generated
	 */
	void setF40408d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 8e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 8e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 8e</em>' containment reference.
	 * @see #setF40408e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40408e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40408e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40408e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40408e <em>F4040 8e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 8e</em>' containment reference.
	 * @see #getF40408e()
	 * @generated
	 */
	void setF40408e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 8f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 8f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 8f</em>' containment reference.
	 * @see #setF40408f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40408f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40408f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40408f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40408f <em>F4040 8f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 8f</em>' containment reference.
	 * @see #getF40408f()
	 * @generated
	 */
	void setF40408f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404090</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404090</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404090</em>' containment reference.
	 * @see #setF404090(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404090()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404090' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404090();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404090 <em>F404090</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404090</em>' containment reference.
	 * @see #getF404090()
	 * @generated
	 */
	void setF404090(EObject value);

	/**
	 * Returns the value of the '<em><b>F404091</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404091</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404091</em>' containment reference.
	 * @see #setF404091(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404091()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404091' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404091();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404091 <em>F404091</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404091</em>' containment reference.
	 * @see #getF404091()
	 * @generated
	 */
	void setF404091(EObject value);

	/**
	 * Returns the value of the '<em><b>F404092</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404092</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404092</em>' containment reference.
	 * @see #setF404092(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404092()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404092' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404092();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404092 <em>F404092</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404092</em>' containment reference.
	 * @see #getF404092()
	 * @generated
	 */
	void setF404092(EObject value);

	/**
	 * Returns the value of the '<em><b>F404093</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404093</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404093</em>' containment reference.
	 * @see #setF404093(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404093()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404093' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404093();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404093 <em>F404093</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404093</em>' containment reference.
	 * @see #getF404093()
	 * @generated
	 */
	void setF404093(EObject value);

	/**
	 * Returns the value of the '<em><b>F404094</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404094</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404094</em>' containment reference.
	 * @see #setF404094(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404094()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404094' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404094();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404094 <em>F404094</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404094</em>' containment reference.
	 * @see #getF404094()
	 * @generated
	 */
	void setF404094(EObject value);

	/**
	 * Returns the value of the '<em><b>F404095</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404095</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404095</em>' containment reference.
	 * @see #setF404095(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404095()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404095' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404095();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404095 <em>F404095</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404095</em>' containment reference.
	 * @see #getF404095()
	 * @generated
	 */
	void setF404095(EObject value);

	/**
	 * Returns the value of the '<em><b>F404096</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404096</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404096</em>' containment reference.
	 * @see #setF404096(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404096()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404096' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404096();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404096 <em>F404096</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404096</em>' containment reference.
	 * @see #getF404096()
	 * @generated
	 */
	void setF404096(EObject value);

	/**
	 * Returns the value of the '<em><b>F404097</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404097</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404097</em>' containment reference.
	 * @see #setF404097(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404097()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404097' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404097();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404097 <em>F404097</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404097</em>' containment reference.
	 * @see #getF404097()
	 * @generated
	 */
	void setF404097(EObject value);

	/**
	 * Returns the value of the '<em><b>F404098</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404098</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404098</em>' containment reference.
	 * @see #setF404098(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404098()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404098' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404098();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404098 <em>F404098</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404098</em>' containment reference.
	 * @see #getF404098()
	 * @generated
	 */
	void setF404098(EObject value);

	/**
	 * Returns the value of the '<em><b>F404099</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404099</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404099</em>' containment reference.
	 * @see #setF404099(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F404099()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f404099' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF404099();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF404099 <em>F404099</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404099</em>' containment reference.
	 * @see #getF404099()
	 * @generated
	 */
	void setF404099(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 9a</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 9a</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 9a</em>' containment reference.
	 * @see #setF40409a(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40409a()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40409a' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40409a();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40409a <em>F4040 9a</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 9a</em>' containment reference.
	 * @see #getF40409a()
	 * @generated
	 */
	void setF40409a(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 9b</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 9b</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 9b</em>' containment reference.
	 * @see #setF40409b(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40409b()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40409b' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40409b();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40409b <em>F4040 9b</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 9b</em>' containment reference.
	 * @see #getF40409b()
	 * @generated
	 */
	void setF40409b(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 9c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 9c</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 9c</em>' containment reference.
	 * @see #setF40409c(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40409c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40409c' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40409c();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40409c <em>F4040 9c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 9c</em>' containment reference.
	 * @see #getF40409c()
	 * @generated
	 */
	void setF40409c(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 9d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 9d</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 9d</em>' containment reference.
	 * @see #setF40409d(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40409d()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40409d' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40409d();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40409d <em>F4040 9d</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 9d</em>' containment reference.
	 * @see #getF40409d()
	 * @generated
	 */
	void setF40409d(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 9e</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 9e</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 9e</em>' containment reference.
	 * @see #setF40409e(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40409e()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40409e' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40409e();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40409e <em>F4040 9e</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 9e</em>' containment reference.
	 * @see #getF40409e()
	 * @generated
	 */
	void setF40409e(EObject value);

	/**
	 * Returns the value of the '<em><b>F4040 9f</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F4040 9f</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F4040 9f</em>' containment reference.
	 * @see #setF40409f(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F40409f()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f40409f' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF40409f();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF40409f <em>F4040 9f</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F4040 9f</em>' containment reference.
	 * @see #getF40409f()
	 * @generated
	 */
	void setF40409f(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a0</em>' containment reference.
	 * @see #setF4040a0(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a0()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a0' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a0();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a0 <em>F404 0a0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a0</em>' containment reference.
	 * @see #getF4040a0()
	 * @generated
	 */
	void setF4040a0(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a1</em>' containment reference.
	 * @see #setF4040a1(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a1' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a1();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a1 <em>F404 0a1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a1</em>' containment reference.
	 * @see #getF4040a1()
	 * @generated
	 */
	void setF4040a1(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a2</em>' containment reference.
	 * @see #setF4040a2(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a2' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a2();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a2 <em>F404 0a2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a2</em>' containment reference.
	 * @see #getF4040a2()
	 * @generated
	 */
	void setF4040a2(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a3</em>' containment reference.
	 * @see #setF4040a3(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a3' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a3();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a3 <em>F404 0a3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a3</em>' containment reference.
	 * @see #getF4040a3()
	 * @generated
	 */
	void setF4040a3(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a4</em>' containment reference.
	 * @see #setF4040a4(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a4' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a4();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a4 <em>F404 0a4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a4</em>' containment reference.
	 * @see #getF4040a4()
	 * @generated
	 */
	void setF4040a4(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a5</em>' containment reference.
	 * @see #setF4040a5(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a5' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a5();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a5 <em>F404 0a5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a5</em>' containment reference.
	 * @see #getF4040a5()
	 * @generated
	 */
	void setF4040a5(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a6</em>' containment reference.
	 * @see #setF4040a6(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a6' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a6();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a6 <em>F404 0a6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a6</em>' containment reference.
	 * @see #getF4040a6()
	 * @generated
	 */
	void setF4040a6(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a7</em>' containment reference.
	 * @see #setF4040a7(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a7' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a7();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a7 <em>F404 0a7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a7</em>' containment reference.
	 * @see #getF4040a7()
	 * @generated
	 */
	void setF4040a7(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a8</em>' containment reference.
	 * @see #setF4040a8(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a8' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a8();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a8 <em>F404 0a8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a8</em>' containment reference.
	 * @see #getF4040a8()
	 * @generated
	 */
	void setF4040a8(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0a9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0a9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0a9</em>' containment reference.
	 * @see #setF4040a9(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040a9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040a9' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040a9();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040a9 <em>F404 0a9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0a9</em>' containment reference.
	 * @see #getF4040a9()
	 * @generated
	 */
	void setF4040a9(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0aa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0aa</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0aa</em>' containment reference.
	 * @see #setF4040aa(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040aa()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040aa' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040aa();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040aa <em>F404 0aa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0aa</em>' containment reference.
	 * @see #getF4040aa()
	 * @generated
	 */
	void setF4040aa(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0ab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0ab</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0ab</em>' containment reference.
	 * @see #setF4040ab(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040ab()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040ab' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040ab();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040ab <em>F404 0ab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0ab</em>' containment reference.
	 * @see #getF4040ab()
	 * @generated
	 */
	void setF4040ab(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0ac</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0ac</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0ac</em>' containment reference.
	 * @see #setF4040ac(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040ac()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040ac' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040ac();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040ac <em>F404 0ac</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0ac</em>' containment reference.
	 * @see #getF4040ac()
	 * @generated
	 */
	void setF4040ac(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0ad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0ad</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0ad</em>' containment reference.
	 * @see #setF4040ad(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040ad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040ad' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040ad();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040ad <em>F404 0ad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0ad</em>' containment reference.
	 * @see #getF4040ad()
	 * @generated
	 */
	void setF4040ad(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0ae</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0ae</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0ae</em>' containment reference.
	 * @see #setF4040ae(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040ae()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040ae' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040ae();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040ae <em>F404 0ae</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0ae</em>' containment reference.
	 * @see #getF4040ae()
	 * @generated
	 */
	void setF4040ae(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0af</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0af</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0af</em>' containment reference.
	 * @see #setF4040af(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040af()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040af' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040af();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040af <em>F404 0af</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0af</em>' containment reference.
	 * @see #getF4040af()
	 * @generated
	 */
	void setF4040af(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b0</em>' containment reference.
	 * @see #setF4040b0(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b0()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b0' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b0();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b0 <em>F404 0b0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b0</em>' containment reference.
	 * @see #getF4040b0()
	 * @generated
	 */
	void setF4040b0(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b1</em>' containment reference.
	 * @see #setF4040b1(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b1' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b1();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b1 <em>F404 0b1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b1</em>' containment reference.
	 * @see #getF4040b1()
	 * @generated
	 */
	void setF4040b1(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b2</em>' containment reference.
	 * @see #setF4040b2(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b2' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b2();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b2 <em>F404 0b2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b2</em>' containment reference.
	 * @see #getF4040b2()
	 * @generated
	 */
	void setF4040b2(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b3</em>' containment reference.
	 * @see #setF4040b3(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b3' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b3();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b3 <em>F404 0b3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b3</em>' containment reference.
	 * @see #getF4040b3()
	 * @generated
	 */
	void setF4040b3(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b4</em>' containment reference.
	 * @see #setF4040b4(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b4' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b4();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b4 <em>F404 0b4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b4</em>' containment reference.
	 * @see #getF4040b4()
	 * @generated
	 */
	void setF4040b4(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b5</em>' containment reference.
	 * @see #setF4040b5(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b5' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b5();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b5 <em>F404 0b5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b5</em>' containment reference.
	 * @see #getF4040b5()
	 * @generated
	 */
	void setF4040b5(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b6</em>' containment reference.
	 * @see #setF4040b6(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b6' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b6();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b6 <em>F404 0b6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b6</em>' containment reference.
	 * @see #getF4040b6()
	 * @generated
	 */
	void setF4040b6(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b7</em>' containment reference.
	 * @see #setF4040b7(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b7' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b7();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b7 <em>F404 0b7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b7</em>' containment reference.
	 * @see #getF4040b7()
	 * @generated
	 */
	void setF4040b7(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b8</em>' containment reference.
	 * @see #setF4040b8(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b8' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b8();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b8 <em>F404 0b8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b8</em>' containment reference.
	 * @see #getF4040b8()
	 * @generated
	 */
	void setF4040b8(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0b9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0b9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0b9</em>' containment reference.
	 * @see #setF4040b9(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040b9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040b9' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040b9();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040b9 <em>F404 0b9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0b9</em>' containment reference.
	 * @see #getF4040b9()
	 * @generated
	 */
	void setF4040b9(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0ba</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0ba</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0ba</em>' containment reference.
	 * @see #setF4040ba(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040ba()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040ba' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040ba();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040ba <em>F404 0ba</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0ba</em>' containment reference.
	 * @see #getF4040ba()
	 * @generated
	 */
	void setF4040ba(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0bb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0bb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0bb</em>' containment reference.
	 * @see #setF4040bb(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040bb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040bb' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040bb();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040bb <em>F404 0bb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0bb</em>' containment reference.
	 * @see #getF4040bb()
	 * @generated
	 */
	void setF4040bb(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0bc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0bc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0bc</em>' containment reference.
	 * @see #setF4040bc(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040bc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040bc' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040bc();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040bc <em>F404 0bc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0bc</em>' containment reference.
	 * @see #getF4040bc()
	 * @generated
	 */
	void setF4040bc(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0bd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0bd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0bd</em>' containment reference.
	 * @see #setF4040bd(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040bd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040bd' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040bd();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040bd <em>F404 0bd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0bd</em>' containment reference.
	 * @see #getF4040bd()
	 * @generated
	 */
	void setF4040bd(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0be</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0be</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0be</em>' containment reference.
	 * @see #setF4040be(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040be()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040be' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040be();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040be <em>F404 0be</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0be</em>' containment reference.
	 * @see #getF4040be()
	 * @generated
	 */
	void setF4040be(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0bf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0bf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0bf</em>' containment reference.
	 * @see #setF4040bf(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040bf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040bf' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040bf();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040bf <em>F404 0bf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0bf</em>' containment reference.
	 * @see #getF4040bf()
	 * @generated
	 */
	void setF4040bf(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c0</em>' containment reference.
	 * @see #setF4040c0(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c0()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c0' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c0();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c0 <em>F404 0c0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c0</em>' containment reference.
	 * @see #getF4040c0()
	 * @generated
	 */
	void setF4040c0(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c1</em>' containment reference.
	 * @see #setF4040c1(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c1' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c1();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c1 <em>F404 0c1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c1</em>' containment reference.
	 * @see #getF4040c1()
	 * @generated
	 */
	void setF4040c1(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c2</em>' containment reference.
	 * @see #setF4040c2(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c2' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c2();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c2 <em>F404 0c2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c2</em>' containment reference.
	 * @see #getF4040c2()
	 * @generated
	 */
	void setF4040c2(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c3</em>' containment reference.
	 * @see #setF4040c3(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c3' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c3();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c3 <em>F404 0c3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c3</em>' containment reference.
	 * @see #getF4040c3()
	 * @generated
	 */
	void setF4040c3(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c4</em>' containment reference.
	 * @see #setF4040c4(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c4' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c4();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c4 <em>F404 0c4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c4</em>' containment reference.
	 * @see #getF4040c4()
	 * @generated
	 */
	void setF4040c4(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c5</em>' containment reference.
	 * @see #setF4040c5(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c5' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c5();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c5 <em>F404 0c5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c5</em>' containment reference.
	 * @see #getF4040c5()
	 * @generated
	 */
	void setF4040c5(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c6</em>' containment reference.
	 * @see #setF4040c6(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c6' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c6();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c6 <em>F404 0c6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c6</em>' containment reference.
	 * @see #getF4040c6()
	 * @generated
	 */
	void setF4040c6(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c7</em>' containment reference.
	 * @see #setF4040c7(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c7' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c7();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c7 <em>F404 0c7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c7</em>' containment reference.
	 * @see #getF4040c7()
	 * @generated
	 */
	void setF4040c7(EObject value);

	/**
	 * Returns the value of the '<em><b>F404 0c8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F404 0c8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F404 0c8</em>' containment reference.
	 * @see #setF4040c8(EObject)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_F4040c8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='f4040c8' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getF4040c8();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AssignmentType#getF4040c8 <em>F404 0c8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F404 0c8</em>' containment reference.
	 * @see #getF4040c8()
	 * @generated
	 */
	void setF4040c8(EObject value);

	/**
	 * Returns the value of the '<em><b>Timephased Data</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.TimephasedDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time phased data associated with the assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timephased Data</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getAssignmentType_TimephasedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimephasedData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimephasedDataType> getTimephasedData();

} // AssignmentType
