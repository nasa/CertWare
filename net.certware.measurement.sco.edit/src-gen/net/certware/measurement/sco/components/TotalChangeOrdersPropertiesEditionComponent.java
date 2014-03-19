/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.components;

// Start of user code for imports
import net.certware.measurement.sco.ChangeOrderType;
import net.certware.measurement.sco.ScoPackage;
import net.certware.measurement.sco.TotalChangeOrders;
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
	

// End of user code

/**
 * 
 * 
 */
public class TotalChangeOrdersPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TotalChangeOrdersPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject totalChangeOrders, String editing_mode) {
		super(editingContext, totalChangeOrders, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScoViewsRepository.class;
		partKey = ScoViewsRepository.TotalChangeOrders.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final TotalChangeOrders totalChangeOrders = (TotalChangeOrders)elt;
			final TotalChangeOrdersPropertiesEditionPart basePart = (TotalChangeOrdersPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, totalChangeOrders.getName()));
			
			if (isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.value)) {
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, totalChangeOrders.getValue()));
			}
			
			if (isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.type)) {
				basePart.initType(EEFUtils.choiceOfValues(totalChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_Type()), totalChangeOrders.getType());
			}
			if (isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.brokenLines)) {
				basePart.setBrokenLines(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, totalChangeOrders.getBrokenLines()));
			}
			
			if (isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.fixedLines)) {
				basePart.setFixedLines(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, totalChangeOrders.getFixedLines()));
			}
			
			if (isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.repairEffort)) {
				basePart.setRepairEffort(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, totalChangeOrders.getRepairEffort()));
			}
			
			// init filters
			
			
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ScoViewsRepository.TotalChangeOrders.Properties.name) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_Name();
		}
		if (editorKey == ScoViewsRepository.TotalChangeOrders.Properties.value) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_Value();
		}
		if (editorKey == ScoViewsRepository.TotalChangeOrders.Properties.type) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_Type();
		}
		if (editorKey == ScoViewsRepository.TotalChangeOrders.Properties.brokenLines) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines();
		}
		if (editorKey == ScoViewsRepository.TotalChangeOrders.Properties.fixedLines) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines();
		}
		if (editorKey == ScoViewsRepository.TotalChangeOrders.Properties.repairEffort) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TotalChangeOrders totalChangeOrders = (TotalChangeOrders)semanticObject;
		if (ScoViewsRepository.TotalChangeOrders.Properties.name == event.getAffectedEditor()) {
			totalChangeOrders.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ScoViewsRepository.TotalChangeOrders.Properties.value == event.getAffectedEditor()) {
			totalChangeOrders.setValue((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (ScoViewsRepository.TotalChangeOrders.Properties.type == event.getAffectedEditor()) {
			totalChangeOrders.setType((ChangeOrderType)event.getNewValue());
		}
		if (ScoViewsRepository.TotalChangeOrders.Properties.brokenLines == event.getAffectedEditor()) {
			totalChangeOrders.setBrokenLines((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (ScoViewsRepository.TotalChangeOrders.Properties.fixedLines == event.getAffectedEditor()) {
			totalChangeOrders.setFixedLines((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (ScoViewsRepository.TotalChangeOrders.Properties.repairEffort == event.getAffectedEditor()) {
			totalChangeOrders.setRepairEffort((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TotalChangeOrdersPropertiesEditionPart basePart = (TotalChangeOrdersPropertiesEditionPart)editingPart;
			if (ScoPackage.eINSTANCE.getChangeOrderCount_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_Type().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.type))
				basePart.setType((ChangeOrderType)msg.getNewValue());
			
			if (ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.brokenLines)) {
				if (msg.getNewValue() != null) {
					basePart.setBrokenLines(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setBrokenLines("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.fixedLines)) {
				if (msg.getNewValue() != null) {
					basePart.setFixedLines(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setFixedLines("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.TotalChangeOrders.Properties.repairEffort)) {
				if (msg.getNewValue() != null) {
					basePart.setRepairEffort(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setRepairEffort("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			ScoPackage.eINSTANCE.getChangeOrderCount_Name(),
			ScoPackage.eINSTANCE.getChangeOrderCount_Value(),
			ScoPackage.eINSTANCE.getChangeOrderCount_Type(),
			ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines(),
			ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines(),
			ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ScoViewsRepository.TotalChangeOrders.Properties.name || key == ScoViewsRepository.TotalChangeOrders.Properties.value || key == ScoViewsRepository.TotalChangeOrders.Properties.type || key == ScoViewsRepository.TotalChangeOrders.Properties.brokenLines || key == ScoViewsRepository.TotalChangeOrders.Properties.fixedLines || key == ScoViewsRepository.TotalChangeOrders.Properties.repairEffort;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ScoViewsRepository.TotalChangeOrders.Properties.name)
			return "The name of the change order type"; //$NON-NLS-1$
		if (key == ScoViewsRepository.TotalChangeOrders.Properties.value)
			return "The number of change orders for this type"; //$NON-NLS-1$
		if (key == ScoViewsRepository.TotalChangeOrders.Properties.type)
			return "The change order type identifier"; //$NON-NLS-1$
		if (key == ScoViewsRepository.TotalChangeOrders.Properties.brokenLines)
			return "The estimated number of broken lines in the current artifact"; //$NON-NLS-1$
		if (key == ScoViewsRepository.TotalChangeOrders.Properties.fixedLines)
			return "The number of lines fixed in the current artifact and represented by the repair effort"; //$NON-NLS-1$
		if (key == ScoViewsRepository.TotalChangeOrders.Properties.repairEffort)
			return "The hours of repair effort corresponding to the fixed lines in the current artifact"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ScoViewsRepository.TotalChangeOrders.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Name().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.TotalChangeOrders.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Value().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.TotalChangeOrders.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.TotalChangeOrders.Properties.brokenLines == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.TotalChangeOrders.Properties.fixedLines == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.TotalChangeOrders.Properties.repairEffort == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

<<<<<<< HEAD

	
=======
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> refs/heads/master

}
