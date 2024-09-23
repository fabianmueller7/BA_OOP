import java.util.*;

/**
 * Write a description of class Temperatur here.
 *
 * @author Fabian Mueller
 * @version 0.0.1
 */
public class Temperatur
{


    // instance variables - replace the example below with your own
    private float UmgebungstemperaturInCelsius = 20;

    /**
     * Constructor for objects of class Temperatur
     */
    public Temperatur(float startUmgebungstemperaturInCelsius)
    {
        // initialise instance variables
        setUmgebungstemperaturInCelsius(startUmgebungstemperaturInCelsius);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float getUmgebungstemperaturInCelsius() {
        return this.UmgebungstemperaturInCelsius;
    }

    public float getUmgebungstemperaturInKelvin() {
        return this.UmgebungstemperaturInCelsius + 273.15f;
    }

    public float getUmgebungstemperaturInFahrenheit() {
        return this.UmgebungstemperaturInCelsius * 1.8f + 32;
    }

    public void setUmgebungstemperaturInCelsius(float umgebungstemperaturInCelsius) {
        this.UmgebungstemperaturInCelsius = umgebungstemperaturInCelsius;
    }

    public void setUmgebungstemperaturInKelvin(float umgebungstemperaturInKelvin)  {
        this.UmgebungstemperaturInCelsius = umgebungstemperaturInKelvin - 273.15f;
    }

    public void setUmgebungstemperaturInFahrenheit(float umgebungstemperaturInFahrenheit)  {
        this.UmgebungstemperaturInCelsius = (umgebungstemperaturInFahrenheit - 32)*(5/9);
    }
}
