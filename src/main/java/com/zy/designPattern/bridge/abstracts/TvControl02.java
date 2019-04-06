package com.zy.designPattern.bridge.abstracts;

import com.zy.designPattern.bridge.impl.Control;

public class TvControl02 extends TvControlAbstract {

    private int channel = 1;
    private int volume = 0;
    private int preChannel = 1;

    public TvControl02(Control control) {
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

    public void setChannel(int channel) {
        preChannel = this.channel;
        this.channel = channel;
        control.setChannel(this.channel);
    }

    public void backChannel() {
        control.setChannel(preChannel);
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
