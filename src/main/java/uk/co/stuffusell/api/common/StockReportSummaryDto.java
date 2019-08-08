package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockReportSummaryDto {
    private Integer skuCount;
    private Integer itemCount;
    private BigDecimal shopValue;

    private StockReportSummaryDto() {
    }

    public StockReportSummaryDto(Integer skuCount, Integer itemCount, BigDecimal shopValue) {
        this.skuCount = skuCount == null ? 0 : skuCount;
        this.itemCount = itemCount == null ? 0 : itemCount;
        this.shopValue = shopValue == null ? BigDecimal.ZERO : shopValue;
    }

    public StockReportSummaryDto(Long skuCount, Long itemCount, BigDecimal shopValue) {
        this.skuCount = skuCount == null ? 0 : skuCount.intValue();
        this.itemCount = itemCount == null ? 0 : itemCount.intValue();
        this.shopValue = shopValue == null ? BigDecimal.ZERO : shopValue;
    }

    public int getSkuCount() {
        return skuCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public BigDecimal getShopValue() {
        return shopValue;
    }

    public StockReportSummaryDto add(StockReportSummaryDto other) {
        return new StockReportSummaryDto(
                skuCount + other.getSkuCount(),
                itemCount + other.getItemCount(),
                shopValue.add(other.shopValue));
    }
}
