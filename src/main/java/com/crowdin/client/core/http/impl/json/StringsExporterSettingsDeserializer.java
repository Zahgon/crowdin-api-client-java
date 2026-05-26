package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.AndroidStringsExporterSettings;
import com.crowdin.client.projectsgroups.model.MacOSXStringsExporterSettings;
import com.crowdin.client.projectsgroups.model.StringsExporterSettings;
import com.crowdin.client.projectsgroups.model.StringsExporterSettingsResource;
import com.crowdin.client.projectsgroups.model.XliffStringsExporterSettings;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class StringsExporterSettingsDeserializer extends JsonDeserializer<StringsExporterSettingsResource> {

    private final ObjectMapper objectMapper;

    public StringsExporterSettingsDeserializer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public StringsExporterSettingsResource deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
