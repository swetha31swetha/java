package Exmple250;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side of equilateral");
        double n= input.nextDouble();
        double area=(Math.sqrt(3)/4)*(n*n);
        System.out.println("the equilateral triangle:"+area);
    }
}
