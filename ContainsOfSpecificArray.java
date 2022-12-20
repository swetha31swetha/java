package Exmple250;

public class ContainsOfSpecificArray {
    public static void main(String[] args) {
        int[] my_array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(contain(my_array1, 10));
        System.out.println(contain(my_array1, 20));
    }
    public static boolean contain(int[] arr,int item){
    for(int num:arr) {
        if (item == num) {
            return true;
        }
    }
    return false;
       }
    }


