package Exmple250;

import java.util.Scanner;

public class PositiveOrNagative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the values");
        int num= in.nextInt();
        if (num>0) {
            System.out.println("enter the positive value ");
        }
        else if(num<0) {
            System.out.println("enter the negative value");
        }
        else{
            System.out.println("num of zero");

        }
    }
}
