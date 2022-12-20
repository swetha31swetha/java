package Exmple250;

import java.util.Scanner;

public class NaturalOddNum {
    public static void main(String[] args) {
        int i,n,sum=0;
        System.out.println("enter the terms");
        Scanner num=new Scanner(System.in);
        n= num.nextInt();
        System.out.println("\n odd numbers are:");
        for(i=1;i<=n;i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
            System.out.println("the sum of odd number:"+n+"terms is:"+sum);
        }
    }

