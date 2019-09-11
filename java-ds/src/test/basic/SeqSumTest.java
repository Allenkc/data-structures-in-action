package test.basic;

import main.basic.SequentialSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeqSumTest {

    @Test
    public void testSeqSum(){

        Assertions.assertEquals(SequentialSum.sum(0),0);
        Assertions.assertEquals(SequentialSum.sum(1),1);
        Assertions.assertEquals(SequentialSum.sum(100),5050);
    }
}
