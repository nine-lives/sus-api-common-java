package uk.co.stuffusell.api.common.consignment;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.PricingDto;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateDeserializer;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ConsignmentDto {
    private String id;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate uploadDate;
    private String description;
    private String filename;
    private PricingDto pricing;
    private ConsignmentInventorySummaryDto summary;
    private List<ConsignmentItemDto> inventory;
    private List<ConsignmentInventorySummaryDto> statusSummaries;


    public String getId() {
        return id;
    }

    public ConsignmentDto withId(String id) {
        this.id = id;
        return this;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public ConsignmentDto withUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ConsignmentDto withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public ConsignmentDto withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public PricingDto getPricing() {
        return pricing;
    }

    public ConsignmentDto withPricing(PricingDto pricing) {
        this.pricing = pricing;
        return this;
    }

    public List<ConsignmentItemDto> getInventory() {
        return inventory;
    }

    public ConsignmentDto withInventory(List<ConsignmentItemDto> inventory) {
        this.inventory = inventory;
        return this;
    }

    public List<ConsignmentInventorySummaryDto> getStatusSummaries() {
        return statusSummaries;
    }

    public ConsignmentDto withStatusSummaries(List<ConsignmentInventorySummaryDto> statusSummaries) {
        this.statusSummaries = statusSummaries;
        return this;
    }

    public ConsignmentInventorySummaryDto getSummary() {
        return summary;
    }

    public ConsignmentDto withSummary(ConsignmentInventorySummaryDto summary) {
        this.summary = summary;
        return this;
    }

    public BigDecimal getComplete() {
        return new BigDecimal(summary.getQuantityClosed())
                .divide(new BigDecimal(summary.getQuantity()), 4, RoundingMode.HALF_EVEN)
                .movePointRight(2);
    }
}
