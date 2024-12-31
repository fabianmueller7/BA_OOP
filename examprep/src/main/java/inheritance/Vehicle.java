package inheritance;

public abstract class Vehicle implements Switchable {

    protected boolean running;
    private String manufacturer;

    Vehicle(String manufacturer) {
        this.running = false;
        this.manufacturer = manufacturer;
    }

    @Override
    public void SwitchOn() {
        this.running = true;
    }

    @Override
    public void SwitchOff() {
        this.running = false;
    }

    abstract public boolean IsSwitchedOn();

    abstract public boolean IsSwitchedOff();

    final public String getManufacturer() {
        return manufacturer;
    }
}
