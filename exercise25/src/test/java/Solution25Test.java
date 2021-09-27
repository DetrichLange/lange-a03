import baseline.Solution25;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator_testVeryWeak() {
        Solution25 testApp = new Solution25();

        int expected = 1;
        int actual = testApp.passwordValidator("12345");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_testWeak() {
        Solution25 testApp = new Solution25();

        int expected = 2;
        int actual = testApp.passwordValidator("ABCDE");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_testStrong() {
        Solution25 testApp = new Solution25();

        int expected = 3;
        int actual = testApp.passwordValidator("abcde12345");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_testVeryStrong() {
        Solution25 testApp = new Solution25();

        int expected = 4;
        int actual = testApp.passwordValidator("123!abc?");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_testUnknown() {
        Solution25 testApp = new Solution25();

        int expected = 5;
        int actual = testApp.passwordValidator("?!?!?!?!?!");

        assertEquals(expected, actual);
    }
}