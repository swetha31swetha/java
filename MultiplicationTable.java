package Exmple250;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int j, num;
        System.out.println("enter the num of terms");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("\n");
        for (j = 0; j <= num; j++) {

            System.out.println(num + "x" + j + "=" + num * j);
        }
    }
}

