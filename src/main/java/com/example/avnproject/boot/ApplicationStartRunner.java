package com.example.avnproject.boot;

import com.example.avnproject.entity.User;
import com.example.avnproject.entity.UserRole;
import com.example.avnproject.repository.UserRepository;
import com.example.avnproject.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public void run(String... args) throws Exception {
        User admin = new User();
        admin.setFullName("Bakai Berdibekov");
        admin.setUsername("admin");
        admin.setEmail("bakay@gmail.com");
        admin.setPassword("admin");
        admin.setIsStatus(1L);
        String encodedPassword = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(encodedPassword);
        userRepository.save(admin);

        UserRole roleAdmin = new UserRole();
        roleAdmin.setRoleName("ROLE_ADMIN");
        roleAdmin.setUser(admin);
        userRoleRepository.save(roleAdmin);
    }
}
