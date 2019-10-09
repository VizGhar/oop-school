package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        Authenticator auth = new Authenticator();

        /*
           Uvedomte si, ze storeUser aj authenticate prijimaju same String parametre.
           Teda prijimaju uplne konkretne hodnoty napr. "P455w0Rd".
         */
        auth.storeUser("Janko", "P455w0Rd");
        auth.storeUser("Ferko", "P455w0Rd1");

        /*
           Dalsia vec, metoda authenticate vracia boolean, takze si ho do premennej
           takeho isteho typu viem ulozit. Ak by vracala String, tak si viem hodnotu
           ulozit do premennej typu String. Ak by vracala vlastny typ, napr.
           Authenticator, potom by sme vysledok vedeli ulozit do Authenticator a pod.
         */
        boolean authenticated1 = auth.authenticate("Janko", "Passwrod");
        boolean authenticated2 = auth.authenticate("Ferko", "P455w0Rd1");

        System.out.println("Authenticated1: " + authenticated1);
        System.out.println("Authenticated2: " + authenticated2);
    }
}
