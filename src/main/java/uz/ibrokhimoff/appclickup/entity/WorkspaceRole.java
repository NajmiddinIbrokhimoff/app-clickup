package uz.ibrokhimoff.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.ibrokhimoff.appclickup.entity.enums.WorkspaceRoleName;
import uz.ibrokhimoff.appclickup.entity.template.AbstractUUID;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspaceRole extends AbstractUUID {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Workspace workspace;


    @Column(nullable = false)
    private String name;


    @Enumerated(EnumType.STRING)
    private WorkspaceRoleName extendsRole;
}
