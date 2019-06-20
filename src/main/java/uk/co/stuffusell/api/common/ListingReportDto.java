package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ListingReportDto {

    private String sku;
    private String title;
    private String listingStatus;
    private Integer stockCount;
    private List<ListingReportEntryDto> entries = new ArrayList<>();

    public String getSku() {
        return sku;
    }

    public ListingReportDto withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ListingReportDto withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getListingStatus() {
        return listingStatus;
    }

    public ListingReportDto withListingStatus(String listingStatus) {
        this.listingStatus = listingStatus;
        return this;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public ListingReportDto withStockCount(Integer stockCount) {
        this.stockCount = stockCount;
        return this;
    }

    public List<ListingReportEntryDto> getEntries() {
        return entries;
    }

    public ListingReportDto withEntries(List<ListingReportEntryDto> entries) {
        this.entries = entries;
        return this;
    }
}
