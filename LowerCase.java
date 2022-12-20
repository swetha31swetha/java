package Exmple250;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name");
        String name= in.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
