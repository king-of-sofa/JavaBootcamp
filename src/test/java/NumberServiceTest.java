import lv.messages.NumberService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    @Test
    void rangeSum() {
        NumberService numberServiceTest = new NumberService();
        int expectedResult = 25;
        int actualResult = numberServiceTest.rangeSum(3,7);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void rangeEvenCount() {
        NumberService numberServiceTest = new NumberService();
        int expectedResult = 4;
        int actualResult = numberServiceTest.rangeEvenCount(2, 8);

        assertEquals(expectedResult, actualResult);
    }
}