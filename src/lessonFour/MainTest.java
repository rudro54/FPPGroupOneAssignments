package lessonFour;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Testing Solution 1
    @Test
    @DisplayName("Test power(x=2, n=10)")
    void test1Power() {
        assertEquals(1024, Main.power(2,10));
    }

    @Test
    @DisplayName("Test power(x=0, n=2)")
    void test2Power() {
        assertEquals(0, Main.power(0,2));
    }

    @Test
    @DisplayName("Test power(x=2, n=0)")
    void test3Power() {
        assertEquals(1, Main.power(2,0));
    }


    //Testing Solution 2
    @Test
    @DisplayName("Test minimumCharacter(akel)")
    void test1MinimumCharacter() {
        assertEquals('a', Main.minimumCharacter("akel"));
    }

    @Test
    @DisplayName("Test minimumCharacter(Empty String)")
    void test2MinimumCharacter() {
        assertEquals('\0', Main.minimumCharacter(""));
    }
}