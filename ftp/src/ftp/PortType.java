/**
 */
package ftp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Port Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ftp.FtpPackage#getPortType()
 * @model
 * @generated
 */
public enum PortType implements Enumerator {
	/**
	 * The '<em><b>Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL(0, "signal", "signal"),

	/**
	 * The '<em><b>Electrical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL(1, "electrical", "electrical"),

	/**
	 * The '<em><b>Hydraulic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYDRAULIC_VALUE
	 * @generated
	 * @ordered
	 */
	HYDRAULIC(2, "hydraulic", "hydraulic"),

	/**
	 * The '<em><b>Mechanical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MECHANICAL(3, "mechanical", "mechanical");

	/**
	 * The '<em><b>Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL
	 * @model name="signal"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_VALUE = 0;

	/**
	 * The '<em><b>Electrical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electrical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL
	 * @model name="electrical"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_VALUE = 1;

	/**
	 * The '<em><b>Hydraulic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hydraulic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYDRAULIC
	 * @model name="hydraulic"
	 * @generated
	 * @ordered
	 */
	public static final int HYDRAULIC_VALUE = 2;

	/**
	 * The '<em><b>Mechanical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mechanical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL
	 * @model name="mechanical"
	 * @generated
	 * @ordered
	 */
	public static final int MECHANICAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Port Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortType[] VALUES_ARRAY =
		new PortType[] {
			SIGNAL,
			ELECTRICAL,
			HYDRAULIC,
			MECHANICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Port Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PortType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Port Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortType get(int value) {
		switch (value) {
			case SIGNAL_VALUE: return SIGNAL;
			case ELECTRICAL_VALUE: return ELECTRICAL;
			case HYDRAULIC_VALUE: return HYDRAULIC;
			case MECHANICAL_VALUE: return MECHANICAL;
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
	private PortType(int value, String name, String literal) {
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
	
} //PortType
