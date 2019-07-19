package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BalancesDto {
    private BigDecimal balance;
    private BigDecimal clearedBalance;
    private BigDecimal availableBalance;
    private BigDecimal paymentsBalance;

    public BigDecimal getBalance() {
        return balance;
    }

    public BalancesDto withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public BigDecimal getClearedBalance() {
        return clearedBalance;
    }

    public BalancesDto withClearedBalance(BigDecimal clearedBalance) {
        this.clearedBalance = clearedBalance;
        return this;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public BalancesDto withAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }

    public BigDecimal getPaymentsBalance() {
        return paymentsBalance;
    }

    public BalancesDto withPaymentsBalance(BigDecimal paymentsBalance) {
        this.paymentsBalance = paymentsBalance;
        return this;
    }
}
