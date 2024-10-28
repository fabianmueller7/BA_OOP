import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturSW7Test {

    private TemperaturSW7 temp;

    @BeforeEach
    void setUp() {
        this.temp = new TemperaturSW7(100);
    }

    @Test
    void compareTo() {
        assertEquals(0, temp.compareTo(temp));
        TemperaturSW7 temp2 = new TemperaturSW7(200);
        assertNotEquals(0, temp.compareTo(temp2));
    }
}