package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;


public class SupportTicket {
    private String issueType;
    private String description;

    public SupportTicket(String issueType, String description) {
        this.issueType = issueType;
        this.description = description;
    }

    public String getIssueType() {

        return issueType;
    }

    public String getDescription() {

        return description;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "issueType='" + issueType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
