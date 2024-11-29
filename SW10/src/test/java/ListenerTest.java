import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListenerTest {

    private TemperaturVerlauf temperaturVerlauf;
    private User listener;

    @BeforeEach
    void setUp() {
        this.temperaturVerlauf = new TemperaturVerlauf();
        this.listener = new User("listener");
        temperaturVerlauf.add(Temperatur.createFromCelsius(10));
        temperaturVerlauf.add(Temperatur.createFromCelsius(100));
        temperaturVerlauf.add(Temperatur.createFromCelsius(50));
        temperaturVerlauf.addPropertyChangeListener(listener);
    }

    @Test
    void Max() {
        temperaturVerlauf.add(Temperatur.createFromCelsius(200));
        assertEquals(200f,listener.pCEvent_Max.getNewValue());
    }

    @Test
    void Min() {
        temperaturVerlauf.add(Temperatur.createFromCelsius(5));
        assertEquals(5f,listener.pCEvent_Min.getNewValue());
    }
}
