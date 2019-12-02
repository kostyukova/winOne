package com.my.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SpringBootMain {

    public static void main(String[] args) {
        String rawPassword = "password";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println("password: " + encodedPassword);
        System.out.println("Matched: " + encoder.matches(rawPassword, encodedPassword));
    }
}
