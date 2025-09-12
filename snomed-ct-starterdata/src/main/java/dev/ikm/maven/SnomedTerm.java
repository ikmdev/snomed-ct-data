package dev.ikm.maven;

import dev.ikm.tinkar.terms.EntityProxy.Concept;
import dev.ikm.tinkar.terms.EntityProxy.Pattern;

import java.util.UUID;

/**
 * Tinkar Term Binding class to enable programmatic access to tinkar data elements known to be stored in an Komet database.
 * @author  SNOMED-CT Author
 */
public class SnomedTerm {

    /**
     * Namespace used in the UUID creation process for tinkar components (e.g., Concept, Pattern, Semantic, and STAMP)
     */
    public static final UUID NAMESPACE = UUID.fromString("3094dbd1-60cf-44a6-92e3-0bb32ca4d3de");

    /**
     * Java binding for the pattern described as PRIMORDIAL_COMMENT_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>3734fb0a-4c14-5831-9a61-4743af609e7a
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_STRING_DISPLAY_FIELD that represents PRIMORDIAL_COMMENT.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_COMMENT_PATTERN = Pattern.make("PRIMORDIAL_COMMENT_PATTERN", UUID.fromString("3734fb0a-4c14-5831-9a61-4743af609e7a"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_COMPONENT_CHRONOLOGY_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>c48db76d-5eb0-4ff5-84d0-5c3c4ec77767
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PUBLIC_ID_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_COMPONENT_VERSIONS_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_COMPONENT_CHRONOLOGY_PATTERN = Pattern.make("PRIMORDIAL_COMPONENT_CHRONOLOGY_PATTERN", UUID.fromString("c48db76d-5eb0-4ff5-84d0-5c3c4ec77767"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_COMPONENT_VERSION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>a38b7d2d-8fa5-4206-9185-a1af9f81be2c
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_STAMP_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_COMPONENT_VERSION_PATTERN = Pattern.make("PRIMORDIAL_COMPONENT_VERSION_PATTERN", UUID.fromString("a38b7d2d-8fa5-4206-9185-a1af9f81be2c"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_CONCEPT_CHRONOLOGY_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>3e510cb9-1666-4676-9334-d288a56bf155
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PUBLIC_ID_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_CONCEPT_VERSIONS_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_CONCEPT_CHRONOLOGY_PATTERN = Pattern.make("PRIMORDIAL_CONCEPT_CHRONOLOGY_PATTERN", UUID.fromString("3e510cb9-1666-4676-9334-d288a56bf155"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_CONCEPT_VERSION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>7943a5f1-538b-4fda-8acb-019e0bec125b
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_STAMP_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_CONCEPT_VERSION_PATTERN = Pattern.make("PRIMORDIAL_CONCEPT_VERSION_PATTERN", UUID.fromString("7943a5f1-538b-4fda-8acb-019e0bec125b"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_DESCRIPTION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>a4de0039-2625-5842-8a4c-d1ce6aebf021
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_LANGUAGE_FOR_DESCRIPTION.
     * <li>Field 1 is a PRIMORDIAL_STRING_DISPLAY_FIELD that represents PRIMORDIAL_TEXT.
     * <li>Field 2 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_DESCRIPTION_CASE_SIGNIFICANCE.
     * <li>Field 3 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_DESCRIPTION_TYPE.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_DESCRIPTION_PATTERN = Pattern.make("PRIMORDIAL_DESCRIPTION_PATTERN", UUID.fromString("a4de0039-2625-5842-8a4c-d1ce6aebf021"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_GB_DIALECT_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>561f817a-130e-5e56-984d-910e9991558c
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_GB_ENGLISH_DIALECT_GB_ENGLISH.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_GB_DIALECT_PATTERN = Pattern.make("PRIMORDIAL_GB_DIALECT_PATTERN", UUID.fromString("561f817a-130e-5e56-984d-910e9991558c"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_IDENTIFIER_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>5d60e14b-c410-5172-9559-3c4253278ae2
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_IDENTIFIER_SOURCE.
     * <li>Field 1 is a PRIMORDIAL_STRING_DISPLAY_FIELD that represents PRIMORDIAL_IDENTIFIER_VALUE.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_IDENTIFIER_PATTERN = Pattern.make("PRIMORDIAL_IDENTIFIER_PATTERN", UUID.fromString("5d60e14b-c410-5172-9559-3c4253278ae2"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_INFERRED_DEFINITION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>9f011812-15c9-5b1b-85f8-bb262bc1b2a2
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_DITREE_DISPLAY_FIELD that represents PRIMORDIAL_EL_INFERRED_TERMINOLOGICAL_AXIOMS.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_INFERRED_DEFINITION_PATTERN = Pattern.make("PRIMORDIAL_INFERRED_DEFINITION_PATTERN", UUID.fromString("9f011812-15c9-5b1b-85f8-bb262bc1b2a2"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_INFERRED_NAVIGATION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>a53cc42d-c07e-5934-96b3-2ede3264474e
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_RELATIONSHIP_DESTINATION.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_RELATIONSHIP_ORIGIN.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_INFERRED_NAVIGATION_PATTERN = Pattern.make("PRIMORDIAL_INFERRED_NAVIGATION_PATTERN", UUID.fromString("a53cc42d-c07e-5934-96b3-2ede3264474e"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_ORIGINS_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>536b0ec4-4974-47ae-93a6-ae6c4d169780
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_ORIGINS.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_ORIGINS_PATTERN = Pattern.make("PRIMORDIAL_ORIGINS_PATTERN", UUID.fromString("536b0ec4-4974-47ae-93a6-ae6c4d169780"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_OWL_AXIOM_SYNTAX_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>c0ca180b-aae2-5fa1-9ab7-4a24f2dfe16b
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_STRING_DISPLAY_FIELD that represents PRIMORDIAL_AXIOM_SYNTAX.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_OWL_AXIOM_SYNTAX_PATTERN = Pattern.make("PRIMORDIAL_OWL_AXIOM_SYNTAX_PATTERN", UUID.fromString("c0ca180b-aae2-5fa1-9ab7-4a24f2dfe16b"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_PATH_ORIGINS_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>70f89dd5-2cdb-59bb-bbaa-98527513547c
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PATH_CONCEPT.
     * <li>Field 1 is a PRIMORDIAL_INSTANT_LITERAL that represents PRIMORDIAL_PATH_ORIGINS.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_PATH_ORIGINS_PATTERN = Pattern.make("PRIMORDIAL_PATH_ORIGINS_PATTERN", UUID.fromString("70f89dd5-2cdb-59bb-bbaa-98527513547c"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_PATTERN_CHRONOLOGY_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>5bc93adb-9d39-43fe-a7a4-1492245b7efb
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PUBLIC_ID_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_PATTERN_VERSIONS_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_PATTERN_CHRONOLOGY_PATTERN = Pattern.make("PRIMORDIAL_PATTERN_CHRONOLOGY_PATTERN", UUID.fromString("5bc93adb-9d39-43fe-a7a4-1492245b7efb"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_PATTERN_VERSION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>a90f8a4d-ae13-476b-98b8-814914f9704e
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_STAMP_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PATTERN_MEANING_FIELD.
     * <li>Field 2 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PATTERN_PURPOSE_FIELD.
     * <li>Field 3 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_FIELD_DEFINITION_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_PATTERN_VERSION_PATTERN = Pattern.make("PRIMORDIAL_PATTERN_VERSION_PATTERN", UUID.fromString("a90f8a4d-ae13-476b-98b8-814914f9704e"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_SEMANTIC_CHRONOLOGY_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>5f0ad6ca-638e-4052-82b0-3f564ac99b3f
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PUBLIC_ID_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_SEMANTIC_PATTERN_FIELD.
     * <li>Field 2 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_SEMANTIC_REFERENCED_COMPONENT_FIELD.
     * <li>Field 3 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_SEMANTIC_VERSIONS_SET.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_SEMANTIC_CHRONOLOGY_PATTERN = Pattern.make("PRIMORDIAL_SEMANTIC_CHRONOLOGY_PATTERN", UUID.fromString("5f0ad6ca-638e-4052-82b0-3f564ac99b3f"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_SEMANTIC_VERSION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>82f93e84-cee1-44bc-bb6d-4cc2a722048b
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_STAMP_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_SEMANTIC_FIELD_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_SEMANTIC_VERSION_PATTERN = Pattern.make("PRIMORDIAL_SEMANTIC_VERSION_PATTERN", UUID.fromString("82f93e84-cee1-44bc-bb6d-4cc2a722048b"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_SNOMED_TO_GMDN_SIMPLE_MAP_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>945f0b1c-a201-40c3-89fb-ca633d175378
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_GMDN_SIMPLE_MAP_TERM.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_SNOMED_TO_GMDN_SIMPLE_MAP_PATTERN = Pattern.make("PRIMORDIAL_SNOMED_TO_GMDN_SIMPLE_MAP_PATTERN", UUID.fromString("945f0b1c-a201-40c3-89fb-ca633d175378"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_SOLOR_CONCEPT_ASSEMBLAGE_SOLOR and identified by the following as UUID(s):
     * <ul>
     * <li>d39b3ecd-9a80-5009-a8ac-0b947f95ca7c
     * </ul>
     */
    public static final Pattern PRIMORDIAL_SOLOR_CONCEPT_ASSEMBLAGE_SOLOR = Pattern.make("PRIMORDIAL_SOLOR_CONCEPT_ASSEMBLAGE_SOLOR", UUID.fromString("d39b3ecd-9a80-5009-a8ac-0b947f95ca7c"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_STAMP_CHRONOLOGY_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>e16abc7a-2a7b-42af-b168-d77aec8116ea
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PUBLIC_ID_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_STAMP_VERSIONS_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_STAMP_CHRONOLOGY_PATTERN = Pattern.make("PRIMORDIAL_STAMP_CHRONOLOGY_PATTERN", UUID.fromString("e16abc7a-2a7b-42af-b168-d77aec8116ea"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_STAMP_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>9fd67fee-abf9-551d-9d0e-76a4b1e8b4ee
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_STATUS.
     * <li>Field 1 is a PRIMORDIAL_LONG that represents PRIMORDIAL_TIME_FOR_VERSION.
     * <li>Field 2 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_AUTHOR.
     * <li>Field 3 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_.
     * <li>Field 4 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PATH.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_STAMP_PATTERN = Pattern.make("PRIMORDIAL_STAMP_PATTERN", UUID.fromString("9fd67fee-abf9-551d-9d0e-76a4b1e8b4ee"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_STAMP_VERSION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>73c798cf-bc77-49a2-84f7-4c0f4bc4c012
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_STAMP_FIELD.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_STATUS_FIELD.
     * <li>Field 2 is a PRIMORDIAL_STRING_DISPLAY_FIELD that represents PRIMORDIAL_TIME_FIELD.
     * <li>Field 3 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_AUTHOR_FIELD.
     * <li>Field 4 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_FIELD.
     * <li>Field 5 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_PATH_FIELD.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_STAMP_VERSION_PATTERN = Pattern.make("PRIMORDIAL_STAMP_VERSION_PATTERN", UUID.fromString("73c798cf-bc77-49a2-84f7-4c0f4bc4c012"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_STATED_DEFINITION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>e813eb92-7d07-5035-8d43-e81249f5b36e
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_DITREE_DISPLAY_FIELD that represents PRIMORDIAL_EL_STATED_TERMINOLOGICAL_AXIOMS.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_STATED_DEFINITION_PATTERN = Pattern.make("PRIMORDIAL_STATED_DEFINITION_PATTERN", UUID.fromString("e813eb92-7d07-5035-8d43-e81249f5b36e"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_STATED_NAVIGATION_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>d02957d6-132d-5b3c-adba-505f5778d998
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_RELATIONSHIP_DESTINATION.
     * <li>Field 1 is a PRIMORDIAL_COMPONENT_ID_DISPLAY_SET that represents PRIMORDIAL_RELATIONSHIP_ORIGIN.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_STATED_NAVIGATION_PATTERN = Pattern.make("PRIMORDIAL_STATED_NAVIGATION_PATTERN", UUID.fromString("d02957d6-132d-5b3c-adba-505f5778d998"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_TINKAR_BASE_MODEL_COMPONENT_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>6070f6f5-893d-5144-adce-7d305c391cf9
     * </ul>
     */
    public static final Pattern PRIMORDIAL_TINKAR_BASE_MODEL_COMPONENT_PATTERN = Pattern.make("PRIMORDIAL_TINKAR_BASE_MODEL_COMPONENT_PATTERN", UUID.fromString("6070f6f5-893d-5144-adce-7d305c391cf9"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_US_DIALECT_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>08f9112c-c041-56d3-b89b-63258f070074
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_US_ENGLISH_DIALECT.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_US_DIALECT_PATTERN = Pattern.make("PRIMORDIAL_US_DIALECT_PATTERN", UUID.fromString("08f9112c-c041-56d3-b89b-63258f070074"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_VALUE_CONSTRAINT_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>922697f7-36ba-4afc-9dd5-f29d54b0fdec
     * </ul>
     * <p>
     * Pattern contains the following fields
     * <ul>
     * <li>Field 0 is a PRIMORDIAL_CONCEPT_DISPLAY_FIELD that represents PRIMORDIAL_VALUE_CONSTRAINT_SOURCE.
     * <li>Field 1 is a PRIMORDIAL_CONCEPT_DISPLAY_FIELD that represents PRIMORDIAL_MINIMUM_VALUE_OPERATOR_MINIMUM_DOMAIN_OPERATOR.
     * <li>Field 2 is a PRIMORDIAL_FLOAT_DISPLAY_FIELD that represents PRIMORDIAL_MINIMUM_VALUE_MIN_VALUE.
     * <li>Field 3 is a PRIMORDIAL_COMPONENT_DISPLAY_FIELD that represents PRIMORDIAL_MAXIMUM_VALUE_OPERATOR_MAXIMUM_DOMAIN_OPERATOR.
     * <li>Field 4 is a PRIMORDIAL_FLOAT_DISPLAY_FIELD that represents PRIMORDIAL_MAXIMUM_VALUE_MAX_VALUE.
     * <li>Field 5 is a PRIMORDIAL_STRING_DISPLAY_FIELD that represents PRIMORDIAL_EXAMPLE_UCUM_UNITS.
     * </ul>
     */
    public static final Pattern PRIMORDIAL_VALUE_CONSTRAINT_PATTERN = Pattern.make("PRIMORDIAL_VALUE_CONSTRAINT_PATTERN", UUID.fromString("922697f7-36ba-4afc-9dd5-f29d54b0fdec"));

    /**
     * Java binding for the pattern described as PRIMORDIAL_VERSION_CONTROL_PATH_PATTERN and identified by the following as UUID(s):
     * <ul>
     * <li>add1db57-72fe-53c8-a528-1614bda20ec6
     * </ul>
     */
    public static final Pattern PRIMORDIAL_VERSION_CONTROL_PATH_PATTERN = Pattern.make("PRIMORDIAL_VERSION_CONTROL_PATH_PATTERN", UUID.fromString("add1db57-72fe-53c8-a528-1614bda20ec6"));

    /**
     * Java binding for the concept described as PRIMORDIAL and identified by the following UUID(s):
     * <ul>
     * <li>c2012321-3903-532e-8a5f-b13e4ca46e86
     * </ul>
     */
    public static final Concept PRIMORDIAL = Concept.make("PRIMORDIAL", UUID.fromString("c2012321-3903-532e-8a5f-b13e4ca46e86"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ and identified by the following UUID(s):
     * <ul>
     * <li>40d1c869-b509-32f8-b735-836eac577a67
     * </ul>
     */
    public static final Concept PRIMORDIAL_ = Concept.make("PRIMORDIAL_", UUID.fromString("40d1c869-b509-32f8-b735-836eac577a67"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ACCEPTABLE and identified by the following UUID(s):
     * <ul>
     * <li>12b9e103-060e-3256-9982-18c1191af60e
     * </ul>
     */
    public static final Concept PRIMORDIAL_ACCEPTABLE = Concept.make("PRIMORDIAL_ACCEPTABLE", UUID.fromString("12b9e103-060e-3256-9982-18c1191af60e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ACTION_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>80ba281c-7d47-57cf-8100-82b69bce998b
     * </ul>
     */
    public static final Concept PRIMORDIAL_ACTION_PROPERTIES = Concept.make("PRIMORDIAL_ACTION_PROPERTIES", UUID.fromString("80ba281c-7d47-57cf-8100-82b69bce998b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ACTIVE and identified by the following UUID(s):
     * <ul>
     * <li>09f12001-0e4f-51e2-9852-44862a4a0db4
     * </ul>
     */
    public static final Concept PRIMORDIAL_ACTIVE = Concept.make("PRIMORDIAL_ACTIVE", UUID.fromString("09f12001-0e4f-51e2-9852-44862a4a0db4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ALLOWED_STATES and identified by the following UUID(s):
     * <ul>
     * <li>23f69f6f-a502-5876-a835-2b1b4d5ce91e
     * </ul>
     */
    public static final Concept PRIMORDIAL_ALLOWED_STATES = Concept.make("PRIMORDIAL_ALLOWED_STATES", UUID.fromString("23f69f6f-a502-5876-a835-2b1b4d5ce91e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AND and identified by the following UUID(s):
     * <ul>
     * <li>fa113d51-07d2-587c-8930-0bce207d506d
     * </ul>
     */
    public static final Concept PRIMORDIAL_AND = Concept.make("PRIMORDIAL_AND", UUID.fromString("fa113d51-07d2-587c-8930-0bce207d506d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ANNOTATION_PROPERTY_SET and identified by the following UUID(s):
     * <ul>
     * <li>cb9e33de-f82c-495d-89fa-69afecbcd47d
     * </ul>
     */
    public static final Concept PRIMORDIAL_ANNOTATION_PROPERTY_SET = Concept.make("PRIMORDIAL_ANNOTATION_PROPERTY_SET", UUID.fromString("cb9e33de-f82c-495d-89fa-69afecbcd47d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ANNOTATION_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>3fe77951-58c9-51b3-8e7e-65edcf7ace0a
     * </ul>
     */
    public static final Concept PRIMORDIAL_ANNOTATION_TYPE = Concept.make("PRIMORDIAL_ANNOTATION_TYPE", UUID.fromString("3fe77951-58c9-51b3-8e7e-65edcf7ace0a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ANONYMOUS_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>f8f936d4-3ac7-5629-9f65-9452608056a1
     * </ul>
     */
    public static final Concept PRIMORDIAL_ANONYMOUS_CONCEPT = Concept.make("PRIMORDIAL_ANONYMOUS_CONCEPT", UUID.fromString("f8f936d4-3ac7-5629-9f65-9452608056a1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ANY_COMPONENT and identified by the following UUID(s):
     * <ul>
     * <li>927da7ac-3403-5ccc-b07b-88f60cc3a5f8
     * </ul>
     */
    public static final Concept PRIMORDIAL_ANY_COMPONENT = Concept.make("PRIMORDIAL_ANY_COMPONENT", UUID.fromString("927da7ac-3403-5ccc-b07b-88f60cc3a5f8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ARRAY and identified by the following UUID(s):
     * <ul>
     * <li>318622e6-dd7a-5651-851d-2d5c2af85767
     * </ul>
     */
    public static final Concept PRIMORDIAL_ARRAY = Concept.make("PRIMORDIAL_ARRAY", UUID.fromString("318622e6-dd7a-5651-851d-2d5c2af85767"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ARRAY_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>b168ad04-f814-5036-b886-fd4913de88c8
     * </ul>
     */
    public static final Concept PRIMORDIAL_ARRAY_DISPLAY_FIELD = Concept.make("PRIMORDIAL_ARRAY_DISPLAY_FIELD", UUID.fromString("b168ad04-f814-5036-b886-fd4913de88c8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AUTHOR and identified by the following UUID(s):
     * <ul>
     * <li>f7495b58-6630-3499-a44e-2052b5fcf06c
     * </ul>
     */
    public static final Concept PRIMORDIAL_AUTHOR = Concept.make("PRIMORDIAL_AUTHOR", UUID.fromString("f7495b58-6630-3499-a44e-2052b5fcf06c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AUTHORS and identified by the following UUID(s):
     * <ul>
     * <li>4fda23b8-b016-5d2a-97d5-7ff779d60701
     * </ul>
     */
    public static final Concept PRIMORDIAL_AUTHORS = Concept.make("PRIMORDIAL_AUTHORS", UUID.fromString("4fda23b8-b016-5d2a-97d5-7ff779d60701"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AUTHOR_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>a9210ad6-cc48-47df-86e5-2192d56704a6
     * </ul>
     */
    public static final Concept PRIMORDIAL_AUTHOR_FIELD = Concept.make("PRIMORDIAL_AUTHOR_FIELD", UUID.fromString("a9210ad6-cc48-47df-86e5-2192d56704a6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AXIOMS and identified by the following UUID(s):
     * <ul>
     * <li>20746b91-521a-45a6-89da-0fe32384a67f
     * </ul>
     */
    public static final Concept PRIMORDIAL_AXIOMS = Concept.make("PRIMORDIAL_AXIOMS", UUID.fromString("20746b91-521a-45a6-89da-0fe32384a67f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AXIOM_ATTACHMENT_ORDER and identified by the following UUID(s):
     * <ul>
     * <li>abcb0946-20e1-5483-8469-3e8fa0ce20c4
     * </ul>
     */
    public static final Concept PRIMORDIAL_AXIOM_ATTACHMENT_ORDER = Concept.make("PRIMORDIAL_AXIOM_ATTACHMENT_ORDER", UUID.fromString("abcb0946-20e1-5483-8469-3e8fa0ce20c4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AXIOM_FOCUS and identified by the following UUID(s):
     * <ul>
     * <li>9c6fbddd-58bd-5881-b926-c813bbff849b
     * </ul>
     */
    public static final Concept PRIMORDIAL_AXIOM_FOCUS = Concept.make("PRIMORDIAL_AXIOM_FOCUS", UUID.fromString("9c6fbddd-58bd-5881-b926-c813bbff849b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AXIOM_ORIGIN and identified by the following UUID(s):
     * <ul>
     * <li>b868bd83-5cd4-5d84-9cf7-b08674fbc79b
     * </ul>
     */
    public static final Concept PRIMORDIAL_AXIOM_ORIGIN = Concept.make("PRIMORDIAL_AXIOM_ORIGIN", UUID.fromString("b868bd83-5cd4-5d84-9cf7-b08674fbc79b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_AXIOM_SYNTAX and identified by the following UUID(s):
     * <ul>
     * <li>8da1c508-c2a2-4899-b26d-87f8b98a7558
     * </ul>
     */
    public static final Concept PRIMORDIAL_AXIOM_SYNTAX = Concept.make("PRIMORDIAL_AXIOM_SYNTAX", UUID.fromString("8da1c508-c2a2-4899-b26d-87f8b98a7558"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BLANK_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>cd23d88d-2fcd-4007-8829-97e37bf336aa
     * </ul>
     */
    public static final Concept PRIMORDIAL_BLANK_CONCEPT = Concept.make("PRIMORDIAL_BLANK_CONCEPT", UUID.fromString("cd23d88d-2fcd-4007-8829-97e37bf336aa"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BOOLEAN and identified by the following UUID(s):
     * <ul>
     * <li>08f2fb74-980d-5157-b92c-4ff1eac6a506
     * </ul>
     */
    public static final Concept PRIMORDIAL_BOOLEAN = Concept.make("PRIMORDIAL_BOOLEAN", UUID.fromString("08f2fb74-980d-5157-b92c-4ff1eac6a506"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BOOLEAN_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>d6b9e2cc-31c6-5e80-91b7-7537690aae32
     * </ul>
     */
    public static final Concept PRIMORDIAL_BOOLEAN_DISPLAY_FIELD = Concept.make("PRIMORDIAL_BOOLEAN_DISPLAY_FIELD", UUID.fromString("d6b9e2cc-31c6-5e80-91b7-7537690aae32"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BOOLEAN_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>4229683e-8772-4936-abd5-edc5a180f4d1
     * </ul>
     */
    public static final Concept PRIMORDIAL_BOOLEAN_FIELD = Concept.make("PRIMORDIAL_BOOLEAN_FIELD", UUID.fromString("4229683e-8772-4936-abd5-edc5a180f4d1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BOOLEAN_LITERAL and identified by the following UUID(s):
     * <ul>
     * <li>49f41695-66a7-5471-846d-21c168f54c19
     * </ul>
     */
    public static final Concept PRIMORDIAL_BOOLEAN_LITERAL = Concept.make("PRIMORDIAL_BOOLEAN_LITERAL", UUID.fromString("49f41695-66a7-5471-846d-21c168f54c19"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BOOLEAN_REFERENCE and identified by the following UUID(s):
     * <ul>
     * <li>de49d207-a26e-5f8a-b905-953a4dd13c21
     * </ul>
     */
    public static final Concept PRIMORDIAL_BOOLEAN_REFERENCE = Concept.make("PRIMORDIAL_BOOLEAN_REFERENCE", UUID.fromString("de49d207-a26e-5f8a-b905-953a4dd13c21"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BOOLEAN_SUBSTITUTION and identified by the following UUID(s):
     * <ul>
     * <li>03559f9d-f1e4-5485-894b-4d457f145d54
     * </ul>
     */
    public static final Concept PRIMORDIAL_BOOLEAN_SUBSTITUTION = Concept.make("PRIMORDIAL_BOOLEAN_SUBSTITUTION", UUID.fromString("03559f9d-f1e4-5485-894b-4d457f145d54"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BYTE_ARRAY and identified by the following UUID(s):
     * <ul>
     * <li>9a84fecf-708d-5de4-9c5f-e17973229e0f
     * </ul>
     */
    public static final Concept PRIMORDIAL_BYTE_ARRAY = Concept.make("PRIMORDIAL_BYTE_ARRAY", UUID.fromString("9a84fecf-708d-5de4-9c5f-e17973229e0f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_BYTE_ARRAY_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>dbdd8df2-aec3-596b-88fc-7b83b5594a45
     * </ul>
     */
    public static final Concept PRIMORDIAL_BYTE_ARRAY_DISPLAY_FIELD = Concept.make("PRIMORDIAL_BYTE_ARRAY_DISPLAY_FIELD", UUID.fromString("dbdd8df2-aec3-596b-88fc-7b83b5594a45"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CANCELED and identified by the following UUID(s):
     * <ul>
     * <li>b42c1948-7645-5da8-a888-de6ec020ab98
     * </ul>
     */
    public static final Concept PRIMORDIAL_CANCELED = Concept.make("PRIMORDIAL_CANCELED", UUID.fromString("b42c1948-7645-5da8-a888-de6ec020ab98"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CASE_INSENSITIVE and identified by the following UUID(s):
     * <ul>
     * <li>ecea41a2-f596-3d98-99d1-771b667e55b8
     * </ul>
     */
    public static final Concept PRIMORDIAL_CASE_INSENSITIVE = Concept.make("PRIMORDIAL_CASE_INSENSITIVE", UUID.fromString("ecea41a2-f596-3d98-99d1-771b667e55b8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CASE_SENSITIVE and identified by the following UUID(s):
     * <ul>
     * <li>0def37bc-7e1b-384b-a6a3-3e3ceee9c52e
     * </ul>
     */
    public static final Concept PRIMORDIAL_CASE_SENSITIVE = Concept.make("PRIMORDIAL_CASE_SENSITIVE", UUID.fromString("0def37bc-7e1b-384b-a6a3-3e3ceee9c52e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CASE_SIGNIFICANCE and identified by the following UUID(s):
     * <ul>
     * <li>57271621-3f3c-58dd-8148-2674bc11b7e5
     * </ul>
     */
    public static final Concept PRIMORDIAL_CASE_SIGNIFICANCE = Concept.make("PRIMORDIAL_CASE_SIGNIFICANCE", UUID.fromString("57271621-3f3c-58dd-8148-2674bc11b7e5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CHINESE_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>aacbc859-e9a0-5e01-b6a9-9a255a47b0c9
     * <li>ba2efe6b-fe56-3d91-ae0f-3b389628f74c
     * <li>45022532-9567-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_CHINESE_LANGUAGE = Concept.make("PRIMORDIAL_CHINESE_LANGUAGE", UUID.fromString("aacbc859-e9a0-5e01-b6a9-9a255a47b0c9"), UUID.fromString("ba2efe6b-fe56-3d91-ae0f-3b389628f74c"), UUID.fromString("45022532-9567-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CHRONICLE_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>2ba2ef47-30af-57ec-9073-38693f020d7e
     * </ul>
     */
    public static final Concept PRIMORDIAL_CHRONICLE_PROPERTIES = Concept.make("PRIMORDIAL_CHRONICLE_PROPERTIES", UUID.fromString("2ba2ef47-30af-57ec-9073-38693f020d7e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CLASSIFIER and identified by the following UUID(s):
     * <ul>
     * <li>4b90e89d-2a0e-5ca3-8ae5-7498d148a9d2
     * </ul>
     */
    public static final Concept PRIMORDIAL_CLASSIFIER = Concept.make("PRIMORDIAL_CLASSIFIER", UUID.fromString("4b90e89d-2a0e-5ca3-8ae5-7498d148a9d2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMMENT and identified by the following UUID(s):
     * <ul>
     * <li>147832d4-b9b8-5062-8891-19f9c4e4760a
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMMENT = Concept.make("PRIMORDIAL_COMMENT", UUID.fromString("147832d4-b9b8-5062-8891-19f9c4e4760a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPARE_CASE and identified by the following UUID(s):
     * <ul>
     * <li>a95e5dbc-a179-57f9-9cdd-6de8c026396d
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPARE_CASE = Concept.make("PRIMORDIAL_COMPARE_CASE", UUID.fromString("a95e5dbc-a179-57f9-9cdd-6de8c026396d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT and identified by the following UUID(s):
     * <ul>
     * <li>0bc32c16-698e-5719-8bd5-efa099c7d782
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT = Concept.make("PRIMORDIAL_COMPONENT", UUID.fromString("0bc32c16-698e-5719-8bd5-efa099c7d782"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>fb00d132-fcc3-5cbf-881d-4bcc4b4c91b3
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_DISPLAY_FIELD = Concept.make("PRIMORDIAL_COMPONENT_DISPLAY_FIELD", UUID.fromString("fb00d132-fcc3-5cbf-881d-4bcc4b4c91b3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>8bd36a0c-d05d-46b7-a79a-d11477705cc1
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_FIELD = Concept.make("PRIMORDIAL_COMPONENT_FIELD", UUID.fromString("8bd36a0c-d05d-46b7-a79a-d11477705cc1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_ID_DISPLAY_LIST and identified by the following UUID(s):
     * <ul>
     * <li>e553d3f1-63e1-4292-a3a9-af646fe44292
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_ID_DISPLAY_LIST = Concept.make("PRIMORDIAL_COMPONENT_ID_DISPLAY_LIST", UUID.fromString("e553d3f1-63e1-4292-a3a9-af646fe44292"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_ID_DISPLAY_SET and identified by the following UUID(s):
     * <ul>
     * <li>e283af51-2e8f-44fa-9bf1-89a99a7c7631
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_ID_DISPLAY_SET = Concept.make("PRIMORDIAL_COMPONENT_ID_DISPLAY_SET", UUID.fromString("e283af51-2e8f-44fa-9bf1-89a99a7c7631"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_SEMANTIC and identified by the following UUID(s):
     * <ul>
     * <li>127e7274-0b88-5519-a9db-85d4b9ce6a4a
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_SEMANTIC = Concept.make("PRIMORDIAL_COMPONENT_SEMANTIC", UUID.fromString("127e7274-0b88-5519-a9db-85d4b9ce6a4a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_TYPE_FOCUS and identified by the following UUID(s):
     * <ul>
     * <li>f1f179d0-26af-5123-9b29-9fc6cd01dd29
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_TYPE_FOCUS = Concept.make("PRIMORDIAL_COMPONENT_TYPE_FOCUS", UUID.fromString("f1f179d0-26af-5123-9b29-9fc6cd01dd29"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_VERSIONS_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>1a852426-422a-48db-a618-c906ac4c8e6c
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_VERSIONS_FIELD = Concept.make("PRIMORDIAL_COMPONENT_VERSIONS_FIELD", UUID.fromString("1a852426-422a-48db-a618-c906ac4c8e6c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_COMPONENT_VERSIONS_SET and identified by the following UUID(s):
     * <ul>
     * <li>54d670f1-234d-485a-a354-e1fa7eea1bf2
     * </ul>
     */
    public static final Concept PRIMORDIAL_COMPONENT_VERSIONS_SET = Concept.make("PRIMORDIAL_COMPONENT_VERSIONS_SET", UUID.fromString("54d670f1-234d-485a-a354-e1fa7eea1bf2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPTS_TO_CLASSIFY and identified by the following UUID(s):
     * <ul>
     * <li>16486419-5d1c-574f-bde6-21910ad66f44
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPTS_TO_CLASSIFY = Concept.make("PRIMORDIAL_CONCEPTS_TO_CLASSIFY", UUID.fromString("16486419-5d1c-574f-bde6-21910ad66f44"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_ATTACHMENT_ORDER and identified by the following UUID(s):
     * <ul>
     * <li>6167efcb-50e8-534d-9827-fdd60b02ae00
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_ATTACHMENT_ORDER = Concept.make("PRIMORDIAL_CONCEPT_ATTACHMENT_ORDER", UUID.fromString("6167efcb-50e8-534d-9827-fdd60b02ae00"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_CONSTRAINTS and identified by the following UUID(s):
     * <ul>
     * <li>081273cd-92dd-593c-9d9b-63d33838e70b
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_CONSTRAINTS = Concept.make("PRIMORDIAL_CONCEPT_CONSTRAINTS", UUID.fromString("081273cd-92dd-593c-9d9b-63d33838e70b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_DETAILS_TREE_TABLE and identified by the following UUID(s):
     * <ul>
     * <li>1655edd8-7b73-52c5-98b0-263d1ab3a90b
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_DETAILS_TREE_TABLE = Concept.make("PRIMORDIAL_CONCEPT_DETAILS_TREE_TABLE", UUID.fromString("1655edd8-7b73-52c5-98b0-263d1ab3a90b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>ac8f1f54-c7c6-5fc7-b1a8-ebb04b918557
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_DISPLAY_FIELD = Concept.make("PRIMORDIAL_CONCEPT_DISPLAY_FIELD", UUID.fromString("ac8f1f54-c7c6-5fc7-b1a8-ebb04b918557"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>ebe2aa74-f100-41b2-8d75-2d8f06ce5e4e
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_FIELD = Concept.make("PRIMORDIAL_CONCEPT_FIELD", UUID.fromString("ebe2aa74-f100-41b2-8d75-2d8f06ce5e4e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_FOCUS and identified by the following UUID(s):
     * <ul>
     * <li>dca9854d-9e4c-5e8a-8b30-6c1af6901bb8
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_FOCUS = Concept.make("PRIMORDIAL_CONCEPT_FOCUS", UUID.fromString("dca9854d-9e4c-5e8a-8b30-6c1af6901bb8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_REFERENCE and identified by the following UUID(s):
     * <ul>
     * <li>e89148c7-4fe2-52f8-abb9-6a53605d20cb
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_REFERENCE = Concept.make("PRIMORDIAL_CONCEPT_REFERENCE", UUID.fromString("e89148c7-4fe2-52f8-abb9-6a53605d20cb"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_SEMANTIC and identified by the following UUID(s):
     * <ul>
     * <li>fbf054fb-ceaf-5ab8-b946-bbcc4835ce07
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_SEMANTIC = Concept.make("PRIMORDIAL_CONCEPT_SEMANTIC", UUID.fromString("fbf054fb-ceaf-5ab8-b946-bbcc4835ce07"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_SUBSTITUTION and identified by the following UUID(s):
     * <ul>
     * <li>23483990-b738-5f43-bc03-befd43928a37
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_SUBSTITUTION = Concept.make("PRIMORDIAL_CONCEPT_SUBSTITUTION", UUID.fromString("23483990-b738-5f43-bc03-befd43928a37"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_TO_FIND and identified by the following UUID(s):
     * <ul>
     * <li>91687b29-3bbb-540b-9de6-91246c75afd0
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_TO_FIND = Concept.make("PRIMORDIAL_CONCEPT_TO_FIND", UUID.fromString("91687b29-3bbb-540b-9de6-91246c75afd0"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>106f3ba1-63b8-5596-8dbe-524fa2e89fc0
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_TYPE = Concept.make("PRIMORDIAL_CONCEPT_TYPE", UUID.fromString("106f3ba1-63b8-5596-8dbe-524fa2e89fc0"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_VERSIONS_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>3a08b5f1-f17e-4db5-8cf9-c6540f26f241
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_VERSIONS_FIELD = Concept.make("PRIMORDIAL_CONCEPT_VERSIONS_FIELD", UUID.fromString("3a08b5f1-f17e-4db5-8cf9-c6540f26f241"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCEPT_VERSIONS_SET and identified by the following UUID(s):
     * <ul>
     * <li>806c7f9f-52f9-4b53-9758-122899b28a76
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCEPT_VERSIONS_SET = Concept.make("PRIMORDIAL_CONCEPT_VERSIONS_SET", UUID.fromString("806c7f9f-52f9-4b53-9758-122899b28a76"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONCRETE_VALUE_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>843b0b55-8785-5544-93f6-581da9cf1ff3
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONCRETE_VALUE_OPERATOR = Concept.make("PRIMORDIAL_CONCRETE_VALUE_OPERATOR", UUID.fromString("843b0b55-8785-5544-93f6-581da9cf1ff3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONDITIONAL_TRIGGERS and identified by the following UUID(s):
     * <ul>
     * <li>a3e4ac54-db82-5345-8713-7e0da98bbb0a
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONDITIONAL_TRIGGERS = Concept.make("PRIMORDIAL_CONDITIONAL_TRIGGERS", UUID.fromString("a3e4ac54-db82-5345-8713-7e0da98bbb0a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CONNECTIVE_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>3fdcaadc-d972-58e9-84f1-b3a39903b076
     * </ul>
     */
    public static final Concept PRIMORDIAL_CONNECTIVE_OPERATOR = Concept.make("PRIMORDIAL_CONNECTIVE_OPERATOR", UUID.fromString("3fdcaadc-d972-58e9-84f1-b3a39903b076"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CORRELATION_EXPRESSION and identified by the following UUID(s):
     * <ul>
     * <li>1711815f-99a1-5d1a-8f1e-75dc7bf41928
     * </ul>
     */
    public static final Concept PRIMORDIAL_CORRELATION_EXPRESSION = Concept.make("PRIMORDIAL_CORRELATION_EXPRESSION", UUID.fromString("1711815f-99a1-5d1a-8f1e-75dc7bf41928"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CORRELATION_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>8f682e00-3d9e-5506-bd19-b2169d6c8752
     * </ul>
     */
    public static final Concept PRIMORDIAL_CORRELATION_PROPERTIES = Concept.make("PRIMORDIAL_CORRELATION_PROPERTIES", UUID.fromString("8f682e00-3d9e-5506-bd19-b2169d6c8752"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CORRELATION_REFERENCE_EXPRESSION and identified by the following UUID(s):
     * <ul>
     * <li>acb73d95-7c96-590c-9f24-23da54f95ff2
     * </ul>
     */
    public static final Concept PRIMORDIAL_CORRELATION_REFERENCE_EXPRESSION = Concept.make("PRIMORDIAL_CORRELATION_REFERENCE_EXPRESSION", UUID.fromString("acb73d95-7c96-590c-9f24-23da54f95ff2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CREATIVE_COMMONS_BY_LICENSE and identified by the following UUID(s):
     * <ul>
     * <li>3415a972-7850-57cd-aa86-a572ca1c2ceb
     * </ul>
     */
    public static final Concept PRIMORDIAL_CREATIVE_COMMONS_BY_LICENSE = Concept.make("PRIMORDIAL_CREATIVE_COMMONS_BY_LICENSE", UUID.fromString("3415a972-7850-57cd-aa86-a572ca1c2ceb"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CZECH_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>6979e268-0b59-542f-bac0-313c5ddf6a2e
     * </ul>
     */
    public static final Concept PRIMORDIAL_CZECH_DIALECT = Concept.make("PRIMORDIAL_CZECH_DIALECT", UUID.fromString("6979e268-0b59-542f-bac0-313c5ddf6a2e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_CZECH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>33aa2d26-0541-557c-b796-904cbf245101
     * </ul>
     */
    public static final Concept PRIMORDIAL_CZECH_LANGUAGE = Concept.make("PRIMORDIAL_CZECH_LANGUAGE", UUID.fromString("33aa2d26-0541-557c-b796-904cbf245101"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DANISH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>987681fb-f3ef-595d-90e2-067baf2bc71f
     * <li>45021f10-9567-11e5-8994-feff819cdc9f
     * <li>7e462e33-6d94-38ae-a044-492a857a6853
     * </ul>
     */
    public static final Concept PRIMORDIAL_DANISH_LANGUAGE = Concept.make("PRIMORDIAL_DANISH_LANGUAGE", UUID.fromString("987681fb-f3ef-595d-90e2-067baf2bc71f"), UUID.fromString("45021f10-9567-11e5-8994-feff819cdc9f"), UUID.fromString("7e462e33-6d94-38ae-a044-492a857a6853"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DATA_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>ae7069d1-67fa-4470-a56f-0d24a8fcea83
     * </ul>
     */
    public static final Concept PRIMORDIAL_DATA_CONCEPT = Concept.make("PRIMORDIAL_DATA_CONCEPT", UUID.fromString("ae7069d1-67fa-4470-a56f-0d24a8fcea83"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DATA_PROPERTY_SET and identified by the following UUID(s):
     * <ul>
     * <li>6b8ed642-de72-4aee-953d-42e5db92c0ab
     * </ul>
     */
    public static final Concept PRIMORDIAL_DATA_PROPERTY_SET = Concept.make("PRIMORDIAL_DATA_PROPERTY_SET", UUID.fromString("6b8ed642-de72-4aee-953d-42e5db92c0ab"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DATA_PROPERTY_SET_AXIOMS and identified by the following UUID(s):
     * <ul>
     * <li>1402d311-0b4b-4014-81d2-e715c6696346
     * </ul>
     */
    public static final Concept PRIMORDIAL_DATA_PROPERTY_SET_AXIOMS = Concept.make("PRIMORDIAL_DATA_PROPERTY_SET_AXIOMS", UUID.fromString("1402d311-0b4b-4014-81d2-e715c6696346"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DECIMAL and identified by the following UUID(s):
     * <ul>
     * <li>dccb0476-3b63-3d48-b5a2-85bd0ad2fa61
     * </ul>
     */
    public static final Concept PRIMORDIAL_DECIMAL = Concept.make("PRIMORDIAL_DECIMAL", UUID.fromString("dccb0476-3b63-3d48-b5a2-85bd0ad2fa61"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DECIMAL_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>b413fe94-4ada-4aee-96f9-22be19699d40
     * </ul>
     */
    public static final Concept PRIMORDIAL_DECIMAL_DISPLAY_FIELD = Concept.make("PRIMORDIAL_DECIMAL_DISPLAY_FIELD", UUID.fromString("b413fe94-4ada-4aee-96f9-22be19699d40"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DEFAULT and identified by the following UUID(s):
     * <ul>
     * <li>e83d322c-e275-5392-a5db-1de5fe98acb5
     * </ul>
     */
    public static final Concept PRIMORDIAL_DEFAULT = Concept.make("PRIMORDIAL_DEFAULT", UUID.fromString("e83d322c-e275-5392-a5db-1de5fe98acb5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DEFAULT_DATA_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>4a32d2ad-baca-42b5-a432-4c4ae6431668
     * </ul>
     */
    public static final Concept PRIMORDIAL_DEFAULT_DATA_CONCEPT = Concept.make("PRIMORDIAL_DEFAULT_DATA_CONCEPT", UUID.fromString("4a32d2ad-baca-42b5-a432-4c4ae6431668"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>700546a3-09c7-3fc2-9eb9-53d318659a09
     * </ul>
     */
    public static final Concept PRIMORDIAL_DEFINITION = Concept.make("PRIMORDIAL_DEFINITION", UUID.fromString("700546a3-09c7-3fc2-9eb9-53d318659a09"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DEFINITION_ROOT and identified by the following UUID(s):
     * <ul>
     * <li>e7271c01-6ed4-5240-963f-34d1f24153b0
     * </ul>
     */
    public static final Concept PRIMORDIAL_DEFINITION_ROOT = Concept.make("PRIMORDIAL_DEFINITION_ROOT", UUID.fromString("e7271c01-6ed4-5240-963f-34d1f24153b0"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION and identified by the following UUID(s):
     * <ul>
     * <li>87118daf-d28c-55fb-8657-cd6bc8425600
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION = Concept.make("PRIMORDIAL_DESCRIPTION", UUID.fromString("87118daf-d28c-55fb-8657-cd6bc8425600"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_ACCEPTABILITY and identified by the following UUID(s):
     * <ul>
     * <li>96b61063-0d29-5aea-9652-3f5f328aadc3
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_ACCEPTABILITY = Concept.make("PRIMORDIAL_DESCRIPTION_ACCEPTABILITY", UUID.fromString("96b61063-0d29-5aea-9652-3f5f328aadc3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_ATTACHMENT_ORDER and identified by the following UUID(s):
     * <ul>
     * <li>69ee3f13-e2ba-5a96-9b91-5eecfad8e587
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_ATTACHMENT_ORDER = Concept.make("PRIMORDIAL_DESCRIPTION_ATTACHMENT_ORDER", UUID.fromString("69ee3f13-e2ba-5a96-9b91-5eecfad8e587"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_CASE_SIGNIFICANCE and identified by the following UUID(s):
     * <ul>
     * <li>c3dde9ea-b144-5f49-845a-20cc7d305250
     * <li>f30b0312-2c85-3e65-8609-2d89f8437d34
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_CASE_SIGNIFICANCE = Concept.make("PRIMORDIAL_DESCRIPTION_CASE_SIGNIFICANCE", UUID.fromString("c3dde9ea-b144-5f49-845a-20cc7d305250"), UUID.fromString("f30b0312-2c85-3e65-8609-2d89f8437d34"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_CORE_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>351955ff-30f4-5806-a0a5-5dda79756377
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_CORE_TYPE = Concept.make("PRIMORDIAL_DESCRIPTION_CORE_TYPE", UUID.fromString("351955ff-30f4-5806-a0a5-5dda79756377"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_DIALECT_PAIR and identified by the following UUID(s):
     * <ul>
     * <li>a27bbbf8-57b5-590c-8650-1247f6f963eb
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_DIALECT_PAIR = Concept.make("PRIMORDIAL_DESCRIPTION_DIALECT_PAIR", UUID.fromString("a27bbbf8-57b5-590c-8650-1247f6f963eb"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_FOCUS and identified by the following UUID(s):
     * <ul>
     * <li>6edf734d-7f57-5430-9164-6ee0824fd94b
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_FOCUS = Concept.make("PRIMORDIAL_DESCRIPTION_FOCUS", UUID.fromString("6edf734d-7f57-5430-9164-6ee0824fd94b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_FOR_DIALECT_DESCRIPTION_PAIR and identified by the following UUID(s):
     * <ul>
     * <li>1137767a-ad8b-5bc5-9842-a1f9b09d1ecc
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_FOR_DIALECT_DESCRIPTION_PAIR = Concept.make("PRIMORDIAL_DESCRIPTION_FOR_DIALECT_DESCRIPTION_PAIR", UUID.fromString("1137767a-ad8b-5bc5-9842-a1f9b09d1ecc"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_LIST_FOR_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>ab3e8771-7c7c-5e57-8acf-147b16da36e2
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_LIST_FOR_CONCEPT = Concept.make("PRIMORDIAL_DESCRIPTION_LIST_FOR_CONCEPT", UUID.fromString("ab3e8771-7c7c-5e57-8acf-147b16da36e2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_LOGIC_PROFILE and identified by the following UUID(s):
     * <ul>
     * <li>14eadb10-fbd0-5999-af37-05728a8503af
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_LOGIC_PROFILE = Concept.make("PRIMORDIAL_DESCRIPTION_LOGIC_PROFILE", UUID.fromString("14eadb10-fbd0-5999-af37-05728a8503af"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_SEMANTIC and identified by the following UUID(s):
     * <ul>
     * <li>81487d5f-6115-51e2-a3b3-93d783888eb8
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_SEMANTIC = Concept.make("PRIMORDIAL_DESCRIPTION_SEMANTIC", UUID.fromString("81487d5f-6115-51e2-a3b3-93d783888eb8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>a00c5ad7-5b8a-5592-a28c-64057dd3caab
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_TYPE = Concept.make("PRIMORDIAL_DESCRIPTION_TYPE", UUID.fromString("a00c5ad7-5b8a-5592-a28c-64057dd3caab"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESCRIPTION_VERSION_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>732aad24-4add-59d6-bbc9-840a8b9dc754
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESCRIPTION_VERSION_PROPERTIES = Concept.make("PRIMORDIAL_DESCRIPTION_VERSION_PROPERTIES", UUID.fromString("732aad24-4add-59d6-bbc9-840a8b9dc754"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DESTINATION and identified by the following UUID(s):
     * <ul>
     * <li>349cfd1d-10fd-5f8d-a0a5-d5ef0932b4da
     * </ul>
     */
    public static final Concept PRIMORDIAL_DESTINATION = Concept.make("PRIMORDIAL_DESTINATION", UUID.fromString("349cfd1d-10fd-5f8d-a0a5-d5ef0932b4da"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DEVELOPMENT and identified by the following UUID(s):
     * <ul>
     * <li>529a7069-bd33-59e6-b2ce-537fa874360a
     * </ul>
     */
    public static final Concept PRIMORDIAL_DEVELOPMENT = Concept.make("PRIMORDIAL_DEVELOPMENT", UUID.fromString("529a7069-bd33-59e6-b2ce-537fa874360a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DEVELOPMENT_PATH and identified by the following UUID(s):
     * <ul>
     * <li>1f200ca6-960e-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_DEVELOPMENT_PATH = Concept.make("PRIMORDIAL_DEVELOPMENT_PATH", UUID.fromString("1f200ca6-960e-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>b9c34574-c9ac-503b-aa24-456a0ec949a2
     * </ul>
     */
    public static final Concept PRIMORDIAL_DIALECT = Concept.make("PRIMORDIAL_DIALECT", UUID.fromString("b9c34574-c9ac-503b-aa24-456a0ec949a2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DIALECT_FOR_DIALECT_DESCRIPTION_PAIR and identified by the following UUID(s):
     * <ul>
     * <li>850bc47d-5235-5bce-99f4-c41f8a163d69
     * </ul>
     */
    public static final Concept PRIMORDIAL_DIALECT_FOR_DIALECT_DESCRIPTION_PAIR = Concept.make("PRIMORDIAL_DIALECT_FOR_DIALECT_DESCRIPTION_PAIR", UUID.fromString("850bc47d-5235-5bce-99f4-c41f8a163d69"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DIALECT_ORDER and identified by the following UUID(s):
     * <ul>
     * <li>c060ffbf-e95f-5960-b296-8a3255c820ac
     * </ul>
     */
    public static final Concept PRIMORDIAL_DIALECT_ORDER = Concept.make("PRIMORDIAL_DIALECT_ORDER", UUID.fromString("c060ffbf-e95f-5960-b296-8a3255c820ac"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DIGRAPH and identified by the following UUID(s):
     * <ul>
     * <li>1cdacc80-0dea-580f-a77b-8a6b273eb673
     * </ul>
     */
    public static final Concept PRIMORDIAL_DIGRAPH = Concept.make("PRIMORDIAL_DIGRAPH", UUID.fromString("1cdacc80-0dea-580f-a77b-8a6b273eb673"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DIGRAPH_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>60113dfe-2bad-11eb-adc1-0242ac120002
     * </ul>
     */
    public static final Concept PRIMORDIAL_DIGRAPH_DISPLAY_FIELD = Concept.make("PRIMORDIAL_DIGRAPH_DISPLAY_FIELD", UUID.fromString("60113dfe-2bad-11eb-adc1-0242ac120002"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DISJOINT_WITH and identified by the following UUID(s):
     * <ul>
     * <li>f8433993-9a2d-5377-b564-80a45c7b7824
     * </ul>
     */
    public static final Concept PRIMORDIAL_DISJOINT_WITH = Concept.make("PRIMORDIAL_DISJOINT_WITH", UUID.fromString("f8433993-9a2d-5377-b564-80a45c7b7824"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DISPLAY_FIELDS and identified by the following UUID(s):
     * <ul>
     * <li>4e627b9c-cecb-5563-82fc-cb0ee25113b1
     * </ul>
     */
    public static final Concept PRIMORDIAL_DISPLAY_FIELDS = Concept.make("PRIMORDIAL_DISPLAY_FIELDS", UUID.fromString("4e627b9c-cecb-5563-82fc-cb0ee25113b1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DITREE_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>32f64fc6-5371-11eb-ae93-0242ac130002
     * </ul>
     */
    public static final Concept PRIMORDIAL_DITREE_DISPLAY_FIELD = Concept.make("PRIMORDIAL_DITREE_DISPLAY_FIELD", UUID.fromString("32f64fc6-5371-11eb-ae93-0242ac130002"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DOUBLE and identified by the following UUID(s):
     * <ul>
     * <li>7172e6ac-a05a-5a34-8275-aef430b18207
     * </ul>
     */
    public static final Concept PRIMORDIAL_DOUBLE = Concept.make("PRIMORDIAL_DOUBLE", UUID.fromString("7172e6ac-a05a-5a34-8275-aef430b18207"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DOUBLE_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>85ff6e8f-9151-5428-a5f0-e07844b69260
     * </ul>
     */
    public static final Concept PRIMORDIAL_DOUBLE_DISPLAY_FIELD = Concept.make("PRIMORDIAL_DOUBLE_DISPLAY_FIELD", UUID.fromString("85ff6e8f-9151-5428-a5f0-e07844b69260"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DUTCH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>21d11bd1-3dab-5034-9625-81b9ae2bd8e7
     * <li>45022280-9567-11e5-8994-feff819cdc9f
     * <li>674ad858-0224-3f90-bcf0-bc4cab753d2d
     * </ul>
     */
    public static final Concept PRIMORDIAL_DUTCH_LANGUAGE = Concept.make("PRIMORDIAL_DUTCH_LANGUAGE", UUID.fromString("21d11bd1-3dab-5034-9625-81b9ae2bd8e7"), UUID.fromString("45022280-9567-11e5-8994-feff819cdc9f"), UUID.fromString("674ad858-0224-3f90-bcf0-bc4cab753d2d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DYNAMIC_COLUMN_DATA_TYPES and identified by the following UUID(s):
     * <ul>
     * <li>61da7e50-f606-5ba0-a0df-83fd524951e7
     * </ul>
     */
    public static final Concept PRIMORDIAL_DYNAMIC_COLUMN_DATA_TYPES = Concept.make("PRIMORDIAL_DYNAMIC_COLUMN_DATA_TYPES", UUID.fromString("61da7e50-f606-5ba0-a0df-83fd524951e7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_DYNAMIC_REFERENCED_COMPONENT_RESTRICTION and identified by the following UUID(s):
     * <ul>
     * <li>0d94ceeb-e24f-5f1a-84b2-1ac35f671db5
     * </ul>
     */
    public static final Concept PRIMORDIAL_DYNAMIC_REFERENCED_COMPONENT_RESTRICTION = Concept.make("PRIMORDIAL_DYNAMIC_REFERENCED_COMPONENT_RESTRICTION", UUID.fromString("0d94ceeb-e24f-5f1a-84b2-1ac35f671db5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_DIGRAPH and identified by the following UUID(s):
     * <ul>
     * <li>ee04d7db-3407-568f-9b93-7b1f9f5bb0fc
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_DIGRAPH = Concept.make("PRIMORDIAL_EL_DIGRAPH", UUID.fromString("ee04d7db-3407-568f-9b93-7b1f9f5bb0fc"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_INFERRED_CONCEPT_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>b2897aa0-a697-5bf2-9156-7a437c6a5057
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_INFERRED_CONCEPT_DEFINITION = Concept.make("PRIMORDIAL_EL_INFERRED_CONCEPT_DEFINITION", UUID.fromString("b2897aa0-a697-5bf2-9156-7a437c6a5057"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_INFERRED_TERMINOLOGICAL_AXIOMS and identified by the following UUID(s):
     * <ul>
     * <li>b6d3be7d-1d7f-5c44-a425-5357f878c212
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_INFERRED_TERMINOLOGICAL_AXIOMS = Concept.make("PRIMORDIAL_EL_INFERRED_TERMINOLOGICAL_AXIOMS", UUID.fromString("b6d3be7d-1d7f-5c44-a425-5357f878c212"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_LOGIC_PROFILE and identified by the following UUID(s):
     * <ul>
     * <li>1f201e12-960e-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_LOGIC_PROFILE = Concept.make("PRIMORDIAL_EL_LOGIC_PROFILE", UUID.fromString("1f201e12-960e-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_PROFILE_SET_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>2352b7a2-11fd-5a68-8ece-fcb3b36570da
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_PROFILE_SET_OPERATOR = Concept.make("PRIMORDIAL_EL_PROFILE_SET_OPERATOR", UUID.fromString("2352b7a2-11fd-5a68-8ece-fcb3b36570da"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_STATED_CONCEPT_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>0c464a4a-a0bc-53ef-9c01-ef5a049f2656
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_STATED_CONCEPT_DEFINITION = Concept.make("PRIMORDIAL_EL_STATED_CONCEPT_DEFINITION", UUID.fromString("0c464a4a-a0bc-53ef-9c01-ef5a049f2656"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_STATED_TERMINOLOGICAL_AXIOMS and identified by the following UUID(s):
     * <ul>
     * <li>1412bd09-eb0c-5107-9756-10c1c417d385
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_STATED_TERMINOLOGICAL_AXIOMS = Concept.make("PRIMORDIAL_EL_STATED_TERMINOLOGICAL_AXIOMS", UUID.fromString("1412bd09-eb0c-5107-9756-10c1c417d385"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EL_TERMINOLOGICAL_AXIOMS and identified by the following UUID(s):
     * <ul>
     * <li>b3ec50c4-e8cf-4720-b192-31374705f3b7
     * </ul>
     */
    public static final Concept PRIMORDIAL_EL_TERMINOLOGICAL_AXIOMS = Concept.make("PRIMORDIAL_EL_TERMINOLOGICAL_AXIOMS", UUID.fromString("b3ec50c4-e8cf-4720-b192-31374705f3b7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ENGLISH_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>c0836284-f631-3c86-8cfc-56a67814efab
     * </ul>
     */
    public static final Concept PRIMORDIAL_ENGLISH_DIALECT = Concept.make("PRIMORDIAL_ENGLISH_DIALECT", UUID.fromString("c0836284-f631-3c86-8cfc-56a67814efab"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ENGLISH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>02018e5a-46ba-5297-92f1-6931b9f98a12
     * <li>06d905ea-c647-3af9-bfe5-2514e135b558
     * <li>45021920-9567-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_ENGLISH_LANGUAGE = Concept.make("PRIMORDIAL_ENGLISH_LANGUAGE", UUID.fromString("02018e5a-46ba-5297-92f1-6931b9f98a12"), UUID.fromString("06d905ea-c647-3af9-bfe5-2514e135b558"), UUID.fromString("45021920-9567-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EQUAL_TO and identified by the following UUID(s):
     * <ul>
     * <li>5c9b5844-1434-5111-83d5-cb7cb0be12d9
     * </ul>
     */
    public static final Concept PRIMORDIAL_EQUAL_TO = Concept.make("PRIMORDIAL_EQUAL_TO", UUID.fromString("5c9b5844-1434-5111-83d5-cb7cb0be12d9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EXACT and identified by the following UUID(s):
     * <ul>
     * <li>8aa6421d-4966-5230-ae5f-aca96ee9c2c1
     * </ul>
     */
    public static final Concept PRIMORDIAL_EXACT = Concept.make("PRIMORDIAL_EXACT", UUID.fromString("8aa6421d-4966-5230-ae5f-aca96ee9c2c1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EXAMPLE_UCUM_UNITS and identified by the following UUID(s):
     * <ul>
     * <li>80cd4978-314d-46e3-bc13-9980280ae955
     * </ul>
     */
    public static final Concept PRIMORDIAL_EXAMPLE_UCUM_UNITS = Concept.make("PRIMORDIAL_EXAMPLE_UCUM_UNITS", UUID.fromString("80cd4978-314d-46e3-bc13-9980280ae955"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EXCLUSIONS and identified by the following UUID(s):
     * <ul>
     * <li>3fe047f0-33b0-5254-91c2-43e65f90d30b
     * </ul>
     */
    public static final Concept PRIMORDIAL_EXCLUSIONS = Concept.make("PRIMORDIAL_EXCLUSIONS", UUID.fromString("3fe047f0-33b0-5254-91c2-43e65f90d30b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EXISTENTIAL_RESTRICTION and identified by the following UUID(s):
     * <ul>
     * <li>91e9080f-78f6-5d23-891d-f5b6e77995c8
     * </ul>
     */
    public static final Concept PRIMORDIAL_EXISTENTIAL_RESTRICTION = Concept.make("PRIMORDIAL_EXISTENTIAL_RESTRICTION", UUID.fromString("91e9080f-78f6-5d23-891d-f5b6e77995c8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EXPRESS_AXIOM and identified by the following UUID(s):
     * <ul>
     * <li>db55557c-e9ee-4504-aae3-df695b6d6c57
     * </ul>
     */
    public static final Concept PRIMORDIAL_EXPRESS_AXIOM = Concept.make("PRIMORDIAL_EXPRESS_AXIOM", UUID.fromString("db55557c-e9ee-4504-aae3-df695b6d6c57"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EXTENDED_DESCRIPTION_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>5a2e7786-3e41-11dc-8314-0800200c9a66
     * </ul>
     */
    public static final Concept PRIMORDIAL_EXTENDED_DESCRIPTION_TYPE = Concept.make("PRIMORDIAL_EXTENDED_DESCRIPTION_TYPE", UUID.fromString("5a2e7786-3e41-11dc-8314-0800200c9a66"));

    /**
     * Java binding for the concept described as PRIMORDIAL_EXTENDED_RELATIONSHIP_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>d41d928f-8a97-55c1-aa6c-a289b413fbfd
     * </ul>
     */
    public static final Concept PRIMORDIAL_EXTENDED_RELATIONSHIP_TYPE = Concept.make("PRIMORDIAL_EXTENDED_RELATIONSHIP_TYPE", UUID.fromString("d41d928f-8a97-55c1-aa6c-a289b413fbfd"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FEATURE and identified by the following UUID(s):
     * <ul>
     * <li>5e76a88e-794a-5fdd-8eb2-4a9e4b1386b6
     * </ul>
     */
    public static final Concept PRIMORDIAL_FEATURE = Concept.make("PRIMORDIAL_FEATURE", UUID.fromString("5e76a88e-794a-5fdd-8eb2-4a9e4b1386b6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FEATURE_ROLE_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>acb8d47e-adac-491d-bc60-78e94cacd312
     * </ul>
     */
    public static final Concept PRIMORDIAL_FEATURE_ROLE_TYPE = Concept.make("PRIMORDIAL_FEATURE_ROLE_TYPE", UUID.fromString("acb8d47e-adac-491d-bc60-78e94cacd312"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FEATURE_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>c9120d8b-1acc-5267-9f33-fa716abdb69d
     * </ul>
     */
    public static final Concept PRIMORDIAL_FEATURE_TYPE = Concept.make("PRIMORDIAL_FEATURE_TYPE", UUID.fromString("c9120d8b-1acc-5267-9f33-fa716abdb69d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>e6359a86-a1df-4721-8a1a-1f1f075ec3d9
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD = Concept.make("PRIMORDIAL_FIELD", UUID.fromString("e6359a86-a1df-4721-8a1a-1f1f075ec3d9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_CATEGORIES and identified by the following UUID(s):
     * <ul>
     * <li>ed230c7c-20f9-470d-8566-5057f92748a5
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_CATEGORIES = Concept.make("PRIMORDIAL_FIELD_CATEGORIES", UUID.fromString("ed230c7c-20f9-470d-8566-5057f92748a5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_DEFINITIONS_SET and identified by the following UUID(s):
     * <ul>
     * <li>975de83e-ab99-4a9e-9051-4cbf310a2123
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_DEFINITIONS_SET = Concept.make("PRIMORDIAL_FIELD_DEFINITIONS_SET", UUID.fromString("975de83e-ab99-4a9e-9051-4cbf310a2123"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_DEFINITION_DATA_TYPE_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>02273b53-fce7-4cbe-921d-2cff67e81ad5
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_DEFINITION_DATA_TYPE_FIELD = Concept.make("PRIMORDIAL_FIELD_DEFINITION_DATA_TYPE_FIELD", UUID.fromString("02273b53-fce7-4cbe-921d-2cff67e81ad5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_DEFINITION_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>14171f07-e74f-409a-b555-06b478818f76
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_DEFINITION_FIELD = Concept.make("PRIMORDIAL_FIELD_DEFINITION_FIELD", UUID.fromString("14171f07-e74f-409a-b555-06b478818f76"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_DEFINITION_MEANING_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>74dffbed-0bef-44a4-8ad6-8cff84fe47ae
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_DEFINITION_MEANING_FIELD = Concept.make("PRIMORDIAL_FIELD_DEFINITION_MEANING_FIELD", UUID.fromString("74dffbed-0bef-44a4-8ad6-8cff84fe47ae"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_DEFINITION_PURPOSE_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>93239959-50e6-4645-b5fc-6d47da92e666
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_DEFINITION_PURPOSE_FIELD = Concept.make("PRIMORDIAL_FIELD_DEFINITION_PURPOSE_FIELD", UUID.fromString("93239959-50e6-4645-b5fc-6d47da92e666"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_NAME and identified by the following UUID(s):
     * <ul>
     * <li>15489c68-673d-503e-bff7-e9d59e5dc15c
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_NAME = Concept.make("PRIMORDIAL_FIELD_NAME", UUID.fromString("15489c68-673d-503e-bff7-e9d59e5dc15c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_SUBSTITUTION and identified by the following UUID(s):
     * <ul>
     * <li>8fdce1aa-ca82-5abc-8cfa-230c14688abc
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_SUBSTITUTION = Concept.make("PRIMORDIAL_FIELD_SUBSTITUTION", UUID.fromString("8fdce1aa-ca82-5abc-8cfa-230c14688abc"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FIELD_VALUE_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>7e4a96fc-0522-4d74-a7d1-ca74be3bc236
     * </ul>
     */
    public static final Concept PRIMORDIAL_FIELD_VALUE_FIELD = Concept.make("PRIMORDIAL_FIELD_VALUE_FIELD", UUID.fromString("7e4a96fc-0522-4d74-a7d1-ca74be3bc236"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FLOAT and identified by the following UUID(s):
     * <ul>
     * <li>fb591801-7b37-525d-980d-98a1c63ceee0
     * </ul>
     */
    public static final Concept PRIMORDIAL_FLOAT = Concept.make("PRIMORDIAL_FLOAT", UUID.fromString("fb591801-7b37-525d-980d-98a1c63ceee0"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FLOAT_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>6efe7087-3e3c-5b45-8109-90d7652b1506
     * </ul>
     */
    public static final Concept PRIMORDIAL_FLOAT_DISPLAY_FIELD = Concept.make("PRIMORDIAL_FLOAT_DISPLAY_FIELD", UUID.fromString("6efe7087-3e3c-5b45-8109-90d7652b1506"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FLOAT_LITERAL and identified by the following UUID(s):
     * <ul>
     * <li>da754dd9-9961-5819-91f5-8245d49850b4
     * </ul>
     */
    public static final Concept PRIMORDIAL_FLOAT_LITERAL = Concept.make("PRIMORDIAL_FLOAT_LITERAL", UUID.fromString("da754dd9-9961-5819-91f5-8245d49850b4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FLOAT_SUBSTITUTION and identified by the following UUID(s):
     * <ul>
     * <li>cf18fe25-bd21-586e-9da4-da6cb335fd12
     * </ul>
     */
    public static final Concept PRIMORDIAL_FLOAT_SUBSTITUTION = Concept.make("PRIMORDIAL_FLOAT_SUBSTITUTION", UUID.fromString("cf18fe25-bd21-586e-9da4-da6cb335fd12"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FOR_USER and identified by the following UUID(s):
     * <ul>
     * <li>c8fd4f1b-d842-5245-9a7d-a58dc0ac1c11
     * </ul>
     */
    public static final Concept PRIMORDIAL_FOR_USER = Concept.make("PRIMORDIAL_FOR_USER", UUID.fromString("c8fd4f1b-d842-5245-9a7d-a58dc0ac1c11"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FRENCH_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>75d00a0d-8e46-5e42-ad34-3e46269b28a3
     * </ul>
     */
    public static final Concept PRIMORDIAL_FRENCH_DIALECT = Concept.make("PRIMORDIAL_FRENCH_DIALECT", UUID.fromString("75d00a0d-8e46-5e42-ad34-3e46269b28a3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FRENCH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>8b23e636-a0bd-30fb-b8e2-1f77eaa3a87e
     * <li>01707e47-5f6d-555e-80af-3c1ffb297eaa
     * <li>45021dbc-9567-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_FRENCH_LANGUAGE = Concept.make("PRIMORDIAL_FRENCH_LANGUAGE", UUID.fromString("8b23e636-a0bd-30fb-b8e2-1f77eaa3a87e"), UUID.fromString("01707e47-5f6d-555e-80af-3c1ffb297eaa"), UUID.fromString("45021dbc-9567-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_FULLY_QUALIFIED_NAME and identified by the following UUID(s):
     * <ul>
     * <li>00791270-77c9-32b6-b34f-d932569bd2bf
     * <li>5e1fe940-8faf-11db-b606-0800200c9a66
     * </ul>
     */
    public static final Concept PRIMORDIAL_FULLY_QUALIFIED_NAME = Concept.make("PRIMORDIAL_FULLY_QUALIFIED_NAME", UUID.fromString("00791270-77c9-32b6-b34f-d932569bd2bf"), UUID.fromString("5e1fe940-8faf-11db-b606-0800200c9a66"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GB_ENGLISH_DIALECT_GB_ENGLISH and identified by the following UUID(s):
     * <ul>
     * <li>eb9a5e42-3cba-356d-b623-3ed472e20b30
     * </ul>
     */
    public static final Concept PRIMORDIAL_GB_ENGLISH_DIALECT_GB_ENGLISH = Concept.make("PRIMORDIAL_GB_ENGLISH_DIALECT_GB_ENGLISH", UUID.fromString("eb9a5e42-3cba-356d-b623-3ed472e20b30"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GERMAN_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>5f144b18-76a8-5c7e-8480-55a5030d707f
     * </ul>
     */
    public static final Concept PRIMORDIAL_GERMAN_LANGUAGE = Concept.make("PRIMORDIAL_GERMAN_LANGUAGE", UUID.fromString("5f144b18-76a8-5c7e-8480-55a5030d707f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GMDN_AGENCY and identified by the following UUID(s):
     * <ul>
     * <li>7160bb53-1110-4643-90a9-9d35198950e6
     * </ul>
     */
    public static final Concept PRIMORDIAL_GMDN_AGENCY = Concept.make("PRIMORDIAL_GMDN_AGENCY", UUID.fromString("7160bb53-1110-4643-90a9-9d35198950e6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GMDN_MODEL_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>4ad65aff-4765-43f3-88f9-8c7e82850807
     * </ul>
     */
    public static final Concept PRIMORDIAL_GMDN_MODEL_CONCEPT = Concept.make("PRIMORDIAL_GMDN_MODEL_CONCEPT", UUID.fromString("4ad65aff-4765-43f3-88f9-8c7e82850807"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GMDN_SIMPLE_MAP_TERM and identified by the following UUID(s):
     * <ul>
     * <li>a1b15dbd-dfd0-4120-86f4-b9f39f4de205
     * </ul>
     */
    public static final Concept PRIMORDIAL_GMDN_SIMPLE_MAP_TERM = Concept.make("PRIMORDIAL_GMDN_SIMPLE_MAP_TERM", UUID.fromString("a1b15dbd-dfd0-4120-86f4-b9f39f4de205"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GREATER_THAN and identified by the following UUID(s):
     * <ul>
     * <li>65af466b-360c-58b2-8b7d-2854150029a8
     * </ul>
     */
    public static final Concept PRIMORDIAL_GREATER_THAN = Concept.make("PRIMORDIAL_GREATER_THAN", UUID.fromString("65af466b-360c-58b2-8b7d-2854150029a8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GREATER_THAN_OR_EQUAL_TO and identified by the following UUID(s):
     * <ul>
     * <li>c1baba19-e918-5d2c-8fa4-b0ad93e03186
     * </ul>
     */
    public static final Concept PRIMORDIAL_GREATER_THAN_OR_EQUAL_TO = Concept.make("PRIMORDIAL_GREATER_THAN_OR_EQUAL_TO", UUID.fromString("c1baba19-e918-5d2c-8fa4-b0ad93e03186"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GRETEL and identified by the following UUID(s):
     * <ul>
     * <li>1c0023ed-559e-3311-9e55-bd4bd9e5628f
     * </ul>
     */
    public static final Concept PRIMORDIAL_GRETEL = Concept.make("PRIMORDIAL_GRETEL", UUID.fromString("1c0023ed-559e-3311-9e55-bd4bd9e5628f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_GROUPING and identified by the following UUID(s):
     * <ul>
     * <li>8d76ead7-6c75-5d25-84d4-ca76d928f8a6
     * </ul>
     */
    public static final Concept PRIMORDIAL_GROUPING = Concept.make("PRIMORDIAL_GROUPING", UUID.fromString("8d76ead7-6c75-5d25-84d4-ca76d928f8a6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_HAS_ACTIVE_INGREDIENT and identified by the following UUID(s):
     * <ul>
     * <li>65bf3b7f-c854-36b5-81c3-4915461020a8
     * </ul>
     */
    public static final Concept PRIMORDIAL_HAS_ACTIVE_INGREDIENT = Concept.make("PRIMORDIAL_HAS_ACTIVE_INGREDIENT", UUID.fromString("65bf3b7f-c854-36b5-81c3-4915461020a8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_HAS_DOSE_FORM and identified by the following UUID(s):
     * <ul>
     * <li>072e7737-e22e-36b5-89d2-4815f0529c63
     * </ul>
     */
    public static final Concept PRIMORDIAL_HAS_DOSE_FORM = Concept.make("PRIMORDIAL_HAS_DOSE_FORM", UUID.fromString("072e7737-e22e-36b5-89d2-4815f0529c63"));

    /**
     * Java binding for the concept described as PRIMORDIAL_HEALTH_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>a892950a-0847-300c-b477-4e3cbb945225
     * <li>ee9ac5d2-a07c-3981-a57a-f7f26baf38d8
     * <li>f6daf03a-93d6-5bab-8dc9-f60c327cf012
     * </ul>
     */
    public static final Concept PRIMORDIAL_HEALTH_CONCEPT = Concept.make("PRIMORDIAL_HEALTH_CONCEPT", UUID.fromString("a892950a-0847-300c-b477-4e3cbb945225"), UUID.fromString("ee9ac5d2-a07c-3981-a57a-f7f26baf38d8"), UUID.fromString("f6daf03a-93d6-5bab-8dc9-f60c327cf012"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IDENTIFIER_SOURCE and identified by the following UUID(s):
     * <ul>
     * <li>5a87935c-d654-548f-82a2-0c06e3801162
     * </ul>
     */
    public static final Concept PRIMORDIAL_IDENTIFIER_SOURCE = Concept.make("PRIMORDIAL_IDENTIFIER_SOURCE", UUID.fromString("5a87935c-d654-548f-82a2-0c06e3801162"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IDENTIFIER_VALUE and identified by the following UUID(s):
     * <ul>
     * <li>b32dd26b-c3fc-487e-987e-16ace71a0d0f
     * </ul>
     */
    public static final Concept PRIMORDIAL_IDENTIFIER_VALUE = Concept.make("PRIMORDIAL_IDENTIFIER_VALUE", UUID.fromString("b32dd26b-c3fc-487e-987e-16ace71a0d0f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IGNORE_CASE and identified by the following UUID(s):
     * <ul>
     * <li>74bbdaff-f061-5807-b334-3c88ac3e9421
     * </ul>
     */
    public static final Concept PRIMORDIAL_IGNORE_CASE = Concept.make("PRIMORDIAL_IGNORE_CASE", UUID.fromString("74bbdaff-f061-5807-b334-3c88ac3e9421"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IMAGE_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>cd9ea037-0af9-586b-9369-7bc044cdb8f7
     * </ul>
     */
    public static final Concept PRIMORDIAL_IMAGE_DISPLAY_FIELD = Concept.make("PRIMORDIAL_IMAGE_DISPLAY_FIELD", UUID.fromString("cd9ea037-0af9-586b-9369-7bc044cdb8f7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IMMUTABLECOORDINATE_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>ab41a788-8a83-5452-8dc0-2d8375e0bfe6
     * </ul>
     */
    public static final Concept PRIMORDIAL_IMMUTABLECOORDINATE_PROPERTIES = Concept.make("PRIMORDIAL_IMMUTABLECOORDINATE_PROPERTIES", UUID.fromString("ab41a788-8a83-5452-8dc0-2d8375e0bfe6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IMPLICATION_SET and identified by the following UUID(s):
     * <ul>
     * <li>ee467a5b-9292-4e0a-a165-3b1a359a8c98
     * </ul>
     */
    public static final Concept PRIMORDIAL_IMPLICATION_SET = Concept.make("PRIMORDIAL_IMPLICATION_SET", UUID.fromString("ee467a5b-9292-4e0a-a165-3b1a359a8c98"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INACTIVE and identified by the following UUID(s):
     * <ul>
     * <li>03004053-c23e-5206-8514-fb551dd328f4
     * </ul>
     */
    public static final Concept PRIMORDIAL_INACTIVE = Concept.make("PRIMORDIAL_INACTIVE", UUID.fromString("03004053-c23e-5206-8514-fb551dd328f4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INCLUDE_LOWER_BOUND and identified by the following UUID(s):
     * <ul>
     * <li>2300a210-d722-48af-8c36-118a3f980312
     * </ul>
     */
    public static final Concept PRIMORDIAL_INCLUDE_LOWER_BOUND = Concept.make("PRIMORDIAL_INCLUDE_LOWER_BOUND", UUID.fromString("2300a210-d722-48af-8c36-118a3f980312"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INCLUDE_UPPER_BOUND and identified by the following UUID(s):
     * <ul>
     * <li>990b7e1d-3dcc-4c6e-a068-e30400607d50
     * </ul>
     */
    public static final Concept PRIMORDIAL_INCLUDE_UPPER_BOUND = Concept.make("PRIMORDIAL_INCLUDE_UPPER_BOUND", UUID.fromString("990b7e1d-3dcc-4c6e-a068-e30400607d50"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INCLUSION_SET and identified by the following UUID(s):
     * <ul>
     * <li>def77c09-e1eb-40f2-931a-e7cf2ce0e597
     * </ul>
     */
    public static final Concept PRIMORDIAL_INCLUSION_SET = Concept.make("PRIMORDIAL_INCLUSION_SET", UUID.fromString("def77c09-e1eb-40f2-931a-e7cf2ce0e597"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INFERRED_ASSEMBLAGE and identified by the following UUID(s):
     * <ul>
     * <li>9ecf4d76-4346-5e5d-8316-bdff48a5c154
     * </ul>
     */
    public static final Concept PRIMORDIAL_INFERRED_ASSEMBLAGE = Concept.make("PRIMORDIAL_INFERRED_ASSEMBLAGE", UUID.fromString("9ecf4d76-4346-5e5d-8316-bdff48a5c154"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INFERRED_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>b1abf4dc-9838-4b46-ac55-10c4f92ba10b
     * </ul>
     */
    public static final Concept PRIMORDIAL_INFERRED_DEFINITION = Concept.make("PRIMORDIAL_INFERRED_DEFINITION", UUID.fromString("b1abf4dc-9838-4b46-ac55-10c4f92ba10b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INFERRED_NAVIGATION and identified by the following UUID(s):
     * <ul>
     * <li>4bc6c333-7fc9-52f1-942d-f8decba19dc2
     * </ul>
     */
    public static final Concept PRIMORDIAL_INFERRED_NAVIGATION = Concept.make("PRIMORDIAL_INFERRED_NAVIGATION", UUID.fromString("4bc6c333-7fc9-52f1-942d-f8decba19dc2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INFERRED_RELATIONSHIP_INFERRED and identified by the following UUID(s):
     * <ul>
     * <li>a4c6bf72-8fb6-11db-b606-0800200c9a66
     * <li>1290e6ba-48d0-31d2-8d62-e133373c63f5
     * </ul>
     */
    public static final Concept PRIMORDIAL_INFERRED_RELATIONSHIP_INFERRED = Concept.make("PRIMORDIAL_INFERRED_RELATIONSHIP_INFERRED", UUID.fromString("a4c6bf72-8fb6-11db-b606-0800200c9a66"), UUID.fromString("1290e6ba-48d0-31d2-8d62-e133373c63f5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INITIAL_CHARACTER_CASE_INSENSITIVE and identified by the following UUID(s):
     * <ul>
     * <li>17915e0d-ed38-3488-a35c-cda966db306a
     * </ul>
     */
    public static final Concept PRIMORDIAL_INITIAL_CHARACTER_CASE_INSENSITIVE = Concept.make("PRIMORDIAL_INITIAL_CHARACTER_CASE_INSENSITIVE", UUID.fromString("17915e0d-ed38-3488-a35c-cda966db306a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INSTANT_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>e9bde1bc-aa72-430a-afe1-aa8aec8833b4
     * </ul>
     */
    public static final Concept PRIMORDIAL_INSTANT_FIELD = Concept.make("PRIMORDIAL_INSTANT_FIELD", UUID.fromString("e9bde1bc-aa72-430a-afe1-aa8aec8833b4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INSTANT_LITERAL and identified by the following UUID(s):
     * <ul>
     * <li>1fbf42e2-42b7-591f-b7fd-ba5de659529e
     * </ul>
     */
    public static final Concept PRIMORDIAL_INSTANT_LITERAL = Concept.make("PRIMORDIAL_INSTANT_LITERAL", UUID.fromString("1fbf42e2-42b7-591f-b7fd-ba5de659529e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INSTANT_SUBSTITUTION and identified by the following UUID(s):
     * <ul>
     * <li>56599345-31c5-5817-9d36-57dd3a626b3a
     * </ul>
     */
    public static final Concept PRIMORDIAL_INSTANT_SUBSTITUTION = Concept.make("PRIMORDIAL_INSTANT_SUBSTITUTION", UUID.fromString("56599345-31c5-5817-9d36-57dd3a626b3a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTEGER_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>ff59c300-9c4e-5e77-a35d-6a133eb3440f
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTEGER_DISPLAY_FIELD = Concept.make("PRIMORDIAL_INTEGER_DISPLAY_FIELD", UUID.fromString("ff59c300-9c4e-5e77-a35d-6a133eb3440f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTEGER_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>db249d1f-ea2e-4608-ae13-166ed20ca825
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTEGER_FIELD = Concept.make("PRIMORDIAL_INTEGER_FIELD", UUID.fromString("db249d1f-ea2e-4608-ae13-166ed20ca825"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTERVAL_LOWER_BOUND and identified by the following UUID(s):
     * <ul>
     * <li>52b3e38a-fccb-4779-aa61-4e87abd56419
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTERVAL_LOWER_BOUND = Concept.make("PRIMORDIAL_INTERVAL_LOWER_BOUND", UUID.fromString("52b3e38a-fccb-4779-aa61-4e87abd56419"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTERVAL_PROPERTY_SET and identified by the following UUID(s):
     * <ul>
     * <li>9afc988a-3724-4754-8b74-651426472b19
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTERVAL_PROPERTY_SET = Concept.make("PRIMORDIAL_INTERVAL_PROPERTY_SET", UUID.fromString("9afc988a-3724-4754-8b74-651426472b19"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTERVAL_ROLE and identified by the following UUID(s):
     * <ul>
     * <li>ed9d3506-65ad-48ea-bd01-95474fecdbc4
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTERVAL_ROLE = Concept.make("PRIMORDIAL_INTERVAL_ROLE", UUID.fromString("ed9d3506-65ad-48ea-bd01-95474fecdbc4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTERVAL_ROLE_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>6fa58611-af37-402e-a0c2-6ee1d6068651
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTERVAL_ROLE_TYPE = Concept.make("PRIMORDIAL_INTERVAL_ROLE_TYPE", UUID.fromString("6fa58611-af37-402e-a0c2-6ee1d6068651"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTERVAL_SET_AXIOMS and identified by the following UUID(s):
     * <ul>
     * <li>b253e725-d7cd-46e3-bc3a-5db8b3ffbd52
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTERVAL_SET_AXIOMS = Concept.make("PRIMORDIAL_INTERVAL_SET_AXIOMS", UUID.fromString("b253e725-d7cd-46e3-bc3a-5db8b3ffbd52"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTERVAL_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>ba3191ee-a260-41a6-99fd-74a22fdc937e
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTERVAL_TYPE = Concept.make("PRIMORDIAL_INTERVAL_TYPE", UUID.fromString("ba3191ee-a260-41a6-99fd-74a22fdc937e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTERVAL_UPPER_BOUND and identified by the following UUID(s):
     * <ul>
     * <li>6565f774-ff6c-4882-832f-31ddc462adf7
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTERVAL_UPPER_BOUND = Concept.make("PRIMORDIAL_INTERVAL_UPPER_BOUND", UUID.fromString("6565f774-ff6c-4882-832f-31ddc462adf7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INTRINSIC_ROLE and identified by the following UUID(s):
     * <ul>
     * <li>a2d37d2d-ac49-589f-ba36-ac9b8808b00b
     * </ul>
     */
    public static final Concept PRIMORDIAL_INTRINSIC_ROLE = Concept.make("PRIMORDIAL_INTRINSIC_ROLE", UUID.fromString("a2d37d2d-ac49-589f-ba36-ac9b8808b00b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INVERSE_NAME and identified by the following UUID(s):
     * <ul>
     * <li>c342d18a-ec1c-5583-bfe3-59e6324ae189
     * </ul>
     */
    public static final Concept PRIMORDIAL_INVERSE_NAME = Concept.make("PRIMORDIAL_INVERSE_NAME", UUID.fromString("c342d18a-ec1c-5583-bfe3-59e6324ae189"));

    /**
     * Java binding for the concept described as PRIMORDIAL_INVERSE_TREE_LIST and identified by the following UUID(s):
     * <ul>
     * <li>45167fb6-e01d-53a8-8be3-768aae18729d
     * </ul>
     */
    public static final Concept PRIMORDIAL_INVERSE_TREE_LIST = Concept.make("PRIMORDIAL_INVERSE_TREE_LIST", UUID.fromString("45167fb6-e01d-53a8-8be3-768aae18729d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IRISH_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>c0f77638-6274-5b40-b832-ac1cba7ec515
     * </ul>
     */
    public static final Concept PRIMORDIAL_IRISH_DIALECT = Concept.make("PRIMORDIAL_IRISH_DIALECT", UUID.fromString("c0f77638-6274-5b40-b832-ac1cba7ec515"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IRISH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>58e82fc4-1492-5cf8-8997-43800360bbd6
     * </ul>
     */
    public static final Concept PRIMORDIAL_IRISH_LANGUAGE = Concept.make("PRIMORDIAL_IRISH_LANGUAGE", UUID.fromString("58e82fc4-1492-5cf8-8997-43800360bbd6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IS_A and identified by the following UUID(s):
     * <ul>
     * <li>c93a30b9-ba77-3adb-a9b8-4589c9f8fb25
     * <li>46bccdc4-8fb6-11db-b606-0800200c9a66
     * </ul>
     */
    public static final Concept PRIMORDIAL_IS_A = Concept.make("PRIMORDIAL_IS_A", UUID.fromString("c93a30b9-ba77-3adb-a9b8-4589c9f8fb25"), UUID.fromString("46bccdc4-8fb6-11db-b606-0800200c9a66"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IS_A_INFERRED_NAVIGATION and identified by the following UUID(s):
     * <ul>
     * <li>b620768f-1479-5afa-a027-5a9ae6caf0d5
     * </ul>
     */
    public static final Concept PRIMORDIAL_IS_A_INFERRED_NAVIGATION = Concept.make("PRIMORDIAL_IS_A_INFERRED_NAVIGATION", UUID.fromString("b620768f-1479-5afa-a027-5a9ae6caf0d5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_IS_A_STATED_NAVIGATION and identified by the following UUID(s):
     * <ul>
     * <li>d555dde9-c97e-5480-819a-7472eda3dbfa
     * </ul>
     */
    public static final Concept PRIMORDIAL_IS_A_STATED_NAVIGATION = Concept.make("PRIMORDIAL_IS_A_STATED_NAVIGATION", UUID.fromString("d555dde9-c97e-5480-819a-7472eda3dbfa"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ITALIAN_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>bdd59458-381a-5818-8577-60525f11ac6c
     * </ul>
     */
    public static final Concept PRIMORDIAL_ITALIAN_LANGUAGE = Concept.make("PRIMORDIAL_ITALIAN_LANGUAGE", UUID.fromString("bdd59458-381a-5818-8577-60525f11ac6c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_KOMET and identified by the following UUID(s):
     * <ul>
     * <li>34a6dae3-e5e9-50db-a9ee-69c1067911d8
     * </ul>
     */
    public static final Concept PRIMORDIAL_KOMET = Concept.make("PRIMORDIAL_KOMET", UUID.fromString("34a6dae3-e5e9-50db-a9ee-69c1067911d8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_KOMET_ISSUE and identified by the following UUID(s):
     * <ul>
     * <li>e1dd7bf2-224d-53a5-a5fb-7b25b05d17a6
     * </ul>
     */
    public static final Concept PRIMORDIAL_KOMET_ISSUE = Concept.make("PRIMORDIAL_KOMET_ISSUE", UUID.fromString("e1dd7bf2-224d-53a5-a5fb-7b25b05d17a6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_KOMET_USER and identified by the following UUID(s):
     * <ul>
     * <li>61c1a544-2acf-58cd-8cc0-9ac581d4227e
     * </ul>
     */
    public static final Concept PRIMORDIAL_KOMET_USER = Concept.make("PRIMORDIAL_KOMET_USER", UUID.fromString("61c1a544-2acf-58cd-8cc0-9ac581d4227e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_KOMET_USER_LIST and identified by the following UUID(s):
     * <ul>
     * <li>5e77558d-97d0-52b6-adf0-d54beb97b3a6
     * </ul>
     */
    public static final Concept PRIMORDIAL_KOMET_USER_LIST = Concept.make("PRIMORDIAL_KOMET_USER_LIST", UUID.fromString("5e77558d-97d0-52b6-adf0-d54beb97b3a6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_KOREAN_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>6fb2eb9c-fb9e-5959-802c-fb17bcba3079
     * </ul>
     */
    public static final Concept PRIMORDIAL_KOREAN_DIALECT = Concept.make("PRIMORDIAL_KOREAN_DIALECT", UUID.fromString("6fb2eb9c-fb9e-5959-802c-fb17bcba3079"));

    /**
     * Java binding for the concept described as PRIMORDIAL_KOREAN_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>1464f995-d658-5e9d-86e0-8308a6fa57eb
     * </ul>
     */
    public static final Concept PRIMORDIAL_KOREAN_LANGUAGE = Concept.make("PRIMORDIAL_KOREAN_LANGUAGE", UUID.fromString("1464f995-d658-5e9d-86e0-8308a6fa57eb"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>b0ad4d77-e1bc-5fd1-922e-5fad675e9bfd
     * </ul>
     */
    public static final Concept PRIMORDIAL_LANGUAGE = Concept.make("PRIMORDIAL_LANGUAGE", UUID.fromString("b0ad4d77-e1bc-5fd1-922e-5fad675e9bfd"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LANGUAGE_COORDINATE_NAME and identified by the following UUID(s):
     * <ul>
     * <li>42dff20f-5ed2-559a-91ad-91d44a573c63
     * </ul>
     */
    public static final Concept PRIMORDIAL_LANGUAGE_COORDINATE_NAME = Concept.make("PRIMORDIAL_LANGUAGE_COORDINATE_NAME", UUID.fromString("42dff20f-5ed2-559a-91ad-91d44a573c63"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LANGUAGE_COORDINATE_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>ea1a52f7-0305-5487-8766-e846330f167a
     * </ul>
     */
    public static final Concept PRIMORDIAL_LANGUAGE_COORDINATE_PROPERTIES = Concept.make("PRIMORDIAL_LANGUAGE_COORDINATE_PROPERTIES", UUID.fromString("ea1a52f7-0305-5487-8766-e846330f167a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LANGUAGE_FOR_DESCRIPTION and identified by the following UUID(s):
     * <ul>
     * <li>cd56cceb-8507-5ae5-a928-16079fe6f832
     * </ul>
     */
    public static final Concept PRIMORDIAL_LANGUAGE_FOR_DESCRIPTION = Concept.make("PRIMORDIAL_LANGUAGE_FOR_DESCRIPTION", UUID.fromString("cd56cceb-8507-5ae5-a928-16079fe6f832"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LANGUAGE_NID and identified by the following UUID(s):
     * <ul>
     * <li>38e0c7b8-1e33-56a2-9eb2-ee20c4960684
     * </ul>
     */
    public static final Concept PRIMORDIAL_LANGUAGE_NID = Concept.make("PRIMORDIAL_LANGUAGE_NID", UUID.fromString("38e0c7b8-1e33-56a2-9eb2-ee20c4960684"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LATERALITY and identified by the following UUID(s):
     * <ul>
     * <li>26ca4590-bbe5-327c-a40a-ba56dc86996b
     * </ul>
     */
    public static final Concept PRIMORDIAL_LATERALITY = Concept.make("PRIMORDIAL_LATERALITY", UUID.fromString("26ca4590-bbe5-327c-a40a-ba56dc86996b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LESS_THAN and identified by the following UUID(s):
     * <ul>
     * <li>6f96e8cf-5568-5e49-8a90-aa6c65125ee9
     * </ul>
     */
    public static final Concept PRIMORDIAL_LESS_THAN = Concept.make("PRIMORDIAL_LESS_THAN", UUID.fromString("6f96e8cf-5568-5e49-8a90-aa6c65125ee9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LESS_THAN_OR_EQUAL_TO and identified by the following UUID(s):
     * <ul>
     * <li>6dfacbd5-8344-5794-9fda-bec95b2aa6c9
     * </ul>
     */
    public static final Concept PRIMORDIAL_LESS_THAN_OR_EQUAL_TO = Concept.make("PRIMORDIAL_LESS_THAN_OR_EQUAL_TO", UUID.fromString("6dfacbd5-8344-5794-9fda-bec95b2aa6c9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LITERAL_VALUE and identified by the following UUID(s):
     * <ul>
     * <li>208a40a7-e615-5efa-9de0-2e2a5a8488b7
     * </ul>
     */
    public static final Concept PRIMORDIAL_LITERAL_VALUE = Concept.make("PRIMORDIAL_LITERAL_VALUE", UUID.fromString("208a40a7-e615-5efa-9de0-2e2a5a8488b7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LITHUANIAN_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>8fa63274-70e3-5b11-9669-1b7bdb372b1a
     * <li>e9645d95-8a1f-3825-8feb-0bc2ee825694
     * <li>45022410-9567-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_LITHUANIAN_LANGUAGE = Concept.make("PRIMORDIAL_LITHUANIAN_LANGUAGE", UUID.fromString("8fa63274-70e3-5b11-9669-1b7bdb372b1a"), UUID.fromString("e9645d95-8a1f-3825-8feb-0bc2ee825694"), UUID.fromString("45022410-9567-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGICALLY_EQUIVALENT_TO and identified by the following UUID(s):
     * <ul>
     * <li>3642d9a3-8e23-5289-836b-366c0b1e2900
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGICALLY_EQUIVALENT_TO = Concept.make("PRIMORDIAL_LOGICALLY_EQUIVALENT_TO", UUID.fromString("3642d9a3-8e23-5289-836b-366c0b1e2900"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGICAL_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>7dccd042-b0b8-5cec-a1bc-6de676b92f4b
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGICAL_DEFINITION = Concept.make("PRIMORDIAL_LOGICAL_DEFINITION", UUID.fromString("7dccd042-b0b8-5cec-a1bc-6de676b92f4b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGICAL_EXPRESSION_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>c16eb414-8840-54f8-9bd2-e2f1ab37e19d
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGICAL_EXPRESSION_DISPLAY_FIELD = Concept.make("PRIMORDIAL_LOGICAL_EXPRESSION_DISPLAY_FIELD", UUID.fromString("c16eb414-8840-54f8-9bd2-e2f1ab37e19d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGICAL_EXPRESSION_SEMANTIC and identified by the following UUID(s):
     * <ul>
     * <li>d19306b1-4744-5028-a715-17ca4a4d657f
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGICAL_EXPRESSION_SEMANTIC = Concept.make("PRIMORDIAL_LOGICAL_EXPRESSION_SEMANTIC", UUID.fromString("d19306b1-4744-5028-a715-17ca4a4d657f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGIC_COORDINATE_NAME and identified by the following UUID(s):
     * <ul>
     * <li>78972f14-e0f6-5f72-bf82-59310b5f7b26
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGIC_COORDINATE_NAME = Concept.make("PRIMORDIAL_LOGIC_COORDINATE_NAME", UUID.fromString("78972f14-e0f6-5f72-bf82-59310b5f7b26"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGIC_COORDINATE_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>1fa63819-5ac1-5938-95b1-47871a5f2b17
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGIC_COORDINATE_PROPERTIES = Concept.make("PRIMORDIAL_LOGIC_COORDINATE_PROPERTIES", UUID.fromString("1fa63819-5ac1-5938-95b1-47871a5f2b17"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGIC_GRAPH and identified by the following UUID(s):
     * <ul>
     * <li>fc2a0662-2396-575b-95f0-e9b38a418620
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGIC_GRAPH = Concept.make("PRIMORDIAL_LOGIC_GRAPH", UUID.fromString("fc2a0662-2396-575b-95f0-e9b38a418620"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOGIC_PROFILE and identified by the following UUID(s):
     * <ul>
     * <li>aef80e34-b2dd-5dca-a989-3e0ee2699be3
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOGIC_PROFILE = Concept.make("PRIMORDIAL_LOGIC_PROFILE", UUID.fromString("aef80e34-b2dd-5dca-a989-3e0ee2699be3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LONG and identified by the following UUID(s):
     * <ul>
     * <li>dea8cdf1-de75-5991-9791-79714e4a964d
     * </ul>
     */
    public static final Concept PRIMORDIAL_LONG = Concept.make("PRIMORDIAL_LONG", UUID.fromString("dea8cdf1-de75-5991-9791-79714e4a964d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_LOWER_BOUND_OPEN and identified by the following UUID(s):
     * <ul>
     * <li>a0096ba1-0718-4c03-ad8f-8143c44091e7
     * </ul>
     */
    public static final Concept PRIMORDIAL_LOWER_BOUND_OPEN = Concept.make("PRIMORDIAL_LOWER_BOUND_OPEN", UUID.fromString("a0096ba1-0718-4c03-ad8f-8143c44091e7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MASTER_PATH and identified by the following UUID(s):
     * <ul>
     * <li>1f20134a-960e-11e5-8994-feff819cdc9f
     * <li>2faa9260-8fb2-11db-b606-0800200c9a66
     * </ul>
     */
    public static final Concept PRIMORDIAL_MASTER_PATH = Concept.make("PRIMORDIAL_MASTER_PATH", UUID.fromString("1f20134a-960e-11e5-8994-feff819cdc9f"), UUID.fromString("2faa9260-8fb2-11db-b606-0800200c9a66"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MAXIMUM_VALUE_MAX_VALUE and identified by the following UUID(s):
     * <ul>
     * <li>72d58983-b1e1-4ca9-833f-0e40c1defd39
     * </ul>
     */
    public static final Concept PRIMORDIAL_MAXIMUM_VALUE_MAX_VALUE = Concept.make("PRIMORDIAL_MAXIMUM_VALUE_MAX_VALUE", UUID.fromString("72d58983-b1e1-4ca9-833f-0e40c1defd39"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MAXIMUM_VALUE_OPERATOR_MAXIMUM_DOMAIN_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>7b8916ab-fd50-41df-8fc2-0b2a7a78be6d
     * </ul>
     */
    public static final Concept PRIMORDIAL_MAXIMUM_VALUE_OPERATOR_MAXIMUM_DOMAIN_OPERATOR = Concept.make("PRIMORDIAL_MAXIMUM_VALUE_OPERATOR_MAXIMUM_DOMAIN_OPERATOR", UUID.fromString("7b8916ab-fd50-41df-8fc2-0b2a7a78be6d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MEANING and identified by the following UUID(s):
     * <ul>
     * <li>a06158ff-e08a-5d7d-bcfa-6cbfdb138910
     * </ul>
     */
    public static final Concept PRIMORDIAL_MEANING = Concept.make("PRIMORDIAL_MEANING", UUID.fromString("a06158ff-e08a-5d7d-bcfa-6cbfdb138910"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MEMBERSHIP_SEMANTIC and identified by the following UUID(s):
     * <ul>
     * <li>4fa29287-a80e-5f83-abab-4b587973e7b7
     * </ul>
     */
    public static final Concept PRIMORDIAL_MEMBERSHIP_SEMANTIC = Concept.make("PRIMORDIAL_MEMBERSHIP_SEMANTIC", UUID.fromString("4fa29287-a80e-5f83-abab-4b587973e7b7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_METADATA_AUTHORING and identified by the following UUID(s):
     * <ul>
     * <li>070deb74-acc5-46bf-b9c6-eaee1b58ef52
     * </ul>
     */
    public static final Concept PRIMORDIAL_METADATA_AUTHORING = Concept.make("PRIMORDIAL_METADATA_AUTHORING", UUID.fromString("070deb74-acc5-46bf-b9c6-eaee1b58ef52"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MINIMUM_VALUE_MIN_VALUE and identified by the following UUID(s):
     * <ul>
     * <li>37c35a88-9e27-42ca-b626-186773c4b612
     * </ul>
     */
    public static final Concept PRIMORDIAL_MINIMUM_VALUE_MIN_VALUE = Concept.make("PRIMORDIAL_MINIMUM_VALUE_MIN_VALUE", UUID.fromString("37c35a88-9e27-42ca-b626-186773c4b612"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MINIMUM_VALUE_OPERATOR_MINIMUM_DOMAIN_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>ded98e42-f74a-4432-9ae7-01b94dc2fdea
     * </ul>
     */
    public static final Concept PRIMORDIAL_MINIMUM_VALUE_OPERATOR_MINIMUM_DOMAIN_OPERATOR = Concept.make("PRIMORDIAL_MINIMUM_VALUE_OPERATOR_MINIMUM_DOMAIN_OPERATOR", UUID.fromString("ded98e42-f74a-4432-9ae7-01b94dc2fdea"));

    /**
     * Java binding for the concept described as PRIMORDIAL_MODEL_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>7bbd4210-381c-11e7-9598-0800200c9a66
     * </ul>
     */
    public static final Concept PRIMORDIAL_MODEL_CONCEPT = Concept.make("PRIMORDIAL_MODEL_CONCEPT", UUID.fromString("7bbd4210-381c-11e7-9598-0800200c9a66"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NATIVE_IDENTIFIER and identified by the following UUID(s):
     * <ul>
     * <li>d1a17272-9785-51aa-8bde-cc556ab32ebb
     * </ul>
     */
    public static final Concept PRIMORDIAL_NATIVE_IDENTIFIER = Concept.make("PRIMORDIAL_NATIVE_IDENTIFIER", UUID.fromString("d1a17272-9785-51aa-8bde-cc556ab32ebb"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NAVIGATION and identified by the following UUID(s):
     * <ul>
     * <li>4d9707d8-adf0-5b15-89fc-039e4ff6fec8
     * </ul>
     */
    public static final Concept PRIMORDIAL_NAVIGATION = Concept.make("PRIMORDIAL_NAVIGATION", UUID.fromString("4d9707d8-adf0-5b15-89fc-039e4ff6fec8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NAVIGATIONCOORDINATE_DIRECTED_GRAPH and identified by the following UUID(s):
     * <ul>
     * <li>47a787a7-bdce-528d-bfcc-fde1add8d599
     * </ul>
     */
    public static final Concept PRIMORDIAL_NAVIGATIONCOORDINATE_DIRECTED_GRAPH = Concept.make("PRIMORDIAL_NAVIGATIONCOORDINATE_DIRECTED_GRAPH", UUID.fromString("47a787a7-bdce-528d-bfcc-fde1add8d599"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NAVIGATION_SET and identified by the following UUID(s):
     * <ul>
     * <li>fc965c5d-ad17-555e-bcb5-b78fd45c8c5f
     * </ul>
     */
    public static final Concept PRIMORDIAL_NAVIGATION_SET = Concept.make("PRIMORDIAL_NAVIGATION_SET", UUID.fromString("fc965c5d-ad17-555e-bcb5-b78fd45c8c5f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NAVIGATION_VERTEX and identified by the following UUID(s):
     * <ul>
     * <li>c7f01834-34ca-5f8b-8f80-193fbeb12eae
     * </ul>
     */
    public static final Concept PRIMORDIAL_NAVIGATION_VERTEX = Concept.make("PRIMORDIAL_NAVIGATION_VERTEX", UUID.fromString("c7f01834-34ca-5f8b-8f80-193fbeb12eae"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NECESSARY_BUT_NOT_SUFFICIENT_CONCEPT_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>e1a12059-3b01-3296-9532-d10e49d0afc3
     * </ul>
     */
    public static final Concept PRIMORDIAL_NECESSARY_BUT_NOT_SUFFICIENT_CONCEPT_DEFINITION = Concept.make("PRIMORDIAL_NECESSARY_BUT_NOT_SUFFICIENT_CONCEPT_DEFINITION", UUID.fromString("e1a12059-3b01-3296-9532-d10e49d0afc3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NECESSARY_SET and identified by the following UUID(s):
     * <ul>
     * <li>acaa2eba-8364-5493-b24c-b3884d34bb60
     * </ul>
     */
    public static final Concept PRIMORDIAL_NECESSARY_SET = Concept.make("PRIMORDIAL_NECESSARY_SET", UUID.fromString("acaa2eba-8364-5493-b24c-b3884d34bb60"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NIDS and identified by the following UUID(s):
     * <ul>
     * <li>f36e7ca6-34a2-58b5-8b25-736457515f9c
     * </ul>
     */
    public static final Concept PRIMORDIAL_NIDS = Concept.make("PRIMORDIAL_NIDS", UUID.fromString("f36e7ca6-34a2-58b5-8b25-736457515f9c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_NOT_APPLICABLE and identified by the following UUID(s):
     * <ul>
     * <li>d4cc29ae-c0c1-563a-985d-5165a768dd44
     * </ul>
     */
    public static final Concept PRIMORDIAL_NOT_APPLICABLE = Concept.make("PRIMORDIAL_NOT_APPLICABLE", UUID.fromString("d4cc29ae-c0c1-563a-985d-5165a768dd44"));

    /**
     * Java binding for the concept described as PRIMORDIAL_OBJECT and identified by the following UUID(s):
     * <ul>
     * <li>72765109-6b53-3814-9b05-34ebddd16592
     * </ul>
     */
    public static final Concept PRIMORDIAL_OBJECT = Concept.make("PRIMORDIAL_OBJECT", UUID.fromString("72765109-6b53-3814-9b05-34ebddd16592"));

    /**
     * Java binding for the concept described as PRIMORDIAL_OBJECT_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>3ef4311c-70c0-5149-9e06-53d745f85b15
     * </ul>
     */
    public static final Concept PRIMORDIAL_OBJECT_PROPERTIES = Concept.make("PRIMORDIAL_OBJECT_PROPERTIES", UUID.fromString("3ef4311c-70c0-5149-9e06-53d745f85b15"));

    /**
     * Java binding for the concept described as PRIMORDIAL_OPTIONS and identified by the following UUID(s):
     * <ul>
     * <li>19305aff-95d9-55d9-b015-825cc68eadc7
     * </ul>
     */
    public static final Concept PRIMORDIAL_OPTIONS = Concept.make("PRIMORDIAL_OPTIONS", UUID.fromString("19305aff-95d9-55d9-b015-825cc68eadc7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_OR and identified by the following UUID(s):
     * <ul>
     * <li>2c940bcf-22a8-5fc9-b232-580021e758ed
     * </ul>
     */
    public static final Concept PRIMORDIAL_OR = Concept.make("PRIMORDIAL_OR", UUID.fromString("2c940bcf-22a8-5fc9-b232-580021e758ed"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ORDER and identified by the following UUID(s):
     * <ul>
     * <li>ddeda759-e89c-5186-aa40-d63070756ab4
     * </ul>
     */
    public static final Concept PRIMORDIAL_ORDER = Concept.make("PRIMORDIAL_ORDER", UUID.fromString("ddeda759-e89c-5186-aa40-d63070756ab4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ORIGINS and identified by the following UUID(s):
     * <ul>
     * <li>462862d4-5df9-426e-b785-a1264e24769f
     * </ul>
     */
    public static final Concept PRIMORDIAL_ORIGINS = Concept.make("PRIMORDIAL_ORIGINS", UUID.fromString("462862d4-5df9-426e-b785-a1264e24769f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PARTIAL and identified by the following UUID(s):
     * <ul>
     * <li>a7f9574c-8e8b-515d-9c21-9896063cc3b8
     * </ul>
     */
    public static final Concept PRIMORDIAL_PARTIAL = Concept.make("PRIMORDIAL_PARTIAL", UUID.fromString("a7f9574c-8e8b-515d-9c21-9896063cc3b8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PART_OF and identified by the following UUID(s):
     * <ul>
     * <li>b4c3f6f9-6937-30fd-8412-d0c77f8a7f73
     * </ul>
     */
    public static final Concept PRIMORDIAL_PART_OF = Concept.make("PRIMORDIAL_PART_OF", UUID.fromString("b4c3f6f9-6937-30fd-8412-d0c77f8a7f73"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH and identified by the following UUID(s):
     * <ul>
     * <li>ad3dd2dd-ddb0-584c-bea4-c6d9b91d461f
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH = Concept.make("PRIMORDIAL_PATH", UUID.fromString("ad3dd2dd-ddb0-584c-bea4-c6d9b91d461f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>1b9d9f95-fc0a-55ac-b2e6-7c8b37660046
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH_CONCEPT = Concept.make("PRIMORDIAL_PATH_CONCEPT", UUID.fromString("1b9d9f95-fc0a-55ac-b2e6-7c8b37660046"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH_COORDINATE_NAME and identified by the following UUID(s):
     * <ul>
     * <li>a293a9a0-eb1e-5418-83c7-bec376b62245
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH_COORDINATE_NAME = Concept.make("PRIMORDIAL_PATH_COORDINATE_NAME", UUID.fromString("a293a9a0-eb1e-5418-83c7-bec376b62245"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH_COORDINATE_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>ec41e427-f009-5e45-a643-6dc658d63d83
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH_COORDINATE_PROPERTIES = Concept.make("PRIMORDIAL_PATH_COORDINATE_PROPERTIES", UUID.fromString("ec41e427-f009-5e45-a643-6dc658d63d83"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>6622a391-e2e6-45a0-97e1-c58cd0184092
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH_FIELD = Concept.make("PRIMORDIAL_PATH_FIELD", UUID.fromString("6622a391-e2e6-45a0-97e1-c58cd0184092"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH_FOR_USER and identified by the following UUID(s):
     * <ul>
     * <li>12131382-1535-5a77-928b-6eacad221ea2
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH_FOR_USER = Concept.make("PRIMORDIAL_PATH_FOR_USER", UUID.fromString("12131382-1535-5a77-928b-6eacad221ea2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH_OPTIONS and identified by the following UUID(s):
     * <ul>
     * <li>2110c10c-9174-55aa-8ffe-91650c77d0b3
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH_OPTIONS = Concept.make("PRIMORDIAL_PATH_OPTIONS", UUID.fromString("2110c10c-9174-55aa-8ffe-91650c77d0b3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATH_ORIGINS and identified by the following UUID(s):
     * <ul>
     * <li>f33e1668-34dd-53dd-8728-31b29934b482
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATH_ORIGINS = Concept.make("PRIMORDIAL_PATH_ORIGINS", UUID.fromString("f33e1668-34dd-53dd-8728-31b29934b482"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATTERN_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>751790c7-e1e4-42bc-b531-54c54bd6eebd
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATTERN_FIELD = Concept.make("PRIMORDIAL_PATTERN_FIELD", UUID.fromString("751790c7-e1e4-42bc-b531-54c54bd6eebd"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATTERN_MEANING_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>996d0023-a355-422f-a84d-16dda6ece1b0
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATTERN_MEANING_FIELD = Concept.make("PRIMORDIAL_PATTERN_MEANING_FIELD", UUID.fromString("996d0023-a355-422f-a84d-16dda6ece1b0"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATTERN_PURPOSE_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>352c821b-7a11-454c-a127-48ad3206573d
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATTERN_PURPOSE_FIELD = Concept.make("PRIMORDIAL_PATTERN_PURPOSE_FIELD", UUID.fromString("352c821b-7a11-454c-a127-48ad3206573d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATTERN_VERSIONS_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>7b8ecbbf-55b4-41bc-acbf-51824e74446a
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATTERN_VERSIONS_FIELD = Concept.make("PRIMORDIAL_PATTERN_VERSIONS_FIELD", UUID.fromString("7b8ecbbf-55b4-41bc-acbf-51824e74446a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PATTERN_VERSIONS_SET and identified by the following UUID(s):
     * <ul>
     * <li>a254ccee-ef02-4504-9645-0a2ed7af955d
     * </ul>
     */
    public static final Concept PRIMORDIAL_PATTERN_VERSIONS_SET = Concept.make("PRIMORDIAL_PATTERN_VERSIONS_SET", UUID.fromString("a254ccee-ef02-4504-9645-0a2ed7af955d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PHENOMENON and identified by the following UUID(s):
     * <ul>
     * <li>c2e8bc47-3353-5e02-b0d1-2a5916efed4d
     * </ul>
     */
    public static final Concept PRIMORDIAL_PHENOMENON = Concept.make("PRIMORDIAL_PHENOMENON", UUID.fromString("c2e8bc47-3353-5e02-b0d1-2a5916efed4d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_POLISH_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>315cd879-1557-5a30-b325-a5d3df9e1c2b
     * </ul>
     */
    public static final Concept PRIMORDIAL_POLISH_DIALECT = Concept.make("PRIMORDIAL_POLISH_DIALECT", UUID.fromString("315cd879-1557-5a30-b325-a5d3df9e1c2b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_POLISH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>c924b887-da88-3a72-b8ea-fa86990467c9
     * <li>45022140-9567-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_POLISH_LANGUAGE = Concept.make("PRIMORDIAL_POLISH_LANGUAGE", UUID.fromString("c924b887-da88-3a72-b8ea-fa86990467c9"), UUID.fromString("45022140-9567-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_POSITION_ON_PATH_SOLOR and identified by the following UUID(s):
     * <ul>
     * <li>31173582-a49d-51c6-813f-f42d0976aaea
     * </ul>
     */
    public static final Concept PRIMORDIAL_POSITION_ON_PATH_SOLOR = Concept.make("PRIMORDIAL_POSITION_ON_PATH_SOLOR", UUID.fromString("31173582-a49d-51c6-813f-f42d0976aaea"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PREFERENCE_LIST and identified by the following UUID(s):
     * <ul>
     * <li>f56ef2df-6758-5271-a587-317a4fed6c2e
     * </ul>
     */
    public static final Concept PRIMORDIAL_PREFERENCE_LIST = Concept.make("PRIMORDIAL_PREFERENCE_LIST", UUID.fromString("f56ef2df-6758-5271-a587-317a4fed6c2e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PREFERRED and identified by the following UUID(s):
     * <ul>
     * <li>266f1bc3-3361-39f3-bffe-69db9daea56e
     * </ul>
     */
    public static final Concept PRIMORDIAL_PREFERRED = Concept.make("PRIMORDIAL_PREFERRED", UUID.fromString("266f1bc3-3361-39f3-bffe-69db9daea56e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PRESENTATION_UNIT_DIFFERENT and identified by the following UUID(s):
     * <ul>
     * <li>e86d3887-717b-545f-b6b5-611210913b23
     * </ul>
     */
    public static final Concept PRIMORDIAL_PRESENTATION_UNIT_DIFFERENT = Concept.make("PRIMORDIAL_PRESENTATION_UNIT_DIFFERENT", UUID.fromString("e86d3887-717b-545f-b6b5-611210913b23"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PROMOTION_PATH_FOR_EDIT_COORDINATE and identified by the following UUID(s):
     * <ul>
     * <li>db124d3b-c1bb-530e-8fd4-577f570355be
     * </ul>
     */
    public static final Concept PRIMORDIAL_PROMOTION_PATH_FOR_EDIT_COORDINATE = Concept.make("PRIMORDIAL_PROMOTION_PATH_FOR_EDIT_COORDINATE", UUID.fromString("db124d3b-c1bb-530e-8fd4-577f570355be"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PROPERTY_PATTERN_IMPLICATION and identified by the following UUID(s):
     * <ul>
     * <li>e0de0d09-6e27-5738-bc8f-0fc94bb115fc
     * </ul>
     */
    public static final Concept PRIMORDIAL_PROPERTY_PATTERN_IMPLICATION = Concept.make("PRIMORDIAL_PROPERTY_PATTERN_IMPLICATION", UUID.fromString("e0de0d09-6e27-5738-bc8f-0fc94bb115fc"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PROPERTY_SEQUENCE and identified by the following UUID(s):
     * <ul>
     * <li>d0d759fd-510f-475a-900e-b1439b4536e1
     * </ul>
     */
    public static final Concept PRIMORDIAL_PROPERTY_SEQUENCE = Concept.make("PRIMORDIAL_PROPERTY_SEQUENCE", UUID.fromString("d0d759fd-510f-475a-900e-b1439b4536e1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PROPERTY_SEQUENCE_IMPLICATION and identified by the following UUID(s):
     * <ul>
     * <li>9a47a5db-42a6-49ee-9083-54bc305a9456
     * </ul>
     */
    public static final Concept PRIMORDIAL_PROPERTY_SEQUENCE_IMPLICATION = Concept.make("PRIMORDIAL_PROPERTY_SEQUENCE_IMPLICATION", UUID.fromString("9a47a5db-42a6-49ee-9083-54bc305a9456"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PROPERTY_SET and identified by the following UUID(s):
     * <ul>
     * <li>e273b5c0-c012-5e53-990c-aec5c2cb33a7
     * </ul>
     */
    public static final Concept PRIMORDIAL_PROPERTY_SET = Concept.make("PRIMORDIAL_PROPERTY_SET", UUID.fromString("e273b5c0-c012-5e53-990c-aec5c2cb33a7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PROPERTY_SET_AXIOMS and identified by the following UUID(s):
     * <ul>
     * <li>ca2fdefd-0481-41cb-8074-41a78f94034d
     * </ul>
     */
    public static final Concept PRIMORDIAL_PROPERTY_SET_AXIOMS = Concept.make("PRIMORDIAL_PROPERTY_SET_AXIOMS", UUID.fromString("ca2fdefd-0481-41cb-8074-41a78f94034d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PUBLIC_ID_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>196838c5-55f4-4e40-8618-b9ce60685c2f
     * </ul>
     */
    public static final Concept PRIMORDIAL_PUBLIC_ID_FIELD = Concept.make("PRIMORDIAL_PUBLIC_ID_FIELD", UUID.fromString("196838c5-55f4-4e40-8618-b9ce60685c2f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_PURPOSE and identified by the following UUID(s):
     * <ul>
     * <li>c3dffc48-6493-54df-a2f0-14be8ba03091
     * </ul>
     */
    public static final Concept PRIMORDIAL_PURPOSE = Concept.make("PRIMORDIAL_PURPOSE", UUID.fromString("c3dffc48-6493-54df-a2f0-14be8ba03091"));

    /**
     * Java binding for the concept described as PRIMORDIAL_QUERY_CLAUSES and identified by the following UUID(s):
     * <ul>
     * <li>4905348c-ba1d-58ae-821f-52877d9acee3
     * </ul>
     */
    public static final Concept PRIMORDIAL_QUERY_CLAUSES = Concept.make("PRIMORDIAL_QUERY_CLAUSES", UUID.fromString("4905348c-ba1d-58ae-821f-52877d9acee3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_REFERENCED_COMPONENT_ID and identified by the following UUID(s):
     * <ul>
     * <li>a9ba4749-c11f-5f35-a991-21796fb89ddc
     * </ul>
     */
    public static final Concept PRIMORDIAL_REFERENCED_COMPONENT_ID = Concept.make("PRIMORDIAL_REFERENCED_COMPONENT_ID", UUID.fromString("a9ba4749-c11f-5f35-a991-21796fb89ddc"));

    /**
     * Java binding for the concept described as PRIMORDIAL_REFERENCED_COMPONENT_SUBTYPE_RESTRICTION and identified by the following UUID(s):
     * <ul>
     * <li>8af1045e-1122-5072-9f29-ce7da9337915
     * </ul>
     */
    public static final Concept PRIMORDIAL_REFERENCED_COMPONENT_SUBTYPE_RESTRICTION = Concept.make("PRIMORDIAL_REFERENCED_COMPONENT_SUBTYPE_RESTRICTION", UUID.fromString("8af1045e-1122-5072-9f29-ce7da9337915"));

    /**
     * Java binding for the concept described as PRIMORDIAL_REFERENCED_COMPONENT_TYPE_RESTRICTION and identified by the following UUID(s):
     * <ul>
     * <li>902f97b6-2ef4-59d7-b6f9-01278a00061c
     * </ul>
     */
    public static final Concept PRIMORDIAL_REFERENCED_COMPONENT_TYPE_RESTRICTION = Concept.make("PRIMORDIAL_REFERENCED_COMPONENT_TYPE_RESTRICTION", UUID.fromString("902f97b6-2ef4-59d7-b6f9-01278a00061c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_REFLEXIVE_FEATURE and identified by the following UUID(s):
     * <ul>
     * <li>7e779e4a-61ed-5c4a-aacc-03cf524b7c73
     * </ul>
     */
    public static final Concept PRIMORDIAL_REFLEXIVE_FEATURE = Concept.make("PRIMORDIAL_REFLEXIVE_FEATURE", UUID.fromString("7e779e4a-61ed-5c4a-aacc-03cf524b7c73"));

    /**
     * Java binding for the concept described as PRIMORDIAL_REGULAR_NAME_DESCRIPTION_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>8bfba944-3965-3946-9bcb-1e80a5da63a2
     * <li>d6fad981-7df6-3388-94d8-238cc0465a79
     * </ul>
     */
    public static final Concept PRIMORDIAL_REGULAR_NAME_DESCRIPTION_TYPE = Concept.make("PRIMORDIAL_REGULAR_NAME_DESCRIPTION_TYPE", UUID.fromString("8bfba944-3965-3946-9bcb-1e80a5da63a2"), UUID.fromString("d6fad981-7df6-3388-94d8-238cc0465a79"));

    /**
     * Java binding for the concept described as PRIMORDIAL_RELATIONSHIP_DESTINATION and identified by the following UUID(s):
     * <ul>
     * <li>a3dd69af-355c-54ce-ba13-2902a7ae9551
     * </ul>
     */
    public static final Concept PRIMORDIAL_RELATIONSHIP_DESTINATION = Concept.make("PRIMORDIAL_RELATIONSHIP_DESTINATION", UUID.fromString("a3dd69af-355c-54ce-ba13-2902a7ae9551"));

    /**
     * Java binding for the concept described as PRIMORDIAL_RELATIONSHIP_ORIGIN and identified by the following UUID(s):
     * <ul>
     * <li>ad22d43b-3ee7-550b-9660-a6e68af347c2
     * </ul>
     */
    public static final Concept PRIMORDIAL_RELATIONSHIP_ORIGIN = Concept.make("PRIMORDIAL_RELATIONSHIP_ORIGIN", UUID.fromString("ad22d43b-3ee7-550b-9660-a6e68af347c2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ROLE and identified by the following UUID(s):
     * <ul>
     * <li>46ae9325-dd24-5008-8fda-80cf1f0977c7
     * </ul>
     */
    public static final Concept PRIMORDIAL_ROLE = Concept.make("PRIMORDIAL_ROLE", UUID.fromString("46ae9325-dd24-5008-8fda-80cf1f0977c7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ROLE_GROUP and identified by the following UUID(s):
     * <ul>
     * <li>a63f4bf2-a040-11e5-8994-feff819cdc9f
     * <li>f97abff6-a221-57a1-9cd6-e79e723bfe2a
     * <li>051fbfed-3c40-3130-8c09-889cb7b7b5b6
     * </ul>
     */
    public static final Concept PRIMORDIAL_ROLE_GROUP = Concept.make("PRIMORDIAL_ROLE_GROUP", UUID.fromString("a63f4bf2-a040-11e5-8994-feff819cdc9f"), UUID.fromString("f97abff6-a221-57a1-9cd6-e79e723bfe2a"), UUID.fromString("051fbfed-3c40-3130-8c09-889cb7b7b5b6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ROLE_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>f9860cb8-a7c7-5743-9d7c-ffc6e8a24a0f
     * </ul>
     */
    public static final Concept PRIMORDIAL_ROLE_OPERATOR = Concept.make("PRIMORDIAL_ROLE_OPERATOR", UUID.fromString("f9860cb8-a7c7-5743-9d7c-ffc6e8a24a0f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ROLE_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>76320274-be2a-5ba0-b3e8-e6d2e383ee6a
     * </ul>
     */
    public static final Concept PRIMORDIAL_ROLE_TYPE = Concept.make("PRIMORDIAL_ROLE_TYPE", UUID.fromString("76320274-be2a-5ba0-b3e8-e6d2e383ee6a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ROLE_TYPE_TO_ADD and identified by the following UUID(s):
     * <ul>
     * <li>0c3ca846-0374-5a5c-8da4-67e0e2e28868
     * </ul>
     */
    public static final Concept PRIMORDIAL_ROLE_TYPE_TO_ADD = Concept.make("PRIMORDIAL_ROLE_TYPE_TO_ADD", UUID.fromString("0c3ca846-0374-5a5c-8da4-67e0e2e28868"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ROLE_VALUE and identified by the following UUID(s):
     * <ul>
     * <li>988bb02a-9b4a-4ef9-937e-fa8a6afc6c42
     * </ul>
     */
    public static final Concept PRIMORDIAL_ROLE_VALUE = Concept.make("PRIMORDIAL_ROLE_VALUE", UUID.fromString("988bb02a-9b4a-4ef9-937e-fa8a6afc6c42"));

    /**
     * Java binding for the concept described as PRIMORDIAL_ROOT and identified by the following UUID(s):
     * <ul>
     * <li>862cc189-bbcb-51a0-89a4-16e1854be247
     * </ul>
     */
    public static final Concept PRIMORDIAL_ROOT = Concept.make("PRIMORDIAL_ROOT", UUID.fromString("862cc189-bbcb-51a0-89a4-16e1854be247"));

    /**
     * Java binding for the concept described as PRIMORDIAL_RUSSIAN_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>300126d1-2604-579f-a59b-e3c1179a173a
     * </ul>
     */
    public static final Concept PRIMORDIAL_RUSSIAN_DIALECT = Concept.make("PRIMORDIAL_RUSSIAN_DIALECT", UUID.fromString("300126d1-2604-579f-a59b-e3c1179a173a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_RUSSIAN_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>0818dbb7-3fe1-59d7-99c2-c8dc42ff2cce
     * </ul>
     */
    public static final Concept PRIMORDIAL_RUSSIAN_LANGUAGE = Concept.make("PRIMORDIAL_RUSSIAN_LANGUAGE", UUID.fromString("0818dbb7-3fe1-59d7-99c2-c8dc42ff2cce"));

    /**
     * Java binding for the concept described as PRIMORDIAL_S and identified by the following UUID(s):
     * <ul>
     * <li>bf69c4f1-95c9-5956-a10a-d3ba9276c019
     * </ul>
     */
    public static final Concept PRIMORDIAL_S = Concept.make("PRIMORDIAL_S", UUID.fromString("bf69c4f1-95c9-5956-a10a-d3ba9276c019"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SANDBOX and identified by the following UUID(s):
     * <ul>
     * <li>c5daf0e9-30dc-5b3e-a521-d6e6e72c8a95
     * </ul>
     */
    public static final Concept PRIMORDIAL_SANDBOX = Concept.make("PRIMORDIAL_SANDBOX", UUID.fromString("c5daf0e9-30dc-5b3e-a521-d6e6e72c8a95"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SANDBOX_COMPONENT and identified by the following UUID(s):
     * <ul>
     * <li>c93829b2-aa78-5a84-ac9a-c34307844166
     * </ul>
     */
    public static final Concept PRIMORDIAL_SANDBOX_COMPONENT = Concept.make("PRIMORDIAL_SANDBOX_COMPONENT", UUID.fromString("c93829b2-aa78-5a84-ac9a-c34307844166"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SANDBOX_PATH and identified by the following UUID(s):
     * <ul>
     * <li>715bd36d-6090-5b37-8ae7-88c9e532010e
     * </ul>
     */
    public static final Concept PRIMORDIAL_SANDBOX_PATH = Concept.make("PRIMORDIAL_SANDBOX_PATH", UUID.fromString("715bd36d-6090-5b37-8ae7-88c9e532010e"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_DISPLAY_FIELD_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>9c3dfc88-51e4-5e51-a59a-88dd580162b7
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_DISPLAY_FIELD_TYPE = Concept.make("PRIMORDIAL_SEMANTIC_DISPLAY_FIELD_TYPE", UUID.fromString("9c3dfc88-51e4-5e51-a59a-88dd580162b7"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>8b6c69d7-a5aa-4db2-bcea-8c7b2817b02f
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_FIELD = Concept.make("PRIMORDIAL_SEMANTIC_FIELD", UUID.fromString("8b6c69d7-a5aa-4db2-bcea-8c7b2817b02f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_FIELD_CONCEPTS and identified by the following UUID(s):
     * <ul>
     * <li>b4316cb8-14fe-5b32-b03b-f5f966c87819
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_FIELD_CONCEPTS = Concept.make("PRIMORDIAL_SEMANTIC_FIELD_CONCEPTS", UUID.fromString("b4316cb8-14fe-5b32-b03b-f5f966c87819"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_FIELD_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>f6572c76-b5c0-41da-99c0-4344694e7e3c
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_FIELD_FIELD = Concept.make("PRIMORDIAL_SEMANTIC_FIELD_FIELD", UUID.fromString("f6572c76-b5c0-41da-99c0-4344694e7e3c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_FIELD_FIELDS_SET and identified by the following UUID(s):
     * <ul>
     * <li>8dcfc1a1-31f2-46f7-8247-0a17a6d7c6c0
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_FIELD_FIELDS_SET = Concept.make("PRIMORDIAL_SEMANTIC_FIELD_FIELDS_SET", UUID.fromString("8dcfc1a1-31f2-46f7-8247-0a17a6d7c6c0"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_LIST_FOR_CHRONICLE and identified by the following UUID(s):
     * <ul>
     * <li>c809b2c0-9235-5f64-bbda-34210d91bdf8
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_LIST_FOR_CHRONICLE = Concept.make("PRIMORDIAL_SEMANTIC_LIST_FOR_CHRONICLE", UUID.fromString("c809b2c0-9235-5f64-bbda-34210d91bdf8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_PATTERN_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>19dd5dd3-1075-4113-a437-5f1f7c2d55bc
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_PATTERN_FIELD = Concept.make("PRIMORDIAL_SEMANTIC_PATTERN_FIELD", UUID.fromString("19dd5dd3-1075-4113-a437-5f1f7c2d55bc"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>b717ae48-5488-5dda-a980-97855001cc99
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_PROPERTIES = Concept.make("PRIMORDIAL_SEMANTIC_PROPERTIES", UUID.fromString("b717ae48-5488-5dda-a980-97855001cc99"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_REFERENCED_COMPONENT_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>4111ba1e-c818-4c5d-9fed-34d07298d009
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_REFERENCED_COMPONENT_FIELD = Concept.make("PRIMORDIAL_SEMANTIC_REFERENCED_COMPONENT_FIELD", UUID.fromString("4111ba1e-c818-4c5d-9fed-34d07298d009"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>3daac6c4-78c5-5271-9c63-6e28f80e0c52
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_TYPE = Concept.make("PRIMORDIAL_SEMANTIC_TYPE", UUID.fromString("3daac6c4-78c5-5271-9c63-6e28f80e0c52"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_VERSIONS_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>aeb73410-a679-4ea8-93fe-7c4785599778
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_VERSIONS_FIELD = Concept.make("PRIMORDIAL_SEMANTIC_VERSIONS_FIELD", UUID.fromString("aeb73410-a679-4ea8-93fe-7c4785599778"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SEMANTIC_VERSIONS_SET and identified by the following UUID(s):
     * <ul>
     * <li>4fd69aed-556f-4938-94cc-ea7ea707ccef
     * </ul>
     */
    public static final Concept PRIMORDIAL_SEMANTIC_VERSIONS_SET = Concept.make("PRIMORDIAL_SEMANTIC_VERSIONS_SET", UUID.fromString("4fd69aed-556f-4938-94cc-ea7ea707ccef"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SIGNED_INTEGER and identified by the following UUID(s):
     * <ul>
     * <li>1d1c2073-d98b-3dd3-8aad-a19c65aa5a0c
     * </ul>
     */
    public static final Concept PRIMORDIAL_SIGNED_INTEGER = Concept.make("PRIMORDIAL_SIGNED_INTEGER", UUID.fromString("1d1c2073-d98b-3dd3-8aad-a19c65aa5a0c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SNOMED_TO_GMDN_SIMPLE_MAP and identified by the following UUID(s):
     * <ul>
     * <li>a9b59baf-ec71-46e3-8fe8-17f233aa2de4
     * </ul>
     */
    public static final Concept PRIMORDIAL_SNOMED_TO_GMDN_SIMPLE_MAP = Concept.make("PRIMORDIAL_SNOMED_TO_GMDN_SIMPLE_MAP", UUID.fromString("a9b59baf-ec71-46e3-8fe8-17f233aa2de4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SNOROCKET_CLASSIFIER and identified by the following UUID(s):
     * <ul>
     * <li>1f201fac-960e-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_SNOROCKET_CLASSIFIER = Concept.make("PRIMORDIAL_SNOROCKET_CLASSIFIER", UUID.fromString("1f201fac-960e-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SOLOR and identified by the following UUID(s):
     * <ul>
     * <li>f680c868-f7e5-5d0e-91f2-615eca8f8fd2
     * </ul>
     */
    public static final Concept PRIMORDIAL_SOLOR = Concept.make("PRIMORDIAL_SOLOR", UUID.fromString("f680c868-f7e5-5d0e-91f2-615eca8f8fd2"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SOLOR_OVERLAY and identified by the following UUID(s):
     * <ul>
     * <li>9ecc154c-e490-5cf8-805d-d2865d62aef3
     * <li>1f2016a6-960e-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_SOLOR_OVERLAY = Concept.make("PRIMORDIAL_SOLOR_OVERLAY", UUID.fromString("9ecc154c-e490-5cf8-805d-d2865d62aef3"), UUID.fromString("1f2016a6-960e-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SORT and identified by the following UUID(s):
     * <ul>
     * <li>e973f077-a99d-59e6-b7bd-804e87e0e639
     * </ul>
     */
    public static final Concept PRIMORDIAL_SORT = Concept.make("PRIMORDIAL_SORT", UUID.fromString("e973f077-a99d-59e6-b7bd-804e87e0e639"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SPANISH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>0fcf44fb-d0a7-3a67-bc9f-eb3065ed3c8e
     * <li>45021c36-9567-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_SPANISH_LANGUAGE = Concept.make("PRIMORDIAL_SPANISH_LANGUAGE", UUID.fromString("0fcf44fb-d0a7-3a67-bc9f-eb3065ed3c8e"), UUID.fromString("45021c36-9567-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STAMP_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>3d821e64-a2ee-4414-8949-1bc92ef5d5b6
     * </ul>
     */
    public static final Concept PRIMORDIAL_STAMP_FIELD = Concept.make("PRIMORDIAL_STAMP_FIELD", UUID.fromString("3d821e64-a2ee-4414-8949-1bc92ef5d5b6"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STAMP_VERSIONS_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>b8251bea-4248-4a46-8b4a-349500693a9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_STAMP_VERSIONS_FIELD = Concept.make("PRIMORDIAL_STAMP_VERSIONS_FIELD", UUID.fromString("b8251bea-4248-4a46-8b4a-349500693a9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STAMP_VERSIONS_SET and identified by the following UUID(s):
     * <ul>
     * <li>edb90567-7822-4129-a406-b359b825f922
     * </ul>
     */
    public static final Concept PRIMORDIAL_STAMP_VERSIONS_SET = Concept.make("PRIMORDIAL_STAMP_VERSIONS_SET", UUID.fromString("edb90567-7822-4129-a406-b359b825f922"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STANDARD_KOREAN_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>f90722cc-5e40-5b9b-a2a6-f4dfa312a6a9
     * </ul>
     */
    public static final Concept PRIMORDIAL_STANDARD_KOREAN_DIALECT = Concept.make("PRIMORDIAL_STANDARD_KOREAN_DIALECT", UUID.fromString("f90722cc-5e40-5b9b-a2a6-f4dfa312a6a9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STATED and identified by the following UUID(s):
     * <ul>
     * <li>3b0dbd3b-2e53-3a30-8576-6c7fa7773060
     * <li>3fde38f6-e079-3cdc-a819-eda3ec74732d
     * </ul>
     */
    public static final Concept PRIMORDIAL_STATED = Concept.make("PRIMORDIAL_STATED", UUID.fromString("3b0dbd3b-2e53-3a30-8576-6c7fa7773060"), UUID.fromString("3fde38f6-e079-3cdc-a819-eda3ec74732d"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STATED_ASSEMBLAGE and identified by the following UUID(s):
     * <ul>
     * <li>cfd2a47e-8169-5e71-9122-d5b73efd990a
     * </ul>
     */
    public static final Concept PRIMORDIAL_STATED_ASSEMBLAGE = Concept.make("PRIMORDIAL_STATED_ASSEMBLAGE", UUID.fromString("cfd2a47e-8169-5e71-9122-d5b73efd990a"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STATED_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>28608bd3-ac73-4fe8-a5f0-1efe0d6650a8
     * </ul>
     */
    public static final Concept PRIMORDIAL_STATED_DEFINITION = Concept.make("PRIMORDIAL_STATED_DEFINITION", UUID.fromString("28608bd3-ac73-4fe8-a5f0-1efe0d6650a8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STATED_NAVIGATION and identified by the following UUID(s):
     * <ul>
     * <li>614017af-9903-53d9-aab4-15fd02193dce
     * </ul>
     */
    public static final Concept PRIMORDIAL_STATED_NAVIGATION = Concept.make("PRIMORDIAL_STATED_NAVIGATION", UUID.fromString("614017af-9903-53d9-aab4-15fd02193dce"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STATUS and identified by the following UUID(s):
     * <ul>
     * <li>10b873e2-8247-5ab5-9dec-4edef37fc219
     * </ul>
     */
    public static final Concept PRIMORDIAL_STATUS = Concept.make("PRIMORDIAL_STATUS", UUID.fromString("10b873e2-8247-5ab5-9dec-4edef37fc219"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STATUS_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>f2c79ebb-3095-44ea-831f-992aed48801f
     * </ul>
     */
    public static final Concept PRIMORDIAL_STATUS_FIELD = Concept.make("PRIMORDIAL_STATUS_FIELD", UUID.fromString("f2c79ebb-3095-44ea-831f-992aed48801f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STATUS_FOR_VERSION and identified by the following UUID(s):
     * <ul>
     * <li>0608e233-d79d-5076-985b-9b1ea4e14b4c
     * </ul>
     */
    public static final Concept PRIMORDIAL_STATUS_FOR_VERSION = Concept.make("PRIMORDIAL_STATUS_FOR_VERSION", UUID.fromString("0608e233-d79d-5076-985b-9b1ea4e14b4c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STRING_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>a46aaf11-b37a-32d6-abdc-707f084ec8f5
     * </ul>
     */
    public static final Concept PRIMORDIAL_STRING_DISPLAY_FIELD = Concept.make("PRIMORDIAL_STRING_DISPLAY_FIELD", UUID.fromString("a46aaf11-b37a-32d6-abdc-707f084ec8f5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_STRING_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>27d3905b-b19a-41ff-bed1-fc55f49f8ce4
     * </ul>
     */
    public static final Concept PRIMORDIAL_STRING_FIELD = Concept.make("PRIMORDIAL_STRING_FIELD", UUID.fromString("27d3905b-b19a-41ff-bed1-fc55f49f8ce4"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SUFFICIENT_CONCEPT_DEFINITION and identified by the following UUID(s):
     * <ul>
     * <li>6d9cd46e-8a8f-310a-a298-3e55dcf7a986
     * </ul>
     */
    public static final Concept PRIMORDIAL_SUFFICIENT_CONCEPT_DEFINITION = Concept.make("PRIMORDIAL_SUFFICIENT_CONCEPT_DEFINITION", UUID.fromString("6d9cd46e-8a8f-310a-a298-3e55dcf7a986"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SUFFICIENT_CONCEPT_DEFINITION_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>dfa80f36-dbe6-5006-8509-c497a26ceab5
     * </ul>
     */
    public static final Concept PRIMORDIAL_SUFFICIENT_CONCEPT_DEFINITION_OPERATOR = Concept.make("PRIMORDIAL_SUFFICIENT_CONCEPT_DEFINITION_OPERATOR", UUID.fromString("dfa80f36-dbe6-5006-8509-c497a26ceab5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SUFFICIENT_SET and identified by the following UUID(s):
     * <ul>
     * <li>8aa48cfd-485b-5140-beb9-0d122f7812d9
     * </ul>
     */
    public static final Concept PRIMORDIAL_SUFFICIENT_SET = Concept.make("PRIMORDIAL_SUFFICIENT_SET", UUID.fromString("8aa48cfd-485b-5140-beb9-0d122f7812d9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_SWEDISH_LANGUAGE and identified by the following UUID(s):
     * <ul>
     * <li>9784a791-8fdb-32f7-88da-74ab135fe4e3
     * <li>45022848-9567-11e5-8994-feff819cdc9f
     * </ul>
     */
    public static final Concept PRIMORDIAL_SWEDISH_LANGUAGE = Concept.make("PRIMORDIAL_SWEDISH_LANGUAGE", UUID.fromString("9784a791-8fdb-32f7-88da-74ab135fe4e3"), UUID.fromString("45022848-9567-11e5-8994-feff819cdc9f"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TAXONOMY_OPERATOR and identified by the following UUID(s):
     * <ul>
     * <li>e9252365-7a43-57ea-bf94-3f23bab4ef99
     * </ul>
     */
    public static final Concept PRIMORDIAL_TAXONOMY_OPERATOR = Concept.make("PRIMORDIAL_TAXONOMY_OPERATOR", UUID.fromString("e9252365-7a43-57ea-bf94-3f23bab4ef99"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TEMPORAL_AXIOM and identified by the following UUID(s):
     * <ul>
     * <li>5144d836-18d8-4881-a377-2d4640b710a9
     * </ul>
     */
    public static final Concept PRIMORDIAL_TEMPORAL_AXIOM = Concept.make("PRIMORDIAL_TEMPORAL_AXIOM", UUID.fromString("5144d836-18d8-4881-a377-2d4640b710a9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TEXT and identified by the following UUID(s):
     * <ul>
     * <li>8bdcbe5d-e92e-5c10-845e-b585e6061672
     * </ul>
     */
    public static final Concept PRIMORDIAL_TEXT = Concept.make("PRIMORDIAL_TEXT", UUID.fromString("8bdcbe5d-e92e-5c10-845e-b585e6061672"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TEXT_COMPARISON and identified by the following UUID(s):
     * <ul>
     * <li>b1531e68-4e7a-5194-b1f9-9aaace269372
     * </ul>
     */
    public static final Concept PRIMORDIAL_TEXT_COMPARISON = Concept.make("PRIMORDIAL_TEXT_COMPARISON", UUID.fromString("b1531e68-4e7a-5194-b1f9-9aaace269372"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TIME_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>15293325-c16b-4f2e-8109-5b22b3355bcd
     * </ul>
     */
    public static final Concept PRIMORDIAL_TIME_FIELD = Concept.make("PRIMORDIAL_TIME_FIELD", UUID.fromString("15293325-c16b-4f2e-8109-5b22b3355bcd"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TIME_FOR_VERSION and identified by the following UUID(s):
     * <ul>
     * <li>a9b0dfb2-f463-5dae-8ba8-7f2e8385571b
     * </ul>
     */
    public static final Concept PRIMORDIAL_TIME_FOR_VERSION = Concept.make("PRIMORDIAL_TIME_FOR_VERSION", UUID.fromString("a9b0dfb2-f463-5dae-8ba8-7f2e8385571b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TINKAR_MODEL_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>bc59d656-83d3-47d8-9507-0e656ea95463
     * </ul>
     */
    public static final Concept PRIMORDIAL_TINKAR_MODEL_CONCEPT = Concept.make("PRIMORDIAL_TINKAR_MODEL_CONCEPT", UUID.fromString("bc59d656-83d3-47d8-9507-0e656ea95463"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TINKAR_ROOT_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>7c21b6c5-cf11-5af9-893b-743f004c97f5
     * </ul>
     */
    public static final Concept PRIMORDIAL_TINKAR_ROOT_CONCEPT = Concept.make("PRIMORDIAL_TINKAR_ROOT_CONCEPT", UUID.fromString("7c21b6c5-cf11-5af9-893b-743f004c97f5"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TINKAR_STARTER_DATA_AUTHOR and identified by the following UUID(s):
     * <ul>
     * <li>dd96b2ea-6d7b-3791-ad74-bbdc67c493c1
     * </ul>
     */
    public static final Concept PRIMORDIAL_TINKAR_STARTER_DATA_AUTHOR = Concept.make("PRIMORDIAL_TINKAR_STARTER_DATA_AUTHOR", UUID.fromString("dd96b2ea-6d7b-3791-ad74-bbdc67c493c1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TRANSITIVE_FEATURE and identified by the following UUID(s):
     * <ul>
     * <li>53f866d0-fd61-5c85-a16c-150bd619a0ac
     * </ul>
     */
    public static final Concept PRIMORDIAL_TRANSITIVE_FEATURE = Concept.make("PRIMORDIAL_TRANSITIVE_FEATURE", UUID.fromString("53f866d0-fd61-5c85-a16c-150bd619a0ac"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TREE_AMALGAM_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>d6151a47-4610-5a5c-abd0-42c82be9b633
     * </ul>
     */
    public static final Concept PRIMORDIAL_TREE_AMALGAM_PROPERTIES = Concept.make("PRIMORDIAL_TREE_AMALGAM_PROPERTIES", UUID.fromString("d6151a47-4610-5a5c-abd0-42c82be9b633"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TREE_LIST and identified by the following UUID(s):
     * <ul>
     * <li>c11dd7a1-0ba1-5378-81d6-3efdba1e074b
     * </ul>
     */
    public static final Concept PRIMORDIAL_TREE_LIST = Concept.make("PRIMORDIAL_TREE_LIST", UUID.fromString("c11dd7a1-0ba1-5378-81d6-3efdba1e074b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_TYPE_ORDER and identified by the following UUID(s):
     * <ul>
     * <li>44c7eab6-fdb8-5427-9d7a-52ab63f7a6f9
     * </ul>
     */
    public static final Concept PRIMORDIAL_TYPE_ORDER = Concept.make("PRIMORDIAL_TYPE_ORDER", UUID.fromString("44c7eab6-fdb8-5427-9d7a-52ab63f7a6f9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UNCATEGORIZED_PHENOMENON and identified by the following UUID(s):
     * <ul>
     * <li>722f5ac8-1f5c-5d8f-96bb-370d79596f66
     * </ul>
     */
    public static final Concept PRIMORDIAL_UNCATEGORIZED_PHENOMENON = Concept.make("PRIMORDIAL_UNCATEGORIZED_PHENOMENON", UUID.fromString("722f5ac8-1f5c-5d8f-96bb-370d79596f66"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UNINITIALIZED and identified by the following UUID(s):
     * <ul>
     * <li>55f74246-0a25-57ac-9473-a788d08fb656
     * </ul>
     */
    public static final Concept PRIMORDIAL_UNINITIALIZED = Concept.make("PRIMORDIAL_UNINITIALIZED", UUID.fromString("55f74246-0a25-57ac-9473-a788d08fb656"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UNIQUELY_IDENTIFY_KNOWLEDGE_GRAPH_COMPONENTS and identified by the following UUID(s):
     * <ul>
     * <li>dde9a93d-250c-449b-bea0-ba1133d1387b
     * </ul>
     */
    public static final Concept PRIMORDIAL_UNIQUELY_IDENTIFY_KNOWLEDGE_GRAPH_COMPONENTS = Concept.make("PRIMORDIAL_UNIQUELY_IDENTIFY_KNOWLEDGE_GRAPH_COMPONENTS", UUID.fromString("dde9a93d-250c-449b-bea0-ba1133d1387b"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UNITED_STATES_ENGLISH_NURSING_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>6e447636-1085-32ff-bc36-6748a45255de
     * </ul>
     */
    public static final Concept PRIMORDIAL_UNITED_STATES_ENGLISH_NURSING_DIALECT = Concept.make("PRIMORDIAL_UNITED_STATES_ENGLISH_NURSING_DIALECT", UUID.fromString("6e447636-1085-32ff-bc36-6748a45255de"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UNIT_OF_MEASURE and identified by the following UUID(s):
     * <ul>
     * <li>40afdda5-89d6-4b80-8181-1ddd6eb92dc8
     * </ul>
     */
    public static final Concept PRIMORDIAL_UNIT_OF_MEASURE = Concept.make("PRIMORDIAL_UNIT_OF_MEASURE", UUID.fromString("40afdda5-89d6-4b80-8181-1ddd6eb92dc8"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UNIVERSAL_RESTRICTION and identified by the following UUID(s):
     * <ul>
     * <li>fc18c082-c6ad-52d2-b568-cc9568ace6c9
     * </ul>
     */
    public static final Concept PRIMORDIAL_UNIVERSAL_RESTRICTION = Concept.make("PRIMORDIAL_UNIVERSAL_RESTRICTION", UUID.fromString("fc18c082-c6ad-52d2-b568-cc9568ace6c9"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UNMODELED_ROLE_CONCEPT and identified by the following UUID(s):
     * <ul>
     * <li>4be7118f-e6ab-5dc7-bcba-b2cc8b028492
     * </ul>
     */
    public static final Concept PRIMORDIAL_UNMODELED_ROLE_CONCEPT = Concept.make("PRIMORDIAL_UNMODELED_ROLE_CONCEPT", UUID.fromString("4be7118f-e6ab-5dc7-bcba-b2cc8b028492"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UPPER_BOUND_OPEN and identified by the following UUID(s):
     * <ul>
     * <li>c20b3b1e-112f-4cb2-b901-4046db844629
     * </ul>
     */
    public static final Concept PRIMORDIAL_UPPER_BOUND_OPEN = Concept.make("PRIMORDIAL_UPPER_BOUND_OPEN", UUID.fromString("c20b3b1e-112f-4cb2-b901-4046db844629"));

    /**
     * Java binding for the concept described as PRIMORDIAL_USER and identified by the following UUID(s):
     * <ul>
     * <li>349161ba-9a6a-5c9c-a78f-281f19cfc057
     * </ul>
     */
    public static final Concept PRIMORDIAL_USER = Concept.make("PRIMORDIAL_USER", UUID.fromString("349161ba-9a6a-5c9c-a78f-281f19cfc057"));

    /**
     * Java binding for the concept described as PRIMORDIAL_US_ENGLISH_DIALECT and identified by the following UUID(s):
     * <ul>
     * <li>bca0a686-3516-3daf-8fcf-fe396d13cfad
     * </ul>
     */
    public static final Concept PRIMORDIAL_US_ENGLISH_DIALECT = Concept.make("PRIMORDIAL_US_ENGLISH_DIALECT", UUID.fromString("bca0a686-3516-3daf-8fcf-fe396d13cfad"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UUID and identified by the following UUID(s):
     * <ul>
     * <li>e0fcafbc-7191-5cdc-b14a-19d4d97f71bd
     * </ul>
     */
    public static final Concept PRIMORDIAL_UUID = Concept.make("PRIMORDIAL_UUID", UUID.fromString("e0fcafbc-7191-5cdc-b14a-19d4d97f71bd"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UUIDS and identified by the following UUID(s):
     * <ul>
     * <li>f8e3238e-7424-5a40-8649-a8d164382fec
     * </ul>
     */
    public static final Concept PRIMORDIAL_UUIDS = Concept.make("PRIMORDIAL_UUIDS", UUID.fromString("f8e3238e-7424-5a40-8649-a8d164382fec"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UUID_DATA_TYPE and identified by the following UUID(s):
     * <ul>
     * <li>2faa9262-8fb2-11db-b606-0800200c9a66
     * <li>680f3f6c-7a2a-365d-b527-8c9a96dd1a94
     * </ul>
     */
    public static final Concept PRIMORDIAL_UUID_DATA_TYPE = Concept.make("PRIMORDIAL_UUID_DATA_TYPE", UUID.fromString("2faa9262-8fb2-11db-b606-0800200c9a66"), UUID.fromString("680f3f6c-7a2a-365d-b527-8c9a96dd1a94"));

    /**
     * Java binding for the concept described as PRIMORDIAL_UUID_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>dea8cb0f-9bb5-56bb-af27-a14943cb24ba
     * </ul>
     */
    public static final Concept PRIMORDIAL_UUID_DISPLAY_FIELD = Concept.make("PRIMORDIAL_UUID_DISPLAY_FIELD", UUID.fromString("dea8cb0f-9bb5-56bb-af27-a14943cb24ba"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VALUE_CONSTRAINT and identified by the following UUID(s):
     * <ul>
     * <li>8c55fb86-92d8-42a9-ad70-1e23abbf7eec
     * </ul>
     */
    public static final Concept PRIMORDIAL_VALUE_CONSTRAINT = Concept.make("PRIMORDIAL_VALUE_CONSTRAINT", UUID.fromString("8c55fb86-92d8-42a9-ad70-1e23abbf7eec"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VALUE_CONSTRAINT_SOURCE and identified by the following UUID(s):
     * <ul>
     * <li>09aa031a-6290-4ec9-a44c-23928a767da3
     * </ul>
     */
    public static final Concept PRIMORDIAL_VALUE_CONSTRAINT_SOURCE = Concept.make("PRIMORDIAL_VALUE_CONSTRAINT_SOURCE", UUID.fromString("09aa031a-6290-4ec9-a44c-23928a767da3"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VALUE_RANGE and identified by the following UUID(s):
     * <ul>
     * <li>87ce975b-309b-47f4-a6c6-4ae6df6649a1
     * </ul>
     */
    public static final Concept PRIMORDIAL_VALUE_RANGE = Concept.make("PRIMORDIAL_VALUE_RANGE", UUID.fromString("87ce975b-309b-47f4-a6c6-4ae6df6649a1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VERSION and identified by the following UUID(s):
     * <ul>
     * <li>c202f992-3f4b-5f30-9b32-e376f68367d1
     * </ul>
     */
    public static final Concept PRIMORDIAL_VERSION = Concept.make("PRIMORDIAL_VERSION", UUID.fromString("c202f992-3f4b-5f30-9b32-e376f68367d1"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VERSIONS and identified by the following UUID(s):
     * <ul>
     * <li>d6f27f80-8e20-58fe-8d69-66ad4644f969
     * </ul>
     */
    public static final Concept PRIMORDIAL_VERSIONS = Concept.make("PRIMORDIAL_VERSIONS", UUID.fromString("d6f27f80-8e20-58fe-8d69-66ad4644f969"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VERSION_PROPERTIES and identified by the following UUID(s):
     * <ul>
     * <li>93f844df-38e5-5167-ba94-2c948b8bd07c
     * </ul>
     */
    public static final Concept PRIMORDIAL_VERSION_PROPERTIES = Concept.make("PRIMORDIAL_VERSION_PROPERTIES", UUID.fromString("93f844df-38e5-5167-ba94-2c948b8bd07c"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VERTEX_DISPLAY_FIELD and identified by the following UUID(s):
     * <ul>
     * <li>3e56c6b6-5371-11eb-ae93-0242ac130002
     * </ul>
     */
    public static final Concept PRIMORDIAL_VERTEX_DISPLAY_FIELD = Concept.make("PRIMORDIAL_VERTEX_DISPLAY_FIELD", UUID.fromString("3e56c6b6-5371-11eb-ae93-0242ac130002"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VERTEX_STATES and identified by the following UUID(s):
     * <ul>
     * <li>347cd3f2-8130-5032-8960-091e194e9afe
     * </ul>
     */
    public static final Concept PRIMORDIAL_VERTEX_STATES = Concept.make("PRIMORDIAL_VERTEX_STATES", UUID.fromString("347cd3f2-8130-5032-8960-091e194e9afe"));

    /**
     * Java binding for the concept described as PRIMORDIAL_VIEW_KEY and identified by the following UUID(s):
     * <ul>
     * <li>4211cf36-bd75-586a-805c-51f059e2eaaa
     * </ul>
     */
    public static final Concept PRIMORDIAL_VIEW_KEY = Concept.make("PRIMORDIAL_VIEW_KEY", UUID.fromString("4211cf36-bd75-586a-805c-51f059e2eaaa"));

    /**
     * Java binding for the concept described as PRIMORDIAL_WITHDRAWN and identified by the following UUID(s):
     * <ul>
     * <li>35fd4750-6e43-5fa3-ba7f-f2ad376052bc
     * </ul>
     */
    public static final Concept PRIMORDIAL_WITHDRAWN = Concept.make("PRIMORDIAL_WITHDRAWN", UUID.fromString("35fd4750-6e43-5fa3-ba7f-f2ad376052bc"));
}