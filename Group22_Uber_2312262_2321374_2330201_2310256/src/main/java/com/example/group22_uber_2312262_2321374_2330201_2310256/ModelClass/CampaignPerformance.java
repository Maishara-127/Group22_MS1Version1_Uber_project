package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.time.LocalDate;

public class CampaignPerformance {

    private Integer likes;
    private Integer comments;
    private LocalDate dateRange;

    public CampaignPerformance(Integer likes, Integer comments, LocalDate dateRange) {
        this.likes = likes;
        this.comments = comments;
        this.dateRange = dateRange;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public LocalDate getDateRange() {
        return dateRange;
    }

    public void setDateRange(LocalDate dateRange) {
        this.dateRange = dateRange;
    }

    @Override
    public String toString() {
        return "CampaignPerformance{" +
                "likes=" + likes +
                ", comments=" + comments +
                ", dateRange=" + dateRange +
                '}';
    }


    public boolean filterByDateRange(LocalDate fromDate, LocalDate toDate) {
        if (fromDate == null || toDate == null) {
            return true;
        }
        return (dateRange.isEqual(fromDate) || dateRange.isAfter(fromDate)) && (dateRange.isEqual(toDate) || dateRange.isBefore(toDate));
    }
}
