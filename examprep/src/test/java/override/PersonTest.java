package override;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        this.person = new Person("Peter", 10);
    }

    @Test
    void testToString() {
        String expected = "Name: Peter, Age: 10";
        assertEquals(expected, person.toString());
    }


}