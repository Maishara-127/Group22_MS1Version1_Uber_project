package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;
import java.util.ArrayList;

public class DummyUserInfo {
    private static ArrayList<UserInfo> userList = new ArrayList<>();

    static {

        userList.add(new UserInfo("Nujat", "123", "nujatehasnat@uber.com", "Fleet Manager"));
        userList.add(new UserInfo("Arif", "456", "arif@uber.com", "System Administrator"));
    }

    public static UserInfo getUserByIdOrEmail(String input) {
        for (UserInfo user : userList) {
            if (user.getId().equals(input) || user.getEmail().equals(input)) {
                return user;
            }
        }
        return null;
    }

    public static ArrayList<String> getAllEmails() {
        ArrayList<String> emails = new ArrayList<>();
        for (UserInfo user : userList) {
            emails.add(user.getEmail());
        }
        return emails;
    }
}
