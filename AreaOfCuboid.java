package Exmple250;

import java.util.Scanner;

public class AreaOfCuboid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length coboid:");
        double l=in.nextDouble();
        System.out.println("Enter the breadth of cubiod:");
        double b=in.nextDouble();
        System.out.println("Enter height of cubiod:");
        double h=in.nextDouble();

        double  area=(2*((l*b)+(b*h)+(h*l)));
        System.out.println("Total surface area Of cuboid is:" +area);

    }
    }

