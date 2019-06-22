package com.zy.designPattern.observer.version2;

public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer01 observer01 = new Observer01(subject);
        Observer02 observer02 = new Observer02(subject);

        subject.setState(2);
        System.out.println("--------");
        subject.setState(5);
    }
}
