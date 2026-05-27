package com.org.action.chain.linked;

public class BHandler extends Handler{
    @Override
    public void handle() {
        System.out.println("BHandler");

        if (next != null) {
            next.handle();
        }
    }
}
