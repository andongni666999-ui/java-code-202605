package com.org.structure.bridgePattern;

// 具体实现化类B
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现B");
    }
}