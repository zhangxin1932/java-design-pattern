package com.zy.designPattern.decorator;

import lombok.Data;

@Data
public abstract class Drink {

    protected String desc;
    private float price;

    public abstract float cost();
}
