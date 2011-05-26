/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Confidence Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.evidence.evidence.EvidencePackage#getConfidenceLevel()
 * @model
 * @generated
 */
public enum ConfidenceLevel implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Reported As Uncertain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTED_AS_UNCERTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTED_AS_UNCERTAIN(1, "reportedAsUncertain", "reportedAsUncertain"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Reported As Plausible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTED_AS_PLAUSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTED_AS_PLAUSIBLE(2, "reportedAsPlausible", "reportedAsPlausible"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Reported As Fact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTED_AS_FACT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTED_AS_FACT(3, "reportedAsFact", "reportedAsFact"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Reported As Uncertain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reported As Uncertain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORTED_AS_UNCERTAIN
	 * @model name="reportedAsUncertain"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTED_AS_UNCERTAIN_VALUE = 1;

	/**
	 * The '<em><b>Reported As Plausible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reported As Plausible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORTED_AS_PLAUSIBLE
	 * @model name="reportedAsPlausible"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTED_AS_PLAUSIBLE_VALUE = 2;

	/**
	 * The '<em><b>Reported As Fact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reported As Fact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPORTED_AS_FACT
	 * @model name="reportedAsFact"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTED_AS_FACT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Confidence Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConfidenceLevel[] VALUES_ARRAY =
		new ConfidenceLevel[] {
			UNKNOWN,
			REPORTED_AS_UNCERTAIN,
			REPORTED_AS_PLAUSIBLE,
			REPORTED_AS_FACT,
		};

	/**
	 * A public read-only list of all the '<em><b>Confidence Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConfidenceLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Confidence Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfidenceLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfidenceLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Confidence Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfidenceLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfidenceLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Confidence Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfidenceLevel get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case REPORTED_AS_UNCERTAIN_VALUE: return REPORTED_AS_UNCERTAIN;
			case REPORTED_AS_PLAUSIBLE_VALUE: return REPORTED_AS_PLAUSIBLE;
			case REPORTED_AS_FACT_VALUE: return REPORTED_AS_FACT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConfidenceLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConfidenceLevel
