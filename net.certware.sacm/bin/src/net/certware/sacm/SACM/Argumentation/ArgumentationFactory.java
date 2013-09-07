/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage
 * @generated
 */
public interface ArgumentationFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentationFactory eINSTANCE = net.certware.sacm.SACM.Argumentation.impl.ArgumentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Argumentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argumentation</em>'.
	 * @generated
	 */
	Argumentation createArgumentation();

	/**
	 * Returns a new object of class '<em>Citation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citation Element</em>'.
	 * @generated
	 */
	CitationElement createCitationElement();

	/**
	 * Returns a new object of class '<em>Information Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Element</em>'.
	 * @generated
	 */
	InformationElement createInformationElement();

	/**
	 * Returns a new object of class '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Reasoning</em>'.
	 * @generated
	 */
	ArgumentReasoning createArgumentReasoning();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Inference</em>'.
	 * @generated
	 */
	AssertedInference createAssertedInference();

	/**
	 * Returns a new object of class '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Evidence</em>'.
	 * @generated
	 */
	AssertedEvidence createAssertedEvidence();

	/**
	 * Returns a new object of class '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Context</em>'.
	 * @generated
	 */
	AssertedContext createAssertedContext();

	/**
	 * Returns a new object of class '<em>Asserted Challenge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Challenge</em>'.
	 * @generated
	 */
	AssertedChallenge createAssertedChallenge();

	/**
	 * Returns a new object of class '<em>Asserted Counter Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Counter Evidence</em>'.
	 * @generated
	 */
	AssertedCounterEvidence createAssertedCounterEvidence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArgumentationPackage getArgumentationPackage();

} //ArgumentationFactory
