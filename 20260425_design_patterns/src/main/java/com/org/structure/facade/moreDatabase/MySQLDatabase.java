package com.org.structure.facade.moreDatabase;

public class MySQLDatabase implements Database {
    @Override
    public void execute(String sql) {
        System.out.println("Executing " + sql + " in MySQL database");
    }

}
