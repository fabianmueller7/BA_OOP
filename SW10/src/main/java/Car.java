import java.beans.PropertyChangeEvent;

public class Car implements Switchable, PropertyChangeListener {

    private boolean running;
    private int speed;
    private int tank;
    private String name;

    Car(String name,int initFuel){
        running = false;
        speed = 0;
        this.name = name;
        setTank(initFuel);
    }

    Car(){
        name = "";
        running = false;
        speed = 0;
        setTank(0);
    }

    @Override
    public void switchOn() {
        this.running = true;
    }

    @Override
    public void switchOff() {
        this.running = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return (this.running);
    }

    @Override
    public boolean isSwitchedOff() {
        return (!this.running);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTank() {
        return tank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTank(int newFuel) {
        if(newFuel > 0 && newFuel <= 100){
            this.tank = newFuel;
        } else {
            this.tank = 0;
        }
    }

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(  this.getName() + ": " + evt.getPropertyName() + ": " + evt.getNewValue());
    }
}
