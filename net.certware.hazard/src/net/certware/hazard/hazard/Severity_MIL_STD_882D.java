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
 * A representation of the literals of the enumeration '<em><b>Severity MIL STD 882D</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.hazard.HazardPackage#getSeverity_MIL_STD_882D()
 * @model
 * @generated
 */
public enum Severity_MIL_STD_882D implements Enumerator {
	/**
	 * The '<em><b>NEGLIGIBLE IV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGLIGIBLE_IV_VALUE
	 * @generated
	 * @ordered
	 */
	NEGLIGIBLE_IV(4, "NEGLIGIBLE_IV", "NEGLIGIBLE_IV"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MARGINAL III</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARGINAL_III_VALUE
	 * @generated
	 * @ordered
	 */
	MARGINAL_III(3, "MARGINAL_III", "MARGINAL_III"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CRITICAL II</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_II_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL_II(2, "CRITICAL_II", "CRITICAL_II"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CATASTROPHIC I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC_I_VALUE
	 * @generated
	 * @ordered
	 */
	CATASTROPHIC_I(1, "CATASTROPHIC_I", "CATASTROPHIC_I"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NEGLIGIBLE IV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEGLIGIBLE IV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGLIGIBLE_IV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEGLIGIBLE_IV_VALUE = 4;

	/**
	 * The '<em><b>MARGINAL III</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MARGINAL III</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARGINAL_III
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MARGINAL_III_VALUE = 3;

	/**
	 * The '<em><b>CRITICAL II</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRITICAL II</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_II
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_II_VALUE = 2;

	/**
	 * The '<em><b>CATASTROPHIC I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CATASTROPHIC I</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC_I
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATASTROPHIC_I_VALUE = 1;

	/**
	 * An array of all the '<em><b>Severity MIL STD 882D</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Severity_MIL_STD_882D[] VALUES_ARRAY =
		new Severity_MIL_STD_882D[] {
			NEGLIGIBLE_IV,
			MARGINAL_III,
			CRITICAL_II,
			CATASTROPHIC_I,
		};

	/**
	 * A public read-only list of all the '<em><b>Severity MIL STD 882D</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Severity_MIL_STD_882D> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Severity MIL STD 882D</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity_MIL_STD_882D get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity_MIL_STD_882D result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity MIL STD 882D</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity_MIL_STD_882D getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity_MIL_STD_882D result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity MIL STD 882D</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity_MIL_STD_882D get(int value) {
		switch (value) {
			case NEGLIGIBLE_IV_VALUE: return NEGLIGIBLE_IV;
			case MARGINAL_III_VALUE: return MARGINAL_III;
			case CRITICAL_II_VALUE: return CRITICAL_II;
			case CATASTROPHIC_I_VALUE: return CATASTROPHIC_I;
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
	private Severity_MIL_STD_882D(int value, String name, String literal) {
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
	
} //Severity_MIL_STD_882D
