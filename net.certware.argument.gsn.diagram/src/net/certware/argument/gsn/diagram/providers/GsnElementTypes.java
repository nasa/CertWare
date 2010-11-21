/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyGoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyJustificationEditPart;
import net.certware.argument.gsn.diagram.part.GsnDiagramEditorPlugin;

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
public class GsnElementTypes {

	/**
	 * @generated
	 */
	private GsnElementTypes() {
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
	public static final IElementType ArgumentDiagram_1000 = getElementType("net.certware.argument.gsn.diagram.ArgumentDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2009 = getElementType("net.certware.argument.gsn.diagram.Goal_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Justification_2008 = getElementType("net.certware.argument.gsn.diagram.Justification_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyGoal_4002 = getElementType("net.certware.argument.gsn.diagram.StrategyGoal_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StrategyJustification_4001 = getElementType("net.certware.argument.gsn.diagram.StrategyJustification_4001"); //$NON-NLS-1$

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
				return GsnDiagramEditorPlugin.getInstance()
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
					GsnPackage.eINSTANCE.getArgumentDiagram());

			elements.put(Goal_2009, GsnPackage.eINSTANCE.getGoal());

			elements.put(Justification_2008,
					GsnPackage.eINSTANCE.getJustification());

			elements.put(StrategyGoal_4002,
					GsnPackage.eINSTANCE.getStrategy_Goal());

			elements.put(StrategyJustification_4001,
					GsnPackage.eINSTANCE.getStrategy_Justification());
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
			KNOWN_ELEMENT_TYPES.add(Goal_2009);
			KNOWN_ELEMENT_TYPES.add(Justification_2008);
			KNOWN_ELEMENT_TYPES.add(StrategyGoal_4002);
			KNOWN_ELEMENT_TYPES.add(StrategyJustification_4001);
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
		case GoalEditPart.VISUAL_ID:
			return Goal_2009;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2008;
		case StrategyGoalEditPart.VISUAL_ID:
			return StrategyGoal_4002;
		case StrategyJustificationEditPart.VISUAL_ID:
			return StrategyJustification_4001;
		}
		return null;
	}

}
