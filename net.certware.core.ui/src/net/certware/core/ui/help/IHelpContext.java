/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.core.ui.help;

import net.certware.core.ui.CertWareUI;

/**
 * Help context ID interface.  
 * Used to store help context IDs in a single place for reference by UI plugins.
 * In the help content projects, use this plugin's ID as the reference plugin for the contexts extension point contributions.
 * @author mrb
 * @since 1.0
 */
public interface IHelpContext {
	/** prefix for every context ID contributed for CertWare */
	public static String PREFIX = CertWareUI.PLUGIN_ID + '.';
	
	// ARM-related context IDs
	/** ARM editor model element context ID */
	public static String ARM_EDITOR_MODEL_ELEMENT = PREFIX + "arm_editor_model_element_context"; //$NON-NLS-1$
	/** ARM editor argument element context ID */
	public static String ARM_EDITOR_ARGUMENT_ELEMENT = PREFIX + "arm_editor_argument_element_context"; //$NON-NLS-1$
	/** ARM editor information element context ID */
	public static String ARM_EDITOR_INFORMATION_ELEMENT = PREFIX + "arm_editor_information_element_context"; //$NON-NLS-1$
	/** ARM editor reasoning element context ID */
	public static String ARM_EDITOR_REASONING_ELEMENT = PREFIX + "arm_editor_reasoning_element_context"; //$NON-NLS-1$
	/** ARM editor claim element context ID */
	public static String ARM_EDITOR_CLAIM_ELEMENT = PREFIX + "arm_editor_claim_element_context"; //$NON-NLS-1$
	/** ARM editor argument link context ID */
	public static String ARM_EDITOR_ARGUMENT_LINK = PREFIX + "arm_editor_argument_link_context"; //$NON-NLS-1$
	/** ARM editor asserted relationship context ID */
	public static String ARM_EDITOR_ASSERTED_RELATIONSHIP = PREFIX + "arm_editor_asserted_relationship_context"; //$NON-NLS-1$
	/** ARM editor asserted evidence context ID */
	public static String ARM_EDITOR_ASSERTED_EVIDENCE = PREFIX + "arm_editor_asserted_relationship_evidence"; //$NON-NLS-1$
	
	// GSN-related context IDs
	/** GSN editor goal help context ID */
	public static String GSN_EDITOR_GOAL = PREFIX + "gsn_editor_goal_context"; //$NON-NLS-1$
	/** GSN editor strategy help context ID */
	public static String GSN_EDITOR_STRATEGY = PREFIX + "gsn_editor_strategy_context"; //$NON-NLS-1$
	/** GSN editor solution help context ID */
	public static String GSN_EDITOR_SOLUTION = PREFIX + "gsn_editor_solution_context"; //$NON-NLS-1$
	/** GSN editor context help context ID */
	public static String GSN_EDITOR_CONTEXT = PREFIX + "gsn_editor_context_context"; //$NON-NLS-1$
	/** GSN editor assumption help context ID */
	public static String GSN_EDITOR_ASSUMPTION = PREFIX + "gsn_editor_assumption_context"; //$NON-NLS-1$
	/** GSN editor justification help context ID */
	public static String GSN_EDITOR_JUSTIFICATION = PREFIX + "gsn_editor_justification_context"; //$NON-NLS-1$
	/** GSN editor default help context ID */
	public static String GSN_EDITOR_DEFAULT = PREFIX + "gsn_editor_default_context"; //$NON-NLS-1$
	
	// CAE-related context IDs
	
	// model agnostic context IDs
	public static String EXPORT_WIZARD_PAGE = PREFIX + "export_wizard_page_context"; //$NON-NLS-1$ 
	

}
