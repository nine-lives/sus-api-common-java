package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CustomerUpdateRequest {
    private String forename;
    private String surname;
    private String email;
    private String phone;
    private String address1;
    private String address2;
    private String city;
    private String county;
    private String postcode;
    private String country;
    @JsonProperty("validateCurrentPassword")
    private boolean validateCurrentPassword;
    private String currentPassword;
    private String newPassword;
    private String payeeName;
    private String bacsAccountNumber;
    private String bacsSortCode;
    private PaymentType paymentType;
    @JsonProperty("hasMarketPreference")
    private Boolean hasMarketPreference;
    @JsonProperty("doNotDisturb")
    private Boolean doNotDisturb;

    public CustomerUpdateRequest() {

    }

    public CustomerUpdateRequest(CustomerDto customer) {
        forename = customer.getFirstName();
        surname = customer.getLastName();
        email = customer.getPrimaryEmail();
        phone = customer.getPrimaryTelephone();
        address1 = customer.getAddress1();
        address2 = customer.getAddress1();
        city = customer.getCity();
        county = customer.getCounty();
        postcode = customer.getPostcode();
        country = customer.getCountryIso3();
        payeeName = customer.getPayeeName();
        bacsAccountNumber = customer.getBacsAccountNumber();
        bacsSortCode = customer.getBacsSortCode();
        paymentType = customer.getPaymentType();
        hasMarketPreference = customer.isHasMarketPreference();
        doNotDisturb = customer.isDoNotDisturb();
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public String getEmail() {
        return email;
    }

    public boolean getValidateCurrentPassword() {
        return validateCurrentPassword;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress1() {
        return address1 == null || address1.isEmpty() ? address2 : address1;
    }

    public String getAddress2() {
        return address1 == null || address1.isEmpty() ? null : address2;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getBacsAccountNumber() {
        return bacsAccountNumber;
    }

    public String getBacsSortCode() {
        return bacsSortCode;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public Boolean isHasMarketPreference() {
        return hasMarketPreference;
    }

    public Boolean isDoNotDisturb() {
        return doNotDisturb;
    }

    public CustomerUpdateRequest withForename(String forename) {
        this.forename = forename;
        return this;
    }

    public CustomerUpdateRequest withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public CustomerUpdateRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerUpdateRequest withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public CustomerUpdateRequest withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public CustomerUpdateRequest withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public CustomerUpdateRequest withCity(String city) {
        this.city = city;
        return this;
    }

    public CustomerUpdateRequest withCounty(String county) {
        this.county = county;
        return this;
    }

    public CustomerUpdateRequest withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public CustomerUpdateRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    public CustomerUpdateRequest withValidateCurrentPassword(boolean validateCurrentPassword) {
        this.validateCurrentPassword = validateCurrentPassword;
        return this;
    }

    public CustomerUpdateRequest withCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    public CustomerUpdateRequest withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public CustomerUpdateRequest withPayeeName(String payeeName) {
        this.payeeName = payeeName;
        return this;
    }

    public CustomerUpdateRequest withBacsAccountNumber(String bacsAccountNumber) {
        this.bacsAccountNumber = bacsAccountNumber;
        return this;
    }

    public CustomerUpdateRequest withBacsSortCode(String bacsSortCode) {
        this.bacsSortCode = bacsSortCode;
        return this;
    }

    public CustomerUpdateRequest withPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public CustomerUpdateRequest withHasMarketPreference(Boolean hasMarketPreference) {
        this.hasMarketPreference = hasMarketPreference;
        return this;
    }

    public CustomerUpdateRequest withDoNotDisturb(Boolean doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
        return this;
    }
}
