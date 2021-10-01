package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void getWinner_test() {
        Solution35 testApp = new Solution35();

        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("John");
        listOfNames.add("Paul");
        listOfNames.add("George");
        listOfNames.add("Ringo");

        String expected = "Ringo";

        String actual = testApp.getWinner(listOfNames, 3);

        assertEquals(actual, expected);
    }
}