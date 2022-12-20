package Exmple250;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the sphere:");
        double s1= in.nextDouble();
        double area=(4*22*s1*s1*s1)/(21);
        System.out.println("area of sphere:"+area);
    }
}
