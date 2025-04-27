package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class SocialMediaLink {
    private String platformName;
    private String url;


    public SocialMediaLink(String platformName, String url) {
        this.platformName = platformName;
        this.url = url;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SocialMediaLink{" +
                "platformName='" + platformName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

}
