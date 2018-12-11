package com.zy.designPattern.observer.jdkVersion;

public class ObserverTest {

    public static void main(String[] args) {
        // 创建主题
        ConcreteSubject subject = new ConcreteSubject();
        // 创建观察者
        ObserverM obj1 = new ObserverM();
        ObserverM obj2 = new ObserverM();
        ObserverM obj3 = new ObserverM();
        // 观察者订阅主题
        subject.addObserver(obj1);
        subject.addObserver(obj2);
        subject.addObserver(obj3);
        // 主题内容更改
        subject.setFlag(false);
        // 查看订阅内容
        System.out.println(obj1.isMyFlag() + "===" + obj2.isMyFlag() + "====" + obj3.isMyFlag());
        // 主题内容修改
        subject.setFlag(true);
        System.out.println(obj1.isMyFlag() + "===" + obj2.isMyFlag() + "====" + obj3.isMyFlag());

    }
}
