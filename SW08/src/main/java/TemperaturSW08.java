/**
 * Write a description of class Temperatur here.
 *
 * @author Fabian Mueller
 * @version 0.0.1
 */
public class TemperaturSW08
{


    // instance variables - replace the example below with your own
    private float TempC = 20;
    public static final float KELVIN_OFFSET = 273.15f;

    /**
     * Constructor for objects of class Temperatur
     */
    public TemperaturSW08(float startTempC)
    {
        // initialise instance variables
        this.setCelsius(startTempC);
    }

    public TemperaturSW08(TemperaturSW08 temperaturobj) {
        this.setCelsius(temperaturobj.getCelsius());
    }

    public float getCelsius() {
        return this.TempC;
    }

    public float getKelvin() {
        return TemperaturSW08.covnertCelsiusToKelvin(this.getCelsius());
    }

    public float getFahrenheit() {
        return TemperaturSW08.convertCelsiustoFahrenheit(this.getCelsius());
    }

    public void setCelsius(float tempC) {
        this.TempC = tempC;
    }

    public void setKelvin(float tempK) {
        this.TempC = tempK - TemperaturSW08.KELVIN_OFFSET;
    }

    public void setFahrenheit(float tempF) {
        this.TempC = tempF;
    }

    public static float covnertCelsiusToKelvin(float celsius) {
        return celsius + KELVIN_OFFSET;
    }

    public static float convertKelvintoCesius(float kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    public static float convertCelsiustoFahrenheit(float celsius) {
        return celsius * 1.8f + 32;
    }

    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return  (fahrenheit - 32)*(5f/9f);
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
        return (obj instanceof TemperaturSW08 temp)
                && (temp.getCelsius() == this.TempC);
    }

    public int compareTo(TemperaturSW08 other) {
        return Float.compare(this.getCelsius(), other.getCelsius());
    }

    @Override
    public String toString() {
        return "TemperaturSW7{" + "TempC=" + this.TempC + '}';
    }
}
