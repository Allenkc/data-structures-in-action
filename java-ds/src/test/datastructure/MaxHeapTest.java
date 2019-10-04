package test.datastructure;

import main.datastructure.MaxHeap;
import main.datastructure.MinHeap;
import org.junit.jupiter.api.Test;

public class MaxHeapTest {

    @Test
    public void testMaxHeap(){
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(new int[]{5,3,17,10,84,19,6,22,9});
        int[] tmp = maxHeap.getHeap();
        maxHeap.createHeap();
        maxHeap.print();

//        minHeap.insert(5);
//        minHeap.insert(3);
//        minHeap.insert(17);
//        minHeap.insert(10);
//        minHeap.insert(84);
//        minHeap.insert(19);
//        minHeap.insert(6);
//        minHeap.insert(22);
//        minHeap.insert(9);
//        minHeap.minHeap();
//
//        minHeap.print();
//        System.out.println("The Min val is " + minHeap.remove());
    }
}
