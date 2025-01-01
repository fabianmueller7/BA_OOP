package eventListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Car {

    private boolean running;

    private List<CarComponent> components = new ArrayList<>();
    private final List<PropertyChangeListener> changeListenerList = new ArrayList<>();


    public Car() {
        this.running = false;
        CarComponent engine = new CarComponent("engine", "VW", 2017, 3000);
        components.add(engine);
        addPropertyChangeListener(engine);
    }


    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if(listener != null) {
            this.changeListenerList.add(listener);
        }
    }

    public void removePropertyChangeListener(
            final PropertyChangeListener listener) {
        this.changeListenerList.remove(listener);
    }

    public void turnKey() {

        if(this.changeListenerList.isEmpty()) {
            return;
        }

        CarEventType eventType = null;
        if(this.running) {
            this.running = false;
            eventType = CarEventType.stopCar;
        } else {
            this.running = true;
            eventType = CarEventType.startCar;
        }

        final EngineChangeEvent tcEvent = new EngineChangeEvent(
                this, eventType.getAction(), false, true) {};
        this.firePropertyChangeEvent(tcEvent);
    }



    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListenerList) {
            listener.propertyChange(pcEvent);
        }
    }
}
