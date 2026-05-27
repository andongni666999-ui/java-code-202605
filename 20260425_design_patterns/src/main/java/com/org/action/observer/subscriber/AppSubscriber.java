package com.org.action.observer.subscriber;

public class AppSubscriber implements Subscriber {
    @Override
    public void onEvent(String event) {
        System.out.println("App收到事件: " + event);
    }


}
