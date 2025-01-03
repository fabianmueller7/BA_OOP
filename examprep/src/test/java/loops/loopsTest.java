package loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

class loopsTest {

    Loops loopsObj;

    @BeforeEach
    void setUp() {
        this.loopsObj = new Loops();
    }

    @Test
    void switchCase() {
        assertEquals("ROT", loopsObj.SwitchCase("rot"), "Expected 'ROT' for input 'rot'");
        assertEquals("GRÜN", loopsObj.SwitchCase("grün"), "Expected 'GRÜn' for input 'grün'");
        assertEquals("BLAU", loopsObj.SwitchCase("blau"), "Expected 'BLAU' for input 'blau'");
        assertEquals("unbekannt", loopsObj.SwitchCase("gelb"), "Expected 'unbekannt' for unknown input");
        assertEquals("unbekannt", loopsObj.SwitchCase(""), "Expected 'unbekannt' for empty input");
    }


    @Test
    void foreach() {
        List<String> input =  new ArrayList<>();
        input.add("hello");
        input.add("world");
        input.add("java");

        List<String> expected = new ArrayList<>();
        expected.add("HELLO");
        expected.add("WORLD");
        expected.add("JAVA");

        assertEquals( expected,this.loopsObj.Foreach(input));
    }
}