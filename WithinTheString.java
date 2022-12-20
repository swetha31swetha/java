package Exmple250;

import java.util.Scanner;

public class WithinTheString {
    public static void main(String[] args) {
        String str = "Tech study";
        System.out.println("original=" + str);
        int index1 = str.charAt(0);
        int index2 = str.charAt(9);
        System.out.println("enter the 0 charAt position" + (char) index1);
        System.out.println("enter the 10 charAt" + (char) index2);
    }
}