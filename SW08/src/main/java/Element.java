public class Element {

    private String name;
    private float freezingTemp;
    private float vaporizedTemp;

    Element(String name, float freezingTemp, float vaporizedTemp) {
        this.name = name;
        this.freezingTemp = freezingTemp;
        this.vaporizedTemp = vaporizedTemp;
    }

    public String getName() {
        return name;
    }

    public float getFreezingTemp() {
        return freezingTemp;
    }

    public float getVaporizedTemp() {
        return vaporizedTemp;
    }

    public String getAggregatszustand(Element element, int tempC) {

        if(tempC > element.getVaporizedTemp()) {
            return aggregateState.gas.getString();
        }
        else if(tempC < element.getVaporizedTemp() && element.getFreezingTemp() < tempC) {
            return aggregateState.liquid.getString();
        }
        else {
            return aggregateState.solid.getString();
        }
    }

}
