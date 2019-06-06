package calculator;

import org.junit.Assert;
import org.junit.Test;


public class SumaTest {

    @Test
    public void operar() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(2), new Float(2));
        if (result > 4 || result < 4) {
            Assert.fail();
        }
    }


}
