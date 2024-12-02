import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

public class TemperaturVerlauf {

    private List<Messpunkt> messpunkte;
    private final List<PropertyChangeListener> changeListenerList = new ArrayList<>();

    TemperaturVerlauf() {
        this.messpunkte = new ArrayList<>();
    }

    TemperaturVerlauf(List<Messpunkt> messpunkte) {
        this.messpunkte = messpunkte;
    }

    public Messpunkt getMesspunkt(Messpunkt messpunkt) {
        return this.messpunkte.get(this.messpunkte.indexOf(messpunkt));
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

    public Messpunkt getMesspunkt(int temperaturIndex) {
        return this.messpunkte.get(temperaturIndex);
    }

    public Collection<Messpunkt> getMesspunkte() {
        return this.messpunkte;
    }

    public void add(Messpunkt messpunkt) {
        this.add(messpunkt, 0);
    }

    public void add(Messpunkt messpunkt, int position) {

        if(messpunkt == null) {
            throw new NullPointerException("Temperatur is null");
        }

        Messpunkt oldMax = getMaxTemperatur();
        Messpunkt oldMin = getMinTemperatur();

        this.messpunkte.add(position, messpunkt);

        Messpunkt newMax = getMaxTemperatur();
        Messpunkt newMin = getMinTemperatur();

        if(!this.changeListenerList.isEmpty()) {
            if (oldMax != newMax || oldMin != newMin) {

                TemperaturEventType tempcase = TemperaturEventType.TemperaturMax;
                if (oldMin.getCelsius() != newMin.getCelsius()) {
                    tempcase = TemperaturEventType.TemperaturMin;
                    final PropertyChangeEvent tcEvent = new PropertyChangeEvent(
                            this, tempcase.getAction(), oldMin, newMin) {
                    };
                    this.firePropertyChangeEvent(tcEvent);
                }

                if (oldMax .getCelsius()!= newMax.getCelsius()) {
                    tempcase = TemperaturEventType.TemperaturMax;
                    final PropertyChangeEvent tcEvent = new PropertyChangeEvent(
                            this, tempcase.getAction(), oldMax, newMax) {
                    };
                    this.firePropertyChangeEvent(tcEvent);
                }
            }
        }
    }

    public boolean remove(Messpunkt messpunkt) {
        return this.messpunkte.remove(messpunkt);
    }

    public void clear() {
        this.messpunkte.clear();
    }

    public int getCount() {
        return this.messpunkte.size();
    }

    public Messpunkt getMaxTemperatur() {
        if (this.getCount() == 0) {
            return null;
        }
        Messpunkt maxTemperatur = this.getMesspunkt(0);
        for (int i = 1; i < this.messpunkte.size(); i++) {
            if (maxTemperatur.getCelsius() < getMesspunkt(i).getCelsius()) {
                maxTemperatur = getMesspunkt(i);
            }
        }
        return maxTemperatur;
    }

    public Messpunkt getMinTemperatur() {
        if (this.getCount() == 0) {
            return null;
        }
        Messpunkt minTemperatur = this.getMesspunkt(0);
        for (int i = 1; i < this.messpunkte.size(); i++) {
            if (minTemperatur.getCelsius() > getMesspunkt(i).getCelsius()) {
                minTemperatur = getMesspunkt(i);
            }
        }
        return minTemperatur;
    }

    public float getDurchschnittsTemperatur() {
        if (this.getCount() == 0) {
            return 0f;
        }
        double sum = 0;
        for (Messpunkt temperatur : this.messpunkte) {
            sum += temperatur.getCelsius();
        }
        return (float) sum / (float) this.messpunkte.size();
    }

    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListenerList) {
            listener.propertyChange(pcEvent);
        }
    }

    @Override
    public String toString() {
        return "Max: " + this.getMaxTemperatur().getCelsius() + "\nMin: " + this.getMinTemperatur().getCelsius() + "\nDurchschnitt: " + this.getDurchschnittsTemperatur();
    }
}
