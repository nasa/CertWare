/**
 */
package ftp.provider;


import ftp.ComposedComponent;
import ftp.FtpFactory;
import ftp.FtpPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ftp.ComposedComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposedComponentItemProvider extends ComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCompositionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Composition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComposedComponent_composition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComposedComponent_composition_feature", "_UI_ComposedComponent_type"),
				 FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 true,
				 false,
				 true,
				 null,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION);
			childrenFeatures.add(FtpPackage.Literals.COMPOSED_COMPONENT__PORTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComposedComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComposedComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComposedComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComposedComponent_type") :
			getString("_UI_ComposedComponent_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComposedComponent.class)) {
			case FtpPackage.COMPOSED_COMPONENT__COMPOSITION:
			case FtpPackage.COMPOSED_COMPONENT__PORTS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createCompositionElement()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createDigintalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createAnalogConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createSignalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createElectricalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createHydraulicConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createMechanicalConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createPrimitiveComponent()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createComposedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createResistor()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createCapacitor()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createAnalogBattery()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createAnalogSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createAnalogLamp()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createDigitalBattery()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createDigitalSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createDigitalLamp()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createNTransistor()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createPTransistor()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createDFlipFlop()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createVisualConnection()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__COMPOSITION,
				 FtpFactory.eINSTANCE.createSignalConstant()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__PORTS,
				 FtpFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__PORTS,
				 FtpFactory.eINSTANCE.createSignalPort()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__PORTS,
				 FtpFactory.eINSTANCE.createElectricalPort()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__PORTS,
				 FtpFactory.eINSTANCE.createHydraulicPort()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__PORTS,
				 FtpFactory.eINSTANCE.createVisualPort()));

		newChildDescriptors.add
			(createChildParameter
				(FtpPackage.Literals.COMPOSED_COMPONENT__PORTS,
				 FtpFactory.eINSTANCE.createMechanicalPort()));
	}

}
