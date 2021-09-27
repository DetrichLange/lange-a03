package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        Solution24 testApp = new Solution24();

        assertTrue(testApp.isAnagram("note", "tone"));
        assertFalse(testApp.isAnagram("note", "tonex"));
    }
}