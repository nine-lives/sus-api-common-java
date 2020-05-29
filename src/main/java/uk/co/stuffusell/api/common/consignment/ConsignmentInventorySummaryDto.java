package uk.co.stuffusell.api.common.consignment;

import java.math.BigDecimal;

public class ConsignmentInventorySummaryDto {
    private String classifier;
    private boolean openStatus;
    private int itemCount;
    private int itemCountClosed;
    private int consignmentQuantity;
    private int receivedQuantity;
    private int quantity;
    private int quantityClosed;
    private BigDecimal consignmentRrpValue;
    private BigDecimal receivedRrpValue;
    private BigDecimal rrpValue;
    private BigDecimal rrpValueClosed;

    public String getClassifier() {
        return classifier;
    }

    public ConsignmentInventorySummaryDto withClassifier(String classifier) {
        this.classifier = classifier;
        return this;
    }

    public boolean getOpenStatus() {
        return openStatus;
    }

    public ConsignmentInventorySummaryDto withOpenStatus(boolean openStatus) {
        this.openStatus = openStatus;
        return this;
    }

    public int getItemCount() {
        return itemCount;
    }

    public ConsignmentInventorySummaryDto withItemCount(int itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    public int getItemCountClosed() {
        return itemCountClosed;
    }

    public ConsignmentInventorySummaryDto withItemCountClosed(int itemCountClosed) {
        this.itemCountClosed = itemCountClosed;
        return this;
    }

    public int getConsignmentQuantity() {
        return consignmentQuantity;
    }

    public ConsignmentInventorySummaryDto withConsignmentQuantity(int consignmentQuantity) {
        this.consignmentQuantity = consignmentQuantity;
        return this;
    }

    public int getReceivedQuantity() {
        return receivedQuantity;
    }

    public ConsignmentInventorySummaryDto withReceivedQuantity(int receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ConsignmentInventorySummaryDto withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int getQuantityClosed() {
        return quantityClosed;
    }

    public ConsignmentInventorySummaryDto withQuantityClosed(int quantityClosed) {
        this.quantityClosed = quantityClosed;
        return this;
    }

    public BigDecimal getConsignmentRrpValue() {
        return consignmentRrpValue;
    }

    public ConsignmentInventorySummaryDto withConsignmentRrpValue(BigDecimal consignmentRrpValue) {
        this.consignmentRrpValue = consignmentRrpValue;
        return this;
    }

    public BigDecimal getReceivedRrpValue() {
        return receivedRrpValue;
    }

    public ConsignmentInventorySummaryDto withReceivedRrpValue(BigDecimal receivedRrpValue) {
        this.receivedRrpValue = receivedRrpValue;
        return this;
    }

    public BigDecimal getRrpValue() {
        return rrpValue;
    }

    public ConsignmentInventorySummaryDto withRrpValue(BigDecimal rrpValue) {
        this.rrpValue = rrpValue;
        return this;
    }

    public BigDecimal getRrpValueClosed() {
        return rrpValueClosed;
    }

    public ConsignmentInventorySummaryDto withRrpValueClosed(BigDecimal rrpValueClosed) {
        this.rrpValueClosed = rrpValueClosed;
        return this;
    }
}
