package com.zy.designPattern.decorator.demo01.decorator;

import com.zy.designPattern.decorator.demo01.Drink;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "---" + drink.getDesc();
    }
}
