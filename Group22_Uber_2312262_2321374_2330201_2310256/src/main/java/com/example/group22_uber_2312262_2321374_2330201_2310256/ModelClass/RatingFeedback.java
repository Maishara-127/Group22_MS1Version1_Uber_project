package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class RatingFeedback {
    private String userType;
    private int rating;
    private String feedback;

    public RatingFeedback(String userType, int rating, String feedback) {
        this.userType = userType;
        this.rating = rating;
        this.feedback = feedback;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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
                "userType='" + userType + '\'' +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
