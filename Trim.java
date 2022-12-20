package Exmple250;

import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name");
        String name= in.nextLine();
        System.out.println("new string:\n"+name.trim());
    }
}
