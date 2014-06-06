/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.DataCollection;
import stateAnalysis.StateAnalysisFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataCollectionTest extends TestCase
{

  /**
   * The fixture for this Data Collection test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataCollection fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DataCollectionTest.class);
  }

  /**
   * Constructs a new Data Collection test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollectionTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Data Collection test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(DataCollection fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Data Collection test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataCollection getFixture()
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
    setFixture(StateAnalysisFactory.eINSTANCE.createDataCollection());
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

} //DataCollectionTest
