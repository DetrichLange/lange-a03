package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumbers_test() {
        Solution38 testApp = new Solution38();

        int[] expected = {2, 0, 100, -6, 0, 0, 0};

        String[] testInputString = {"1", "2", "0", "100", "103", "-6", "-7"};

        int[] actual = testApp.filterEvenNumbers(testInputString);

        assertArrayEquals(expected, actual);
    }
}