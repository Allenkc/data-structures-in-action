package main.basic;

public class Factorial {

    /**
     * 關鍵是遞迴式:
     *
     * n! = {
     *      1 , if n=0
     *      (n-1)! * n , if n > 0
     * }
     *
     *
     * @param n
     * @return
     */
    public static int doFactorial(int n) {

        if(n == 0){
            return 1;
        }

        return doFactorial(n-1)*n;
    }
}
