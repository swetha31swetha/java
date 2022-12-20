package Exmple250;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the ny numbers");
        long num=in.nextLong();
        int count=0;
        while(num>0) {
            num = num / 10;
            count++;
        }
            System.out.println("count:"+count);
        }



    }
