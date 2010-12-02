/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz.impl;

import net.certware.argument.caz.Argument;
import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.CazFactory;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;

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
public class CazFactoryImpl extends EFactoryImpl implements CazFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CazFactory init() {
		try {
			CazFactory theCazFactory = (CazFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/caz"); //$NON-NLS-1$ 
			if (theCazFactory != null) {
				return theCazFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CazFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CazFactoryImpl() {
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
			case CazPackage.ARGUMENT_DIAGRAM: return createArgumentDiagram();
			case CazPackage.CLAIM: return createClaim();
			case CazPackage.ARGUMENT: return createArgument();
			case CazPackage.EVIDENCE: return createEvidence();
			case CazPackage.ASSUMPTION: return createAssumption();
			case CazPackage.CONTEXT: return createContext();
			case CazPackage.JUSTIFICATION: return createJustification();
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
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
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
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
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
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
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
	public CazPackage getCazPackage() {
		return (CazPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CazPackage getPackage() {
		return CazPackage.eINSTANCE;
	}

} //CazFactoryImpl
