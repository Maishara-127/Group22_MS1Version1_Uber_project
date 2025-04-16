package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.FileWriter;
import java.io.IOException;

public class SystemUptime {
    private String uptimePercentage;
    private String uptimeMessage;

    public SystemUptime(String uptimePercentage, String uptimeMessage) {
        this.uptimePercentage = uptimePercentage;
        this.uptimeMessage = uptimeMessage;
    }

    public String getUptimePercentage() {
        return uptimePercentage;
    }
    public String getUptimeMessage() {
        return uptimeMessage;
    }

    public void setUptimePercentage(String uptimePercentage) {
        this.uptimePercentage = uptimePercentage;
    }

    public void setUptimeMessage(String uptimeMessage) {
        this.uptimeMessage = uptimeMessage;
    }

    public boolean saveReportToFile(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("System Uptime Report\n");
            writer.write("Uptime: " + uptimePercentage + "\n");
            writer.write("Status: " + uptimeMessage + "\n");
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
