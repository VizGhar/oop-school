package xyz.kandrac;

// Od tejto triedy nechceme dedit
public final class CreditCardUtils {

    // Tuto triedu nechceme instanciovat
    private CreditCardUtils() {
    }

    /**
     * Vrati true, ak je cislo karty vo formate VISA
     */
    public static boolean isVisa(String cardNumber) {
        // TODO: validacia cisla karty
        return cardNumber.charAt(0) == '4';
    }
}
