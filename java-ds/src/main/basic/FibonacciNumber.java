package main.basic;

public class FibonacciNumber {

    public static int showFibNumberRecursively(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return showFibNumberRecursively(n - 1) + showFibNumberRecursively(n - 2);
    }

    public static int showFibNumberIteratively(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int number = 0;

        // represent as f0 at the start
        int a = 0;

        // represent as f1 at the start
        int b = 1;

        for (int i = 2; i <= n; i++) {
            number = a + b;
            a = b;
            b = number;
        }

        return number;

    }
}
