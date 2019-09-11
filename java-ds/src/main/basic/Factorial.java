package main.basic;

public class Factorial {

    /**
     * 關鍵是遞迴式:
     * <p>
     * n! = {
     * 1 , if n=0
     * (n-1)! * n , if n > 0
     * }
     *
     * @param n
     * @return
     */
    public static int doFactorialRecursively(int n) {

        if (n == 0) {
            return 1;
        }

        return doFactorialRecursively(n - 1) * n;
    }

    public static int doFactorialIteratively(int n) {

        if (n == 0) {
            return 1;
        }

        int i;
        int product = 1;

        for (i = 1; i <= n; i++) {

            product = product * i;

        }

        return product;

    }
}
