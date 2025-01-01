package innnerClass;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Listener {

    private Caller caller = new Caller();

    private void handleMotorEvent(String message, PropertyChangeEvent event) {
        System.out.println(message + event.getPropertyName());
    }

    //Innere Klasse
    private class MotorPropertyListener implements PropertyChangeListener {

        @Override
       public void propertyChange(final PropertyChangeEvent e) {
            handleMotorEvent("Event from engine", e);
       }
    }

    //Anonyme innere Klasse
    public Listener() {
        this.caller.addPropertyChangeListener(new MotorPropertyListener() {

            @Override
            public void propertyChange(final PropertyChangeEvent e) {
                handleMotorEvent("Event from engine", e);
            }
        });
    }
}
