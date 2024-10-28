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
    void personVerifier() {
        //EqualsVerifier.forClass(Person.class).verify();
    }

    @org.junit.jupiter.api.Test
    void personEqualsHashcode() {
       assertEquals(this.person.hashCode(), this.person.hashCode());
    }

    @org.junit.jupiter.api.Test
    void personEquals() {
        assertTrue(this.person.equals(this.person));
    }


    @Test
    void compareTo() {

        assertEquals(0, this.person.compareTo(this.person));
        Person random = new Person(11,"Peter","Henry");
        assertNotEquals(0, this.person.compareTo(random));
    }
}