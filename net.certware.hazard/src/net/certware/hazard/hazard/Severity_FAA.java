/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Severity FAA</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.hazard.HazardPackage#getSeverity_FAA()
 * @model
 * @generated
 */
public enum Severity_FAA implements Enumerator {
	/**
	 * The '<em><b>NO SAFETY EFFECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SAFETY_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SAFETY_EFFECT(5, "NO_SAFETY_EFFECT", "NO_SAFETY_EFFECT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MINOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR(4, "MINOR", "MINOR"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MAJOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR(3, "MAJOR", "MAJOR"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>HAZARDOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAZARDOUS_VALUE
	 * @generated
	 * @ordered
	 */
	HAZARDOUS(2, "HAZARDOUS", "HAZARDOUS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CATASTROPHIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	CATASTROPHIC(1, "CATASTROPHIC", "CATASTROPHIC"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NO SAFETY EFFECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO SAFETY EFFECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SAFETY_EFFECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_SAFETY_EFFECT_VALUE = 5;

	/**
	 * The '<em><b>MINOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_VALUE = 4;

	/**
	 * The '<em><b>MAJOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAJOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_VALUE = 3;

	/**
	 * The '<em><b>HAZARDOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HAZARDOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAZARDOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HAZARDOUS_VALUE = 2;

	/**
	 * The '<em><b>CATASTROPHIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CATASTROPHIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATASTROPHIC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Severity FAA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Severity_FAA[] VALUES_ARRAY =
		new Severity_FAA[] {
			NO_SAFETY_EFFECT,
			MINOR,
			MAJOR,
			HAZARDOUS,
			CATASTROPHIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Severity FAA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Severity_FAA> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Severity FAA</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity_FAA get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity_FAA result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity FAA</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity_FAA getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity_FAA result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity FAA</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity_FAA get(int value) {
		switch (value) {
			case NO_SAFETY_EFFECT_VALUE: return NO_SAFETY_EFFECT;
			case MINOR_VALUE: return MINOR;
			case MAJOR_VALUE: return MAJOR;
			case HAZARDOUS_VALUE: return HAZARDOUS;
			case CATASTROPHIC_VALUE: return CATASTROPHIC;
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
	private Severity_FAA(int value, String name, String literal) {
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
	
} //Severity_FAA
