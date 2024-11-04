import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TemperaturVerlauf {

    private List<Temperatur> temperaturen;

    TemperaturVerlauf() {
        this.temperaturen = new ArrayList<>();
    }

    TemperaturVerlauf(List<Temperatur> temperaturen) {
        this.temperaturen = temperaturen;
    }

    public Temperatur getTemperatur(Temperatur temperatur) {
        return this.temperaturen.get(this.temperaturen.indexOf(temperatur));
    }

    public Temperatur getTemperatur(int temperaturIndex) {
        return this.temperaturen.get(temperaturIndex);
    }

    public Collection<Temperatur> getTemperaturen() {
        return this.temperaturen;
    }

    public boolean add(Temperatur temperatur) {
        return this.temperaturen.add(temperatur);
    }

    public void add(Temperatur temperatur, int position) {
        this.temperaturen.add(position,temperatur);
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
        if(this.getCount() == 0) {
            return 0f;
        }
        float maxTemperatur = this.getTemperatur(0).getCelsius();
        for (int i = 1; i < this.temperaturen.size(); i++) {
            if(maxTemperatur < getTemperatur(i).getCelsius()) {
                maxTemperatur = getTemperatur(i).getCelsius();
            }
        }
        return maxTemperatur;
    }

    public float getMinTemperatur() {
        if(this.getCount() == 0) {
            return 0f;
        }
        float minTemperatur = this.getTemperatur(0).getCelsius();
        for (int i = 1; i < this.temperaturen.size(); i++) {
            if(minTemperatur > getTemperatur(i).getCelsius()) {
                minTemperatur = getTemperatur(i).getCelsius();
            }
        }
        return minTemperatur;
    }

    public float getDurchschnittsTemperatur() {
        if(this.getCount() == 0) {
            return 0f;
        }
        double sum = 0;
        for (Temperatur temperatur : this.temperaturen) {
            sum += temperatur.getCelsius();
        }
        return (float) sum / (float) this.temperaturen.size();
    }






}
