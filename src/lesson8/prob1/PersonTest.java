package lesson8.prob1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testGetLastName() {
        Person person = new Person("John", "Doe", 30);
        assertEquals("Doe", person.getLast());
    }

    @Test
    public void testToString() {
        Person person = new Person("John", "Doe", 30);
        assertEquals("John Doe 30", person.toString());
    }

    @Test
    public void testLastNameEmpty() {
        Person person = new Person("John", "", 30);
        assertEquals("", person.getLast());
    }

    @Test
    public void testAgeEdgeCase() {
        Person person = new Person("John", "Doe", 0);
        assertEquals("John Doe 0", person.toString());

        Person personNegative = new Person("Jane", "Doe", -5);
        assertEquals("Jane Doe -5", personNegative.toString());
    }

    @Test
    public void testSpecialCharactersInName() {
        Person person = new Person("J@hn", "D$e", 25);
        assertEquals("J@hn D$e 25", person.toString());
    }
}
