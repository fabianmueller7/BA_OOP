package Motor;

public enum TemperaturEventType {

    ON("ON"), OFF("OFF");

    // declaring private variable for getting values
    private String action;

    // getter method
    public String getAction()
    {
        return this.action;
    }

    // enum constructor - cannot be public or protected
    private TemperaturEventType(String action)
    {
        this.action = action;
    }
}