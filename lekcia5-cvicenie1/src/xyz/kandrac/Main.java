package xyz.kandrac;

public class Main {

    public static void main(String[] args) {

        ZiackaKnizka ziackaKnizka = new ZiackaKnizka();

        ziackaKnizka.storeMark(3);
        ziackaKnizka.storeMark(2);
        ziackaKnizka.storeMark(2);

        System.out.println("Final mark: " + String.format("%.0f", ziackaKnizka.getFinalMark()));
    }

}
