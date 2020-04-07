package xyz.kandrac;

import java.util.List;

public final class Table {

    private final String tableName;

    private final List<String> columnNames;

    private Table(String tableName, List<String> columnNames) {
        this.tableName = tableName;
        this.columnNames = columnNames;
    }

    public String getTableName() {
        return tableName;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }
}
