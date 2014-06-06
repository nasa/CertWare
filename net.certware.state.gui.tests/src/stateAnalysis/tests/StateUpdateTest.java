/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.StateAnalysisFactory;
import stateAnalysis.StateUpdate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Update</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateUpdateTest extends TestCase
{

  /**
   * The fixture for this State Update test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateUpdate fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(StateUpdateTest.class);
  }

  /**
   * Constructs a new State Update test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateUpdateTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this State Update test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(StateUpdate fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this State Update test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateUpdate getFixture()
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
    setFixture(StateAnalysisFactory.eINSTANCE.createStateUpdate());
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

} //StateUpdateTest
