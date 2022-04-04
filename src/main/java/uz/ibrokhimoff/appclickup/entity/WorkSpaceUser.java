package uz.ibrokhimoff.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.ibrokhimoff.appclickup.entity.template.AbstractUUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpaceUser extends AbstractUUID {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Workspace workspace;//orinbosar

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRole workspaceRole;

    private Timestamp dateInvited;
    private Timestamp dateJoined;



}
