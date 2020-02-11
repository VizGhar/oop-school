package xyz.kandrac;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
    }

    public static void zadanie1() {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        double hodnota1 = Double.parseDouble(text1);
        double hodnota2 = Double.parseDouble(text2);

        System.out.println("Sucet -> " + (hodnota1 + hodnota2));
        System.out.println("Rozdiel -> " + (hodnota1 - hodnota2));
    }

    public static void zadanie2() {
        Scanner sc = new Scanner(System.in);
        int text1 = sc.nextInt();

        boolean by2 = (text1 % 2) == 0;
        boolean by3 = (text1 % 3) == 0;
        boolean by4 = (text1 % 4) == 0;
        boolean by5 = (text1 % 5) == 0;

        String result = "";
        if (by2) result += "2, ";
        if (by3) result += "3, ";
        if (by4) result += "4, ";
        if (by5) result += "5";

        System.out.println("Cislo je delitelne " + result);
    }

    public static void zadanie3() {
        for (double i = 0.0; i < 2 * Math.PI; i += 0.5) {
            System.out.println("Sinus pre " + i + " = " + Math.sin(i));
        }
    }

    public static void zadanie4() {
        // Načítajte zo štandardného vstupu rodné číslo a na výstup napíšte, či je toto rodné číslo validné. Skontrolujte teda, či je dodržaný formát yymmdd (u žien sa k mm pripočíta 50) a či je deliteľné 11
        Scanner sc = new Scanner(System.in);

        // nacitanie rodneho cisla ako text
        String rodneCislo = sc.nextLine();

        // vyhodenie lomitka
        String cisteRodneCislo = rodneCislo.replace("/", "");

        long rodneCisloLong = Long.parseLong(cisteRodneCislo);

        if (rodneCisloLong % 11 != 0) {
            System.out.println("Nevalidne cislo - nie je delitelne 11");
        }

        int m = Integer.parseInt(cisteRodneCislo.substring(2, 4));
        int d = Integer.parseInt(cisteRodneCislo.substring(4, 6));

        boolean mesiacOk = (m >= 1 && m <= 12) || (m >= 51 && m <= 62);

        if (!mesiacOk) {
            System.out.println("Mesiac v nespravnom formate");
        }

        boolean denOk = (d < 32); // TODO: tu by sa hodilo osetrit kazdy mesiac samostatne

        if (!denOk) {
            System.out.println("Den v nespravnom formate");
        }
    }
}
