package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.util.ArrayList;

public class DummyRegisteredUserData {
    public static ArrayList<RegisteredUser> getFakeUsers(String userType) {
        ArrayList<RegisteredUser> registeredDriver = new ArrayList<>();
        ArrayList<RegisteredUser> registerePassenger = new ArrayList<>();

        if (userType.equals("Driver")) {
            registeredDriver.add(new RegisteredUser("Asif", "id11", "Driver"));
            registeredDriver.add(new RegisteredUser("Rahim", "1d12", "Driver"));
            return registeredDriver;
        } else if (userType.equals("Passenger")) {
            registerePassenger.add(new RegisteredUser("Karim", "id13", "Passenger"));
            registerePassenger.add(new RegisteredUser("Shafiq", "id14", "Passenger"));
            return registerePassenger;
        }

        return new ArrayList<>();
    }
}
