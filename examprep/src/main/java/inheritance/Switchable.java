package inheritance;

public interface Switchable {


    /**
     * Call this method to set the switch ON.
     */
    public void SwitchOn();

    /**
     * Call this method to set the switch OFF.
     */
    public void SwitchOff();

    /**
     * Returns if the switch is ON.
     * @return Boolean true if the light is OFF.
     */
    public boolean IsSwitchedOn();

    /**
     * Returns if the switch is OFF.
     * @return Boolean true if the light is OFF.
     */
    public boolean IsSwitchedOff();
}