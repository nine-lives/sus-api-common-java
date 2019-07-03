package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateDeserializer;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CustomerDto {
    private String customerUuid;
    private int customerId;
    private String accountUsername;
    private String brand;
    private String firstName;
    private String lastName;
    private String fullName;
    private String primaryEmail;
    private String primaryTelephone;
    private String secondaryTelephone;
    private int orderCount;
    private String ebayUserId;

    private String payeeName;
    private String vatNumber;
    private PaymentType paymentType;
    private boolean autoInvoice;
    private String bacsAccountNumber;
    private String bacsSortCode;

    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String county;
    private String postcode;
    private String country;
    private String countryIso3;

    private BigDecimal balance;
    private BigDecimal availableBalance;
    private BigDecimal paymentsTotal;
    private boolean paymentRequested;
    private BigDecimal minPartialPaymentAmount;
    private boolean canRequestPayment;
    private boolean canRequestBacsPayment;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate requestBacsPaymentDate;
    private boolean canChangeBacsDetails;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate changeBacsDetailsDate;
    private boolean hasMarketPreference;
    private boolean doNotDisturb;

    public String getCustomerUuid() {
        return customerUuid;
    }

    public CustomerDto withCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
        return this;
    }

    public int getCustomerId() {
        return customerId;
    }

    public CustomerDto withCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public CustomerDto withAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CustomerDto withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerDto withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerDto withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public CustomerDto withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public CustomerDto withPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    public String getPrimaryTelephone() {
        return primaryTelephone;
    }

    public CustomerDto withPrimaryTelephone(String primaryTelephone) {
        this.primaryTelephone = primaryTelephone;
        return this;
    }

    public String getSecondaryTelephone() {
        return secondaryTelephone;
    }

    public CustomerDto withSecondaryTelephone(String secondaryTelephone) {
        this.secondaryTelephone = secondaryTelephone;
        return this;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public CustomerDto withOrderCount(int orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    public String getEbayUserId() {
        return ebayUserId;
    }

    public CustomerDto withEbayUserId(String ebayUserId) {
        this.ebayUserId = ebayUserId;
        return this;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public CustomerDto withPayeeName(String payeeName) {
        this.payeeName = payeeName;
        return this;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public CustomerDto withVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
        return this;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public CustomerDto withPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public boolean isAutoInvoice() {
        return autoInvoice;
    }

    public CustomerDto withAutoInvoice(boolean autoInvoice) {
        this.autoInvoice = autoInvoice;
        return this;
    }

    public String getBacsAccountNumber() {
        return bacsAccountNumber;
    }

    public CustomerDto withBacsAccountNumber(String bacsAccountNumber) {
        this.bacsAccountNumber = bacsAccountNumber;
        return this;
    }

    public String getBacsSortCode() {
        return bacsSortCode;
    }

    public CustomerDto withBacsSortCode(String bacsSortCode) {
        this.bacsSortCode = bacsSortCode;
        return this;
    }

    public String getAddress1() {
        return address1;
    }

    public CustomerDto withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public String getAddress2() {
        return address2;
    }

    public CustomerDto withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public String getAddress3() {
        return address3;
    }

    public CustomerDto withAddress3(String address3) {
        this.address3 = address3;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CustomerDto withCity(String city) {
        this.city = city;
        return this;
    }

    public String getCounty() {
        return county;
    }

    public CustomerDto withCounty(String county) {
        this.county = county;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public CustomerDto withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public CustomerDto withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountryIso3() {
        return countryIso3;
    }

    public CustomerDto withCountryIso3(String countryIso3) {
        this.countryIso3 = countryIso3;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public CustomerDto withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public CustomerDto withAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }

    public BigDecimal getPaymentsTotal() {
        return paymentsTotal;
    }

    public CustomerDto withPaymentsTotal(BigDecimal paymentsTotal) {
        this.paymentsTotal = paymentsTotal;
        return this;
    }

    public boolean isPaymentRequested() {
        return paymentRequested;
    }

    public CustomerDto withPaymentRequested(boolean paymentRequested) {
        this.paymentRequested = paymentRequested;
        return this;
    }

    public BigDecimal getMinPartialPaymentAmount() {
        return minPartialPaymentAmount;
    }

    public CustomerDto withMinPartialPaymentAmount(BigDecimal minPartialPaymentAmount) {
        this.minPartialPaymentAmount = minPartialPaymentAmount;
        return this;
    }

    public boolean isCanRequestPayment() {
        return canRequestPayment;
    }

    public CustomerDto withCanRequestPayment(boolean canRequestPayment) {
        this.canRequestPayment = canRequestPayment;
        return this;
    }

    public boolean isCanRequestBacsPayment() {
        return canRequestBacsPayment;
    }

    public CustomerDto withCanRequestBacsPayment(boolean canRequestBacsPayment) {
        this.canRequestBacsPayment = canRequestBacsPayment;
        return this;
    }

    public LocalDate getRequestBacsPaymentDate() {
        return requestBacsPaymentDate;
    }

    public CustomerDto withRequestBacsPaymentDate(LocalDate requestBacsPaymentDate) {
        this.requestBacsPaymentDate = requestBacsPaymentDate;
        return this;
    }

    public boolean isCanChangeBacsDetails() {
        return canChangeBacsDetails;
    }

    public CustomerDto withCanChangeBacsDetails(boolean canChangeBacsDetails) {
        this.canChangeBacsDetails = canChangeBacsDetails;
        return this;
    }

    public LocalDate getChangeBacsDetailsDate() {
        return changeBacsDetailsDate;
    }

    public CustomerDto withChangeBacsDetailsDate(LocalDate changeBacsDetailsDate) {
        this.changeBacsDetailsDate = changeBacsDetailsDate;
        return this;
    }

    public boolean isHasMarketPreference() {
        return hasMarketPreference;
    }

    public CustomerDto withHasMarketPreference(boolean hasMarketPreference) {
        this.hasMarketPreference = hasMarketPreference;
        return this;
    }

    public boolean isDoNotDisturb() {
        return doNotDisturb;
    }

    public CustomerDto withDoNotDisturb(boolean doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
        return this;
    }
}
