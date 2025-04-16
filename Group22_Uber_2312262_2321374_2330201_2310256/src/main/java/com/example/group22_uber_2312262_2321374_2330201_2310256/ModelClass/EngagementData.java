package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.time.LocalDate;

public class EngagementData {
    private LocalDate date;
    private String metricName;
    private String value;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EngagementData(LocalDate date, String metricName, String value) {
        this.date = date;
        this.metricName = metricName;
        this.value = value;


    }

    @Override
    public String toString() {
        return "EngagementData{" +
                "date=" + date +
                ", metricName='" + metricName + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
