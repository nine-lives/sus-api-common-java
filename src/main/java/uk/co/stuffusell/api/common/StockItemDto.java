package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public final class StockItemDto {
    private String sku;
    private String itemTitle;
    private String barcodeNumber;
    private String clientSku;
    private int quantity;
    private BigDecimal retailPrice;
    private BigDecimal osp;
    private BigDecimal startPrice;
    private BigDecimal reserve;
    private BigDecimal binPrice;

    public String getSku() {
        return sku;
    }

    public StockItemDto withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public StockItemDto withItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }

    public String getClientSku() {
        return clientSku;
    }

    public StockItemDto withClientSku(String clientSku) {
        this.clientSku = clientSku;
        return this;
    }

    public String getBarcodeNumber() {
        return barcodeNumber;
    }

    public StockItemDto withBarcodeNumber(String barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public StockItemDto withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public StockItemDto withRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
        return this;
    }

    public BigDecimal getOsp() {
        return osp;
    }

    public StockItemDto withOsp(BigDecimal osp) {
        this.osp = osp;
        return this;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public StockItemDto withStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
        return this;
    }

    public BigDecimal getReserve() {
        return reserve;
    }

    public StockItemDto withReserve(BigDecimal reserve) {
        this.reserve = reserve;
        return this;
    }

    public BigDecimal getBinPrice() {
        return binPrice;
    }

    public StockItemDto withBinPrice(BigDecimal binPrice) {
        this.binPrice = binPrice;
        return this;
    }
}
