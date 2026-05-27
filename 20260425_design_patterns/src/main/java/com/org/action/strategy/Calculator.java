package com.org.action.strategy;

public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double executeOperation(double num1, double num2) {
        return operation.execute(num1, num2);
    }

}
