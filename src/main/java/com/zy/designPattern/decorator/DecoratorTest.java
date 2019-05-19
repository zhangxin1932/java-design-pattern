package com.zy.designPattern.decorator;

import com.zy.designPattern.decorator.coffee.Coffee01;
import com.zy.designPattern.decorator.coffee.Coffee02;
import com.zy.designPattern.decorator.decorator.Milk;
import com.zy.designPattern.decorator.decorator.Sugar;

/**
 *
 * 装饰者模式:
 * 一个超类 : Drink
 * 两个分支: coffee分支, 调料分支, 均继承自Drink
 *
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Drink coffee = new Coffee01();
        System.out.println(coffee.getDesc());
        System.out.println(coffee.cost());

        System.out.println("---------");

        coffee = new Coffee02();
        coffee = new Sugar(coffee);
        coffee = new Milk(coffee);
        System.out.println(coffee.getDesc());
        System.out.println(coffee.cost());
    }

}
