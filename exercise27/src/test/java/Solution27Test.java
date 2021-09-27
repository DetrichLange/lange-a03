import static org.junit.jupiter.api.Assertions.*;
import baseline.Solution27;
import org.junit.jupiter.api.Test;

class Solution27Test {

    Solution27 testApp = new Solution27();

    @Test
    public void nameNotBlankRule_Test(){
        assertTrue(testApp.nameNotBlankRule(""));
        assertFalse(testApp.nameNotBlankRule("Jack"));
    }

    @Test
    public void nameLengthRule_Test(){
        assertTrue(testApp.nameLengthRule("Q"));
        assertFalse(testApp.nameLengthRule("Linda"));
    }

    @Test
    public void employeeIDFormatRule_Test(){
        assertTrue(testApp.employeeIDFormatRule("AA-12345"));
        assertTrue(testApp.employeeIDFormatRule("9A-1234"));
        assertTrue(testApp.employeeIDFormatRule("A9-1234"));
        assertTrue(testApp.employeeIDFormatRule("AA01234"));
        assertTrue(testApp.employeeIDFormatRule("AA-A234"));
        assertTrue(testApp.employeeIDFormatRule("AA-1A34"));
        assertTrue(testApp.employeeIDFormatRule("AA-12A4"));
        assertTrue(testApp.employeeIDFormatRule("AA-123A"));
        assertFalse(testApp.employeeIDFormatRule("AA-1234"));
    }

    @Test
    public void zipCodeNumberRule_Test(){
        assertTrue(testApp.zipCodeNumberRule("123456"));
        assertTrue(testApp.zipCodeNumberRule("A2345"));
        assertTrue(testApp.zipCodeNumberRule("1A345"));
        assertTrue(testApp.zipCodeNumberRule("12A45"));
        assertTrue(testApp.zipCodeNumberRule("123A5"));
        assertTrue(testApp.zipCodeNumberRule("1234A"));
        assertFalse(testApp.zipCodeNumberRule("12345"));
    }

    @Test
    public void validateInput_Test(){
        String expected = "The first name must be at least 2 characters long.";
        String actual = testApp.validateInput("J", "Smith", "AA-1234", "32812");
    }

}