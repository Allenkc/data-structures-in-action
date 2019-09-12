package test.basic;

import main.basic.Gcd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GcdTest {

    @Test
    public void gcdTest(){
        Assertions.assertEquals(Gcd.get(12,2),2);
        Assertions.assertEquals(Gcd.get(18,32),2);
        Assertions.assertEquals(Gcd.get(1024,0),1024);

        Assertions.assertEquals(Gcd.get2(12,2),2);
        Assertions.assertEquals(Gcd.get2(18,32),2);
        Assertions.assertEquals(Gcd.get2(1024,0),1024);
    }
}
