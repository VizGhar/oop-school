package xyz.kandrac;

public final class DnaUtils {

    private DnaUtils() {

    }

    public static boolean isDna(String text) {
        for (int i = 0; i <text.length(); i++) {
            char character = text.charAt(i);
            if (character != 'T' && character != 'G' && character != 'C' &&character != 'A') {
                return false;
            }
        }
        return true;
    }
}
