/*
 * Copyright © 2015 IKM (support@ikm.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.ikm.tinkar.snomedct.integration;

import dev.ikm.tinkar.common.id.PublicIds;
import dev.ikm.tinkar.common.util.uuid.UuidUtil;
import dev.ikm.tinkar.terms.EntityProxy;
import dev.ikm.tinkar.terms.TinkarTerm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SnomedUtility {

    private static final Logger LOG = LoggerFactory.getLogger(SnomedUtility.class.getSimpleName());

    /**
     * constructor for SnomedUtility
     * @param uuidUtility used to create uuid's
     */

    /**
     * taking time stamp and making it an epoch
     *
     * @param effectiveTime String representation dates in yyyyMMdd format
     * @return long value of epochTime
     */
    public static long snomedTimestampToEpochSeconds(String effectiveTime) {
        long epochTime;
        try {
            epochTime = new SimpleDateFormat("yyyyMMdd").parse(effectiveTime).getTime();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return epochTime;
    }

    /**
     * transforms caseSensitivity code into concept
     *
     * @param caseSensitivityCode represents case sensitivity of a description
     * @return case sensitivity concept
     */
    public static EntityProxy.Concept getDescriptionCaseSignificanceConcept(String caseSensitivityCode) {
        EntityProxy.Concept caseSensitivityConcept = null;
        switch (caseSensitivityCode) {
            case "900000000000448009" -> caseSensitivityConcept = TinkarTerm.DESCRIPTION_NOT_CASE_SENSITIVE;
            case "900000000000017005" -> caseSensitivityConcept = TinkarTerm.DESCRIPTION_CASE_SENSITIVE;
            case "900000000000020002" ->
                    caseSensitivityConcept = TinkarTerm.DESCRIPTION_INITIAL_CHARACTER_CASE_SENSITIVE;
            default -> throw new RuntimeException("UNRECOGNIZED CASE SENSITIVITY CODE");
        }
        return caseSensitivityConcept;
    }

    /**
     * transform descriptionType into concept
     *
     * @param descriptionTypeCode String representation the type of descriptions
     * @return description type concept
     */
    public static EntityProxy.Concept getDescriptionType(String descriptionTypeCode) {
        EntityProxy.Concept descriptionTypeConcept = null;
        switch (descriptionTypeCode) {
            case "900000000000550004" -> descriptionTypeConcept = TinkarTerm.DEFINITION_DESCRIPTION_TYPE;
            case "900000000000003001" -> descriptionTypeConcept = TinkarTerm.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE;
            case "900000000000013009" -> descriptionTypeConcept = TinkarTerm.REGULAR_NAME_DESCRIPTION_TYPE;
            default -> throw new RuntimeException("UNRECOGNIZED DESCRIPTION TYPE CODE");
        }
        return descriptionTypeConcept;
    }

    public static EntityProxy.Concept getLanguageConcept(String languageCode) {
        EntityProxy.Concept languageConcept = null;
        switch (languageCode) {
            case "en" -> languageConcept = TinkarTerm.ENGLISH_LANGUAGE;
            case "es" -> languageConcept = TinkarTerm.SPANISH_LANGUAGE;
            default -> throw new RuntimeException("UNRECOGNIZED LANGUAGE CODE");
        }
        return languageConcept;
    }

    private static Pattern getUrlPattern() {
        // Expecting URL formatted as shown below
        // <http://www.w3.org/2002/07/owl#>
        // Pattern of characters between less-than and greater-than characters
        return Pattern.compile("<[^>]+>");
    }

    private static Pattern getIdPattern() {
        // Expecting a Snomed identifier following a colon as shown below
        // :609096000
        // Pattern of at least one numeric character after colon
        return Pattern.compile("(?<=:)([0-9]+)");
    }

    private static String urlToPublicId(MatchResult id) {
        String urlString = id.group();
        // remove beginning less-than character and ending greater-than character
        String idString = urlString.substring(1, urlString.length() - 1);
        // Generate UUID from URL bytes
        String publicIdString = PublicIds.of(UUID.nameUUIDFromBytes(idString.getBytes())).toString();
        return publicIdString.replaceAll("\"", "");
    }

    private static String idToPublicId(MatchResult id) {
        String idString = id.group();
        String publicIdString = PublicIds.of(UuidUtil.fromSNOMED(idString)).toString();
        return publicIdString.replaceAll("\"", "");
    }

    public static String owlAxiomIdsToPublicIds(String owlExpression) {
        String publicIdOwlExpression = owlExpression;
        // Replace URLs with a UUID representation
        if (owlExpression.contains("<") & owlExpression.contains(">")) {
            Matcher urlMatcher = getUrlPattern().matcher(publicIdOwlExpression);
            publicIdOwlExpression = urlMatcher.replaceAll(SnomedUtility::urlToPublicId);
        }
        // Replace Snomed identifiers with a UUID representation
        Matcher idMatcher = getIdPattern().matcher(publicIdOwlExpression);
        publicIdOwlExpression = idMatcher.replaceAll(SnomedUtility::idToPublicId);
        return publicIdOwlExpression;
    }

}
