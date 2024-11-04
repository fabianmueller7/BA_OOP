import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {

    private TemperaturVerlauf temperaturVerlauf;

    @BeforeEach
    void setUp() {
        temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(60));
        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(50));


    }

    @Test
    void add() {
        Temperatur tempObj = new Temperatur(60);
        temperaturVerlauf.add(tempObj);
        assertEquals(tempObj, this.temperaturVerlauf.getTemperatur(tempObj));
    }

    @Test
    void remove() {
        int count1 = this.temperaturVerlauf.getCount();
        temperaturVerlauf.remove(this.temperaturVerlauf.getTemperatur(count1-1));
        assertEquals(count1 - 1, this.temperaturVerlauf.getCount());
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
        assertEquals(60, this.temperaturVerlauf.getMaxTemperatur());
    }

    @Test
    void getMinTemperatur() {
        assertEquals(20, this.temperaturVerlauf.getMinTemperatur());
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
        assertEquals( 0f, this.temperaturVerlauf.getMaxTemperatur());
    }
}