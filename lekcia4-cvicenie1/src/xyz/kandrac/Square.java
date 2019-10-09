package xyz.kandrac;

public class Square {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getObvod() {
        return 4 * a;
    }

    public double getArea() {
        return a * a;
    }
}
