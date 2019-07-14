package com.zy.designPattern.adapter.interfacePattern;

import lombok.AllArgsConstructor;

public class Power5VAdapter extends PowerAdapter {
    public Power5VAdapter(AC220 ac220) {
        super(ac220);
    }
    @Override
    public int output5V() {
        int output = 0;
        if (ac220 != null) {
            output = ac220.output220V() / 44;
        }
        return output;
    }
}
