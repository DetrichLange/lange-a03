import baseline.Solution32;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void compareGuess_test() {
        Solution32 testApp = new Solution32();

        String expected = "X";
        String actual = testApp.compareGuess(5, 5);
        assertEquals(expected, actual);

        String expected2 = "Too high.";
        String actual2 = testApp.compareGuess(10, 5);
        assertEquals(expected2, actual2);
    }

    @Test
    void randomTarget_test(){
        Solution32 testApp = new Solution32();

        int actual = testApp.randomTarget(1);
        assertTrue(actual >= 1 && actual <= 10);
    }
}