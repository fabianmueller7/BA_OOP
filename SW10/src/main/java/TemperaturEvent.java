public enum TemperaturEvent {

    TemperaturNormal("Max"), TemperaturMax("Max"), TemperaturMin("Min");

    // declaring private variable for getting values
    private String action;

    // getter method
    public String getAction()
    {
        return this.action;
    }

    // enum constructor - cannot be public or protected
    private TemperaturEvent(String action)
    {
        this.action = action;
    }
}
