package com.org.action.strategy;

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new Addition());
        System.out.println("10 + 5 = " + calculator.executeOperation(10, 5));

        calculator.setOperation(new Subtraction());
        System.out.println("10 - 5 = " + calculator.executeOperation(10, 5));

        calculator.setOperation(new Multiplication());
        System.out.println("10 * 5 = " + calculator.executeOperation(10,5));
    }
}
