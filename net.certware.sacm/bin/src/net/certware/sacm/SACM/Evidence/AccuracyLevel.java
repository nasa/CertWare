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
 * A representation of the literals of the enumeration '<em><b>Accuracy Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getAccuracyLevel()
 * @model
 * @generated
 */
public enum AccuracyLevel implements Enumerator {
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
	 * The '<em><b>Improbable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPROBABLE(0, "improbable", "improbable"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Doubtful</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBTFUL_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBTFUL(0, "doubtful", "doubtful"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Possible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	POSSIBLE(0, "possible", "possible"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Probable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABLE(0, "probable", "probable"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Confirmed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRMED(0, "confirmed", "confirmed"); //$NON-NLS-1$ //$NON-NLS-2$

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
	 * The '<em><b>Improbable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Improbable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE
	 * @model name="improbable"
	 * @generated
	 * @ordered
	 */
	public static final int IMPROBABLE_VALUE = 0;

	/**
	 * The '<em><b>Doubtful</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doubtful</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBTFUL
	 * @model name="doubtful"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBTFUL_VALUE = 0;

	/**
	 * The '<em><b>Possible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Possible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSSIBLE
	 * @model name="possible"
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBLE_VALUE = 0;

	/**
	 * The '<em><b>Probable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Probable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROBABLE
	 * @model name="probable"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABLE_VALUE = 0;

	/**
	 * The '<em><b>Confirmed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confirmed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED
	 * @model name="confirmed"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRMED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Accuracy Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccuracyLevel[] VALUES_ARRAY =
		new AccuracyLevel[] {
			UNKNOWN,
			IMPROBABLE,
			DOUBTFUL,
			POSSIBLE,
			PROBABLE,
			CONFIRMED,
		};

	/**
	 * A public read-only list of all the '<em><b>Accuracy Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccuracyLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Accuracy Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccuracyLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccuracyLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Accuracy Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccuracyLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccuracyLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Accuracy Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccuracyLevel get(int value) {
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
	private AccuracyLevel(int value, String name, String literal) {
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
	
} //AccuracyLevel
