package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.List;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LedgerDto {
    private InvoiceDto invoice;
    private List<LedgerEntryDto> entries;

    private boolean vatApplicable;
    private BigDecimal salesTotal;
    private BigDecimal commissionTotal;
    private BigDecimal transactionCostsTotal;
    private BigDecimal refundsTotal;
    private BigDecimal proceedsTotal;
    private BigDecimal paymentsTotal;
    private BigDecimal adjustmentTotal;

    private BigDecimal feesTotal;
    private BigDecimal salesNetRefundsTotal;

    private BigDecimal total;

    public InvoiceDto getInvoice() {
        return invoice;
    }

    public LedgerDto withInvoice(InvoiceDto invoice) {
        this.invoice = invoice;
        return this;
    }

    public List<LedgerEntryDto> getEntries() {
        return entries;
    }

    public LedgerDto withEntries(List<LedgerEntryDto> entries) {
        this.entries = entries;
        return this;
    }

    public boolean isVatApplicable() {
        return vatApplicable;
    }

    public LedgerDto withVatApplicable(boolean vatApplicable) {
        this.vatApplicable = vatApplicable;
        return this;
    }

    public BigDecimal getSalesTotal() {
        return salesTotal;
    }

    public LedgerDto withSalesTotal(BigDecimal salesTotal) {
        this.salesTotal = salesTotal;
        return this;
    }

    public BigDecimal getCommissionTotal() {
        return commissionTotal;
    }

    public LedgerDto withCommissionTotal(BigDecimal commissionTotal) {
        this.commissionTotal = commissionTotal;
        return this;
    }

    public BigDecimal getTransactionCostsTotal() {
        return transactionCostsTotal;
    }

    public LedgerDto withTransactionCostsTotal(BigDecimal transactionCostsTotal) {
        this.transactionCostsTotal = transactionCostsTotal;
        return this;
    }

    public BigDecimal getRefundsTotal() {
        return refundsTotal;
    }

    public LedgerDto withRefundsTotal(BigDecimal refundsTotal) {
        this.refundsTotal = refundsTotal;
        return this;
    }

    public BigDecimal getProceedsTotal() {
        return proceedsTotal;
    }

    public LedgerDto withProceedsTotal(BigDecimal proceedsTotal) {
        this.proceedsTotal = proceedsTotal;
        return this;
    }

    public BigDecimal getPaymentsTotal() {
        return paymentsTotal;
    }

    public LedgerDto withPaymentsTotal(BigDecimal paymentsTotal) {
        this.paymentsTotal = paymentsTotal;
        return this;
    }

    public BigDecimal getAdjustmentTotal() {
        return adjustmentTotal;
    }

    public LedgerDto withAdjustmentTotal(BigDecimal adjustmentTotal) {
        this.adjustmentTotal = adjustmentTotal;
        return this;
    }

    public BigDecimal getFeesTotal() {
        return feesTotal;
    }

    public LedgerDto withFeesTotal(BigDecimal feesTotal) {
        this.feesTotal = feesTotal;
        return this;
    }

    public BigDecimal getSalesNetRefundsTotal() {
        return salesNetRefundsTotal;
    }

    public LedgerDto withSalesNetRefundsTotal(BigDecimal salesNetRefundsTotal) {
        this.salesNetRefundsTotal = salesNetRefundsTotal;
        return this;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public LedgerDto withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }
}
