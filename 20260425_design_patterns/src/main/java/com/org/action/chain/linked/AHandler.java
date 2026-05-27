package com.org.action.chain.linked;

public class AHandler extends Handler{
    @Override
    public void handle() {
        System.out.println("AHandler");

        if (next != null) {
            next.handle();
        }
    }
}
