package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;
import java.util.ArrayList;


public class UserDummyClass {
    private static ArrayList<User> userList = new ArrayList<User>();

    static {
        userList.add(new User("Nujat", "123", "nujatehasnat@uber.com", "Marketing Executive"));
        userList.add(new User("Arif", "456", "arif@uber.com", "System Administrator"));
        userList.add(new User("Rima", "789", "rima@uber.com", "Passenger"));
        userList.add(new User("Zayed", "101", "zayed@uber.com", "Driver"));
    }


    public static User getUserByIdOrEmail(String input) {
        for (User user : userList) {
            if (user.getId().equals(input) || user.getEmail().equals(input)) {
                return user;
            }
        }
        return null;
    }
}
