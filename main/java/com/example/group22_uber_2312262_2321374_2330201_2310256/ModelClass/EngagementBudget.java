package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;


public class EngagementBudget {
    private double digitalAdsBudget;
    private double promotionsBudget;

    public EngagementBudget(double digitalAdsBudget, double promotionsBudget) {
        this.digitalAdsBudget = digitalAdsBudget;
        this.promotionsBudget = promotionsBudget;
    }

    public double getDigitalAdsBudget() {
        return digitalAdsBudget;
    }

    public void setDigitalAdsBudget(double digitalAdsBudget) {
        this.digitalAdsBudget = digitalAdsBudget;
    }

    public double getPromotionsBudget() {
        return promotionsBudget;
    }

    public void setPromotionsBudget(double promotionsBudget) {
        this.promotionsBudget = promotionsBudget;
    }

    @Override
    public String toString() {
        return "EngagementBudget{" +
                "digitalAdsBudget=" + digitalAdsBudget +
                ", promotionsBudget=" + promotionsBudget +
                '}';
    }
}
