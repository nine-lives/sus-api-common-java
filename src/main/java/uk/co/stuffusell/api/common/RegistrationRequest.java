package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class RegistrationRequest {
    private String name;
    private String email;
    private String phone;
    private String address1;
    private String address2;
    private String city;
    private String postcode;
    private String password;
    private String ipAddress;
    private String ebayUserId;
    private String campaign;
    private String vatNumber;
    @JsonAlias("isBot")
    private boolean isBot;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
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

    public String getPostcode() {
        return postcode;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getEbayUserId() {
        return ebayUserId;
    }

    public String getCampaign() {
        return campaign;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public boolean isBot() {
        return isBot;
    }

    public RegistrationRequest withName(String name) {
        this.name = name;
        return this;
    }

    public RegistrationRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    public RegistrationRequest withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public RegistrationRequest withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public RegistrationRequest withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public RegistrationRequest withCity(String city) {
        this.city = city;
        return this;
    }

    public RegistrationRequest withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public RegistrationRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    public RegistrationRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public RegistrationRequest withEbayUserId(String ebayUserId) {
        this.ebayUserId = ebayUserId;
        return this;
    }

    public RegistrationRequest withCampaign(String campaign) {
        this.campaign = campaign;
        return this;
    }

    public RegistrationRequest withVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
        return this;
    }

    public RegistrationRequest withBot(boolean bot) {
        isBot = bot;
        return this;
    }
}
