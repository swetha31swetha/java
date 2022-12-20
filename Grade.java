package Exmple250;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Float quiz_score,mid_score,final_score,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the quiz score");
        quiz_score=in.nextFloat();
        System.out.println("enter the mid score");
        mid_score=in.nextFloat();
        System.out.println("enter the final score");
        final_score=in.nextFloat();
        avg=(quiz_score+mid_score+final_score)/3;
        if(avg>=90) {
            System.out.println("your grade:A");
        } else if ((avg>=70)&&(avg<90)) {
            System.out.println("your grade:B");
        } else if ((avg>=50)&&(avg<70)) {
            System.out.println("your grade:C");
        }
        else if((avg<50)) {
            System.out.println("your grade:F");
            
        }

    }

    }

