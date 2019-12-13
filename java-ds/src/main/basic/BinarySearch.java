package main.basic;

public class BinarySearch {

    public static int binarySearch(int arr[], int x){
        int l = 0;
        int r = arr.length -1 ;
        while ( l <= r) {
            int m = (l + r ) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;

        }

        return -1;
    };

}
