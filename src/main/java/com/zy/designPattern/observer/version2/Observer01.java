package com.zy.designPattern.observer.version2;

/**
 * 具体观察者1
 */
public class Observer01 extends Observer {

    public Observer01(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("observer01--->" + subject.getState());
    }

}
