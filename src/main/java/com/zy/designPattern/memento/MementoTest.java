package com.zy.designPattern.memento;

public class MementoTest {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator();
        originator.setState("1");
        careTaker.add(originator.saveState2Mento());
        originator.setState("2");
        careTaker.add(originator.saveState2Mento());
        originator.setState("3");
        careTaker.add(originator.saveState2Mento());

        System.out.println("current state-->" + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("first saved state -->" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("second saved state -->" + originator.getState());
    }
}
