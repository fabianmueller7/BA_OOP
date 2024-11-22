import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    private Temperatur temp;
    private Temperatur temp2;

    @BeforeEach
    void setUp() {
        this.temp = Temperatur.createFromCelsius(100);
        this.temp2 = Temperatur.createFromKelvin(200);
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
    void convertCelsiusToKelvin() {
        assertEquals(293.15f, Temperatur.convertCelsiusToKelvin(20f));
    }

    @Test
    void convertKelvinToCelsius() {
        assertEquals(20f, Temperatur.convertKelvinToCelsius(293.15f));
    }

    @Test
    void convertCelsiusToFahrenheit() {
        assertEquals(50f, Temperatur.convertCelsiusToFahrenheit(10f));
    }

    @Test
    void convertFahrenheitToCelsius() {
        assertEquals(10f, Temperatur.convertFahrenheitToCelsius(50f));
    }

    @Test
    void setKelvin() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.temp.setKelvin(-1);
        });
    }

    @Test
    void setCelsius() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.temp.setCelsius(-300);
        });
    }

    @Test
    void setFahrenheit() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.temp.setKelvin(-600);
        });
    }
}