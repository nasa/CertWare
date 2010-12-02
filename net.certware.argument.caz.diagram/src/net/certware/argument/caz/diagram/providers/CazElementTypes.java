package net.certware.argument.caz.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentJustificationEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimAssumptionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimSolutionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimStrategiesEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimSubClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.caz.diagram.part.CazDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class CazElementTypes {

	/**
	 * @generated
	 */
	private CazElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ArgumentDiagram_1000 = getElementType("net.certware.argument.caz.diagram.ArgumentDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Claim_2001 = getElementType("net.certware.argument.caz.diagram.Claim_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Evidence_2002 = getElementType("net.certware.argument.caz.diagram.Evidence_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Argument_2003 = getElementType("net.certware.argument.caz.diagram.Argument_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assumption_2004 = getElementType("net.certware.argument.caz.diagram.Assumption_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Justification_2005 = getElementType("net.certware.argument.caz.diagram.Justification_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Context_2006 = getElementType("net.certware.argument.caz.diagram.Context_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClaimClaimStrategies_4001 = getElementType("net.certware.argument.caz.diagram.ClaimClaimStrategies_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClaimClaimAssumptions_4002 = getElementType("net.certware.argument.caz.diagram.ClaimClaimAssumptions_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClaimClaimContexts_4003 = getElementType("net.certware.argument.caz.diagram.ClaimClaimContexts_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClaimClaimSolutions_4004 = getElementType("net.certware.argument.caz.diagram.ClaimClaimSolutions_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClaimSubClaims_4005 = getElementType("net.certware.argument.caz.diagram.ClaimSubClaims_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentJustification_4006 = getElementType("net.certware.argument.caz.diagram.ArgumentArgumentJustification_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentEvidence_4007 = getElementType("net.certware.argument.caz.diagram.ArgumentArgumentEvidence_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentClaims_4008 = getElementType("net.certware.argument.caz.diagram.ArgumentArgumentClaims_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EvidenceEvidenceContexts_4009 = getElementType("net.certware.argument.caz.diagram.EvidenceEvidenceContexts_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EvidenceEvidence_4010 = getElementType("net.certware.argument.caz.diagram.EvidenceEvidence_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return CazDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ArgumentDiagram_1000,
					CazPackage.eINSTANCE.getArgumentDiagram());

			elements.put(Claim_2001, CazPackage.eINSTANCE.getClaim());

			elements.put(Evidence_2002, CazPackage.eINSTANCE.getEvidence());

			elements.put(Argument_2003, CazPackage.eINSTANCE.getArgument());

			elements.put(Assumption_2004, CazPackage.eINSTANCE.getAssumption());

			elements.put(Justification_2005,
					CazPackage.eINSTANCE.getJustification());

			elements.put(Context_2006, CazPackage.eINSTANCE.getContext());

			elements.put(ClaimClaimStrategies_4001,
					CazPackage.eINSTANCE.getClaim_ClaimStrategies());

			elements.put(ClaimClaimAssumptions_4002,
					CazPackage.eINSTANCE.getClaim_ClaimAssumptions());

			elements.put(ClaimClaimContexts_4003,
					CazPackage.eINSTANCE.getClaim_ClaimContexts());

			elements.put(ClaimClaimSolutions_4004,
					CazPackage.eINSTANCE.getClaim_ClaimSolutions());

			elements.put(ClaimSubClaims_4005,
					CazPackage.eINSTANCE.getClaim_SubClaims());

			elements.put(ArgumentArgumentJustification_4006,
					CazPackage.eINSTANCE.getArgument_ArgumentJustification());

			elements.put(ArgumentArgumentEvidence_4007,
					CazPackage.eINSTANCE.getArgument_ArgumentEvidence());

			elements.put(ArgumentArgumentClaims_4008,
					CazPackage.eINSTANCE.getArgument_ArgumentClaims());

			elements.put(EvidenceEvidenceContexts_4009,
					CazPackage.eINSTANCE.getEvidence_EvidenceContexts());

			elements.put(EvidenceEvidence_4010,
					CazPackage.eINSTANCE.getEvidence_Evidence());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ArgumentDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Claim_2001);
			KNOWN_ELEMENT_TYPES.add(Evidence_2002);
			KNOWN_ELEMENT_TYPES.add(Argument_2003);
			KNOWN_ELEMENT_TYPES.add(Assumption_2004);
			KNOWN_ELEMENT_TYPES.add(Justification_2005);
			KNOWN_ELEMENT_TYPES.add(Context_2006);
			KNOWN_ELEMENT_TYPES.add(ClaimClaimStrategies_4001);
			KNOWN_ELEMENT_TYPES.add(ClaimClaimAssumptions_4002);
			KNOWN_ELEMENT_TYPES.add(ClaimClaimContexts_4003);
			KNOWN_ELEMENT_TYPES.add(ClaimClaimSolutions_4004);
			KNOWN_ELEMENT_TYPES.add(ClaimSubClaims_4005);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentJustification_4006);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentEvidence_4007);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentClaims_4008);
			KNOWN_ELEMENT_TYPES.add(EvidenceEvidenceContexts_4009);
			KNOWN_ELEMENT_TYPES.add(EvidenceEvidence_4010);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return ArgumentDiagram_1000;
		case ClaimEditPart.VISUAL_ID:
			return Claim_2001;
		case EvidenceEditPart.VISUAL_ID:
			return Evidence_2002;
		case ArgumentEditPart.VISUAL_ID:
			return Argument_2003;
		case AssumptionEditPart.VISUAL_ID:
			return Assumption_2004;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2005;
		case ContextEditPart.VISUAL_ID:
			return Context_2006;
		case ClaimClaimStrategiesEditPart.VISUAL_ID:
			return ClaimClaimStrategies_4001;
		case ClaimClaimAssumptionsEditPart.VISUAL_ID:
			return ClaimClaimAssumptions_4002;
		case ClaimClaimContextsEditPart.VISUAL_ID:
			return ClaimClaimContexts_4003;
		case ClaimClaimSolutionsEditPart.VISUAL_ID:
			return ClaimClaimSolutions_4004;
		case ClaimSubClaimsEditPart.VISUAL_ID:
			return ClaimSubClaims_4005;
		case ArgumentArgumentJustificationEditPart.VISUAL_ID:
			return ArgumentArgumentJustification_4006;
		case ArgumentArgumentEvidenceEditPart.VISUAL_ID:
			return ArgumentArgumentEvidence_4007;
		case ArgumentArgumentClaimsEditPart.VISUAL_ID:
			return ArgumentArgumentClaims_4008;
		case EvidenceEvidenceContextsEditPart.VISUAL_ID:
			return EvidenceEvidenceContexts_4009;
		case EvidenceEvidenceEditPart.VISUAL_ID:
			return EvidenceEvidence_4010;
		}
		return null;
	}

}
