package Exmple250;
import java.util.Arrays;
public class OddEvenNumEX22 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ctreven = 0,ctrodd = 0;
        System.out.println("original Array:" + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ctreven++;
            } else
                ctrodd++;
        }
        System.out.printf("\nNumber of even element arrays%d:", ctreven);
        System.out.printf("\nNumber of odd element aarrays%d:", ctrodd);
        System.out.println("\n");

    }
}
