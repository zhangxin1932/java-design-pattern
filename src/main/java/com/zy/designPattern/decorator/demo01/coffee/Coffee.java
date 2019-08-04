package com.zy.designPattern.decorator.demo01.coffee;

import com.zy.designPattern.decorator.demo01.Drink;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
