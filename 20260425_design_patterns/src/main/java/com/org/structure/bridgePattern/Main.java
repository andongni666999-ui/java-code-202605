package com.org.structure.bridgePattern;

public class Main {

    public static void main(String[] args) {
        // 先创建驱动实例
        Driver driver = new MysqlDriver();

        DriverManger driverManger = new DriverMangerOne();
        driverManger.register(driver);
        Connection connection = driverManger.getConnection();
        System.out.println(connection);

        Implementor implementorA = new ConcreteImplementorA();
        Abstraction abstractionA = new RefinedAbstraction(implementorA);
        abstractionA.operation();

        Implementor implementorB = new ConcreteImplementorB();
        Abstraction abstractionB = new RefinedAbstraction(implementorB);
        abstractionB.operation();
    }
}
