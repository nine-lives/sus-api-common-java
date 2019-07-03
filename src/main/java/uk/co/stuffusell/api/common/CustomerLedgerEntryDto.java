package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateDeserializer;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public final class CustomerLedgerEntryDto {

    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate transactionDate;
    private String transactionType;
    private BigDecimal transactionAmount;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate processedDate;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate clearedDate;
    private String reference;
    private String ebayItemId;
    private String ebayItemIdLink;
    private boolean hasEbayItemIdLink;
    private String description;

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public CustomerLedgerEntryDto withTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public CustomerLedgerEntryDto withTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public CustomerLedgerEntryDto withTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }

    public LocalDate getProcessedDate() {
        return processedDate;
    }

    public CustomerLedgerEntryDto withProcessedDate(LocalDate processedDate) {
        this.processedDate = processedDate;
        return this;
    }

    public LocalDate getClearedDate() {
        return clearedDate;
    }

    public CustomerLedgerEntryDto withClearedDate(LocalDate clearedDate) {
        this.clearedDate = clearedDate;
        return this;
    }

    public String getReference() {
        return reference;
    }

    public CustomerLedgerEntryDto withReference(String reference) {
        this.reference = reference;
        return this;
    }

    public String getEbayItemId() {
        return ebayItemId;
    }

    public CustomerLedgerEntryDto withEbayItemId(String ebayItemId) {
        this.ebayItemId = ebayItemId;
        return this;
    }

    public String getEbayItemIdLink() {
        return ebayItemIdLink;
    }

    public CustomerLedgerEntryDto withEbayItemIdLink(String ebayItemIdLink) {
        this.ebayItemIdLink = ebayItemIdLink;
        return this;
    }

    public boolean isHasEbayItemIdLink() {
        return hasEbayItemIdLink;
    }

    public CustomerLedgerEntryDto withHasEbayItemIdLink(boolean hasEbayItemIdLink) {
        this.hasEbayItemIdLink = hasEbayItemIdLink;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CustomerLedgerEntryDto withDescription(String description) {
        this.description = description;
        return this;
    }
}
