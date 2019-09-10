package main.sort;

public class InsertionSort {

    public static int[] sort(int[] array) {

        if (array.length == 0) {
            return null;
        }

        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            // Insert A[j] into the sorted sequence A[1..j-1]
            int i = j - 1;
            while (i > -1 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }

        return array;
    }

    public static void sort(String[] strings) {

        if (strings.length > 1) {

            for (int j = 1; j < strings.length; j++) {
                String keyString = strings[j];
                int i = j - 1;
                while (i > -1 && strings[i].compareTo(keyString) > 0) {
                    strings[i + 1] = strings[i];
                    i--;
                }
                strings[i + 1] = keyString;
            }

        }

    }
}
