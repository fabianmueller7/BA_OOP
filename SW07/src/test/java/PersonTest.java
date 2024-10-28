import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import nl.jqno.equalsverifier.*;


class PersonTest {

    private Person person;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.person = new Person(007,"Bond","James");
    }

    @org.junit.jupiter.api.Test
    void PersonConstructor() {
        assertEquals(007, person.getID());
        assertEquals("James", person.getFirstname());
        assertEquals("Bond", person.getLastname());
    }

    @Test
    void getID() {
        person.setID(006);
        assertEquals(true, person.getID() == 006);
    }

    @Test
    void testname() {
        assertNotEquals(true, person.getFirstname() == "William");
    }

    @org.junit.jupiter.api.Test
    void PersonVerifier() {
        EqualsVerifier.forClass(Person.class).verify();
    }


}