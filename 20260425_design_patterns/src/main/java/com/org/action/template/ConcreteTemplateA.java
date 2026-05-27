package com.org.action.template;

public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    protected void step2() {
        System.out.println("Step 2 (A): Cook the dish using method A.");
    }
}
