package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.Serializable;

public class UserInfo implements Serializable{
    private String name;
    private String id;
    private String email;
    private String role;


    public UserInfo(String name, String id, String email, String role) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
