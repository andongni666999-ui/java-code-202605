package com.org.action.observer.weather;

public class Main {

    public static void main(String[] args) {
        // 定义气象站
        WeatherStation weatherStation = new WeatherStation();

        // 定义观察者客户端
        Observer appClient = new AppClient();
        Observer webClient = new WebClient();

        // 建立监听关系
        weatherStation.registerObserver(appClient);
        weatherStation.registerObserver(webClient);

        weatherStation.notifyObservers();
    }
}
