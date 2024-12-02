import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {

    private TemperaturVerlauf temperaturVerlauf;

    @BeforeEach
    void setUp() {
        temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(Messpunkt.neuerMesspunkt(Temperatur.createFromCelsius(30f)));
        temperaturVerlauf.add(Messpunkt.neuerMesspunkt(Temperatur.createFromCelsius(40f)));
        temperaturVerlauf.add(Messpunkt.neuerMesspunkt(Temperatur.createFromCelsius(30f)));
        temperaturVerlauf.add(Messpunkt.neuerMesspunkt(Temperatur.createFromCelsius(60f)));


    }

    @Test
    void clear() {
        this.temperaturVerlauf.clear();
        assertEquals(0, this.temperaturVerlauf.getCount());
    }

    @Test
    void getCount() {
        assertEquals(4, this.temperaturVerlauf.getCount());
    }

    @Test
    void getMaxTemperatur() {
        assertEquals(60, this.temperaturVerlauf.getMaxTemperatur().getCelsius());
    }

    @Test
    void getMinTemperatur() {
        assertEquals(30, this.temperaturVerlauf.getMinTemperatur().getCelsius());
    }

    @Test
    void getDurchschnittsTemperatur() {
        assertEquals( 40, this.temperaturVerlauf.getDurchschnittsTemperatur());
    }

    @Test
    void getDurchschnittsTemperaturWithNull() {
        this.temperaturVerlauf.clear();
        assertEquals( 0f, this.temperaturVerlauf.getDurchschnittsTemperatur());
    }

    @Test
    void getMaxTemperaturWithNull() {
        this.temperaturVerlauf.clear();
        assertEquals( null, this.temperaturVerlauf.getMaxTemperatur());
    }
}