package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class DiscountCode {
    private String discountCode;
    private float discountPercentage;

    public DiscountCode(String discountCode, float discountPercentage) {
        this.discountCode = discountCode;
        this.discountPercentage = discountPercentage;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "DiscountCode{" +
                "code='" + discountCode + '\'' +
                ", percentage=" + discountPercentage +
                '}';
    }
}
