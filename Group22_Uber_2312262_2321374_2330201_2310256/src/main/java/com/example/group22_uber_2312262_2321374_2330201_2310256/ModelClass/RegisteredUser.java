package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class RegisteredUser {
    private String name;
    private String userId;
    private String userType;

    public RegisteredUser(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "RegisteredUser{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
