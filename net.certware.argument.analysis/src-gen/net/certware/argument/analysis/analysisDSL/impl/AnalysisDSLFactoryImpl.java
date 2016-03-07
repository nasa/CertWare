/**
 */
package net.certware.argument.analysis.analysisDSL.impl;

import net.certware.argument.analysis.analysisDSL.*;

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
public class AnalysisDSLFactoryImpl extends EFactoryImpl implements AnalysisDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AnalysisDSLFactory init()
  {
    try
    {
      AnalysisDSLFactory theAnalysisDSLFactory = (AnalysisDSLFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisDSLPackage.eNS_URI);
      if (theAnalysisDSLFactory != null)
      {
        return theAnalysisDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AnalysisDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalysisDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AnalysisDSLPackage.OUTPUT: return createOutput();
      case AnalysisDSLPackage.LINE: return createLine();
      case AnalysisDSLPackage.CLASSIC_LITERAL: return createClassicLiteral();
      case AnalysisDSLPackage.ATOM: return createAtom();
      case AnalysisDSLPackage.TERMS: return createTerms();
      case AnalysisDSLPackage.TERM: return createTerm();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassicLiteral createClassicLiteral()
  {
    ClassicLiteralImpl classicLiteral = new ClassicLiteralImpl();
    return classicLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terms createTerms()
  {
    TermsImpl terms = new TermsImpl();
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalysisDSLPackage getAnalysisDSLPackage()
  {
    return (AnalysisDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AnalysisDSLPackage getPackage()
  {
    return AnalysisDSLPackage.eINSTANCE;
  }

} //AnalysisDSLFactoryImpl
