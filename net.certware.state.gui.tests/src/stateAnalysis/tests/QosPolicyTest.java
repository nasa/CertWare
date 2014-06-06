/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.QosPolicy;
import stateAnalysis.StateAnalysisFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Qos Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QosPolicyTest extends TestCase
{

  /**
   * The fixture for this Qos Policy test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QosPolicy fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(QosPolicyTest.class);
  }

  /**
   * Constructs a new Qos Policy test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QosPolicyTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Qos Policy test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(QosPolicy fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Qos Policy test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QosPolicy getFixture()
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
    setFixture(StateAnalysisFactory.eINSTANCE.createQosPolicy());
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

} //QosPolicyTest
