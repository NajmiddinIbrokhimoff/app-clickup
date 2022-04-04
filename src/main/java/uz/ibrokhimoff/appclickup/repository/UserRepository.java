package uz.ibrokhimoff.appclickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.ibrokhimoff.appclickup.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    boolean existsByEmail(String email);
}
