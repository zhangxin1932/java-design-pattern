package com.zy.designPattern.decorator.coffee;

import com.zy.designPattern.decorator.Drink;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
