package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.Serializable;

public class UptimeReport implements Serializable {
    private String percentage;
    private String message;

    public UptimeReport(String percentage, String message) {
        this.percentage = percentage;
        this.message = message;
    }

    public String getUptimePercentage() {
        return percentage;
    }

    public String getUptimeMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Uptime: " + percentage + " | Status: " + message;
    }
}
