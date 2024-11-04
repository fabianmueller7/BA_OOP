import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturSW08Test {

    private TemperaturSW08 temp;
    private TemperaturSW08 temp2;

    @BeforeEach
    void setUp() {
        this.temp = new TemperaturSW08(100);
        this.temp2 = new TemperaturSW08(200);
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
        assertEquals(293.15f,TemperaturSW08.covnertCelsiusToKelvin(20f));
    }

    @Test
    void convertKelvintoCesius() {
        assertEquals(20f, TemperaturSW08.convertKelvintoCesius(293.15f));
    }

    @Test
    void convertCelsiustoFahrenheit() {
        assertEquals(50f, TemperaturSW08.convertCelsiustoFahrenheit(10f));
    }

    @Test
    void convertFahrenheitToCelsius() {
        assertEquals(10f, TemperaturSW08.convertFahrenheitToCelsius(50f));
    }
}