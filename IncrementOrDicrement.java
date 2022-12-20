package Exmple250;

import java.util.Scanner;

public class IncrementOrDicrement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first num");
        double num1= in.nextDouble();
        System.out.println("enter the second num");
        double num2= in.nextDouble();
        System.out.println("enter the third num");
        double num3= in.nextDouble();
        if(num1<num2&&num1<num2) {
            System.out.println("all the increment order");
        } else if (num1>num2||num1>num3||num2>num3) {
            System.out.println("all the decrement order");
        }
        else {
            System.out.println("all the increment and decrement order");

        }

    }
    }

