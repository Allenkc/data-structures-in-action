package main.basic;

public class SequentialSum {

    /**
     * 從 1 to n 加總
     *
     * @param n
     * @return
     */
    public static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return n+sum(n-1);

    }
}
