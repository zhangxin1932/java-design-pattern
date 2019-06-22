package com.zy.designPattern.observer.version2;

/**
 * 观察者2
 */
public class Observer02 extends Observer {
    public Observer02(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("observer02---->" + subject.getState());
    }
}
