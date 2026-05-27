package com.org.structure.bridgePattern;

// 具体实现化类A，具体实现可以多样化，独立变化
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现A");
    }
}