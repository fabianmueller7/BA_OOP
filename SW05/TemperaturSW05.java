/**
 * Write a description of class Temperatur here.
 *
 * @author Fabian Mueller
 * @version 0.0.1
 */
public class TemperaturSW05
{


    // instance variables - replace the example below with your own
    private float TempC = 20;

    /**
     * Constructor for objects of class Temperatur
     */
    public TemperaturSW05(float startTempC)
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

    /**
     *
     * @param set temp in Celsius.
     */
    public void setUmgTempInCelsius(float tempC) {
        this.TempC = tempC;
    }

    /**
     *
     * @param set new temp in kelvin.
     */
    public void setUmgTempInKelvin(float tempK) {
        this.TempC = tempK - 273.15f;
    }

    /**
     *
     * @param Set new temp in fahrenheit.
     */
    public void setUmgTempInFahrenheit(float tempF) {
        this.TempC = (tempF - 32)*(5/9);
    }

    /**
     *
     * @param Element your trying to get the Aggregationszustand.
     * @return Returns string of the Aggregationszustand.
     */
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
}
