package uz.ibrokhimoff.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.ibrokhimoff.appclickup.entity.enums.WorkspacePermissionName;
import uz.ibrokhimoff.appclickup.entity.enums.WorkspaceRoleName;
import uz.ibrokhimoff.appclickup.entity.template.AbstractUUID;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission extends AbstractUUID {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private WorkspaceRole workspaceRole;//orinbosar


    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permission;//add/remove member

}
