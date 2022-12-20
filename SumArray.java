package Exmple250;

public class SumArray {
    public static void main(String[] args) {
        int my_array[]={10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        for(int i:my_array){
            sum+=i;
            System.out.println(sum);
        }
    }
}
