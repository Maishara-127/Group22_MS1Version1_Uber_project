package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class SystemAdministrator {
    private String name;
    private Integer id;
    private String designation;
    private String email;

    public SystemAdministrator(String name, Integer id, String designation, String email) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MarketingExecutive{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
