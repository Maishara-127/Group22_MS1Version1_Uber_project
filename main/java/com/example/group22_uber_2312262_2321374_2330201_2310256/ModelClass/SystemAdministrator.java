package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SystemAdministrator implements Serializable {

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

    public void backupImportantFile(File selectedFile) {
        Scanner scanner = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            scanner = new Scanner(selectedFile);
            fos = new FileOutputStream(selectedFile.getName() + "_backup");
            oos = new ObjectOutputStream(fos);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                oos.writeObject(line);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }
    public String optimizePaymentProcessing(boolean isInstantRefundEnabled) {
        if (isInstantRefundEnabled) {
            return  "Refund processed instantly.";
        } else {
            return "Refund will be processed later.";
        }

    }

    public boolean manageUserAccess(UserInfo user, String newRole) {
        if (user != null && newRole != null && !newRole.isEmpty()) {
            user.setRole(newRole);
            return true;
        } else {
            return false;
        }
    }

    public boolean checkSystemUptime(UptimeReport report, File reportFile) {
        try (FileOutputStream fos = new FileOutputStream(reportFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
             oos.writeObject(report);
            return true;
        } catch (Exception e) {
            System.out.println( e.getMessage());
            return false;
        }
    }

    public String checkAppVersionAndUpdate() {
        CheckAppVersion appVersion = new CheckAppVersion();
        return appVersion.checkForUpdates();
    }

    public String checkSecurityLogs(String criteria) {
        ArrayList<SecurityLogEntry> logs = DummySecurityLogData.getLogs();
        String result = " ";

        for (SecurityLogEntry log : logs) {
            if (criteria == null || log.getLog().contains(criteria)) {
                result += log.getLog() + "\n";
            }
        }
        return result;
    }

    public boolean reduceAppDataConsumption(boolean lowDataMode){
        if(lowDataMode){
            return true;
        }
        return false;

    }
    public ArrayList<RegisteredUser> displayRegisteredDeriversAndPassengers(String type){
        return DummyRegisteredUserData.getFakeUsers(type);
    }
}