import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private Point point;
    private Point point2;

    @BeforeEach
    void setUp() {
        this.point = new Point(0, 0);
        this.point2 = new Point(10, 10);
    }

    @Test
    void compareTo() {
        assertEquals(0, point.compareTo(point));
        assertNotEquals(0, point.compareTo(point2));
    }

    @org.junit.jupiter.api.Test
    void pointEqualsHashcode() {
        assertEquals(this.point.hashCode(), this.point.hashCode());
        assertNotEquals(this.point.hashCode(), this.point2.hashCode());
    }

    @org.junit.jupiter.api.Test
    void pointEquals() {
        assertTrue(this.point.equals(this.point));
        assertFalse(this.point.equals(this.point2));
    }
}