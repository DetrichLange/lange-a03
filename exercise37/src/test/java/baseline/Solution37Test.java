package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void generatePassword_test(){
        Solution37 testApp = new Solution37();

        List<Character> testPassword = testApp.generatePassword(8,2,2);
        int passwordLetters = 0;
        int passwordNumbers = 0;
        int passwordSpecial = 0;

        for(char passwordChar : testPassword){
            if(passwordChar > 64 && passwordChar < 91){
                passwordLetters++;
            }
            else if(passwordChar > 96 && passwordChar < 123){
                passwordLetters++;
            }
            else if(passwordChar > 47 && passwordChar < 58){
                passwordNumbers++;
            }
            else{
                passwordSpecial++;
            }
        }
        assertEquals(2, passwordSpecial);
        assertEquals(2, passwordNumbers);
        assertEquals(4, passwordLetters);
        assertEquals(8, testPassword.size());
    }
}