package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateDeserializer;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

import java.math.BigDecimal;
import java.util.List;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CustomerOrderDto {
    private CustomerDto customer;
    private String orderUuid;
    private String orderId;
    private String status;
    private String statusDisplay;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate bookedDate;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate receivedDate;
    private boolean canShowLedger;
    private int labelCount;
    private List<CustomerItemDto> items;

    public CustomerDto getCustomer() {
        return customer;
    }

    public CustomerOrderDto withCustomer(CustomerDto customer) {
        this.customer = customer;
        return this;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public CustomerOrderDto withOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public CustomerOrderDto withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<CustomerItemDto> getItems() {
        return items;
    }

    public CustomerOrderDto withItems(List<CustomerItemDto> items) {
        this.items = items;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CustomerOrderDto withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatusDisplay() {
        return statusDisplay;
    }

    public CustomerOrderDto withStatusDisplay(String statusDisplay) {
        this.statusDisplay = statusDisplay;
        return this;
    }

    public LocalDate getBookedDate() {
        return bookedDate;
    }

    public CustomerOrderDto withBookedDate(LocalDate bookedDate) {
        this.bookedDate = bookedDate;
        return this;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public CustomerOrderDto withReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
        return this;
    }

    public boolean isCanShowLedger() {
        return canShowLedger;
    }

    public CustomerOrderDto withCanShowLedger(boolean canShowLedger) {
        this.canShowLedger = canShowLedger;
        return this;
    }

    public int getLabelCount() {
        return labelCount;
    }

    public CustomerOrderDto withLabelCount(int labelCount) {
        this.labelCount = labelCount;
        return this;
    }
}
