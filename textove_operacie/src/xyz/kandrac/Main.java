package xyz.kandrac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        zadanie1a();
        zadanie1b();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();
        zadanie8();
    }

    /**
     * Zadanie 1 riesenie 1
     * <p>
     * pouzitim vylucne metod substring a toUpperCase
     */
    private static void zadanie1a() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // ziskanie prveho pismena
        String firstLetter = input.substring(0, 1);
        // zvacsenie prveho pismena
        String firstLetterUpper = firstLetter.toUpperCase();
        // ziskanie zvysku textu
        String rest = input.substring(1);
        // vysledok
        System.out.println(firstLetterUpper + rest);
    }

    /**
     * Zadanie 1 riesenie 2
     * <p>
     * pouzitim metod charAt substring a Character.toUpperCase
     */
    private static void zadanie1b() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // ziskanie prveho pismena
        char firstLetter = input.charAt(0);
        // zvacsenie prveho pismena
        char firstLetterUpper = Character.toUpperCase(firstLetter);
        // ziskanie zvysku textu
        String rest = input.substring(1);
        // vysledok
        System.out.println(firstLetterUpper + rest);
    }

    /**
     * Zadanie 2
     */
    private static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // ziskanie prveho pismena
        char firstLetter = input.charAt(0);
        // zvacsenie prveho pismena
        char firstLetterUpper = Character.toUpperCase(firstLetter);
        // ziskanie zvysku textu
        String rest = input.substring(1);
        // zvysok zmenseny
        String restLower = rest.toLowerCase();
        // vysledok
        System.out.println(firstLetterUpper + restLower);
    }

    private static void zadanie3() {
        Scanner scanner = new Scanner(System.in);
        // nacitanie prveho textu
        String input1 = scanner.nextLine();
        // nacitanie druheho textu
        String input2 = scanner.nextLine();
        // porovnanie textu
        boolean result = input1.equals(input2);
        System.out.println(result);
    }

    private static void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        // nacitanie textu
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            // zober znak na pozicii i
            char pismeno = input.charAt(i);
            if (i % 2 == 0) {
                // zvysok po deleni 2 = 0 -> parne pismena -> zvacsit
                result += Character.toUpperCase(pismeno);
            } else {
                // zvysok po deleni 2 = 1 -> neparne pismena -> zmensit
                result += Character.toLowerCase(pismeno);
            }
        }
        System.out.println(result);
    }

    private static void zadanie5() {
        Scanner scanner = new Scanner(System.in);
        // nacitanie textu
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            // zober znak na pozicii i
            char character = input.charAt(i);
            if (Character.isDigit(character)) {
                // ak je znak cislo, zapamataj si ho
                result += character;
            }
        }
        System.out.println(result);
    }

    private static void zadanie6() {
        Scanner scanner = new Scanner(System.in);
        // nacitanie textu
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            // zober znak na pozicii i
            char character = input.charAt(i);
            // ak je znak pismeno, zapamataj si ho
            if (Character.isLetter(character)) {
                result += character;
            }
        }
        System.out.println(result);
    }

    private static void zadanie8() {
        Scanner scanner = new Scanner(System.in);
        // nacitanie textu
        String input = scanner.nextLine();
        boolean result = true;
        for (int i = 0; i < input.length() / 2; i++) {
            // zober znak na i-tej pozicii od zaciatku
            char fromStart = input.charAt(i);
            // zober znak na i-tej pozicii od konca = (dlzka - i)
            char fromEnd = input.charAt(input.length() - i - 1);
            if (fromStart != fromEnd) {
                // znaky sa nezhoduju -> mozeme prerusit cyklus
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}