package Exmple250;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first num:");
        int num1 = input.nextInt();
        System.out.println("enter the second num:");
        int num2 = input.nextInt();
        System.out.println("enter the third num:");
        int num3 = input.nextInt();

    if(num1>num2)
        if(num1>num3)
            System.out.println("the greatest num:" + num1);

        if(num2>num1)
            if(num2>num3)
                System.out.println("the greatest num:"+num2);

        if (num3>num1)
                if (num3>num2)
                    System.out.println("the greatest num is:"+num3);
                }
            }

