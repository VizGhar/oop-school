package xyz.kandrac;

public final class Utils {

    private Utils() {
    }

    public static double computeDistance(Point p1, Point p2) {
        double a = p2.getX() - p1.getX();
        double b = p2.getY() - p1.getY();
        return Math.sqrt(a * a + b * b);
    }

    public static double computeManhattanDistance(Point p1, Point p2) {
        double a = Math.abs(p2.getX() - p1.getX());
        double b = Math.abs(p2.getY() - p1.getY());
        return a + b;
    }

    public static double computeLineLength(Line line) {
        return computeDistance(line.getPoint1(), line.getPoint2());
    }

    public static boolean rectangleContainsPoint(Rectangle rect, Point point) {
        double smallerX;
        double smallerY;
        double higherX;
        double higherY;

        if (rect.point1.getX() > rect.point2.getX()) {
            smallerX = rect.point2.getX();
            higherX = rect.point1.getX();
        } else {
            smallerX = rect.point1.getX();
            higherX = rect.point2.getX();
        }

        if (rect.point1.getY() > rect.point2.getY()) {
            smallerY = rect.point2.getY();
            higherY = rect.point1.getY();
        } else {
            smallerY = rect.point1.getY();
            higherY = rect.point2.getY();
        }

        boolean containsHorizontal = point.getX() >= smallerX && point.getX() <= higherX;
        boolean containsVertical = point.getY() >= smallerY && point.getY() <= higherY;

        return containsHorizontal && containsVertical;
    }
}
