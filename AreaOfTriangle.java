package Exmple250;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the width value:");
        double w= in.nextDouble();
        System.out.println("enter the height value:");
        double h= in.nextDouble();
        double area=(w*h)/2;
        System.out.println("the area of rectangle:"+area);
    }
}
