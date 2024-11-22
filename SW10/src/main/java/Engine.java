import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

public class  Engine implements  Switchable {

    private boolean running;
    private int rpm;

    private final List<PropertyChangeListener> changeListenerList = new ArrayList<>();

    Engine(){
        this.running = false;
        this.rpm = 0;
    }

    public void addPropertyChangeListener(
            final PropertyChangeListener listener) {
        this.changeListenerList.add(listener);
    }

    public void removePropertyChangeListener(
            final PropertyChangeListener listener) {
        this.changeListenerList.remove(listener);
    }

    @Override
    public void switchOn() {
        if (this.isSwitchedOff()) {
            this.running = true;
            if(!this.changeListenerList.isEmpty()) {
                final PropertyChangeEvent motorEvent = new PropertyChangeEvent(
                        this, "running", false, true);
                this.firePropertyChangeEvent(motorEvent);
            }
        }
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

    private void firePropertyChangeEvent(
            final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListenerList) {
            listener.propertyChange(pcEvent);
        }
    }
}
