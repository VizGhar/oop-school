package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        System.out.println(CreditCardUtils.isVisa("4111 1111 1111 1111"));
        System.out.println(PersonUtils.hasTitle("Ing. Jozef"));
        System.out.println(MathUtils.getMedian(new double[]{5.2, 5.4}));
        System.out.println(DnaUtils.isDna("TGCACCTGC"));
        System.out.println(CoordinationsUtils.getCoordinatesAt(1));
    }
}
