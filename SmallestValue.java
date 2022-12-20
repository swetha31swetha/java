package Exmple250;


import java.util.Arrays;

public class SmallestValue {
    public static void main(String[] args) {
        int[] array={20,30,40,50,60,70,90,30};
        System.out.println("enter the smallest value:"+ Arrays.toString(array));
        int max=0;
        int min=0;
        for(int i=0;i< array.length;i++) {
            if (array[i] > max)
                max = array[i];

            else if (array[i] < min)
                min = array[i];
        }
            System.out.println("the smallest values are:"+(max-min));

            }
        }


