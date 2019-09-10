package test;

import main.sort.InsertionSort;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test public void testInsertionSort() {
        int[] testArray = { 1, 11, 5, 88, 9, 23, 18, 3 };

        int[] afterSortArray = InsertionSort.sort(testArray);
        this.output(afterSortArray);

        int[] testArray2 = { 87 };
        int[] afterSortArray2 = InsertionSort.sort(testArray2);
        this.output(afterSortArray2);

    }

    @Test public void testSortStringArray() {
        String[] testStringArray = { "a", "c", "f", "b", "e", "d" };
        InsertionSort.sort(testStringArray);
        this.output(testStringArray);

        String[] testStringArray2 = {};

        InsertionSort.sort(testStringArray2);
        this.output(testStringArray2);

        String[] testStringArray3 = { "k" };
        this.output(testStringArray3);
    }

    private void output(int[] array) {

        int i = 0;

        for (int tmp : array) {
            System.out.print(tmp);
            if (i++ != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private void output(String[] array) {

        int i = 0;

        for (String tmp : array) {
            System.out.print(tmp);
            if (i++ != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
