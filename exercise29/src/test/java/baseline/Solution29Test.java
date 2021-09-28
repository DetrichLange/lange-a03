package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void checkRateValid_test(){
        Solution29 testApp = new Solution29();

        assertTrue(testApp.checkRateValid("6"));
        assertFalse(testApp.checkRateValid("0"));
        assertFalse(testApp.checkRateValid("1Q"));
    }
}