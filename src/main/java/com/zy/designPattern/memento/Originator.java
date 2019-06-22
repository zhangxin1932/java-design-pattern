package com.zy.designPattern.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * 原发器
 */
public class Originator {

    @Setter
    @Getter
    private String state;

    public Memento saveState2Mento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
