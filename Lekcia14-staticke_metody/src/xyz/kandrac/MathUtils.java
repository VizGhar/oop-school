package xyz.kandrac;

public final class MathUtils {

    private MathUtils() {

    }

    public static double getMedian(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
