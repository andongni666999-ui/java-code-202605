package com.org.structure.bridgePattern;

public class DriverMangerTwo extends DriverManger{

    @Override
    public Connection getConnection() {
        System.out.println("这是由DriverMangerTwo来管理的链接");
        return super.getConnection();
    }
}
