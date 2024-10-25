public class  Engine implements  SwitchableSW04 {

    private boolean running;
    private int rpm;

    Engine(){
        this.running = false;
        this.rpm = 0;
    }

    @Override
    public void switchOn() {
        this.running = true;
    }

    @Override
    public void switchOff() {
        this.running = false;
        this.rpm = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return (this.running);
    }

    @Override
    public boolean isSwitchedOff() {
        return (!this.running);
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
