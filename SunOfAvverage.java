package Exmple250;

import java.util.Scanner;

public class SunOfAvverage {
    public static void main(String[] args) {
        int i, numbers = 0, sum = 0;
        double avg;
        {
            System.out.println("enter 5  numbers");
        }
        for( i=0;i<5;i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("System.in");
            numbers = in.nextInt();
            sum += numbers;
        }
            avg=sum/5;
            System.out.println("enter the sum of"+sum+"\nthe average:"+avg);
        }
    }

