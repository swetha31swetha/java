package Exmple250;
import java.util.Arrays;
public class ArrayNumEX21 {
    public static void main(String[] args) {
        int[] Array_nums={10,20,30};
        System.out.println("original Arrays:"+Arrays.toString(Array_nums));
        int x= Array_nums[0];
        Array_nums[0]= Array_nums[Array_nums.length-1];
        Array_nums[Array_nums.length-1]=x;
        System.out.println("the original arrays are:"+Arrays.toString(Array_nums));



    }
}
