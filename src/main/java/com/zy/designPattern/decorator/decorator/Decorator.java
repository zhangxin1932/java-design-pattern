package com.zy.designPattern.decorator.decorator;

import com.zy.designPattern.decorator.Drink;

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
