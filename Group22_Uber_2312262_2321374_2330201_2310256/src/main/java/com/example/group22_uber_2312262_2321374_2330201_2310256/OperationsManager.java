package com.example.group22_uber_2312262_2321374_2330201_2310256;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class OperationsManager implements Serializable {
    private final Integer idOperationsManager;
    private String name, designation, email;

    public OperationsManager(Integer idOperationsManager, String name, String designation, String email) {
        this.idOperationsManager = idOperationsManager;
        this.name = name;
        this.designation = designation;
        this.email = email;
    }

    public Integer getIdOperationsManager() {
        return idOperationsManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    // CUSTOM METHODS START HERE

    public Project createNewProject(String idProject, String goal, String task, String status, String problemReport, String keyMetric, LocalDate deadline, ArrayList<String> members) {
        Project p;
        p = new Project(idProject,goal,task,status,problemReport,keyMetric,deadline,members);
        return p;
    }

    public void editProject() {

    }

    
}
