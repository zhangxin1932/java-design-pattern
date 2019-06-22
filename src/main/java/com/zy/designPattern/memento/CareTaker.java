package com.zy.designPattern.memento;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CareTaker {

    private List<Memento> mementos = new CopyOnWriteArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
