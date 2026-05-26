package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Collection;

public class EmptyArrayToNullDeserializer extends StdDeserializer<Object> implements ContextualDeserializer {

    private JavaType type;

    public EmptyArrayToNullDeserializer() {
        super(Object.class);
    }

    public EmptyArrayToNullDeserializer(JavaType type) {
        super(type.getRawClass());
        this.type = type;
    }

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static boolean isCollectionType(Class<?> type) {
        return type.isArray() || Collection.class.isAssignableFrom(type);
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
