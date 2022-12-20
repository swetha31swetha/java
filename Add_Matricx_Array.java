package Exmple250;

import java.util.Scanner;

public class Add_Matricx_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("enter of row matrix");
        a = in.nextInt();
        System.out.println("enter of column matrix");
        b = in.nextInt();

        int[][] n1 = new int[a][b];
        int[][] n2 = new int[a][b];
        int[][] n3 = new int[a][b];

        System.out.println("enter the first values");
        for (c = 0; c < a; c++)
            for (d = 0; d < b; d++)
                n1[c][d] = in.nextInt();

        System.out.println("enter the second values");
        for (c = 0; c < a; c++)
            for (d = 0; d < b; d++)
                n2[c][d] = in.nextInt();

                for (c = 0; c < a; c++)
                    for (d = 0; d < b; d++)
                        n3[c][d] = n1[c][d] + n2[c][d];

        System.out.println("enter the matrix are");
        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++)
                System.out.println(n3[c][d] + "\t");
                System.out.println();
            }
        }
    }

