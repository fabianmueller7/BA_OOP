public enum aggregateState {
    solid("Fest"),
    liquid("Flüssig"),
    gas("Gasförmig");

    private final String symbol;

    aggregateState(String symbol) {
        this.symbol = symbol;
    }

    public String getString() {
        return symbol;
    }
}
