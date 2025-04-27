package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class RatingFeedback {
    private String userId;
    private int rating;
    private String feedback;

    public RatingFeedback(String userType, int rating, String feedback) {
        this.userId = userId;
        this.rating = rating;
        this.feedback = feedback;
    }

    public String getUserType() {
        return userId;
    }

    public void setUserType(String userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "RatingFeedback{" +
                "userType='" + userId + '\'' +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
