package Exmple250;

import java.time.Month;
import java.util.Scanner;

public class SwitchMonth {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the month num:");
     String Month="unknown";
     int month=input.nextInt();
     System.out.println("enter the year");
     int year= input.nextInt();
     int  numOfDaysInMonth=0;
     switch (month) {
         case 1:
             Month = "january";
             numOfDaysInMonth = 31;
             break;
         case 2:
             Month = "february";
             if (year % 400 == 0 || (year % 100 != 0 || (year % 4 == 0))) {
             numOfDaysInMonth = 29;
             } else{
            numOfDaysInMonth = 28;
             }
             break;

         case 3:
             Month="March";
             numOfDaysInMonth=31;
             break;
            case 4:
                Month="April";
                numOfDaysInMonth=30;
                break;
            case 5:
                Month="May";
                numOfDaysInMonth=31;
                break;
            case 6:
                Month="June";
                numOfDaysInMonth=30;
                break;
            case 7:
                Month="July";
                numOfDaysInMonth=31;
                break;
            case 8:
                Month="August";
                numOfDaysInMonth=30;
                break;
            case 9:
                Month="September";
                numOfDaysInMonth=30;
                break;
            case 10:
                Month="October";
                numOfDaysInMonth=31;
                break;
            case 11:
                Month="November";
                numOfDaysInMonth=30;
                break;
            case 12:
                Month="December";
                numOfDaysInMonth=31;
                break;
        }
        System.out.println(year+":"+Month+"="+numOfDaysInMonth);
    }
}


