package Exmple250;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the LeapYear");
        int year= in.nextInt();
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        if (a && (b || c))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}

