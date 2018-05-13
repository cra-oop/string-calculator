import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void 더하기 () {
        Calculator calculator = new CalculatorService();
        Assert.assertEquals(calculator.add(1,2), 3);
    }
    @Test
    public void 빼기 () {
        Calculator calculator = new CalculatorService();
        Assert.assertEquals(calculator.subtract(3,2), 1);
    }
    @Test
    public void 곱하기 () {
        Calculator calculator = new CalculatorService();
        Assert.assertEquals(calculator.multiply(2,3), 6);
    }
    @Test
    public void 나누기 () {
        Calculator calculator = new CalculatorService();
        Assert.assertEquals(calculator.divide(10,2), 5);
    }
}
