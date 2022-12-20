package Exmple250;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length cuboid:");
        double c1= in.nextDouble();
        System.out.println("enter the height cuboid:");
        double c2= in.nextDouble();
        System.out.println("enter the breath cuboid:");
        double c3= in.nextDouble();
        double volume=c1*c2*c3;
        System.out.println("volume of cuboid:"+volume);
    }
}
