package com.zy.designPattern.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestRole {

    private int number = 0;
    private float price = 0;

    public float getSum() {
        return this.number * this.price;
    }

}
