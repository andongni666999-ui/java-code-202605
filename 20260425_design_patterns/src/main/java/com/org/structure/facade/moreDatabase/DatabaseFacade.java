package com.org.structure.facade.moreDatabase;

public class DatabaseFacade {

    private Database mysqlDatabase;
    private Database oracleDatabase;

    public DatabaseFacade() {
        mysqlDatabase = new MySQLDatabase();
        oracleDatabase = new OracleDatabase();
    }

    public void executeSQL(String sql, String databaseType) {
        if (databaseType.equals("MySQL")) {
            mysqlDatabase.execute(sql);
        } else if (databaseType.equals("Oracle")) {
            oracleDatabase.execute(sql);
        } else {
            throw new IllegalArgumentException("Unknown database type: " + databaseType);
        }
    }

}
