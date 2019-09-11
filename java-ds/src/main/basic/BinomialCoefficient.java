package main.basic;

public class BinomialCoefficient {

    /**
     * 關鍵是遞迴式要能寫出來:
     * C n 取 m = {
     * 1 , if m=0 或 n=m
     * C n-1 取 m + C n-1 取 m-1 , otherwise
     * }
     *
     * @param n
     * @param m
     * @return
     */
    public static int showRecursicely(int n, int m) {

        if (n == m || m == 0) {
            return 1;
        }

        return showRecursicely(n - 1, m) + showRecursicely(n - 1, m - 1);
    }
}
