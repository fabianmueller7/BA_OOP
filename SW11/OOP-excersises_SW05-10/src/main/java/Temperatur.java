import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Write a description of class Temperatur here.
 *
 * @author Fabian Mueller
 * @version 0.0.1
 */
public final class Temperatur
{


    // instance variables - replace the example below with your own
    private float TempC = 20;
    public static final float KELVIN_OFFSET = 273.15f;
    private LocalDateTime date;

    /**
     * Constructor for objects of class Temperatur
     */
    private Temperatur(float startTempC)
    {
        this.setCelsius(startTempC);
        this.date = LocalDateTime.now();
    }

    private Temperatur(float startTempC, LocalDateTime date)
    {
        this.setCelsius(startTempC);
        this.date = date;
    }

    public Temperatur(Temperatur temperaturobj) {
        this.setCelsius(temperaturobj.getCelsius());
    }

    public static Temperatur createFromCelsius(final float tempC) {
        return new Temperatur(tempC);
    }

    public static Temperatur createFromCelsius(final float tempC, final LocalDateTime date) {
        return new Temperatur(tempC,date);
    }

    public static Temperatur createFromKelvin(final float tempKelvin) {
        float tempC = Temperatur.convertKelvinToCelsius(tempKelvin);
        return new Temperatur(tempC);
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public float getCelsius() {
        return this.TempC;
    }

    public float getKelvin() {
        return Temperatur.convertCelsiusToKelvin(this.getCelsius());
    }

    public float getFahrenheit() {
        return Temperatur.convertCelsiusToFahrenheit(this.getCelsius());
    }

    public void setCelsius(float tempC) {
        if(tempC < (-KELVIN_OFFSET)){
            throw new IllegalArgumentException("Celsius cannot less than " + (-KELVIN_OFFSET));
        }
        this.TempC = tempC;
    }

    public void setKelvin(float tempK) {

        if(tempK < 0){
            throw new IllegalArgumentException("Kelvin cannot be less than 0.");
        }

        this.TempC = tempK - Temperatur.KELVIN_OFFSET;
    }

    public void setFahrenheit(float tempF) {
        if(tempF < -523.67){
            throw new IllegalArgumentException("Fahrenheit cannot be less than -523.67F.");
        }
        this.TempC = tempF;
    }

    public static float convertCelsiusToKelvin(float celsius) {
        return celsius + KELVIN_OFFSET;
    }

    public static float convertKelvinToCelsius(float kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    public static float convertCelsiusToFahrenheit(float celsius) {
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
        return (obj instanceof Temperatur temp)
                && (temp.getCelsius() == this.TempC);
    }

    public int compareTo(Temperatur other) {
        return Float.compare(this.getCelsius(), other.getCelsius());
    }

    @Override
    public String toString() {
        return "TemperaturSW7{" + "TempC=" + this.TempC + '}';
    }
}
