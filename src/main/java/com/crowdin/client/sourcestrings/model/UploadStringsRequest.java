package com.crowdin.client.sourcestrings.model;

import com.crowdin.client.sourcefiles.model.UpdateOption;
import lombok.Data;
import java.util.List;

@Data
public class UploadStringsRequest {

    private Long branchId;

    private Long storageId;

    private String type;

    private Integer parserVersion;

    private List<Long> labelIds;

    private Boolean updateStrings;

    private Boolean cleanupMode;

    private ImportOptions importOptions;

    private UpdateOption updateOption;

    public void setUpdateStrings(Boolean updateStrings) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUpdateOption(UpdateOption updateOption) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
