// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.parts;

/**
 * @author Kestrel Technology LLC
 * 
 */
public class EvidenceViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Consistency view descriptor
	 * 
	 */
	public static class Consistency {
		public static class Properties {
	
			
			public static String id = "Evidence::Consistency::properties::id";
			
			
			public static String timing = "Evidence::Consistency::properties::timing";
			
			
			public static String custody = "Evidence::Consistency::properties::custody";
			
			
			public static String provenance = "Evidence::Consistency::properties::provenance";
			
			
			public static String event = "Evidence::Consistency::properties::event";
			
			
			public static String value = "Evidence::Consistency::properties::value";
			
	
		}
	
	}

	/**
	 * Completeness view descriptor
	 * 
	 */
	public static class Completeness {
		public static class Properties {
	
			
			public static String id = "Evidence::Completeness::properties::id";
			
			
			public static String timing = "Evidence::Completeness::properties::timing";
			
			
			public static String custody = "Evidence::Completeness::properties::custody";
			
			
			public static String provenance = "Evidence::Completeness::properties::provenance";
			
			
			public static String event = "Evidence::Completeness::properties::event";
			
			
			public static String status = "Evidence::Completeness::properties::status";
			
	
		}
	
	}

	/**
	 * Document view descriptor
	 * 
	 */
	public static class Document {
		public static class Properties {
	
			
			public static String id = "Evidence::Document::properties::id";
			
			
			public static String timing = "Evidence::Document::properties::timing";
			
			
			public static String custody = "Evidence::Document::properties::custody";
			
			
			public static String provenance = "Evidence::Document::properties::provenance";
			
			
			public static String event = "Evidence::Document::properties::event";
			
			
			public static String name = "Evidence::Document::properties::name";
			
			
			public static String url = "Evidence::Document::properties::url";
			
			
			public static String property = "Evidence::Document::properties::property";
			
			
			public static String title_ = "Evidence::Document::properties::title";
			
			
			public static String citation = "Evidence::Document::properties::citation";
			
	
		}
	
	}

	/**
	 * Confidence view descriptor
	 * 
	 */
	public static class Confidence {
		public static class Properties {
	
			
			public static String id = "Evidence::Confidence::properties::id";
			
			
			public static String timing = "Evidence::Confidence::properties::timing";
			
			
			public static String custody = "Evidence::Confidence::properties::custody";
			
			
			public static String provenance = "Evidence::Confidence::properties::provenance";
			
			
			public static String event = "Evidence::Confidence::properties::event";
			
			
			public static String value = "Evidence::Confidence::properties::value";
			
	
		}
	
	}

	/**
	 * ApprovedBy view descriptor
	 * 
	 */
	public static class ApprovedBy {
		public static class Properties {
	
			
			public static String id = "Evidence::ApprovedBy::properties::id";
			
			
			public static String timing = "Evidence::ApprovedBy::properties::timing";
			
			
			public static String custody = "Evidence::ApprovedBy::properties::custody";
			
			
			public static String provenance = "Evidence::ApprovedBy::properties::provenance";
			
			
			public static String event = "Evidence::ApprovedBy::properties::event";
			
			
			public static String supervisor = "Evidence::ApprovedBy::properties::supervisor";
			
	
		}
	
	}

	/**
	 * CreatedBy view descriptor
	 * 
	 */
	public static class CreatedBy {
		public static class Properties {
	
			
			public static String id = "Evidence::CreatedBy::properties::id";
			
			
			public static String timing = "Evidence::CreatedBy::properties::timing";
			
			
			public static String custody = "Evidence::CreatedBy::properties::custody";
			
			
			public static String provenance = "Evidence::CreatedBy::properties::provenance";
			
			
			public static String event = "Evidence::CreatedBy::properties::event";
			
			
			public static String source = "Evidence::CreatedBy::properties::source";
			
	
		}
	
	}

	/**
	 * Tool view descriptor
	 * 
	 */
	public static class Tool {
		public static class Properties {
	
			
			public static String id = "Evidence::Tool::properties::id";
			
			
			public static String timing = "Evidence::Tool::properties::timing";
			
			
			public static String custody = "Evidence::Tool::properties::custody";
			
			
			public static String provenance = "Evidence::Tool::properties::provenance";
			
			
			public static String event = "Evidence::Tool::properties::event";
			
			
			public static String name = "Evidence::Tool::properties::name";
			
			
			public static String content = "Evidence::Tool::properties::content";
			
			
			public static String property = "Evidence::Tool::properties::property";
			
			
			public static String version = "Evidence::Tool::properties::version";
			
	
		}
	
	}

	/**
	 * Method view descriptor
	 * 
	 */
	public static class Method {
		public static class Properties {
	
			
			public static String id = "Evidence::Method::properties::id";
			
			
			public static String timing = "Evidence::Method::properties::timing";
			
			
			public static String custody = "Evidence::Method::properties::custody";
			
			
			public static String provenance = "Evidence::Method::properties::provenance";
			
			
			public static String event = "Evidence::Method::properties::event";
			
			
			public static String name = "Evidence::Method::properties::name";
			
			
			public static String content = "Evidence::Method::properties::content";
			
			
			public static String property = "Evidence::Method::properties::property";
			
	
		}
	
	}

	/**
	 * IsBasedOn view descriptor
	 * 
	 */
	public static class IsBasedOn {
		public static class Properties {
	
			
			public static String id = "Evidence::IsBasedOn::properties::id";
			
			
			public static String timing = "Evidence::IsBasedOn::properties::timing";
			
			
			public static String custody = "Evidence::IsBasedOn::properties::custody";
			
			
			public static String provenance = "Evidence::IsBasedOn::properties::provenance";
			
			
			public static String event = "Evidence::IsBasedOn::properties::event";
			
			
			public static String source = "Evidence::IsBasedOn::properties::source";
			
	
		}
	
	}

	/**
	 * IsA view descriptor
	 * 
	 */
	public static class IsA {
		public static class Properties {
	
			
			public static String id = "Evidence::IsA::properties::id";
			
			
			public static String timing = "Evidence::IsA::properties::timing";
			
			
			public static String custody = "Evidence::IsA::properties::custody";
			
			
			public static String provenance = "Evidence::IsA::properties::provenance";
			
			
			public static String event = "Evidence::IsA::properties::event";
			
			
			public static String attribute = "Evidence::IsA::properties::attribute";
			
			
			public static String subject = "Evidence::IsA::properties::subject";
			
			
			public static String definition = "Evidence::IsA::properties::definition";
			
	
		}
	
	}

	/**
	 * IsCharacterizedBy view descriptor
	 * 
	 */
	public static class IsCharacterizedBy {
		public static class Properties {
	
			
			public static String id = "Evidence::IsCharacterizedBy::properties::id";
			
			
			public static String timing = "Evidence::IsCharacterizedBy::properties::timing";
			
			
			public static String custody = "Evidence::IsCharacterizedBy::properties::custody";
			
			
			public static String provenance = "Evidence::IsCharacterizedBy::properties::provenance";
			
			
			public static String event = "Evidence::IsCharacterizedBy::properties::event";
			
			
			public static String attribute = "Evidence::IsCharacterizedBy::properties::attribute";
			
			
			public static String subject = "Evidence::IsCharacterizedBy::properties::subject";
			
			
			public static String assertion = "Evidence::IsCharacterizedBy::properties::assertion";
			
	
		}
	
	}

	/**
	 * Person view descriptor
	 * 
	 */
	public static class Person {
		public static class Properties {
	
			
			public static String id = "Evidence::Person::properties::id";
			
			
			public static String timing = "Evidence::Person::properties::timing";
			
			
			public static String custody = "Evidence::Person::properties::custody";
			
			
			public static String provenance = "Evidence::Person::properties::provenance";
			
			
			public static String event = "Evidence::Person::properties::event";
			
			
			public static String name = "Evidence::Person::properties::name";
			
			
			public static String content = "Evidence::Person::properties::content";
			
			
			public static String property = "Evidence::Person::properties::property";
			
	
		}
	
	}

	/**
	 * Organization view descriptor
	 * 
	 */
	public static class Organization {
		public static class Properties {
	
			
			public static String id = "Evidence::Organization::properties::id";
			
			
			public static String timing = "Evidence::Organization::properties::timing";
			
			
			public static String custody = "Evidence::Organization::properties::custody";
			
			
			public static String provenance = "Evidence::Organization::properties::provenance";
			
			
			public static String event = "Evidence::Organization::properties::event";
			
			
			public static String name = "Evidence::Organization::properties::name";
			
			
			public static String content = "Evidence::Organization::properties::content";
			
			
			public static String property = "Evidence::Organization::properties::property";
			
			
			public static String address = "Evidence::Organization::properties::address";
			
	
		}
	
	}

	/**
	 * EvidenceContainer view descriptor
	 * 
	 */
	public static class EvidenceContainer {
		public static class Properties {
	
			
			public static String id = "Evidence::EvidenceContainer::properties::id";
			
			
			public static String name = "Evidence::EvidenceContainer::properties::name";
			
			
			public static String evaluation = "Evidence::EvidenceContainer::properties::evaluation";
			
			
			public static String item = "Evidence::EvidenceContainer::properties::item";
			
			
			public static String gid = "Evidence::EvidenceContainer::properties::gid";
			
			
			public static String property = "Evidence::EvidenceContainer::properties::property";
			
			
			public static String version = "Evidence::EvidenceContainer::properties::version";
			
			
			public static String element = "Evidence::EvidenceContainer::properties::element";
			
	
		}
	
	}

	/**
	 * EndTime view descriptor
	 * 
	 */
	public static class EndTime {
		public static class Properties {
	
			
			public static String id = "Evidence::EndTime::properties::id";
			
			
			public static String timing = "Evidence::EndTime::properties::timing";
			
			
			public static String custody = "Evidence::EndTime::properties::custody";
			
			
			public static String provenance = "Evidence::EndTime::properties::provenance";
			
			
			public static String event = "Evidence::EndTime::properties::event";
			
			
			public static String datetime = "Evidence::EndTime::properties::datetime";
			
	
		}
	
	}

	/**
	 * Assertion view descriptor
	 * 
	 */
	public static class Assertion {
		public static class Properties {
	
			
			public static String id = "Evidence::Assertion::properties::id";
			
			
			public static String timing = "Evidence::Assertion::properties::timing";
			
			
			public static String custody = "Evidence::Assertion::properties::custody";
			
			
			public static String provenance = "Evidence::Assertion::properties::provenance";
			
			
			public static String event = "Evidence::Assertion::properties::event";
			
			
			public static String content = "Evidence::Assertion::properties::content";
			
			
			public static String facttype = "Evidence::Assertion::properties::facttype";
			
			
			public static String role = "Evidence::Assertion::properties::role";
			
			
			public static String definition = "Evidence::Assertion::properties::definition";
			
	
		}
	
	}

	/**
	 * Object view descriptor
	 * 
	 */
	public static class Object {
		public static class Properties {
	
			
			public static String id = "Evidence::Object::properties::id";
			
			
			public static String timing = "Evidence::Object::properties::timing";
			
			
			public static String custody = "Evidence::Object::properties::custody";
			
			
			public static String provenance = "Evidence::Object::properties::provenance";
			
			
			public static String event = "Evidence::Object::properties::event";
			
			
			public static String name = "Evidence::Object::properties::name";
			
			
			public static String concept = "Evidence::Object::properties::concept";
			
			
			public static String definition = "Evidence::Object::properties::definition";
			
	
		}
	
	}

	/**
	 * CompositeObject view descriptor
	 * 
	 */
	public static class CompositeObject {
		public static class Properties {
	
			
			public static String id = "Evidence::CompositeObject::properties::id";
			
			
			public static String timing = "Evidence::CompositeObject::properties::timing";
			
			
			public static String custody = "Evidence::CompositeObject::properties::custody";
			
			
			public static String provenance = "Evidence::CompositeObject::properties::provenance";
			
			
			public static String event = "Evidence::CompositeObject::properties::event";
			
			
			public static String name = "Evidence::CompositeObject::properties::name";
			
			
			public static String element = "Evidence::CompositeObject::properties::element";
			
	
		}
	
	}

	/**
	 * RoleBinding view descriptor
	 * 
	 */
	public static class RoleBinding {
		public static class Properties {
	
			
			public static String role = "Evidence::RoleBinding::properties::role";
			
			
			public static String subject = "Evidence::RoleBinding::properties::subject";
			
	
		}
	
	}

	/**
	 * StartTime view descriptor
	 * 
	 */
	public static class StartTime {
		public static class Properties {
	
			
			public static String id = "Evidence::StartTime::properties::id";
			
			
			public static String timing = "Evidence::StartTime::properties::timing";
			
			
			public static String custody = "Evidence::StartTime::properties::custody";
			
			
			public static String provenance = "Evidence::StartTime::properties::provenance";
			
			
			public static String event = "Evidence::StartTime::properties::event";
			
			
			public static String datetime = "Evidence::StartTime::properties::datetime";
			
	
		}
	
	}

	/**
	 * Relevance view descriptor
	 * 
	 */
	public static class Relevance {
		public static class Properties {
	
			
			public static String id = "Evidence::Relevance::properties::id";
			
			
			public static String timing = "Evidence::Relevance::properties::timing";
			
			
			public static String custody = "Evidence::Relevance::properties::custody";
			
			
			public static String provenance = "Evidence::Relevance::properties::provenance";
			
			
			public static String event = "Evidence::Relevance::properties::event";
			
			
			public static String value = "Evidence::Relevance::properties::value";
			
	
		}
	
	}

	/**
	 * Significance view descriptor
	 * 
	 */
	public static class Significance {
		public static class Properties {
	
			
			public static String id = "Evidence::Significance::properties::id";
			
			
			public static String timing = "Evidence::Significance::properties::timing";
			
			
			public static String custody = "Evidence::Significance::properties::custody";
			
			
			public static String provenance = "Evidence::Significance::properties::provenance";
			
			
			public static String event = "Evidence::Significance::properties::event";
			
			
			public static String value = "Evidence::Significance::properties::value";
			
	
		}
	
	}

	/**
	 * Accuracy view descriptor
	 * 
	 */
	public static class Accuracy {
		public static class Properties {
	
			
			public static String id = "Evidence::Accuracy::properties::id";
			
			
			public static String timing = "Evidence::Accuracy::properties::timing";
			
			
			public static String custody = "Evidence::Accuracy::properties::custody";
			
			
			public static String provenance = "Evidence::Accuracy::properties::provenance";
			
			
			public static String event = "Evidence::Accuracy::properties::event";
			
			
			public static String value = "Evidence::Accuracy::properties::value";
			
	
		}
	
	}

	/**
	 * HasRoleIn view descriptor
	 * 
	 */
	public static class HasRoleIn {
		public static class Properties {
	
			
			public static String id = "Evidence::HasRoleIn::properties::id";
			
			
			public static String timing = "Evidence::HasRoleIn::properties::timing";
			
			
			public static String custody = "Evidence::HasRoleIn::properties::custody";
			
			
			public static String provenance = "Evidence::HasRoleIn::properties::provenance";
			
			
			public static String event = "Evidence::HasRoleIn::properties::event";
			
			
			public static String role = "Evidence::HasRoleIn::properties::role";
			
			
			public static String organization = "Evidence::HasRoleIn::properties::organization";
			
	
		}
	
	}

	/**
	 * IsScopedBy view descriptor
	 * 
	 */
	public static class IsScopedBy {
		public static class Properties {
	
			
			public static String id = "Evidence::IsScopedBy::properties::id";
			
			
			public static String timing = "Evidence::IsScopedBy::properties::timing";
			
			
			public static String custody = "Evidence::IsScopedBy::properties::custody";
			
			
			public static String provenance = "Evidence::IsScopedBy::properties::provenance";
			
			
			public static String event = "Evidence::IsScopedBy::properties::event";
			
			
			public static String attribute = "Evidence::IsScopedBy::properties::attribute";
			
			
			public static String subject = "Evidence::IsScopedBy::properties::subject";
			
			
			public static String scope = "Evidence::IsScopedBy::properties::scope";
			
	
		}
	
	}

	/**
	 * AtTime view descriptor
	 * 
	 */
	public static class AtTime {
		public static class Properties {
	
			
			public static String id = "Evidence::AtTime::properties::id";
			
			
			public static String timing = "Evidence::AtTime::properties::timing";
			
			
			public static String custody = "Evidence::AtTime::properties::custody";
			
			
			public static String provenance = "Evidence::AtTime::properties::provenance";
			
			
			public static String event = "Evidence::AtTime::properties::event";
			
			
			public static String dateTtime = "Evidence::AtTime::properties::dateTtime";
			
	
		}
	
	}

	/**
	 * Originality view descriptor
	 * 
	 */
	public static class Originality {
		public static class Properties {
	
			
			public static String id = "Evidence::Originality::properties::id";
			
			
			public static String timing = "Evidence::Originality::properties::timing";
			
			
			public static String custody = "Evidence::Originality::properties::custody";
			
			
			public static String provenance = "Evidence::Originality::properties::provenance";
			
			
			public static String event = "Evidence::Originality::properties::event";
			
			
			public static String value = "Evidence::Originality::properties::value";
			
	
		}
	
	}

	/**
	 * Reporting view descriptor
	 * 
	 */
	public static class Reporting {
		public static class Properties {
	
			
			public static String id = "Evidence::Reporting::properties::id";
			
			
			public static String timing = "Evidence::Reporting::properties::timing";
			
			
			public static String custody = "Evidence::Reporting::properties::custody";
			
			
			public static String provenance = "Evidence::Reporting::properties::provenance";
			
			
			public static String event = "Evidence::Reporting::properties::event";
			
			
			public static String value = "Evidence::Reporting::properties::value";
			
	
		}
	
	}

	/**
	 * Reliability view descriptor
	 * 
	 */
	public static class Reliability {
		public static class Properties {
	
			
			public static String id = "Evidence::Reliability::properties::id";
			
			
			public static String timing = "Evidence::Reliability::properties::timing";
			
			
			public static String custody = "Evidence::Reliability::properties::custody";
			
			
			public static String provenance = "Evidence::Reliability::properties::provenance";
			
			
			public static String event = "Evidence::Reliability::properties::event";
			
			
			public static String value = "Evidence::Reliability::properties::value";
			
	
		}
	
	}

	/**
	 * Supports view descriptor
	 * 
	 */
	public static class Supports {
		public static class Properties {
	
			
			public static String id = "Evidence::Supports::properties::id";
			
			
			public static String timing = "Evidence::Supports::properties::timing";
			
			
			public static String custody = "Evidence::Supports::properties::custody";
			
			
			public static String provenance = "Evidence::Supports::properties::provenance";
			
			
			public static String event = "Evidence::Supports::properties::event";
			
			
			public static String attribute = "Evidence::Supports::properties::attribute";
			
			
			public static String assertion = "Evidence::Supports::properties::assertion";
			
			
			public static String subject = "Evidence::Supports::properties::subject";
			
	
		}
	
	}

	/**
	 * IsGeneratedAt view descriptor
	 * 
	 */
	public static class IsGeneratedAt {
		public static class Properties {
	
			
			public static String id = "Evidence::IsGeneratedAt::properties::id";
			
			
			public static String timing = "Evidence::IsGeneratedAt::properties::timing";
			
			
			public static String custody = "Evidence::IsGeneratedAt::properties::custody";
			
			
			public static String provenance = "Evidence::IsGeneratedAt::properties::provenance";
			
			
			public static String event = "Evidence::IsGeneratedAt::properties::event";
			
	
		}
	
	}

	/**
	 * Support view descriptor
	 * 
	 */
	public static class Support {
		public static class Properties {
	
			
			public static String id = "Evidence::Support::properties::id";
			
			
			public static String timing = "Evidence::Support::properties::timing";
			
			
			public static String custody = "Evidence::Support::properties::custody";
			
			
			public static String provenance = "Evidence::Support::properties::provenance";
			
			
			public static String event = "Evidence::Support::properties::event";
			
			
			public static String value = "Evidence::Support::properties::value";
			
	
		}
	
	}

	/**
	 * Conflicts view descriptor
	 * 
	 */
	public static class Conflicts {
		public static class Properties {
	
			
			public static String id = "Evidence::Conflicts::properties::id";
			
			
			public static String timing = "Evidence::Conflicts::properties::timing";
			
			
			public static String custody = "Evidence::Conflicts::properties::custody";
			
			
			public static String provenance = "Evidence::Conflicts::properties::provenance";
			
			
			public static String event = "Evidence::Conflicts::properties::event";
			
			
			public static String attribute = "Evidence::Conflicts::properties::attribute";
			
			
			public static String assertion = "Evidence::Conflicts::properties::assertion";
			
			
			public static String subject = "Evidence::Conflicts::properties::subject";
			
	
		}
	
	}

	/**
	 * Refutes view descriptor
	 * 
	 */
	public static class Refutes {
		public static class Properties {
	
			
			public static String id = "Evidence::Refutes::properties::id";
			
			
			public static String timing = "Evidence::Refutes::properties::timing";
			
			
			public static String custody = "Evidence::Refutes::properties::custody";
			
			
			public static String provenance = "Evidence::Refutes::properties::provenance";
			
			
			public static String event = "Evidence::Refutes::properties::event";
			
			
			public static String attribute = "Evidence::Refutes::properties::attribute";
			
			
			public static String element = "Evidence::Refutes::properties::element";
			
	
		}
	
	}

	/**
	 * Negates view descriptor
	 * 
	 */
	public static class Negates {
		public static class Properties {
	
			
			public static String id = "Evidence::Negates::properties::id";
			
			
			public static String timing = "Evidence::Negates::properties::timing";
			
			
			public static String custody = "Evidence::Negates::properties::custody";
			
			
			public static String provenance = "Evidence::Negates::properties::provenance";
			
			
			public static String event = "Evidence::Negates::properties::event";
			
			
			public static String attribute = "Evidence::Negates::properties::attribute";
			
			
			public static String element = "Evidence::Negates::properties::element";
			
	
		}
	
	}

	/**
	 * UnknownObject view descriptor
	 * 
	 */
	public static class UnknownObject {
		public static class Properties {
	
			
			public static String id = "Evidence::UnknownObject::properties::id";
			
			
			public static String timing = "Evidence::UnknownObject::properties::timing";
			
			
			public static String custody = "Evidence::UnknownObject::properties::custody";
			
			
			public static String provenance = "Evidence::UnknownObject::properties::provenance";
			
			
			public static String event = "Evidence::UnknownObject::properties::event";
			
			
			public static String name = "Evidence::UnknownObject::properties::name";
			
	
		}
	
	}

	/**
	 * Resolves view descriptor
	 * 
	 */
	public static class Resolves {
		public static class Properties {
	
			
			public static String id = "Evidence::Resolves::properties::id";
			
			
			public static String timing = "Evidence::Resolves::properties::timing";
			
			
			public static String custody = "Evidence::Resolves::properties::custody";
			
			
			public static String provenance = "Evidence::Resolves::properties::provenance";
			
			
			public static String event = "Evidence::Resolves::properties::event";
			
			
			public static String attribute = "Evidence::Resolves::properties::attribute";
			
			
			public static String element = "Evidence::Resolves::properties::element";
			
	
		}
	
	}

	/**
	 * EvidenceRequest view descriptor
	 * 
	 */
	public static class EvidenceRequest {
		public static class Properties {
	
			
			public static String id = "Evidence::EvidenceRequest::properties::id";
			
			
			public static String timing = "Evidence::EvidenceRequest::properties::timing";
			
			
			public static String custody = "Evidence::EvidenceRequest::properties::custody";
			
			
			public static String provenance = "Evidence::EvidenceRequest::properties::provenance";
			
			
			public static String event = "Evidence::EvidenceRequest::properties::event";
			
			
			public static String name = "Evidence::EvidenceRequest::properties::name";
			
			
			public static String content = "Evidence::EvidenceRequest::properties::content";
			
			
			public static String property = "Evidence::EvidenceRequest::properties::property";
			
			
			public static String item = "Evidence::EvidenceRequest::properties::item";
			
	
		}
	
	}

	/**
	 * ProjectObjective view descriptor
	 * 
	 */
	public static class ProjectObjective {
		public static class Properties {
	
			
			public static String id = "Evidence::ProjectObjective::properties::id";
			
			
			public static String timing = "Evidence::ProjectObjective::properties::timing";
			
			
			public static String custody = "Evidence::ProjectObjective::properties::custody";
			
			
			public static String provenance = "Evidence::ProjectObjective::properties::provenance";
			
			
			public static String event = "Evidence::ProjectObjective::properties::event";
			
			
			public static String name = "Evidence::ProjectObjective::properties::name";
			
			
			public static String content = "Evidence::ProjectObjective::properties::content";
			
			
			public static String property = "Evidence::ProjectObjective::properties::property";
			
	
		}
	
	}

	/**
	 * Activity view descriptor
	 * 
	 */
	public static class Activity {
		public static class Properties {
	
			
			public static String id = "Evidence::Activity::properties::id";
			
			
			public static String timing = "Evidence::Activity::properties::timing";
			
			
			public static String custody = "Evidence::Activity::properties::custody";
			
			
			public static String provenance = "Evidence::Activity::properties::provenance";
			
			
			public static String event = "Evidence::Activity::properties::event";
			
			
			public static String name = "Evidence::Activity::properties::name";
			
			
			public static String content = "Evidence::Activity::properties::content";
			
			
			public static String property = "Evidence::Activity::properties::property";
			
	
		}
	
	}

	/**
	 * DependsOn view descriptor
	 * 
	 */
	public static class DependsOn {
		public static class Properties {
	
			
			public static String id = "Evidence::DependsOn::properties::id";
			
			
			public static String timing = "Evidence::DependsOn::properties::timing";
			
			
			public static String custody = "Evidence::DependsOn::properties::custody";
			
			
			public static String provenance = "Evidence::DependsOn::properties::provenance";
			
			
			public static String event = "Evidence::DependsOn::properties::event";
			
			
			public static String element = "Evidence::DependsOn::properties::element";
			
	
		}
	
	}

	/**
	 * Satisfies view descriptor
	 * 
	 */
	public static class Satisfies {
		public static class Properties {
	
			
			public static String id = "Evidence::Satisfies::properties::id";
			
			
			public static String timing = "Evidence::Satisfies::properties::timing";
			
			
			public static String custody = "Evidence::Satisfies::properties::custody";
			
			
			public static String provenance = "Evidence::Satisfies::properties::provenance";
			
			
			public static String event = "Evidence::Satisfies::properties::event";
			
			
			public static String element = "Evidence::Satisfies::properties::element";
			
	
		}
	
	}

	/**
	 * ReferencedClaim view descriptor
	 * 
	 */
	public static class ReferencedClaim {
		public static class Properties {
	
			
			public static String id = "Evidence::ReferencedClaim::properties::id";
			
			
			public static String timing = "Evidence::ReferencedClaim::properties::timing";
			
			
			public static String custody = "Evidence::ReferencedClaim::properties::custody";
			
			
			public static String provenance = "Evidence::ReferencedClaim::properties::provenance";
			
			
			public static String event = "Evidence::ReferencedClaim::properties::event";
			
			
			public static String content = "Evidence::ReferencedClaim::properties::content";
			
			
			public static String claim = "Evidence::ReferencedClaim::properties::claim";
			
	
		}
	
	}

	/**
	 * Weakens view descriptor
	 * 
	 */
	public static class Weakens {
		public static class Properties {
	
			
			public static String taggedValue = "Evidence::Weakens::properties::taggedValue";
			
			
			public static String annotation = "Evidence::Weakens::properties::annotation";
			
			
			public static String id = "Evidence::Weakens::properties::id";
			
			
			public static String timing = "Evidence::Weakens::properties::timing";
			
			
			public static String custody = "Evidence::Weakens::properties::custody";
			
			
			public static String provenance = "Evidence::Weakens::properties::provenance";
			
			
			public static String event = "Evidence::Weakens::properties::event";
			
			
			public static String attribute = "Evidence::Weakens::properties::attribute";
			
			
			public static String subject = "Evidence::Weakens::properties::subject";
			
			
			public static String relation = "Evidence::Weakens::properties::relation";
			
	
		}
	
	}

	/**
	 * Amplifies view descriptor
	 * 
	 */
	public static class Amplifies {
		public static class Properties {
	
			
			public static String id = "Evidence::Amplifies::properties::id";
			
			
			public static String timing = "Evidence::Amplifies::properties::timing";
			
			
			public static String custody = "Evidence::Amplifies::properties::custody";
			
			
			public static String provenance = "Evidence::Amplifies::properties::provenance";
			
			
			public static String event = "Evidence::Amplifies::properties::event";
			
			
			public static String attribute = "Evidence::Amplifies::properties::attribute";
			
			
			public static String subject = "Evidence::Amplifies::properties::subject";
			
			
			public static String relation = "Evidence::Amplifies::properties::relation";
			
	
		}
	
	}

	/**
	 * Challenges view descriptor
	 * 
	 */
	public static class Challenges {
		public static class Properties {
	
			
			public static String id = "Evidence::Challenges::properties::id";
			
			
			public static String timing = "Evidence::Challenges::properties::timing";
			
			
			public static String custody = "Evidence::Challenges::properties::custody";
			
			
			public static String provenance = "Evidence::Challenges::properties::provenance";
			
			
			public static String event = "Evidence::Challenges::properties::event";
			
			
			public static String attribute = "Evidence::Challenges::properties::attribute";
			
			
			public static String assertion = "Evidence::Challenges::properties::assertion";
			
			
			public static String subject = "Evidence::Challenges::properties::subject";
			
	
		}
	
	}

	/**
	 * Strength view descriptor
	 * 
	 */
	public static class Strength {
		public static class Properties {
	
			
			public static String id = "Evidence::Strength::properties::id";
			
			
			public static String timing = "Evidence::Strength::properties::timing";
			
			
			public static String custody = "Evidence::Strength::properties::custody";
			
			
			public static String provenance = "Evidence::Strength::properties::provenance";
			
			
			public static String event = "Evidence::Strength::properties::event";
			
			
			public static String value = "Evidence::Strength::properties::value";
			
	
		}
	
	}

	/**
	 * IsAcquiredAt view descriptor
	 * 
	 */
	public static class IsAcquiredAt {
		public static class Properties {
	
			
			public static String id = "Evidence::IsAcquiredAt::properties::id";
			
			
			public static String timing = "Evidence::IsAcquiredAt::properties::timing";
			
			
			public static String custody = "Evidence::IsAcquiredAt::properties::custody";
			
			
			public static String provenance = "Evidence::IsAcquiredAt::properties::provenance";
			
			
			public static String event = "Evidence::IsAcquiredAt::properties::event";
			
	
		}
	
	}

	/**
	 * IsTransferredTo view descriptor
	 * 
	 */
	public static class IsTransferredTo {
		public static class Properties {
	
			
			public static String id = "Evidence::IsTransferredTo::properties::id";
			
			
			public static String timing = "Evidence::IsTransferredTo::properties::timing";
			
			
			public static String custody = "Evidence::IsTransferredTo::properties::custody";
			
			
			public static String provenance = "Evidence::IsTransferredTo::properties::provenance";
			
			
			public static String event = "Evidence::IsTransferredTo::properties::event";
			
	
		}
	
	}

	/**
	 * OwnedBy view descriptor
	 * 
	 */
	public static class OwnedBy {
		public static class Properties {
	
			
			public static String id = "Evidence::OwnedBy::properties::id";
			
			
			public static String timing = "Evidence::OwnedBy::properties::timing";
			
			
			public static String custody = "Evidence::OwnedBy::properties::custody";
			
			
			public static String provenance = "Evidence::OwnedBy::properties::provenance";
			
			
			public static String event = "Evidence::OwnedBy::properties::event";
			
			
			public static String owner = "Evidence::OwnedBy::properties::owner";
			
	
		}
	
	}

	/**
	 * IsPartOf view descriptor
	 * 
	 */
	public static class IsPartOf {
		public static class Properties {
	
			
			public static String id = "Evidence::IsPartOf::properties::id";
			
			
			public static String timing = "Evidence::IsPartOf::properties::timing";
			
			
			public static String custody = "Evidence::IsPartOf::properties::custody";
			
			
			public static String provenance = "Evidence::IsPartOf::properties::provenance";
			
			
			public static String event = "Evidence::IsPartOf::properties::event";
			
			
			public static String whole = "Evidence::IsPartOf::properties::whole";
			
	
		}
	
	}

	/**
	 * IsRevokedAt view descriptor
	 * 
	 */
	public static class IsRevokedAt {
		public static class Properties {
	
			
			public static String id = "Evidence::IsRevokedAt::properties::id";
			
			
			public static String timing = "Evidence::IsRevokedAt::properties::timing";
			
			
			public static String custody = "Evidence::IsRevokedAt::properties::custody";
			
			
			public static String provenance = "Evidence::IsRevokedAt::properties::provenance";
			
			
			public static String event = "Evidence::IsRevokedAt::properties::event";
			
	
		}
	
	}

	/**
	 * ProvidesContext view descriptor
	 * 
	 */
	public static class ProvidesContext {
		public static class Properties {
	
			
			public static String id = "Evidence::ProvidesContext::properties::id";
			
			
			public static String timing = "Evidence::ProvidesContext::properties::timing";
			
			
			public static String custody = "Evidence::ProvidesContext::properties::custody";
			
			
			public static String provenance = "Evidence::ProvidesContext::properties::provenance";
			
			
			public static String event = "Evidence::ProvidesContext::properties::event";
			
			
			public static String attribute = "Evidence::ProvidesContext::properties::attribute";
			
			
			public static String subject = "Evidence::ProvidesContext::properties::subject";
			
			
			public static String context = "Evidence::ProvidesContext::properties::context";
			
	
		}
	
	}

	/**
	 * MeansThat view descriptor
	 * 
	 */
	public static class MeansThat {
		public static class Properties {
	
			
			public static String id = "Evidence::MeansThat::properties::id";
			
			
			public static String timing = "Evidence::MeansThat::properties::timing";
			
			
			public static String custody = "Evidence::MeansThat::properties::custody";
			
			
			public static String provenance = "Evidence::MeansThat::properties::provenance";
			
			
			public static String event = "Evidence::MeansThat::properties::event";
			
			
			public static String attribute = "Evidence::MeansThat::properties::attribute";
			
			
			public static String subject = "Evidence::MeansThat::properties::subject";
			
			
			public static String meaning = "Evidence::MeansThat::properties::meaning";
			
	
		}
	
	}

	/**
	 * CareOf view descriptor
	 * 
	 */
	public static class CareOf {
		public static class Properties {
	
			
			public static String id = "Evidence::CareOf::properties::id";
			
			
			public static String timing = "Evidence::CareOf::properties::timing";
			
			
			public static String custody = "Evidence::CareOf::properties::custody";
			
			
			public static String provenance = "Evidence::CareOf::properties::provenance";
			
			
			public static String event = "Evidence::CareOf::properties::event";
			
			
			public static String custodian = "Evidence::CareOf::properties::custodian";
			
	
		}
	
	}

	/**
	 * AtLocation view descriptor
	 * 
	 */
	public static class AtLocation {
		public static class Properties {
	
			
			public static String id = "Evidence::AtLocation::properties::id";
			
			
			public static String timing = "Evidence::AtLocation::properties::timing";
			
			
			public static String custody = "Evidence::AtLocation::properties::custody";
			
			
			public static String provenance = "Evidence::AtLocation::properties::provenance";
			
			
			public static String event = "Evidence::AtLocation::properties::event";
			
			
			public static String location = "Evidence::AtLocation::properties::location";
			
	
		}
	
	}

	/**
	 * IsCreatedAt view descriptor
	 * 
	 */
	public static class IsCreatedAt {
		public static class Properties {
	
			
			public static String id = "Evidence::IsCreatedAt::properties::id";
			
			
			public static String timing = "Evidence::IsCreatedAt::properties::timing";
			
			
			public static String custody = "Evidence::IsCreatedAt::properties::custody";
			
			
			public static String provenance = "Evidence::IsCreatedAt::properties::provenance";
			
			
			public static String event = "Evidence::IsCreatedAt::properties::event";
			
	
		}
	
	}

	/**
	 * RequiresContainer view descriptor
	 * 
	 */
	public static class RequiresContainer {
		public static class Properties {
	
			
			public static String id = "Evidence::RequiresContainer::properties::id";
			
			
			public static String timing = "Evidence::RequiresContainer::properties::timing";
			
			
			public static String custody = "Evidence::RequiresContainer::properties::custody";
			
			
			public static String provenance = "Evidence::RequiresContainer::properties::provenance";
			
			
			public static String event = "Evidence::RequiresContainer::properties::event";
			
			
			public static String container = "Evidence::RequiresContainer::properties::container";
			
	
		}
	
	}

	/**
	 * Service view descriptor
	 * 
	 */
	public static class Service {
		public static class Properties {
	
			
			public static String id = "Evidence::Service::properties::id";
			
			
			public static String timing = "Evidence::Service::properties::timing";
			
			
			public static String custody = "Evidence::Service::properties::custody";
			
			
			public static String provenance = "Evidence::Service::properties::provenance";
			
			
			public static String event = "Evidence::Service::properties::event";
			
			
			public static String name = "Evidence::Service::properties::name";
			
			
			public static String content = "Evidence::Service::properties::content";
			
			
			public static String property = "Evidence::Service::properties::property";
			
	
		}
	
	}

	/**
	 * HasElectronicSource view descriptor
	 * 
	 */
	public static class HasElectronicSource {
		public static class Properties {
	
			
			public static String id = "Evidence::HasElectronicSource::properties::id";
			
			
			public static String timing = "Evidence::HasElectronicSource::properties::timing";
			
			
			public static String custody = "Evidence::HasElectronicSource::properties::custody";
			
			
			public static String provenance = "Evidence::HasElectronicSource::properties::provenance";
			
			
			public static String event = "Evidence::HasElectronicSource::properties::event";
			
			
			public static String source = "Evidence::HasElectronicSource::properties::source";
			
			
			public static String format = "Evidence::HasElectronicSource::properties::format";
			
			
			public static String fileSize = "Evidence::HasElectronicSource::properties::fileSize";
			
	
		}
	
	}

	/**
	 * IsExpressedInLanguage view descriptor
	 * 
	 */
	public static class IsExpressedInLanguage {
		public static class Properties {
	
			
			public static String id = "Evidence::IsExpressedInLanguage::properties::id";
			
			
			public static String timing = "Evidence::IsExpressedInLanguage::properties::timing";
			
			
			public static String custody = "Evidence::IsExpressedInLanguage::properties::custody";
			
			
			public static String provenance = "Evidence::IsExpressedInLanguage::properties::provenance";
			
			
			public static String event = "Evidence::IsExpressedInLanguage::properties::event";
			
			
			public static String language = "Evidence::IsExpressedInLanguage::properties::language";
			
			
			public static String isPrimary = "Evidence::IsExpressedInLanguage::properties::IsPrimary";
			
	
		}
	
	}

	/**
	 * UsingProcess view descriptor
	 * 
	 */
	public static class UsingProcess {
		public static class Properties {
	
			
			public static String id = "Evidence::UsingProcess::properties::id";
			
			
			public static String timing = "Evidence::UsingProcess::properties::timing";
			
			
			public static String custody = "Evidence::UsingProcess::properties::custody";
			
			
			public static String provenance = "Evidence::UsingProcess::properties::provenance";
			
			
			public static String event = "Evidence::UsingProcess::properties::event";
			
			
			public static String method = "Evidence::UsingProcess::properties::method";
			
	
		}
	
	}

	/**
	 * HasSecurityClassification view descriptor
	 * 
	 */
	public static class HasSecurityClassification {
		public static class Properties {
	
			
			public static String id = "Evidence::HasSecurityClassification::properties::id";
			
			
			public static String timing = "Evidence::HasSecurityClassification::properties::timing";
			
			
			public static String custody = "Evidence::HasSecurityClassification::properties::custody";
			
			
			public static String provenance = "Evidence::HasSecurityClassification::properties::provenance";
			
			
			public static String event = "Evidence::HasSecurityClassification::properties::event";
			
			
			public static String securityClassification = "Evidence::HasSecurityClassification::properties::securityClassification";
			
	
		}
	
	}

	/**
	 * IsReleaseableTo view descriptor
	 * 
	 */
	public static class IsReleaseableTo {
		public static class Properties {
	
			
			public static String id = "Evidence::IsReleaseableTo::properties::id";
			
			
			public static String timing = "Evidence::IsReleaseableTo::properties::timing";
			
			
			public static String custody = "Evidence::IsReleaseableTo::properties::custody";
			
			
			public static String provenance = "Evidence::IsReleaseableTo::properties::provenance";
			
			
			public static String event = "Evidence::IsReleaseableTo::properties::event";
			
			
			public static String releasability = "Evidence::IsReleaseableTo::properties::releasability";
			
	
		}
	
	}

	/**
	 * EvidenceGroup view descriptor
	 * 
	 */
	public static class EvidenceGroup {
		public static class Properties {
	
			
			public static String id = "Evidence::EvidenceGroup::properties::id";
			
			
			public static String timing = "Evidence::EvidenceGroup::properties::timing";
			
			
			public static String custody = "Evidence::EvidenceGroup::properties::custody";
			
			
			public static String provenance = "Evidence::EvidenceGroup::properties::provenance";
			
			
			public static String event = "Evidence::EvidenceGroup::properties::event";
			
			
			public static String name = "Evidence::EvidenceGroup::properties::name";
			
			
			public static String element = "Evidence::EvidenceGroup::properties::element";
			
	
		}
	
	}

	/**
	 * HasVersion view descriptor
	 * 
	 */
	public static class HasVersion {
		public static class Properties {
	
			
			public static String id = "Evidence::HasVersion::properties::id";
			
			
			public static String timing = "Evidence::HasVersion::properties::timing";
			
			
			public static String custody = "Evidence::HasVersion::properties::custody";
			
			
			public static String provenance = "Evidence::HasVersion::properties::provenance";
			
			
			public static String event = "Evidence::HasVersion::properties::event";
			
			
			public static String version = "Evidence::HasVersion::properties::version";
			
	
		}
	
	}

	/**
	 * HasMedia view descriptor
	 * 
	 */
	public static class HasMedia {
		public static class Properties {
	
			
			public static String id = "Evidence::HasMedia::properties::id";
			
			
			public static String timing = "Evidence::HasMedia::properties::timing";
			
			
			public static String custody = "Evidence::HasMedia::properties::custody";
			
			
			public static String provenance = "Evidence::HasMedia::properties::provenance";
			
			
			public static String event = "Evidence::HasMedia::properties::event";
			
			
			public static String media = "Evidence::HasMedia::properties::media";
			
	
		}
	
	}

	/**
	 * Exhibit view descriptor
	 * 
	 */
	public static class Exhibit {
		public static class Properties {
	
			
			public static String id = "Evidence::Exhibit::properties::id";
			
			
			public static String timing = "Evidence::Exhibit::properties::timing";
			
			
			public static String custody = "Evidence::Exhibit::properties::custody";
			
			
			public static String provenance = "Evidence::Exhibit::properties::provenance";
			
			
			public static String event = "Evidence::Exhibit::properties::event";
			
			
			public static String name = "Evidence::Exhibit::properties::name";
			
			
			public static String url = "Evidence::Exhibit::properties::url";
			
			
			public static String property = "Evidence::Exhibit::properties::property";
			
	
		}
	
	}

	/**
	 * ExtendedEvidenceAttribute view descriptor
	 * 
	 */
	public static class ExtendedEvidenceAttribute {
		public static class Properties {
	
			
			public static String id = "Evidence::ExtendedEvidenceAttribute::properties::id";
			
			
			public static String timing = "Evidence::ExtendedEvidenceAttribute::properties::timing";
			
			
			public static String custody = "Evidence::ExtendedEvidenceAttribute::properties::custody";
			
			
			public static String provenance = "Evidence::ExtendedEvidenceAttribute::properties::provenance";
			
			
			public static String event = "Evidence::ExtendedEvidenceAttribute::properties::event";
			
	
		}
	
	}

	/**
	 * ExtendedDocumentProperty view descriptor
	 * 
	 */
	public static class ExtendedDocumentProperty {
		public static class Properties {
	
			
			public static String id = "Evidence::ExtendedDocumentProperty::properties::id";
			
			
			public static String timing = "Evidence::ExtendedDocumentProperty::properties::timing";
			
			
			public static String custody = "Evidence::ExtendedDocumentProperty::properties::custody";
			
			
			public static String provenance = "Evidence::ExtendedDocumentProperty::properties::provenance";
			
			
			public static String event = "Evidence::ExtendedDocumentProperty::properties::event";
			
	
		}
	
	}

	/**
	 * Record view descriptor
	 * 
	 */
	public static class Record {
		public static class Properties {
	
			
			public static String id = "Evidence::Record::properties::id";
			
			
			public static String timing = "Evidence::Record::properties::timing";
			
			
			public static String custody = "Evidence::Record::properties::custody";
			
			
			public static String provenance = "Evidence::Record::properties::provenance";
			
			
			public static String event = "Evidence::Record::properties::event";
			
			
			public static String name = "Evidence::Record::properties::name";
			
			
			public static String content = "Evidence::Record::properties::content";
			
	
		}
	
	}

	/**
	 * ObjectifiedAssertion view descriptor
	 * 
	 */
	public static class ObjectifiedAssertion {
		public static class Properties {
	
			
			public static String id = "Evidence::ObjectifiedAssertion::properties::id";
			
			
			public static String timing = "Evidence::ObjectifiedAssertion::properties::timing";
			
			
			public static String custody = "Evidence::ObjectifiedAssertion::properties::custody";
			
			
			public static String provenance = "Evidence::ObjectifiedAssertion::properties::provenance";
			
			
			public static String event = "Evidence::ObjectifiedAssertion::properties::event";
			
			
			public static String name = "Evidence::ObjectifiedAssertion::properties::name";
			
			
			public static String assertion = "Evidence::ObjectifiedAssertion::properties::assertion";
			
	
		}
	
	}

	/**
	 * IsModifiedBy view descriptor
	 * 
	 */
	public static class IsModifiedBy {
		public static class Properties {
	
			
			public static String id = "Evidence::IsModifiedBy::properties::id";
			
			
			public static String timing = "Evidence::IsModifiedBy::properties::timing";
			
			
			public static String custody = "Evidence::IsModifiedBy::properties::custody";
			
			
			public static String provenance = "Evidence::IsModifiedBy::properties::provenance";
			
			
			public static String event = "Evidence::IsModifiedBy::properties::event";
			
	
		}
	
	}

	/**
	 * PerformedBy view descriptor
	 * 
	 */
	public static class PerformedBy {
		public static class Properties {
	
			
			public static String id = "Evidence::PerformedBy::properties::id";
			
			
			public static String timing = "Evidence::PerformedBy::properties::timing";
			
			
			public static String custody = "Evidence::PerformedBy::properties::custody";
			
			
			public static String provenance = "Evidence::PerformedBy::properties::provenance";
			
			
			public static String event = "Evidence::PerformedBy::properties::event";
			
			
			public static String executor = "Evidence::PerformedBy::properties::executor";
			
	
		}
	
	}

	/**
	 * ContainerConsistency view descriptor
	 * 
	 */
	public static class ContainerConsistency {
		public static class Properties {
	
			
			public static String id = "Evidence::ContainerConsistency::properties::id";
			
			
			public static String timing = "Evidence::ContainerConsistency::properties::timing";
			
			
			public static String custody = "Evidence::ContainerConsistency::properties::custody";
			
			
			public static String provenance = "Evidence::ContainerConsistency::properties::provenance";
			
			
			public static String event = "Evidence::ContainerConsistency::properties::event";
			
			
			public static String value = "Evidence::ContainerConsistency::properties::value";
			
	
		}
	
	}

	/**
	 * ContainerCompleteness view descriptor
	 * 
	 */
	public static class ContainerCompleteness {
		public static class Properties {
	
			
			public static String id = "Evidence::ContainerCompleteness::properties::id";
			
			
			public static String timing = "Evidence::ContainerCompleteness::properties::timing";
			
			
			public static String custody = "Evidence::ContainerCompleteness::properties::custody";
			
			
			public static String provenance = "Evidence::ContainerCompleteness::properties::provenance";
			
			
			public static String event = "Evidence::ContainerCompleteness::properties::event";
			
			
			public static String value = "Evidence::ContainerCompleteness::properties::value";
			
	
		}
	
	}

	/**
	 * CompliesTo view descriptor
	 * 
	 */
	public static class CompliesTo {
		public static class Properties {
	
			
			public static String id = "Evidence::CompliesTo::properties::id";
			
			
			public static String timing = "Evidence::CompliesTo::properties::timing";
			
			
			public static String custody = "Evidence::CompliesTo::properties::custody";
			
			
			public static String provenance = "Evidence::CompliesTo::properties::provenance";
			
			
			public static String event = "Evidence::CompliesTo::properties::event";
			
			
			public static String criteria = "Evidence::CompliesTo::properties::criteria";
			
	
		}
	
	}

	/**
	 * ExtendedProjectProperty view descriptor
	 * 
	 */
	public static class ExtendedProjectProperty {
		public static class Properties {
	
			
			public static String id = "Evidence::ExtendedProjectProperty::properties::id";
			
			
			public static String timing = "Evidence::ExtendedProjectProperty::properties::timing";
			
			
			public static String custody = "Evidence::ExtendedProjectProperty::properties::custody";
			
			
			public static String provenance = "Evidence::ExtendedProjectProperty::properties::provenance";
			
			
			public static String event = "Evidence::ExtendedProjectProperty::properties::event";
			
	
		}
	
	}

	/**
	 * Notes view descriptor
	 * 
	 */
	public static class Notes {
		public static class Properties {
	
			
			public static String taggedValue = "Evidence::Notes::properties::taggedValue";
			
			
			public static String annotation = "Evidence::Notes::properties::annotation";
			
	
		}
	
	}

}
