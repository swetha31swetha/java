package Exmple250;

import java.util.Arrays;

public class Largest_NumOf_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("enter the largest num:" + Arrays.toString(arr));
            int index = arr.length - 1;
            while (arr[index] == arr[arr.length - 1]) {
                index--;
                System.out.println("enter the largest value:" + arr[index]);
            }
        }
    }
