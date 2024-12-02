import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void propertyChangeMax(TemperaturMaxEvent evt) {
        System.out.println("New Max: " + evt.getOldValue().getCelsius() + ": " + evt.getNewValue().getCelsius());
    }

    public void propertyChangeMin(TemperaturMinEvent evt) {
        System.out.println("New Min: " + evt.getOldValue().getCelsius() + ": " + evt.getNewValue().getCelsius());
    }

    public void temeperaturChange(TemperaturEventInterface evt) {
        if(evt.getEventType().equals(TemperaturEventType.TemperaturMax)) {
            this.propertyChangeMax((TemperaturMaxEvent) evt);
        } else {
            this.propertyChangeMin((TemperaturMinEvent)evt);
        }
    }
}