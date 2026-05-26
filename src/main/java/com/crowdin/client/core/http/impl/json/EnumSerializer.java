package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.crowdin.client.core.model.EnumConverter;
import lombok.SneakyThrows;
import java.io.IOException;

public class EnumSerializer extends JsonSerializer<Enum> {

    @Override
    public void serialize(Enum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SneakyThrows
    private Object serialize(Enum value, EnumConverter converter) {
        return converter.to(value);
    }
}
