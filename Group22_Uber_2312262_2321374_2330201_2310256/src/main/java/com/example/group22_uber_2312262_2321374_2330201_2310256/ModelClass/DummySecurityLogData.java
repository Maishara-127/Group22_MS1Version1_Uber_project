package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.util.ArrayList;

public class DummySecurityLogData {
    public static ArrayList<SecurityLogEntry> getLogs() {
        ArrayList<SecurityLogEntry> logs = new ArrayList<>();
        logs.add(new SecurityLogEntry("User 'admin' logged in."));
        logs.add(new SecurityLogEntry("Suspicious activity by user 'guest'."));
        logs.add(new SecurityLogEntry("Settings changed by 'admin'."));
        logs.add(new SecurityLogEntry("Login failed for 'driver123'."));
        logs.add(new SecurityLogEntry("System shutdown by 'admin'."));
        return logs;
    }
}


