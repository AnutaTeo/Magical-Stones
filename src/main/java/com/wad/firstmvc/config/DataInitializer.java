package com.wad.firstmvc.config;

import com.wad.firstmvc.domain.Role;
import com.wad.firstmvc.domain.User;
import com.wad.firstmvc.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByUsername("admin").isEmpty()) {
                User admin = new User("admin", passwordEncoder.encode("admin123"), Role.ADMIN);
                userRepository.save(admin);
                System.out.println("Created ADMIN user: admin / admin123");
            }

            if (userRepository.findByUsername("user").isEmpty()) {
                User user = new User("user", passwordEncoder.encode("user123"), Role.USER);
                userRepository.save(user);
                System.out.println("Created USER: user / user123");
            }
        };
    }
}