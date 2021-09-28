import baseline.Solution28;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void numberAdder_test() {
        Solution28 solutionApp = new Solution28();

        int[] testNumbers = {1, 3, 5, 7, 9};

        int expected = 25;
        int actual = solutionApp.numberAdder(testNumbers);

        assertEquals(expected, actual);
    }
}