package inheritance;

public class Car extends Vehicle {

    int currentSpeed;

    Car(String manufacturer) {
       super(manufacturer);
       this.currentSpeed = 0;
    }

    public boolean IsSwitchedOn() {
        return currentSpeed != 0 && this.running;
    }

    public boolean IsSwitchedOff() {
        return currentSpeed == 0 && this.IsSwitchedOff();
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String getManufacturer() {
        return "Carmanufacturer";
    }
}
