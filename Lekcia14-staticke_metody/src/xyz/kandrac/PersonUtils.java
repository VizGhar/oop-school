package xyz.kandrac;

public final class PersonUtils {

    private PersonUtils() {

    }

    public static boolean hasTitle(String fullName) {
        return fullName.startsWith("Mgr.") ||
                fullName.startsWith("Ing.") ||
                fullName.startsWith("PhD") ||
                fullName.startsWith("Bc.");
    }
}
