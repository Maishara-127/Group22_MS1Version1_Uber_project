package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CheckAppVersion {
    private String currentVersion;

    public CheckAppVersion() {
        this.currentVersion = "v1.0";
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Override
    public String toString() {
        return "CheckAppVersion{" +
                "currentVersion='" + currentVersion + '\'' +
                '}';
    }

    public String checkForUpdates() {
        String latestVersion = readVersionFromFile();
        if (latestVersion != null) {
            if (currentVersion.equals(latestVersion)) {
                return "You are using the latest version.";
            } else {
                return "Update available: " + latestVersion;
            }
        } else {
            return "Failed to check for updates.";
        }
    }

    private String readVersionFromFile() {
        File f = new File("version.txt");
        try (Scanner sc = new Scanner(new FileReader(f))) {
            return sc.next();
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}
