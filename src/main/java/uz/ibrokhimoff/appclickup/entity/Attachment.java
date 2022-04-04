package uz.ibrokhimoff.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.ibrokhimoff.appclickup.entity.template.AbstractUUID;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attachment extends AbstractUUID  {
    private String name;

    private String originalName;

    private Long size;

    private String contentType;

}
