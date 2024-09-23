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
    private float UmgebungstemperaturInCelsius;

    /**
     * Constructor for objects of class Temperatur
     */
    public Temperatur()
    {
        // initialise instance variables
        this.Umgebungstemperatur = 0.0f;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float getUmgebungstemperaturInCelsius() {
        return UmgebungstemperaturInCelsius;
    }

    public void setUmgebungstemperaturInCelsius(float umgebungstemperaturInCelsius) {
        this.UmgebungstemperaturInCelsius = umgebungstemperaturInCelsius;}
}
