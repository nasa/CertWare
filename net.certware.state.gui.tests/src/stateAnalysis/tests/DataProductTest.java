/**
 */
package stateAnalysis.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import stateAnalysis.DataProduct;
import stateAnalysis.StateAnalysisFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Product</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataProductTest extends TestCase
{

  /**
   * The fixture for this Data Product test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataProduct fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DataProductTest.class);
  }

  /**
   * Constructs a new Data Product test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataProductTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Data Product test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(DataProduct fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Data Product test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataProduct getFixture()
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
    setFixture(StateAnalysisFactory.eINSTANCE.createDataProduct());
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

} //DataProductTest
