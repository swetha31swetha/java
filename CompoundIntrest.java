package Exmple250;

public class CompoundIntrest {
    public static void main(String[] args) {
        double amount=0,Principal=1000,Rate=10,Time=3,ci;
        System.out.println("principal:"+Principal);
        System.out.println("Rate:"+Rate);
        System.out.println("time:"+Time);
        amount=Principal*((1+Rate/100)*(1+Rate/100)*(1+Rate/100));
        System.out.println("amount:"+amount);
        ci=amount-Principal;
        System.out.println("the compound interest of:"+ci);
    }
}
