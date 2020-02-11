package xyz.kandrac;

public final class CoordinationsUtils {

    private CoordinationsUtils() {

    }

    public static Coordinates getCoordinatesAt(double radians) {
        Coordinates result = new Coordinates();
        result.setX(Math.cos(radians * Math.PI));
        result.setY(Math.sin(radians * Math.PI));
        return result;
    }
}
