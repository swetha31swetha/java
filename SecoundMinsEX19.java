package Exmple250;

import java.util.Scanner;

public class SecoundMinsEX19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the secounds");
        int sec = input.nextInt();
        int a = sec % 60;
        int b = sec / 60;
        int c = b % 60;
        b = b / 60;
        System.out.println(b + ":" + c + ":" + a);
        System.out.println("\n");

    }
}