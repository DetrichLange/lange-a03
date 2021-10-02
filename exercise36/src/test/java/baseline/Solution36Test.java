package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {


    @Test
    void average_test() {
        Solution36 testApp = new Solution36();
        List<Double> testNumbers = new ArrayList<>();

        testNumbers.add(100.0);
        testNumbers.add(200.0);
        testNumbers.add(300.0);
        testNumbers.add(400.0);
        testNumbers.add(500.0);

        double expected = 300;

        double actual = testApp.average(testNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void max_test() {
        Solution36 testApp = new Solution36();
        List<Double> testNumbers = new ArrayList<>();

        testNumbers.add(100.0);
        testNumbers.add(200.0);
        testNumbers.add(300.0);
        testNumbers.add(400.0);
        testNumbers.add(500.0);

        double expected = 500;

        double actual = testApp.max(testNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void min_test() {
        Solution36 testApp = new Solution36();
        List<Double> testNumbers = new ArrayList<>();

        testNumbers.add(100.0);
        testNumbers.add(200.0);
        testNumbers.add(300.0);
        testNumbers.add(400.0);
        testNumbers.add(500.0);

        double expected = 100;

        double actual = testApp.min(testNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void std_test() {
        Solution36 testApp = new Solution36();
        List<Double> testNumbers = new ArrayList<>();

        testNumbers.add(100.0);
        testNumbers.add(200.0);
        testNumbers.add(300.0);
        testNumbers.add(400.0);
        testNumbers.add(500.0);

        double expected = 141.42;

        double actual = testApp.std(testNumbers, testApp.average(testNumbers));

        assertEquals(expected, actual, 0.01);
    }
}