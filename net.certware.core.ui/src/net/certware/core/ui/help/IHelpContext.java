/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
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
	/** CAE editor claim help context ID */
	public static String CAE_EDITOR_CLAIM = PREFIX + "cae_editor_claim_context"; //$NON-NLS-1$
	/** CAE editor argument help context ID */
	public static String CAE_EDITOR_ARGUMENT = PREFIX + "cae_editor_argument_context"; //$NON-NLS-1$
	/** CAE editor evidence help context ID */
	public static String CAE_EDITOR_EVIDENCE = PREFIX + "cae_editor_evidence_context"; //$NON-NLS-1$
	/** CAE editor assumption help context ID */
	public static String CAE_EDITOR_ASSUMPTION = PREFIX + "cae_editor_assumption_context"; //$NON-NLS-1$
	/** CAE editor context help context ID */
	public static String CAE_EDITOR_CONTEXT = PREFIX + "cae_editor_context_context"; //$NON-NLS-1$
	/** CAE editor justification help context ID */
	public static String CAE_EDITOR_JUSTIFICATION = PREFIX + "cae_editor_justification_context"; //$NON-NLS-1$
	/** CAE editor default help context ID */
	public static String CAE_EDITOR_DEFAULT = PREFIX + "cae_editor_default_context"; //$NON-NLS-1$
	
	// EUR-related context IDs
	/** EUR editor argument help context ID */
	public static String EUR_EDITOR_ARGUMENT = PREFIX + "eur_editor_argument_context"; //$NON-NLS-1$
	/** EUR editor strategy help context ID */
	public static String EUR_EDITOR_STRATEGY = PREFIX + "eur_editor_strategy_context"; //$NON-NLS-1$
	/** EUR editor solution help context ID */
	public static String EUR_EDITOR_SOLUTION = PREFIX + "eur_editor_solution_context"; //$NON-NLS-1$
	/** EUR editor context help context ID */
	public static String EUR_EDITOR_CONTEXT = PREFIX + "eur_editor_context_context"; //$NON-NLS-1$
	/** EUR editor assumption help context ID */
	public static String EUR_EDITOR_ASSUMPTION = PREFIX + "eur_editor_assumption_context"; //$NON-NLS-1$
	/** EUR editor justification help context ID */
	public static String EUR_EDITOR_JUSTIFICATION = PREFIX + "eur_editor_justification_context"; //$NON-NLS-1$
	/** EUR editor criteria help context ID */
	public static String EUR_EDITOR_CRITERIA = PREFIX + "eur_editor_criteria_context"; //$NON-NLS-1$
	/** EUR editor default help context ID */
	public static String EUR_EDITOR_DEFAULT = PREFIX + "eur_editor_default_context"; //$NON-NLS-1$
		
	// VCL-related context IDs
	/** VCL editor checklist context ID */
	public static String VCL_EDITOR_CHECKLIST = PREFIX + "vcl_editor_checklist_context"; //$NON-NLS-1$
	/** VCL editor category context ID */
	public static String VCL_EDITOR_CATEGORY = PREFIX + "vcl_editor_category_context"; //$NON-NLS-1$
	/** VCL editor item context ID */
	public static String VCL_EDITOR_ITEM = PREFIX + "vcl_editor_item_context"; //$NON-NLS-1$
	/** VCL editor choices context ID */
	public static String VCL_EDITOR_CHOICES = PREFIX + "vcl_editor_choices_context"; //$NON-NLS-1$
	/** VCL view context ID */
	public static String VCL_VIEW = PREFIX + "vcl_view_context"; //$NON-NLS-1$
	
	// model agnostic context IDs
	/** export wizard page context */
	public static String EXPORT_WIZARD_PAGE = PREFIX + "export_wizard_page_context"; //$NON-NLS-1$ 
	
	// example contributions
	/** example wizard page context */
	public static String EXAMPLE_WIZARD_PAGE = PREFIX + "example_wizard_page_context"; //$NON-NLS-1$
	/** example wizard pattern */
	public static String EXAMPLE_WIZARD_PATTERN = PREFIX + "example_wizard_pattern_context"; //$NON-NLS-1$
	/** example wizard checklist */
	public static String EXAMPLE_WIZARD_CHECKLIST = PREFIX + "example_wizard_checklist_context"; //$NON-NLS-1$
	/** example wizard document */
	public static String EXAMPLE_WIZARD_DOCUMENT = PREFIX + "example_wizard_document_context"; //$NON-NLS-1$

	// proof review context IDs
	/** review wizard page context */
	public static String REVIEW_WIZARD_PAGE = PREFIX + "review_wizard_page_context"; //$NON-NLS-1$
	/** review wizard proof context */
	public static String REVIEW_WIZARD_PROOF = PREFIX + "review_wizard_proof_context"; //$NON-NLS-1$
	/** review wizard statement context */
	public static String REVIEW_WIZARD_STATEMENT = PREFIX + "review_wizard_statement_context"; //$NON-NLS-1$
	/** review wizard hypothesis context */
	public static String REVIEW_WIZARD_HYPOTHESIS = PREFIX + "review_wizard_hypothesis_context"; //$NON-NLS-1$
	/** review wizard setup page */
	public static String REVIEW_WIZARD_SETUP_PAGE = PREFIX + "review_wizard_setup_context"; //$NON-NLS-1$
	
	// samiam analysis context IDs
	/** samiam analysis view */
	public static String SAMIAM_ANALYSIS_VIEW = PREFIX + "samiam_analysis_context"; //$NON-NLS-1$
	/** hugin evidence instance model */
	public static String HUGIN_INSTANCE_MODEL = PREFIX + "hugin_instance_context"; //$NON-NLS-1$
	
}
