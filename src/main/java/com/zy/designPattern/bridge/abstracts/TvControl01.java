package com.zy.designPattern.bridge.abstracts;

import com.zy.designPattern.bridge.impl.Control;

public class TvControl01 extends TvControlAbstract {

    private int channel = 1;
    private int volume = 10;

    public TvControl01(Control control) {
        super(control);
    }

    @Override
    public void nextChannel() {
        if (channel >= 100) {
            channel = 1;
        } else {
            channel ++;
        }
        control.setChannel(channel);
    }

    @Override
    public void preChannel() {
        if (channel <= 1) {
            channel = 100;
        } else {
            channel --;
        }
        control.setChannel(channel);
    }

    @Override
    public void nextVolume() {
        if (volume >= 80) {
            volume = 80;
        } else {
            volume ++;
        }
        control.setVolume(volume);
    }

    @Override
    public void preVolume() {
        if (volume <= 0) {
            volume = 0;
        } else {
            volume --;
        }
        control.setVolume(volume);
    }
}
