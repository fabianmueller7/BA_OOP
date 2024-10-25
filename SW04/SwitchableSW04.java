
/**
 *
 * @param Element your trying to get the Aggregationszustand.
 * @return Returns string of the Aggregationszustand.
 */
public interface SwitchableSW04 {

    /**
     * Call this method to set the switch ON.
     */
    public void switchOn();

    /**
     * Call this method to set the switch OFF.
     */
    public void switchOff();

    /**
     * Returns if the switch is ON.
     * @return Boolean true if the light is OFF.
     */
    public boolean isSwitchedOn();

    /**
     * Returns if the switch is OFF.
     * @return Boolean true if the light is OFF.
     */
    public boolean isSwitchedOff();
}
