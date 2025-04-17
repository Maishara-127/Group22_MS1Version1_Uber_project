package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MarketingExecutive {
    private String name;
    private Integer id;
    private String designation;
    private String email;

    public MarketingExecutive() {}

    public MarketingExecutive(String name, Integer id, String designation, String email) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MarketingExecutive{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public DiscountCode createDiscountCode(String code, float percentage) {
        if (code == null || code.isEmpty() || percentage <= 0 || percentage > 100) {
            return null;
        }

        return new DiscountCode(code, percentage);
    }

    public boolean updateSocialMediaLink(String url) {
        if (url == null || url.isEmpty()) {
            return false;
        }
        return (url.startsWith("http://") || url.startsWith("https://")) && url.endsWith(".com");
    }

    public boolean scheduleAutomatedSocialMediaPost(String platform, String content, LocalDateTime dateTime) {
        if (dateTime.isBefore(LocalDateTime.now())) {
            return false;
        }

        SocialMediaPost post = new SocialMediaPost(platform, content, dateTime, true);

        if (!post.validateSchedule()) {
            return false;
        }

        post.publishPost();
        return true;
    }
    public EmailCampaign sendEmailCampaign(String campaignID, String content, ArrayList<String> recipients){
        boolean isValid = recipients != null && !recipients.isEmpty();
        boolean isSent = false;

        if (isValid) {
            isSent = true;
        }

        return new EmailCampaign(campaignID, content, recipients, isValid, isSent);

    }

    public Promotion promoteNewService(String promotionName, String promotionDescription) {
        Promotion promotion = new Promotion(promotionName, promotionDescription, true);
        if (promotion.validatePromotion()) {
            promotion.createPromotion();
            return promotion;
        }
        return null;
    }

    public ArrayList<EngagementData> monitorUserEngagement(String metric, String value) {
        ArrayList<EngagementData> engagementDataList = new ArrayList<>();
        EngagementData data = new EngagementData(LocalDate.now(), metric, value);
        engagementDataList.add(data);
        return engagementDataList;
    }

    public ArrayList<CampaignPerformance> trackCampaignPerformance() {
        ArrayList<CampaignPerformance> campaignPerformanceList = new ArrayList<>();
        CampaignPerformance performance = new CampaignPerformance(0, 0, LocalDate.now());
        campaignPerformanceList.add(performance);
        return campaignPerformanceList;
    }

    public EngagementBudget adjustMarketingBudget(double digitalAdsBudget, double promotionsBudget) {
        if (digitalAdsBudget < 0 || promotionsBudget < 0) {
            return null;
        }
        return new EngagementBudget(digitalAdsBudget, promotionsBudget);
    }

}
