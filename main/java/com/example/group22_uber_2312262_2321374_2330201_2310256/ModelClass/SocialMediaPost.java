package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.time.LocalDateTime;

public class SocialMediaPost {
    private String platformName;
    private String content;
    private LocalDateTime dateTime;
    private boolean isScheduled;

    public SocialMediaPost(String platformName, String content, LocalDateTime dateTime, boolean isScheduled) {
        this.platformName = platformName;
        this.content = content;
        this.dateTime = dateTime;
        this.isScheduled = isScheduled;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setScheduled(boolean scheduled) {
        isScheduled = scheduled;
    }


    @Override
    public String toString() {
        return "SocialMediaPost{" +
                "platformName='" + platformName + '\'' +
                ", content='" + content + '\'' +
                ", dateTime=" + dateTime +
                ", isScheduled=" + isScheduled +
                '}';
    }

    public boolean validateSchedule() {
        if(dateTime.isAfter(LocalDateTime.now())){
            isScheduled = true;
        }
        else{
            isScheduled = false;
        }
        return isScheduled;
    }

    public void publishPost() {
        if (isScheduled= true) {

            System.out.println("Post scheduled successfully!");
        }
        else {
            System.out.println("Invalid Date!");
        }
    }

}
