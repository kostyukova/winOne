package com.my.service.config;

import java.io.Serializable;

public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    public JwtRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

}
