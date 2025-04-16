package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        return "SystemAdministrator{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void backupImportantFile(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public String optimizePaymentProcessing(boolean isInstantRefundEnabled, boolean isTest) {
        if (isTest) {
            return isInstantRefundEnabled ? "Refund processed instantly." : "Refund will be processed later.";
        } else {
            return isInstantRefundEnabled ? "Instant refund enabled." : "Instant refund disabled.";
        }

    }
}