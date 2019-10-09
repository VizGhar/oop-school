package xyz.kandrac;

import java.util.ArrayList;

/**
 * Toto je Trieda, ktora opisuje, ako vyzera vnutro ziackej knizky.
 * Ked ju vytvorim, tak chcem zvonka vidiet tieto metody/atributy:
 *
 * - storeMark
 * - getFinalMark
 *
 * Zaroven nechcem, aby bolo zvonka vidiet
 * - marks
 *
 * Takze ak vytvorim objekt Ziacka knizka sposobom
 *
 * ZiackaKnizka knizka = new ZiackaKnizka();
 *
 * Tak viem nad objektom knizka zavolat len
 *
 * - knizka.storeMark(1)
 * - knizka.getFinalMark()
 */
public class ZiackaKnizka {

    /**
     * Zoznam znamok. Je to atribut objektu a pokym bude
     * tento objekt existovat, bude existovat aj tento
     * zoznam.
     */
    private ArrayList<Integer> marks = new ArrayList<>();

    /**
     * Metoda ulozi znamku do triednej knizky.
     *
     * Z tejto metody mam pristup ku vsetkym metodam a atributom
     * tohto objektu + ku vsetkym parametrom metody (v tomto
     * pripade mark)
     *
     * Kedze viem pristupit k atributu `marks` a mam dostupny
     * parameter `mark`, viem `mark` ulozit do `marks`
     *
     * Ukoncenim tejto metody sa premenna `mark` v tomto objekte
     * strati, preto je nutne ulozit si ju do `marks`
     */
    public void storeMark(int mark) {
        marks.add(mark);
    }

    /**
     * Metoda vrati desatinne cislo reprezentujuce vysledne hodnotenie.
     *
     * Z tejto metody mam pristup ku vsetkym metodam a atributom
     * tohto objektu + ku vsetkym parametrom metody (v tomto
     * pripade ziadne parametre nemam)
     *
     * takze viem zavolat `marks`, `storeMark`, `getFinalMark`
     */
    public double getFinalMark() {
        double allMarks = 0;

        for(int i = 0; i < marks.size(); i++) {
            allMarks += marks.get(i);
        }

        return allMarks / marks.size();
    }
}
