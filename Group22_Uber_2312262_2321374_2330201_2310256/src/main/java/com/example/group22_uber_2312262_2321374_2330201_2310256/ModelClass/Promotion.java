package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

import java.util.ArrayList;


public class Promotion {
    private String promotionName;
    private String promotionDescription;
    private boolean isActive;

    public Promotion(String promotionName, String promotionDescription, boolean isActive) {
        this.promotionName = promotionName;
        this.promotionDescription = promotionDescription;
        this.isActive = isActive;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promotionName='" + promotionName + '\'' +
                ", promotionDescription='" + promotionDescription + '\'' +
                ", isActive=" + isActive +
                '}';
    }
    public boolean validatePromotion() {
        if (promotionName == null || promotionName.isEmpty()) {
            return false;
        }
        if (promotionDescription == null || promotionDescription.isEmpty()) {
            return false;
        }
        if (isPromotionNameDuplicate(promotionName)) {
            return false;
        }
        return true;
    }

    private static ArrayList<Promotion> promotionList = new ArrayList<>();

    private boolean isPromotionNameDuplicate(String promotionName) {
        for (Promotion promotion : promotionList) {
            if (promotion.getPromotionName().equalsIgnoreCase(promotionName)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Promotion> createPromotion() {
        if (validatePromotion()) {
            promotionList.add(this);
        }
        return promotionList;
    }
}