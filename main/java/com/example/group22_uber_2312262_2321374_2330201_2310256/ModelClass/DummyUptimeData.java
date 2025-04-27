package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.Serializable;

public class DummyUptimeData implements Serializable {
    public static UptimeReport getDummyUptimeReport() {
        return new UptimeReport("99.9%", "No major outage detected.");
    }
}
