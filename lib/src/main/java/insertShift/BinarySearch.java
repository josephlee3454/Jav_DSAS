package insertShift;
import org.checkerframework.checker.units.qual.A;

import java.util.*;

public class BinarySearch {

//        public static int findIdx(int arr[], int t)
//        {
//            int idx = Arrays.binarySearch(arr, t);///
//            return (idx < 0) ? -1 : idx; ///if idx is less then 0 return -1 else return idx
//        }

    public static int binarySearch(int[] arr, int target) {

        if (arr == null || arr.length == 0) {//if arr is null or the length == 0
            return -1;//if its meant return -1
        }

        int left = 0;// declare int left as 0
        int right = arr.length - 1; // declare int right == the length of 0

        while (left < right) { // iterate while left is less than the right
            int mid = (left + right) / 2;// take note here whats happening we adding left and right together well if
            // your array 8 postions long and and you ware in the on the first iteration it would be 0 + 8

            if (arr[mid] == target) {//if the middle eqauls the targert then return the midddle
                return mid;
            }


            if (arr[mid] < target) { // check this out  If the  mid is less than the target
                //then left = left + right + 1/2
                left = (left + right + 1) / 2;
            }

            if (arr[mid] > target) {
                right = mid;
            }
        }

        if (arr[left] == target) {
            return left;
        }

        return -1;
    }
}



//        public static void main(String[] args)
//        {
//            int[] new_arr = {1,2,3,4,5,6,7};
//
//            System.out.println(" this is where 5 is: " + findIdx(new_arr, 5));
//        }





