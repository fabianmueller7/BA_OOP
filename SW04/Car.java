public class Car implements Switchable {

    private boolean running;
    private int speed;
    private int tank;

    Car(int initFuel){
        running = false;
        speed = 0;
        setTank(initFuel);
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

    public void setTank(int newFuel) {
        if(newFuel > 0 && newFuel <= 100){
            this.tank = newFuel;
        } else {
            this.tank = 0;
        }
    }
}
