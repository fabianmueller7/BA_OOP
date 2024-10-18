public class CountingSwitchable implements Switchable {

    private boolean switchOn = false;
    private long counter = 0;

    public CountingSwitchable() {};

    public void switchOn() {
        counter++;
        this.switchOn = true;
    }

    public void switchOff() {
        counter++;
        this.switchOn = false;
    }

    public boolean isSwitchedOn() {
        return this.switchOn;
    }

    public boolean isSwitchedOff() {
        return !this.switchOn;
    }

    public long getSwitchCounter() {
        return counter;
    };

}
