package com.crowdin.client.teams.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class AddTeamMembersResponseInternal {

    private List<TeamMemberResponseObject> skipped;

    private List<TeamMemberResponseObject> added;

    private Pagination pagination;

    public static AddTeamMembersResponse to(AddTeamMembersResponseInternal addTeamMembersResponseInternal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
