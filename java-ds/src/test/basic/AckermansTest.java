package test.basic;

import main.basic.AckermansFuncction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AckermansTest {

    @Test
    public void test(){
        Assertions.assertEquals(AckermansFuncction.get(2,2) , 7);
        Assertions.assertEquals(AckermansFuncction.get(2,1) , 5);
        Assertions.assertEquals(AckermansFuncction.get(1,2) , 4);
        Assertions.assertEquals(AckermansFuncction.get(2,3) , 9);
    }
}
