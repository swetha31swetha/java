package Exmple250;
import java.util.Scanner;
public class Cylinder {
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r=s.nextDouble();
        System.out.println("Enter the height:");
        double h=s.nextDouble();

        double  volume=((22*r*r*h)/7);
        System.out.println("volume of Cylinder is: " +volume);

    }
}
