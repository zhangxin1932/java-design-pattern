package com.zy.designPattern.observer.selfDefined;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    // 观察者订阅主题
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // 观察者不再订阅主题
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // 通知观察者更新消息
    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
