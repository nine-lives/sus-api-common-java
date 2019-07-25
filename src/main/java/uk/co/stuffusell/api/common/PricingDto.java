package uk.co.stuffusell.api.common;

import java.math.BigDecimal;

public class PricingDto {
    private BigDecimal lowerRate;
    private BigDecimal upperRate;
    private BigDecimal rateBoundary;
    private BigDecimal withdrawalFee;
    private BigDecimal minimumPriceSmall;
    private BigDecimal minimumPriceLarge;
    private boolean hasTransactionFees;
    private boolean hasHardCommission;
    private BigDecimal marketPlaceCommission;
    private BigDecimal marketPlaceFeeMax;
    private BigDecimal paymentCommission;
    private BigDecimal paymentFixedFee;
    private BigDecimal postageFeeSmall;
    private BigDecimal postageFeeMedium;
    private BigDecimal postageFeeLarge;

    public BigDecimal getLowerRate() {
        return lowerRate;
    }

    public PricingDto withLowerRate(BigDecimal lowerRate) {
        this.lowerRate = lowerRate;
        return this;
    }

    public BigDecimal getUpperRate() {
        return upperRate;
    }

    public PricingDto withUpperRate(BigDecimal upperRate) {
        this.upperRate = upperRate;
        return this;
    }

    public BigDecimal getRateBoundary() {
        return rateBoundary;
    }

    public PricingDto withRateBoundary(BigDecimal rateBoundary) {
        this.rateBoundary = rateBoundary;
        return this;
    }

    public BigDecimal getWithdrawalFee() {
        return withdrawalFee;
    }

    public PricingDto withWithdrawalFee(BigDecimal withdrawalFee) {
        this.withdrawalFee = withdrawalFee;
        return this;
    }

    public BigDecimal getMinimumPriceSmall() {
        return minimumPriceSmall;
    }

    public PricingDto withMinimumPriceSmall(BigDecimal minimumPriceSmall) {
        this.minimumPriceSmall = minimumPriceSmall;
        return this;
    }

    public BigDecimal getMinimumPriceLarge() {
        return minimumPriceLarge;
    }

    public PricingDto withMinimumPriceLarge(BigDecimal minimumPriceLarge) {
        this.minimumPriceLarge = minimumPriceLarge;
        return this;
    }

    public boolean isHasTransactionFees() {
        return hasTransactionFees;
    }

    public PricingDto withHasTransactionFees(boolean hasTransactionFees) {
        this.hasTransactionFees = hasTransactionFees;
        return this;
    }

    public boolean isHasHardCommission() {
        return hasHardCommission;
    }

    public PricingDto withHasHardCommission(boolean hasHardCommission) {
        this.hasHardCommission = hasHardCommission;
        return this;
    }

    public BigDecimal getMarketPlaceCommission() {
        return marketPlaceCommission;
    }

    public PricingDto withMarketPlaceCommission(BigDecimal marketPlaceCommission) {
        this.marketPlaceCommission = marketPlaceCommission;
        return this;
    }

    public BigDecimal getMarketPlaceFeeMax() {
        return marketPlaceFeeMax;
    }

    public PricingDto withMarketPlaceFeeMax(BigDecimal marketPlaceFeeMax) {
        this.marketPlaceFeeMax = marketPlaceFeeMax;
        return this;
    }

    public BigDecimal getPaymentCommission() {
        return paymentCommission;
    }

    public PricingDto withPaymentCommission(BigDecimal paymentCommission) {
        this.paymentCommission = paymentCommission;
        return this;
    }

    public BigDecimal getPaymentFixedFee() {
        return paymentFixedFee;
    }

    public PricingDto withPaymentFixedFee(BigDecimal paymentFixedFee) {
        this.paymentFixedFee = paymentFixedFee;
        return this;
    }

    public BigDecimal getPostageFeeSmall() {
        return postageFeeSmall;
    }

    public PricingDto withPostageFeeSmall(BigDecimal postageFeeSmall) {
        this.postageFeeSmall = postageFeeSmall;
        return this;
    }

    public BigDecimal getPostageFeeMedium() {
        return postageFeeMedium;
    }

    public PricingDto withPostageFeeMedium(BigDecimal postageFeeMedium) {
        this.postageFeeMedium = postageFeeMedium;
        return this;
    }

    public BigDecimal getPostageFeeLarge() {
        return postageFeeLarge;
    }

    public PricingDto withPostageFeeLarge(BigDecimal postageFeeLarge) {
        this.postageFeeLarge = postageFeeLarge;
        return this;
    }
}
