import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {



    @Test
    public void 두개_더하기(){
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(3, 4));
    }


}
