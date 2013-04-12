/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.io.IOException;

import java.net.URL;

import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.MspdiPackage;

import net.certware.planning.mspdi.util.MspdiValidator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MspdiPackageImpl extends EPackageImpl implements MspdiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "mspdi.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityPeriodsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityPeriodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baselineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baselineType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baselineType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedAttributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedAttributeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedAttributeType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedAttributeType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlineCodesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlineCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlineCodeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlineCodeType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predecessorLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePeriodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePeriodType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePeriodType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timephasedDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wbsMasksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wbsMaskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekDaysTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekDayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekDayType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingTimesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingTimesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingTimeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workWeeksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workWeekTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accrueAtTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum baselineForEarnedValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bookingTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bookingTypeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calculationTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cfTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commitmentTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum costRateTableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currencySymbolPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayTypeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultFixedCostAccrualTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultTaskEVMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultTaskTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationFormatType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationFormatType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationFormatType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationFormatType4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationFormatType5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum earnedValueMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum earnedValueMethodType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elemTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fixedCostAccrualTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fyStartDateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lagFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelingDelayFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelingDelayFormatType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monthItemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monthPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monthTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum newTaskStartDateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overtimeRateFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overtimeRateFormatType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rateTableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rollupTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardRateFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardRateFormatType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType6EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType7EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valuelistSortOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekStartDayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workContourTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workGroupTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accrueAtTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activeDirectoryGUIDTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aliasTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType authorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baselineForEarnedValueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bookingTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bookingTypeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calculationTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType categoryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cfTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commitmentTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType companyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constraintTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contactTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType costRateTableTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencyCodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencySymbolPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencySymbolTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dayTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dayTypeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultFixedCostAccrualTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultTaskEVMethodTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultTaskTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationFormatTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationFormatTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationFormatTypeObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationFormatTypeObject4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationFormatTypeObject5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType earnedValueMethodTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType earnedValueMethodTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elemTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emailAddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType externalTaskProjectTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fixedCostAccrualTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fyStartDateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType groupTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkAddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkAddressType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkAddressType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkSubAddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkSubAddressType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkSubAddressType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyperlinkType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType initialsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lagFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType levelingDelayFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType levelingDelayFormatTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType managerTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType materialLabelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monthItemTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monthPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monthTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameType4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameType5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType newTaskStartDateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ntAccountTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outlineNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType overtimeRateFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType overtimeRateFormatTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType phoneticAliasTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType phoneticsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rateTableTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rollupTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType standardRateFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType standardRateFormatTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subjectTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subprojectNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType titleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject7EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uidTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valuelistSortOrderTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weekStartDayTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workContourTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workGroupTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.certware.planning.mspdi.MspdiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MspdiPackageImpl() {
		super(eNS_URI, MspdiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MspdiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static MspdiPackage init() {
		if (isInited) return (MspdiPackage)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI);

		// Obtain or create and register package
		MspdiPackageImpl theMspdiPackage = (MspdiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MspdiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MspdiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theMspdiPackage.loadPackage();

		// Fix loaded packages
		theMspdiPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMspdiPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MspdiValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMspdiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MspdiPackage.eNS_URI, theMspdiPackage);
		return theMspdiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentsType() {
		if (assignmentsTypeEClass == null) {
			assignmentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(4);
		}
		return assignmentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentsType_Assignment() {
        return (EReference)getAssignmentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentType() {
		if (assignmentTypeEClass == null) {
			assignmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(5);
		}
		return assignmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_UID() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_TaskUID() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ResourceUID() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_PercentWorkComplete() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualCost() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualFinish() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualOvertimeCost() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualOvertimeWork() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualStart() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualWork() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ACWP() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Confirmed() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Cost() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_CostRateTable() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_CostVariance() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_CV() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Delay() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Finish() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_FinishVariance() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Hyperlink() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_HyperlinkAddress() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_HyperlinkSubAddress() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_WorkVariance() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_HasFixedRateUnits() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_FixedMaterial() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_LevelingDelay() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_LevelingDelayFormat() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_LinkedFields() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Milestone() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Notes() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Overallocated() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_OvertimeCost() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_OvertimeWork() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_PeakUnits() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_RegularWork() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_RemainingCost() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_RemainingOvertimeCost() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_RemainingOvertimeWork() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_RemainingWork() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ResponsePending() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Start() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Stop() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Resume() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_StartVariance() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Summary() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_SV() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Units() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_UpdateNeeded() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_VAC() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_Work() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_WorkContour() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_BCWS() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_BCWP() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_BookingType() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualWorkProtected() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_ActualOvertimeWorkProtected() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_CreationDate() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_AssnOwner() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_AssnOwnerGuid() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_BudgetCost() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentType_BudgetWork() {
        return (EAttribute)getAssignmentType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_ExtendedAttribute() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_Baseline() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404000() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404001() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404002() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404003() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404004() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404005() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404006() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404007() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404008() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404009() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40400a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40400b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40400c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40400d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40400e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40400f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404010() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404011() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404012() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404013() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404014() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404015() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404016() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404017() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404018() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404019() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40401a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40401b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40401c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40401d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40401e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40401f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404020() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404021() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404022() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404023() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404024() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404025() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404026() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404027() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404028() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404029() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40402a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40402b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40402c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40402d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40402e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40402f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404030() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404031() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404032() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404033() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404034() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404035() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404036() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404037() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404038() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404039() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40403a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40403b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40403c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40403d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40403e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40403f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404040() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404041() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404042() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404043() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404044() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404045() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404046() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404047() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404048() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404049() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40404a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40404b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40404c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40404d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40404e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40404f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404050() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404051() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404052() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404053() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404054() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404055() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404056() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404057() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404058() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404059() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40405a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40405b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40405c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40405d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40405e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40405f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404060() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404061() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404062() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404063() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404064() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404065() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404066() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404067() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404068() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404069() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40406a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40406b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40406c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40406d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40406e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40406f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404070() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404071() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404072() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404073() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404074() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404075() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404076() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404077() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404078() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404079() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40407a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40407b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40407c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40407d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40407e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40407f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404080() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404081() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404082() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404083() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404084() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404085() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404086() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404087() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404088() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404089() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40408a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40408b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40408c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40408d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40408e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40408f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404090() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404091() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404092() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404093() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404094() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404095() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404096() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404097() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404098() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F404099() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40409a() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40409b() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40409c() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40409d() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40409e() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F40409f() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a0() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a1() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a2() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a3() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a4() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a5() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a6() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a7() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a8() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040a9() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040aa() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040ab() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040ac() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040ad() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040ae() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040af() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b0() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b1() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b2() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b3() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b4() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b5() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b6() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b7() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b8() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040b9() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040ba() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040bb() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040bc() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040bd() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040be() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040bf() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c0() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c1() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c2() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c3() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c4() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c5() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c6() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c7() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_F4040c8() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentType_TimephasedData() {
        return (EReference)getAssignmentType().getEStructuralFeatures().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailabilityPeriodsType() {
		if (availabilityPeriodsTypeEClass == null) {
			availabilityPeriodsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(7);
		}
		return availabilityPeriodsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailabilityPeriodsType_AvailabilityPeriod() {
        return (EReference)getAvailabilityPeriodsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailabilityPeriodType() {
		if (availabilityPeriodTypeEClass == null) {
			availabilityPeriodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(8);
		}
		return availabilityPeriodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailabilityPeriodType_AvailableFrom() {
        return (EAttribute)getAvailabilityPeriodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailabilityPeriodType_AvailableTo() {
        return (EAttribute)getAvailabilityPeriodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailabilityPeriodType_AvailableUnits() {
        return (EAttribute)getAvailabilityPeriodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaselineType() {
		if (baselineTypeEClass == null) {
			baselineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(11);
		}
		return baselineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaselineType_TimephasedData() {
        return (EReference)getBaselineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType_Number() {
        return (EAttribute)getBaselineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType_Start() {
        return (EAttribute)getBaselineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType_Finish() {
        return (EAttribute)getBaselineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType_Work() {
        return (EAttribute)getBaselineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType_Cost() {
        return (EAttribute)getBaselineType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType_BCWS() {
        return (EAttribute)getBaselineType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType_BCWP() {
        return (EAttribute)getBaselineType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaselineType1() {
		if (baselineType1EClass == null) {
			baselineType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(12);
		}
		return baselineType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType1_Number() {
        return (EAttribute)getBaselineType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType1_Work() {
        return (EAttribute)getBaselineType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType1_Cost() {
        return (EAttribute)getBaselineType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType1_BCWS() {
        return (EAttribute)getBaselineType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType1_BCWP() {
        return (EAttribute)getBaselineType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaselineType2() {
		if (baselineType2EClass == null) {
			baselineType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(13);
		}
		return baselineType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaselineType2_TimephasedData() {
        return (EReference)getBaselineType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_Number() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_Interim() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_Start() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_Finish() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_Duration() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_DurationFormat() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_EstimatedDuration() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_Work() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_Cost() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_BCWS() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_BCWP() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaselineType2_FixedCost() {
        return (EAttribute)getBaselineType2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarsType() {
		if (calendarsTypeEClass == null) {
			calendarsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(20);
		}
		return calendarsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendarsType_Calendar() {
        return (EReference)getCalendarsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarType() {
		if (calendarTypeEClass == null) {
			calendarTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(21);
		}
		return calendarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarType_UID() {
        return (EAttribute)getCalendarType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarType_Name() {
        return (EAttribute)getCalendarType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarType_IsBaseCalendar() {
        return (EAttribute)getCalendarType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarType_BaseCalendarUID() {
        return (EAttribute)getCalendarType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendarType_WeekDays() {
        return (EReference)getCalendarType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendarType_Exceptions() {
        return (EReference)getCalendarType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendarType_WorkWeeks() {
        return (EReference)getCalendarType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(48);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Project() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionsType() {
		if (exceptionsTypeEClass == null) {
			exceptionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(68);
		}
		return exceptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionsType_Exception() {
        return (EReference)getExceptionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionType() {
		if (exceptionTypeEClass == null) {
			exceptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(69);
		}
		return exceptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_EnteredByOccurrences() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionType_TimePeriod() {
        return (EReference)getExceptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_Occurrences() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_Name() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_Type() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_Period() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_DaysOfWeek() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_MonthItem() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_MonthPosition() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_Month() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_MonthDay() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionType_DayWorking() {
        return (EAttribute)getExceptionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionType_WorkingTimes() {
        return (EReference)getExceptionType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedAttributesType() {
		if (extendedAttributesTypeEClass == null) {
			extendedAttributesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(70);
		}
		return extendedAttributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedAttributesType_ExtendedAttribute() {
        return (EReference)getExtendedAttributesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedAttributeType() {
		if (extendedAttributeTypeEClass == null) {
			extendedAttributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(71);
		}
		return extendedAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_FieldID() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_Value() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_ValueGUID() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType_DurationFormat() {
        return (EAttribute)getExtendedAttributeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedAttributeType1() {
		if (extendedAttributeType1EClass == null) {
			extendedAttributeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(72);
		}
		return extendedAttributeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType1_FieldID() {
        return (EAttribute)getExtendedAttributeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType1_Value() {
        return (EAttribute)getExtendedAttributeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType1_ValueGUID() {
        return (EAttribute)getExtendedAttributeType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType1_DurationFormat() {
        return (EAttribute)getExtendedAttributeType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedAttributeType2() {
		if (extendedAttributeType2EClass == null) {
			extendedAttributeType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(73);
		}
		return extendedAttributeType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType2_FieldID() {
        return (EAttribute)getExtendedAttributeType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType2_Value() {
        return (EAttribute)getExtendedAttributeType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType2_ValueGUID() {
        return (EAttribute)getExtendedAttributeType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType2_DurationFormat() {
        return (EAttribute)getExtendedAttributeType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedAttributeType3() {
		if (extendedAttributeType3EClass == null) {
			extendedAttributeType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(74);
		}
		return extendedAttributeType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_FieldID() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_FieldName() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_CFType() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_Guid() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_ElemType() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_MaxMultiValues() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_UserDef() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_Alias() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_SecondaryPID() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_AutoRollDown() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_DefaultGuid() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_Ltuid() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_PhoneticAlias() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_RollupType() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_CalculationType() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_Formula() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_RestrictValues() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_ValuelistSortOrder() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_AppendNewValues() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedAttributeType3_Default() {
        return (EAttribute)getExtendedAttributeType3().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedAttributeType3_ValueList() {
        return (EReference)getExtendedAttributeType3().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasksType() {
		if (masksTypeEClass == null) {
			masksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(98);
		}
		return masksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasksType_Mask() {
        return (EReference)getMasksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaskType() {
		if (maskTypeEClass == null) {
			maskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(99);
		}
		return maskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType_Level() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType_Type() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType_Length() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaskType_Separator() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlineCodesType() {
		if (outlineCodesTypeEClass == null) {
			outlineCodesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(116);
		}
		return outlineCodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutlineCodesType_OutlineCode() {
        return (EReference)getOutlineCodesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlineCodeType() {
		if (outlineCodeTypeEClass == null) {
			outlineCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(117);
		}
		return outlineCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType_FieldID() {
        return (EAttribute)getOutlineCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType_ValueID() {
        return (EAttribute)getOutlineCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType_ValueGUID() {
        return (EAttribute)getOutlineCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlineCodeType1() {
		if (outlineCodeType1EClass == null) {
			outlineCodeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(118);
		}
		return outlineCodeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType1_FieldID() {
        return (EAttribute)getOutlineCodeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType1_ValueID() {
        return (EAttribute)getOutlineCodeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType1_ValueGUID() {
        return (EAttribute)getOutlineCodeType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlineCodeType2() {
		if (outlineCodeType2EClass == null) {
			outlineCodeType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(119);
		}
		return outlineCodeType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_Guid() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_FieldID() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_FieldName() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_Alias() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_PhoneticAlias() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutlineCodeType2_Values() {
        return (EReference)getOutlineCodeType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_Enterprise() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_EnterpriseOutlineCodeAlias() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_ResourceSubstitutionEnabled() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_LeafOnly() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_AllLevelsRequired() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineCodeType2_OnlyTableValuesAllowed() {
        return (EAttribute)getOutlineCodeType2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutlineCodeType2_Masks() {
        return (EReference)getOutlineCodeType2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredecessorLinkType() {
		if (predecessorLinkTypeEClass == null) {
			predecessorLinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(127);
		}
		return predecessorLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredecessorLinkType_PredecessorUID() {
        return (EAttribute)getPredecessorLinkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredecessorLinkType_Type() {
        return (EAttribute)getPredecessorLinkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredecessorLinkType_CrossProject() {
        return (EAttribute)getPredecessorLinkType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredecessorLinkType_CrossProjectName() {
        return (EAttribute)getPredecessorLinkType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredecessorLinkType_LinkLag() {
        return (EAttribute)getPredecessorLinkType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredecessorLinkType_LagFormat() {
        return (EAttribute)getPredecessorLinkType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectType() {
		if (projectTypeEClass == null) {
			projectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(129);
		}
		return projectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_SaveVersion() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_UID() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Name() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Title() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Subject() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Category() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Company() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Manager() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Author() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CreationDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Revision() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_LastSaved() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_ScheduleFromStart() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_StartDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_FinishDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_FYStartDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CriticalSlackLimit() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CurrencyDigits() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CurrencySymbol() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CurrencyCode() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CurrencySymbolPosition() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CalendarUID() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DefaultStartTime() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DefaultFinishTime() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MinutesPerDay() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MinutesPerWeek() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DaysPerMonth() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DefaultTaskType() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DefaultFixedCostAccrual() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DefaultStandardRate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DefaultOvertimeRate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DurationFormat() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_WorkFormat() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_EditableActualCosts() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_HonorConstraints() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_EarnedValueMethod() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_InsertedProjectsLikeSummary() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MultipleCriticalPaths() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_NewTasksEffortDriven() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_NewTasksEstimated() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_SplitsInProgressTasks() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_SpreadActualCost() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_SpreadPercentComplete() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_TaskUpdatesResource() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_FiscalYearStart() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_WeekStartDay() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MoveCompletedEndsBack() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MoveRemainingStartsBack() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MoveRemainingStartsForward() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MoveCompletedEndsForward() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_BaselineForEarnedValue() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_AutoAddNewResourcesAndTasks() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_StatusDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_CurrentDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_MicrosoftProjectServerURL() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_Autolink() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_NewTaskStartDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_DefaultTaskEVMethod() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_ProjectExternallyEdited() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_ExtendedCreationDate() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_ActualsInSync() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_RemoveFileProperties() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectType_AdminProject() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_OutlineCodes() {
        return (EReference)getProjectType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_WBSMasks() {
        return (EReference)getProjectType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_ExtendedAttributes() {
        return (EReference)getProjectType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_Calendars() {
        return (EReference)getProjectType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_Tasks() {
        return (EReference)getProjectType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_Resources() {
        return (EReference)getProjectType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectType_Assignments() {
        return (EReference)getProjectType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatesType() {
		if (ratesTypeEClass == null) {
			ratesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(130);
		}
		return ratesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRatesType_Rate() {
        return (EReference)getRatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateType() {
		if (rateTypeEClass == null) {
			rateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(133);
		}
		return rateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_RatesFrom() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_RatesTo() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_RateTable() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_StandardRate() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_StandardRateFormat() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_OvertimeRate() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_OvertimeRateFormat() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_CostPerUse() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesType() {
		if (resourcesTypeEClass == null) {
			resourcesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(134);
		}
		return resourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcesType_Resource() {
        return (EReference)getResourcesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		if (resourceTypeEClass == null) {
			resourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(135);
		}
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_UID() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ID() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Name() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Type() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsNull() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Initials() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Phonetics() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_NTAccount() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_MaterialLabel() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Code() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Group() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_WorkGroup() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_EmailAddress() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Hyperlink() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_HyperlinkAddress() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_HyperlinkSubAddress() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_MaxUnits() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_PeakUnits() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_OverAllocated() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_AvailableFrom() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_AvailableTo() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Start() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Finish() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_CanLevel() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_AccrueAt() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Work() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_RegularWork() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_OvertimeWork() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ActualWork() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_RemainingWork() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ActualOvertimeWork() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_RemainingOvertimeWork() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_PercentWorkComplete() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_StandardRate() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_StandardRateFormat() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Cost() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_OvertimeRate() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_OvertimeRateFormat() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_OvertimeCost() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_CostPerUse() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ActualCost() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ActualOvertimeCost() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_RemainingCost() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_RemainingOvertimeCost() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_WorkVariance() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_CostVariance() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_SV() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_CV() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ACWP() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_CalendarUID() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Notes() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_BCWS() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_BCWP() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsGeneric() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsInactive() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsEnterprise() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_BookingType() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ActualWorkProtected() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ActualOvertimeWorkProtected() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_ActiveDirectoryGUID() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_CreationDate() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_ExtendedAttribute() {
        return (EReference)getResourceType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Baseline() {
        return (EReference)getResourceType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_OutlineCode() {
        return (EReference)getResourceType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsCostResource() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_AssnOwner() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_AssnOwnerGuid() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_IsBudget() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_AvailabilityPeriods() {
        return (EReference)getResourceType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Rates() {
        return (EReference)getResourceType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_TimephasedData() {
        return (EReference)getResourceType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTasksType() {
		if (tasksTypeEClass == null) {
			tasksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(144);
		}
		return tasksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTasksType_Task() {
        return (EReference)getTasksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskType() {
		if (taskTypeEClass == null) {
			taskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(145);
		}
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_UID() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ID() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Name() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Type() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_IsNull() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_CreateDate() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Contact() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_WBS() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_WBSLevel() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_OutlineNumber() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_OutlineLevel() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Priority() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Start() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Finish() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Duration() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_DurationFormat() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Work() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Stop() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Resume() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ResumeValid() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_EffortDriven() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Recurring() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_OverAllocated() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Estimated() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Milestone() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Summary() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Critical() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_IsSubproject() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_IsSubprojectReadOnly() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_SubprojectName() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ExternalTask() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ExternalTaskProject() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_EarlyStart() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_EarlyFinish() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_LateStart() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_LateFinish() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_StartVariance() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_FinishVariance() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_WorkVariance() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_FreeSlack() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_TotalSlack() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_FixedCost() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_FixedCostAccrual() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_PercentComplete() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_PercentWorkComplete() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Cost() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_OvertimeCost() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_OvertimeWork() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualStart() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualFinish() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualDuration() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualCost() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualOvertimeCost() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualWork() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualOvertimeWork() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_RegularWork() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_RemainingDuration() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_RemainingCost() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_RemainingWork() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_RemainingOvertimeCost() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_RemainingOvertimeWork() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ACWP() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_CV() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ConstraintType() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_CalendarUID() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ConstraintDate() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Deadline() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_LevelAssignments() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_LevelingCanSplit() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_LevelingDelay() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_LevelingDelayFormat() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_PreLeveledStart() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_PreLeveledFinish() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Hyperlink() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_HyperlinkAddress() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_HyperlinkSubAddress() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_IgnoreResourceCalendar() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Notes() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_HideBar() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Rollup() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_BCWS() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_BCWP() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_PhysicalPercentComplete() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_EarnedValueMethod() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_PredecessorLink() {
        return (EReference)getTaskType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualWorkProtected() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_ActualOvertimeWorkProtected() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_ExtendedAttribute() {
        return (EReference)getTaskType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_Baseline() {
        return (EReference)getTaskType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_OutlineCode() {
        return (EReference)getTaskType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_IsPublished() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_StatusManager() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_CommitmentStart() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_CommitmentFinish() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_CommitmentType() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskType_TimephasedData() {
        return (EReference)getTaskType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePeriodType() {
		if (timePeriodTypeEClass == null) {
			timePeriodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(146);
		}
		return timePeriodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodType_FromDate() {
        return (EAttribute)getTimePeriodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodType_ToDate() {
        return (EAttribute)getTimePeriodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePeriodType1() {
		if (timePeriodType1EClass == null) {
			timePeriodType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(147);
		}
		return timePeriodType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodType1_FromDate() {
        return (EAttribute)getTimePeriodType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodType1_ToDate() {
        return (EAttribute)getTimePeriodType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePeriodType2() {
		if (timePeriodType2EClass == null) {
			timePeriodType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(148);
		}
		return timePeriodType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodType2_FromDate() {
        return (EAttribute)getTimePeriodType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodType2_ToDate() {
        return (EAttribute)getTimePeriodType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimephasedDataType() {
		if (timephasedDataTypeEClass == null) {
			timephasedDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(149);
		}
		return timephasedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimephasedDataType_Type() {
        return (EAttribute)getTimephasedDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimephasedDataType_UID() {
        return (EAttribute)getTimephasedDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimephasedDataType_Start() {
        return (EAttribute)getTimephasedDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimephasedDataType_Finish() {
        return (EAttribute)getTimephasedDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimephasedDataType_Unit() {
        return (EAttribute)getTimephasedDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimephasedDataType_Value() {
        return (EAttribute)getTimephasedDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueListType() {
		if (valueListTypeEClass == null) {
			valueListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(172);
		}
		return valueListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueListType_Value() {
        return (EReference)getValueListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuesType() {
		if (valuesTypeEClass == null) {
			valuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(173);
		}
		return valuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuesType_Group() {
        return (EAttribute)getValuesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuesType_Value() {
        return (EReference)getValuesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(174);
		}
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_ID() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Value() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Description() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Phonetic() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType1() {
		if (valueType1EClass == null) {
			valueType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(175);
		}
		return valueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_ValueID() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_FieldGUID() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_Type() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_ParentValueID() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_Value() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType1_Description() {
        return (EAttribute)getValueType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWBSMasksType() {
		if (wbsMasksTypeEClass == null) {
			wbsMasksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(176);
		}
		return wbsMasksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWBSMasksType_VerifyUniqueCodes() {
        return (EAttribute)getWBSMasksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWBSMasksType_GenerateCodes() {
        return (EAttribute)getWBSMasksType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWBSMasksType_Prefix() {
        return (EAttribute)getWBSMasksType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWBSMasksType_WBSMask() {
        return (EReference)getWBSMasksType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWBSMaskType() {
		if (wbsMaskTypeEClass == null) {
			wbsMaskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(177);
		}
		return wbsMaskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWBSMaskType_Level() {
        return (EAttribute)getWBSMaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWBSMaskType_Type() {
        return (EAttribute)getWBSMaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWBSMaskType_Length() {
        return (EAttribute)getWBSMaskType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWBSMaskType_Separator() {
        return (EAttribute)getWBSMaskType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeekDaysType() {
		if (weekDaysTypeEClass == null) {
			weekDaysTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(178);
		}
		return weekDaysTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeekDaysType_WeekDay() {
        return (EReference)getWeekDaysType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeekDayType() {
		if (weekDayTypeEClass == null) {
			weekDayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(179);
		}
		return weekDayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekDayType_DayType() {
        return (EAttribute)getWeekDayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekDayType_DayWorking() {
        return (EAttribute)getWeekDayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeekDayType1() {
		if (weekDayType1EClass == null) {
			weekDayType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(180);
		}
		return weekDayType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekDayType1_DayType() {
        return (EAttribute)getWeekDayType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekDayType1_DayWorking() {
        return (EAttribute)getWeekDayType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeekDayType1_TimePeriod() {
        return (EReference)getWeekDayType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeekDayType1_WorkingTimes() {
        return (EReference)getWeekDayType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkingTimesType() {
		if (workingTimesTypeEClass == null) {
			workingTimesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(189);
		}
		return workingTimesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkingTimesType_WorkingTime() {
        return (EReference)getWorkingTimesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkingTimesType1() {
		if (workingTimesType1EClass == null) {
			workingTimesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(190);
		}
		return workingTimesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkingTimesType1_WorkingTime() {
        return (EReference)getWorkingTimesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkingTimeType() {
		if (workingTimeTypeEClass == null) {
			workingTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(191);
		}
		return workingTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingTimeType_FromTime() {
        return (EAttribute)getWorkingTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingTimeType_ToTime() {
        return (EAttribute)getWorkingTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkingTimeType1() {
		if (workingTimeType1EClass == null) {
			workingTimeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(192);
		}
		return workingTimeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingTimeType1_FromTime() {
        return (EAttribute)getWorkingTimeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingTimeType1_ToTime() {
        return (EAttribute)getWorkingTimeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkWeeksType() {
		if (workWeeksTypeEClass == null) {
			workWeeksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(193);
		}
		return workWeeksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkWeeksType_WorkWeek() {
        return (EReference)getWorkWeeksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkWeekType() {
		if (workWeekTypeEClass == null) {
			workWeekTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(194);
		}
		return workWeekTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkWeekType_TimePeriod() {
        return (EReference)getWorkWeekType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkWeekType_Name() {
        return (EAttribute)getWorkWeekType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkWeekType_WeekDay() {
        return (EReference)getWorkWeekType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccrueAtType() {
		if (accrueAtTypeEEnum == null) {
			accrueAtTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accrueAtTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBaselineForEarnedValueType() {
		if (baselineForEarnedValueTypeEEnum == null) {
			baselineForEarnedValueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(9);
		}
		return baselineForEarnedValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBookingTypeType() {
		if (bookingTypeTypeEEnum == null) {
			bookingTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(14);
		}
		return bookingTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBookingTypeType1() {
		if (bookingTypeType1EEnum == null) {
			bookingTypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(15);
		}
		return bookingTypeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalculationTypeType() {
		if (calculationTypeTypeEEnum == null) {
			calculationTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(18);
		}
		return calculationTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCFTypeType() {
		if (cfTypeTypeEEnum == null) {
			cfTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(23);
		}
		return cfTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommitmentTypeType() {
		if (commitmentTypeTypeEEnum == null) {
			commitmentTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(26);
		}
		return commitmentTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintTypeType() {
		if (constraintTypeTypeEEnum == null) {
			constraintTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(29);
		}
		return constraintTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCostRateTableType() {
		if (costRateTableTypeEEnum == null) {
			costRateTableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(32);
		}
		return costRateTableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurrencySymbolPositionType() {
		if (currencySymbolPositionTypeEEnum == null) {
			currencySymbolPositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(35);
		}
		return currencySymbolPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDayTypeType() {
		if (dayTypeTypeEEnum == null) {
			dayTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(38);
		}
		return dayTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDayTypeType1() {
		if (dayTypeType1EEnum == null) {
			dayTypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(39);
		}
		return dayTypeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultFixedCostAccrualType() {
		if (defaultFixedCostAccrualTypeEEnum == null) {
			defaultFixedCostAccrualTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(42);
		}
		return defaultFixedCostAccrualTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultTaskEVMethodType() {
		if (defaultTaskEVMethodTypeEEnum == null) {
			defaultTaskEVMethodTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(44);
		}
		return defaultTaskEVMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultTaskTypeType() {
		if (defaultTaskTypeTypeEEnum == null) {
			defaultTaskTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(46);
		}
		return defaultTaskTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationFormatType() {
		if (durationFormatTypeEEnum == null) {
			durationFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(49);
		}
		return durationFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationFormatType1() {
		if (durationFormatType1EEnum == null) {
			durationFormatType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(50);
		}
		return durationFormatType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationFormatType2() {
		if (durationFormatType2EEnum == null) {
			durationFormatType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(51);
		}
		return durationFormatType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationFormatType3() {
		if (durationFormatType3EEnum == null) {
			durationFormatType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(52);
		}
		return durationFormatType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationFormatType4() {
		if (durationFormatType4EEnum == null) {
			durationFormatType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(53);
		}
		return durationFormatType4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationFormatType5() {
		if (durationFormatType5EEnum == null) {
			durationFormatType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(54);
		}
		return durationFormatType5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEarnedValueMethodType() {
		if (earnedValueMethodTypeEEnum == null) {
			earnedValueMethodTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(61);
		}
		return earnedValueMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEarnedValueMethodType1() {
		if (earnedValueMethodType1EEnum == null) {
			earnedValueMethodType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(62);
		}
		return earnedValueMethodType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElemTypeType() {
		if (elemTypeTypeEEnum == null) {
			elemTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(65);
		}
		return elemTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFixedCostAccrualType() {
		if (fixedCostAccrualTypeEEnum == null) {
			fixedCostAccrualTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(76);
		}
		return fixedCostAccrualTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFYStartDateType() {
		if (fyStartDateTypeEEnum == null) {
			fyStartDateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(78);
		}
		return fyStartDateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLagFormatType() {
		if (lagFormatTypeEEnum == null) {
			lagFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(91);
		}
		return lagFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevelingDelayFormatType() {
		if (levelingDelayFormatTypeEEnum == null) {
			levelingDelayFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(93);
		}
		return levelingDelayFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevelingDelayFormatType1() {
		if (levelingDelayFormatType1EEnum == null) {
			levelingDelayFormatType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(94);
		}
		return levelingDelayFormatType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonthItemType() {
		if (monthItemTypeEEnum == null) {
			monthItemTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(101);
		}
		return monthItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonthPositionType() {
		if (monthPositionTypeEEnum == null) {
			monthPositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(103);
		}
		return monthPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonthType() {
		if (monthTypeEEnum == null) {
			monthTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(105);
		}
		return monthTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNewTaskStartDateType() {
		if (newTaskStartDateTypeEEnum == null) {
			newTaskStartDateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(113);
		}
		return newTaskStartDateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOvertimeRateFormatType() {
		if (overtimeRateFormatTypeEEnum == null) {
			overtimeRateFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(121);
		}
		return overtimeRateFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOvertimeRateFormatType1() {
		if (overtimeRateFormatType1EEnum == null) {
			overtimeRateFormatType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(122);
		}
		return overtimeRateFormatType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRateTableType() {
		if (rateTableTypeEEnum == null) {
			rateTableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(131);
		}
		return rateTableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRollupTypeType() {
		if (rollupTypeTypeEEnum == null) {
			rollupTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(136);
		}
		return rollupTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardRateFormatType() {
		if (standardRateFormatTypeEEnum == null) {
			standardRateFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(138);
		}
		return standardRateFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardRateFormatType1() {
		if (standardRateFormatType1EEnum == null) {
			standardRateFormatType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(139);
		}
		return standardRateFormatType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		if (typeTypeEEnum == null) {
			typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(151);
		}
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType1() {
		if (typeType1EEnum == null) {
			typeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(152);
		}
		return typeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType2() {
		if (typeType2EEnum == null) {
			typeType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(153);
		}
		return typeType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType3() {
		if (typeType3EEnum == null) {
			typeType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(154);
		}
		return typeType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType4() {
		if (typeType4EEnum == null) {
			typeType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(155);
		}
		return typeType4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType5() {
		if (typeType5EEnum == null) {
			typeType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(156);
		}
		return typeType5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType6() {
		if (typeType6EEnum == null) {
			typeType6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(157);
		}
		return typeType6EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType7() {
		if (typeType7EEnum == null) {
			typeType7EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(158);
		}
		return typeType7EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitType() {
		if (unitTypeEEnum == null) {
			unitTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(168);
		}
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValuelistSortOrderType() {
		if (valuelistSortOrderTypeEEnum == null) {
			valuelistSortOrderTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(170);
		}
		return valuelistSortOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeekStartDayType() {
		if (weekStartDayTypeEEnum == null) {
			weekStartDayTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(181);
		}
		return weekStartDayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkContourType() {
		if (workContourTypeEEnum == null) {
			workContourTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(183);
		}
		return workContourTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkFormatType() {
		if (workFormatTypeEEnum == null) {
			workFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(185);
		}
		return workFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkGroupType() {
		if (workGroupTypeEEnum == null) {
			workGroupTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(187);
		}
		return workGroupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccrueAtTypeObject() {
		if (accrueAtTypeObjectEDataType == null) {
			accrueAtTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(1);
		}
		return accrueAtTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActiveDirectoryGUIDType() {
		if (activeDirectoryGUIDTypeEDataType == null) {
			activeDirectoryGUIDTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(2);
		}
		return activeDirectoryGUIDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAliasType() {
		if (aliasTypeEDataType == null) {
			aliasTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(3);
		}
		return aliasTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuthorType() {
		if (authorTypeEDataType == null) {
			authorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(6);
		}
		return authorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBaselineForEarnedValueTypeObject() {
		if (baselineForEarnedValueTypeObjectEDataType == null) {
			baselineForEarnedValueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(10);
		}
		return baselineForEarnedValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBookingTypeTypeObject() {
		if (bookingTypeTypeObjectEDataType == null) {
			bookingTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(16);
		}
		return bookingTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBookingTypeTypeObject1() {
		if (bookingTypeTypeObject1EDataType == null) {
			bookingTypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(17);
		}
		return bookingTypeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalculationTypeTypeObject() {
		if (calculationTypeTypeObjectEDataType == null) {
			calculationTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(19);
		}
		return calculationTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCategoryType() {
		if (categoryTypeEDataType == null) {
			categoryTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(22);
		}
		return categoryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCFTypeTypeObject() {
		if (cfTypeTypeObjectEDataType == null) {
			cfTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(24);
		}
		return cfTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodeType() {
		if (codeTypeEDataType == null) {
			codeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(25);
		}
		return codeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommitmentTypeTypeObject() {
		if (commitmentTypeTypeObjectEDataType == null) {
			commitmentTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(27);
		}
		return commitmentTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompanyType() {
		if (companyTypeEDataType == null) {
			companyTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(28);
		}
		return companyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstraintTypeTypeObject() {
		if (constraintTypeTypeObjectEDataType == null) {
			constraintTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(30);
		}
		return constraintTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContactType() {
		if (contactTypeEDataType == null) {
			contactTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(31);
		}
		return contactTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCostRateTableTypeObject() {
		if (costRateTableTypeObjectEDataType == null) {
			costRateTableTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(33);
		}
		return costRateTableTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencyCodeType() {
		if (currencyCodeTypeEDataType == null) {
			currencyCodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(34);
		}
		return currencyCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencySymbolPositionTypeObject() {
		if (currencySymbolPositionTypeObjectEDataType == null) {
			currencySymbolPositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(36);
		}
		return currencySymbolPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencySymbolType() {
		if (currencySymbolTypeEDataType == null) {
			currencySymbolTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(37);
		}
		return currencySymbolTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDayTypeTypeObject() {
		if (dayTypeTypeObjectEDataType == null) {
			dayTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(40);
		}
		return dayTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDayTypeTypeObject1() {
		if (dayTypeTypeObject1EDataType == null) {
			dayTypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(41);
		}
		return dayTypeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultFixedCostAccrualTypeObject() {
		if (defaultFixedCostAccrualTypeObjectEDataType == null) {
			defaultFixedCostAccrualTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(43);
		}
		return defaultFixedCostAccrualTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultTaskEVMethodTypeObject() {
		if (defaultTaskEVMethodTypeObjectEDataType == null) {
			defaultTaskEVMethodTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(45);
		}
		return defaultTaskEVMethodTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultTaskTypeTypeObject() {
		if (defaultTaskTypeTypeObjectEDataType == null) {
			defaultTaskTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(47);
		}
		return defaultTaskTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationFormatTypeObject() {
		if (durationFormatTypeObjectEDataType == null) {
			durationFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(55);
		}
		return durationFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationFormatTypeObject1() {
		if (durationFormatTypeObject1EDataType == null) {
			durationFormatTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(56);
		}
		return durationFormatTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationFormatTypeObject2() {
		if (durationFormatTypeObject2EDataType == null) {
			durationFormatTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(57);
		}
		return durationFormatTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationFormatTypeObject3() {
		if (durationFormatTypeObject3EDataType == null) {
			durationFormatTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(58);
		}
		return durationFormatTypeObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationFormatTypeObject4() {
		if (durationFormatTypeObject4EDataType == null) {
			durationFormatTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(59);
		}
		return durationFormatTypeObject4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationFormatTypeObject5() {
		if (durationFormatTypeObject5EDataType == null) {
			durationFormatTypeObject5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(60);
		}
		return durationFormatTypeObject5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEarnedValueMethodTypeObject() {
		if (earnedValueMethodTypeObjectEDataType == null) {
			earnedValueMethodTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(63);
		}
		return earnedValueMethodTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEarnedValueMethodTypeObject1() {
		if (earnedValueMethodTypeObject1EDataType == null) {
			earnedValueMethodTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(64);
		}
		return earnedValueMethodTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElemTypeTypeObject() {
		if (elemTypeTypeObjectEDataType == null) {
			elemTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(66);
		}
		return elemTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEmailAddressType() {
		if (emailAddressTypeEDataType == null) {
			emailAddressTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(67);
		}
		return emailAddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExternalTaskProjectType() {
		if (externalTaskProjectTypeEDataType == null) {
			externalTaskProjectTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(75);
		}
		return externalTaskProjectTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFixedCostAccrualTypeObject() {
		if (fixedCostAccrualTypeObjectEDataType == null) {
			fixedCostAccrualTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(77);
		}
		return fixedCostAccrualTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFYStartDateTypeObject() {
		if (fyStartDateTypeObjectEDataType == null) {
			fyStartDateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(79);
		}
		return fyStartDateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGroupType() {
		if (groupTypeEDataType == null) {
			groupTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(80);
		}
		return groupTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkAddressType() {
		if (hyperlinkAddressTypeEDataType == null) {
			hyperlinkAddressTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(81);
		}
		return hyperlinkAddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkAddressType1() {
		if (hyperlinkAddressType1EDataType == null) {
			hyperlinkAddressType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(82);
		}
		return hyperlinkAddressType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkAddressType2() {
		if (hyperlinkAddressType2EDataType == null) {
			hyperlinkAddressType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(83);
		}
		return hyperlinkAddressType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkSubAddressType() {
		if (hyperlinkSubAddressTypeEDataType == null) {
			hyperlinkSubAddressTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(84);
		}
		return hyperlinkSubAddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkSubAddressType1() {
		if (hyperlinkSubAddressType1EDataType == null) {
			hyperlinkSubAddressType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(85);
		}
		return hyperlinkSubAddressType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkSubAddressType2() {
		if (hyperlinkSubAddressType2EDataType == null) {
			hyperlinkSubAddressType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(86);
		}
		return hyperlinkSubAddressType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkType() {
		if (hyperlinkTypeEDataType == null) {
			hyperlinkTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(87);
		}
		return hyperlinkTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkType1() {
		if (hyperlinkType1EDataType == null) {
			hyperlinkType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(88);
		}
		return hyperlinkType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyperlinkType2() {
		if (hyperlinkType2EDataType == null) {
			hyperlinkType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(89);
		}
		return hyperlinkType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInitialsType() {
		if (initialsTypeEDataType == null) {
			initialsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(90);
		}
		return initialsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLagFormatTypeObject() {
		if (lagFormatTypeObjectEDataType == null) {
			lagFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(92);
		}
		return lagFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLevelingDelayFormatTypeObject() {
		if (levelingDelayFormatTypeObjectEDataType == null) {
			levelingDelayFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(95);
		}
		return levelingDelayFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLevelingDelayFormatTypeObject1() {
		if (levelingDelayFormatTypeObject1EDataType == null) {
			levelingDelayFormatTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(96);
		}
		return levelingDelayFormatTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getManagerType() {
		if (managerTypeEDataType == null) {
			managerTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(97);
		}
		return managerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaterialLabelType() {
		if (materialLabelTypeEDataType == null) {
			materialLabelTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(100);
		}
		return materialLabelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMonthItemTypeObject() {
		if (monthItemTypeObjectEDataType == null) {
			monthItemTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(102);
		}
		return monthItemTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMonthPositionTypeObject() {
		if (monthPositionTypeObjectEDataType == null) {
			monthPositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(104);
		}
		return monthPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMonthTypeObject() {
		if (monthTypeObjectEDataType == null) {
			monthTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(106);
		}
		return monthTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		if (nameTypeEDataType == null) {
			nameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(107);
		}
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType1() {
		if (nameType1EDataType == null) {
			nameType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(108);
		}
		return nameType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType2() {
		if (nameType2EDataType == null) {
			nameType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(109);
		}
		return nameType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType3() {
		if (nameType3EDataType == null) {
			nameType3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(110);
		}
		return nameType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType4() {
		if (nameType4EDataType == null) {
			nameType4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(111);
		}
		return nameType4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType5() {
		if (nameType5EDataType == null) {
			nameType5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(112);
		}
		return nameType5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNewTaskStartDateTypeObject() {
		if (newTaskStartDateTypeObjectEDataType == null) {
			newTaskStartDateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(114);
		}
		return newTaskStartDateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNTAccountType() {
		if (ntAccountTypeEDataType == null) {
			ntAccountTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(115);
		}
		return ntAccountTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutlineNumberType() {
		if (outlineNumberTypeEDataType == null) {
			outlineNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(120);
		}
		return outlineNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOvertimeRateFormatTypeObject() {
		if (overtimeRateFormatTypeObjectEDataType == null) {
			overtimeRateFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(123);
		}
		return overtimeRateFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOvertimeRateFormatTypeObject1() {
		if (overtimeRateFormatTypeObject1EDataType == null) {
			overtimeRateFormatTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(124);
		}
		return overtimeRateFormatTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPhoneticAliasType() {
		if (phoneticAliasTypeEDataType == null) {
			phoneticAliasTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(125);
		}
		return phoneticAliasTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPhoneticsType() {
		if (phoneticsTypeEDataType == null) {
			phoneticsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(126);
		}
		return phoneticsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixType() {
		if (prefixTypeEDataType == null) {
			prefixTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(128);
		}
		return prefixTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRateTableTypeObject() {
		if (rateTableTypeObjectEDataType == null) {
			rateTableTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(132);
		}
		return rateTableTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRollupTypeTypeObject() {
		if (rollupTypeTypeObjectEDataType == null) {
			rollupTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(137);
		}
		return rollupTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStandardRateFormatTypeObject() {
		if (standardRateFormatTypeObjectEDataType == null) {
			standardRateFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(140);
		}
		return standardRateFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStandardRateFormatTypeObject1() {
		if (standardRateFormatTypeObject1EDataType == null) {
			standardRateFormatTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(141);
		}
		return standardRateFormatTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubjectType() {
		if (subjectTypeEDataType == null) {
			subjectTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(142);
		}
		return subjectTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubprojectNameType() {
		if (subprojectNameTypeEDataType == null) {
			subprojectNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(143);
		}
		return subprojectNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTitleType() {
		if (titleTypeEDataType == null) {
			titleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(150);
		}
		return titleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(159);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject1() {
		if (typeTypeObject1EDataType == null) {
			typeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(160);
		}
		return typeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject2() {
		if (typeTypeObject2EDataType == null) {
			typeTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(161);
		}
		return typeTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject3() {
		if (typeTypeObject3EDataType == null) {
			typeTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(162);
		}
		return typeTypeObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject4() {
		if (typeTypeObject4EDataType == null) {
			typeTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(163);
		}
		return typeTypeObject4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject5() {
		if (typeTypeObject5EDataType == null) {
			typeTypeObject5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(164);
		}
		return typeTypeObject5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject6() {
		if (typeTypeObject6EDataType == null) {
			typeTypeObject6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(165);
		}
		return typeTypeObject6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject7() {
		if (typeTypeObject7EDataType == null) {
			typeTypeObject7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(166);
		}
		return typeTypeObject7EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUIDType() {
		if (uidTypeEDataType == null) {
			uidTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(167);
		}
		return uidTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitTypeObject() {
		if (unitTypeObjectEDataType == null) {
			unitTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(169);
		}
		return unitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValuelistSortOrderTypeObject() {
		if (valuelistSortOrderTypeObjectEDataType == null) {
			valuelistSortOrderTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(171);
		}
		return valuelistSortOrderTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWeekStartDayTypeObject() {
		if (weekStartDayTypeObjectEDataType == null) {
			weekStartDayTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(182);
		}
		return weekStartDayTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWorkContourTypeObject() {
		if (workContourTypeObjectEDataType == null) {
			workContourTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(184);
		}
		return workContourTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWorkFormatTypeObject() {
		if (workFormatTypeObjectEDataType == null) {
			workFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(186);
		}
		return workFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWorkGroupTypeObject() {
		if (workGroupTypeObjectEDataType == null) {
			workGroupTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(MspdiPackage.eNS_URI).getEClassifiers().get(188);
		}
		return workGroupTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MspdiFactory getMspdiFactory() {
		return (MspdiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("net.certware.planning.mspdi." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //MspdiPackageImpl
