package com.org.action.observer.weather;


// 被观察者应该提供 注册、删除、通知观察者的能力
public interface Subject {

    // 注册观察者
    void registerObserver(Observer o);

    // 删除观察者
    void removeObserver(Observer o);

    // 通知观察者的能力
    void notifyObservers();

}
