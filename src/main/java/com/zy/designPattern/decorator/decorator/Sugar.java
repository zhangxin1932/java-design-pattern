package com.zy.designPattern.decorator.decorator;

import com.zy.designPattern.decorator.Drink;

public class Sugar extends Decorator {
    public Sugar(Drink drink) {
        super(drink);
        super.setDesc("Sugar");
        super.setPrice(3.0f);
    }
}
