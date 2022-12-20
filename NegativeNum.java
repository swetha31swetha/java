package Exmple250;

import java.util.Scanner;

public class NegativeNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter te any numbers");
        int num= in.nextInt();
        if(num>0) {
            System.out.println("enter the positive num");
        } else if (num<0) {
            System.out.println("enter the negative num");
        }
        else{
            System.out.println("enter the zero");

        }
    }
    }

