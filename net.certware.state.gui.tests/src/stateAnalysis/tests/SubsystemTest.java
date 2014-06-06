/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.StateAnalysisFactory;
import stateAnalysis.Subsystem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsystemTest extends TestCase
{

  /**
   * The fixture for this Subsystem test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Subsystem fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SubsystemTest.class);
  }

  /**
   * Constructs a new Subsystem test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubsystemTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Subsystem test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Subsystem fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Subsystem test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Subsystem getFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(StateAnalysisFactory.eINSTANCE.createSubsystem());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //SubsystemTest
