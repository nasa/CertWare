/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz.impl;

import net.certware.argument.caz.Argument;
import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Criteria;
import net.certware.argument.caz.EuzFactory;
import net.certware.argument.caz.EuzPackage;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;
import net.certware.argument.caz.Solution;
import net.certware.argument.caz.Strategy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuzFactoryImpl extends EFactoryImpl implements EuzFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EuzFactory init() {
		try {
			EuzFactory theEuzFactory = (EuzFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/euz"); //$NON-NLS-1$ 
			if (theEuzFactory != null) {
				return theEuzFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EuzFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuzFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EuzPackage.ARGUMENT_DIAGRAM: return createArgumentDiagram();
			case EuzPackage.ARGUMENT: return createArgument();
			case EuzPackage.CONTEXT: return createContext();
			case EuzPackage.CRITERIA: return createCriteria();
			case EuzPackage.STRATEGY: return createStrategy();
			case EuzPackage.SOLUTION: return createSolution();
			case EuzPackage.ASSUMPTION: return createAssumption();
			case EuzPackage.JUSTIFICATION: return createJustification();
			case EuzPackage.EVIDENCE: return createEvidence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentDiagram createArgumentDiagram() {
		ArgumentDiagramImpl argumentDiagram = new ArgumentDiagramImpl();
		return argumentDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criteria createCriteria() {
		CriteriaImpl criteria = new CriteriaImpl();
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuzPackage getEuzPackage() {
		return (EuzPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EuzPackage getPackage() {
		return EuzPackage.eINSTANCE;
	}

} //EuzFactoryImpl
