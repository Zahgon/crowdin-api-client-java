package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class FileFormatSettingsDeserializer extends JsonDeserializer<FileFormatSettingsResource> {

    private final ObjectMapper objectMapper;

    public FileFormatSettingsDeserializer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public FileFormatSettingsResource deserialize(JsonParser parser, DeserializationContext ctx) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
