package com.org.structure.bridgePattern;

public class OracleDriver implements Driver{
    @Override
    public Connection connect() {
        return new Connection("Oracle");
    }
}
