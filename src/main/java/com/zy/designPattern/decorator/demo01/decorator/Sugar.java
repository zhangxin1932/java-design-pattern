package com.zy.designPattern.decorator.demo01.decorator;

import com.zy.designPattern.decorator.demo01.Drink;

public class Sugar extends Decorator {
    public Sugar(Drink drink) {
        super(drink);
        super.setDesc("Sugar");
        super.setPrice(3.0f);
    }
}
