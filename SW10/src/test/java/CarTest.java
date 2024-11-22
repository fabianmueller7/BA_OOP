import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car carObj = new Car("Car1",0);

    @BeforeEach
    void setUp() {

    }

    @Test
    void setTank() {
        assertEquals(carObj.getTank(), 0);
        carObj.setTank(80);
        assertEquals(carObj.getTank(), 80);
        carObj.setTank(110);
        assertEquals(carObj.getTank(), 0);
    }
}