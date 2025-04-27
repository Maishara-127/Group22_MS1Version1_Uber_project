package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.util.List;

public class EmailCampaign {
    private String campaignID, content;
    private List<String> recipients;
    private boolean isValid, isSent;

    public EmailCampaign(String campaignID, String content, List<String> recipients, boolean isValid, boolean isSent) {
        this.campaignID = campaignID;
        this.content = content;
        this.recipients = recipients;
        this.isValid = isValid;
        this.isSent = isSent;
    }

    public String getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(String campaignID) {
        this.campaignID = campaignID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        this.isSent = sent;
    }

    @Override
    public String toString() {
        return "EmailCampaign{" +
                "campaignID='" + campaignID + '\'' +
                ", content='" + content + '\'' +
                ", recipients=" + recipients +
                ", isValid=" + isValid +
                ", isSent=" + isSent +
                '}';
    }
}
