package com.org.action.observer.weather;


public interface Observer {

    // 当观察的行为发生了
    void update(float temperature, float humidity, float pressure);
}
