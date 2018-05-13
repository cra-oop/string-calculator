import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    String sample = "5 + 7 - 2";
    @Test
    public void 띄어쓰기로나눈다(){
        assertEquals(new String[] {"5", "+", "7", "-", "2"}, Parser.parse(sample));

    }
}
