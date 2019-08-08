package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ListingReportDto {

    private String sku;
    private String title;
    private String listingStatus;
    private Integer stockCount;
    private BigDecimal salePrice;
    private List<LedgerEntryDto> ledger = new ArrayList<>();
    private List<ListingReportEntryDto> entries = new ArrayList<>();


    private List<BuyerOrderDto> orders = new ArrayList<>();

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

    public List<LedgerEntryDto> getLedger() {
        return ledger;
    }

    public ListingReportDto withLedger(List<LedgerEntryDto> ledger) {
        this.ledger = ledger;
        return this;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public ListingReportDto withSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public List<BuyerOrderDto> getOrders() {
        return orders;
    }

    public ListingReportDto withOrders(List<BuyerOrderDto> orders) {
        this.orders = orders;
        return this;
    }
}
