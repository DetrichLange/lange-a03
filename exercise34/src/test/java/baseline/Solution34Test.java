package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void removeNameFromArray_test() {
        Solution34 testApp = new Solution34();

        String[] employeeNames = new String[]{
                "John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"};

        String[] expected = new String[]{
                "John Smith",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"
        };

        String[] actual = testApp.removeNameFromArray(employeeNames, "Jackie Jackson");
    }
}