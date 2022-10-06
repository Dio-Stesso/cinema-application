package cinema;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role admin = new Role();
        admin.setName(Role.RoleName.ADMIN);
        roleService.add(admin);
        Role user = new Role();
        user.setName(Role.RoleName.USER);
        roleService.add(user);
        User adminUser = new User();
        adminUser.setEmail("admin@email");
        adminUser.setPassword("admin");
        adminUser.setRoles(Set.of(admin));
        userService.add(adminUser);
    }
}
