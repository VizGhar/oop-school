package xyz.kandrac;

public class Main {

    public static void main(String[] args) {

        SecurityModule securityModule = new SecurityModule();

        securityModule.storeUser("janko", "heslo");

        System.out.println("User authenticated = " +
                securityModule.authenticateUser("janfsko", "heslo"));

        System.out.println("User authenticated = " +
                securityModule.authenticateUser("janko", "heslo"));

        System.out.println("User authenticated = " +
                securityModule.authenticateUser("janko", "heslo2"));
    }
}
