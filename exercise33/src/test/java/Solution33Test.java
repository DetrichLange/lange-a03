import baseline.Solution33;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void getAnswer_test() {
        Solution33 testApp = new Solution33();

        String[] possibleAnswers = new String[]{"Yes.", "No.", "Maybe.", "Ask again later."};

        String actual = testApp.getAnswer(possibleAnswers, 0);

        String expected = "Yes.";

        assertEquals(actual, expected);
    }
}