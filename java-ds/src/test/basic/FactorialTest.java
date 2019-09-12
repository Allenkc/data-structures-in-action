package test.basic;

import main.basic.Factorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FactorialTest {

    @Test
    public void testFactorial() {

        Assertions.assertEquals(120, Factorial.doFactorialRecursively(5));

        Assertions.assertEquals(1, Factorial.doFactorialRecursively(0));

        Assertions.assertEquals(3628800, Factorial.doFactorialRecursively(10));

        Assertions.assertEquals(2432902008176640000L, Factorial.doFactorialRecursively(20));


        Assertions.assertEquals(120, Factorial.doFactorialIteratively(5));
        Assertions.assertEquals(1, Factorial.doFactorialIteratively(0));
        Assertions.assertEquals(3628800, Factorial.doFactorialIteratively(10));
        Assertions.assertEquals(2432902008176640000L, Factorial.doFactorialIteratively(20));

    }
}
