package enumerator;

public enum Manufacturers {
    Mercedes("Mercedes Benz"),
    BMW("Bayrische Motorwagen"),
    VW("Volkswagen");

    private final String value;

    Manufacturers(String symbol) {
        this.value = symbol;
    }

    public String getString() {
        return value;
    }
}
