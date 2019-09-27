package xyz.kandrac;

/**
 * Inventar, ktory ma kazda Creature. Kazdy inventar ma velkost 6 poli,
 * co znamena, ze je pren vhodne pouzit obycajne pole. Pouzite je pole
 * int, ale do buducna bude vhodne do pola ukladat priamo nejake itemy.
 */
public class Inventory {

    private int[] content = new int[6];

    public Inventory() {
        // vyprazdnit inventar
        for (int i = 0; i < 6; i++) {
            content[i] = -1;
        }
    }

    /**
     * Pridaj polozku item do inventara
     *
     * @param item id itemu
     * @return false ak item nebol do inventara pridany
     */
    public boolean addToInventory(int item) {
        for (int i = 0; i < 6; i++) {
            if (content[i] < 0) {
                content[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Ziskat polozku z inventara na danej pozicii
     *
     * @param position z ktorej sa ma item zobrat
     * @return item ID
     */
    public int getFromInventory(int position) {
        int result = content[position];
        content[position] = -1;
        return result;
    }
}
