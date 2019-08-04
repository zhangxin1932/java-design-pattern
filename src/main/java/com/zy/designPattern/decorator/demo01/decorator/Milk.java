package com.zy.designPattern.decorator.demo01.decorator;

import com.zy.designPattern.decorator.demo01.Drink;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setDesc("Milk");
        super.setPrice(2.0f);
    }

}
