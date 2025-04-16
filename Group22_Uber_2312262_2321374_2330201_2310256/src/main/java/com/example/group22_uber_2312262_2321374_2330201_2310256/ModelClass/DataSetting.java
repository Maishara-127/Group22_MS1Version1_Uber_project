package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class DataSetting {
    private boolean lowDataMode;

    public DataSetting(boolean lowDataMode) {

        this.lowDataMode = lowDataMode;
    }

    public boolean isLowDataMode() {
        return lowDataMode;
    }

    public void setLowDataMode(boolean lowDataMode) {

        this.lowDataMode = lowDataMode;
    }

    @Override
    public String toString() {
        return "DataSetting{" +
                "lowDataMode=" + lowDataMode +
                '}';
    }

    public String getDataUsageReport() {
        if (lowDataMode) {
            return "Estimated data saved: 45%";
        } else {
            return "Low Data Mode is off. No data saved.";
        }
    }
}
