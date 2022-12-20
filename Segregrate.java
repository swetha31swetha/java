package Exmple250;


import java.util.Arrays;

public class Segregrate {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,0,1,1,0,0,1,1,1,0,0};
        System.out.println("enter the segrate value :"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
