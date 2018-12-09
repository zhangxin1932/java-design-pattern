package com.zy.designPattern.factory.simpleFactory;

public class CarFactory {

    public static Car createCar(String type) {
        if ("Bmw".equals(type)) {
            return new Bmw();
        }
        else if ("Bentz".equals(type)) {
            return new Bentz();
        }
        return null;
    }
}
