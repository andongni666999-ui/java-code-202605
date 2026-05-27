package com.org.action.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 大气压
    private float pressure;


    // 持有多个观察者
    private List<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }


    // 修改气象内容
    public void measurementsChanged() {
        notifyObservers();
    }

    // 当测量值发生了变化的时候
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 测量值发生了变化
        measurementsChanged();
    }

}
