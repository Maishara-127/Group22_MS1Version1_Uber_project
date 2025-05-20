package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DummyEngagementData {
    public static ArrayList<UserEngagementTrend> getDummyTrends() {
        ArrayList<UserEngagementTrend> list = new ArrayList<>();
        LocalDate date = LocalDate.getValue();
        list.add(new UserEngagementTrend("Nujat", date, 35));
        list.add(new UserEngagementTrend("Maishara", date, 20));
        list.add(new UserEngagementTrend("Hasib", date, 15));
        return list;
    }
}
