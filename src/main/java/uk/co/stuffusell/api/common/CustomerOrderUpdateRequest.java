package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CustomerOrderUpdateRequest {
    private List<CustomerItemDto> items;
    private String ipAddress;


    public List<CustomerItemDto> getItems() {
        return items;
    }

    public CustomerOrderUpdateRequest withItems(List<CustomerItemDto> items) {
        this.items = items;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public CustomerOrderUpdateRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
}