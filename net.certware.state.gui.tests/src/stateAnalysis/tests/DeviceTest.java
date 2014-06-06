/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.Device;
import stateAnalysis.StateAnalysisFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceTest extends TestCase
{

  /**
   * The fixture for this Device test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Device fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DeviceTest.class);
  }

  /**
   * Constructs a new Device test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Device test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Device fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Device test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Device getFixture()
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
    setFixture(StateAnalysisFactory.eINSTANCE.createDevice());
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

} //DeviceTest
