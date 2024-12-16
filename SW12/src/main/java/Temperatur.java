/**
 * The {@code Temperatur} class represents a temperature value and provides
 * methods to manage and convert temperature between Celsius, Kelvin, and Fahrenheit.
 * <p>
 * This class ensures that temperature values are valid according to their respective
 * scales and provides utility methods for temperature conversion.
 * </p>
 *
 * <p><strong>Example Usage:</strong></p>
 * <pre>
 *     Temperatur tempC = Temperatur.createFromCelsius(25.0f);
 *     float kelvin = tempC.getKelvin();
 *     float fahrenheit = tempC.getFahrenheit();
 * </pre>
 *
 * @author Fabian Mueller
 * @version 0.0.1
 */
public final class Temperatur {

    /** The temperature value in Celsius. */
    private float TempC = 20;

    /** The offset to convert Celsius to Kelvin (273.15). */
    public static final float KELVIN_OFFSET = 273.15f;

    /**
     * Private constructor to initialize the temperature with a Celsius value.
     *
     * @param startTempC the starting temperature in Celsius
     * @throws IllegalArgumentException if the temperature is below absolute zero
     */
    private Temperatur(float startTempC) {
        this.setCelsius(startTempC);
    }

    /**
     * Copy constructor for creating a {@code Temperatur} object from another instance.
     *
     * @param temperaturobj the existing {@code Temperatur} object
     */
    public Temperatur(Temperatur temperaturobj) {
        this.setCelsius(temperaturobj.getCelsius());
    }

    /**
     * Creates a {@code Temperatur} object from a Celsius value.
     *
     * @param tempC the temperature in Celsius
     * @return a new {@code Temperatur} object
     */
    public static Temperatur createFromCelsius(final float tempC) {
        return new Temperatur(tempC);
    }

    /**
     * Creates a {@code Temperatur} object from a Kelvin value.
     *
     * @param tempKelvin the temperature in Kelvin
     * @return a new {@code Temperatur} object
     */
    public static Temperatur createFromKelvin(final float tempKelvin) {
        float tempC = Temperatur.convertKelvinToCelsius(tempKelvin);
        return new Temperatur(tempC);
    }

    /**
     * Gets the temperature in Celsius.
     *
     * @return the temperature in Celsius
     */
    public float getCelsius() {
        return this.TempC;
    }

    /**
     * Gets the temperature in Kelvin.
     *
     * @return the temperature in Kelvin
     */
    public float getKelvin() {
        return Temperatur.convertCelsiusToKelvin(this.getCelsius());
    }

    /**
     * Gets the temperature in Fahrenheit.
     *
     * @return the temperature in Fahrenheit
     */
    public float getFahrenheit() {
        return Temperatur.convertCelsiusToFahrenheit(this.getCelsius());
    }

    /**
     * Sets the temperature in Celsius.
     *
     * @param tempC the temperature in Celsius
     * @throws IllegalArgumentException if the temperature is below absolute zero (-273.15 Celsius)
     */
    public void setCelsius(float tempC) {
        if (tempC < (-KELVIN_OFFSET)) {
            throw new IllegalArgumentException("Celsius cannot be less than " + (-KELVIN_OFFSET));
        }
        this.TempC = tempC;
    }

    /**
     * Sets the temperature in Kelvin.
     *
     * @param tempK the temperature in Kelvin
     * @throws IllegalArgumentException if the temperature is below 0 Kelvin
     */
    public void setKelvin(float tempK) {
        if (tempK < 0) {
            throw new IllegalArgumentException("Kelvin cannot be less than 0.");
        }
        this.TempC = tempK - Temperatur.KELVIN_OFFSET;
    }

    /**
     * Sets the temperature in Fahrenheit.
     *
     * @param tempF the temperature in Fahrenheit
     * @throws IllegalArgumentException if the temperature is below -523.67 Fahrenheit
     */
    public void setFahrenheit(float tempF) {
        if (tempF < -523.67) {
            throw new IllegalArgumentException("Fahrenheit cannot be less than -523.67F.");
        }
        this.TempC = Temperatur.convertFahrenheitToCelsius(tempF);
    }

    /**
     * Converts a Celsius value to Kelvin.
     *
     * @param celsius the temperature in Celsius
     * @return the temperature in Kelvin
     */
    public static float convertCelsiusToKelvin(float celsius) {
        return celsius + KELVIN_OFFSET;
    }

    /**
     * Converts a Kelvin value to Celsius.
     *
     * @param kelvin the temperature in Kelvin
     * @return the temperature in Celsius
     */
    public static float convertKelvinToCelsius(float kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    /**
     * Converts a Celsius value to Fahrenheit.
     *
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public static float convertCelsiusToFahrenheit(float celsius) {
        return celsius * 1.8f + 32;
    }

    /**
     * Converts a Fahrenheit value to Celsius.
     *
     * @param fahrenheit the temperature in Fahrenheit
     * @return the temperature in Celsius
     */
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * (5f / 9f);
    }

    /**
     * Compares this {@code Temperatur} object to another.
     *
     * @param other the other {@code Temperatur} object
     * @return a negative integer, zero, or a positive integer as this object
     *         is less than, equal to, or greater than the specified object
     */
    public int compareTo(Temperatur other) {
        return Float.compare(this.getCelsius(), other.getCelsius());
    }

    /**
     * Checks if this {@code Temperatur} object is equal to another.
     *
     * @param obj the object to compare
     * @return {@code true} if the objects are equal; {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Temperatur temp)
                && (temp.getCelsius() == this.TempC);
    }

    /**
     * Computes the hash code for this {@code Temperatur} object.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    /**
     * Returns a string representation of this {@code Temperatur} object.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "TemperaturSW7{" + "TempC=" + this.TempC + '}';
    }
}
