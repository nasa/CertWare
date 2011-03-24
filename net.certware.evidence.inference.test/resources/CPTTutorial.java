/** Import statements for il1 classes. */
import edu.ucla.belief.*;
import edu.ucla.belief.io.dsl.DSLNodeType;

/** Import statements for standard Java classes. */
import java.util.*;

/**
  This class demonstrates code to create a CPT and edit its parameters

  To compile this class, make sure
  inflib.jar occurs in the command line classpath,
  e.g. javac -classpath inflib.jar CPTTutorial.java

  To run it, do the same,
  but also include the path to
  the compiled class,
  e.g. java -classpath .:inflib.jar CPTTutorial

  @author Keith Cascio
  @since Mar 23, 2011 4:50:26 PM
*/
public class CPTTutorial
{
  /** Test. */
  public static void main(String[] args){
    CPTTutorial T = new CPTTutorial();
    T.doCPTDemo();
  }

  /** Create the model; create the new cpt; edit the new cpt. */
  public void doCPTDemo()
  {
    BeliefNetwork model = this.createModel();
    this.createCPT( model );
    this.editParameters( model );

    return;
  }

  /** Demonstrates how to edit parameters. */
  public void editParameters( BeliefNetwork model )
  {
    System.out.println( "Editing CPT..." );

    //(1) Retrieve child variable
    FiniteVariable newChild = (FiniteVariable) model.forID( "newchild" );

    //(2) Get the CPTShell (TableShell)
    TableShell shell = (TableShell) newChild.getCPTShell( DSLNodeType.CPT );

    //(3) Get the TableIndex
    TableIndex index = shell.index();

    //(4) Get the Table
    Table table = shell.getCPT();

    //(5) Retrieve parent variables
    FiniteVariable parent00 = (FiniteVariable) model.forID( "parent00" );
    FiniteVariable parent01 = (FiniteVariable) model.forID( "parent01" );
    FiniteVariable parent02 = (FiniteVariable) model.forID( "parent02" );
    FiniteVariable parent03 = (FiniteVariable) model.forID( "parent03" );
    FiniteVariable parent04 = (FiniteVariable) model.forID( "parent04" );

    //(6) Create an int[] to
    //hold the multi-dimensional indices
    int mindex[] = new int[ index.getNumVariables() ];

    //(7) Choose the desired condition
    //{ parent00 = false, parent01 = true, parent02 = false, parent03 = false, parent04 = false }
    mindex[ index.variableIndex( parent00 ) ] = parent00.index( "false" );
    mindex[ index.variableIndex( parent01 ) ] = parent01.index( "true" );
    mindex[ index.variableIndex( parent02 ) ] = parent02.index( "false" );
    mindex[ index.variableIndex( parent03 ) ] = parent03.index( "false" );
    mindex[ index.variableIndex( parent04 ) ] = parent04.index( "false" );
    mindex[ index.variableIndex( newChild ) ] = 0;

    //(8) Use TableIndex to calculate
    //the first linear index for the desired condition
    int linear = index.index( mindex );
    System.out.println( "Linear index? " + linear );

    //(9) For the purposes of demonstation,
    //set this condition deterministically for value "medium"
    double zero = (double)0.0;
    double one  = (double)1.0;
    table.setCP( linear + newChild.index( "low" ), zero );
    table.setCP( linear + newChild.index( "medium" ), one );
    table.setCP( linear + newChild.index( "high" ), zero );

    //Print out information about the edited cpt.
    System.out.println( "Edited cpt has min value: " + table.min() );
    System.out.println( "               max value: " + table.max() );
    System.out.println( "               entropy:   " + table.entropy() );
    return;
  }

  /** Demonstrates how to create a CPT. */
  public void createCPT( BeliefNetwork model )
  {
    //(1) Create child variable with id "newchild"
    String[] values = new String[] { "low", "medium", "high" };
    FiniteVariable newChild = new FiniteVariableImpl( "newchild", values );

    //(2) Add newChild to the model,
    //but pass second argument false
    //because we will create the cpt ourselves
    model.addVariable( newChild, false );

    //(3) Retrieve parent variables
    FiniteVariable parent00 = (FiniteVariable) model.forID( "parent00" );
    FiniteVariable parent01 = (FiniteVariable) model.forID( "parent01" );
    FiniteVariable parent02 = (FiniteVariable) model.forID( "parent02" );
    FiniteVariable parent03 = (FiniteVariable) model.forID( "parent03" );
    FiniteVariable parent04 = (FiniteVariable) model.forID( "parent04" );

    //(4) Add edges,
    //but pass third argument false
    //because we will create the cpt ourselves
    model.addEdge( parent00, newChild, false );
    model.addEdge( parent01, newChild, false );
    model.addEdge( parent02, newChild, false );
    model.addEdge( parent03, newChild, false );
    model.addEdge( parent04, newChild, false );

    //(5) Define a List
    //containing the parents (in order!),
    //and finally the child
    LinkedList variables = new LinkedList();
    variables.add( parent00 );
    variables.add( parent01 );
    variables.add( parent02 );
    variables.add( parent03 );
    variables.add( parent04 );
    variables.add( newChild );//add child last

    //(6) Create a TableIndex
    //TableIndex is a very useful class that
    //helps you calculate indices into the cpt.
    TableIndex index = new TableIndex( variables );

    //(7) Create an array to hold the parameters,
    //and fill it with a uniform distribution
    double[] data = new double[ index.size() ];
    double uniformValue = ((double)1.0)/((double)newChild.size());
    Arrays.fill( data, uniformValue );

    //(8) Create a Table
    //In this demo, the Table _is_ the CPT - it represents the probability data
    Table t = new Table( index, data );

    //(9) Create a TableShell
    //TableShell is the simplest implementation of
    //CPTShell: it is simply a wrapper around a Table
    TableShell shell = new TableShell( t );

    //(10) Last, set "shell"
    //as the CPTShell for newChild.
    //You may associate more than one
    //CPTShell with a FiniteVariable - 
    //one for each of the 4 DSLNodeTypes.
    //You should always associate a TableShell
    //with type CPT, as demonstrated here:
    newChild.setCPTShell( DSLNodeType.CPT, shell );

    //Print out information about the new cpt.
    System.out.println( "Created a new cpt for variable " + newChild.getID() );
    System.out.println( "with "+ model.inComing(newChild).size() +" parents." );
    System.out.println( "The new cpt has " +shell.index().size()+ " parameters." );
    System.out.println( "The class of the shell is \"" +shell.getClass().getName()+ "\"." );
    return;
  }

  /** Creates a model with five unconnected variables. */
  public BeliefNetwork createModel()
  {
    BeliefNetwork model = new BeliefNetworkImpl();

    String[] binary = new String[] { "true", "false" };

    model.addVariable( new FiniteVariableImpl( "parent00", binary ), true );
    model.addVariable( new FiniteVariableImpl( "parent01", binary ), true );
    model.addVariable( new FiniteVariableImpl( "parent02", binary ), true );
    model.addVariable( new FiniteVariableImpl( "parent03", binary ), true );
    model.addVariable( new FiniteVariableImpl( "parent04", binary ), true );

    return model;
  }
}
