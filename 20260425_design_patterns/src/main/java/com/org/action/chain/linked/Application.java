package com.org.action.chain.linked;

public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new AHandler());
        chain.addHandler(new BHandler());
        chain.handle();
    }
}
