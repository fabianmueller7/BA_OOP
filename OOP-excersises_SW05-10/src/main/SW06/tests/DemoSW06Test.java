import static org.junit.jupiter.api.Assertions.*;

class DemoSW06Test {

    private DemoSW06 demoObj;

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        this.demoObj = new DemoSW06();
    }

    @org.junit.jupiter.api.Test
    void max() {
        assertEquals(5, demoObj.max(1,5));
        assertEquals(3, demoObj.max(3,1));
    }

    @org.junit.jupiter.api.Test
    void max1() {
        assertEquals(4, demoObj.max1(3,1,4));
        assertEquals(5, demoObj.max1(3,3,5));
        assertEquals(4, demoObj.max1(2,4,1));
    }

    @org.junit.jupiter.api.Test
    void max2() {
        assertEquals(4, demoObj.max2(3,1,4));
        assertEquals(5, demoObj.max2(3,3,5));
        assertEquals(4, demoObj.max2(2,4,1));
    }

    @org.junit.jupiter.api.Test
    void maxN() {
        assertEquals(6, demoObj.maxN(3,1,4,5,6));
        assertEquals(6, demoObj.maxN(3,3,5,5,6,1));
        assertEquals(2, demoObj.maxN(2));
    }
}