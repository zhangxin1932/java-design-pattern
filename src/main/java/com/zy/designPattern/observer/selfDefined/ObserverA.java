package com.zy.designPattern.observer.selfDefined;

import lombok.Getter;
import lombok.Setter;

public class ObserverA implements Observer {

    @Setter
    @Getter
    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((SubjectA)subject).getState();
    }
}
