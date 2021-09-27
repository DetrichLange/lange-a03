import baseline.PaymentCalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void paymentCalculatorTest(){
        PaymentCalculator testCalculator = new PaymentCalculator(6000, 0.12, 100);

        int expected = 92;
        int actual = testCalculator.calculateMonthsUntilPaidOff();

        assertEquals(expected, actual);
    }
}