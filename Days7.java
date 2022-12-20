package Exmple250;

import java.util.Scanner;

public class Days7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the days");
        int day = input.nextInt();

        if (day == 1) {
            System.out.println("sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else {
            System.out.println("saturday");
        }

    }

}
