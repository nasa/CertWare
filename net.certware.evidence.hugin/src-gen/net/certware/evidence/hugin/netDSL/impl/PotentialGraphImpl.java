/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import java.util.Collection;

import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.PotentialGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialGraphImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialGraphImpl#getParents <em>Parents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotentialGraphImpl extends MinimalEObjectImpl.Container implements PotentialGraph
{
  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<String> children;

  /**
   * The cached value of the '{@link #getParents() <em>Parents</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParents()
   * @generated
   * @ordered
   */
  protected EList<String> parents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PotentialGraphImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NetDSLPackage.Literals.POTENTIAL_GRAPH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getChildren()
  {
    if (children == null)
    {
      children = new EDataTypeEList<String>(String.class, this, NetDSLPackage.POTENTIAL_GRAPH__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParents()
  {
    if (parents == null)
    {
      parents = new EDataTypeEList<String>(String.class, this, NetDSLPackage.POTENTIAL_GRAPH__PARENTS);
    }
    return parents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NetDSLPackage.POTENTIAL_GRAPH__CHILDREN:
        return getChildren();
      case NetDSLPackage.POTENTIAL_GRAPH__PARENTS:
        return getParents();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NetDSLPackage.POTENTIAL_GRAPH__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends String>)newValue);
        return;
      case NetDSLPackage.POTENTIAL_GRAPH__PARENTS:
        getParents().clear();
        getParents().addAll((Collection<? extends String>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NetDSLPackage.POTENTIAL_GRAPH__CHILDREN:
        getChildren().clear();
        return;
      case NetDSLPackage.POTENTIAL_GRAPH__PARENTS:
        getParents().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NetDSLPackage.POTENTIAL_GRAPH__CHILDREN:
        return children != null && !children.isEmpty();
      case NetDSLPackage.POTENTIAL_GRAPH__PARENTS:
        return parents != null && !parents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (children: ");
    result.append(children);
    result.append(", parents: ");
    result.append(parents);
    result.append(')');
    return result.toString();
  }

} //PotentialGraphImpl
