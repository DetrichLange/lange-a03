package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void sortEmployeeList_test() {
        Solution39 testApp = new Solution39();

        List<Map<String, String>> testEmployeeList = testApp.makeEmployeeList();

        String actual = testApp.sortEmployeeList(testEmployeeList).toString();

        String expected = "[{Separation Date=, Position=DBA, First Name=Jacquelyn, Last Name=Jackson}, {Separation Date=, Position=Programmer, First Name=Jake, Last Name=Jacobson}, {Separation Date=2016-12-31, Position=Manager, First Name=John, Last Name=Johnson}, {Separation Date=2015-12-19, Position=District Manager, First Name=Michaela, Last Name=Michaelson}, {Separation Date=2015-12-18, Position=Web Developer, First Name=Sally, Last Name=Webber}, {Separation Date=2016-10-05, Position=Software Engineer, First Name=Tou, Last Name=Xiong}]";

        assertEquals(expected, actual);

    }
}