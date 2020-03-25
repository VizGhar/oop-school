package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.setHodina(10);

        if (weather.getHodina() == 10) {
            System.out.println("Success");
        }

    }
}
