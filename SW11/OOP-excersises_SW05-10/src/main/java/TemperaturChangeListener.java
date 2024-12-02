public interface TemperaturChangeListener {

    /**
     * Handles a temperature change event.
     *
     * @param evt the {@code TemperatureEventInterface} object containing information about
     *            the temperature change event (cannot be null)
     */
    void temperatureChange(TemperaturEventInterface evt);
}
