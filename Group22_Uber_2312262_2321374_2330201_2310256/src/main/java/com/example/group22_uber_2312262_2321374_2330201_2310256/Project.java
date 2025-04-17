package com.example.group22_uber_2312262_2321374_2330201_2310256;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Project implements Serializable {
    private final String idProject;
    private String goal, task, status, problemReport, keyMetric;
    private LocalDate deadline;
    private ArrayList<String> members;

    public Project(String idProject, String goal, String task, String status, String problemReport, String keyMetric, LocalDate deadline, ArrayList<String> members) {
        this.idProject = idProject;
        this.goal = goal;
        this.task = task;
        this.status = status;
        this.problemReport = problemReport;
        this.keyMetric = keyMetric;
        this.deadline = deadline;
        this.members = members;
    }

    public String getIdProject() {
        return idProject;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProblemReport() {
        return problemReport;
    }

    public void setProblemReport(String problemReport) {
        this.problemReport = problemReport;
    }

    public String getKeyMetric() {
        return keyMetric;
    }

    public void setKeyMetric(String keyMetric) {
        this.keyMetric = keyMetric;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }
    // this method receives an arraylist of the projects from the controller which opens the projects.bin file and sends the arraylist
    public String generateIdProject(ArrayList<Project> projectsArrayList) {
        int size;
        String id;
        size = projectsArrayList.size();
        id = "PRJ" + Integer.toString(size);
        return id;
    }
}
