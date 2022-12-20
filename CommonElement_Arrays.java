package Exmple250;

import java.util.Arrays;

public class CommonElement_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {11, 12, 13, 14, 15, 16, 2, 3};
        System.out.println("enter the first value:" + Arrays.toString(arr1));
        System.out.println("enter the second value:" + Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    System.out.println("comment element:" + arr1[i]);
                }
            }
        }
    }
}
