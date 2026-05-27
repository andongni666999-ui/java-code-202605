package com.org.structure.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent is doing something...");
    }
}
