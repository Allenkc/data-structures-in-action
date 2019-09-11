package main.basic;

import java.util.List;

public class Permutation {

    public static void permute(String text) {
        char[] textArray = text.toCharArray();
        int len = textArray.length;
        permute(textArray, 0, len);
    }

    private static void permute(char[] text, int i, int n) {

        int j;

        if (i == n) {
            for (j = 0; j < n; j++) {
                System.out.print(text[j]);
            }
            System.out.println();
        } else {
            for (j = i; j < n; j++) {
                swap(text, i, j);
                permute(text, i + 1, n);
                swap(text, i, j);
            }
        }
    }

    private static void swap(char[] a, int i, int j) {
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
