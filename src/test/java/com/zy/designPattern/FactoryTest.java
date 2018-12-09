package com.zy.designPattern;

import com.zy.designPattern.factory.factoryMethod.BentzFactory;
import com.zy.designPattern.factory.factoryMethod.BmwFactory;
import com.zy.designPattern.factory.simpleFactory.CarFactory;
import org.junit.Test;

public class FactoryTest {

    // 1.测试简单工厂
    @Test
    public void fn01(){
        CarFactory.createCar("Bmw").run();
        CarFactory.createCar("Bentz").run();
    }

    // 2.测试工厂方法模式
    public void fn02(){
        new BmwFactory().createCar().run();
        new BentzFactory().createCar().run();
    }
}
