import jdk.jfr.EventType;

/**
 * The {@code TemperatureEventInterface} defines the contract for temperature-related events.
 * Implementing classes represent events that carry information about temperature changes,
 * such as new minimum or maximum temperatures.
 */
public interface TemperaturEventInterface {

    /**
     * Gets the type of the temperature event, such as a minimum or maximum event.
     *
     * @return the event type as an {@code EventType} enumeration
     */
    TemperaturEventType getEventType();

    /**
     * Gets the new temperature value associated with the event.
     *
     * @return the new temperature value as a {@code Temperature} object
     */
     Messpunkt getNewValue();

    /**
     * Gets the old temperature value associated with the event, if applicable.
     *
     * @return the old temperature value as a {@code Temperature} object, or {@code null}
     * if no previous value is available
     */
    Messpunkt getOldValue();
}
