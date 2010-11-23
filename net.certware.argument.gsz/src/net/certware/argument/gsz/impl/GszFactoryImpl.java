/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsz.impl;

import net.certware.argument.gsz.*;
import net.certware.argument.gsz.ArgumentDiagram;
import net.certware.argument.gsz.Assumption;
import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Evidence;
import net.certware.argument.gsz.Goal;
import net.certware.argument.gsz.GszFactory;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.Justification;
import net.certware.argument.gsz.Solution;
import net.certware.argument.gsz.Strategy;

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
public class GszFactoryImpl extends EFactoryImpl implements GszFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GszFactory init() {
		try {
			GszFactory theGszFactory = (GszFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/gsz"); //$NON-NLS-1$ 
			if (theGszFactory != null) {
				return theGszFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GszFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GszFactoryImpl() {
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
			case GszPackage.ARGUMENT_DIAGRAM: return createArgumentDiagram();
			case GszPackage.GOAL: return createGoal();
			case GszPackage.STRATEGY: return createStrategy();
			case GszPackage.JUSTIFICATION: return createJustification();
			case GszPackage.CONTEXT: return createContext();
			case GszPackage.ASSUMPTION: return createAssumption();
			case GszPackage.SOLUTION: return createSolution();
			case GszPackage.EVIDENCE: return createEvidence();
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
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
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
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
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
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
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
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GszPackage getGszPackage() {
		return (GszPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GszPackage getPackage() {
		return GszPackage.eINSTANCE;
	}

} //GszFactoryImpl
