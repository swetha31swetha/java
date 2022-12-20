package Exmple250;

public class IndexOfArray {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8};
        int index=0;
        for(int i=0;i< num.length;i++) {
            if (num[i] == 5) {
                index = i;
            }
        }
        System.out.println("position of:"+index);

            }
        }
