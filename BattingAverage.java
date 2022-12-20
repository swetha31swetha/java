package Exmple250;

public class BattingAverage {
    public static void main(String[] args) {
        int TotalMatch=100,TotalRuns=3500,innings=80,NotOut=1;
        double avg;
        avg=TotalRuns/(innings-NotOut);
        System.out.println("batting average:"+avg);
    }
}
