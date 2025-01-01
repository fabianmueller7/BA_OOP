package exceptionhandling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import staticAndConstants.Example;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        this.person = new Person("Peter",12);
    }

    @Test
    void setName() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.person.setName("");
        });

        final Exception e =
                assertThrows(IllegalArgumentException.class, () -> {
                    this.person.setName("");
                });
        assertEquals("Name cannot be null or empty", e.getMessage());
    }

    @Test
    void setGender() {
        assertThrows(SecurityException.class, () -> {
            this.person.setGender(true);
        });
    }
}