package Exmple250;
import java.util.Arrays;
public class Insert_Arrays {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array:"+Arrays.toString(array));
        for(int j:array) {
            array[5] = 8;
        }
            System.out.println("new array:"+Arrays.toString(array));
        }
    }

