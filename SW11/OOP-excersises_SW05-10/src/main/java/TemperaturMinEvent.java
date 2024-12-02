import java.util.EventObject;

public class TemperaturMinEvent extends EventObject implements TemperaturEventInterface {

    private final Messpunkt messpunktNew;
    private final Messpunkt messpunktOld;


    TemperaturMinEvent(Object source, Messpunkt messpunktNew, Messpunkt messpunktOld) {
        super(source);
        this.messpunktNew = messpunktNew;
        this.messpunktOld = messpunktOld;
    }

    @Override
    public TemperaturEventType getEventType() {
        return TemperaturEventType.TemperaturMin;
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
