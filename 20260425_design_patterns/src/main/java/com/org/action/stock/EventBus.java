package com.org.action.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    // 订阅股票价格变化事件
    public void subscribe(String stockSymbol, Subscriber subscriber) {
        subscribers.computeIfAbsent(stockSymbol, k -> new ArrayList<>()).add(subscriber);
    }

    // 取消订阅股票价格变化事件
    public void unsubscribe(String stockSymbol, Subscriber subscriber) {
        List<Subscriber> subs = subscribers.get(stockSymbol);
        if (subs != null) {
            subs.remove(subscriber);
        }
    }

    // 发布股票价格变化事件
    public void publish(String stockSymbol, double newPrice) {
        List<Subscriber> subs = subscribers.get(stockSymbol);
        if (subs != null) {
            for (Subscriber subscriber : subs) {
                subscriber.onStockPriceChanged(stockSymbol, newPrice);
            }
        }
    }

}
