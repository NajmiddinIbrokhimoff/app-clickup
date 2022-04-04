package uz.ibrokhimoff.appclickup.entity.template;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class AbstractLong extends AbstractMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
