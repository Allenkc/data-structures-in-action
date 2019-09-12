package main.basic;

/**
 * Greatest common divisor (GCD)
 * 最大公約數
 */
public class Gcd {

    /**
     * 關鍵是Recursive Formula
     * <p>
     * GCD(A , B) = {
     * B , if (A mod B) = 0
     * GCD(B , A mod B) , otherwise
     * }
     *
     * @param a
     * @param b
     * @return gcd result
     */
    public static int get(int a, int b) {

        if (b == 0) return a;

        if ((a % b) == 0) {
            return b;
        }

        return get(b, a % b);

    }

    // iteratively
    public static int get2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
