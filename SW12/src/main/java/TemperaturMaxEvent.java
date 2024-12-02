import jdk.jfr.EventType;

import java.util.EventObject;

public class TemperaturMaxEvent extends EventObject implements TemperaturEventInterface {

    private final Messpunkt messpunktNew;
    private final Messpunkt messpunktOld;


     TemperaturMaxEvent(Object source, Messpunkt messpunktNew, Messpunkt messpunktOld) {
         super(source);
         this.messpunktNew = messpunktNew;
         this.messpunktOld = messpunktOld;
     }

    @Override
    public TemperaturEventType getEventType() {
        return TemperaturEventType.TemperaturMax;
    }

    @Override
    public Messpunkt getNewValue() {
        return this.messpunktNew;
    }

    @Override
    public Messpunkt getOldValue() {
        return this.messpunktOld;
    }
}
