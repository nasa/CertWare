/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.LagFormatType;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.PredecessorLinkType;
import net.certware.planning.mspdi.TypeType4;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predecessor Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl#getPredecessorUID <em>Predecessor UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl#isCrossProject <em>Cross Project</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl#getCrossProjectName <em>Cross Project Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl#getLinkLag <em>Link Lag</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.PredecessorLinkTypeImpl#getLagFormat <em>Lag Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredecessorLinkTypeImpl extends EObjectImpl implements PredecessorLinkType {
	/**
	 * The default value of the '{@link #getPredecessorUID() <em>Predecessor UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PREDECESSOR_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredecessorUID() <em>Predecessor UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger predecessorUID = PREDECESSOR_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType4 TYPE_EDEFAULT = TypeType4._0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType4 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #isCrossProject() <em>Cross Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrossProject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CROSS_PROJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCrossProject() <em>Cross Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrossProject()
	 * @generated
	 * @ordered
	 */
	protected boolean crossProject = CROSS_PROJECT_EDEFAULT;

	/**
	 * This is true if the Cross Project attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crossProjectESet;

	/**
	 * The default value of the '{@link #getCrossProjectName() <em>Cross Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSS_PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossProjectName() <em>Cross Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossProjectName()
	 * @generated
	 * @ordered
	 */
	protected String crossProjectName = CROSS_PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkLag() <em>Link Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkLag()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINK_LAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkLag() <em>Link Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkLag()
	 * @generated
	 * @ordered
	 */
	protected BigInteger linkLag = LINK_LAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLagFormat() <em>Lag Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLagFormat()
	 * @generated
	 * @ordered
	 */
	protected static final LagFormatType LAG_FORMAT_EDEFAULT = LagFormatType._3;

	/**
	 * The cached value of the '{@link #getLagFormat() <em>Lag Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLagFormat()
	 * @generated
	 * @ordered
	 */
	protected LagFormatType lagFormat = LAG_FORMAT_EDEFAULT;

	/**
	 * This is true if the Lag Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lagFormatESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredecessorLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.PREDECESSOR_LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPredecessorUID() {
		return predecessorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessorUID(BigInteger newPredecessorUID) {
		BigInteger oldPredecessorUID = predecessorUID;
		predecessorUID = newPredecessorUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PREDECESSOR_LINK_TYPE__PREDECESSOR_UID, oldPredecessorUID, predecessorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType4 newType) {
		TypeType4 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PREDECESSOR_LINK_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType4 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PREDECESSOR_LINK_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCrossProject() {
		return crossProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossProject(boolean newCrossProject) {
		boolean oldCrossProject = crossProject;
		crossProject = newCrossProject;
		boolean oldCrossProjectESet = crossProjectESet;
		crossProjectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT, oldCrossProject, crossProject, !oldCrossProjectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrossProject() {
		boolean oldCrossProject = crossProject;
		boolean oldCrossProjectESet = crossProjectESet;
		crossProject = CROSS_PROJECT_EDEFAULT;
		crossProjectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT, oldCrossProject, CROSS_PROJECT_EDEFAULT, oldCrossProjectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossProject() {
		return crossProjectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrossProjectName() {
		return crossProjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossProjectName(String newCrossProjectName) {
		String oldCrossProjectName = crossProjectName;
		crossProjectName = newCrossProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT_NAME, oldCrossProjectName, crossProjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLinkLag() {
		return linkLag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkLag(BigInteger newLinkLag) {
		BigInteger oldLinkLag = linkLag;
		linkLag = newLinkLag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PREDECESSOR_LINK_TYPE__LINK_LAG, oldLinkLag, linkLag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LagFormatType getLagFormat() {
		return lagFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLagFormat(LagFormatType newLagFormat) {
		LagFormatType oldLagFormat = lagFormat;
		lagFormat = newLagFormat == null ? LAG_FORMAT_EDEFAULT : newLagFormat;
		boolean oldLagFormatESet = lagFormatESet;
		lagFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PREDECESSOR_LINK_TYPE__LAG_FORMAT, oldLagFormat, lagFormat, !oldLagFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLagFormat() {
		LagFormatType oldLagFormat = lagFormat;
		boolean oldLagFormatESet = lagFormatESet;
		lagFormat = LAG_FORMAT_EDEFAULT;
		lagFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PREDECESSOR_LINK_TYPE__LAG_FORMAT, oldLagFormat, LAG_FORMAT_EDEFAULT, oldLagFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLagFormat() {
		return lagFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.PREDECESSOR_LINK_TYPE__PREDECESSOR_UID:
				return getPredecessorUID();
			case MspdiPackage.PREDECESSOR_LINK_TYPE__TYPE:
				return getType();
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT:
				return isCrossProject();
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT_NAME:
				return getCrossProjectName();
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LINK_LAG:
				return getLinkLag();
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LAG_FORMAT:
				return getLagFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MspdiPackage.PREDECESSOR_LINK_TYPE__PREDECESSOR_UID:
				setPredecessorUID((BigInteger)newValue);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__TYPE:
				setType((TypeType4)newValue);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT:
				setCrossProject((Boolean)newValue);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT_NAME:
				setCrossProjectName((String)newValue);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LINK_LAG:
				setLinkLag((BigInteger)newValue);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LAG_FORMAT:
				setLagFormat((LagFormatType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MspdiPackage.PREDECESSOR_LINK_TYPE__PREDECESSOR_UID:
				setPredecessorUID(PREDECESSOR_UID_EDEFAULT);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__TYPE:
				unsetType();
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT:
				unsetCrossProject();
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT_NAME:
				setCrossProjectName(CROSS_PROJECT_NAME_EDEFAULT);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LINK_LAG:
				setLinkLag(LINK_LAG_EDEFAULT);
				return;
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LAG_FORMAT:
				unsetLagFormat();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MspdiPackage.PREDECESSOR_LINK_TYPE__PREDECESSOR_UID:
				return PREDECESSOR_UID_EDEFAULT == null ? predecessorUID != null : !PREDECESSOR_UID_EDEFAULT.equals(predecessorUID);
			case MspdiPackage.PREDECESSOR_LINK_TYPE__TYPE:
				return isSetType();
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT:
				return isSetCrossProject();
			case MspdiPackage.PREDECESSOR_LINK_TYPE__CROSS_PROJECT_NAME:
				return CROSS_PROJECT_NAME_EDEFAULT == null ? crossProjectName != null : !CROSS_PROJECT_NAME_EDEFAULT.equals(crossProjectName);
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LINK_LAG:
				return LINK_LAG_EDEFAULT == null ? linkLag != null : !LINK_LAG_EDEFAULT.equals(linkLag);
			case MspdiPackage.PREDECESSOR_LINK_TYPE__LAG_FORMAT:
				return isSetLagFormat();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (predecessorUID: ");
		result.append(predecessorUID);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", crossProject: ");
		if (crossProjectESet) result.append(crossProject); else result.append("<unset>");
		result.append(", crossProjectName: ");
		result.append(crossProjectName);
		result.append(", linkLag: ");
		result.append(linkLag);
		result.append(", lagFormat: ");
		if (lagFormatESet) result.append(lagFormat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PredecessorLinkTypeImpl
