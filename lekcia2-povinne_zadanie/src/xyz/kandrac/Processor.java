package xyz.kandrac;

public class Processor {

    private int no1;
    private int no2;
    private int no3;

    public Processor(int no1, int no2, int no3) {
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;
    }

    int getLargest() {
        return (no1 > no2) ? ((no1 > no3) ? no1 : no3) : (no2 > no3 ? no2 : no3);
    }

    int getSmallest() {
        return (no1 < no2) ? ((no1 < no3) ? no1 : no3) : (no2 < no3 ? no2 : no3);
    }

    double getAverage() {
        return ((double) no1 + (double) no2 + (double) no3) / 3;
    }
}
