package com.org.action.observer.subscriber;

public class WebSubscriber implements Subscriber {
    @Override
    public void onEvent(String event) {
        System.out.println("Web收到事件: " + event);
    }


}
