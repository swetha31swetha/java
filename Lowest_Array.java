package Exmple250;

import java.util.Arrays;

public class Lowest_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array:"+ Arrays.toString(arr));
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == min) {
                secondmin = arr[i];
            } else if (arr[i] < min) {
                secondmin = arr[i];
                min = arr[i];
            } else if (arr[i] < secondmin) {
                secondmin = arr[i];
            }
        }
            System.out.println("second lowest num is :"+secondmin);
        }
    }

