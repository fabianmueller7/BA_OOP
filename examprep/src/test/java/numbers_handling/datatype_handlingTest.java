package numbers_handling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class datatype_handlingTest {

    Datatype_handling handlerObj;

    @BeforeEach
    void setUp() {
        this.handlerObj = new Datatype_handling();
    }

    @Test
    void roundFloat() {
        float numberf = 0.12345f;
        numberf = this.handlerObj.roundFloat(numberf);
        assertEquals(0.12f, numberf);
        assertNotEquals(0.12345f, numberf);
        assertTrue(numberf == 0.12f);
        assertFalse(numberf == 0.12345f);
    }

    @Test
    public void testMaxTwoArguments() {
        // Test for max(int a, int b)
        assertEquals(5, handlerObj.max(3, 5), "Max of 3 and 5 should be 5");
        assertEquals(10, handlerObj.max(10, 7), "Max of 10 and 7 should be 10");
        assertEquals(-1, handlerObj.max(-1, -3), "Max of -1 and -3 should be -1");
    }

    @Test
    public void testMaxThreeArguments() {
        // Test for max(int a, int b, int c)
        assertEquals(10, handlerObj.max(10, 7, 5), "Max of 10, 7, and 5 should be 10");
        assertEquals(8, handlerObj.max(2, 8, 3), "Max of 2, 8, and 3 should be 8");
        assertEquals(-2, handlerObj.max(-2, -5, -10), "Max of -2, -5, and -10 should be -2");
    }

    @Test
    public void testMax2() {
        // Test for max2(int a, int b, int c)
        assertEquals(10, handlerObj.max2(10, 7, 5), "Max of 10, 7, and 5 should be 10");
        assertEquals(8, handlerObj.max2(2, 8, 3), "Max of 2, 8, and 3 should be 8");
        assertEquals(-2, handlerObj.max2(-2, -5, -10), "Max of -2, -5, and -10 should be -2");
    }

    @Test
    public void testMaxN() {
        // Test for maxN(int... args)
        assertDoesNotThrow(() -> handlerObj.maxN(1, 5, 3, 9, 7), "Method should execute without exception");
    }
}