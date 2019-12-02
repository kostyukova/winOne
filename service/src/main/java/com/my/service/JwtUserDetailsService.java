package com.my.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // FIXME actual implementation form JPA DAO
        return new JwtUserPrincipal(username, username + "Pass");
    }

    private static class JwtUserPrincipal implements UserDetails {

        private static final long serialVersionUID = -2963861100111808571L;
        private final String password;
        private final String username;

        public JwtUserPrincipal(final String username, final String password) {
            this.username = username;
            this.password = password;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            // FIXME implementation
            return Collections.emptyList();
        }

        @Override
        public String getPassword() {
            // FIXME actual implementation
            return password;
        }

        @Override
        public String getUsername() {
            // FIXME actual implementation user from JPA
            return username;
        }

        @Override
        public boolean isAccountNonExpired() {
            return false;
        }

        @Override
        public boolean isAccountNonLocked() {
            return false;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return false;
        }

        @Override
        public boolean isEnabled() {
            return false;
        }

    }
}
