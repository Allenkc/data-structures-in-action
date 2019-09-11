package main.basic;

/**
 * Greatest common divisor (GCD)
 * 最大公約數
 */
public class Gcd {

    /**
     * 關鍵是Recursive Formula
     *
     * GCD(A , B) = {
     *     B , if (A mod B) = 0
     *     GCD(B , A mod B) , otherwise
     * }
     * @param a
     * @param b
     * @return gcd result
     */
    public static int get(int a , int b) {

        if ( (a%b) == 0){
            return b;
        }

        return get(b , a%b);

    }
}
