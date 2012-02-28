/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.util;

import net.certware.evidence.hugin.netDSL.AdditiveExp;
import net.certware.evidence.hugin.netDSL.AndExp;
import net.certware.evidence.hugin.netDSL.ApplicationAttribute;
import net.certware.evidence.hugin.netDSL.Assignment;
import net.certware.evidence.hugin.netDSL.AssignmentOp;
import net.certware.evidence.hugin.netDSL.Attribute;
import net.certware.evidence.hugin.netDSL.BasicNode;
import net.certware.evidence.hugin.netDSL.BooleanLiteral;
import net.certware.evidence.hugin.netDSL.ClassDefinition;
import net.certware.evidence.hugin.netDSL.ClassElement;
import net.certware.evidence.hugin.netDSL.ClassInstance;
import net.certware.evidence.hugin.netDSL.DomainDefinition;
import net.certware.evidence.hugin.netDSL.DomainElement;
import net.certware.evidence.hugin.netDSL.DomainHeader;
import net.certware.evidence.hugin.netDSL.DoubleLiteral;
import net.certware.evidence.hugin.netDSL.Expression;
import net.certware.evidence.hugin.netDSL.ExpressionSequence;
import net.certware.evidence.hugin.netDSL.InputBinding;
import net.certware.evidence.hugin.netDSL.InputBindings;
import net.certware.evidence.hugin.netDSL.IntegerLiteral;
import net.certware.evidence.hugin.netDSL.LabelAttribute;
import net.certware.evidence.hugin.netDSL.List1;
import net.certware.evidence.hugin.netDSL.List2;
import net.certware.evidence.hugin.netDSL.List3;
import net.certware.evidence.hugin.netDSL.List4;
import net.certware.evidence.hugin.netDSL.List5;
import net.certware.evidence.hugin.netDSL.MatrixRow;
import net.certware.evidence.hugin.netDSL.Model;
import net.certware.evidence.hugin.netDSL.ModelDataAttribute;
import net.certware.evidence.hugin.netDSL.ModelNodesAttribute;
import net.certware.evidence.hugin.netDSL.MultiplicativeExp;
import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.NodeAttributes;
import net.certware.evidence.hugin.netDSL.NodeSizeAttribute;
import net.certware.evidence.hugin.netDSL.Operator;
import net.certware.evidence.hugin.netDSL.OrExp;
import net.certware.evidence.hugin.netDSL.OutputBinding;
import net.certware.evidence.hugin.netDSL.OutputBindings;
import net.certware.evidence.hugin.netDSL.PositionAttribute;
import net.certware.evidence.hugin.netDSL.Potential;
import net.certware.evidence.hugin.netDSL.PotentialAttribute;
import net.certware.evidence.hugin.netDSL.PotentialDataAttribute;
import net.certware.evidence.hugin.netDSL.PotentialGraph;
import net.certware.evidence.hugin.netDSL.PotentialModel;
import net.certware.evidence.hugin.netDSL.PotentialTableAttribute;
import net.certware.evidence.hugin.netDSL.RelationalExp;
import net.certware.evidence.hugin.netDSL.SamplesAttribute;
import net.certware.evidence.hugin.netDSL.StateValuesAttribute;
import net.certware.evidence.hugin.netDSL.StatesAttribute;
import net.certware.evidence.hugin.netDSL.StringLiteral;
import net.certware.evidence.hugin.netDSL.SubtypeAttribute;
import net.certware.evidence.hugin.netDSL.TermExpression;
import net.certware.evidence.hugin.netDSL.TermLiteral;
import net.certware.evidence.hugin.netDSL.VarRef;
import net.certware.evidence.hugin.netDSL.additiveExpression;
import net.certware.evidence.hugin.netDSL.andExpression;
import net.certware.evidence.hugin.netDSL.assignmentOpExpression;
import net.certware.evidence.hugin.netDSL.multiplicativeExpression;
import net.certware.evidence.hugin.netDSL.orExpression;
import net.certware.evidence.hugin.netDSL.relationalExpression;
import net.certware.evidence.hugin.netDSL.unaryExpression;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage
 * @generated
 */
