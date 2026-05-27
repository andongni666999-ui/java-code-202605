package com.org.action.observer.weather;

public class AppClient implements Observer{


    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("app 更新了");
    }
}
