package xyz.kandrac;

import java.util.Set;

public final class Test {
    private Test() {

    }

    public static void test() {
        // vytvorenie databazy
        Database database = new Database();

        // kontrola, ci funguje getter a setter pre databazu
        database.setName("Databaza");
        System.out.println(database.getName()); // Databaza

        // vytvorenie stlpca
        Column column = new Column("INT", "ID");

        // kontrola, ci funguju gettery
        System.out.println(column.getName()); // ID
        System.out.println(column.getType()); // INT

        // vytvorenie tabulky
        Table table = new Table("Tabulka", Set.of(column));
        System.out.println(table.getTableName()); // Tabulka
        // kontrola, ci tabulka obsahuje spravny stlpec
        System.out.println(table.getColumns().contains(column)); // true

        // pridanie tabulky do databazy
        database.createTable(table);
    }
}
