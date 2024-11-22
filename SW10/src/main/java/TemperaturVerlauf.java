import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TemperaturVerlauf {

    private List<Temperatur> temperaturen;
    private final List<PropertyChangeListener> changeListenerList = new ArrayList<>();

    TemperaturVerlauf() {
        this.temperaturen = new ArrayList<>();
    }

    TemperaturVerlauf(List<Temperatur> temperaturen) {
        this.temperaturen = temperaturen;
    }

    public Temperatur getTemperatur(Temperatur temperatur) {
        return this.temperaturen.get(this.temperaturen.indexOf(temperatur));
    }

    public void addPropertyChangeListener(
            final PropertyChangeListener listener) {
        this.changeListenerList.add(listener);
    }

    public void removePropertyChangeListener(
            final PropertyChangeListener listener) {
        this.changeListenerList.remove(listener);
    }

    public Temperatur getTemperatur(int temperaturIndex) {
        return this.temperaturen.get(temperaturIndex);
    }

    public Collection<Temperatur> getTemperaturen() {
        return this.temperaturen;
    }

    public void add(Temperatur temperatur) {
        this.add(temperatur, 0);
    }

    public void add(Temperatur temperatur, int position) {
        float oldMax = getMaxTemperatur();
        float oldMin = getMinTemperatur();

        this.temperaturen.add(position, temperatur);

        float newMax = getMaxTemperatur();
        float newMin = getMinTemperatur();

        if(!this.changeListenerList.isEmpty()) {
            if (oldMax != newMax || oldMin != newMin) {

                TemperaturEvent tempcase = TemperaturEvent.TemperaturMax;
                float oldValue =  oldMax;
                float newValue = newMax;

                if (oldMin != newMin) {
                    tempcase = TemperaturEvent.TemperaturMin;
                    oldValue = oldMin;
                    newValue = newMin;
                }
                final PropertyChangeEvent motorEvent = new PropertyChangeEvent(
                        this, tempcase.getAction(), oldValue, newValue);
                this.firePropertyChangeEvent(motorEvent);
            }
        }
    }

    public boolean remove(Temperatur temperatur) {
        return this.temperaturen.remove(temperatur);
    }

    public void clear() {
        this.temperaturen.clear();
    }

    public int getCount() {
        return this.temperaturen.size();
    }

    public float getMaxTemperatur() {
        if (this.getCount() == 0) {
            return 0f;
        }
        float maxTemperatur = this.getTemperatur(0).getCelsius();
        for (int i = 1; i < this.temperaturen.size(); i++) {
            if (maxTemperatur < getTemperatur(i).getCelsius()) {
                maxTemperatur = getTemperatur(i).getCelsius();
            }
        }
        return maxTemperatur;
    }

    public float getMinTemperatur() {
        if (this.getCount() == 0) {
            return 0f;
        }
        float minTemperatur = this.getTemperatur(0).getCelsius();
        for (int i = 1; i < this.temperaturen.size(); i++) {
            if (minTemperatur > getTemperatur(i).getCelsius()) {
                minTemperatur = getTemperatur(i).getCelsius();
            }
        }
        return minTemperatur;
    }

    public float getDurchschnittsTemperatur() {
        if (this.getCount() == 0) {
            return 0f;
        }
        double sum = 0;
        for (Temperatur temperatur : this.temperaturen) {
            sum += temperatur.getCelsius();
        }
        return (float) sum / (float) this.temperaturen.size();
    }

    private void firePropertyChangeEvent(
            final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListenerList) {
            listener.propertyChange(pcEvent);
        }
    }

    @Override
    public String toString() {
        return "Max: " + this.getMaxTemperatur() + "\nMin: " + this.getMinTemperatur() + "\nDurchschnitt: " + this.getDurchschnittsTemperatur();
    }
}
