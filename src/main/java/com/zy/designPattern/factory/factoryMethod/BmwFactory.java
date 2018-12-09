package com.zy.designPattern.factory.factoryMethod;

public class BmwFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
