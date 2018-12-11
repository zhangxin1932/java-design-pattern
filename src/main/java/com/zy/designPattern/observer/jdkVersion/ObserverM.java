package com.zy.designPattern.observer.jdkVersion;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

public class ObserverM implements Observer {

    @Getter
    @Setter
    private boolean myFlag;

    @Override
    public void update(Observable o, Object arg) {
        myFlag = ((ConcreteSubject)o).isFlag();
    }
}
