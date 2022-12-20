package Exmple250;

import java.util.Scanner;

public class AreaOfCube {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the cube:");
        double cube= in.nextDouble();
        double r=4*cube*cube;
        System.out.println("valume is cube:"+r);
    }
}
