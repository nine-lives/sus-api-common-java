package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
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
