package main.basic;

public class AckermansFuncction {

    public static int get(int m , int n){

        if( m == 0){
            return n+1;
        }

        if( n ==0){
            return get(m-1,1);
        }

        return get(m-1 , get(m , n-1));
    }
}
