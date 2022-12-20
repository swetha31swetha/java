package Exmple250;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the diagonal1 1:");
        double d1=input.nextDouble();
        System.out.println("enter the diagonal1 2:");
        double d2=input.nextDouble();
        double area=(d1*d2)/2;
        System.out.println("the diagona values in:"+area);

    }
}
