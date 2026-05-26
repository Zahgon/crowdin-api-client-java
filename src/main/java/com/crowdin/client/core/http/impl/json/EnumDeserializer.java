package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.crowdin.client.core.model.EnumConverter;
import lombok.SneakyThrows;
import java.io.IOException;

public class EnumDeserializer extends JsonDeserializer<Enum> implements ContextualDeserializer {

    private JavaType type;

    public EnumDeserializer() {
    }

    public EnumDeserializer(JavaType type) {
        this.type = type;
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Enum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SneakyThrows
    private Enum deserialize(Class<? extends Enum> type, String value) {
        if (EnumConverter.class.isAssignableFrom(type)) {
            return (Enum) type.getMethod("from", String.class).invoke(null, value);
        } else {
            return Enum.valueOf(type, value);
        }
    }
}
