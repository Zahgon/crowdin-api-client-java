package com.crowdin.client.translations.model;

import com.crowdin.client.core.model.EnumConverter;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class PreTranslation {

    private String identifier;

    private Status status;

    private Integer progress;

    private Attributes attributes;

    private Date createdAt;

    private Date updatedAt;

    private String startedAt;

    private String finishedAt;

    @Data
    public static class Attributes {

        private List<String> languageIds;

        private List<Long> fileIds;

        private String method;

        private String autoApproveOption;

        private Boolean duplicateTranslations;

        private Boolean skipApprovedTranslations;

        private Boolean translateUntranslatedOnly;

        private Boolean translateWithPerfectMatchOnly;
    }

    public enum Status implements EnumConverter<Status> {

        CREATED("created"), IN_PROGRESS("in_progress"), CANCELED("canceled"), FAILED("failed"), FINISHED("finished");

        private String value;

        Status(String value) {
            this.value = value;
        }

        public static Status from(String value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Object to(Status v) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
