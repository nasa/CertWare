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
 * A representation of the literals of the enumeration '<em><b>Likelihood MIL STD 882D</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.hazard.HazardPackage#getLikelihood_MIL_STD_882D()
 * @model
 * @generated
 */
public enum Likelihood_MIL_STD_882D implements Enumerator {
	/**
	 * The '<em><b>IMPROBABLE E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE_E_VALUE
	 * @generated
	 * @ordered
	 */
	IMPROBABLE_E(0, "IMPROBABLE_E", "IMPROBABLE_E"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>REMOTE D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_D_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_D(1, "REMOTE_D", "REMOTE_D"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OCCASIONAL C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCASIONAL_C_VALUE
	 * @generated
	 * @ordered
	 */
	OCCASIONAL_C(2, "OCCASIONAL_C", "OCCASIONAL_C"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PROBABLE B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABLE_B_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABLE_B(0, "PROBABLE_B", "PROBABLE_B"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FREQUENT A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENT_A_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENT_A(0, "FREQUENT_A", "FREQUENT_A"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>IMPROBABLE E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPROBABLE E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE_E
	 * @model annotation="MIL_STD_882D individual='So unlikely, it can be assumed occurrence may not be experienced, with a probability of occurrence less than 10E-6 in that life.' inventory='Unlikely to occur, but possible'"
	 * @generated
	 * @ordered
	 */
	public static final int IMPROBABLE_E_VALUE = 0;

	/**
	 * The '<em><b>REMOTE D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOTE D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_D
	 * @model annotation="MIL_STD_882D individual='Unlikely but possible to occur in the life of an item, with a probability of occurrence less\r10E-3 but greater than 10E-6 in that life.' inventory='Unlikely, but can reasonably be expected to occur.'"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_D_VALUE = 1;

	/**
	 * The '<em><b>OCCASIONAL C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCCASIONAL C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCASIONAL_C
	 * @model annotation="MIL_STD_882D individual='Likely to occur some time in the life of an item, with a probability of occurrence less\rthan 10E-2 but greater than 10E-3 in that life.' inventory='Will occur several times.'"
	 * @generated
	 * @ordered
	 */
	public static final int OCCASIONAL_C_VALUE = 2;

	/**
	 * The '<em><b>PROBABLE B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROBABLE B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROBABLE_B
	 * @model annotation="MIL_STD_882D individual='Will occur several times in the life of an item, with a probability of occurrence less than 10E-1 but greater than 10E-2 in that life.' inventory='Will occur frequently.'"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABLE_B_VALUE = 0;

	/**
	 * The '<em><b>FREQUENT A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREQUENT A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREQUENT_A
	 * @model annotation="MIL_STD_882D individual='Likely to occur often in the life of an item, with a probability of occurrence greater than 10E-1 in that life.' inventory='Continuously experienced.'"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENT_A_VALUE = 0;

	/**
	 * An array of all the '<em><b>Likelihood MIL STD 882D</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Likelihood_MIL_STD_882D[] VALUES_ARRAY =
		new Likelihood_MIL_STD_882D[] {
			IMPROBABLE_E,
			REMOTE_D,
			OCCASIONAL_C,
			PROBABLE_B,
			FREQUENT_A,
		};

	/**
	 * A public read-only list of all the '<em><b>Likelihood MIL STD 882D</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Likelihood_MIL_STD_882D> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Likelihood MIL STD 882D</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Likelihood_MIL_STD_882D get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Likelihood_MIL_STD_882D result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Likelihood MIL STD 882D</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Likelihood_MIL_STD_882D getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Likelihood_MIL_STD_882D result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Likelihood MIL STD 882D</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Likelihood_MIL_STD_882D get(int value) {
		switch (value) {
			case IMPROBABLE_E_VALUE: return IMPROBABLE_E;
			case REMOTE_D_VALUE: return REMOTE_D;
			case OCCASIONAL_C_VALUE: return OCCASIONAL_C;
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
	private Likelihood_MIL_STD_882D(int value, String name, String literal) {
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
	
} //Likelihood_MIL_STD_882D
