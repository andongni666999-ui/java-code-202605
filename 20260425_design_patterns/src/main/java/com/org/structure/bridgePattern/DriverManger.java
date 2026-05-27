package com.org.structure.bridgePattern;

public abstract class DriverManger {
    // 依赖于抽象接口而不是具体实现
    private Driver driver;


    public Connection getConnection() {
        return driver.connect();
    }


    public void register(Driver driver) {
        this.driver = driver;
    }

}
