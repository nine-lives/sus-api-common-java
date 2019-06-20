package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListingReportEntryDto {

    private String date;
    private String reference;
    private String referenceLink;
    private boolean hasReferenceLink;
    private String description;
    private BigDecimal price;
    private String type;

    public String getDate() {
        return date;
    }

    public ListingReportEntryDto withDate(String date) {
        this.date = date;
        return this;
    }

    public String getReference() {
        return reference;
    }

    public ListingReportEntryDto withReference(String reference) {
        this.reference = reference;
        return this;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public ListingReportEntryDto withReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
        return this;
    }

    public boolean isHasReferenceLink() {
        return hasReferenceLink;
    }

    public ListingReportEntryDto withHasReferenceLink(boolean hasReferenceLink) {
        this.hasReferenceLink = hasReferenceLink;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ListingReportEntryDto withDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ListingReportEntryDto withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getType() {
        return type;
    }

    public ListingReportEntryDto withType(String type) {
        this.type = type;
        return this;
    }
}
