package uk.co.stuffusell.api.common;

public enum PaymentType {
    BACS,
    Cheque;

    public static PaymentType getDefault() {
        return Cheque;
    }

    public static PaymentType valueOfOrDefault(String value) {
        return value == null || value.isEmpty() ? getDefault() : valueOf(value);
    }
}
