package com.zy.designPattern.observer.version2;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 主题类: 即被观察者
 * 用于解决一对多的关系问题
 */
public class Subject {

    private List<Observer> observers = new CopyOnWriteArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
