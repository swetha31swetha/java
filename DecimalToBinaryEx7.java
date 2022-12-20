package Exmple250;

import java.util.Scanner;

public class DecimalToBinaryEx7 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the decimal num");
        int num=input.nextInt();
        System.out.println("enter the decimal are binary number:"+Integer.toBinaryString(num));
    }
}