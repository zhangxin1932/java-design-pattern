package com.zy.designPattern.memento;

import lombok.Getter;

/**
 * 备忘录
 */
public class Memento {

    @Getter
    private String state;

    public Memento(String state) {
        this.state = state;
    }

}
