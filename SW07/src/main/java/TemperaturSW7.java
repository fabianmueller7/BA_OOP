/**
 * Write a description of class Temperatur here.
 *
 * @author Fabian Mueller
 * @version 0.0.1
 */
public class TemperaturSW7
{


    // instance variables - replace the example below with your own
    private float TempC = 20;

    /**
     * Constructor for objects of class Temperatur
     */
    public TemperaturSW7(float startTempC)
    {
        // initialise instance variables
        this.setUmgTempInCelsius(startTempC);
    }

    public float getUmgTempInCelsius() {
        return this.TempC;
    }

    public float getUmgTempInKelvin() {
        return this.TempC + 273.15f;
    }

    public float getUmgTempInFahrenheit() {
        return this.TempC * 1.8f + 32;
    }

    public void setUmgTempInCelsius(float tempC) {
        this.TempC = tempC;
    }

    public void setUmgTempInKelvin(float tempK) {
        this.TempC = tempK - 273.15f;
    }

    public void setUmgTempInFahrenheit(float tempF) {
        this.TempC = (tempF - 32)*(5/9);
    }

    public aggregateState getAggregatszustand(Element element) {

        if(this.TempC > element.getVaporizedTemp()) {
            return aggregateState.gas;
        }
        else if(this.TempC < element.getVaporizedTemp() && element.getFreezingTemp() < this.TempC) {
            return aggregateState.liquid;
        }
        else {
            return aggregateState.solid;
        }
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj == this) {
            return true;
        }
        return (obj instanceof TemperaturSW7 temp)
                && (temp.getUmgTempInCelsius() == this.TempC);
    }

    public int compareTo(TemperaturSW7 other) {
        return Float.compare(this.getUmgTempInCelsius(), other.getUmgTempInCelsius());
    }

    @Override
    public String toString() {
        return "TemperaturSW7{" + "TempC=" + this.TempC + '}';
    }
}
