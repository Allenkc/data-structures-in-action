package test.basic;

import main.basic.BinomialCoefficient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinomialCoefficientTest {

    @Test
    public void binomialTest() {

        Assertions.assertEquals(BinomialCoefficient.showRecursicely(5, 5), 1);
        Assertions.assertEquals(BinomialCoefficient.showRecursicely(5, 0), 1);
        Assertions.assertEquals(BinomialCoefficient.showRecursicely(5, 2), 10);
    }
}
