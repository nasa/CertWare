/**
 */
package stateAnalysis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import stateAnalysis.StateAnalysisFactory;
import stateAnalysis.StateAnalysisPackage;
import stateAnalysis.StateVariable;

/**
 * This is the item provider adapter for a {@link stateAnalysis.StateVariable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateVariableItemProvider
  extends ComponentItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateVariableItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addRepresentationTypePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Representation Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRepresentationTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_StateVariable_representationType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_StateVariable_representationType_feature", "_UI_StateVariable_type"),
         StateAnalysisPackage.Literals.STATE_VARIABLE__REPRESENTATION_TYPE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(StateAnalysisPackage.Literals.STATE_VARIABLE__IN_STATE_CONSTRAINTS);
      childrenFeatures.add(StateAnalysisPackage.Literals.STATE_VARIABLE__OUT_STATE_CONSTRAINTS);
      childrenFeatures.add(StateAnalysisPackage.Literals.STATE_VARIABLE__STATE_UPDATES);
      childrenFeatures.add(StateAnalysisPackage.Literals.STATE_VARIABLE__INFLUENCED_BY);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns StateVariable.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/StateVariable"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((StateVariable)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_StateVariable_type") :
      getString("_UI_StateVariable_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(StateVariable.class))
    {
      case StateAnalysisPackage.STATE_VARIABLE__REPRESENTATION_TYPE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case StateAnalysisPackage.STATE_VARIABLE__IN_STATE_CONSTRAINTS:
      case StateAnalysisPackage.STATE_VARIABLE__OUT_STATE_CONSTRAINTS:
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
      case StateAnalysisPackage.STATE_VARIABLE__INFLUENCED_BY:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (StateAnalysisPackage.Literals.STATE_VARIABLE__IN_STATE_CONSTRAINTS,
         StateAnalysisFactory.eINSTANCE.createStateConstraint()));

    newChildDescriptors.add
      (createChildParameter
        (StateAnalysisPackage.Literals.STATE_VARIABLE__OUT_STATE_CONSTRAINTS,
         StateAnalysisFactory.eINSTANCE.createStateConstraint()));

    newChildDescriptors.add
      (createChildParameter
        (StateAnalysisPackage.Literals.STATE_VARIABLE__STATE_UPDATES,
         StateAnalysisFactory.eINSTANCE.createStateUpdate()));

    newChildDescriptors.add
      (createChildParameter
        (StateAnalysisPackage.Literals.STATE_VARIABLE__INFLUENCED_BY,
         StateAnalysisFactory.eINSTANCE.createStateVariable()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == StateAnalysisPackage.Literals.STATE_VARIABLE__IN_STATE_CONSTRAINTS ||
      childFeature == StateAnalysisPackage.Literals.STATE_VARIABLE__OUT_STATE_CONSTRAINTS;

    if (qualify)
    {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
