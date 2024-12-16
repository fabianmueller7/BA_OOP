import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * The {@code User} class represents a user with a name and provides methods to handle temperature-related events.
 * <p>
 * This class listens for temperature changes and reacts to maximum or minimum temperature events.
 * It utilizes specific event types to differentiate between maximum and minimum temperature updates.
 * </p>
 */
public class User {

    /**
     * The name of the user.
     */
    private String name;

    /**
     * Constructs a {@code User} object with the specified name.
     *
     * @param name the name of the user
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the user.
     *
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Handles a temperature maximum change event.
     * <p>
     * This method is invoked when a new maximum temperature is set.
     * It prints the old and new maximum temperature values to the console.
     * </p>
     *
     * @param evt the {@code TemperaturMaxEvent} containing old and new maximum temperature values
     */
    public void propertyChangeMax(TemperaturMaxEvent evt) {
        System.out.println("New Max: " + evt.getOldValue().getCelsius() + ": " + evt.getNewValue().getCelsius());
    }

    /**
     * Handles a temperature minimum change event.
     * <p>
     * This method is invoked when a new minimum temperature is set.
     * It prints the old and new minimum temperature values to the console.
     * </p>
     *
     * @param evt the {@code TemperaturMinEvent} containing old and new minimum temperature values
     */
    public void propertyChangeMin(TemperaturMinEvent evt) {
        System.out.println("New Min: " + evt.getOldValue().getCelsius() + ": " + evt.getNewValue().getCelsius());
    }

    /**
     * Handles a generic temperature change event.
     * <p>
     * This method checks the event type and invokes the appropriate handler method
     * for either maximum or minimum temperature change.
     * </p>
     *
     * @param evt the {@code TemperaturEventInterface} containing temperature change details
     */
    public void temeperaturChange(TemperaturEventInterface evt) {
        if (evt.getEventType().equals(TemperaturEventType.TemperaturMax)) {
            this.propertyChangeMax((TemperaturMaxEvent) evt);
        } else {
            this.propertyChangeMin((TemperaturMinEvent) evt);
        }
    }
}
