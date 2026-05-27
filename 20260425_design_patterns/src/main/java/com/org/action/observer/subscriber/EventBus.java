package com.org.action.observer.subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 创建消息总线
public class EventBus {

    // 使用一个map维护，消息类型和该消息的订阅者
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void registerSubscriber(String eventType, Subscriber subscriber) {
        subscribers.computeIfAbsent(eventType, k -> new ArrayList<>());

        // 获取订阅者集合
        List<Subscriber> sbbs = subscribers.get(eventType);

        sbbs.add(subscriber);
    }


    // 移除订阅
    public void removeSubscriber(String eventType, Subscriber subscriber) {
        List<Subscriber> subs = subscribers.get(eventType);
        if (subs != null) {
            subs.remove(subscriber);
        }
    }


    // 发布事件
    public void publish(String eventType, String event) {
        List<Subscriber> subs = subscribers.get(eventType);
        if (subs != null) {
            for (Subscriber subscriber : subs) {
                subscriber.onEvent(event);
            }
        }
    }

}
