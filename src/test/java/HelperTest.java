import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelperTest {

    @Test
    public void 문자열쪼개기 () {
        Helper helper = new HelperService();
        String[] arr = {"1", "+", "2"};
        assertEquals(helper.splitString("1 + 2"), arr);
    }

    @Test
    public void 연산자체크_더하기 () {
        Helper helper = new HelperService();
        assertEquals(helper.isOperator("+"), true);
    }
    @Test
    public void 연산자체크_빼기 () {
        Helper helper = new HelperService();
        assertEquals(helper.isOperator("-"), true);
    }
    @Test
    public void 연산자체크_곱하기 () {
        Helper helper = new HelperService();
        assertEquals(helper.isOperator("*"), true);
    }
    @Test
    public void 연산자체크_나누기 () {
        Helper helper = new HelperService();
        assertEquals(helper.isOperator("/"), true);
    }

    @Test
    public void 계산하기 () {
        Calculator calculator = new CalculatorService();
        Helper helper = new HelperService();

        helper.setCalculator(calculator);
        assertEquals(helper.calculate("3 + 2 - 1 / 2 * 5"), 10);
    }
}
