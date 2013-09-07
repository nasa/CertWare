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
 * A representation of the literals of the enumeration '<em><b>Likelihood FAA</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.hazard.HazardPackage#getLikelihood_FAA()
 * @model
 * @generated
 */
public enum Likelihood_FAA implements Enumerator {
	/**
	 * The '<em><b>EXTREMELY IMPROBABLE D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTREMELY_IMPROBABLE_D_VALUE
	 * @generated
	 * @ordered
	 */
	EXTREMELY_IMPROBABLE_D(0, "EXTREMELY_IMPROBABLE_D", "EXTREMELY_IMPROBABLE_D"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>EXTREMELY REMOTE C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTREMELY_REMOTE_C_VALUE
	 * @generated
	 * @ordered
	 */
	EXTREMELY_REMOTE_C(1, "EXTREMELY_REMOTE_C", "EXTREMELY_REMOTE_C"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>REMOTE B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_B_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_B(2, "REMOTE_B", "REMOTE_B"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PROBABLE A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABLE_A_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABLE_A(3, "PROBABLE_A", "PROBABLE_A"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>EXTREMELY IMPROBABLE D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTREMELY IMPROBABLE D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTREMELY_IMPROBABLE_D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTREMELY_IMPROBABLE_D_VALUE = 0;

	/**
	 * The '<em><b>EXTREMELY REMOTE C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTREMELY REMOTE C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTREMELY_REMOTE_C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTREMELY_REMOTE_C_VALUE = 1;

	/**
	 * The '<em><b>REMOTE B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOTE B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_B_VALUE = 2;

	/**
	 * The '<em><b>PROBABLE A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROBABLE A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROBABLE_A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROBABLE_A_VALUE = 3;

	/**
	 * An array of all the '<em><b>Likelihood FAA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Likelihood_FAA[] VALUES_ARRAY =
		new Likelihood_FAA[] {
			EXTREMELY_IMPROBABLE_D,
			EXTREMELY_REMOTE_C,
			REMOTE_B,
			PROBABLE_A,
		};

	/**
	 * A public read-only list of all the '<em><b>Likelihood FAA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Likelihood_FAA> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Likelihood FAA</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Likelihood_FAA get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Likelihood_FAA result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Likelihood FAA</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Likelihood_FAA getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Likelihood_FAA result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Likelihood FAA</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Likelihood_FAA get(int value) {
		switch (value) {
			case EXTREMELY_IMPROBABLE_D_VALUE: return EXTREMELY_IMPROBABLE_D;
			case EXTREMELY_REMOTE_C_VALUE: return EXTREMELY_REMOTE_C;
			case REMOTE_B_VALUE: return REMOTE_B;
			case PROBABLE_A_VALUE: return PROBABLE_A;
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
	private Likelihood_FAA(int value, String name, String literal) {
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
	
} //Likelihood_FAA
