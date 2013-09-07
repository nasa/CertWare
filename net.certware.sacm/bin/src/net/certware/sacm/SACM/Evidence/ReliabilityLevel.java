/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reliability Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getReliabilityLevel()
 * @model
 * @generated
 */
public enum ReliabilityLevel implements Enumerator {
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
	 * The '<em><b>Un Reliable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN_RELIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UN_RELIABLE(0, "unReliable", "unReliable"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Not Usually Reliable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_USUALLY_RELIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_USUALLY_RELIABLE(0, "notUsuallyReliable", "notUsuallyReliable"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Usually Reliable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USUALLY_RELIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	USUALLY_RELIABLE(0, "usuallyReliable", "usuallyReliable"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Fairly Reliable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIRLY_RELIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FAIRLY_RELIABLE(0, "fairlyReliable", "fairlyReliable"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Completely Reliable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETELY_RELIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETELY_RELIABLE(0, "completelyReliable", "completelyReliable"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

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
	 * The '<em><b>Un Reliable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Un Reliable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UN_RELIABLE
	 * @model name="unReliable"
	 * @generated
	 * @ordered
	 */
	public static final int UN_RELIABLE_VALUE = 0;

	/**
	 * The '<em><b>Not Usually Reliable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Usually Reliable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_USUALLY_RELIABLE
	 * @model name="notUsuallyReliable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_USUALLY_RELIABLE_VALUE = 0;

	/**
	 * The '<em><b>Usually Reliable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Usually Reliable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USUALLY_RELIABLE
	 * @model name="usuallyReliable"
	 * @generated
	 * @ordered
	 */
	public static final int USUALLY_RELIABLE_VALUE = 0;

	/**
	 * The '<em><b>Fairly Reliable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fairly Reliable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAIRLY_RELIABLE
	 * @model name="fairlyReliable"
	 * @generated
	 * @ordered
	 */
	public static final int FAIRLY_RELIABLE_VALUE = 0;

	/**
	 * The '<em><b>Completely Reliable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Completely Reliable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETELY_RELIABLE
	 * @model name="completelyReliable"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETELY_RELIABLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Reliability Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReliabilityLevel[] VALUES_ARRAY =
		new ReliabilityLevel[] {
			UNKNOWN,
			UN_RELIABLE,
			NOT_USUALLY_RELIABLE,
			USUALLY_RELIABLE,
			FAIRLY_RELIABLE,
			COMPLETELY_RELIABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Reliability Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReliabilityLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reliability Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReliabilityLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReliabilityLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reliability Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReliabilityLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReliabilityLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reliability Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReliabilityLevel get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private ReliabilityLevel(int value, String name, String literal) {
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
	
} //ReliabilityLevel
