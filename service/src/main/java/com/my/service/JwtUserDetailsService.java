package com.my.service;

import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // FIXME actual implementation form JPA DAO
        return new User(username, "$2a$10$fk0z45vDYLNv8ca7fa7ZlO8O1pGyWoBXxgjgsrPGGZLUIZB3EB4xC",
                Collections.singleton(new SimpleGrantedAuthority("USER")));
    }
}
