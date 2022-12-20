package Exmple250;

import java.util.Scanner;

public class VoluemeOfPrism {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the base:");
        double s1= in.nextDouble();
        System.out.println("enter the height:");
        double s2= in.nextDouble();
        double area=s1*s2;
        System.out.println("area of prism:"+area);
    }
}
