package Exmple250;

public class SwappingEx6 {
    public static void main(String[] args) {
        int num1, num2, num3, temp;
        num1 = 20;
        num2 = 30;
        num3 = 40;
        System.out.println("before swapping:num1,num2,num3=" + num1 + "," + num2 + "," + +num3);
        temp=num1;
        num1=num2;
        num2=num3;
        num3=temp;
        System.out.println("after swapping:num1,num2,num3="+num1+","+num2+","+ +num3);
    }
}

