package com.zy.designPattern.observer.version2;

/**
 * 观察者抽象类
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
