package Exmple250;

public class AverageMark {
    public static void main(String[] args) {
        int[] add={30,40,50,50,60};
        int avrg=0;
        System.out.println("enter the average mark:");
        for(int i=0;i<add.length;i++) {
            avrg = avrg + add[i];
        }
            System.out.println("average masks in:"+avrg/add.length);
        }
    }

