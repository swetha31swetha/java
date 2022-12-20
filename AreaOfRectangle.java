package Exmple250;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length");
        int n=in.nextInt();
        System.out.println("enter the breadth");
        int s=in.nextInt();
        int area=n*s;
        System.out.println("the area of rectangle:"+area);
    }
}
