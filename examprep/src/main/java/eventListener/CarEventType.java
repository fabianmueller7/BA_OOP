package eventListener;

public enum CarEventType {

    startCar("ON"), stopCar("OFF");

    // declaring private variable for getting values
    private String action;

    // getter method
    public String getAction()
    {
        return this.action;
    }

    // enum constructor - cannot be public or protected
    private CarEventType(String action)
    {
        this.action = action;
    }
}
