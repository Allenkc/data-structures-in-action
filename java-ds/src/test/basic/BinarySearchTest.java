package test.basic;

import main.basic.BinarySearch;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void test(){

        int arr[] = { 2, 3, 4, 10, 40 };


        int result= BinarySearch.binarySearch(arr , 10);
        System.out.print(result);

    }
}
