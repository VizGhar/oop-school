package xyz.kandrac;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.56);
        Circle circle2 = new Circle(6.1);

        Square square1 = new Square(2.2);
        Square square2 = new Square(12.12);

        System.out.println("Circle 1 obvod = " + circle1.getObvod());
        System.out.println("Circle 1 area = " + circle1.getArea());
        System.out.println("Circle 2 obvod = " + circle2.getObvod());
        System.out.println("Circle 2 area = " + circle2.getArea());

        System.out.println("Square 1 obvod = " + square1.getObvod());
        System.out.println("Square 1 area = " + square1.getArea());
        System.out.println("Square 2 obvod = " + square2.getObvod());
        System.out.println("Square 2 area = " + square2.getArea());
    }
}
