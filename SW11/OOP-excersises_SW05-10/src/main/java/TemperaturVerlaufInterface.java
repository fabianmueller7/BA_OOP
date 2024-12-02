import java.util.Collection;

/**
 * The {@code TemperatureCurceInterface} defines the contract for managing a collection
 * of temperature measurements. Implementing classes provide functionalities to add,
 * remove, and retrieve statistical data about temperatures.
 */
public interface TemperaturVerlaufInterface {

    /**
     * Adds a new temperature to the collection.
     *
     * @param messpunkt the {@code Temperature} object to add (cannot be null)
     */
    void add(final Messpunkt messpunkt);

    /**
     * Clears all temperatures from the collection.
     */
    void clear();

    /**
     * Gets the total count of temperatures in the collection.
     *
     * @return the number of temperature entries
     */
    int getCount();

    /**
     * Retrieves the maximum temperature from the collection.
     *
     * @return the maximum {@code Temperature}, or {@code null} if the collection is empty
     */
    Messpunkt getMaxTemperatur();

    /**
     * Retrieves the minimum temperature from the collection.
     *
     * @return the minimum {@code Temperature}, or {@code null} if the collection is empty
     */
    Messpunkt getMinTemperatur();

    /**
     * Calculates the average temperature of the collection in Celsius.
     *
     * @return a {@code Temperature} object representing the average temperature in Celsius,
     * or {@code null} if the collection is empty
     */
    float getDurchschnittsTemperatur();

    /**
     * Retrieves all temperatures in the collection as a read-only list.
     *
     * @return a {@code Collection} of {@code Temperature} objects representing the temperatures
     */
    Collection<Messpunkt> getMesspunkte();
}
