package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuyerOrderDto {
    private Integer orderId;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    private LocalDate processDate;
    private String sku;
    private String title;
    private String listing;
    private String listingLink;
    private boolean hasListingLink;
    private String buyer;
    private Integer number;
    private BigDecimal itemTotal;
    private String country;

    public Integer getOrderId() {
        return orderId;
    }

    public BuyerOrderDto withOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public LocalDate getProcessDate() {
        return processDate;
    }

    public BuyerOrderDto withProcessDate(LocalDate processDate) {
        this.processDate = processDate;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public BuyerOrderDto withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BuyerOrderDto withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getListing() {
        return listing;
    }

    public BuyerOrderDto withListing(String listing) {
        this.listing = listing;
        return this;
    }

    public String getListingLink() {
        return listingLink;
    }

    public BuyerOrderDto withListingLink(String listingLink) {
        this.listingLink = listingLink;
        return this;
    }

    public boolean isHasListingLink() {
        return hasListingLink;
    }

    public BuyerOrderDto withHasListingLink(boolean hasListingLink) {
        this.hasListingLink = hasListingLink;
        return this;
    }

    public String getBuyer() {
        return buyer;
    }

    public BuyerOrderDto withBuyer(String buyer) {
        this.buyer = buyer;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public BuyerOrderDto withNumber(Integer number) {
        this.number = number;
        return this;
    }

    public BigDecimal getItemTotal() {
        return itemTotal;
    }

    public BuyerOrderDto withItemTotal(BigDecimal itemTotal) {
        this.itemTotal = itemTotal;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public BuyerOrderDto withCountry(String country) {
        this.country = country;
        return this;
    }
}
