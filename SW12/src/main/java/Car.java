import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car implements Switchable, PropertyChangeListener {

    private boolean running;
    private int speed;
    private int tank;
    private String name;
    private Engine engine;

    /*
    private class MotorPropertyListener implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            handleMotorEvent("Event vom Motor", evt);
        }
    }*/


    Car(){
        name = "";
        running = false;
        speed = 0;
        setTank(0);
        this.engine = new Engine();

        //engine.addPropertyChangeListener(e -> handleMotorEvent("Event von Motor", e) );
        engine.addPropertyChangeListener((evt) -> {
            System.out.println(  this.getName() + ": " + evt.getPropertyName() + ": " + evt.getNewValue());
        });
    }

    @Override
    public void switchOn() {
        this.running = true;
        this.engine.switchOn();
    }

    @Override
    public void switchOff() {
        this.running = false;
        this.engine.switchOff();
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

    public void handleMotorEvent(String name,PropertyChangeEvent evt){
        System.out.println(  this.getName() + ": " + evt.getPropertyName() + ": " + evt.getNewValue());
    }
}
