package com.org.action.template;

public class Main {

    public static void main(String[] args) {
        AbstractTemplate templateA = new ConcreteTemplateA();
        AbstractTemplate templateB = new ConcreteTemplateB();

        System.out.println("Using Template A:");
        templateA.templateMethod();

        System.out.println("\nUsing Template B:");
        templateB.templateMethod();
    }

}
