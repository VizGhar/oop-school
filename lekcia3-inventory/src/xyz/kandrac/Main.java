package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        Creature creature1 = new Creature(1000, 20, 200, 250);
        Creature creature2 = new Creature(2000, 0, 120, 180);

        while (creature1.isAlive() && creature2.isAlive()) {
            creature1.attackCreature(creature2);
            creature2.attackCreature(creature1);
        }

        if (creature1.isAlive()) {
            System.out.print("Creature 1 WON - ");
            creature1.printStatus();
        } else if (creature2.isAlive()) {
            System.out.print("Creature 2 WON - ");
            creature2.printStatus();
        } else {
            System.out.print("DRAW");
        }
    }
}
