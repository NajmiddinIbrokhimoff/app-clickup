package uz.ibrokhimoff.appclickup.entity.enums;

import java.util.Arrays;
import java.util.List;

public enum WorkspacePermissionName {
    CAN_ADD_OR_REMOVE_MEMBER("Add/Remove Members","Gives user permission to add remove members to the workspace", Arrays.asList(WorkspaceRoleName.ROLE_OWNER,WorkspaceRoleName.ROLE_ADMIN)),
    CAN_MANAGE_STATUS("Edit statuses","Gives permission... ",Arrays.asList(WorkspaceRoleName.ROLE_OWNER,WorkspaceRoleName.ROLE_ADMIN));

    public String name;
    public String descriptions;
    public List<WorkspaceRoleName> workspaceRoleNames;

    WorkspacePermissionName(String name, String descriptions,List<WorkspaceRoleName> workspaceRoleNames) {
        this.name = name;
        this.descriptions = descriptions;
        this.workspaceRoleNames=workspaceRoleNames;

    }

}
