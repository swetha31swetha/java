package Exmple250;

import java.util.Scanner;

public class countEx12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        String name=input.nextLine();
        count(name);
}
public static void count(String name){
        char[]ch=name.toCharArray();
        int letter=0;
        int number=0;
        int space=0;
        int other=0;
        for(int i=0;i<name.length();i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
    System.out.println("enter the string");
    System.out.println("letter:"+letter);
    System.out.println("space:"+space);
    System.out.println("number:"+number);
    System.out.println("other:"+other);


    }
}
