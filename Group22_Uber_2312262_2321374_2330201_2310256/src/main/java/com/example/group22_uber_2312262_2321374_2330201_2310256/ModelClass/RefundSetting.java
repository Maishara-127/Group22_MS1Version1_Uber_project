package com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;

public class RefundSetting {
    private boolean instantRefundEnabled;


    public RefundSetting(boolean instantRefundEnabled) {
        this.instantRefundEnabled = instantRefundEnabled;
    }

    public boolean isInstantRefundEnabled() {
        return instantRefundEnabled;
    }

    public void setInstantRefundEnabled(boolean instantRefundEnabled) {
        this.instantRefundEnabled = instantRefundEnabled;
    }

    @Override
    public String toString() {
        return "RefundSetting{" +
                "instantRefundEnabled=" + instantRefundEnabled +
                '}';
    }

    public String simulateRefund() {
        if (instantRefundEnabled) {
            return "Test refund successful and notification sent.";
        } else {
            return "Instant refund is disabled. Enable it first.";
        }
    }
}
