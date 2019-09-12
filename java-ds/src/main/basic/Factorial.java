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
    public static long doFactorialRecursively(long n) {

        if (n < 0) throw new RuntimeException("Underflow error in factorial");
        else if (n > 20) throw new RuntimeException("Overflow error in factorial");
        else if (n == 0) {
            return 1;
        }

        return doFactorialRecursively(n - 1) * n;
    }

    public static long doFactorialIteratively(long n) {

        if (n < 0) throw new RuntimeException("Underflow error in factorial");
        else if (n > 20) throw new RuntimeException("Overflow error in factorial");
        else if (n == 0) {
            return 1;
        }

        int i;
        long product = 1L;

        for (i = 1; i <= n; i++) {

            product = product * i;

        }

        return product;

    }
}
