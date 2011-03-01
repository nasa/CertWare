
package net.certware.argument.aml.parts;

/**
 * @author mrb
 * 
 */
public class AmlViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * AggregationRule view descriptor
	 * 
	 */
	public static class AggregationRule {
		
		public static String parameter = "aml::AggregationRule::parameter";
		
	
	}

	/**
	 * AmlDocument view descriptor
	 * 
	 */
	public static class AmlDocument {
		
		public static String group = "aml::AmlDocument::group";
		
		
		public static String version = "aml::AmlDocument::version";
		
	
	}

	/**
	 * Annotation view descriptor
	 * 
	 */
	public static class Annotation {
		
		public static String mixed = "aml::Annotation::mixed";
		
		
		public static String id = "aml::Annotation::id";
		
	
	}

	/**
	 * Answer view descriptor
	 * 
	 */
	public static class Answer {
		
		public static String group = "aml::Answer::group";
		
		
		public static String questionId = "aml::Answer::questionId";
		
	
	}

	/**
	 * ArgumentTemplate view descriptor
	 * 
	 */
	public static class ArgumentTemplate {
		
		public static String value = "aml::ArgumentTemplate::value";
		
		
		public static String idRef = "aml::ArgumentTemplate::idRef";
		
	
	}

	/**
	 * Argument view descriptor
	 * 
	 */
	public static class Argument {
		
		public static String annotation = "aml::Argument::annotation";
		
		
		public static String answer = "aml::Argument::answer";
		
		
		public static String id = "aml::Argument::id";
		
	
	}

	/**
	 * Belief view descriptor
	 * 
	 */
	public static class Belief {
		
		public static String description = "aml::Belief::description";
		
		
		public static String label = "aml::Belief::label";
		
		
		public static String ordinal = "aml::Belief::ordinal";
		
		
		public static String symbol = "aml::Belief::symbol";
		
	
	}

	/**
	 * Choice view descriptor
	 * 
	 */
	public static class Choice {
		
		public static String description = "aml::Choice::description";
		
		
		public static String label = "aml::Choice::label";
		
		
		public static String ordinal = "aml::Choice::ordinal";
		
		
		public static String symbol = "aml::Choice::symbol";
		
	
	}

	/**
	 * CollectionItem view descriptor
	 * 
	 */
	public static class CollectionItem {
		
		public static String idRef = "aml::CollectionItem::idRef";
		
		
		public static String objectType = "aml::CollectionItem::objectType";
		
		
		public static String ordinal = "aml::CollectionItem::ordinal";
		
	
	}

	/**
	 * Collection view descriptor
	 * 
	 */
	public static class Collection {
		
		public static String annotation = "aml::Collection::annotation";
		
		
		public static String group = "aml::Collection::group";
		
		
		public static String id = "aml::Collection::id";
		
		
		public static String label1 = "aml::Collection::label1";
		
		
		public static String objectType = "aml::Collection::objectType";
		
	
	}

	/**
	 * Coverage view descriptor
	 * 
	 */
	public static class Coverage {
		
		public static String mixed = "aml::Coverage::mixed";
		
	
	}

	/**
	 * CreatingTool view descriptor
	 * 
	 */
	public static class CreatingTool {
		
		public static String label = "aml::CreatingTool::label";
		
		
		public static String toolType = "aml::CreatingTool::toolType";
		
		
		public static String version = "aml::CreatingTool::version";
		
	
	}

	/**
	 * Creator view descriptor
	 * 
	 */
	public static class Creator {
		
		public static String description = "aml::Creator::description";
		
		
		public static String idRef = "aml::Creator::idRef";
		
		
		public static String objectType = "aml::Creator::objectType";
		
	
	}

	/**
	 * Dependent view descriptor
	 * 
	 */
	public static class Dependent {
		
		public static String idRef = "aml::Dependent::idRef";
		
		
		public static String ordinal = "aml::Dependent::ordinal";
		
	
	}

	/**
	 * DiscoveryMethod view descriptor
	 * 
	 */
	public static class DiscoveryMethod {
		
		public static String url = "aml::DiscoveryMethod::url";
		
		
		public static String annotation = "aml::DiscoveryMethod::annotation";
		
		
		public static String autoTrigger = "aml::DiscoveryMethod::autoTrigger";
		
		
		public static String description = "aml::DiscoveryMethod::description";
		
		
		public static String id = "aml::DiscoveryMethod::id";
		
		
		public static String importType = "aml::DiscoveryMethod::importType";
		
		
		public static String label = "aml::DiscoveryMethod::label";
		
		
		public static String type = "aml::DiscoveryMethod::type";
		
	
	}

	/**
	 * DocumentRoot view descriptor
	 * 
	 */
	public static class DocumentRoot {
		
		public static String mixed = "aml::DocumentRoot::mixed";
		
		
		public static String xMLNSPrefixMap = "aml::DocumentRoot::xMLNSPrefixMap";
		
		
		public static String xSISchemaLocation = "aml::DocumentRoot::xSISchemaLocation";
		
		
		public static String description1 = "aml::DocumentRoot::description1";
		
		
		public static String id = "aml::DocumentRoot::id";
		
		
		public static String idRef = "aml::DocumentRoot::idRef";
		
		
		public static String label1 = "aml::DocumentRoot::label1";
		
	
	}

	/**
	 * End view descriptor
	 * 
	 */
	public static class End {
		
		public static String value = "aml::End::value";
		
		
		public static String scheme = "aml::End::scheme";
		
	
	}

	/**
	 * EvidenceExhibit view descriptor
	 * 
	 */
	public static class EvidenceExhibit {
		
		public static String value = "aml::EvidenceExhibit::value";
		
		
		public static String idRef = "aml::EvidenceExhibit::idRef";
		
		
		public static String questionId = "aml::EvidenceExhibit::questionId";
		
	
	}

	/**
	 * Evidence view descriptor
	 * 
	 */
	public static class Evidence {
		
		public static String annotation = "aml::Evidence::annotation";
		
		
		public static String id = "aml::Evidence::id";
		
		
		public static String label = "aml::Evidence::label";
		
		
		public static String ordinal = "aml::Evidence::ordinal";
		
	
	}

	/**
	 * Exhibit view descriptor
	 * 
	 */
	public static class Exhibit {
		
		public static String annotation = "aml::Exhibit::annotation";
		
		
		public static String id = "aml::Exhibit::id";
		
	
	}

	/**
	 * Flag view descriptor
	 * 
	 */
	public static class Flag {
		
		public static String description = "aml::Flag::description";
		
		
		public static String flagType = "aml::Flag::flagType";
		
		
		public static String label = "aml::Flag::label";
		
	
	}

	/**
	 * Interval view descriptor
	 * 
	 */
	public static class Interval {
		
		public static String max = "aml::Interval::max";
		
		
		public static String min = "aml::Interval::min";
		
	
	}

	/**
	 * List view descriptor
	 * 
	 */
	public static class List {
		
		public static String group = "aml::List::group";
		
	
	}

	/**
	 * Memo view descriptor
	 * 
	 */
	public static class Memo {
		
		public static String creator = "aml::Memo::creator";
		
		
		public static String reader = "aml::Memo::reader";
		
		
		public static String subject = "aml::Memo::subject";
		
		
		public static String body = "aml::Memo::body";
		
		
		public static String id = "aml::Memo::id";
		
		
		public static String type = "aml::Memo::type";
		
	
	}

	/**
	 * MetaData view descriptor
	 * 
	 */
	public static class MetaData {
		
		public static String group = "aml::MetaData::group";
		
	
	}

	/**
	 * NationState view descriptor
	 * 
	 */
	public static class NationState {
		
		public static String group = "aml::NationState::group";
		
	
	}

	/**
	 * Parameter view descriptor
	 * 
	 */
	public static class Parameter {
		
		public static String symbol = "aml::Parameter::symbol";
		
	
	}

	/**
	 * Period view descriptor
	 * 
	 */
	public static class Period {
		
		public static String group = "aml::Period::group";
		
		
		public static String label = "aml::Period::label";
		
	
	}

	/**
	 * Person view descriptor
	 * 
	 */
	public static class Person {
		
		public static String firstName = "aml::Person::firstName";
		
		
		public static String middleName = "aml::Person::middleName";
		
		
		public static String lastName = "aml::Person::lastName";
		
		
		public static String nickName = "aml::Person::nickName";
		
		
		public static String organization = "aml::Person::organization";
		
		
		public static String department = "aml::Person::department";
		
		
		public static String email = "aml::Person::email";
		
		
		public static String description = "aml::Person::description";
		
		
		public static String id = "aml::Person::id";
		
	
	}

	/**
	 * Publisher view descriptor
	 * 
	 */
	public static class Publisher {
		
		public static String description = "aml::Publisher::description";
		
		
		public static String idRef = "aml::Publisher::idRef";
		
		
		public static String objectType = "aml::Publisher::objectType";
		
	
	}

	/**
	 * QuestionRelationships view descriptor
	 * 
	 */
	public static class QuestionRelationships {
		
		public static String dependent = "aml::QuestionRelationships::dependent";
		
	
	}

	/**
	 * Question view descriptor
	 * 
	 */
	public static class Question {
		
		public static String group = "aml::Question::group";
		
		
		public static String amplification = "aml::Question::amplification";
		
		
		public static String description = "aml::Question::description";
		
		
		public static String id = "aml::Question::id";
		
		
		public static String label = "aml::Question::label";
		
	
	}

	/**
	 * Reader view descriptor
	 * 
	 */
	public static class Reader {
		
		public static String description = "aml::Reader::description";
		
		
		public static String idRef = "aml::Reader::idRef";
		
		
		public static String objectType = "aml::Reader::objectType";
		
	
	}

	/**
	 * Relevance view descriptor
	 * 
	 */
	public static class Relevance {
		
		public static String description = "aml::Relevance::description";
		
		
		public static String label = "aml::Relevance::label";
		
		
		public static String ordinal = "aml::Relevance::ordinal";
		
		
		public static String symbol = "aml::Relevance::symbol";
		
	
	}

	/**
	 * Reliability view descriptor
	 * 
	 */
	public static class Reliability {
		
		public static String description = "aml::Reliability::description";
		
		
		public static String label = "aml::Reliability::label";
		
		
		public static String ordinal = "aml::Reliability::ordinal";
		
		
		public static String symbol = "aml::Reliability::symbol";
		
	
	}

	/**
	 * Start view descriptor
	 * 
	 */
	public static class Start {
		
		public static String value = "aml::Start::value";
		
		
		public static String scheme = "aml::Start::scheme";
		
	
	}

	/**
	 * Template view descriptor
	 * 
	 */
	public static class Template {
		
		public static String annotation = "aml::Template::annotation";
		
		
		public static String question = "aml::Template::question";
		
		
		public static String id = "aml::Template::id";
		
	
	}

	/**
	 * Value view descriptor
	 * 
	 */
	public static class Value {
		
		public static String mixed = "aml::Value::mixed";
		
		
		public static String type = "aml::Value::type";
		
		
		public static String unit = "aml::Value::unit";
		
	
	}

	/**
	 * Witness view descriptor
	 * 
	 */
	public static class Witness {
		
		public static String description = "aml::Witness::description";
		
		
		public static String idRef = "aml::Witness::idRef";
		
		
		public static String timestamp = "aml::Witness::timestamp";
		
	
	}

}
