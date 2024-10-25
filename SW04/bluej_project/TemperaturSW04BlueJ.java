package bluej_project;

/**
 * Write a description of class Temperatur here.
 *
 * @author Fabian Mueller
 * @version 0.0.1
 */
public class TemperaturSW04BlueJ
{


    // instance variables - replace the example below with your own
    private float UmgebungstemperaturInCelsius = 20;

    /**
     * Constructor for objects of class Temperatur
     */
    public TemperaturSW04BlueJ(float startUmgebungstemperaturInCelsius)
    {
        // initialise instance variables
        this.setUmgTempInCelsius(startUmgebungstemperaturInCelsius);
    }

    public float getUmgTempInCelsius() {
        return this.UmgebungstemperaturInCelsius;
    }

    public float getUmgTempInKelvin() {
        return this.UmgebungstemperaturInCelsius + 273.15f;
    }

    public float getUmgTempInFahrenheit() {
        return this.UmgebungstemperaturInCelsius * 1.8f + 32;
    }

    public void setUmgTempInCelsius(float umgTempInCelsius) {
        this.UmgebungstemperaturInCelsius = umgTempInCelsius;
    }

    public void setUmgTempInKelvin(float umgTempInKelvin) {
        this.UmgebungstemperaturInCelsius = umgTempInKelvin - 273.15f;
    }

    public void setUmgTempInFahrenheit(float umgTempInFahrenheit) {
        this.UmgebungstemperaturInCelsius = (umgTempInFahrenheit - 32)*(5/9);
    }

    public String getAggregatszustand(String element) {

        return switch (element) {
            case "Pb" -> "fest";
            case "Hg" -> "fluessig";
            case "N" -> "gasfoermig";
            default -> "unbekannt";
        };
    }
}
