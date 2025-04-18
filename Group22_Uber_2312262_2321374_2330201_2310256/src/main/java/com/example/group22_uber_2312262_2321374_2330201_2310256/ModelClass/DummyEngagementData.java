package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DummyEngagementData {
    public static ArrayList<UserEngagementTrend> getDummyTrends() {
        ArrayList<UserEngagementTrend> list = new ArrayList<>();
        LocalDate today = LocalDate.now();
        list.add(new UserEngagementTrend("Nujat", today, 35));
        list.add(new UserEngagementTrend("Maishara", today, 20));
        list.add(new UserEngagementTrend("Hasib", today, 15));
        return list;
    }
}
