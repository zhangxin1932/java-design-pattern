package com.zy.designPattern.factory.factoryMethod;

public class BentzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bentz();
    }
}
