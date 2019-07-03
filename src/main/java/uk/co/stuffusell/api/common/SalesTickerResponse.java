package uk.co.stuffusell.api.common;

import java.math.BigDecimal;

public class SalesTickerResponse {
    private long baseTime;
    private BigDecimal baseTotal;
    private BigDecimal rateOfChange;
    private BigDecimal currentEstimate;

    private SalesTickerResponse() {

    }

    public SalesTickerResponse(long baseTime, BigDecimal baseTotal, BigDecimal rateOfChange, BigDecimal currentEstimate) {
        this.baseTime = baseTime;
        this.baseTotal = baseTotal;
        this.rateOfChange = rateOfChange;
        this.currentEstimate = currentEstimate;
    }

    public long getBaseTime() {
        return baseTime;
    }

    public BigDecimal getBaseTotal() {
        return baseTotal;
    }

    public BigDecimal getRateOfChange() {
        return rateOfChange;
    }

    public BigDecimal getCurrentEstimate() {
        return currentEstimate;
    }
}
