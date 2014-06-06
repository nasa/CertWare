/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.StateAnalysisFactory;
import stateAnalysis.StateConstraint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateConstraintTest extends TestCase
{

  /**
   * The fixture for this State Constraint test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateConstraint fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(StateConstraintTest.class);
  }

  /**
   * Constructs a new State Constraint test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateConstraintTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this State Constraint test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(StateConstraint fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this State Constraint test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateConstraint getFixture()
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
    setFixture(StateAnalysisFactory.eINSTANCE.createStateConstraint());
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

} //StateConstraintTest
