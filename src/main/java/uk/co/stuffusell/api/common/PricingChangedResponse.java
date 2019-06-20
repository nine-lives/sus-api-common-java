package uk.co.stuffusell.api.common;

public class PricingChangedResponse {
    private boolean hasPricingChanged;

    private PricingChangedResponse() {

    }

    public PricingChangedResponse(boolean hasPricingChanged) {
        this.hasPricingChanged = hasPricingChanged;
    }

    public boolean isHasPricingChanged() {
        return hasPricingChanged;
    }
}
