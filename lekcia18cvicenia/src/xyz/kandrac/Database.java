package xyz.kandrac;

import java.util.Set;

public abstract class Database {

    private Set<Table> tables;

    public Database() {
    }

    public Database(Set<Table> tables) {
        this.tables = tables;
    }

    public boolean createTable(Table table) {
        return tables.add(table);
    }

    public boolean dropTable(String tableName) {
        // specialny zapis na jeden riadok
        // return tables.removeIf((table -> table.getTableName().equals(tableName)));

        for (Table table: this.tables) {
            if (table.getTableName().equals(tableName)) {
                return this.tables.remove(table);
            }
        }

        return false;
    }

}
