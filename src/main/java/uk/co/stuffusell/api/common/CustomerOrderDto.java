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
    private List<CustomerItemDto> items;
    private boolean canShowLedger;

    private int labelCount;

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

    /**
     @deprecated getCustomer().getCustomerUuid()
     **/
    @Deprecated
    public String getCustomerUuid() {
        return customer.getCustomerUuid();
    }

    /**
     @deprecated getCustomer().getBrand()
     **/
    @Deprecated
    public String getBrand() {
        return customer.getBrand();
    }

    /**
     @deprecated getCustomer().getOrderCount()
     **/
    @Deprecated
    public int getOrderCount() {
        return customer.getOrderCount();
    }

    /**
     @deprecated getCustomer().getFirstName()
     **/
    @Deprecated
    public String getFirstName() {
        return customer.getFirstName();
    }

    /**
     @deprecated getCustomer().getPrimaryEmail()
     **/
    @Deprecated
    public String getPrimaryEmail() {
        return customer.getPrimaryEmail();
    }

    /**
     @deprecated getCustomer().getPayeeName()
     **/
    @Deprecated
    public String getPayeeName() {
        return customer.getPayeeName();
    }

    /**
     @deprecated getBalances().getBalance()
     **/
    @Deprecated
    public BigDecimal getBalance() {
        return customer.getBalances().getBalance();
    }

    /**
     @deprecated getBalances().getAvailableBalance()
     **/
    @Deprecated
    public BigDecimal getAvailableBalance() {
        return customer.getBalances().getAvailableBalance();
    }

    /**
     @deprecated getBalances().getPaymentsTotal()
     **/
    @Deprecated
    public BigDecimal getPaymentsTotal() {
        return customer.getBalances().getPaymentsBalance();
    }

    /**
     @deprecated getCustomer().isPaymentRequested()
     **/
    @Deprecated
    public boolean isPaymentRequested() {
        return customer.isPaymentRequested();
    }

    /**
     @deprecated getCustomer().getMinPartialPaymentAmount()
     **/
    @Deprecated
    public BigDecimal getMinPartialPaymentAmount() {
        return customer.getMinPartialPaymentAmount();
    }

    /**
     @deprecated getCustomer().isCanRequestPayment()
     **/
    @Deprecated
    public boolean isCanRequestPayment() {
        return customer.isCanRequestPayment();
    }

    /**
     @deprecated getCustomer().getAddress1()
     **/
    @Deprecated
    public String getAddress1() {
        return customer.getAddress1();
    }

    /**
     @deprecated getCustomer().getAddress2()
     **/
    @Deprecated
    public String getAddress2() {
        return customer.getAddress2();
    }

    /**
     @deprecated getCustomer().getAddress3()
     **/
    @Deprecated
    public String getAddress3() {
        return customer.getAddress3();
    }

    /**
     @deprecated getCustomer().getCity()
     **/
    @Deprecated
    public String getCity() {
        return customer.getCity();
    }

    /**
     @deprecated getCustomer().getCounty()
     **/
    @Deprecated
    public String getCounty() {
        return customer.getCounty();
    }

    /**
     @deprecated getCustomer().getPostcode()
     **/
    @Deprecated
    public String getPostcode() {
        return customer.getPostcode();
    }

    /**
     @deprecated getCustomer().getCountry()
     **/
    @Deprecated
    public String getCountry() {
        return customer.getCountry();
    }

    /**
     @deprecated getCustomer().getCountryIso3()
     **/
    @Deprecated
    public String getCountryIso3() {
        return customer.getCountryIso3();
    }
}
