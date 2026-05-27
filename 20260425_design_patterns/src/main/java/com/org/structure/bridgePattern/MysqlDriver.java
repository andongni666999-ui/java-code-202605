package com.org.structure.bridgePattern;

public class MysqlDriver implements Driver{

    @Override
    public Connection connect() {
        return new Connection("mysql");
    }
}
