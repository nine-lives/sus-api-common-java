package uk.co.stuffusell.api.common;

public class LoginResponse {
    private String authToken;
    private CustomerDto customerDto;

    private LoginResponse() {
    }

    public LoginResponse(String authToken, CustomerDto customerDto) {
        this.authToken = authToken;
        this.customerDto = customerDto;
    }

    public String getAuthToken() {
        return authToken;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }
}
