package Exmple250;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the vowels:");
        char ch=in.next( ).charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("the character are" + ch + "vowels");
        }
        else if((ch<='a'&&ch>='z')||(ch<='A'&&ch>='z')) {
            System.out.println("it is consent");
        }else{
            System.out.println("it is not alphabet");

        }


    }
}
