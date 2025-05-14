package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.io.Serializable;
import java.time.LocalDate;

public class UserEngagementTrend implements Serializable {
    private String passengerName;
    private LocalDate rideDate;
    private double rideDurationInMinutes;

    public UserEngagementTrend(String passengerName, LocalDate rideDate, double rideDurationInMinutes) {
        this.passengerName = passengerName;
        this.rideDate = rideDate;
        this.rideDurationInMinutes = rideDurationInMinutes;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public LocalDate getRideDate() {
        return rideDate;
    }

    public double getRideDurationInMinutes() {
        return rideDurationInMinutes;
    }
}
