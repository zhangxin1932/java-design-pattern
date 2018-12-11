package com.zy.designPattern.observer.jdkVersion;

import lombok.Getter;

import java.util.Observable;

public class ConcreteSubject extends Observable {

    @Getter
    private boolean flag;

    public void setFlag(boolean flag) {
        this.flag = flag;
        setChanged(); // 表示主题内容已经更改
        notifyObservers(flag); // 通知所有的观察者该值已经修改
    }
}
