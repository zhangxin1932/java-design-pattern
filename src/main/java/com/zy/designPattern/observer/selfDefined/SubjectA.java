package com.zy.designPattern.observer.selfDefined;

public class SubjectA extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState (int state) {
        this.state = state;
        this.notifyAllObservers();
    }
}
