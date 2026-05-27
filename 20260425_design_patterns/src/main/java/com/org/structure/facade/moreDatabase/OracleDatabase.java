package com.org.structure.facade.moreDatabase;

public class OracleDatabase implements Database {
    @Override
    public void execute(String sql) {
        System.out.println("Executing " + sql + " in Oracle database");
    }
}
