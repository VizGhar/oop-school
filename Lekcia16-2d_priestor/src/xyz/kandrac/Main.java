package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        Point p2 = new Point(8.0, 6.0);
        Point p1 = new Point(4.0, 3.0);
        double result = Utils.computeDistance(p1, p2);
        System.out.println("Vzdialenost medzi bodmi je : " + result);
        double result2 = Utils.computeManhattanDistance(p1, p2);
        System.out.println("Manhattan vzdialenost medzi bodmi je : " + result2);


        Line line = new Line(p1, p2);
        double result3 = Utils.computeLineLength(line);
        System.out.println("Moja usecka ma dlzku : " + result3);



        Rectangle rectangle = new Rectangle(p1, p2);
        Point p3 = new Point(10.0, 10.0);
        boolean result4 = Utils.rectangleContainsPoint(rectangle, p3);
        System.out.println("Obdlznik obsahuje bod : " + result4);

    }
}
