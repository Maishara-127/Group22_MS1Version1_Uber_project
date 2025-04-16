package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.util.ArrayList;

public class SecurityLogs {

    private ArrayList<String> logList;

    public SecurityLogs() {
        logList = new ArrayList<>();
        logList.add("User 'admin' logged in at 12:30.");
        logList.add("Suspicious activity detected by user 'guest'.");
        logList.add("Settings changed by user 'admin'.");
        logList.add("Login failed attempt by 'driver123'.");
        logList.add("System shutdown by user 'admin'.");
    }

    public ArrayList<String> getLogList() {
        return logList;
    }

    public void setLogList(ArrayList<String> logList) {
        this.logList = logList;
    }

    @Override
    public String toString() {
        return "SecurityLogs{" +
                "logList=" + logList +
                '}';
    }

    public String getSecurityLogs() {
        String logs = "";
        for (String log : logList) {
            logs += log + "\n";
        }
        return logs;
    }

    public String filterLogs(String criteria) {
        String filteredLogs = "";
        for (String log : logList) {
            if (log.contains(criteria)) {
                filteredLogs += log + "\n";
            }
        }
        if (filteredLogs.equals("")) {
            filteredLogs = "No logs found.";
        }
        return filteredLogs;
    }
}
