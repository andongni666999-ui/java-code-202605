package com.org.structure.bridgePattern;

public class DriverMangerOne extends DriverManger{

    @Override
    public Connection getConnection() {
        System.out.println("这是由DriverMangerOne来管理的链接");
        return super.getConnection();
    }
}
