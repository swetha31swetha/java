package Exmple250;

public class CGPApercentage {
    public static void main(String[] args) {
        int num = 5;
        double mm[] = new double[num];
        double gg[] = new double[num];
        double cgpa, sum = 0;
        mm[0] = (95);
        mm[1] = (90);
        mm[2] = (80);
        mm[3] = (75);
        mm[4] = (70);

    for(int i=0;i<num;i++) {
        gg[i] = (mm[i]/10);
    }
    for(int i=0;i<num;i++) {
        sum += gg[i];
    }
        cgpa = sum / num;

        System.out.println("cgpa ="+cgpa);
        System.out.println("percentage of="+cgpa*9.0);
    }

    }

