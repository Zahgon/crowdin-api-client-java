package com.crowdin.client.users;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.users.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class UsersApi extends CrowdinApi {

    public UsersApi(Credentials credentials) {
        super(credentials);
    }

    public UsersApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * List group managers. For Crowdin Enterprise only
     * @param groupId Group Identifier. Get via List Groups
     * @param teamIds Defines team ids. It can be one team id or a list of comma-separated ones.
     * @param orderBy
     * @return list of group managers
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.managers.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<GroupManager> listGroupManagers(Long groupId, List<Long> teamIds, String orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * List group managers. For Crowdin Enterprise only
     * @param groupId Group Identifier. Get via List Groups
     * @param params ListGroupManagersParams
     * @return list of group managers
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.managers.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<GroupManager> listGroupManagers(Long groupId, ListGroupManagersParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Update group managers. For Crowdin Enterprise only
     * @param groupId group identifier
     * @param request request object
     * @return list of updated group managers
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.managers.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<GroupManager> updateGroupManagers(Long groupId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get group manager. For Crowdin Enterprise only
     * @param groupId group identifier
     * @param userId user identifier
     * @return group manager
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.managers.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GroupManager> getGroupManager(Long groupId, Long userId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * List project members. For Crowdin Enterprise only
     * @param projectId Project Identifier. Get via List Projects
     * @param search Search users by firstName, lastName or username
     * @param languageId Language Identifier. Get via Project Target Languages
     * @param workflowStepId Workflow Step Identifier. Get via List Workflow Steps
     * @param limit A maximum number of items to retrieve
     * @param offset A starting offset in the collection
     * @return list of project members
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.members.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<ProjectMember> listProjectMembersEnterprise(Long projectId, String search, String languageId, Long workflowStepId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * List project members. For Crowdin Enterprise only
     * @param projectId Project Identifier. Get via List Projects
     * @param search Search users by firstName, lastName or username
     * @param languageId Language Identifier. Get via Project Target Languages
     * @param workflowStepId Workflow Step Identifier. Get via List Workflow Steps
     * @param limit A maximum number of items to retrieve
     * @param offset A starting offset in the collection
     * @param orderBy list of OrderByField
     * @return list of project members
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.members.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<ProjectMember> listProjectMembersEnterprise(Long projectId, String search, String languageId, Long workflowStepId, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request object
     * @return project team members response info
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.members.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ProjectMembersResponse addProjectMember(Long projectId, AddProjectMemberRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param memberId member identifier
     * @return project member info
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.members.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ProjectMember> getProjectMemberPermissions(Long projectId, Long memberId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param memberId member identifier
     * @param request request object
     * @return updated project member info
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.members.put" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ProjectMember> replaceProjectMemberPermissions(Long projectId, Long memberId, ReplaceProjectMemberPermissionsRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param memberId member identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.members.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteMemberFromProject(Long projectId, Long memberId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param status filter by status
     * @param search search users by firstName, lastName, username, or email (2 or more characters)
     * @param twoFactor filter by two-factor authentication status
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of users
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<User> listUsers(Status status, String search, TwoFactor twoFactor, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param status filter by status
     * @param search search users by firstName, lastName, username, or email (2 or more characters)
     * @param twoFactor filter by two-factor authentication status
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of users
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<User> listUsers(Status status, String search, TwoFactor twoFactor, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param params ListUsersParams
     * @return list of teams
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<User> listUsers(ListUsersParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return invited user
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<User> inviteUser(InviteUserRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @return user
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.getById" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<User> getUser(Long userId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteUser(Long userId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId  user identifier
     * @param request request object
     * @return updated user
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<User> editUser(Long userId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return current authenticated user
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.user.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.user.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<User> getAuthenticatedUser() throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param search search users by firstName, lastName, username, or email (2 or more characters)
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of team members
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.members.getMany" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<TeamMember> listProjectMembers(Long projectId, String search, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param search search users by firstName, lastName, username, or email (2 or more characters)
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of team members
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.members.getMany" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<TeamMember> listProjectMembers(Long projectId, String search, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param memberId member identifier
     * @return team member
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.members.get" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TeamMember> getMemberInfo(Long projectId, Long memberId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
