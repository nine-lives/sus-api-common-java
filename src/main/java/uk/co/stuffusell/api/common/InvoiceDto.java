package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateDeserializer;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceDto {
    private String invoiceNumber;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate from;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate to;
    private BigDecimal openingBalance;
    private BigDecimal closingBalance;
    private BigDecimal proceeds;
    private BigDecimal payments;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public InvoiceDto withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public LocalDate getFrom() {
        return from;
    }

    public InvoiceDto withFrom(LocalDate from) {
        this.from = from;
        return this;
    }

    public LocalDate getTo() {
        return to;
    }

    public InvoiceDto withTo(LocalDate to) {
        this.to = to;
        return this;
    }

    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    public InvoiceDto withOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
        return this;
    }

    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public InvoiceDto withClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
        return this;
    }

    public BigDecimal getProceeds() {
        return proceeds;
    }

    public InvoiceDto withProceeds(BigDecimal proceeds) {
        this.proceeds = proceeds;
        return this;
    }

    public BigDecimal getPayments() {
        return payments;
    }

    public InvoiceDto withPayments(BigDecimal payments) {
        this.payments = payments;
        return this;
    }
}
