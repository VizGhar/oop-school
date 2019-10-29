package xyz.kandrac;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        boolean polozkaPridana = set.add(1);
        boolean polozkaSaNachadza = set.contains(1);

        System.out.println("Polozka pridana = " + polozkaPridana);
        System.out.println("Polozka sa nachadza = " + polozkaSaNachadza);

        boolean polozkaOdobrana = set.remove(1);
        polozkaSaNachadza = set.contains(1);

        System.out.println("Polozka odobrana = " + polozkaOdobrana);
        System.out.println("Polozka sa nachadza = " + polozkaSaNachadza);
    }
}
