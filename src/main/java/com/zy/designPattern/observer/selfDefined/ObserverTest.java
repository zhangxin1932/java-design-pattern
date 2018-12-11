package com.zy.designPattern.observer.selfDefined;

public class ObserverTest {

    public static void main(String[] args) {
        // 创建主题
        SubjectA subject = new SubjectA();
        // 创建观察者
        ObserverA o1 = new ObserverA();
        ObserverA o2 = new ObserverA();
        ObserverA o3 = new ObserverA();
        // 观察者订阅主题
        subject.registerObserver(o1);
        subject.registerObserver(o2);
        subject.registerObserver(o3);
        // 改变主题状态
        subject.setState(1000);
        // 查看订阅结果
        System.out.println(o1.getMyState());
        System.out.println(o2.getMyState());
        System.out.println(o3.getMyState());
    }
}
