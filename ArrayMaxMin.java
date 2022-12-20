package Exmple250;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 3, 4, 52, 34, 5, 8};
        int max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < max) {
                    max = array[i];
                }
                if (array[j] > min) {
                    min = array[j];
                }
            }
        }
            System.out.println("enter the max num:" + max);
            System.out.println("enter the min num:" + min);
        }
    }


