package com.org.action.observer.subscriber;

public class Main {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Subscriber appSubscriber = new AppSubscriber();
        Subscriber webSubscriber = new WebSubscriber();
        // 订阅事件
        eventBus.registerSubscriber("eventApp", appSubscriber);
        eventBus.registerSubscriber("eventWeb", webSubscriber);

        // 发布事件
        eventBus.publish("eventApp", "这是事件A的内容");
        eventBus.publish("eventWeb", "这是事件web的内容");

        // 取消订阅
        eventBus.removeSubscriber("eventApp", appSubscriber);

        // 再次发布事件
        eventBus.publish("eventApp", "这是事件A的新内容");
    }

}
