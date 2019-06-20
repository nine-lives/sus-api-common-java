package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CourierQuoteDto {
    private int serviceId;
    private BigDecimal totalPrice;
    private String serviceName;

    public int getServiceId() {
        return serviceId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public CourierQuoteDto withServiceId(int serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public CourierQuoteDto withTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public CourierQuoteDto withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
}
