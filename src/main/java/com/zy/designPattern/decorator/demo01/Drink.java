package com.zy.designPattern.decorator.demo01;

import lombok.Data;

@Data
public abstract class Drink {

    protected String desc;
    private float price;

    public abstract float cost();
}
