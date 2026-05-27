package com.org.structure.facade.moreDatabase;

public class Client {

    public static void main(String[] args) {
        DatabaseFacade facade = new DatabaseFacade();
        facade.executeSQL("SELECT * FROM users", "MySQL");
        facade.executeSQL("SELECT * FROM customers", "Oracle");
    }
}
