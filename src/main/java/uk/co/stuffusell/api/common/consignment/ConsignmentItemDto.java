package uk.co.stuffusell.api.common.consignment;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateDeserializer;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

import java.math.BigDecimal;

public class ConsignmentItemDto {
    private String clientSku;
    private String itemBarcode;
    private String itemTitle;
    private int consignmentQuantity;
    private int receivedQuantity;
    private int rejectedQuantity;
    private BigDecimal rrp;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate triagedOn;
    private String itemStatus;
    private String queueStatus;

    public String getClientSku() {
        return clientSku;
    }

    public ConsignmentItemDto withClientSku(String clientSku) {
        this.clientSku = clientSku;
        return this;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public ConsignmentItemDto withItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
        return this;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public ConsignmentItemDto withItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }

    public int getConsignmentQuantity() {
        return consignmentQuantity;
    }

    public ConsignmentItemDto withConsignmentQuantity(int consignmentQuantity) {
        this.consignmentQuantity = consignmentQuantity;
        return this;
    }

    public int getReceivedQuantity() {
        return receivedQuantity;
    }

    public ConsignmentItemDto withReceivedQuantity(int receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
        return this;
    }

    public int getRejectedQuantity() {
        return rejectedQuantity;
    }

    public ConsignmentItemDto withRejectedQuantity(int rejectedQuantity) {
        this.rejectedQuantity = rejectedQuantity;
        return this;
    }

    public BigDecimal getRrp() {
        return rrp;
    }

    public ConsignmentItemDto withRrp(BigDecimal rrp) {
        this.rrp = rrp;
        return this;
    }

    public LocalDate getTriagedOn() {
        return triagedOn;
    }

    public ConsignmentItemDto withTriagedOn(LocalDate triagedOn) {
        this.triagedOn = triagedOn;
        return this;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public ConsignmentItemDto withItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }

    public String getQueueStatus() {
        return queueStatus;
    }

    public ConsignmentItemDto withQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
        return this;
    }
}
