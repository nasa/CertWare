/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.HardwareMeasurement;
import stateAnalysis.StateAnalysisFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Measurement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareMeasurementTest extends TestCase
{

  /**
   * The fixture for this Hardware Measurement test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HardwareMeasurement fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(HardwareMeasurementTest.class);
  }

  /**
   * Constructs a new Hardware Measurement test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareMeasurementTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Hardware Measurement test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(HardwareMeasurement fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Hardware Measurement test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HardwareMeasurement getFixture()
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
    setFixture(StateAnalysisFactory.eINSTANCE.createHardwareMeasurement());
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

} //HardwareMeasurementTest
