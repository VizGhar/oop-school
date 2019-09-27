package xyz.kandrac;

import java.util.Random;

public class Creature {

    private int maxHitPoints;
    private int hitPoints;
    private int armor;
    private int strengthLowest;
    private int strengthHighest;
    private Inventory inventory = new Inventory();

    public Creature(int hitPoints, int armor, int strengthLowest, int strengthHighest) {
        this.maxHitPoints = hitPoints;
        this.hitPoints = hitPoints;
        this.armor = armor;
        this.strengthLowest = strengthLowest;
        this.strengthHighest = strengthHighest;
    }

    /**
     * [EN]
     * Print actual status of this creature
     * <p>
     * [SK]
     * Vypis aktualny stav tejto bytosti
     */
    public void printStatus() {
        System.out.println(hitPoints + " / " + maxHitPoints);
    }

    /**
     * [EN]
     * Attack other {@link Creature}.
     * <p>
     * Damage dealt is computed this way:
     * 1. compute defense strength - 100 armor means no damage dealt 0 armor means 100% damage dealt
     * 2. compute attack strength - random number from interval strengthLowest - strengthHighest
     * 3. apply multiplier on attacking creature strength
     * <p>
     * [SK]
     * Zautoc na inu bytost
     * <p>
     * Damage ktory udelim sa vypocita takto:
     * 1. vypocitaj obrannu silu - 100 armor znamena 0% udeleneho damage; 0 armor znamena 100% damage
     * 2. vypocitaj obrannu silu - nahodne cislo z intervalu strengthLowest - strengthHighest
     * 3. aplikuj obrannu silu na silu utociacej jednotky
     *
     * @param defender creature to be attacked by this creature
     */
    public void attackCreature(Creature defender) {
        Random random = new Random();
        int strength = random.nextInt(strengthHighest - strengthLowest) + strengthLowest;
        double multiplier = ((double) (100 - defender.armor)) / 100.0;
        double damageDealt = strength * multiplier;
        defender.hitPoints -= damageDealt;
    }

    /**
     * [EN]
     * Compute whether this creature is alive or not
     * <p>
     * [SK]
     * Vypocitaj, ci je tato bytost nazive alebo nie
     *
     * @return true if alive
     */
    public boolean isAlive() {
        return hitPoints > 0;
    }
}
