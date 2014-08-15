package net.certware.sacm.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.sacm.SACM.Annotation;
import net.certware.sacm.SACM.Argumentation.ArgumentReasoning;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.AssertedChallenge;
import net.certware.sacm.SACM.Argumentation.AssertedContext;
import net.certware.sacm.SACM.Argumentation.AssertedCounterEvidence;
import net.certware.sacm.SACM.Argumentation.AssertedEvidence;
import net.certware.sacm.SACM.Argumentation.AssertedInference;
import net.certware.sacm.SACM.Argumentation.CitationElement;
import net.certware.sacm.SACM.Argumentation.Claim;
import net.certware.sacm.SACM.Argumentation.InformationElement;
import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.Datetime;
import net.certware.sacm.SACM.Evidence.Accuracy;
import net.certware.sacm.SACM.Evidence.Activity;
import net.certware.sacm.SACM.Evidence.Amplifies;
import net.certware.sacm.SACM.Evidence.ApprovedBy;
import net.certware.sacm.SACM.Evidence.Assertion;
import net.certware.sacm.SACM.Evidence.AtLocation;
import net.certware.sacm.SACM.Evidence.AtTime;
import net.certware.sacm.SACM.Evidence.CareOf;
import net.certware.sacm.SACM.Evidence.Challenges;
import net.certware.sacm.SACM.Evidence.Completeness;
import net.certware.sacm.SACM.Evidence.CompliesTo;
import net.certware.sacm.SACM.Evidence.CompositeObject;
import net.certware.sacm.SACM.Evidence.Confidence;
import net.certware.sacm.SACM.Evidence.Conflicts;
import net.certware.sacm.SACM.Evidence.Consistency;
import net.certware.sacm.SACM.Evidence.ContainerCompleteness;
import net.certware.sacm.SACM.Evidence.ContainerConsistency;
import net.certware.sacm.SACM.Evidence.CreatedBy;
import net.certware.sacm.SACM.Evidence.DependsOn;
import net.certware.sacm.SACM.Evidence.Document;
import net.certware.sacm.SACM.Evidence.EndTime;
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceGroup;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.EvidenceRequest;
import net.certware.sacm.SACM.Evidence.Exhibit;
import net.certware.sacm.SACM.Evidence.ExtendedDocumentProperty;
import net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute;
import net.certware.sacm.SACM.Evidence.ExtendedProjectProperty;
import net.certware.sacm.SACM.Evidence.HasElectronicSource;
import net.certware.sacm.SACM.Evidence.HasMedia;
import net.certware.sacm.SACM.Evidence.HasRoleIn;
import net.certware.sacm.SACM.Evidence.HasSecurityClassification;
import net.certware.sacm.SACM.Evidence.HasVersion;
import net.certware.sacm.SACM.Evidence.IsA;
import net.certware.sacm.SACM.Evidence.IsAcquiredAt;
import net.certware.sacm.SACM.Evidence.IsBasedOn;
import net.certware.sacm.SACM.Evidence.IsCharacterizedBy;
import net.certware.sacm.SACM.Evidence.IsCreatedAt;
import net.certware.sacm.SACM.Evidence.IsExpressedInLanguage;
import net.certware.sacm.SACM.Evidence.IsGeneratedAt;
import net.certware.sacm.SACM.Evidence.IsModifiedBy;
import net.certware.sacm.SACM.Evidence.IsPartOf;
import net.certware.sacm.SACM.Evidence.IsReleaseableTo;
import net.certware.sacm.SACM.Evidence.IsRevokedAt;
import net.certware.sacm.SACM.Evidence.IsScopedBy;
import net.certware.sacm.SACM.Evidence.IsTransferredTo;
import net.certware.sacm.SACM.Evidence.MeansThat;
import net.certware.sacm.SACM.Evidence.Method;
import net.certware.sacm.SACM.Evidence.Negates;
import net.certware.sacm.SACM.Evidence.ObjectifiedAssertion;
import net.certware.sacm.SACM.Evidence.Organization;
import net.certware.sacm.SACM.Evidence.Originality;
import net.certware.sacm.SACM.Evidence.OwnedBy;
import net.certware.sacm.SACM.Evidence.PerformedBy;
import net.certware.sacm.SACM.Evidence.Person;
import net.certware.sacm.SACM.Evidence.ProjectObjective;
import net.certware.sacm.SACM.Evidence.ProvidesContext;
import net.certware.sacm.SACM.Evidence.Record;
import net.certware.sacm.SACM.Evidence.ReferencedClaim;
import net.certware.sacm.SACM.Evidence.Refutes;
import net.certware.sacm.SACM.Evidence.Relevance;
import net.certware.sacm.SACM.Evidence.Reliability;
import net.certware.sacm.SACM.Evidence.Reporting;
import net.certware.sacm.SACM.Evidence.RequiresContainer;
import net.certware.sacm.SACM.Evidence.Resolves;
import net.certware.sacm.SACM.Evidence.RoleBinding;
import net.certware.sacm.SACM.Evidence.Satisfies;
import net.certware.sacm.SACM.Evidence.Service;
import net.certware.sacm.SACM.Evidence.Significance;
import net.certware.sacm.SACM.Evidence.StartTime;
import net.certware.sacm.SACM.Evidence.Strength;
import net.certware.sacm.SACM.Evidence.Support;
import net.certware.sacm.SACM.Evidence.Supports;
import net.certware.sacm.SACM.Evidence.Tool;
import net.certware.sacm.SACM.Evidence.UnknownObject;
import net.certware.sacm.SACM.Evidence.UsingProcess;
import net.certware.sacm.SACM.Evidence.Weakens;
import net.certware.sacm.SACM.SACMPackage;
import net.certware.sacm.SACM.TaggedValue;
import net.certware.sacm.dsl.services.SacmDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractSacmDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SacmDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ArgumentationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ArgumentationPackage.ARGUMENT_REASONING:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getArgumentReasoningRule()) {
					sequence_ArgumentReasoning(context, (ArgumentReasoning) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.ARGUMENTATION:
				if(context == grammarAccess.getArgumentation0Rule()) {
					sequence_Argumentation0(context, (Argumentation) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.ASSERTED_CHALLENGE:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getAssertedChallengeRule()) {
					sequence_AssertedChallenge(context, (AssertedChallenge) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.ASSERTED_CONTEXT:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getAssertedContextRule()) {
					sequence_AssertedContext(context, (AssertedContext) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.ASSERTED_COUNTER_EVIDENCE:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getAssertedCounterEvidenceRule()) {
					sequence_AssertedCounterEvidence(context, (AssertedCounterEvidence) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.ASSERTED_EVIDENCE:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getAssertedEvidenceRule()) {
					sequence_AssertedEvidence(context, (AssertedEvidence) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.ASSERTED_INFERENCE:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getAssertedInferenceRule()) {
					sequence_AssertedInference(context, (AssertedInference) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.CITATION_ELEMENT:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getCitationElementRule()) {
					sequence_CitationElement(context, (CitationElement) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.CLAIM:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getClaimRule()) {
					sequence_Claim(context, (Claim) semanticObject); 
					return; 
				}
				else break;
			case ArgumentationPackage.INFORMATION_ELEMENT:
				if(context == grammarAccess.getArgumentElementRule() ||
				   context == grammarAccess.getInformationElementRule()) {
					sequence_InformationElement(context, (InformationElement) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == EvidencePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EvidencePackage.ACCURACY:
				if(context == grammarAccess.getAccuracyRule() ||
				   context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule()) {
					sequence_Accuracy(context, (Accuracy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectElementRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.AMPLIFIES:
				if(context == grammarAccess.getAmplifiesRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getEvidenceObservationRule()) {
					sequence_Amplifies(context, (Amplifies) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.APPROVED_BY:
				if(context == grammarAccess.getApprovedByRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProvenanceRule()) {
					sequence_ApprovedBy(context, (ApprovedBy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.ASSERTION:
				if(context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getFormalAssertionRule() ||
				   context == grammarAccess.getFormalElementRule()) {
					sequence_Assertion(context, (Assertion) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.AT_LOCATION:
				if(context == grammarAccess.getAtLocationRule() ||
				   context == grammarAccess.getCustodyPropertyRule() ||
				   context == grammarAccess.getEvidenceElementRule()) {
					sequence_AtLocation(context, (AtLocation) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.AT_TIME:
				if(context == grammarAccess.getAtTimeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getTimingPropertyRule()) {
					sequence_AtTime(context, (AtTime) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CARE_OF:
				if(context == grammarAccess.getCareOfRule() ||
				   context == grammarAccess.getCustodyPropertyRule() ||
				   context == grammarAccess.getEvidenceElementRule()) {
					sequence_CareOf(context, (CareOf) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CHALLENGES:
				if(context == grammarAccess.getChallengesRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getEvidenceRelationRule()) {
					sequence_Challenges(context, (Challenges) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.COMPLETENESS:
				if(context == grammarAccess.getCompletenessRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule()) {
					sequence_Completeness(context, (Completeness) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.COMPLIES_TO:
				if(context == grammarAccess.getCompliesToRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectPropertyRule()) {
					sequence_CompliesTo(context, (CompliesTo) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.COMPOSITE_OBJECT:
				if(context == grammarAccess.getCompositeObjectRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getFormalElementRule() ||
				   context == grammarAccess.getFormalObjectRule()) {
					sequence_CompositeObject(context, (CompositeObject) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CONFIDENCE:
				if(context == grammarAccess.getConfidenceRule() ||
				   context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule()) {
					sequence_Confidence(context, (Confidence) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CONFLICTS:
				if(context == grammarAccess.getConflictsRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getEvidenceObservationRule()) {
					sequence_Conflicts(context, (Conflicts) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CONSISTENCY:
				if(context == grammarAccess.getConsistencyRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule()) {
					sequence_Consistency(context, (Consistency) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CONTAINER_COMPLETENESS:
				if(context == grammarAccess.getContainerCompletenessRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectPropertyRule()) {
					sequence_ContainerCompleteness(context, (ContainerCompleteness) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CONTAINER_CONSISTENCY:
				if(context == grammarAccess.getContainerConsistencyRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectPropertyRule()) {
					sequence_ContainerConsistency(context, (ContainerConsistency) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.CREATED_BY:
				if(context == grammarAccess.getCreatedByRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProvenanceRule()) {
					sequence_CreatedBy(context, (CreatedBy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.DEPENDS_ON:
				if(context == grammarAccess.getDependsOnRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectPropertyRule()) {
					sequence_DependsOn(context, (DependsOn) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.DOCUMENT:
				if(context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getExhibitRule()) {
					sequence_Document(context, (Document) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.END_TIME:
				if(context == grammarAccess.getEndTimeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getTimingPropertyRule()) {
					sequence_EndTime(context, (EndTime) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.EVIDENCE_CONTAINER:
				if(context == grammarAccess.getEvidenceContainerRule()) {
					sequence_EvidenceContainer(context, (EvidenceContainer) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.EVIDENCE_GROUP:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceGroupRule() ||
				   context == grammarAccess.getEvidenceItemRule()) {
					sequence_EvidenceGroup(context, (EvidenceGroup) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.EVIDENCE_REQUEST:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceRequestRule() ||
				   context == grammarAccess.getProjectElementRule()) {
					sequence_EvidenceRequest(context, (EvidenceRequest) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.EXHIBIT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getExhibitRule() ||
				   context == grammarAccess.getExhibit_ImplRule()) {
					sequence_Exhibit_Impl(context, (Exhibit) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.EXTENDED_DOCUMENT_PROPERTY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getExtendedDocumentPropertyRule()) {
					sequence_ExtendedDocumentProperty(context, (ExtendedDocumentProperty) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.EXTENDED_EVIDENCE_ATTRIBUTE:
				if(context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExtendedEvidenceAttributeRule()) {
					sequence_ExtendedEvidenceAttribute(context, (ExtendedEvidenceAttribute) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.EXTENDED_PROJECT_PROPERTY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExtendedProjectPropertyRule() ||
				   context == grammarAccess.getProjectPropertyRule()) {
					sequence_ExtendedProjectProperty(context, (ExtendedProjectProperty) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getHasElectronicSourceRule()) {
					sequence_HasElectronicSource(context, (HasElectronicSource) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.HAS_MEDIA:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getHasMediaRule()) {
					sequence_HasMedia(context, (HasMedia) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.HAS_ROLE_IN:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getHasRoleInRule() ||
				   context == grammarAccess.getProjectPropertyRule()) {
					sequence_HasRoleIn(context, (HasRoleIn) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getHasSecurityClassificationRule()) {
					sequence_HasSecurityClassification(context, (HasSecurityClassification) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.HAS_VERSION:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getHasVersionRule()) {
					sequence_HasVersion(context, (HasVersion) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_A:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getIsARule()) {
					sequence_IsA(context, (IsA) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_ACQUIRED_AT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEventRule() ||
				   context == grammarAccess.getIsAcquiredAtRule()) {
					sequence_IsAcquiredAt(context, (IsAcquiredAt) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_BASED_ON:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getIsBasedOnRule()) {
					sequence_IsBasedOn(context, (IsBasedOn) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_CHARACTERIZED_BY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getIsCharacterizedByRule()) {
					sequence_IsCharacterizedBy(context, (IsCharacterizedBy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_CREATED_AT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEventRule() ||
				   context == grammarAccess.getIsCreatedAtRule()) {
					sequence_IsCreatedAt(context, (IsCreatedAt) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getIsExpressedInLanguageRule()) {
					sequence_IsExpressedInLanguage(context, (IsExpressedInLanguage) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_GENERATED_AT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEventRule() ||
				   context == grammarAccess.getIsGeneratedAtRule()) {
					sequence_IsGeneratedAt(context, (IsGeneratedAt) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_MODIFIED_BY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEventRule() ||
				   context == grammarAccess.getIsModifiedByRule()) {
					sequence_IsModifiedBy(context, (IsModifiedBy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_PART_OF:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getIsPartOfRule()) {
					sequence_IsPartOf(context, (IsPartOf) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_RELEASEABLE_TO:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getIsReleaseableToRule()) {
					sequence_IsReleaseableTo(context, (IsReleaseableTo) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_REVOKED_AT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEventRule() ||
				   context == grammarAccess.getIsRevokedAtRule()) {
					sequence_IsRevokedAt(context, (IsRevokedAt) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_SCOPED_BY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getIsScopedByRule()) {
					sequence_IsScopedBy(context, (IsScopedBy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.IS_TRANSFERRED_TO:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEventRule() ||
				   context == grammarAccess.getIsTransferredToRule()) {
					sequence_IsTransferredTo(context, (IsTransferredTo) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.MEANS_THAT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getMeansThatRule()) {
					sequence_MeansThat(context, (MeansThat) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.METHOD:
				if(context == grammarAccess.getCollectionMethodRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getMethodRule() ||
				   context == grammarAccess.getProjectElementRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.NEGATES:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getNegatesRule()) {
					sequence_Negates(context, (Negates) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.OBJECT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getFormalElementRule() ||
				   context == grammarAccess.getFormalObjectRule() ||
				   context == grammarAccess.getObjectRule()) {
					sequence_Object(context, (net.certware.sacm.SACM.Evidence.Object) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.OBJECTIFIED_ASSERTION:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getFormalElementRule() ||
				   context == grammarAccess.getFormalObjectRule() ||
				   context == grammarAccess.getObjectifiedAssertionRule()) {
					sequence_ObjectifiedAssertion(context, (ObjectifiedAssertion) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.ORGANIZATION:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getOrganizationRule() ||
				   context == grammarAccess.getProjectElementRule() ||
				   context == grammarAccess.getStakeholderRule()) {
					sequence_Organization(context, (Organization) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.ORIGINALITY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getOriginalityRule()) {
					sequence_Originality(context, (Originality) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.OWNED_BY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getOwnedByRule() ||
				   context == grammarAccess.getProvenanceRule()) {
					sequence_OwnedBy(context, (OwnedBy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.PERFORMED_BY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getPerformedByRule() ||
				   context == grammarAccess.getProvenanceRule()) {
					sequence_PerformedBy(context, (PerformedBy) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.PERSON:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getPersonRule() ||
				   context == grammarAccess.getProjectElementRule() ||
				   context == grammarAccess.getStakeholderRule()) {
					sequence_Person(context, (Person) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.PROJECT_OBJECTIVE:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectElementRule() ||
				   context == grammarAccess.getProjectObjectiveRule()) {
					sequence_ProjectObjective(context, (ProjectObjective) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.PROVIDES_CONTEXT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getProvidesContextRule()) {
					sequence_ProvidesContext(context, (ProvidesContext) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.RECORD:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getRecordRule()) {
					sequence_Record(context, (Record) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.REFERENCED_CLAIM:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getFormalAssertionRule() ||
				   context == grammarAccess.getFormalElementRule() ||
				   context == grammarAccess.getReferencedClaimRule()) {
					sequence_ReferencedClaim(context, (ReferencedClaim) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.REFUTES:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getRefutesRule()) {
					sequence_Refutes(context, (Refutes) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.RELEVANCE:
				if(context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getRelevanceRule()) {
					sequence_Relevance(context, (Relevance) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.RELIABILITY:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getExhibitPropertyRule() ||
				   context == grammarAccess.getReliabilityRule()) {
					sequence_Reliability(context, (Reliability) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.REPORTING:
				if(context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getReportingRule()) {
					sequence_Reporting(context, (Reporting) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.REQUIRES_CONTAINER:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectPropertyRule() ||
				   context == grammarAccess.getRequiresContainerRule()) {
					sequence_RequiresContainer(context, (RequiresContainer) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.RESOLVES:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getResolvesRule()) {
					sequence_Resolves(context, (Resolves) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.ROLE_BINDING:
				if(context == grammarAccess.getRoleBindingRule()) {
					sequence_RoleBinding(context, (RoleBinding) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.SATISFIES:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectPropertyRule() ||
				   context == grammarAccess.getSatisfiesRule()) {
					sequence_Satisfies(context, (Satisfies) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.SERVICE:
				if(context == grammarAccess.getCollectionMethodRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectElementRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.SIGNIFICANCE:
				if(context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getSignificanceRule()) {
					sequence_Significance(context, (Significance) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.START_TIME:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getStartTimeRule() ||
				   context == grammarAccess.getTimingPropertyRule()) {
					sequence_StartTime(context, (StartTime) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.STRENGTH:
				if(context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getStrengthRule()) {
					sequence_Strength(context, (Strength) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.SUPPORT:
				if(context == grammarAccess.getEvidenceAttributeRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getSupportRule()) {
					sequence_Support(context, (Support) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.SUPPORTS:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getEvidenceRelationRule() ||
				   context == grammarAccess.getSupportsRule()) {
					sequence_Supports(context, (Supports) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.TOOL:
				if(context == grammarAccess.getCollectionMethodRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getProjectElementRule() ||
				   context == grammarAccess.getToolRule()) {
					sequence_Tool(context, (Tool) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.UNKNOWN_OBJECT:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceItemRule() ||
				   context == grammarAccess.getFormalElementRule() ||
				   context == grammarAccess.getFormalObjectRule() ||
				   context == grammarAccess.getUnknownObjectRule()) {
					sequence_UnknownObject(context, (UnknownObject) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.USING_PROCESS:
				if(context == grammarAccess.getCustodyPropertyRule() ||
				   context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getUsingProcessRule()) {
					sequence_UsingProcess(context, (UsingProcess) semanticObject); 
					return; 
				}
				else break;
			case EvidencePackage.WEAKENS:
				if(context == grammarAccess.getEvidenceElementRule() ||
				   context == grammarAccess.getEvidenceEvaluationRule() ||
				   context == grammarAccess.getEvidenceObservationRule() ||
				   context == grammarAccess.getWeakensRule()) {
					sequence_Weakens(context, (Weakens) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SACMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SACMPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case SACMPackage.ASSURANCE_CASE:
				if(context == grammarAccess.getAssuranceCaseRule()) {
					sequence_AssuranceCase(context, (AssuranceCase) semanticObject); 
					return; 
				}
				else break;
			case SACMPackage.DATETIME:
				if(context == grammarAccess.getDatetimeRule()) {
					sequence_Datetime(context, (Datetime) semanticObject); 
					return; 
				}
				else break;
			case SACMPackage.TAGGED_VALUE:
				if(context == grammarAccess.getTaggedValueRule()) {
					sequence_TaggedValue(context, (TaggedValue) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EOBJECT:
				if(context == grammarAccess.getEObjectRule()) {
					sequence_EObject(context, (EObject) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=AccuracyLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Accuracy(EObject context, Accuracy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         subject=[EvidenceRelation|EString] 
	 *         relation=[EvidenceRelation|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_Amplifies(EObject context, Amplifies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=String0
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SACMPackage.Literals.ANNOTATION__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SACMPackage.Literals.ANNOTATION__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotationAccess().getContentString0ParserRuleCall_3_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         supervisor=[Stakeholder|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ApprovedBy(EObject context, ApprovedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (structure+=[Argumentation|EString] structure+=[Argumentation|EString]*)? 
	 *         (describedInference+=[AssertedInference|EString] describedInference+=[AssertedInference|EString]*)? 
	 *         (describedChallenge+=[AssertedChallenge|EString] describedChallenge+=[AssertedChallenge|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_ArgumentReasoning(EObject context, ArgumentReasoning semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (argumentation+=Argumentation0 argumentation+=Argumentation0*)? 
	 *         (argumentElement+=ArgumentElement argumentElement+=ArgumentElement*)?
	 *     )
	 */
	protected void sequence_Argumentation0(EObject context, Argumentation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (source+=[ArgumentElement|EString] source+=[ArgumentElement|EString]*)? 
	 *         (target+=[ArgumentElement|EString] target+=[ArgumentElement|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_AssertedChallenge(EObject context, AssertedChallenge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (source+=[ArgumentElement|EString] source+=[ArgumentElement|EString]*)? 
	 *         (target+=[ArgumentElement|EString] target+=[ArgumentElement|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_AssertedContext(EObject context, AssertedContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (source+=[ArgumentElement|EString] source+=[ArgumentElement|EString]*)? 
	 *         (target+=[ArgumentElement|EString] target+=[ArgumentElement|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_AssertedCounterEvidence(EObject context, AssertedCounterEvidence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (source+=[ArgumentElement|EString] source+=[ArgumentElement|EString]*)? 
	 *         (target+=[ArgumentElement|EString] target+=[ArgumentElement|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_AssertedEvidence(EObject context, AssertedEvidence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (source+=[ArgumentElement|EString] source+=[ArgumentElement|EString]*)? 
	 *         (target+=[ArgumentElement|EString] target+=[ArgumentElement|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_AssertedInference(EObject context, AssertedInference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         content=String0 
	 *         facttype=String0 
	 *         definition=[EObject|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (role+=RoleBinding role+=RoleBinding*)?
	 *     )
	 */
	protected void sequence_Assertion(EObject context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         gid=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (argument+=Argumentation0 argument+=Argumentation0*)? 
	 *         (evidence+=EvidenceContainer evidence+=EvidenceContainer*)?
	 *     )
	 */
	protected void sequence_AssuranceCase(EObject context, AssuranceCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         location=[Organization|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_AtLocation(EObject context, AtLocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         dateTtime=[Datetime|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_AtTime(EObject context, AtTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         custodian=[Person|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_CareOf(EObject context, CareOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         assertion=[FormalAssertion|EString] 
	 *         subject=[EvidenceItem|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_Challenges(EObject context, Challenges semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         (argumentElementReference+=[ArgumentElement|EString] argumentElementReference+=[ArgumentElement|EString]*)? 
	 *         (argumentationReference+=[Argumentation|EString] argumentationReference+=[Argumentation|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_CitationElement(EObject context, CitationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         assumed=Boolean 
	 *         toBeSupported=Boolean 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_Claim(EObject context, Claim semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         status=CompletenessLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Completeness(EObject context, Completeness semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         criteria=StandardOfProof 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_CompliesTo(EObject context, CompliesTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (element+=FormalObject element+=FormalObject*)?
	 *     )
	 */
	protected void sequence_CompositeObject(EObject context, CompositeObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=ConfidenceLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Confidence(EObject context, Confidence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         assertion=[FormalAssertion|EString] 
	 *         subject=[FormalAssertion|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_Conflicts(EObject context, Conflicts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=ConsistencyLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Consistency(EObject context, Consistency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=CompletenessLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ContainerCompleteness(EObject context, ContainerCompleteness semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=ConsistencyLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ContainerConsistency(EObject context, ContainerConsistency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         source=[Stakeholder|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_CreatedBy(EObject context, CreatedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     datetime=String0
	 */
	protected void sequence_Datetime(EObject context, Datetime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SACMPackage.Literals.DATETIME__DATETIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SACMPackage.Literals.DATETIME__DATETIME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDatetimeAccess().getDatetimeString0ParserRuleCall_3_0(), semanticObject.getDatetime());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         element=[ProjectElement|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_DependsOn(EObject context, DependsOn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         url=String0 
	 *         title=String0 
	 *         citation=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ExhibitProperty property+=ExhibitProperty*)?
	 *     )
	 */
	protected void sequence_Document(EObject context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(EObject context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         datetime=[Datetime|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_EndTime(EObject context, EndTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         gid=String0 
	 *         version=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (evaluation+=EvidenceEvaluation evaluation+=EvidenceEvaluation*)? 
	 *         (item+=EvidenceItem item+=EvidenceItem*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)? 
	 *         (element+=ProjectElement element+=ProjectElement*)?
	 *     )
	 */
	protected void sequence_EvidenceContainer(EObject context, EvidenceContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         (element+=[EvidenceElement|EString] element+=[EvidenceElement|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_EvidenceGroup(EObject context, EvidenceGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         (item+=[EvidenceItem|EString] item+=[EvidenceItem|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_EvidenceRequest(EObject context, EvidenceRequest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         url=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ExhibitProperty property+=ExhibitProperty*)?
	 *     )
	 */
	protected void sequence_Exhibit_Impl(EObject context, Exhibit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ExtendedDocumentProperty(EObject context, ExtendedDocumentProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ExtendedEvidenceAttribute(EObject context, ExtendedEvidenceAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ExtendedProjectProperty(EObject context, ExtendedProjectProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         source=String0 
	 *         format=String0 
	 *         fileSize=Integer 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_HasElectronicSource(EObject context, HasElectronicSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         media=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_HasMedia(EObject context, HasMedia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         role=String0 
	 *         organization=[Organization|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_HasRoleIn(EObject context, HasRoleIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         securityClassification=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_HasSecurityClassification(EObject context, HasSecurityClassification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         version=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_HasVersion(EObject context, HasVersion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         description=String0 
	 *         content=String0 
	 *         url=String0 
	 *         (evidence+=[EvidenceItem|EString] evidence+=[EvidenceItem|EString]*)? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)?
	 *     )
	 */
	protected void sequence_InformationElement(EObject context, InformationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         subject=[EvidenceElement|EString] 
	 *         definition=[FormalElement|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_IsA(EObject context, IsA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsAcquiredAt(EObject context, IsAcquiredAt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         source=[EvidenceItem|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsBasedOn(EObject context, IsBasedOn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         subject=[EvidenceElement|EString] 
	 *         assertion=[FormalAssertion|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_IsCharacterizedBy(EObject context, IsCharacterizedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsCreatedAt(EObject context, IsCreatedAt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         language=String0 
	 *         IsPrimary=Boolean 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsExpressedInLanguage(EObject context, IsExpressedInLanguage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsGeneratedAt(EObject context, IsGeneratedAt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsModifiedBy(EObject context, IsModifiedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         whole=[Exhibit|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsPartOf(EObject context, IsPartOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         releasability=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsReleaseableTo(EObject context, IsReleaseableTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsRevokedAt(EObject context, IsRevokedAt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         subject=[EvidenceElement|EString] 
	 *         scope=[FormalElement|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_IsScopedBy(EObject context, IsScopedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_IsTransferredTo(EObject context, IsTransferredTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         subject=[EvidenceElement|EString] 
	 *         meaning=[FormalAssertion|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_MeansThat(EObject context, MeansThat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         element=[EvidenceRelation|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)? 
	 *         subject=EvidenceElement
	 *     )
	 */
	protected void sequence_Negates(EObject context, Negates semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         concept=String0 
	 *         definition=[EObject|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Object(EObject context, net.certware.sacm.SACM.Evidence.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         assertion=[FormalAssertion|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ObjectifiedAssertion(EObject context, ObjectifiedAssertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         address=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_Organization(EObject context, Organization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=OriginalityLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Originality(EObject context, Originality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         owner=[Stakeholder|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_OwnedBy(EObject context, OwnedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         executor=[Stakeholder|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_PerformedBy(EObject context, PerformedBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_Person(EObject context, Person semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_ProjectObjective(EObject context, ProjectObjective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         subject=[EvidenceElement|EString] 
	 *         context=[EvidenceElement|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_ProvidesContext(EObject context, ProvidesContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Record(EObject context, Record semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         content=String0 
	 *         claim=[Claim|EString]? 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_ReferencedClaim(EObject context, ReferencedClaim semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         element=[FormalAssertion|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)? 
	 *         subject=EvidenceElement
	 *     )
	 */
	protected void sequence_Refutes(EObject context, Refutes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=Level 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Relevance(EObject context, Relevance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=ReliabilityLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Reliability(EObject context, Reliability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=ReportingLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Reporting(EObject context, Reporting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         container=[EvidenceContainer|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_RequiresContainer(EObject context, RequiresContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         element=[EvidenceObservation|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)? 
	 *         subject=EvidenceElement
	 *     )
	 */
	protected void sequence_Resolves(EObject context, Resolves semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (role=String0 subject=[FormalObject|EString]?)
	 */
	protected void sequence_RoleBinding(EObject context, RoleBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         element=[ProjectElement|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Satisfies(EObject context, Satisfies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=Level 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Significance(EObject context, Significance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         datetime=[Datetime|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_StartTime(EObject context, StartTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=Integer 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Strength(EObject context, Strength semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         value=SupportLevel 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_Support(EObject context, Support semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         assertion=[FormalAssertion|EString] 
	 *         subject=[EvidenceItem|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_Supports(EObject context, Supports semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=String0 value=String0)
	 */
	protected void sequence_TaggedValue(EObject context, TaggedValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SACMPackage.Literals.TAGGED_VALUE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SACMPackage.Literals.TAGGED_VALUE__KEY));
			if(transientValues.isValueTransient(semanticObject, SACMPackage.Literals.TAGGED_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SACMPackage.Literals.TAGGED_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTaggedValueAccess().getKeyString0ParserRuleCall_3_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getTaggedValueAccess().getValueString0ParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         content=String0 
	 *         version=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (property+=ProjectProperty property+=ProjectProperty*)?
	 *     )
	 */
	protected void sequence_Tool(EObject context, Tool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         name=String0 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_UnknownObject(EObject context, UnknownObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         method=[CollectionMethod|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)?
	 *     )
	 */
	protected void sequence_UsingProcess(EObject context, UsingProcess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=String0 
	 *         subject=[EvidenceRelation|EString] 
	 *         relation=[EvidenceRelation|EString] 
	 *         (taggedValue+=TaggedValue taggedValue+=TaggedValue*)? 
	 *         (annotation+=Annotation annotation+=Annotation*)? 
	 *         (timing+=TimingProperty timing+=TimingProperty*)? 
	 *         (custody+=CustodyProperty custody+=CustodyProperty*)? 
	 *         (provenance+=Provenance provenance+=Provenance*)? 
	 *         (event+=EvidenceEvent event+=EvidenceEvent*)? 
	 *         (attribute+=EvidenceAttribute attribute+=EvidenceAttribute*)?
	 *     )
	 */
	protected void sequence_Weakens(EObject context, Weakens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
