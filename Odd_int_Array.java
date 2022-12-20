package Exmple250;

import java.util.Arrays;

public class Odd_int_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("enter the odd intiger num:" + Arrays.toString(arr));
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }

        }
        for(int j=0;j<arr.length;j++) {
            if (arr[j] % 2 != 0) {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);

        }
    }

