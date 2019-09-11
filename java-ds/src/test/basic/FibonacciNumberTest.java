package test.basic;

import main.basic.FibonacciNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumberTest {

    @Test
    public void testFib() {

        Assertions.assertEquals(FibonacciNumber.showFibNumberIteratively(0), 0);
        Assertions.assertEquals(FibonacciNumber.showFibNumberIteratively(1), 1);
        Assertions.assertEquals(FibonacciNumber.showFibNumberIteratively(2), 1);
        Assertions.assertEquals(FibonacciNumber.showFibNumberIteratively(8), 21);
        Assertions.assertEquals(FibonacciNumber.showFibNumberIteratively(15), 610);

        Assertions.assertEquals(FibonacciNumber.showFibNumberRecursively(0), 0);
        Assertions.assertEquals(FibonacciNumber.showFibNumberRecursively(1), 1);
        Assertions.assertEquals(FibonacciNumber.showFibNumberRecursively(2), 1);
        Assertions.assertEquals(FibonacciNumber.showFibNumberRecursively(8), 21);
        Assertions.assertEquals(FibonacciNumber.showFibNumberRecursively(15), 610);


    }
}
