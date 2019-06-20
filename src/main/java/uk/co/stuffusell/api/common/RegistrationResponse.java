package uk.co.stuffusell.api.common;

public class RegistrationResponse {
    private String customerUuid;
    private String orderUuid;
    private String orderId;

    private RegistrationResponse() {

    }

    public RegistrationResponse(String customerUuid, String orderUuid, String orderId) {
        this.customerUuid = customerUuid;
        this.orderUuid = orderUuid;
        this.orderId = orderId;
    }

    public String getCustomerUuid() {
        return customerUuid;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public String getOrderId() {
        return orderId;
    }
}
