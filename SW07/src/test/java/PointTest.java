import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private Point point;

    @BeforeEach
    void setUp() {
        this.point = new Point(0, 0);
    }

    @Test
    void compareTo() {
        assertEquals(0, point.compareTo(point));
        Point point2 = new Point(10, 10);
        assertNotEquals(0, point.compareTo(point2));
    }
}