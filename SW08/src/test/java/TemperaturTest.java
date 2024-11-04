import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    private Temperatur temp;
    private Temperatur temp2;

    @BeforeEach
    void setUp() {
        this.temp = new Temperatur(100);
        this.temp2 = new Temperatur(200);
    }

    @Test
    void compareTo() {
        assertEquals(0, temp.compareTo(temp));
        assertNotEquals(0, temp.compareTo(temp2));
    }

    @org.junit.jupiter.api.Test
    void pointEqualsHashcode() {
        assertEquals(this.temp.hashCode(), this.temp.hashCode());
        assertNotEquals(this.temp.hashCode(), this.temp2.hashCode());
    }

    @org.junit.jupiter.api.Test
    void pointEquals() {
        assertTrue(this.temp.equals(this.temp));
        assertFalse(this.temp.equals(this.temp2));
    }

    @Test
    void covnertCelsiusToKelvin() {
        assertEquals(293.15f, Temperatur.covnertCelsiusToKelvin(20f));
    }

    @Test
    void convertKelvintoCesius() {
        assertEquals(20f, Temperatur.convertKelvintoCesius(293.15f));
    }

    @Test
    void convertCelsiustoFahrenheit() {
        assertEquals(50f, Temperatur.convertCelsiustoFahrenheit(10f));
    }

    @Test
    void convertFahrenheitToCelsius() {
        assertEquals(10f, Temperatur.convertFahrenheitToCelsius(50f));
    }
}