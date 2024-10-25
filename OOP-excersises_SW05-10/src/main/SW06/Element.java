public abstract class Element {

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

    public String getStateOfAggregation(int temp) {
        if(temp > this.vaporizedTemp) {
            return "freezing";
        }
        else if(temp < this.vaporizedTemp && temp > freezingTemp) {
            return "vaporized";
        }
        else {
            return "solid";
        }
    }

    @Override
    public String toString() {
        String objstring = "";

        objstring += "Name: " + this.getName() + "\n";
        objstring += "FreezingTemp: " + this.getFreezingTemp() + "\n";
        objstring += "VeporizingTemp: " + this.getVaporizedTemp() + "\n";

        return objstring;
    }

}