public class NetDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NetDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = NetDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case NetDSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.INTEGER:
      {
        net.certware.evidence.hugin.netDSL.Integer integer = (net.certware.evidence.hugin.netDSL.Integer)theEObject;
        T result = caseInteger(integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.DOMAIN_DEFINITION:
      {
        DomainDefinition domainDefinition = (DomainDefinition)theEObject;
        T result = caseDomainDefinition(domainDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.DOMAIN_HEADER:
      {
        DomainHeader domainHeader = (DomainHeader)theEObject;
        T result = caseDomainHeader(domainHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.DOMAIN_ELEMENT:
      {
        DomainElement domainElement = (DomainElement)theEObject;
        T result = caseDomainElement(domainElement);
        if (result == null) result = caseClassElement(domainElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseClassElement(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.BASIC_NODE:
      {
        BasicNode basicNode = (BasicNode)theEObject;
        T result = caseBasicNode(basicNode);
        if (result == null) result = caseDomainElement(basicNode);
        if (result == null) result = caseClassElement(basicNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.STATES_ATTRIBUTE:
      {
        StatesAttribute statesAttribute = (StatesAttribute)theEObject;
        T result = caseStatesAttribute(statesAttribute);
        if (result == null) result = caseAttribute(statesAttribute);
        if (result == null) result = caseClassElement(statesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.LABEL_ATTRIBUTE:
      {
        LabelAttribute labelAttribute = (LabelAttribute)theEObject;
        T result = caseLabelAttribute(labelAttribute);
        if (result == null) result = caseAttribute(labelAttribute);
        if (result == null) result = caseNodeAttributes(labelAttribute);
        if (result == null) result = caseClassElement(labelAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POSITION_ATTRIBUTE:
      {
        PositionAttribute positionAttribute = (PositionAttribute)theEObject;
        T result = casePositionAttribute(positionAttribute);
        if (result == null) result = caseAttribute(positionAttribute);
        if (result == null) result = caseNodeAttributes(positionAttribute);
        if (result == null) result = caseClassElement(positionAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.SUBTYPE_ATTRIBUTE:
      {
        SubtypeAttribute subtypeAttribute = (SubtypeAttribute)theEObject;
        T result = caseSubtypeAttribute(subtypeAttribute);
        if (result == null) result = caseAttribute(subtypeAttribute);
        if (result == null) result = caseClassElement(subtypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.STATE_VALUES_ATTRIBUTE:
      {
        StateValuesAttribute stateValuesAttribute = (StateValuesAttribute)theEObject;
        T result = caseStateValuesAttribute(stateValuesAttribute);
        if (result == null) result = caseAttribute(stateValuesAttribute);
        if (result == null) result = caseClassElement(stateValuesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.APPLICATION_ATTRIBUTE:
      {
        ApplicationAttribute applicationAttribute = (ApplicationAttribute)theEObject;
        T result = caseApplicationAttribute(applicationAttribute);
        if (result == null) result = caseAttribute(applicationAttribute);
        if (result == null) result = caseNodeAttributes(applicationAttribute);
        if (result == null) result = caseClassElement(applicationAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.NODE_SIZE_ATTRIBUTE:
      {
        NodeSizeAttribute nodeSizeAttribute = (NodeSizeAttribute)theEObject;
        T result = caseNodeSizeAttribute(nodeSizeAttribute);
        if (result == null) result = caseAttribute(nodeSizeAttribute);
        if (result == null) result = caseClassElement(nodeSizeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL:
      {
        Potential potential = (Potential)theEObject;
        T result = casePotential(potential);
        if (result == null) result = caseDomainElement(potential);
        if (result == null) result = caseClassElement(potential);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_GRAPH:
      {
        PotentialGraph potentialGraph = (PotentialGraph)theEObject;
        T result = casePotentialGraph(potentialGraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_MODEL:
      {
        PotentialModel potentialModel = (PotentialModel)theEObject;
        T result = casePotentialModel(potentialModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_ATTRIBUTE:
      {
        PotentialAttribute potentialAttribute = (PotentialAttribute)theEObject;
        T result = casePotentialAttribute(potentialAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE:
      {
        PotentialDataAttribute potentialDataAttribute = (PotentialDataAttribute)theEObject;
        T result = casePotentialDataAttribute(potentialDataAttribute);
        if (result == null) result = casePotentialAttribute(potentialDataAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.MATRIX_ROW:
      {
        MatrixRow matrixRow = (MatrixRow)theEObject;
        T result = caseMatrixRow(matrixRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE:
      {
        PotentialTableAttribute potentialTableAttribute = (PotentialTableAttribute)theEObject;
        T result = casePotentialTableAttribute(potentialTableAttribute);
        if (result == null) result = casePotentialAttribute(potentialTableAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.MODEL_NODES_ATTRIBUTE:
      {
        ModelNodesAttribute modelNodesAttribute = (ModelNodesAttribute)theEObject;
        T result = caseModelNodesAttribute(modelNodesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.SAMPLES_ATTRIBUTE:
      {
        SamplesAttribute samplesAttribute = (SamplesAttribute)theEObject;
        T result = caseSamplesAttribute(samplesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.MODEL_DATA_ATTRIBUTE:
      {
        ModelDataAttribute modelDataAttribute = (ModelDataAttribute)theEObject;
        T result = caseModelDataAttribute(modelDataAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.CLASS_DEFINITION:
      {
        ClassDefinition classDefinition = (ClassDefinition)theEObject;
        T result = caseClassDefinition(classDefinition);
        if (result == null) result = caseDomainElement(classDefinition);
        if (result == null) result = caseClassElement(classDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.CLASS_ELEMENT:
      {
        ClassElement classElement = (ClassElement)theEObject;
        T result = caseClassElement(classElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.CLASS_INSTANCE:
      {
        ClassInstance classInstance = (ClassInstance)theEObject;
        T result = caseClassInstance(classInstance);
        if (result == null) result = caseClassElement(classInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.INPUT_BINDINGS:
      {
        InputBindings inputBindings = (InputBindings)theEObject;
        T result = caseInputBindings(inputBindings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.INPUT_BINDING:
      {
        InputBinding inputBinding = (InputBinding)theEObject;
        T result = caseInputBinding(inputBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.OUTPUT_BINDINGS:
      {
        OutputBindings outputBindings = (OutputBindings)theEObject;
        T result = caseOutputBindings(outputBindings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.OUTPUT_BINDING:
      {
        OutputBinding outputBinding = (OutputBinding)theEObject;
        T result = caseOutputBinding(outputBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.NODE_ATTRIBUTES:
      {
        NodeAttributes nodeAttributes = (NodeAttributes)theEObject;
        T result = caseNodeAttributes(nodeAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.EXPRESSION_SEQUENCE:
      {
        ExpressionSequence expressionSequence = (ExpressionSequence)theEObject;
        T result = caseExpressionSequence(expressionSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.ASSIGNMENT_OP_EXPRESSION:
      {
        assignmentOpExpression assignmentOpExpression = (assignmentOpExpression)theEObject;
        T result = caseassignmentOpExpression(assignmentOpExpression);
        if (result == null) result = caseExpression(assignmentOpExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.OR_EXPRESSION:
      {
        orExpression orExpression = (orExpression)theEObject;
        T result = caseorExpression(orExpression);
        if (result == null) result = caseassignmentOpExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.AND_EXPRESSION:
      {
        andExpression andExpression = (andExpression)theEObject;
        T result = caseandExpression(andExpression);
        if (result == null) result = caseorExpression(andExpression);
        if (result == null) result = caseassignmentOpExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.RELATIONAL_EXPRESSION:
      {
        relationalExpression relationalExpression = (relationalExpression)theEObject;
        T result = caserelationalExpression(relationalExpression);
        if (result == null) result = caseandExpression(relationalExpression);
        if (result == null) result = caseorExpression(relationalExpression);
        if (result == null) result = caseassignmentOpExpression(relationalExpression);
        if (result == null) result = caseExpression(relationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.ADDITIVE_EXPRESSION:
      {
        additiveExpression additiveExpression = (additiveExpression)theEObject;
        T result = caseadditiveExpression(additiveExpression);
        if (result == null) result = caserelationalExpression(additiveExpression);
        if (result == null) result = caseandExpression(additiveExpression);
        if (result == null) result = caseorExpression(additiveExpression);
        if (result == null) result = caseassignmentOpExpression(additiveExpression);
        if (result == null) result = caseExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.MULTIPLICATIVE_EXPRESSION:
      {
        multiplicativeExpression multiplicativeExpression = (multiplicativeExpression)theEObject;
        T result = casemultiplicativeExpression(multiplicativeExpression);
        if (result == null) result = caseadditiveExpression(multiplicativeExpression);
        if (result == null) result = caserelationalExpression(multiplicativeExpression);
        if (result == null) result = caseandExpression(multiplicativeExpression);
        if (result == null) result = caseorExpression(multiplicativeExpression);
        if (result == null) result = caseassignmentOpExpression(multiplicativeExpression);
        if (result == null) result = caseExpression(multiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.UNARY_EXPRESSION:
      {
        unaryExpression unaryExpression = (unaryExpression)theEObject;
        T result = caseunaryExpression(unaryExpression);
        if (result == null) result = casemultiplicativeExpression(unaryExpression);
        if (result == null) result = caseadditiveExpression(unaryExpression);
        if (result == null) result = caserelationalExpression(unaryExpression);
        if (result == null) result = caseandExpression(unaryExpression);
        if (result == null) result = caseorExpression(unaryExpression);
        if (result == null) result = caseassignmentOpExpression(unaryExpression);
        if (result == null) result = caseExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = caseTermExpression(operator);
        if (result == null) result = caseunaryExpression(operator);
        if (result == null) result = casemultiplicativeExpression(operator);
        if (result == null) result = caseadditiveExpression(operator);
        if (result == null) result = caserelationalExpression(operator);
        if (result == null) result = caseandExpression(operator);
        if (result == null) result = caseorExpression(operator);
        if (result == null) result = caseassignmentOpExpression(operator);
        if (result == null) result = caseExpression(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.TERM_EXPRESSION:
      {
        TermExpression termExpression = (TermExpression)theEObject;
        T result = caseTermExpression(termExpression);
        if (result == null) result = caseunaryExpression(termExpression);
        if (result == null) result = casemultiplicativeExpression(termExpression);
        if (result == null) result = caseadditiveExpression(termExpression);
        if (result == null) result = caserelationalExpression(termExpression);
        if (result == null) result = caseandExpression(termExpression);
        if (result == null) result = caseorExpression(termExpression);
        if (result == null) result = caseassignmentOpExpression(termExpression);
        if (result == null) result = caseExpression(termExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.TERM_LITERAL:
      {
        TermLiteral termLiteral = (TermLiteral)theEObject;
        T result = caseTermLiteral(termLiteral);
        if (result == null) result = caseTermExpression(termLiteral);
        if (result == null) result = caseunaryExpression(termLiteral);
        if (result == null) result = casemultiplicativeExpression(termLiteral);
        if (result == null) result = caseadditiveExpression(termLiteral);
        if (result == null) result = caserelationalExpression(termLiteral);
        if (result == null) result = caseandExpression(termLiteral);
        if (result == null) result = caseorExpression(termLiteral);
        if (result == null) result = caseassignmentOpExpression(termLiteral);
        if (result == null) result = caseExpression(termLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = casePositionAttribute(integerLiteral);
        if (result == null) result = caseTermLiteral(integerLiteral);
        if (result == null) result = caseAttribute(integerLiteral);
        if (result == null) result = caseNodeAttributes(integerLiteral);
        if (result == null) result = caseTermExpression(integerLiteral);
        if (result == null) result = caseClassElement(integerLiteral);
        if (result == null) result = caseunaryExpression(integerLiteral);
        if (result == null) result = casemultiplicativeExpression(integerLiteral);
        if (result == null) result = caseadditiveExpression(integerLiteral);
        if (result == null) result = caserelationalExpression(integerLiteral);
        if (result == null) result = caseandExpression(integerLiteral);
        if (result == null) result = caseorExpression(integerLiteral);
        if (result == null) result = caseassignmentOpExpression(integerLiteral);
        if (result == null) result = caseExpression(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.LIST5:
      {
        List5 list5 = (List5)theEObject;
        T result = caseList5(list5);
        if (result == null) result = caseMatrixRow(list5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.LIST4:
      {
        List4 list4 = (List4)theEObject;
        T result = caseList4(list4);
        if (result == null) result = caseMatrixRow(list4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.LIST3:
      {
        List3 list3 = (List3)theEObject;
        T result = caseList3(list3);
        if (result == null) result = caseMatrixRow(list3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.LIST2:
      {
        List2 list2 = (List2)theEObject;
        T result = caseList2(list2);
        if (result == null) result = caseMatrixRow(list2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.LIST1:
      {
        List1 list1 = (List1)theEObject;
        T result = caseList1(list1);
        if (result == null) result = caseMatrixRow(list1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseExpression(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.ASSIGNMENT_OP:
      {
        AssignmentOp assignmentOp = (AssignmentOp)theEObject;
        T result = caseAssignmentOp(assignmentOp);
        if (result == null) result = caseassignmentOpExpression(assignmentOp);
        if (result == null) result = caseExpression(assignmentOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.OR_EXP:
      {
        OrExp orExp = (OrExp)theEObject;
        T result = caseOrExp(orExp);
        if (result == null) result = caseorExpression(orExp);
        if (result == null) result = caseassignmentOpExpression(orExp);
        if (result == null) result = caseExpression(orExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.AND_EXP:
      {
        AndExp andExp = (AndExp)theEObject;
        T result = caseAndExp(andExp);
        if (result == null) result = caseandExpression(andExp);
        if (result == null) result = caseorExpression(andExp);
        if (result == null) result = caseassignmentOpExpression(andExp);
        if (result == null) result = caseExpression(andExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.RELATIONAL_EXP:
      {
        RelationalExp relationalExp = (RelationalExp)theEObject;
        T result = caseRelationalExp(relationalExp);
        if (result == null) result = caserelationalExpression(relationalExp);
        if (result == null) result = caseandExpression(relationalExp);
        if (result == null) result = caseorExpression(relationalExp);
        if (result == null) result = caseassignmentOpExpression(relationalExp);
        if (result == null) result = caseExpression(relationalExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.ADDITIVE_EXP:
      {
        AdditiveExp additiveExp = (AdditiveExp)theEObject;
        T result = caseAdditiveExp(additiveExp);
        if (result == null) result = caseadditiveExpression(additiveExp);
        if (result == null) result = caserelationalExpression(additiveExp);
        if (result == null) result = caseandExpression(additiveExp);
        if (result == null) result = caseorExpression(additiveExp);
        if (result == null) result = caseassignmentOpExpression(additiveExp);
        if (result == null) result = caseExpression(additiveExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.MULTIPLICATIVE_EXP:
      {
        MultiplicativeExp multiplicativeExp = (MultiplicativeExp)theEObject;
        T result = caseMultiplicativeExp(multiplicativeExp);
        if (result == null) result = casemultiplicativeExpression(multiplicativeExp);
        if (result == null) result = caseadditiveExpression(multiplicativeExp);
        if (result == null) result = caserelationalExpression(multiplicativeExp);
        if (result == null) result = caseandExpression(multiplicativeExp);
        if (result == null) result = caseorExpression(multiplicativeExp);
        if (result == null) result = caseassignmentOpExpression(multiplicativeExp);
        if (result == null) result = caseExpression(multiplicativeExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.VAR_REF:
      {
        VarRef varRef = (VarRef)theEObject;
        T result = caseVarRef(varRef);
        if (result == null) result = caseTermLiteral(varRef);
        if (result == null) result = caseTermExpression(varRef);
        if (result == null) result = caseunaryExpression(varRef);
        if (result == null) result = casemultiplicativeExpression(varRef);
        if (result == null) result = caseadditiveExpression(varRef);
        if (result == null) result = caserelationalExpression(varRef);
        if (result == null) result = caseandExpression(varRef);
        if (result == null) result = caseorExpression(varRef);
        if (result == null) result = caseassignmentOpExpression(varRef);
        if (result == null) result = caseExpression(varRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseTermLiteral(booleanLiteral);
        if (result == null) result = caseTermExpression(booleanLiteral);
        if (result == null) result = caseunaryExpression(booleanLiteral);
        if (result == null) result = casemultiplicativeExpression(booleanLiteral);
        if (result == null) result = caseadditiveExpression(booleanLiteral);
        if (result == null) result = caserelationalExpression(booleanLiteral);
        if (result == null) result = caseandExpression(booleanLiteral);
        if (result == null) result = caseorExpression(booleanLiteral);
        if (result == null) result = caseassignmentOpExpression(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseTermLiteral(stringLiteral);
        if (result == null) result = caseTermExpression(stringLiteral);
        if (result == null) result = caseunaryExpression(stringLiteral);
        if (result == null) result = casemultiplicativeExpression(stringLiteral);
        if (result == null) result = caseadditiveExpression(stringLiteral);
        if (result == null) result = caserelationalExpression(stringLiteral);
        if (result == null) result = caseandExpression(stringLiteral);
        if (result == null) result = caseorExpression(stringLiteral);
        if (result == null) result = caseassignmentOpExpression(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.DOUBLE_LITERAL:
      {
        DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
        T result = caseDoubleLiteral(doubleLiteral);
        if (result == null) result = caseTermLiteral(doubleLiteral);
        if (result == null) result = caseTermExpression(doubleLiteral);
        if (result == null) result = caseunaryExpression(doubleLiteral);
        if (result == null) result = casemultiplicativeExpression(doubleLiteral);
        if (result == null) result = caseadditiveExpression(doubleLiteral);
        if (result == null) result = caserelationalExpression(doubleLiteral);
        if (result == null) result = caseandExpression(doubleLiteral);
        if (result == null) result = caseorExpression(doubleLiteral);
        if (result == null) result = caseassignmentOpExpression(doubleLiteral);
        if (result == null) result = caseExpression(doubleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger(net.certware.evidence.hugin.netDSL.Integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainDefinition(DomainDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainHeader(DomainHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainElement(DomainElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicNode(BasicNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>States Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>States Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatesAttribute(StatesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelAttribute(LabelAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionAttribute(PositionAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtype Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtype Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtypeAttribute(SubtypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Values Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Values Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateValuesAttribute(StateValuesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationAttribute(ApplicationAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Size Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Size Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeSizeAttribute(NodeSizeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotential(Potential object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Graph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Graph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialGraph(PotentialGraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialModel(PotentialModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialAttribute(PotentialAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Data Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Data Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialDataAttribute(PotentialDataAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrixRow(MatrixRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Table Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Table Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialTableAttribute(PotentialTableAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Nodes Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Nodes Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelNodesAttribute(ModelNodesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Samples Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Samples Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSamplesAttribute(SamplesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Data Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Data Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelDataAttribute(ModelDataAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDefinition(ClassDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassElement(ClassElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstance(ClassInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Bindings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Bindings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputBindings(InputBindings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputBinding(InputBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Bindings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Bindings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputBindings(OutputBindings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputBinding(OutputBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeAttributes(NodeAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionSequence(ExpressionSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assignment Op Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assignment Op Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassignmentOpExpression(assignmentOpExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseorExpression(orExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>and Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>and Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseandExpression(andExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserelationalExpression(relationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseadditiveExpression(additiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemultiplicativeExpression(multiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunaryExpression(unaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermExpression(TermExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermLiteral(TermLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList5(List5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList4(List4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList3(List3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList2(List2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList1(List1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentOp(AssignmentOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExp(OrExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExp(AndExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalExp(RelationalExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExp(AdditiveExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExp(MultiplicativeExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarRef(VarRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleLiteral(DoubleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //NetDSLSwitch
