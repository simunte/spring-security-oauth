package com.oauth.demo;

import com.oauth.demo.domain.User;
import com.oauth.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class bootstrap implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Boot Start");
        this.addDefaultUser();
        System.out.println("Boot Finish");
    }

    private void addDefaultUser(){
        User user = new User();
        user.setUsername("user");
        user.setPassword(bCryptPasswordEncoder.encode("welcome1"));
        user.setEmail("user@mailinator.com");
        userRepository.save(user);
    }
}
