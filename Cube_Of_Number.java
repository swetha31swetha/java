package Exmple250;

import java.util.Scanner;

public class Cube_Of_Number {
    public static void main(String[] args) {
        int i, n;
        System.out.println("enter the terms:");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("enter the cube of:" + i + "is:" + (i * i * i));
        }
    }
}

