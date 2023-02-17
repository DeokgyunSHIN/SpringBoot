package com.example.hello.dto;

public class UserRequest {

    private String user;
    private String email;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "user='" + user + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
