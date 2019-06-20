package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CustomerItemDto {
    private Integer id;
    private String customerDescription;
    private Integer customerQuantity;
    private String category;
    private BigDecimal customerEstimate;
    private String triageStatus;
    private String triageStatusDisplay;


    public Integer getId() {
        return id;
    }

    public String getCustomerDescription() {
        return customerDescription;
    }

    public Integer getCustomerQuantity() {
        return customerQuantity;
    }

    public BigDecimal getCustomerEstimate() {
        return customerEstimate;
    }

    public String getCategory() {
        return category;
    }

    public CustomerItemDto withId(Integer id) {
        this.id = id;
        return this;
    }

    public CustomerItemDto withCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
        return this;
    }

    public CustomerItemDto withCustomerQuantity(Integer customerQuantity) {
        this.customerQuantity = customerQuantity;
        return this;
    }

    public CustomerItemDto withCategory(String category) {
        this.category = category;
        return this;
    }

    public CustomerItemDto withCustomerEstimate(BigDecimal customerEstimate) {
        this.customerEstimate = customerEstimate;
        return this;
    }

    public CustomerItemDto withTriageStatus(String triageStatus) {
        this.triageStatus = triageStatus;
        return this;
    }

    public CustomerItemDto withTriageStatusDisplay(String triageStatusDisplay) {
        this.triageStatusDisplay = triageStatusDisplay;
        return this;
    }
}
