package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBackup {
    private File fileToBackup;

    public FileBackup(File fileToBackup) {
        this.fileToBackup = fileToBackup;
    }

    public File getFileToBackup() {
        return fileToBackup;
    }

    public void setFileToBackup(File fileToBackup) {
        this.fileToBackup = fileToBackup;
    }

    @Override
    public String toString() {
        return "FileBackup{" +
                "fileToBackup=" + fileToBackup +
                '}';
    }

    public boolean backupFile() {
        try {
            File backup = new File("backup_report.txt");
            FileWriter writer = new FileWriter(backup);
            writer.write("Backed up: " + fileToBackup.getAbsolutePath() + "\n");
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
