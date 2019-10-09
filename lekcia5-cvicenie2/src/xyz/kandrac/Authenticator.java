package xyz.kandrac;

import java.util.HashMap;

public class Authenticator {

    /**
     * Toto je atribut objektu, preto pokial existuje objekt,
     * bude existovat aj tento atribut.
     *
     * HashMap uklada dvojice key:value, teda kluc a hodnota.
     * Nemoze sa stat aby v HashMap boli ulozene 2 hodnoty s
     * rovnakym klucom, preto je vhodny na ukladanie dvojic
     * meno a heslo
     */
    private HashMap<String, String> userPasswords = new HashMap<>();

    /**
     * Ulozi userName a password do atributu userPasswords
     *
     * Mam pristup ku `userPasswords` aj k premennym, ktore
     * chcem do `userPasswords` ulozit (`userName`, `password`)
     */
    public void storeUser(String userName, String password) {
        userPasswords.put(userName, password);
    }

    /**
     * Metoda vrati true ak pouzivatel s danym menom a heslom
     * existuje v nasej "databaze"
     *
     * Zvonka to vyzera tak, ze sa pytame objektu authenticator:
     * "Povedz mi, ci mas u seba ulozeneho pouzivatela s tymto
     * `userName` a `password`"
     *
     * Vnutri to vyzera tak, ze sa tento objekt pozrie do svojej
     * "databazy" (userPasswords), ci ma vobec takeho pouzivatela
     * (ci metoda get(userName) vrati nejaku hodnotu). Ak ma
     * takeho pouzivatela, skontroluje, ci ma rovnake heslo
     */
    public boolean authenticate(String userName, String password) {
        String existingPassword = userPasswords.get(userName);

        if (existingPassword == null) {
            // v userPasswords neexistuje kluc userName, preto
            // sme nedostali ziadne existujuce heslo
            return false;
        } else {
            // ak sa nami zadane heslo (password) zhoduje s
            // heslom v "databaze" (existingPassword) vrat true
            return existingPassword.equals(password);
        }
    }
}
