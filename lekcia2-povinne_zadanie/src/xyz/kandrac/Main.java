package xyz.kandrac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Processor processor = new Processor(
                Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine())
        );

        switch (scanner.nextLine()) {
            case "L": System.out.println(processor.getLargest()); break;
            case "S": System.out.println(processor.getSmallest()); break;
            case "A": System.out.println(processor.getAverage()); break;
        }
    }
}
