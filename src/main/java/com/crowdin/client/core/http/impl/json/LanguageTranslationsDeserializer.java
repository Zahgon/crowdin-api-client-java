package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.stringtranslations.model.ICULanguageTranslations;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.stringtranslations.model.PlainLanguageTranslations;
import com.crowdin.client.stringtranslations.model.PluralLanguageTranslations;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class LanguageTranslationsDeserializer extends JsonDeserializer<LanguageTranslations> {

    private final ObjectMapper objectMapper;

    public LanguageTranslationsDeserializer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public LanguageTranslations deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
