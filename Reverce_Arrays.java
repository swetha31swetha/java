package Exmple250;

import java.util.Arrays;

public class Reverce_Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("enter the reverse array");
        int temp;
        for(int i=0;i<arr.length/2;i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
            System.out.println("the reverse value:"+ Arrays.toString(arr));
        }
    }

