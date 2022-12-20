package Exmple250;

import java.util.Scanner;

public class PositiveIntegerEX26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the number");
        int num = input.nextInt();

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;

        }
        System.out.println("sum of the digit num:" + (sum));

    }
}
