/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.provider;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.ArgumentElement;
import net.certware.sacm.SACM.Argumentation.AssertedInference;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link net.certware.sacm.SACM.Argumentation.AssertedInference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertedInferenceItemProvider
	extends AssertedRelationshipItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemColorProvider,
		IItemFontProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedInferenceItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns AssertedInference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssertedInference")); //$NON-NLS-1$
	}

	/**
	 * Returns a parenthesized and comma-delimited string for an argument element list.
	 * @param e argument element list
	 * @return parenthesized and comma-delimited string or empty string
	 */
	private String listToString(EList<ArgumentElement> e) {
		StringBuffer sb = new StringBuffer();
		Iterator<ArgumentElement> i = e.iterator();
		sb.append('(');
		while( i.hasNext() ) {
			ArgumentElement ae = (ArgumentElement)i.next();
			sb.append(ae.getId());
			if ( i.hasNext() )
				sb.append(',');
		}
		sb.append(')');
		return sb.toString();
	}
	
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssertedInference)object).getId();
		EList<ArgumentElement> sources = ((AssertedInference)object).getSource();
		EList<ArgumentElement> targets = ((AssertedInference)object).getTarget();
		
		return label == null || label.length() == 0 ?
			getString("_UI_AssertedInference_type") : //$NON-NLS-1$
				getString("_UI_AssertedInference_type") + " " + label + ": " + 
				listToString(sources) + "->" + listToString(targets); //$NON-NLS-1$ //$NON-NLS-2$
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
	}

}
