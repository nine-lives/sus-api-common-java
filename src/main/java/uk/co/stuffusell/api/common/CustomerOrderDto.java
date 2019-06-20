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
    private String customerUuid;
    private String brand;
    private int orderCount;
    private String orderUuid;
    private String firstName;
    private String primaryEmail;
    private String payeeName;
    private String orderId;
    private List<CustomerItemDto> items;
    private String status;
    private String statusDisplay;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate bookedDate;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate receivedDate;
    private BigDecimal balance;
    private BigDecimal availableBalance;
    private BigDecimal paymentsTotal;
    private boolean paymentRequested;
    private BigDecimal minPartialPaymentAmount;
    private boolean canRequestPayment;
    private boolean canShowLedger;

    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String county;
    private String postcode;
    private String country;
    private String countryIso3;

    private int labelCount;

    public String getCustomerUuid() {
        return customerUuid;
    }

    public CustomerOrderDto withCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CustomerOrderDto withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public CustomerOrderDto withOrderCount(int orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public CustomerOrderDto withOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerOrderDto withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public CustomerOrderDto withPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public CustomerOrderDto withPayeeName(String payeeName) {
        this.payeeName = payeeName;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public CustomerOrderDto withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public CustomerOrderDto withAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }

    public BigDecimal getPaymentsTotal() {
        return paymentsTotal;
    }

    public CustomerOrderDto withPaymentsTotal(BigDecimal paymentsTotal) {
        this.paymentsTotal = paymentsTotal;
        return this;
    }

    public boolean isPaymentRequested() {
        return paymentRequested;
    }

    public CustomerOrderDto withPaymentRequested(boolean paymentRequested) {
        this.paymentRequested = paymentRequested;
        return this;
    }

    public BigDecimal getMinPartialPaymentAmount() {
        return minPartialPaymentAmount;
    }

    public CustomerOrderDto withMinPartialPaymentAmount(BigDecimal minPartialPaymentAmount) {
        this.minPartialPaymentAmount = minPartialPaymentAmount;
        return this;
    }

    public boolean isCanRequestPayment() {
        return canRequestPayment;
    }

    public CustomerOrderDto withCanRequestPayment(boolean canRequestPayment) {
        this.canRequestPayment = canRequestPayment;
        return this;
    }

    public boolean isCanShowLedger() {
        return canShowLedger;
    }

    public CustomerOrderDto withCanShowLedger(boolean canShowLedger) {
        this.canShowLedger = canShowLedger;
        return this;
    }

    public String getAddress1() {
        return address1;
    }

    public CustomerOrderDto withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public String getAddress2() {
        return address2;
    }

    public CustomerOrderDto withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public String getAddress3() {
        return address3;
    }

    public CustomerOrderDto withAddress3(String address3) {
        this.address3 = address3;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CustomerOrderDto withCity(String city) {
        this.city = city;
        return this;
    }

    public String getCounty() {
        return county;
    }

    public CustomerOrderDto withCounty(String county) {
        this.county = county;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public CustomerOrderDto withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public CustomerOrderDto withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountryIso3() {
        return countryIso3;
    }

    public CustomerOrderDto withCountryIso3(String countryIso3) {
        this.countryIso3 = countryIso3;
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
