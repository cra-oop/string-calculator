import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    @Test
    public void 덧셈(){
        assertEquals(7,calc.add(3,4));
    }
    @Test
    public void 뺄셈(){
        assertEquals(-1,calc.sub(3,4));
    }
    @Test
    public void 곱셈(){
        assertEquals(12,calc.mul(3,4));
    }
    @Test
    public void 나눗셈() {
        assertEquals(0, calc.div(3, 4));
    }
    @Test(expected=RuntimeException.class)
    public void 영으로나누기(){
        calc.div(5,0);
    }
    @After
    public void tearDown(){
        calc = null;
    }

}
