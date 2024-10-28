import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturSW7Test {

    private TemperaturSW7 temp;
    private TemperaturSW7 temp2;

    @BeforeEach
    void setUp() {
        this.temp = new TemperaturSW7(100);
        this.temp2 = new TemperaturSW7(200);
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
}