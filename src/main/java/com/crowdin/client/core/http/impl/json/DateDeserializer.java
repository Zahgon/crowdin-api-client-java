package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.SneakyThrows;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDeserializer extends JsonDeserializer<Date> {

    @Override
    @SneakyThrows
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SneakyThrows
    public static Date deserializeDate(String date) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
