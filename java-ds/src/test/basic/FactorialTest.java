package test.basic;

import main.basic.Factorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FactorialTest {

    @Test
    public void testFactorial() {

        int result = Factorial.doFactorial(5);
        Assertions.assertEquals(120, result);

        int result2 = Factorial.doFactorial(0);
        Assertions.assertEquals(1, result2);

        int result3 = Factorial.doFactorial(10);
        Assertions.assertEquals(3628800 ,result3);

    }
}
