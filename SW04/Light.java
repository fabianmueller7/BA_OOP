public class Light implements SwitchableSW04 {
    private boolean on;

    @Override
    public void switchOn() {
        this.on = true;
    }

    @Override
    public void switchOff() {
        this.on = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return (this.on);
    }

    @Override
    public boolean isSwitchedOff() {
        return (!this.on);
    }
}
