package Exmple250;

import java.util.Scanner;

public class PalindromEX24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the palindrome");
        int num = input.nextInt();
        System.out.println(Palindrome(num));
    }

    static int Palindrome(int num) {
        int original = num;
        int check = 0;
        int reverse = 0;
        while (num < 0) {
            reverse = num % 10;
            num = num / 10;
            check = check * 10 + reverse;
        }

        if (original == check) {
            System.out.println("the num is palindrome");

        } else {
            System.out.println("the num is not palindrome");
        }

        return original;
    }
}
