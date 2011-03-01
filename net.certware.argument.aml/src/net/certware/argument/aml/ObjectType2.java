/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.certware.argument.aml.AmlPackage#getObjectType2()
 * @model extendedMetaData="name='object-type_._2_._type'"
 * @generated
 */
public enum ObjectType2 implements Enumerator {
	/**
	 * The '<em><b>MISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISC_VALUE
	 * @generated
	 * @ordered
	 */
	MISC(0, "MISC", "MISC"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SEQUENTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENTIAL(1, "SEQUENTIAL", "SEQUENTIAL"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>VERSIONING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSIONING_VALUE
	 * @generated
	 * @ordered
	 */
	VERSIONING(2, "VERSIONING", "VERSIONING"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(3, "group", "group"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Argument</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARGUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ARGUMENT(4, "argument", "argument"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATE(5, "template", "template"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * The '<em><b>MISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MISC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MISC_VALUE = 0;

	/**
	 * The '<em><b>SEQUENTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEQUENTIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL_VALUE = 1;

	/**
	 * The '<em><b>VERSIONING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERSIONING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERSIONING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSIONING_VALUE = 2;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUP
	 * @model name="group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 3;

	/**
	 * The '<em><b>Argument</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Argument</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARGUMENT
	 * @model name="argument"
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT_VALUE = 4;

	/**
	 * The '<em><b>Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Template</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPLATE
	 * @model name="template"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Object Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectType2[] VALUES_ARRAY =
		new ObjectType2[] {
			MISC,
			SEQUENTIAL,
			VERSIONING,
			GROUP,
			ARGUMENT,
			TEMPLATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Type2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectType2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectType2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Type2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectType2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectType2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Type2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectType2 get(int value) {
		switch (value) {
			case MISC_VALUE: return MISC;
			case SEQUENTIAL_VALUE: return SEQUENTIAL;
			case VERSIONING_VALUE: return VERSIONING;
			case GROUP_VALUE: return GROUP;
			case ARGUMENT_VALUE: return ARGUMENT;
			case TEMPLATE_VALUE: return TEMPLATE;
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
	private ObjectType2(int value, String name, String literal) {
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
	
} //ObjectType2
