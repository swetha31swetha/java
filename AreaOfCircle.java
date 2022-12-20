package Exmple250;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter the radius ");
        int s=input.nextInt();
        double area=(22*s*s)/7;
        System.out.println("the area of circle:"+area);
    }
}
