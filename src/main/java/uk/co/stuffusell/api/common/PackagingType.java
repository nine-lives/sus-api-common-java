package uk.co.stuffusell.api.common;

public enum PackagingType {
    Bag("Bags"),
    Box("Boxes");

    private final String plural;

    PackagingType(String plural) {
        this.plural = plural;
    }

    public String getPlural() {
        return plural;
    }
}
