package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class SecurityLogEntry {
    private String log;

    public SecurityLogEntry(String log) {
        this.log = log;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "SecurityLogEntry{" +
                "log='" + log + '\'' +
                '}';
    }
}
