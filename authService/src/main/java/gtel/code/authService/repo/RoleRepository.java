package gtel.code.authService.repo;

import gtel.code.authService.model.ERole;
import gtel.code.authService.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}