package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.UserEngagementTrend;

import java.time.LocalDate;
import java.util.ArrayList;


public class DummyEngagementData {
    public static ArrayList<UserEngagementTrend> getDummyTrends() {
        ArrayList<UserEngagementTrend> list = new ArrayList<>();

        list.add(new UserEngagementTrend("Nujat", LocalDate.now().minusDays(2), 35.5));
        list.add(new UserEngagementTrend("Maishara", LocalDate.now().minusDays(1), 20.0));
        list.add(new UserEngagementTrend("Hasib", LocalDate.now(), 15.2));

        return list;
    }
}
