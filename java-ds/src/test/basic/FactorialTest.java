package test.basic;

import main.basic.Factorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FactorialTest {

    @Test
    public void testFactorial() {

        int result = Factorial.doFactorialRecursively(5);
        Assertions.assertEquals(120, result);

        int result2 = Factorial.doFactorialRecursively(0);
        Assertions.assertEquals(1, result2);

        int result3 = Factorial.doFactorialRecursively(10);
        Assertions.assertEquals(3628800, result3);

        Assertions.assertEquals(120, Factorial.doFactorialIteratively(5));
        Assertions.assertEquals(1, Factorial.doFactorialIteratively(0));
        Assertions.assertEquals(3628800, Factorial.doFactorialIteratively(10));

    }
}
