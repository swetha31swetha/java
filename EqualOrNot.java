package Exmple250;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first num");
        int num1= in.nextInt();
        System.out.println("enter the second num");
        int num2= in.nextInt();
        System.out.println("enter the third num");
        int num3= in.nextInt();
        if(num1==num2&&num1==num3) {
            System.out.println("all numbers are equal");
        } else if (num1==num2||num1==num3||num2==num3) {
            System.out.println("neither of all different num");
        } else {
            System.out.println("all different numbers");
        }

    }
    }
