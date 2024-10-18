
/**
 * Write a description of interface Switchable here.
 *
 * @author muellefa
 * @version 1.0.0
 */
public interface Switchable
{
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
