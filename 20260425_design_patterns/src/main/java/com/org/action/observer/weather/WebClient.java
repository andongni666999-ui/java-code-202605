package com.org.action.observer.weather;

public class WebClient implements Observer{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("web 更新了");
    }
}
