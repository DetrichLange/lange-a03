package baseline;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    void sortEmployeeList_test() {
        Solution40 testApp = new Solution40();

        List<Map<String, String>> testEmployeeList = testApp.makeEmployeeList();

        String actual = testApp.searchEmployees("J", testEmployeeList).toString();

        String expected = """
                John Johnson        | Manager           | 2016-12-31    \s
                Jake Jacobson       | Programmer        |               \s
                Jacquelyn Jackson   | DBA               |               \s
                """;

        assertEquals(expected, actual);

    }
}