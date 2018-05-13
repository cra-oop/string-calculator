import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Calculator calc = new Calculator();

    @Test
    public void 두개_더하기(){
        assertEquals(7, calc.add(3, 4));
    }
    @Test
    public void 두개_빼기(){
        assertEquals(4, calc.sub(7,3));
    }
    @Test
    public void 두개_곱하기(){
        assertEquals(6, calc.multi(2,3));
    }
    @Test
    public void 두개_나누기(){
        assertEquals(2, calc.div(6,3));
    }

}
