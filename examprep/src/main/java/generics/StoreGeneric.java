package generics;

public final class StoreGeneric<P> {

    private P value;

    public StoreGeneric(P value) {
        this.value = value;
    }

    public P getValue() {
        return value;
    }
}
