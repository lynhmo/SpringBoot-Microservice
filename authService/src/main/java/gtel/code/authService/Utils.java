package gtel.code.authService;

import gtel.code.authService.model.ERole;
import gtel.code.authService.model.Role;
import gtel.code.authService.repo.RoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Utils {

    @Autowired
    private RoleRepository roleRepository;

    @Bean
    @PostConstruct
    public void createRole(){
//        roleRepository.save(new Role(ERole.ROLE_ADMIN));
//        roleRepository.save(new Role(ERole.ROLE_MODERATOR));
//        roleRepository.save(new Role(ERole.ROLE_USER));
    }
}
